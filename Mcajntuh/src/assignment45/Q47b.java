package assignment45;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Q47b extends JFrame {
    private JPanel drawingPanel;
    private JButton lineButton, rectangleButton, ovalButton;
    private int startX, startY, endX, endY;
    private Shape currentShape = Shape.LINE;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q47b().setVisible(true));
    }

    public Q47b() {
        setTitle("Drawing App");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        drawingPanel = new JPanel();
        drawingPanel.setBackground(Color.WHITE);
        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                endX = e.getX();
                endY = e.getY();
                drawingPanel.repaint();
            }
        });

        lineButton = new JButton("Line");
        rectangleButton = new JButton("Rectangle");
        ovalButton = new JButton("Oval");

        lineButton.addActionListener(new ShapeButtonListener(Shape.LINE));
        rectangleButton.addActionListener(new ShapeButtonListener(Shape.RECTANGLE));
        ovalButton.addActionListener(new ShapeButtonListener(Shape.OVAL));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(lineButton);
        buttonPanel.add(rectangleButton);
        buttonPanel.add(ovalButton);

        add(drawingPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private enum Shape { LINE, RECTANGLE, OVAL }

    private class ShapeButtonListener implements ActionListener {
        private Shape shape;

        public ShapeButtonListener(Shape shape) {
            this.shape = shape;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            currentShape = shape;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        switch (currentShape) {
            case LINE:
                g.drawLine(startX, startY, endX, endY);
                break;
            case RECTANGLE:
                int width = Math.abs(endX - startX);
                int height = Math.abs(endY - startY);
                int x = Math.min(startX, endX);
                int y = Math.min(startY, endY);
                g.drawRect(x, y, width, height);
                break;
            case OVAL:
                width = Math.abs(endX - startX);
                height = Math.abs(endY - startY);
                x = Math.min(startX, endX);
                y = Math.min(startY, endY);
                g.drawOval(x, y, width, height);
                break;
        }
    }
}

