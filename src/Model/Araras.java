package Model;

public class Araras extends Animal {
    boolean naoVoa;


    public Araras(
            boolean naoVoa,
            int quantPatas,
            String especie,
            String tipoDeAnimal,
            boolean voa,
            boolean temPenas
    ){
        super(quantPatas, especie, tipoDeAnimal, voa, temPenas);
        this.naoVoa = naoVoa;
    }

    public boolean isNaoVoa() {
        return naoVoa;
    }

    public void setNaoVoa(boolean naoVoa) {
        this.naoVoa = naoVoa;
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
    public void setEspecie(String especie) {
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
        return "\nAves: " +
                "\nNaoVoa: " + naoVoa +
                super.toString();
    }
}
