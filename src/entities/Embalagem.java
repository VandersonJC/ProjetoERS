package entities;

public class Embalagem {

    private Integer id_embalagem;
    private String descricao;
    private Double comprimento;
    private Double largura;
    private Double altura;

    public Integer getId_embalagem() {
        return id_embalagem;
    }

    public void setId_embalagem(Integer id_embalagem) {
        this.id_embalagem = id_embalagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

}
