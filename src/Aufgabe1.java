import javax.swing.*;

public class Aufgabe1 {
    public static void main(String[] args) {
        eingabe();
    }
        public static void eingabe () {
            try {
                Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));
            } catch (NumberFormatException e) {
                eingabe();

            }
        }
    }

