package Bank.Mangment.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    //global variables;
    private final JButton clear;
    private final JButton signIn;
    private final JButton signUp;
    private final JPasswordField pinNumberFeild;
    private final JTextField cardTextField;
    private final JButton eyeLable;

    Login() {//Login Frame

        setLayout(null);
        setTitle("User Login");

        //image Resources and customization.
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image image = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        i = new ImageIcon(image);
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/eye-fill.jpg"));
        Image image2 = i2.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        i2 = new ImageIcon(image2);
        //ImageLabel
        JLabel lable = new JLabel(i);
        lable.setBounds(70, 10, 100, 100);
        eyeLable = new JButton(i2);//Button
        eyeLable.setBounds(482, 225, 30, 30);
        add(eyeLable);
        add(lable);

        //TextLabel
        JLabel wecomeText = new JLabel("Welcome to ATM");
        wecomeText.setBounds(180, 50, 400, 40);
        wecomeText.setFont(new Font("Ostwald", Font.BOLD, 38));
        add(wecomeText);

        JLabel carNumberText = new JLabel("Card Number :");
        carNumberText.setBounds(70, 150, 300, 40);
        carNumberText.setFont(new Font("Railway", Font.BOLD, 22));
        add(carNumberText);

        JLabel panText = new JLabel("PIN :");
        panText.setBounds(70, 220, 300, 40);
        panText.setFont(new Font("Railway", Font.BOLD, 22));
        add(panText);

        //textFeilds
        cardTextField = new JTextField();
        cardTextField.setBounds(280, 155, 200, 30);
        cardTextField.setFont(new Font("RailWay", Font.PLAIN, 16));
        add(cardTextField);

        pinNumberFeild = new JPasswordField();
        pinNumberFeild.setBounds(280, 225, 200, 30);
        pinNumberFeild.setFont(new Font("Railways", Font.PLAIN, 16));
        add(pinNumberFeild);

        //Buttons

        signIn = new JButton("SIGN IN");
        signIn.setBounds(280, 300, 90, 40);
        signIn.setForeground(Color.WHITE);
        signIn.setBackground(Color.BLACK);
        signIn.addActionListener(this);
        add(signIn);

        eyeLable.addActionListener(this);

        clear = new JButton("CLEAR");
        clear.setBounds(390, 300, 90, 40);
        clear.setForeground(Color.WHITE);
        clear.setBackground(Color.black);
        clear.addActionListener(this);
        add(clear);

        signUp = new JButton("Sign Up");
        signUp.setBounds(280, 350, 200, 40);
        signUp.setForeground(Color.WHITE);
        signUp.setBackground(Color.black);
        signUp.addActionListener(this);
        add(signUp);

        //FrameSettings
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);

    }

    public static void main(String[] args) {
        new Login().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            this.cardTextField.setText("");
            this.pinNumberFeild.setText("");
        }
        if(e.getSource()==eyeLable){
            if (pinNumberFeild.getEchoChar()!='•'){
                this.pinNumberFeild.setEchoChar('•');
            }
            else this.pinNumberFeild.setEchoChar((char)0);
        }
    }
}