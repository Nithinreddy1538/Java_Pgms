import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistrationForm extends JFrame implements ActionListener {

    // Components
    private JTextField nameField, emailField;
    private JRadioButton maleBtn, femaleBtn;
    private JCheckBox javaCheck, pythonCheck, cppCheck;
    private JTextArea addressArea;
    private JButton submitBtn;
    private ButtonGroup genderGroup;   // ✅ semicolon fixed

    public UserRegistrationForm() {

        // Frame Settings
        setTitle("User Registration Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1, 10, 10));

        // 1. Name Panel
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(new JLabel("Name: "));
        nameField = new JTextField(20);
        namePanel.add(nameField);

        // 2. Email Panel
        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        emailPanel.add(new JLabel("Email ID: "));
        emailField = new JTextField(20);
        emailPanel.add(emailField);

        // 3. Gender Panel
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(new JLabel("Gender: "));
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);
        genderPanel.add(maleBtn);
        genderPanel.add(femaleBtn);

        // 4. Languages Panel
        JPanel langPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        langPanel.add(new JLabel("Languages: "));
        javaCheck = new JCheckBox("Java");
        pythonCheck = new JCheckBox("Python");
        cppCheck = new JCheckBox("C++");
        langPanel.add(javaCheck);
        langPanel.add(pythonCheck);
        langPanel.add(cppCheck);

        // 5. Address Panel
        JPanel addressPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        addressPanel.add(new JLabel("Address: "));
        addressArea = new JTextArea(3, 20);
        addressPanel.add(new JScrollPane(addressArea));

        // 6. Submit Button
        submitBtn = new JButton("Submit");
        submitBtn.addActionListener(this);

        // Add panels to frame
        add(namePanel);
        add(emailPanel);
        add(genderPanel);
        add(langPanel);
        add(addressPanel);
        add(submitBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String email = emailField.getText();
        String gender = maleBtn.isSelected() ? "Male"
                        : femaleBtn.isSelected() ? "Female"
                        : "Not Selected";

        StringBuilder languages = new StringBuilder();
        if (javaCheck.isSelected()) languages.append("Java ");
        if (pythonCheck.isSelected()) languages.append("Python ");
        if (cppCheck.isSelected()) languages.append("C++ ");

        String address = addressArea.getText();

        String message = "Registration Details:\n\n"
                + "Name: " + name + "\n"
                + "Email: " + email + "\n"
                + "Gender: " + gender + "\n"
                + "Languages: " + languages.toString() + "\n"
                + "Address: " + address;

        JOptionPane.showMessageDialog(this, message,
                "Submission Successful", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new UserRegistrationForm();
    }
}
