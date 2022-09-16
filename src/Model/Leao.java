package Model;


public class Leao extends Animal {

    String genero;
    boolean temRabo;


    public Leao( String genero,
                 boolean temRabo,
                 int quantPatas,
                 String especie,
                 String tipoDeAnimal,
                 boolean voa,
                 boolean temPenas) {
        super(quantPatas, especie, tipoDeAnimal, voa, temPenas);
        this.genero = genero;
        this.temRabo = temRabo;
    }
    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public boolean isTemRabo(){
        return temRabo;
    }

    public void setTemRabo(boolean temRabo) {
        this.temRabo = temRabo;
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
        return "\nMamiferos" +
                "\nGenero: " + genero +
                "\nTemRabo: " + temRabo +
                super.toString();

    }

}
