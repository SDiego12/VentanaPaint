/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_0602.vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author MSI
 */
public class PanelPaint extends JPanel implements MouseListener {

    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;
    private Color colorLinea = Color.BLACK;

    public PanelPaint() {
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(280, 20, 40, 40);
        g.drawLine( 200, 100, 400, 110);
        g.setColor(this.colorLinea);
        g.drawLine(this.x1, this.y1, this.x2, this.y2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
    ArrayList<Point> lista = new ArrayList<Point>();
    @Override
    public void mousePressed(MouseEvent e) {
        Graphics g= this.getGraphics();
        
        g.drawRect(e.getX(), e.getY(), 1, 1);
        
        lista.add(new Point  (e.getX(), e.getY()));
        
        if (lista.size()>1){
            g.drawLine(lista.get(lista.size()-1).x,lista.get(lista.size()-1).y ,lista.get(lista.size()-2).x,lista.get(lista.size()-2).y);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //   JOptionPane.showMessageDialog(this, e.getPoint());
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

}