package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {

        //Crie três instâncias de cada classe do diagrama (das possíveis) com valores ...
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro(2,2);
        Passaro passaro1 = new Passaro();
        Passaro passaro2 = new Passaro(5,5,5);
        Peixe peixe1 = new Peixe();
        Peixe peixe2 = new Peixe(3,3,3);

        //Percorra a coleção e faça com que os personagens sejam posicionados
        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro1);
        animais.add(cachorro2);
        animais.add(passaro1);
        animais.add(passaro2);
        animais.add(peixe1);
        animais.add(peixe2);
        System.out.println("POSICAO INICIAL DOS ANIMAIS: ");
        System.out.println(animais);

        //Reposicione os personagens que pertençam a classe Cachorro, nas coordenadas (8, 8) ...
        //Reposicione os personagens que pertençam as classes Peixe e Passaro, nas coordenadas (5, 5, 5) ...
        animais.forEach(a -> {
            a.desenhar();
            if (a instanceof Cachorro){
                a.mover(8,8);
            } else if (a instanceof Peixe) {
                ((Peixe) a).mover(5,5,5);
            } else if (a instanceof Passaro) {
                ((Passaro)a).mover(5,5,5);
            }
        });

        System.out.println("\n ------ NOVA POSICAO DOS ANIMAIS ------- ");
        System.out.println(animais);


    }
}
