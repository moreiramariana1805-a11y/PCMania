package br.inatel.cdg.poo;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private SistemaOperacional sistema;
    private MemoriaUSB memoria;

    public Computador(String marca, float preco, SistemaOperacional sistema) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
        this.hardwares = new HardwareBasico[3];
    }

    public void addHardwareBasico(HardwareBasico hardware, int posicao) {
        if (posicao >= 0 && posicao < hardwares.length) {
            hardwares[posicao] = hardware;
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);

        for (int i = 0; i < hardwares.length; i++) {
            if (hardwares[i] != null) {
                System.out.println(hardwares[i].getNome() + " - " + hardwares[i].getCapacidade());
            }
        }

        System.out.println("Sistema Operacional: " + sistema.getNome() + " (" + sistema.getTipo() + " bits)");

        if (memoria != null) {
            System.out.println("Memória USB: " + memoria.getNome() + " - " + memoria.getCapacidade() + "GB");
        }
    }

    public float getPreco() {
        return preco;
    }
}
