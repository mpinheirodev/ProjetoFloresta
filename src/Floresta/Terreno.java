package Floresta;

import java.util.List;

import Floresta.Animais.Animal;
import Floresta.Animais.Carnivoro;
import Floresta.Animais.Herbivoro;
import Floresta.Plantas.Planta;

public class Terreno {
    
    private String [][] area;
    private int dimensao;

    public Terreno(int dimensao) {
        this.dimensao = dimensao;
        area = new String [dimensao][dimensao];
        iniciarTerreno();
    }

    public int getDimensao() {
        return dimensao;
    }

    // Gera as dimensões do terreno

    private void iniciarTerreno() {
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++)
                area[i][j] = "__";
        }
    }

    // Exibir o terreno

    public void exibirTerreno(List<Carnivoro> carnivoros, List<Herbivoro> herbivoros, List<Planta> plantas) {
        for (int i=0; i < dimensao; i++) {
            System.out.print("|");
            for (int j=0; j < dimensao; j++)
                System.out.print(area[i][j] + "__");
                System.out.println(" |");
        }
        for(Carnivoro carnivoro : carnivoros){
            adicionarAnimal(carnivoro);
        }
        for(Herbivoro herbivoro : herbivoros){
            adicionarAnimal(herbivoro);
        }
        for(Planta planta : plantas){
            adicionarPlanta(planta);
        }
        System.out.println("");
    }

    public void adicionarAnimal(Animal animal) {
        area[animal.getposicaoX()][animal.getposicaoY()] = animal.getIcone();
    }

    public void moverAnimal(Animal animal, int posX, int posY) {
        area[posX][posY] = animal.getIcone();
    }
    public void adicionarPlanta(Planta planta) {
        area[planta.posicaoX][planta.posicaoY] = planta.icone;
    }

    public void retirarAnimal(Animal animal) {
        area[animal.getposicaoX()][animal.getposicaoY()] = "__";
    }
}
