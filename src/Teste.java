package com.loiane.cursojava.aula43.labs.exer01;

public class Teste {
    public static void main(String[] args) {

        System.out.println("*** Teste conta Poupança ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente conta Poupança");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(26);

        // Realizando depósitos
        contaPoupanca.depositar(100);
        // Tentativas de saque
        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado * Novo saldo é de : " + contaPoupanca.getSaldo());
        } else {
            System.out.printf(" *** Hoje não é dia de rendimento. *** Novo saldo não calculado. *** ");
        }

        // Exibindo o estado da conta
        System.out.println(contaPoupanca);
    }

    // Método auxiliar para realizar saques
    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + " * Saldo de = " + conta.getSaldo());
        }
    }
}
