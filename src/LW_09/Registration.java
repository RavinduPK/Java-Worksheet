package LW_09;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Registration extends JFrame {

    private JTextField txtUser, txtEmail;
    private JPasswordField txtPass;
    private JButton btnRegister;

    public Registration() {
        setTitle("Create Account");
        setSize(420, 520);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ===== Main Gradient Panel =====
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

        // ===== Card Panel =====
        JPanel card = new JPanel();
        card.setBackground(Color.WHITE);
        card.setPreferredSize(new Dimension(320, 380));
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(new EmptyBorder(30, 25, 30, 25));

        background.add(card);

        // ===== Title =====
        JLabel title = new JLabel("Register");
        title.setFont(new Font("Segoe UI", Font.BOLD, 26));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setForeground(new Color(90, 80, 220));
        card.add(title);

        card.add(Box.createVerticalStrut(25));

        // ===== Username =====
        card.add(createLabel("Username"));
        txtUser = createTextField();
        card.add(txtUser);

        // ===== Email =====
        card.add(createLabel("Email"));
        txtEmail = createTextField();
        card.add(txtEmail);

        // ===== Password =====
        card.add(createLabel("Password"));
        txtPass = new JPasswordField();
        txtPass.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        txtPass.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        card.add(txtPass);

        card.add(Box.createVerticalStrut(25));


        btnRegister = new JButton("CREATE ACCOUNT");
        btnRegister.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnRegister.setFocusPainted(false);
        btnRegister.setBackground(new Color(120, 115, 245));
        btnRegister.setForeground(Color.WHITE);
        btnRegister.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnRegister.setPreferredSize(new Dimension(200, 45));
        btnRegister.setMaximumSize(new Dimension(200, 45));

        card.add(btnRegister);

        btnRegister.addActionListener(e -> registerUser());

        setVisible(true);
    }


    private JLabel createLabel(String text) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lbl.setForeground(Color.DARK_GRAY);
        lbl.setAlignmentX(Component.LEFT_ALIGNMENT);
        lbl.setBorder(new EmptyBorder(8, 0, 4, 0));
        return lbl;
    }

    private JTextField createTextField() {
        JTextField txt = new JTextField();
        txt.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        txt.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        return txt;
    }


    private void registerUser() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO users(username, password, email) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, txtUser.getText());
            ps.setString(2, new String(txtPass.getPassword()));
            ps.setString(3, txtEmail.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                    this,
                    "Registration Successful!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Registration();
    }
}
