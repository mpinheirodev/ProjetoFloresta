import java.util.Random;

public class Animal {
    int ciclosVida, posicaoX, posicaoY;
    String nome, inicial;
    boolean herbivoro;

    Random aleatorio = new Random();

    public Animal(String nome, boolean herbivoro) {
        this.nome = nome;
        this.herbivoro = herbivoro;
        this.ciclosVida = 0;
        this.inicial = nome.substring(0, 1);
        this.posicaoX = aleatorio.nextInt(10);
        this.posicaoY = aleatorio.nextInt(10);
    }

    public void comer() {

    }

    // public void mover(Terreno terreno) {
    //     int direcao = new Random().nextInt(4);
    //     int novoX = posicaoX;
    //     int novoY = posicaoY;

    //     switch (direcao) {
    //         case 0: // baixo
    //             novoX++;
    //             break;
    //         case 1: // cima
    //             novoX--;
    //             break;
    //         case 2: // direita
    //             novoY++;
    //             break;
    //         case 3: // esquerda
    //             novoY--;
    //             break;
    //     }

        // if (novoX >= 0 && novoX < terreno.getDimensao() && novoY >= 0 && novoY < terreno.getDimensao()) {
        //     terreno[posicaoX][posicaoY] = ' ';
            
        // }
    // }

    public void mostrar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Inicial: " + this.inicial);
        System.out.println("Posição: " + posicaoX + " " + posicaoY);
    }
}
