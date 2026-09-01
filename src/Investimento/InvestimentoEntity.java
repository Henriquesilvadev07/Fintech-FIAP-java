package Investimento;

public class InvestimentoEntity {
    private String id;
    private String nomeAtivo; // Ex:CDB Banco X, Tesouro Direto
    private Double valorInvestido;
    private Double taxaRendimentoAnual;
    private String tipoInvestimento; // Ex:Renda Fixa, Renda Variável

    public InvestimentoEntity() {
    }

    public InvestimentoEntity(String id, String nomeAtivo, Double valorInvestido, Double taxaRendimentoAnual, String tipoInvestimento) {
        this.id = id;
        this.nomeAtivo = nomeAtivo;
        this.valorInvestido = valorInvestido;
        this.taxaRendimentoAnual = taxaRendimentoAnual;
        this.tipoInvestimento = tipoInvestimento;
    }

    public void aplicarRecurso(Double valor) {
        System.out.println("Aplicando R$ " + valor + " no investimento " + nomeAtivo);
    }

    public void calcularRendimentoEstimado() {
        System.out.println("Calculando rendimento estimado para o ativo " + nomeAtivo + " com taxa de " + taxaRendimentoAnual + "% ao ano.");
    }

    public void resgatarInvestimento() {
        System.out.println("Solicitando resgate do investimento " + nomeAtivo);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeAtivo() {
        return nomeAtivo;
    }

    public void setNomeAtivo(String nomeAtivo) {
        this.nomeAtivo = nomeAtivo;
    }

    public Double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(Double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public Double getTaxaRendimentoAnual() {
        return taxaRendimentoAnual;
    }

    public void setTaxaRendimentoAnual(Double taxaRendimentoAnual) {
        this.taxaRendimentoAnual = taxaRendimentoAnual;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }
}
