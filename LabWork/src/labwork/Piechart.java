package labwork;

import javax.swing.*;
import java.awt.*;

public class Piechart extends JPanel {
     private int[] data;

    public Piechart(int[] data) {
        this.data = data;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);      
        drawPiechart(g);
    }

    private void drawPiechart(Graphics g) {
        int total = 0;
        for (int value : data) {
            total += value;
        }

        int startAngle = 0;
        for (int i = 0; i < data.length; i++) {
            int arcAngle = (int) Math.round(360.0 * data[i] / total);
            g.setColor(getColor(i));
            g.fillArc(50, 50, 200, 200, startAngle, arcAngle);
            startAngle += arcAngle;
        }
    }
    private Color getColor(int index) {
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK};
        return colors[index % colors.length];
    }
    public static void main(String[] args) {
        int[] data = {30, 20, 15, 10, 25}; // Sample data (values representing the different sections of the pie chart)
        
            JFrame frame = new JFrame("Pie Chart");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.add(new Piechart(data));
            frame.setVisible(true);
    }}
