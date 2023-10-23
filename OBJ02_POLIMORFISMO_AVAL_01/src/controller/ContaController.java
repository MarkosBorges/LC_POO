import model.*;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
        //        a.
        //                Crie 3 instâncias de cada classe (das possíveis de criar instâncias), insira valores válidos
        //                nos atributos dessas instâncias, e imprima esses objetos;
        //        b.
        //                Crie as coleções necessárias para expressar as contas registradas no sistema, bem como,
        //                os associados, depois, imprima essas coleç ão ( ões
        Cliente cliente1 = new Cliente("Marcos");
        Cliente cliente2 = new Cliente("Gilney");
        Cliente cliente3 = new Cliente("José");

        ContaPoupanca poupanca1 = new ContaPoupanca();
        ContaPoupanca poupanca2 = new ContaPoupanca();
        ContaPoupanca poupanca3 = new ContaPoupanca();

        ContaCorrente corrente1 = new ContaCorrente();
        ContaCorrente corrente2 = new ContaCorrente();
        ContaCorrente corrente3 = new ContaCorrente();


        List<Conta> contas = new ArrayList<>();
        contas.add(poupanca1);
        contas.add(poupanca2);
        contas.add(poupanca3);
        contas.add(corrente1);
        contas.add(corrente2);
        contas.add(corrente3);

        List<Associado> associados = new ArrayList<>();
        associados.add(corrente1);
        associados.add(corrente2);
        associados.add(corrente3);
        associados.add(cliente1);
        associados.add(cliente2);
        associados.add(cliente3);



        System.out.println("\n ------- CONTAS -------- ");
        System.out.println(contas);
        System.out.println("\n\n ------- ASSOCIADOS ------- ");
        System.out.println(associados);

        // TESTE RELACOES ------------------------------------------


        // ----------------------------------------------------------
        //        c.
        //                Movimente, pelo menos, uma conta poupança, realizan
        //        do as seguintes operações:
        //        depósito de R$ 1.000,00; atualização monetária de 5%; saque de R$ 50,00;
        poupanca1.deposita(1000.0);
        poupanca1.atualiza(0.05);
        poupanca1.saca(50.0);

        poupanca3.deposita(3000.0);
        poupanca3.atualiza(0.5);
        poupanca3.saca(100.0);

        //--------------------------------------------------------------------------
        //        d.
        //                Movimente, pelo menos, uma conta corrente, realizando as seguintes operações: depósito
        //        R$ 500,00; saque de R$ 400,00;
        corrente1.deposita(500.0);
        corrente1.saca(400.0);

        corrente3.deposita(8000.0);
        corrente3.saca(200.0);

        //--------------------------------------------------------------------------
        // e.
        //Faça com que cada associado tenha as s
        //eguintes quantidade de cotas, nessa ordem: 100,
        //400, 600, 300, 600, 600, e imprima a s coleç ão ( ões

        cliente1.lucros(100, 10.5);
        cliente2.lucros(400, 8.0);
        cliente3.lucros(600, 9.0);
        corrente1.lucros(300, 12.0);
        corrente2.lucros(600, 8.5);
        corrente3.lucros(600, 8.5);


        System.out.println("\nASSOCIADOS NUMEROS DE COTAS: ");
        associados.sort(Comparator.comparing(a -> ((Associado) a).lucros(0, 0)));
        System.out.println("\nQuantidade de Cotas de Associados (maior para menor): ");
        for (Associado associado : associados) {
            System.out.println(associado);
        }




        //        f.
        //                A partir da
        //        s coleç ão ( ões )), imprima todos os associados, ordenados pelo critério de
        //        número de cotas, em ordem decrescente. E faça o programa calcular e impri mir os
        //        associados com o maior número de cotas no sistema
        //        g.
        //                A partir da
        //        s coleç ão ( ões )), imprima todas as contas cadastradas no sistema, ordenadas
        //        pelo critério saldo, em ordem decrescente. E, imprima tod as associados que sejam
        //        Associado e possu a conta cadastradas no sistema, em qualquer ordem . Ta m bém faça o
        //        programa impri mi r a lista de cont as com maior saldo bancário.

        associados.sort(Comparator.comparingDouble(a -> ((Associado) a).lucros(0, 0)).reversed());
        System.out.println("Associados ordenados por número de cotas (decrescente): " + associados);
        System.out.println("Associado com o maior número de cotas: " + associados.get(0));
      //ordem decrescente
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\n\n ----- CONTAS POR SALDO EM ORDEM DECRESCENTE ----- ");
        for (Conta conta : contas) {
            System.out.println(conta);
        }

        contas.sort(Comparator.comparing(Conta::getSaldo));
        System.out.println("\n\n ----- CONTAS POR SALDO EM ORDEM CRESCENTE ----- ");
        for (Conta conta : contas) {
            System.out.println(conta);
        }


        //__________________________________________________________________________________________
        // f. Não consegui até o momento


        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\n\n MAIOR SALDOS DAS CONTAS CADASTRADAS: " + contas);

        //Teste instanceof
        for (Associado associado : associados) {
            if (associado instanceof Conta) {
                System.out.println("\n\n Associado com conta: " + associado);
            }
        }

        System.out.println("\n\n -------- MAIOR SALDO ---------- " + contas.get(0));
    }
}
