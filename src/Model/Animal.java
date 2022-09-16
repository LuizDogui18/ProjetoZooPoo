package Model;

public class Animal {
    int quantPatas;
    String especie;
    String tipoDeAnimal;
    boolean voa;
    boolean temPenas;


    public Animal(int quantPatas, String especie, String tipoDeAnimal, boolean voa, boolean temPenas) {
        this.quantPatas = quantPatas;
        this.especie = especie;
        this.tipoDeAnimal = tipoDeAnimal;
        this.voa = voa;
        this.temPenas = temPenas;

    }



    public int getQuantPatas(){
        return quantPatas;
    }
    public void setQuantPatas(int quantPatas){
        this.quantPatas = quantPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal( String tipoDeAnimal){
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public boolean isTemPenas() {
        return temPenas;
    }

    public void setTemPenas(boolean temPenas) {
        this.temPenas = temPenas;
    }
    @Override
    public String toString(){
        return "\n Animais:" +
                "\nQuantPatas:  " + quantPatas +
                "\nEspecie: " + especie +
                "\nTipoDeAnimal: " + tipoDeAnimal +
                "\nVoa: " + voa +
                "\nTemPenas: " + temPenas;
    }


}
