package Floresta.Animais;

import java.util.Random;
import Floresta.Terreno;

public abstract class Animal {
    protected int ciclosVida, posicaoX, posicaoY, vida;
    protected String nome, icone;
    protected boolean carnivoro;

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

    public boolean isCarnivoro() {
        return false;
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

    public void comer(Animal predador, Animal presa, Terreno terreno){};

    public int getposicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX){
        this.posicaoX = posicaoX;
    }

    public int getposicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY){
        this.posicaoY = posicaoY;
    }

    public int getCiclosVida() {
        return ciclosVida;
    }

    public void setCiclosVida(int ciclosVida) {
        this.ciclosVida = ciclosVida;
    }

    public int getVida() {
        return 0;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public String getIcone() {
        return icone;
    }
}
