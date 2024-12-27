package com.loiane.cursojava.aula43.labs.exer01;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private Double saldo = 0.0;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "Conta Bancária [";
        s += " * Nome do Cliente: " + nomeCliente;
        s += " * numero da Conta: " + numConta;
        s += " * saldo: " + saldo;
        s += "]";
        return s;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public boolean sacar (double valor){
        if ((saldo - valor) >= 0){
         saldo -= valor;
         return true;
        }
        return false;
    }
}
