public sealed abstract class User permits UserGerente, UserVendedor, UserAtendente {

    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            return "Logado";
        }
        return "Email ou Senha Invalidos";
    }

    public String logoff() {
        return "Deslogado";
    }

    public void alterarDados(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void alterarSenha(String newPassword) {
        this.password = newPassword;
    }
}
