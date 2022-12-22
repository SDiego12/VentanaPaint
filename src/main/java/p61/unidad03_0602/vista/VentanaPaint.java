/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_0602.vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author MSI
 */
public class VentanaPaint extends JFrame implements ActionListener{

    private PanelPaint panelPaint;
    private JPanel panelPrincipal;
    private JComboBox jComboBox1;

    public VentanaPaint() {
        this.setSize(1000, 600);
        this.setLocation(100, 100);
        this.setTitle("Paint 1.0");
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Rojo");
        this.jComboBox1.addItem("Azul");
        this.jComboBox1.addItem("Verde");
        this.jComboBox1.addActionListener(this);
        this.panelPaint = new PanelPaint();
        this.panelPaint.setBackground(Color.white);
        this.panelPrincipal = new JPanel(new BorderLayout());
        this.panelPrincipal.add(this.panelPaint,BorderLayout.CENTER);
        this.panelPrincipal.add(this.jComboBox1,BorderLayout.SOUTH);
        this.setContentPane(this.panelPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaPaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.jComboBox1.getSelectedIndex()==0){
            this.panelPaint.setColorLinea(Color.red);
        }
        if(this.jComboBox1.getSelectedIndex()==1){
            this.panelPaint.setColorLinea(Color.blue);
        }
        if(this.jComboBox1.getSelectedIndex()==2){
            this.panelPaint.setColorLinea(Color.GREEN);
        }
    }

}
