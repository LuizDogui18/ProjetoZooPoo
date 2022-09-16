package Main;

import Model.Zoologico;
import Model.Ambiente;
import Model.Leao;
import Model.Araras;
import Model.Tartarugas;


public class Main{
    public static void main(String[] args){
        Ambiente ambiente = new Ambiente(6);

        Araras araras1 = new Araras(
                false,
                2,
                "Arara Azul",
                "Aves",
                true,
                true);

        Araras pinguim = new Araras(
                true,
                2,
                "pinguim",
                "Aves",
                false,
                false
        );
        Leao tigre = new Leao(
                "Macho",
                true,
                4,
                "Tigre",
                "Mamifero",
                false,
                false
        );
        Leao leao = new Leao(
                "Femea",
                true,
                4,
                "Leao",
                "Mamifero",
                false,
                false
        );
        Tartarugas crocodilo = new Tartarugas(
                true,
                true,
                4,
                "Crocodilo",
                "Anfibio",
                false,
                false
        );
        Tartarugas Tartaruga = new Tartarugas(
                true,
                true,
                4,
                "Tartaruga",
                "Anfibio",
                false,
                false
        );
        Tartarugas cagado = new Tartarugas(
                true,
                true,
                4,
                "Cagado",
                "Anfibio",
                false,
                false
        );
        ambiente.setListaDeAnimais(0,araras1);
        ambiente.setListaDeAnimais(1, pinguim);
        ambiente.setListaDeAnimais(2, tigre);
        ambiente.setListaDeAnimais(3, leao);
        ambiente.setListaDeAnimais(4, crocodilo);
        ambiente.setListaDeAnimais(5, Tartaruga);

        Zoologico zoo = new Zoologico(
                "Zoologico Sao Luiz",
                ambiente
        );
        System.out.println(zoo.getAmbiente());
    }

    }

