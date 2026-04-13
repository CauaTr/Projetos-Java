public class PlacaMae {
    private String modelo;
    private CPU cpu;
    private MemoriaRAM memoriaRAM;

    public PlacaMae(String modelo, int nucleos, String modeloCPU, int capacidadeGB) {
        this.modelo = modelo;
        this.cpu = new CPU(modeloCPU,nucleos);
        this.memoriaRAM = new MemoriaRAM(capacidadeGB);
    }

    //Get e Set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MemoriaRAM getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(MemoriaRAM memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void getDetalhes(){
        System.out.println("Modelo da Placa Mãe: " + modelo);
        System.out.println("Modelo do Processador: " + cpu.getModelo());//Para recuperar o modelo que está dentro de CPU
        System.out.println("Número de Núcleos: " + cpu.getNucleo());//Para recuperar o número de núcleos que está dentro de CPU
        System.out.println("Quantidade de Memória RAM: " + memoriaRAM.getCapacidadeGB());
    }
}
