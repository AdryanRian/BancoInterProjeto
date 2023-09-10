package Entidades;

public class Cliente {
    private String nome;
    protected long cpf;
    private int AnodeNascimento;
    private long Rg;
    private String endereco;
    private int idade;
    protected int senha;
    private double saldo;



    public boolean sacar (double valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("\nSaque realizado com sucesso! Saldo atual: " + getSaldo());
            return true;
        }
        System.out.println("\nSaldo Insuficiente");
        return false;
    }

    public boolean depositar (double valor){
        this.saldo += valor;
        return true;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean transferir(double valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("\nTransferência realizada com sucesso! Saldo atual: " + getSaldo());
            return true;
        }
        System.out.println("\nSaldo Insuficiente");
        return false;
    }

}
