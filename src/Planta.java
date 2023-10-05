import java.util.Random;

public class Planta {
    int cicloVida, vida, posicaoX, posicaoY;
    String nome, icone;
    Random aleatorio = new Random();

    public Planta(String nome, int vida, String icone){
        this.nome = nome;
        this.cicloVida = 0;
        this.vida = vida;
        this.icone = icone;
        this.posicaoX = aleatorio.nextInt(10);
        this.posicaoY = aleatorio.nextInt(10);
    }

    void mostrar(){
        System.out.println(this.nome);
    }

}
