public class PetMachine {

    private static final int WATER_LIMIT = 30;
    private static final int SHAMPOO_LIMIT = 10;

    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public PetMachine() {
        this.clean = true;
        this.water = 0;
        this.shampoo = 0;
        this.pet = null;
    }

    public void washPet() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciaro banho");
            return;
        }

        if (water < 10) {
            System.out.println("Água insuficiente.");
            return;
        }

        if (shampoo < 2) {
            System.out.println("Shampoo insuficiente.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);

        System.out.println("O pet " + pet.getName() + " está pronto");
    }

    public void addWater() {

        if (water + 2 > WATER_LIMIT) {
            System.out.println("Não é possível adicionar água. Nível atual: " + water + "/" + WATER_LIMIT);
            return;
        }

        water += 2;

        System.out.println("Nível de água: " + water + "/" + WATER_LIMIT);
    }

    public void addShampoo() {

        if (shampoo + 2 > SHAMPOO_LIMIT) {
            System.out.println("Não é possível adicionar shampoo. Nível atual: " + shampoo + "/" + SHAMPOO_LIMIT);
            return;
        }

        shampoo += 2;

        System.out.println("Nível de shampoo: " + shampoo + "/" + SHAMPOO_LIMIT);
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {

        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar o pet é necessário limpá-la!");
            return;
        }

        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento!");
            return;
        }

        this.pet = pet;
        System.out.println("Pet " + this.pet.getName() + " colocado na máquina");
    }

    public void removerPet() {
        if (!hasPet()) {
            System.out.println("Não tem pet na máquina!");
            return;
        }

        String petName = this.pet.getName();
        this.clean = this.pet.isClean();
        this.pet = null;

        System.out.println("O pet " + petName + " foi retirado da máquina.");
    }

    public void cleanMachine() {
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina!");
            return;
        }

        if (this.clean) {
            System.out.println("A máquina já está limpa!");
            return;
        }

        if (water < 3) {
            System.out.println("Água insuficiente.");
            return;
        }

        if (shampoo < 1) {
            System.out.println("Shampoo insuficiente.");
            return;
        }

        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;

        System.out.println("A máquina está limpa.");
    }

    public void showWaterLevel() {
        System.out.println(
            "Nível de água: " + water + "/" + WATER_LIMIT
        );
    }

    public void showShampooLevel() {
        System.out.println(
            "Nível de shampoo: " + shampoo + "/" + SHAMPOO_LIMIT
        );
    }

    public void showPetStatus() {
        if (hasPet()) {
            System.out.println(
                "O pet " + pet.getName() + " está na máquina."
            );
        } else {
            System.out.println(
                "Não tem pet na máquina."
            );
        }
    }

}
