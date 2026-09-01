package Transacao;

import java.time.LocalDateTime;

public class TransacaoEntity {
    private String id;
    private Double valor;
    private LocalDateTime dataHora;
    private String tipoTransacao;
    private String descricao;

    public TransacaoEntity() {
    }

    public TransacaoEntity(String id, Double valor, LocalDateTime dataHora, String tipoTransacao, String descricao) {
        this.id = id;
        this.valor = valor;
        this.dataHora = dataHora;
        this.tipoTransacao = tipoTransacao;
        this.descricao = descricao;
    }

    public void registrarTransacao() {
        System.out.println("Registrando transação " + id + " no valor de R$ " + valor + " (" + tipoTransacao + ")");
    }

    public void gerarComprovante() {
        System.out.println("Gerando comprovante detalhado para a transação: " + id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
