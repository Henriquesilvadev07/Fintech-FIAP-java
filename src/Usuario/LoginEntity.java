package Usuario;

public class LoginEntity {
    private String username;
    private String password;

    public LoginEntity() {
    }

    public LoginEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void doLogin() {
        System.out.println("Realizando login para o usuário: " + username);
    }

    public void logout() {
        System.out.println("Encerrando sessão do usuário: " + username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
