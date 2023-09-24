package controller;

import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;

import java.text.NumberFormat;
import java.util.*;
//
//import java.util.ArrayList;

//Responda as seguintes questões:
//        1. Foi possível criar instâncias da classe Funcionario? Justifique sua resposta.
//          Sim. Foi possível instânciar ao tranformar a classe Funcionario em ABSTRATA, e logo, implementar o extends para deixar as duas classes (Desenvolvedor e Gerente) como classe filha.

//        2. Onde você deve inserir estas regras de negócio? Na classe xxController ou nas classes Gerente e Desenvolvedor? Justifique sua resposta.
//          Neste caso, as regras devem ser inseridas nas classes específicas por conta de serem regras distintas, diferentes para cada funcionário. Assim, o código também se torna organizado e fácil de fazer manutenção, pois ao precisar modificar algo, vamos diretos nas regras de funcionário sem afetar as demais.
//

public class FuncionarioController {
    public static void main(String[] args) {

        Desenvolvedor desenvolvedor = new Desenvolvedor("João", 5000.0);
        Gerente gerente = new Gerente("Maria", 8000.0);

        //PARTE 01 --------------------------------------------------
        System.out.println("\nFuncionário: " + desenvolvedor.toString());
        System.out.println("Bônus do Desenvolvedor: " + NumberFormat.getCurrencyInstance().format(desenvolvedor.getBonus()));
        System.out.println("\nFuncionário: " + gerente.toString());
        System.out.println("Bônus do Gerente: " + NumberFormat.getCurrencyInstance().format(gerente.getBonus()));
        System.out.println();
        System.out.println();

        //PARTE 02 --------------------------------------------------
//        Criar 2 gerentes gerais, 2 gerentes de desenvolvimento e 16 desenvolvedores (6 sênior, 6 pleno e 4 júnior) com os salários e bônus especificados.
//        Calcular e imprim a folha salarial total com e sem bônus.
//        Calcular e imprimir o valor do bônus e o salário bruto de cada funcionário.
//        Aplicar um reajuste salarial de 5% a todos os funcionários


        List<Funcionario> empresa = new ArrayList<>();

        //GERAL
        empresa.add(new Gerente("Marcos - Gerente Geral", 6500.0));
        empresa.add(new Gerente("Vinicius - Gerente Geral", 6500.0));

        // DESENVOLVIMENBTO
        empresa.add(new Gerente("Gilberto - Gerente Desenvolvimento", 4500.0));
        empresa.add(new Gerente("Josias - Gerente Desenvolvimento", 4500.0));


        // SENIOR ----------------------------------------------

        empresa.add(new Desenvolvedor("João - Sênior", 3500.0));
        empresa.add(new Desenvolvedor("Maria - Sênior", 3500.0));
        empresa.add(new Desenvolvedor("Alberto - Sênior", 3500.0));
        empresa.add(new Desenvolvedor("Mario - Sênior", 3500.0));
        empresa.add(new Desenvolvedor("Fernanda - Sênior", 3500.0));
        empresa.add(new Desenvolvedor("Joana - Sênior", 3500.0));

        // PLENO ------------------------------------------------
        empresa.add(new Desenvolvedor("Marcos - Pleno", 2500.0));
        empresa.add(new Desenvolvedor("Gustavo - Pleno", 2500.0));
        empresa.add(new Desenvolvedor("Christopher - Pleno", 2500.0));
        empresa.add(new Desenvolvedor("Marlene - Pleno", 2500.0));
        empresa.add(new Desenvolvedor("André - Pleno", 2500.0));
        empresa.add(new Desenvolvedor("Ricardo - Pleno", 2500.0));


        // JUNIOR -----------------------------------------------
        empresa.add(new Desenvolvedor("Matheus - Júnior", 1800.0));
        empresa.add(new Desenvolvedor("Mario - Júnior", 1800.0));
        empresa.add(new Desenvolvedor("Marcelo - Júnior", 1800.0));
        empresa.add(new Desenvolvedor("Rick - Júnior", 1800.0));
        empresa.add(new Desenvolvedor("Ronaldo - Júnior", 1800.0));
        empresa.add(new Desenvolvedor("Roberto - Júnior", 1800.0));


        // FOLHA COM BONUS ----------------------------------------------
        double folhaComBonus = 0.0;
        for (Funcionario funcionario : empresa) {
            folhaComBonus += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println("|| ---------------------------------------------------- ||");
        System.out.println("          FOLHA COM BONUS: " + NumberFormat.getCurrencyInstance().format(folhaComBonus));
        System.out.println("|| ---------------------------------------------------- ||");

        // FOLHA SEM BONUS ----------------------------------------------
        double folhaSemBonus = 0.0;
        for (Funcionario funcionario : empresa) {
            folhaSemBonus += funcionario.getSalario();
        }
        System.out.println("|| ----------------------------------------------------- || ");
        System.out.println("           FOLHA SEM BONUS: " + NumberFormat.getCurrencyInstance().format(folhaSemBonus));
        System.out.println("|| ------------------------------------------------------ ||");


        // BONUS E SALARIO FUNCIONARIO
        System.out.println("\n|| --------------- FUNCIONÁRIO: NOVO SALARIO + 5% -------------------");
        for (Funcionario funcionario : empresa) {
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Salário Bruto: " + NumberFormat.getCurrencyInstance().format((funcionario.getSalario() + funcionario.getBonus())));
            System.out.println("Bônus: " + NumberFormat.getCurrencyInstance().format(funcionario.getBonus()));
            System.out.println();
        }

        // REAJUSTE 5% P/ FUNÇAS
        for (Funcionario funcionario : empresa) {
            double novoSalario = funcionario.getSalario() * 1.05; // aumento de 5%
            funcionario.setSalario(novoSalario);
        }

        // NOVA FOLHA SALARIAL C/ BONUS + REAJUSTE
        System.out.println();
        double novaFolhaComBonus = 0.0;//
        for (Funcionario funcionario : empresa) {
            novaFolhaComBonus += funcionario.getSalario() + funcionario.getBonus();
        }

        System.out.println("|| ----------------------- NOVA FOLHA SALARIAL ------------------------ ||");
        System.out.println("                Nova folha salarial com Bônus: " + NumberFormat.getCurrencyInstance().format(novaFolhaComBonus));
        System.out.println("|| ---------------------------------------------------------------------- ||");


    }
}
