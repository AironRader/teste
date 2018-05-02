package modelo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MenuCalculadora {

    static Integer valorMenu;
    static Scanner teclado = new Scanner(System.in);
    Float numero1;
    Float numero2;
    static Calculadora calculadora = new Calculadora();
    

    public static void main(String[] args) {
        chamarMenu();
        while (valorMenu != 6) {
            if (valorMenu == 1) {
                informa();
                calculadora.somar();
                chamarMenu();
            } else if (valorMenu == 2) {
                informa();
                calculadora.subtrair();
                chamarMenu();
            } else if (valorMenu == 3) {
                informa();
                calculadora.multiplicar();
                chamarMenu();
            } else if (valorMenu == 4) {
                informa();
                calculadora.dividir();
                chamarMenu();
            } else if (valorMenu == 5) {
                System.err.println(calculadora.getResultados());
                chamarMenu();
            } else if (valorMenu == 6) {
                System.exit(0);
            } else {
                chamarMenu();
            }
        }
    }

    private static void informa() {
        Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
        Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
        calculadora.setValor1(numero1);
        calculadora.setValor2(numero2);
    }

    private static void chamarMenu() {
        System.err.println("#########################");
        System.err.println("MENU");
        System.err.println("1:SOMAR");
        System.err.println("2:Subtrair");
        System.err.println("3:Multiplicar");
        System.err.println("4:Dividir");
        System.err.println("5:IMPRIMIR");
        System.err.println("6:SAIR");
        valorMenu = teclado.nextInt();
    }
}
