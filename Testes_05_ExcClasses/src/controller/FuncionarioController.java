package controller;

import model.Funcionario;
import model.Produto;
import model.Carro;
import model.Conta;

import java.util.*;


public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Marcos", 1110.0);
        Funcionario f2 = new Funcionario();
        f2.setNome("Joao");
        f2.setSalario(2000.0);
        Funcionario f3 = new Funcionario("Pedro", 3500.0);
        Funcionario f4 = new Funcionario("Anderson", 5000.0);
        Funcionario f5 = new Funcionario("Felipe", 8000.0);

        System.out.println();
        System.out.println("======= FUNCIONARIOS ========");

        System.out.println("\nAlterados:\n");
        System.out.println(f1.getNome() + " | " + f1.getSalario());
        System.out.println(f2.getNome() + " | " + f2.getSalario());
        System.out.println();

        // ------------- Altera ------------
        f1.setNome("Carlos");
        f1.setSalario(3000.0);
        f2.setNome("Vinicios");
        f2.setSalario(4000.0);

        // Getters Testes
        System.out.println("==== FUNCIONARIO (GETTERS)) =====");
        System.out.println("Nome: " + f1.getNome() + " Salário: " + f1.getSalario());
        System.out.println("Nome: " + f2.getNome() + " Salário: " + f2.getSalario());
        System.out.println("Nome: " + f3.getNome() + " Salário: " + f3.getSalario());
        System.out.println("Nome: " + f4.getNome() + " Salário: " + f4.getSalario());
        System.out.println("Nome: " + f5.getNome() + " Salário: " + f5.getSalario());


        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);
        funcionarios.add(f5);
        funcionarios.add(f3);// objeto igual
        System.out.println(funcionarios);

        // adc Obj ao Map e imprimir
        Map<Integer, Funcionario> mapFuncionarios = new HashMap<>();
        for (Funcionario funcionario : funcionarios) {
            mapFuncionarios.put(funcionario.hashCode(), funcionario);
        }

        System.out.println("\nFuncionários List:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        // Imprimir objeto com ID = 3 de cada coleção, se existir
        int idBusca = 3;
        System.out.println("\nFuncionário com ID = " + idBusca);
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.hashCode() == idBusca) {
                System.out.println(funcionario);
            }
        }

        System.out.println("----------- FIM MAP -----------\n\n");


        //ordenacao da colecao
        funcionarios.sort(Comparator.comparing(Funcionario::getNome));
        System.out.println("\n\nColecao List ordenada:\n");
        System.out.println(funcionarios);
        System.out.println("------ FIM FUNCIONARIOS ------");


        // =================== PORDUTO =============================
        Produto p1 = new Produto("Mouse", "Mouse USB OEX", 25.00, 50);
        Produto p2 = new Produto("Teclado", "Teclado sem fio", 80.00, 15);
        Produto p3 = new Produto("Monitor", "Monitor FullHD", 990.00, 15);
        Produto p4 = new Produto("Gabinete", "Gabinete Gamer", 350.00, 15);
        Produto p5 = new Produto("Fonte energia", "Fonte ATX", 580.00, 15);

        System.out.println();
        System.out.println("======= PRODUTO ========");
        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);
        produtos.add(p3);// Obj igual
        System.out.println(produtos);

        //============ CARRO ============================

        Carro c1 = new Carro("Ford", "Freestyle", 2015);
        Carro c2 = new Carro("Aston Martin", "New", 2017);
        Carro c3 = new Carro("Fiat", "Palio", 2012);
        Carro c4 = new Carro("BMW", "Serie 5", 2011);
        Carro c5 = new Carro("GM", "Astra", 2015);

        System.out.println();
        System.out.println("======= CARRO ========");
        List<Carro> carros = new ArrayList<>();
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);
        System.out.println(carros);


        System.out.println("\n\n---------- ordenacao tipo List ----------\n");
        carros.sort(Comparator.comparing(Carro::getAnoFabricacao));
        System.out.println(carros);

        // ============= MAP ================
        System.out.println("\n\n======== MAP CARROS =======");
        Map<String, Carro> carroMap = new HashMap<>();
        carroMap.put(c1.getModelo(), c1);
        carroMap.put(c2.getModelo(), c2);
        carroMap.put(c3.getModelo(), c3);
        carroMap.put(c4.getModelo(), c4);
        carroMap.put(c5.getModelo(), c5);
        System.out.println(carroMap);

        // ============== PSQUISA TIPO MAP =================
        System.out.println("\n\n------ Pesquisa MAP -----");
        System.out.println(carroMap.get(c3.getModelo()));


        //=============== CONTA =======================

        Conta con1 = new Conta(120.000, 2500.00);
        Conta con2 = new Conta(320.000, 10.00);
        Conta con3 = new Conta(420.000, 40.00);
        Conta con4 = new Conta(520.000, 7700.00);
        Conta con5 = new Conta(880.000, 500.00);
        System.out.println();
        System.out.println("======= CONTA ========");
        //System.out.println(con1.toString());

        List<Conta> contas = new ArrayList<>();
        contas.add(con1);
        contas.add(con2);
        contas.add(con3);
        contas.add(con4);
        contas.add(con5);
        System.out.println(contas);
    }
}
