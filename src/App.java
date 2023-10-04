
public class App {
    public static void main(String[] args) throws Exception {

        // Criando um Coelho
        Herbivoro coelho = new Herbivoro("coelho", true);
        coelho.mostrar();

        // // Criando um leão e um tigre
        Animal leao = new Animal("Leão", false);
        leao.mostrar();

        Animal tigre = new Animal("Tigre", false);
        tigre.mostrar();

        // // Criando uma planta
        Planta planta = new Planta("Arbusto", 5);
        planta.mostrar();

        // // Exibindo o terreno
        Terreno terreno = new Terreno(10);
        terreno.adicionarPlanta(planta);
        terreno.adicionarAnimal(coelho);
        terreno.adicionarAnimal(leao);
        terreno.adicionarAnimal(tigre);
        terreno.exibirTerreno();
    }
}
