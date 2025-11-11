package LW_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {

    // Components
    private Container c;
    private JLabel title, nameLabel, mobileLabel, genderLabel, dobLabel, addressLabel;
    private JTextField nameText, mobileText;
    private JRadioButton male, female;
    private ButtonGroup genderGroup;
    private JComboBox<String> day, month, year;
    private JTextArea addressText, output;
    private JCheckBox terms;
    private JButton submit, reset;
    private JLabel resLabel;

    // Data for combo boxes
    private String[] days = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

    private String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    private String[] years = { "1990", "1991", "1992", "1993", "1994", "1995",
            "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
            "2005", "2006", "2007", "2008", "2009", "2010" };

    // Constructor
    public RegistrationForm() {
        setTitle("Registration Form");
        setBounds(300, 90, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        // Title
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        title.setSize(300, 30);
        title.setLocation(250, 30);
        c.add(title);

        // Name
        nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        nameLabel.setSize(100, 20);
        nameLabel.setLocation(100, 100);
        c.add(nameLabel);

        nameText = new JTextField();
        nameText.setFont(new Font("Arial", Font.PLAIN, 15));
        nameText.setSize(190, 20);
        nameText.setLocation(200, 100);
        c.add(nameText);

        // Mobile
        mobileLabel = new JLabel("Mobile");
        mobileLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        mobileLabel.setSize(100, 20);
        mobileLabel.setLocation(100, 150);
        c.add(mobileLabel);

        mobileText = new JTextField();
        mobileText.setFont(new Font("Arial", Font.PLAIN, 15));
        mobileText.setSize(190, 20);
        mobileText.setLocation(200, 150);
        c.add(mobileText);

        // Gender
        genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        genderLabel.setSize(100, 20);
        genderLabel.setLocation(100, 200);
        c.add(genderLabel);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // DOB
        dobLabel = new JLabel("DOB");
        dobLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        dobLabel.setSize(100, 20);
        dobLabel.setLocation(100, 250);
        c.add(dobLabel);

        day = new JComboBox<>(days);
        day.setFont(new Font("Arial", Font.PLAIN, 15));
        day.setSize(60, 20);
        day.setLocation(200, 250);
        c.add(day);

        month = new JComboBox<>(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(90, 20);
        month.setLocation(270, 250);
        c.add(month);

        year = new JComboBox<>(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(80, 20);
        year.setLocation(370, 250);
        c.add(year);

        // Address
        addressLabel = new JLabel("Address");
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        addressLabel.setSize(100, 20);
        addressLabel.setLocation(100, 300);
        c.add(addressLabel);

        addressText = new JTextArea();
        addressText.setFont(new Font("Arial", Font.PLAIN, 15));
        addressText.setSize(200, 75);
        addressText.setLocation(200, 300);
        addressText.setLineWrap(true);
        c.add(addressText);

        // Terms checkbox
        terms = new JCheckBox("Accept Terms And Conditions.");
        terms.setFont(new Font("Arial", Font.PLAIN, 15));
        terms.setSize(250, 20);
        terms.setLocation(150, 400);
        c.add(terms);

        // Buttons
        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(100, 20);
        submit.setLocation(150, 450);
        submit.addActionListener(this);
        c.add(submit);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        // Output box
        output = new JTextArea();
        output.setFont(new Font("Arial", Font.PLAIN, 15));
        output.setSize(300, 350);
        output.setLocation(500, 100);
        output.setLineWrap(true);
        output.setEditable(false);
        c.add(output);

        resLabel = new JLabel("");
        resLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        resLabel.setSize(500, 25);
        resLabel.setLocation(150, 500);
        c.add(resLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            if (terms.isSelected()) {
                String data1 = "Name : " + nameText.getText() + "\n" +
                        "Mobile : " + mobileText.getText() + "\n" +
                        "Gender : " + (male.isSelected() ? "Male" : "Female") + "\n";
                String data2 = "DOB : " + day.getSelectedItem() + " "
                        + month.getSelectedItem() + " " + year.getSelectedItem() + "\n";
                String data3 = "Address : " + addressText.getText() + "\n";

                output.setText(data1 + data2 + data3);
                resLabel.setText("Registration Successfully..");
            } else {
                output.setText("");
                resLabel.setText("Please accept the terms & conditions.");
            }
        } else if (e.getSource() == reset) {
            String def = "";
            nameText.setText(def);
            mobileText.setText(def);
            addressText.setText(def);
            resLabel.setText(def);
            output.setText(def);
            terms.setSelected(false);
            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            male.setSelected(true);
        }
    }
}

