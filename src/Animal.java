import java.util.Random;

public class Animal {
    int ciclosVida, posicaoX, posicaoY, vida;
    String nome, icone;
    boolean carnivoro;

    Random aleatorio = new Random();

    public Animal(String nome, boolean carnivoro, int vida, String icone) {
        this.nome = nome;
        this.carnivoro = carnivoro;
        this.ciclosVida = 0;
        this.vida = vida;
        this.icone = icone;
        this.posicaoX = aleatorio.nextInt(10);
        this.posicaoY = aleatorio.nextInt(10);
    }

    public void comer(Animal predador, Animal presa, Terreno terreno) {
        if (predador.carnivoro == true && presa.carnivoro == false) {
            presa.vida--;
            if (presa.vida == 0) {
                terreno.exibirTerreno();
                System.out.println(predador.nome + " comeu " + presa.nome);
                System.out.println(presa.nome + " sobreviveu por " + presa.ciclosVida + " ciclos de vida");
                terreno.retirarAnimal(presa);
            }
        }
    }

    public int getposicaoX() {
        return posicaoX;
    }

    public int getposicaoY() {
        return posicaoY;
    }

    public void mover(Terreno terreno, Animal animal) {
        int direcao = new Random().nextInt(4);
        int posX = getposicaoX();
        int posY = getposicaoY();
        switch (direcao) {
            case 0: // baixo
                posX++;
                break;
            case 1: // cima
                posX--;
                break;
            case 2: // direita
                posY++;
                break;
            case 3: // esquerda
                posY--;
                break;
        }

        if (posX >= 0 && posX < terreno.getDimensao() && posY >= 0 && posY < terreno.getDimensao()) {
            terreno.retirarAnimal(animal);
            terreno.moverAnimal(animal, posX, posY);
            posicaoX = posX;
            posicaoY = posY;

        }
    }

    public void mostrar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Inicial: " + this.icone);
        System.out.println("Posição: " + posicaoX + " " + posicaoY);
    }
}
