package br.com.adOptimize.api_adOptimize.dto;

import org.springframework.hateoas.Link;

public class UsuarioResponse {

    private Long idUsuario;
    private String nome;
    private String email;
    private String senha;
    private String chaveGoogleAds;
    private Link link;

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getChaveGoogleAds() {
        return chaveGoogleAds;
    }

    public void setChaveGoogleAds(String chaveGoogleAds) {
        this.chaveGoogleAds = chaveGoogleAds;
    }
}
