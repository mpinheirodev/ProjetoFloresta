
public class App {
    public static void main(String[] args) throws Exception {

        // Criando um Coelho
        Herbivoro coelho = new Herbivoro();
        coelho.nome = "Coelho";
        coelho.mostrar();

        // Criando um leão
        Carnivoro leao = new Carnivoro();
        leao.nome = "Leão";
        leao.mostrar();

        // Criando uma planta
        Planta planta = new Planta();
        planta.nome = "Alface";
        planta.mostrar();
    }
}
