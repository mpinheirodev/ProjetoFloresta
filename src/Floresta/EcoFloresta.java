package Floresta;

import java.util.ArrayList;
import java.util.List;

import Floresta.Animais.Carnivoro;
import Floresta.Animais.Herbivoro;
import Floresta.Plantas.Planta;

public class EcoFloresta {
    private List<Carnivoro> carnivoros = new ArrayList<>();
    private List<Herbivoro> herbivoros = new ArrayList<>();
    private List<Planta> plantas = new ArrayList<>();
    private Terreno terreno;

    public EcoFloresta(){
        terreno = new Terreno(10);

        int qtdeCarnivoros = 2;
        int qtdeHerbivoros = 5;
        int qtdePlantas = 4;

        for(int c = 0; c < qtdeCarnivoros; c++){
            carnivoros.add(new Carnivoro("Lobo", true, 5, "🐺"));
        }

        for(int h = 0; h < qtdeHerbivoros; h++){
            herbivoros.add(new Herbivoro("Coelho", false, 1, "🐇"));
        }

        for(int p = 0; p < qtdePlantas; p++){
            plantas.add(new Planta("Arbusto", 1, "🌱"));
        }
    }

    public void iniciarFloresta(){
        terreno.exibirTerreno(carnivoros, herbivoros, plantas);

        while(true){
            for(Carnivoro carnivoro : carnivoros){
                carnivoro.mover(terreno, carnivoro);
                for(Herbivoro herbivoro : herbivoros){
                    if(carnivoro.getposicaoX() == herbivoro.getposicaoX() && carnivoro.getposicaoY() == herbivoro.getposicaoY()){
                        carnivoro.comer(carnivoro, herbivoro, terreno);
                        if(herbivoros.size() == 0){
                            herbivoros.remove(herbivoro);
                            break;
                        }
                    }
                }
            }
            for(Herbivoro herbivoro : herbivoros){
                herbivoro.mover(terreno, herbivoro);
                herbivoro.setCiclosVida(herbivoro.getCiclosVida() + 1);
            }

            for(Carnivoro carnivoro : carnivoros){
                carnivoro.setCiclosVida(carnivoro.getCiclosVida() + 1);
            }

            for(Planta planta : plantas){
                planta.cicloVida++;
            }
            terreno.exibirTerreno(carnivoros, herbivoros, plantas);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
