package Usuario;

import java.time.LocalDate;

public class UsuarioEntity {

    private String id;
    private String nome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;


    public UsuarioEntity() {
    }

    public UsuarioEntity(String id, String nome, String cpf, String email, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public void atualizarPerfil(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Perfil do usuário " + this.nome + " atualizado com sucesso!");
    }

    public void exibirdetalhesUsuario() {
        System.out.println("Exibindo detalhes do usuário: " + nome + " (CPF: " + cpf + ")");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
