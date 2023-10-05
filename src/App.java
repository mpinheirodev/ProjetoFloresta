
public class App {
    public static void main(String[] args) throws Exception {

        // Definindo o terreno
        Terreno terreno = new Terreno(10);

        // Criando um Coelho
        Herbivoro coelho = new Herbivoro("Coelho", false, 1, "🐇");

        // Criando um lobo
        Carnivoro lobo = new Carnivoro("Lobo", true, 5, "🐺");

        // Criando uma planta
        Planta planta = new Planta("Arbusto", 1, "🌱");

        // Adicionando os animais ao terreno
        terreno.adicionarAnimal(coelho);
        terreno.adicionarAnimal(lobo);

        while (true) {
            
            terreno.adicionarPlanta(planta);
            terreno.exibirTerreno();
            coelho.mover(terreno, coelho);
            lobo.mover(terreno, lobo);
            planta.cicloVida++;
            lobo.ciclosVida++;
            coelho.ciclosVida++;
            if (lobo.getposicaoX() == coelho.getposicaoX() && lobo.getposicaoY() == coelho.getposicaoY()) {
                lobo.comer(lobo, coelho, terreno);
                if (coelho.vida == 0) {
                    break;
                }
            }
            Thread.sleep(200);
        }

    }
}
