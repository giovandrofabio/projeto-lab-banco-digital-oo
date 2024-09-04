package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Cliente giovandro = new Cliente();
        giovandro.setNome("Giovandro");

        Conta cc = new ContaCorrente(giovandro);
        Conta poupanca = new ContaPoupanca(giovandro);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}