public class Planta {
    int cicloVida;
    String nome;
    int posicaoX, posicaoY;

    public Planta(String nome, int cicloVida){
        this.nome = nome;
        this.cicloVida = cicloVida;
    }

    void mostrar(){
        System.out.println(this.nome);
    }

}
