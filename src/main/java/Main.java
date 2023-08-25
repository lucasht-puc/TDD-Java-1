package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Relogio relogio = new Relogio();
        int escolha;
        int hora;
        int minutos;
        int segundos;

        do {
            exibirMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite as hora: ");
                    hora = scanner.nextInt();
                    System.out.print("Digite os minutos: ");
                    minutos = scanner.nextInt();
                    System.out.print("Digite os segundos: ");
                    segundos = scanner.nextInt();
                    relogio.configHorasMinutosSegundos(hora, minutos, segundos);
                    break;

                case 2:
                    relogio.meiaNoite();
                    break;

                case 3:
                    System.out.print("Digite as hora de inicio: ");
                    hora = scanner.nextInt();
                    System.out.print("Digite os minutos de inicio: ");
                    minutos = scanner.nextInt();
                    System.out.print("Digite os segundos de inicio: ");
                    segundos = scanner.nextInt();
                    relogio.inicioIntervalo(hora, minutos, segundos);

                    System.out.print("Digite as hora de fim: ");
                    hora = scanner.nextInt();
                    System.out.print("Digite os minutos de fim: ");
                    minutos = scanner.nextInt();
                    System.out.print("Digite os segundos de fim: ");
                    segundos = scanner.nextInt();
                    relogio.fimIntervalo(hora, minutos, segundos);

                    System.out.println(relogio.tempoDecorrido());
                    break;

                case 4:
                    System.out.println(relogio.displayAMPM());
                    break;

                case 5:
                    System.out.println(relogio.display24H());
                    break;
            }

        } while (escolha != 9);
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Definir Hora");
        System.out.println("2. Reiniciar para meia noite");
        System.out.println("3. Usar cronometro");
        System.out.println("4. Mostrar hora no formato AMPM");
        System.out.println("5. Mostrar hora no formato 24h");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opcao: ");
    }
}
