public class Computador {
        private String modelo;
        private PlacaMae placaMae;
        private Fonte fonte;
        private DiscoArmazenamento discoArmazenamento;

    public Computador(String modelo, String modeloPlacaMae, int nucleos, String modeloCPU, int capacidadeGBMemoria,
                      int potencia, String tipo, int capacidade){
        this.modelo = modelo;
        this.placaMae = new PlacaMae(modeloPlacaMae,nucleos,modeloCPU,capacidadeGBMemoria);
        this.fonte = new Fonte(potencia);
        this.discoArmazenamento = new DiscoArmazenamento(tipo, capacidade);
    }

    public String ligar(){
        return "ligou";
    }

    public void getEspecificacoes(){
        System.out.println("Modelo COmputador: " + modelo);
        System.out.println(ligar());
        System.out.println("Especificações: ");
        placaMae.getDetalhes();
        System.out.println("Fonte Potência: " + fonte.getPotenciaWatts());
        System.out.println("Tipo HD: " + discoArmazenamento.getTipo());
        System.out.println("Capacidade HD: " + discoArmazenamento.getCapacidadeGB());
    }

    public String getEspecificacoes2(){
        return "Modelo Computador" + modelo + "\n" + ligar() +
                "\nEspecificações: " +
                "\nModelo Placa Mãe: " + modelo +
                "\nModelo Processador: " + placaMae.getCpu().getModelo() +
                "\nNúmero de Núcleos: " + placaMae.getCpu().getNucleo() +
                "\nQuantidade de Memória RAM em GB: " + placaMae.getMemoriaRAM().getCapacidadeGB() +
                "\nFonte Potência: " + fonte.getPotenciaWatts() +
                "\nTipo HD: " + discoArmazenamento.getTipo() +
                "\nCapacidade HD: " + discoArmazenamento.getCapacidadeGB();
    }
}
