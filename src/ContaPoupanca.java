package com.loiane.cursojava.aula43.labs.exer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "Conta Poupança [";
        s += " * Nome do Cliente: " + getNomeCliente(); // Usando getter
        s += " * Numero da Conta: " + getNumConta();   // Usando getter
        s += " * Saldo: " + getSaldo();               // Usando getter
        s += " * Dia de Rendimento: " + diaRendimento;
        s += "]";
        return s;
    }
    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            //saldo += saldo*taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }

}