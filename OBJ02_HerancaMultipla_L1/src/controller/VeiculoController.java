package controller;

import model.*;
import java.util.*;

public class VeiculoController {
    public static void main(String[] args) {

        // INSTANCIA BICICLETA
        Bicicleta bicicleta = new Bicicleta(2, "Humana", "Caloi", "Sport", 2022, 26, "BIK123");

        System.out.println("BICICLETA:\n" + bicicleta.toString());

        // INSTANCIA CARRO
        Carro carro = new Carro(4, "Gasolina", "Volkswagen", "Golf", 2022, 500, "CH00000", "AAA0000", "123456789");
        carro.setRenavam("123456789");
        carro.setChassi("CHASSI123");
        carro.setPlaca("ABC-1234");

        System.out.println("\nCARRO:\n" + carro.toString());
        System.out.println("Renavam: " + carro.getRenavam());
        System.out.println("Chassi: " + carro.getChassi());
        System.out.println("Placa: " + carro.getPlaca());

        // ISNTANCIA CAMINHAO
        Caminhao caminhao = new Caminhao(6, "Diesel", "Mercedes-Benz", "Actros", 2022, 10000, "CH111111", "BBB11111", "1234567890");
        caminhao.setRenavam("987654321");
        caminhao.setChassi("CHASSI987");
        caminhao.setPlaca("XYZ-5678");

        System.out.println("\nCAMINHÃO:\n" + caminhao.toString());
        System.out.println("Renavam: " + caminhao.getRenavam());
        System.out.println("Chassi: " + caminhao.getChassi());
        System.out.println("Placa: " + caminhao.getPlaca());

        // -----------------------------------------------------------------------
        // -------------------------------------------------------------------------------------

        // COLECAO VEICULOS -----------------------------
        List<Veiculo> cadastroVeiculos = new ArrayList<>();
        // -------------------------------------
        cadastroVeiculos.add(new Bicicleta(2, "Humana", "Caloi", "Sport", 2022, 26, "BIKE001"));
        cadastroVeiculos.add(new Bicicleta(2, "Humana", "Caloi", "Mountain", 2021, 29, "BIKE002"));
        cadastroVeiculos.add(new Bicicleta(2, "Elétrica", "GTS", "Urban", 2022, 28, "BIKE003"));
        cadastroVeiculos.add(new Bicicleta(2, "Humana", "KSW", "Road", 2023, 24, "BIKE004"));
        cadastroVeiculos.add(new Bicicleta(2, "Elétrica", "Ravok", "Commuter", 2022, 26, "BIKE005"));

        cadastroVeiculos.add(new Carro(4, "Gasolina", "Volkswagen", "Golf", 2022, 500, "CH2345234", "HBA1234", "9876544332"));
        cadastroVeiculos.add(new Carro(4, "Gasolina", "Volkswagen", "Golf", 2022, 500, "CH6754685", "IFD1234", "123456789"));
        cadastroVeiculos.add(new Carro(4, "Gasolina", "Ford", "Focus", 2023, 550, "CH754675", "MTH1234", "9876543"));
        cadastroVeiculos.add(new Carro(4, "Etanol", "Fiat", "Uno", 2022, 450, "CH754765", "ARL1234", "45688654"));
        cadastroVeiculos.add(new Carro(4, "Gasolina", "Chevrolet", "Cruze", 2021, 600, "CH0987879", "IAR1234", "98785454"));
        cadastroVeiculos.add(new Carro(4, "Elétrico", "Tesla", "Model 3", 2022, 700, "CH09887", "BAK1234", "9867563434"));

        cadastroVeiculos.add(new Caminhao(6, "Diesel", "Mercedes-Benz", "Actros", 2010, 10000, "CH6454234", "iHX1234", "754654332"));
        cadastroVeiculos.add(new Caminhao(8, "Diesel", "Scania", "R-Series", 2022, 12000, "CH64357436", "IHF1234", "094379333"));
        cadastroVeiculos.add(new Caminhao(6, "Diesel", "Volvo", "FH16", 2023, 14000, "CH564643", "UFC1234", "87765654"));
        cadastroVeiculos.add(new Caminhao(8, "Diesel", "Kenworth", "W990", 2021, 11000, "CH43432", "TRA1234", "78945343"));
        cadastroVeiculos.add(new Caminhao(6, "Diesel", "Peterbilt", "389", 2022, 13000, "CH123445", "POK1234", "795634344"));

        //System.out.println("\n\n");
        //System.out.println(cadastroVeiculos);
        cadastroVeiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println("\n\n---------------- A) Veiculos por ANO de FABRICACAO ----------------- ");
        System.out.println(cadastroVeiculos);

        // ----------------------------------------------------------------------------------------------------------
//        b) Ordene e imprima a lista de automóveis cadastradas no sistema, na mesma ordem do item a;
//        c) Ordene e imprima a lista de bicicletas cadastradas no sistema, na mesma ordem do item a;
        // ----------------------------------------------------------------------------------------------------------
        List<Automovel> automoveis = new ArrayList<>();
        for (Veiculo veiculo : cadastroVeiculos) {
            if (veiculo instanceof Automovel) {
                automoveis.add((Automovel) veiculo);
            }
        }
        //automoveis.sort(Comparator.comparing(::getAnoFabricacao));
        System.out.println("\n\n---------------- B) Automóveis por ANO de FABRICACAO ----------------- ");
        System.out.println(automoveis);

        List<Bicicleta> bicicletas = new ArrayList<>();
        for (Veiculo veiculo : cadastroVeiculos) {
            if (veiculo instanceof Bicicleta) {
                bicicletas.add((Bicicleta) veiculo);
            }
        }
        System.out.println("\n\n---------------- C) Bicicletas por ANO de FABRICACAO ----------------- ");
        System.out.println(bicicletas);

        // ----------------------------------------------------------------------------------------------------------
//        d) Ordene e imprima a lista de veículos que possuem placas que começam pela letra “I” ou “i”
//        (organize o código para que dois ou mais veículos tenham placas que comecem por “I” ou “i”), em ordem crescente pelo ano de fabricação.;
        // ----------------------------------------------------------------------------------------------------------
        //*https://www.w3schools.com/java/ref_string_startswith.asp
        List<Veiculo> placasComI = new ArrayList<>();
        for (Veiculo veiculo : cadastroVeiculos) {
            if (veiculo instanceof Automovel) {
                if (((Automovel) veiculo).getPlaca() != null && !((Automovel) veiculo).getPlaca().isEmpty() && (((Automovel) veiculo).getPlaca().startsWith("I") || ((Automovel) veiculo).getPlaca().startsWith("i"))) {
                    placasComI.add(veiculo);
                }
            }
        }
        System.out.println("\n\n---------------- D) Placas com I ----------------- ");
        placasComI.sort(Comparator.comparing(Veiculo::getAnoFabricacao));
        System.out.println(placasComI);

    }
}
