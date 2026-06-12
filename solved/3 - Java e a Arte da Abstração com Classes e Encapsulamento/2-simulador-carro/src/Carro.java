public class Carro {

    private static final int MIN_MARCH = 0;
    private static final int MAX_MARCH = 6;

    private boolean on;
    private int speed;
    private int march;

    public Carro() {
        on = false;
        speed = 0;
        march = 0;
    }

    private boolean velocidadePermitida(int velocidade, int marcha) {

        return switch (marcha) {
            case 0 -> velocidade == 0;
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 21 && velocidade <= 40;
            case 3 -> velocidade >= 41 && velocidade <= 60;
            case 4 -> velocidade >= 61 && velocidade <= 80;
            case 5 -> velocidade >= 81 && velocidade <= 100;
            case 6 -> velocidade >= 101 && velocidade <= 120;
            default -> false;
        };
    }

    public void ligar() {
        if (on) {
            System.out.println("Carro já está ligado!");
            return;
        }
        on = true;
        System.out.println("Carro ligado!");
    }

    public void desligar() {
        if (!on) {
            System.out.println("Carro já está desligado!");
            return;
        }
        if (march != 0 || speed != 0) {
            System.out.println("Para desligar o carro ele deve estar em ponto morto e parado.");
            return;
        }

        on = false;
        System.out.println("Carro desligado!");
    }

    public void acelerar() {
        if (!on) {
            System.out.println("Carro está desligado!");
            return;
        }
        if (march == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }
        if (!velocidadePermitida(speed + 1, march)) {
            System.out.println("Limite da marcha atingido.");
            return;
        }
        speed++;
        System.out.println("Acelerando velocidade atual " + speed);
    }

    public void desacelerar() {
        if (!on) {
            System.out.println("Carro está desligado!");
            return;
        }
        if (speed == 0) {
            System.out.println("O carro já está parado.");
            return;
        }
        speed--;
        System.out.println("Desacelerando velocidade atual " + speed);
    }

    public void virar(String direcao) {
        if (!on) {
            System.out.println("Carro está desligado!");
            return;
        }
        if (!direcao.equalsIgnoreCase("ESQUERDA")
                && !direcao.equalsIgnoreCase("DIREITA")) {

            System.out.println("Direção inválida. Use ESQUERDA ou DIREITA.");
            return;
        }
        if (speed < 1 || speed > 40) {
            System.out.println("Só é possível virar entre 1 e 40 km/h.");
            return;
        }

        System.out.println("Virando para " + direcao);
    }

    public int getSpeed() {
        return speed;
    }

    public void trocarMarcha(int novaMarcha) {
        if (!on) {
            System.out.println("Carro está desligado!");
            return;
        }
        if (novaMarcha < MIN_MARCH || novaMarcha > MAX_MARCH) {
            System.out.println("Marcha inválida.");
            return;
        }
        if (Math.abs(novaMarcha - this.march) > 1) {
            System.out.println("Não é permitido pular marchas.");
            return;
        }
        if (!velocidadePermitida(speed, novaMarcha)) {
            System.out.println("A velocidade atual não permite essa marcha.");
            return;
        }

        march = novaMarcha;
        System.out.println("Marcha alterada para: " + this.march);
    }
}
