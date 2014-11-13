
package boletin9.pkg4;

import javax.swing.JOptionPane;

public class Taboas {
    private double numero;
    public double calcularTaboas(){
        double n;
              do {
            String respuesta = JOptionPane.showInputDialog("introduce nº");
            n=Double.parseDouble(respuesta);
            if (n == 0) {
                JOptionPane.showMessageDialog(null, "dato no válido");
            }
        } while (n == 0);   
         return n;
    }
    public void calcular(){
         numero = this.calcularTaboas();
        JOptionPane.showMessageDialog(null, "x1=" + numero*1+"\n"+
                "x2=" + numero*2+"\n"+
                "x3=" + numero*3+"\n"+
                "x4=" + numero*4+"\n"+
                "x5=" + numero*5+"\n"+
                "x6=" + numero*6+"\n"+
                "x7=" + numero*7+"\n"+
                "x8=" + numero*8+"\n"+
                "x9=" + numero*9+"\n"+
                "x10=" + numero*10);
    }
}
