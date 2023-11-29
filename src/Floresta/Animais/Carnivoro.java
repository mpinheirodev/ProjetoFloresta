package Floresta.Animais;

import Floresta.Terreno;

public class Carnivoro extends Animal{

    public Carnivoro(String nome, boolean carnivoro, int vida, String icone) {
        super(nome, carnivoro, vida, icone);
    }

    @Override
    public boolean isCarnivoro() {
        return true;
    }

    @Override
    public void comer(Animal predador, Animal presa, Terreno terreno) {
        if (predador.isCarnivoro() && !presa.isCarnivoro()) {
            presa.setVida(presa.getVida() - 1);
            if (presa.getVida() == 0) {
                System.out.println(predador.getNome() + " comeu " + presa.getNome());
                System.out.println(presa.getNome() + " sobreviveu por " + presa.getCiclosVida() + " ciclos de vida");
                terreno.retirarAnimal(presa);
            }
        }
    }

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