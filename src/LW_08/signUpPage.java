package LW_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signUpPage extends JFrame implements ActionListener {

    // Components
    private Container c;
    private JLabel title, nameLabel, emailLabel, genderLabel, dobLabel, passwordLabel;
    private JTextField nameText, emailText;
    private JPasswordField passwordText;
    private JRadioButton male, female;
    private ButtonGroup genderGroup;
    private JComboBox<String> day, month, year;
    private JCheckBox robotCheck;
    private JButton signupBtn, signinBtn1, signinBtn2;
    private JLabel signinLabel, emailLabel2, passwordLabel2;
    private JTextField emailText2;
    private JPasswordField passwordText2;

    private String[] days = { "1","2","3","4","5","6","7","8","9","10",
            "11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30","31" };

    private String[] months = { "January","February","March","April","May","June",
            "July","August","September","October","November","December" };

    private String[] years = { "1985","1986","1987","1988","1989","1990",
            "1991","1992","1993","1994","1995","1996","1997","1998","1999",
            "2000","2001","2002","2003","2004","2005" };

    public signUpPage() {

        setTitle("Registration Form");
        setBounds(400, 100, 450, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        title = new JLabel("Sign Up");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setForeground(Color.BLUE);
        title.setSize(150, 30);
        title.setLocation(150, 20);
        c.add(title);

        // Name
        nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLabel.setSize(100, 20);
        nameLabel.setLocation(50, 70);
        c.add(nameLabel);

        nameText = new JTextField();
        nameText.setFont(new Font("Arial", Font.PLAIN, 15));
        nameText.setSize(200, 20);
        nameText.setLocation(150, 70);
        c.add(nameText);

        // Email
        emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLabel.setSize(100, 20);
        emailLabel.setLocation(50, 110);
        c.add(emailLabel);

        emailText = new JTextField();
        emailText.setFont(new Font("Arial", Font.PLAIN, 15));
        emailText.setSize(200, 20);
        emailText.setLocation(150, 110);
        c.add(emailText);

        // Gender
        genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        genderLabel.setSize(100, 20);
        genderLabel.setLocation(50, 150);
        c.add(genderLabel);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(150, 150);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(230, 150);
        c.add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // DOB
        dobLabel = new JLabel("Birthday");
        dobLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        dobLabel.setSize(100, 20);
        dobLabel.setLocation(50, 190);
        c.add(dobLabel);

        day = new JComboBox<>(days);
        day.setFont(new Font("Arial", Font.PLAIN, 15));
        day.setSize(60, 20);
        day.setLocation(150, 190);
        c.add(day);

        month = new JComboBox<>(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(90, 20);
        month.setLocation(215, 190);
        c.add(month);

        year = new JComboBox<>(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(75, 20);
        year.setLocation(310, 190);
        c.add(year);

        // Password
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordLabel.setSize(100, 20);
        passwordLabel.setLocation(50, 230);
        c.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordText.setSize(200, 20);
        passwordText.setLocation(150, 230);
        c.add(passwordText);

        // Robot Checkbox
        robotCheck = new JCheckBox("I am not a robot.");
        robotCheck.setFont(new Font("Arial", Font.PLAIN, 14));
        robotCheck.setSize(200, 20);
        robotCheck.setLocation(100, 270);
        c.add(robotCheck);

        // Sign Up Button
        signupBtn = new JButton("Sign Up");
        signupBtn.setFont(new Font("Arial", Font.BOLD, 15));
        signupBtn.setBackground(Color.BLUE);
        signupBtn.setForeground(Color.WHITE);
        signupBtn.setSize(280, 25);
        signupBtn.setLocation(50, 310);
        signupBtn.addActionListener(this);
        c.add(signupBtn);

        signinLabel = new JLabel("Sign In");
        signinLabel.setFont(new Font("Arial", Font.BOLD, 18));
        signinLabel.setForeground(Color.BLUE);
        signinLabel.setSize(100, 25);
        signinLabel.setLocation(160, 360);
        c.add(signinLabel);

        emailLabel2 = new JLabel("Email");
        emailLabel2.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLabel2.setSize(100, 20);
        emailLabel2.setLocation(50, 400);
        c.add(emailLabel2);

        emailText2 = new JTextField();
        emailText2.setFont(new Font("Arial", Font.PLAIN, 15));
        emailText2.setSize(200, 20);
        emailText2.setLocation(150, 400);
        c.add(emailText2);

        passwordLabel2 = new JLabel("Password");
        passwordLabel2.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordLabel2.setSize(100, 20);
        passwordLabel2.setLocation(50, 440);
        c.add(passwordLabel2);

        passwordText2 = new JPasswordField();
        passwordText2.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordText2.setSize(200, 20);
        passwordText2.setLocation(150, 440);
        c.add(passwordText2);

        signinBtn2 = new JButton("Sign In");
        signinBtn2.setFont(new Font("Arial", Font.BOLD, 15));
        signinBtn2.setBackground(Color.BLUE);
        signinBtn2.setForeground(Color.WHITE);
        signinBtn2.setSize(280, 25);
        signinBtn2.setLocation(50, 480);
        signinBtn2.addActionListener(this);
        c.add(signinBtn2);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signupBtn) {
            String name = nameText.getText();
            String email = emailText.getText();
            String password = new String(passwordText.getPassword());

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!robotCheck.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please confirm you are not a robot!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(this, "Sign Up Successful!\nWelcome " + name + "!");
        }

        if (e.getSource() == signinBtn2) {
            String email2 = emailText2.getText();
            String password2 = new String(passwordText2.getPassword());

            if (email2.isEmpty() || password2.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Email and Password!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Signed In Successfully!");
            }
        }
    }
}
