package Bank.Mangment.System;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
public class SignUp1 extends JFrame {
    Random r = new Random();
    private final int applicationNo = r.nextInt(999,9999);
    SignUp1(){
        setLayout(null);
        //images
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image imageSettings = image.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        image = new ImageIcon(imageSettings);
        JLabel lable = new JLabel(image);
        lable.setBounds(20,20,100,100);
        add(lable);

        //Lables
        int yStart = 90; // Starting Y position for labels in the column
        int yGap = 55; // Vertical gap between labels

        JLabel pageInfo = new JLabel("Page 1: Personal Info");
        pageInfo.setBounds(125,50,400,100);
        pageInfo.setFont(new Font("Railway",Font.BOLD,22));
        add(pageInfo);

        addLabelInfo("Application Number:", applicationNo);

        addLabel("Name:", yStart + yGap);
        addLabel("Father's Name:",yStart + 2 * yGap);
        addLabel("Mother's Name:", yStart + 3 * yGap);
        addLabel("Date Of Birth:", yStart + 4 * yGap);
        addLabel("Gender:",  yStart + 5 * yGap);
        addLabel("EmailId:", yStart + 6 * yGap);
        addLabel("Marital Status:", yStart + 7 * yGap);
        addLabel("Address:",  yStart + 8 * yGap);
        addLabel("City:",  yStart + 9 * yGap);
        addLabel("Pin/Zip code:",  yStart + 10 * yGap);

        //Text Fields
        yStart = 105;
        for (int i = 1;i<=10;i++){
            if (i==4){
                addDob(yStart+yGap*i);;
            } else if (i==5) {
                continue;
            } else if (i==7) {
                continue;
            }
            else addTextField(yStart+yGap*i);
        }

        //JFrame settings
        setSize(700,780);
        setResizable(false);
        setVisible(true);
        setLocation(350,10);
        getContentPane().setBackground(Color.white);
    }

    private void addLabelInfo(String s, int applicationNo) {
        JLabel forNumberText = new JLabel("Application Number :"+applicationNo);
        forNumberText.setBounds(125,20,450,100);
        forNumberText.setFont(new Font("Ostwald",Font.BOLD,35));
        add(forNumberText);
    }
    private void addLabel(String s, int yStart) {
        JLabel lable = new JLabel();
        lable.setBounds(40,yStart,200,50);
        lable.setText(s);
        lable.setFont(new Font("Railway",Font.BOLD,16));
        add(lable);
    }
    private void addTextField(int yStart){
        JTextField textField = new JTextField();
        textField.setBounds(240,yStart,200,30);
        textField.setFont(new Font("Railway",Font.PLAIN,16));
        add(textField);
    }
    private void addRadioButtons(int yStart,String s){

    }
    private void addDob(int yStart){
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(240,yStart,200,30);
        dateChooser.setForeground(Color.BLACK);
        dateChooser.setFont(new Font("Railway",Font.PLAIN,16));
        add(dateChooser);
    }
    public static void main(String[] args) {
        new SignUp1().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
