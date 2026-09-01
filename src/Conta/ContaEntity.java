package Conta;

public class ContaEntity {
    private String numeroConta;
    private String agencia;
    private Double saldo;
    private String tipoConta;

    public ContaEntity() {
    }

    public ContaEntity(String numeroConta, String agencia, Double saldo, String tipoConta) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta " + numeroConta);
        }
    }

    public void sacar(Double valor) {
        System.out.println("Solicitando saque de R$ " + valor + " da conta " + numeroConta);
    }

    public void consultarSaldo() {
        System.out.println("Consultando saldo da conta " + numeroConta + ": R$ " + saldo);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

}
