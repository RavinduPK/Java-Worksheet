package LW_10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Q1_to_Q4 extends JFrame {

    public Q1_to_Q4() {
        setTitle("Lab Worksheet 10 - GUI");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");


        openItem.setEnabled(false);


        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);


        String[] columnNames = {"Name", "ID", "Marks"};

        Object[][] data = {
                {"Amal", "CS/2022/020", 85},
                {"Nimali", "ET/2022/014", 77},
                {"Kamal", "CT/2022/011", 92}
        };


        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // makes JTable non-editable
            }
        };

        JTable table = new JTable(model);


        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane scrollPane = new JScrollPane(table);


        add(scrollPane, BorderLayout.CENTER);


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        JButton btnSave = new JButton("Save");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");

        buttonPanel.add(btnSave);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);


        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q1_to_Q4();
    }
}
