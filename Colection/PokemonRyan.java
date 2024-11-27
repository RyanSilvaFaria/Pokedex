package Coleçao;

public class PokemonRyan {
    
    protected String nome;
    protected int level;
    protected Double altura;
    protected Double peso;

    public PokemonRyan(String nome, int level, Double altura, Double peso) {
        setNome(nome);
        setLevel(level);
        setAltura(altura);
        setPeso(peso);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        if(altura>0){

            this.altura = altura;
        }
        else{
            this.altura = 1.0;
        }
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if(peso>0){
        this.peso = peso;
        }
        else{
            this.peso=0.1;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if(nome == null){
            this.nome= "Pokemon";
        }
        else{
        this.nome = nome;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level>0){
        this.level = level;
        }
        else{
            this.level=1;
        }
    }

    @Override
    public String toString() {
        return "PokemonRyan [nome=" + nome + ", level=" + level + ", altura=" + altura + ", peso=" + peso + "]";
    }


    
    
}
