package Model;
import java.util.Arrays;
import java.util.List;

public class Ambiente {
    Animal[] listaDeAnimais;

    public Ambiente(int quantAnimais){
        listaDeAnimais = new Animal[quantAnimais];
    }
    public void getListaDeAnimais() {
        int i;
        for (i = 0; i < this.listaDeAnimais.length; i++) {
            System.out.println(listaDeAnimais[i]);
        }
    }

    public void setListaDeAnimais(int local, Animal animal) {
        this.listaDeAnimais[local] = animal;
    }
    @Override
    public String toString(){
        this.getListaDeAnimais();
        return "Lista de Animais";
    }
}
