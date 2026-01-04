package LW_09;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Home extends JFrame {

    private JButton btnBack;

    public Home() {
        setTitle("Home");
        setSize(450, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel background = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(
                        0, 0, new Color(120, 115, 245),
                        0, getHeight(), new Color(160, 140, 255)
                );
                g2.setPaint(gp);
                g2.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        background.setLayout(new GridBagLayout());
        add(background);


        JPanel card = new JPanel();
        card.setBackground(Color.WHITE);
        card.setPreferredSize(new Dimension(330, 220));
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(new EmptyBorder(25, 25, 25, 25));

        background.add(card);


        JLabel welcome = new JLabel("Welcome 🎉");
        welcome.setFont(new Font("Segoe UI", Font.BOLD, 26));
        welcome.setForeground(new Color(90, 80, 220));
        welcome.setAlignmentX(Component.CENTER_ALIGNMENT);
        card.add(welcome);

        JLabel subtitle = new JLabel("You have successfully logged in");
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        subtitle.setForeground(Color.GRAY);
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        card.add(subtitle);

        card.add(Box.createVerticalStrut(30));


        btnBack = new JButton("LOG OUT");
        btnBack.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnBack.setFocusPainted(false);
        btnBack.setBackground(new Color(120, 115, 245));
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnBack.setPreferredSize(new Dimension(180, 45));
        btnBack.setMaximumSize(new Dimension(180, 45));

        card.add(btnBack);

        btnBack.addActionListener(e -> {
            new SignUp();
            dispose();
        });

        setVisible(true);
    }
}
