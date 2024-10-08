package br.com.adOptimize.api_adOptimize.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_anuncio")
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnuncio;

    @Column(name="titulo")
    private String titulo;

    @Column(name="ds_texto_anuncio")
    private String textoAnuncio;

    @Column(name="ds_url_anuncio")
    private String urlAnuncio;

    @Column(name="tipo_anuncio")
    private String tipoAnuncio;

    @Column(name="data_criacao_anuncio")
    private String dataCriacao;

    @Column(name="impressoes")
    private Long impressoes;

    @Column(name="qtd_cliques")
    private Long qtdCliques;

    @Column(name="custo_anuncio")
    private Double custoAnuncio;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_USUARIO",
            referencedColumnName = "idUsuario",
            foreignKey = @ForeignKey(name = "FK_ANUNCIO_USUARIO")
    )
    private Usuario usuario;

    public Long getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(Long idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTextoAnuncio() {
        return textoAnuncio;
    }

    public void setTextoAnuncio(String textoAnuncio) {
        this.textoAnuncio = textoAnuncio;
    }

    public String getUrlAnuncio() {
        return urlAnuncio;
    }

    public void setUrlAnuncio(String urlAnuncio) {
        this.urlAnuncio = urlAnuncio;
    }

    public String getTipoAnuncio() {
        return tipoAnuncio;
    }

    public void setTipoAnuncio(String tipoAnuncio) {
        this.tipoAnuncio = tipoAnuncio;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Long getImpressoes() {
        return impressoes;
    }

    public void setImpressoes(Long impressoes) {
        this.impressoes = impressoes;
    }

    public Long getQtdCliques() {
        return qtdCliques;
    }

    public void setQtdCliques(Long qtdCliques) {
        this.qtdCliques = qtdCliques;
    }

    public Double getCustoAnuncio() {
        return custoAnuncio;
    }

    public void setCustoAnuncio(Double custoAnuncio) {
        this.custoAnuncio = custoAnuncio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }



}
