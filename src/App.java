
public class App {
    public static void main(String[] args) throws Exception {

        Terreno terreno = new Terreno(10);

        // Criando um Coelho
        Herbivoro coelho = new Herbivoro("Coelho", true, 2, "🐇");

        // // // Criando um leão e um tigre
        Carnivoro leao = new Carnivoro("Leão", false, 5, "🦁");

        Carnivoro tigre = new Carnivoro("Tigre", false, 4, "🐯");

        // // Criando uma planta
        Planta planta = new Planta("Arbusto", 5, 1, "🌱");
        // // Exibindo o terreno
        terreno.adicionarAnimal(coelho);
        terreno.adicionarAnimal(leao);
        terreno.adicionarAnimal(tigre);

        while (true) {
            terreno.adicionarPlanta(planta);
            terreno.exibirTerreno();
            coelho.mover(terreno, coelho);
            leao.mover(terreno, leao);
            tigre.mover(terreno, tigre);
            Thread.sleep(400);
        }

    }
}
