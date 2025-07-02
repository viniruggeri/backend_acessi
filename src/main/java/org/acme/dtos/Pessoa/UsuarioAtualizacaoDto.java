package org.acme.dtos.Pessoa;

public class UsuarioAtualizacaoDto {
    private String nome;
    private String email;
    private String senha;
    private String confirmaSenha;

    public UsuarioAtualizacaoDto() {
    }

    public UsuarioAtualizacaoDto(String nome, String email, String senha, String confirmaSenha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.confirmaSenha = confirmaSenha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }
}
