package controller;

import model.Veiculo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("12345","III1254","Cinza", 4,"gasolina/alcool",12000,"ABC123456",110.00);
        Veiculo veiculo2 = new Veiculo("65478","XXX1254","Branco", 4,"gasolina/alcool",8000,"XYZ123456",90.00);
        Veiculo veiculo3 = new Veiculo("98745","YYY254","Preto", 4,"gasolina/alcool",15000,"QWERTY123456",130.00);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);

        System.out.println(veiculos);

        // ------------------------
        veiculos.sort(Comparator.comparing(Veiculo::getPlaca));
        System.out.println(veiculos);

        // ------------------------ Filter
        Veiculo veiculoFind = veiculos.stream().filter(v -> v.getPlaca().equals("III1254")).findAny().orElse(null);
        System.out.println("\nEncontrado: "+veiculoFind);

        // ------------------------ Map
        Map<String, Veiculo> veiculoMap = new HashMap<>();
        //veiculoMap.put("III1254", veiculoFind);
        veiculoMap.put(veiculo1.getRenavan(),veiculo1);
        veiculoMap.put(veiculo2.getRenavan(),veiculo2);
        veiculoMap.put(veiculo3.getRenavan(),veiculo3);
        System.out.println("\nColeção do tipo MAP: ");
        System.out.println(veiculoMap);

        //Ordenacao do tipo Map é proibida!!!

        //pesquisa na colecao do tipo MAP
        System.out.print("\nLocalizando veiculo na colecao do tipo Map...");
        System.out.println(veiculoMap.get(veiculo2.getRenavan()));

    }
}