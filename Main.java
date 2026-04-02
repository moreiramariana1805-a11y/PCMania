package br.inatel.cdg.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("Mariana", "123.456.789-00");

        Computador promo1 = new Computador(
                "Apple",
                152,
                new SistemaOperacional("macOS Sequoia", 64)
        );
        promo1.addHardwareBasico(new HardwareBasico("Pentium Core i3", 2200), 0);
        promo1.addHardwareBasico(new HardwareBasico("Memória RAM", 8), 1);
        promo1.addHardwareBasico(new HardwareBasico("HD", 500), 2);
        promo1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        Computador promo2 = new Computador(
                "Samsung",
                1386,
                new SistemaOperacional("Windows 8", 64)
        );
        promo2.addHardwareBasico(new HardwareBasico("Pentium Core i5", 3370), 0);
        promo2.addHardwareBasico(new HardwareBasico("Memória RAM", 16), 1);
        promo2.addHardwareBasico(new HardwareBasico("HD", 1000), 2);
        promo2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        Computador promo3 = new Computador(
                "Dell",
                5830,
                new SistemaOperacional("Windows 10", 64)
        );
        promo3.addHardwareBasico(new HardwareBasico("Pentium Core i7", 4500), 0);
        promo3.addHardwareBasico(new HardwareBasico("Memória RAM", 32), 1);
        promo3.addHardwareBasico(new HardwareBasico("HD", 2000), 2);
        promo3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        int opcao;

        do {
            System.out.println("Escolha a promoção:");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cliente.addComputador(promo1);
                    break;
                case 2:
                    cliente.addComputador(promo2);
                    break;
                case 3:
                    cliente.addComputador(promo3);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("===== RESUMO =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());

        cliente.mostraComputadores();

        System.out.println("Total: R$ " + cliente.calculaTotalCompra());

        ProcessarPedido.processar(cliente.getComputadores());

        sc.close();
    }
}