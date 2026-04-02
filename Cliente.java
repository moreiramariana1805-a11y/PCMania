package br.inatel.cdg.poo;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
    }

    public void addComputador(Computador computador) {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                computadores[i] = computador;
                break;
            }
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                total += computadores[i].getPreco();
            }
        }
        return total;
    }

    public void mostraComputadores() {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                computadores[i].mostraPCConfigs();
                System.out.println("------------------------");
            }
        }
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
