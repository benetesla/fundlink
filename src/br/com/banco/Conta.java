package br.com.banco;

public class Conta extends Clientes {

    private String NumeroConta;
    private String Agencia;
    private String TipoConta;
    private double Saldo;
    private double Limite;
    private double SaldoTotal;
    private double ValorSaque;
    private double ValorDeposito;
    

    public Conta(String nome, String cpf, String rg, String endereco, String telefone, String email) {
        super(nome, cpf, rg, endereco, telefone, email);        
    }

    public String getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(String NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    public String getTipoConta() {
        return TipoConta;
    }

    public void setTipoConta(String TipoConta) {
        this.TipoConta = TipoConta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getLimite() {
        return Limite;
    }

    public void setLimite(double Limite) {
        this.Limite = Limite;
    }

    public double getSaldoTotal() {
        return SaldoTotal;
    }

    public void setSaldoTotal(double SaldoTotal) {
        this.SaldoTotal = SaldoTotal;
    }

    public double getValorSaque() {
        return ValorSaque;
    }

    public void setValorSaque(double ValorSaque) {
        this.ValorSaque = ValorSaque;
    }

    public double getValorDeposito() {
        return ValorDeposito;
    }

    public void setValorDeposito(double ValorDeposito) {
        this.ValorDeposito = ValorDeposito;
    }

    public void Sacar() {
        if (ValorSaque <= Saldo) {
            Saldo = Saldo - ValorSaque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu saldo atual é de: " + Saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void Depositar() {
        Saldo = Saldo + ValorDeposito;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Seu saldo atual é de: " + Saldo);
    }

    public void ConsultarSaldo() {
        System.out.println("Seu saldo atual é de: " + Saldo);
    }

    public void ConsultarSaldoTotal() {
        SaldoTotal = Saldo + Limite;
        System.out.println("Seu saldo total é de: " + SaldoTotal);
    }

    public void Transferir() {
        if (ValorSaque <= Saldo) {
            Saldo = Saldo - ValorSaque;
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Seu saldo atual é de: " + Saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void SaldoTotal() {
        SaldoTotal = Saldo + Limite;
        System.out.println("Seu saldo total é de: " + SaldoTotal);
    }

}
