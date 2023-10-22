package controller;

import model.Aviao;
import model.Navio;
import model.Personagem;
import model.Tanque;
import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static void main(String[] args) {
        //
        Aviao aviao1 = new Aviao();
        Aviao aviao2 = new Aviao(1,1,1);
        Navio navio1 = new Navio();
        Navio navio2 = new Navio(3,3);
        Tanque tanque1 = new Tanque();
        Tanque tanque2 = new Tanque(6,6);

            // 2.
        List<Personagem> personagens = new ArrayList<>();
        personagens.add(aviao1);
        personagens.add(aviao2);
        personagens.add(navio1);
        personagens.add(navio2);
        personagens.add(tanque1);
        personagens.add(tanque2);
        System.out.println("Posicao Inicial do Persogens: ");
        System.out.println(personagens);

        personagens.forEach((p) ->{
            p.desenhar();
            if(p instanceof Aviao){
                ((Aviao)p).mover(2,2,2);
            } else if (p instanceof Navio) {
                p.mover(4,4);
            } else if (p instanceof Tanque) {
                p.mover(8,8);
            }
        });
        System.out.println("\nNova posição dos Personagens: ");
        System.out.println(personagens);

    }
}
