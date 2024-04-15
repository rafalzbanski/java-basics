package inz;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GoldPriceChart extends JPanel implements Runnable {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int POINTS = 300;
    private static final int INTERVAL = 300; // milliseconds
    private static final int MAX_PRICE = 2000; // Maximum price of gold
    private static final int MIN_PRICE = 1000; // Minimum price of gold

    private int[] prices;
    private Random random;

    public GoldPriceChart() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        prices = new int[POINTS];
        random = new Random();
        for (int i = 0; i < POINTS; i++) {
            prices[i] = random.nextInt(MAX_PRICE - MIN_PRICE + 1) + MIN_PRICE;
        }
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawChart(g);
    }

    private void drawChart(Graphics g) {
        int dx = WIDTH / POINTS;
        int dy = HEIGHT / (MAX_PRICE - MIN_PRICE);

        for (int i = 1; i < POINTS; i++) {
            int x1 = (i - 1) * dx;
            int y1 = HEIGHT - (prices[i - 1] - MIN_PRICE) * dy;
            int x2 = i * dx;
            int y2 = HEIGHT - (prices[i] - MIN_PRICE) * dy;
            g.drawLine(x1, y1, x2, y2);
        }
    }

    private void updateData() {
        for (int i = 0; i < POINTS - 1; i++) {
            prices[i] = prices[i + 1];
        }
        prices[POINTS - 1] = random.nextInt(MAX_PRICE - MIN_PRICE + 1) + MIN_PRICE;
        repaint();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(INTERVAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            updateData();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gold Price Chart");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new GoldPriceChart());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

