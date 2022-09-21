package Model;

import Interface.IAndar;
import Interface.INadar;

public class Tartarugas extends Animal implements IAndar, INadar {
    boolean nada;
    boolean respiraDebaixoDagua;

    public Tartarugas(
            boolean nada,
            boolean respiraDebaixoDagua,
            int quantPatas,
            String especie,
            String tipoDeAnimal,
            boolean voa,
            boolean temPenas
    ){
        super(quantPatas, especie, tipoDeAnimal, voa, temPenas);
        this.nada = nada;
        this.respiraDebaixoDagua = respiraDebaixoDagua;
    }

    public boolean isNada() {
        return nada;
    }
    public void setNada(boolean nada){
        this.nada = nada;
    }
    public boolean isRespiraDebaixoDagua(){
        return respiraDebaixoDagua;
    }
    public void setRespiraDebaixoDagua(boolean respiraDebaixoDagua){
        this.respiraDebaixoDagua = respiraDebaixoDagua;
    }
    @Override
    public int getQuantPatas(){
        return super.getQuantPatas();
    }
    @Override
    public void setQuantPatas(int quantPatas){
        super.setQuantPatas(quantPatas);
    }
    @Override
    public String getEspecie(){
        return super.getEspecie();
    }
    @Override
    public void setEspecie(String especie){
        super.setEspecie(especie);
    }
    @Override
    public String getTipoDeAnimal(){
        return super.getTipoDeAnimal();
    }
    @Override
    public void setTipoDeAnimal(String tipoDeAnimal){
        super.setTipoDeAnimal(tipoDeAnimal);
    }
    @Override
    public boolean isVoa(){
        return super.isVoa();
    }
    @Override
    public void setVoa(boolean voa){
        super.setVoa(voa);
    }
    @Override
    public boolean isTemPenas(){
        return super.isTemPenas();
    }
    @Override
    public void setTemPenas(boolean temPenas){
        super.setTemPenas(temPenas);
    }
    @Override
    public String toString(){
        return "\nTartarugas{" +
                "\nNadar:" + nada +
                "\n RespiraDebaixoDagua: " + respiraDebaixoDagua +
                '}' + super.toString();
    }


    @Override
    public void andar() {
        System.out.println("A tartaruga comecou a andar");
    }

    @Override
    public void nadar() {
        System.out.println("e logo depois comecou a nadar");
    }
}
