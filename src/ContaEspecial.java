package com.loiane.cursojava.aula43.labs.exer01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = " ***Conta Especial*** [";
        s += " * Nome do Cliente: " + getNomeCliente(); // Usando getter
        s += " * Numero da Conta: " + getNumConta();   // Usando getter
        s += " * Saldo: " + getSaldo();               // Usando getter
        s += " * Limite de : " + limite;
        s += "]";
    }

    public boolean sacar (double valor){

       double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite - valor) >= 0){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }

        return false;
    }
}


