public class Terreno {
    
    private char[][] area;
    private int dimensao;

    public Terreno(int dimensao) {
        this.dimensao = dimensao;
        area = new char[dimensao][dimensao];
        iniciarTerreno();
    }

    public int getDimensao() {
        return dimensao;
    }

    // Gera as dimensões do terreno

    private void iniciarTerreno() {
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++)
                area[i][j] = ' ';
        }
    }

    // Exibir o terreno

    public void exibirTerreno() {
        for (int i=0; i < dimensao; i++) {
            System.out.print("|");
            for (int j=0; j < dimensao; j++)
                System.out.print(area[i][j] + " ");
                System.out.println(" |");
            
        }
        System.out.println();
    }

    public void adicionarAnimal(Animal animal) {
        area[animal.posicaoX][animal.posicaoY] = animal.inicial.charAt(0);
    }

    public void adicionarPlanta(Planta planta) {
        area[planta.posicaoX][planta.posicaoY] = planta.nome.charAt(0);
    }
}
