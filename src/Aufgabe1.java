import javax.swing.*;

public class Aufgabe1 {
    public static void main(String[]args){
        String x = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ") ;
        int y = 1;
        while(y==1) {
            if (x.matches("1")) {
                y = 2;
                System.out.println("basd");
            }
        }



    }
}
