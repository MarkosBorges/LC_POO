package controller;

import model.*;

import java.util.*;

public class VeiculoController {
    public static void main(String[] args) {

        // INSTANCIA BICICLETA
        Bicicleta bicicleta = new Bicicleta(2, "Humana", "Caloi", "Sport", 2022, 26, "BIC123");

        System.out.println("Bicicleta:\n" + bicicleta.toString());

        // INSTANCIA CARRO
        Carro carro = new Carro(4, "Gasolina", "Volkswagen", "Golf", 2022, 500);
        carro.setRenavam("123456789");
        carro.setChassi("CHASSI123");
        carro.setPlaca("ABC-1234");

        System.out.println("\nCarro:\n" + carro.toString());
        System.out.println("Renavam: " + carro.getRenavam());
        System.out.println("Chassi: " + carro.getChassi());
        System.out.println("Placa: " + carro.getPlaca());

        // ISNTANCIA CAMINHAO
        Caminhao caminhao = new Caminhao(6, "Diesel", "Mercedes-Benz", "Actros", 2022, 10000);
        caminhao.setRenavam("987654321");
        caminhao.setChassi("CHASSI987");
        caminhao.setPlaca("XYZ-5678");

        System.out.println("\nCaminhão:\n" + caminhao.toString());
        System.out.println("Renavam: " + caminhao.getRenavam());
        System.out.println("Chassi: " + caminhao.getChassi());
        System.out.println("Placa: " + caminhao.getPlaca());

        // -----------------------------------------------------------------------

    }
}
