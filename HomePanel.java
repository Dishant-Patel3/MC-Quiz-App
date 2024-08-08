import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class HomePanel extends JPanel {
    JLabel label =new JLabel("Patel's Quiz and Greatness");
    JLabel label1 =new JLabel("_______________________________________");
    JLabel label4 =new JLabel("____________________________");
    JTextArea label2 = new JTextArea("");
    JTextArea label7 = new JTextArea("");
    JLabel label5 = new JLabel("");
    JLabel label3 = new JLabel("");
    JLabel ans1 = new JLabel("");
    JLabel ans2 = new JLabel("");
    JLabel ans3 = new JLabel("");
    JLabel ans4 = new JLabel("");
    JOptionPane pop = new JOptionPane();
    JRadioButton choice1 = new JRadioButton();
    JRadioButton choice2 = new JRadioButton();
    JRadioButton choice3 = new JRadioButton();
    JRadioButton choice4 = new JRadioButton();
    ButtonGroup group = new ButtonGroup();
    JButton button3 = new JButton("Start");
    JButton button1 = new JButton("Check");
    JButton button2 = new JButton("Next");
    JButton button4 = new JButton("New Game");
    JButton button5 = new JButton("Close");
    Color c = new Color(Color.HSBtoRGB((float) Math.random(), (float) Math.random(), 0.5F + ((float) Math.random())/2F));
    String[][] qa = {
    {"What are the 3 primitive data types?", "Int, double, boolean", "String, number, double", "Integer, String, Boolean", "Double, int, length"}, 
    {"Type of logic operator that requires both sides of\nthe expression to be true?", "&&","||","or","*="}, 
    {"Type of method that returns a value that is the\nsame type as the signature? ", "Non - void","Method a","Null","Static"}, 
    {"What is true about the size of array?", "Cannot be changed after establish","Can be changed everytime","Doubles after every change","Reduces its size after change"}, 
    {"Method that changes the value of instance variables?", "Mutator","Static","Void","Accessor"},
    {"ArrayList<String> Kids = new ArrayList<String>()\nkids.add(\"Teay\")\nWhat is the purpose to use add(\"Teay\")?", "To add item at end of list","To replace item with previous item","To remove the previous item","To print the item at the spot"},
    {"for(int x = 0; x < array.length; x++)\n   for(int y = 0; y < array[x].length; y++)\n      System.out.println(array[x][y]);\nWhat type of 2d array order is shown?", "Row-major order","X-major order","Column-major order","Y-major order"}, 
    {"Public class Square extends Rectangle\nWhat is the meaning of this code?", "Square is a rectangle","Square is a new class","Rectangle is created","Square is a class in Rectangle"}, 
    {"What compound assignment can be used for\nx = x + 1?", "+=","^=","=+","!="}, 
    {"What expression values can be comapared using\nrelational operators(<,>)?", "Arithemetic","Primitive","Reference","Conditional"}, 
    {"While(x < 3)\n   System.out.println(\"Hi\");\nWhat is a problem with this code?", "Infinite loop","Does not excute","It's Nested incorrectly","Excutes perfectly"}, 
    {"In Array[x][y], what are the two brackets\nequivalent too?", "x = rows, y = cols","x = int, y = string","x = y, y = x","x = list, y = size"},
    {"Which of these is a problem using Recursion?", "If it calls itselfs infinite times","It needs a class to excute","Not compatible with java","Only calls if type is Int"},
    {"Public int getKid()\n   return kid;\nWhat type of method is this?", "Accessor","Class","Void","Mutator"},
    {"What is the correct declaration of ArrayList?", "ArrayList<Double> words = new ArrayList<Double>();","ArrayList[] kids;","ArrayList kids = new ArrayList;","ArrayList<Double> words = new ArrayList();"},
    {"What does using the key word \"Super\" do?", "Calls the constructor superclass","Create a new subclass","Extend a class to subclass","Calls a superclass"},
    {"Int[ ] arr = {3,1,0,4,2};\nfor(int x = 0; x < arr.length; x++)\n   System.out.print(arr[x] + x);\nWhat is the output of this code?", "32276","31042","72362","62074"}, 
    {"What is a example of Nested loops?", "A for loop inside for loop","It statement inside a for loop","for loop inside a method","while loop inside a if statement"}, 
    {"What is so unique about Recursion?", "Method that calls itself", "Class that is null", "Method that is empty", "Constructor with 5 methods"},
    {"Type of parameter in which a value is passed\ninto a construtor?", "Actual Parameter","Signature Paramter","Formal Parameter","Class Parameter"}, };
    int q;
    int index;
    int score;
    int rand = 0;
    private ProjectWindow win;
    public HomePanel(ProjectWindow project) {
        win = project;
        setLayout(null);
        setSize(800, 500);
        setBounds(0, 0, 600, 500);
        setBackground(new Color(0,204,204));
        setBorder(getBorder());
        label.setBounds(160, 0, 500, 50);
        label.setFont(new Font("Sonsie One", Font.BOLD, 21));
        label.setForeground(Color.BLACK);
        label1.setBounds(160, 15, 500, 30);
        label1.setForeground(Color.BLACK);
        label4.setBounds(190, 105, 500, 30);
        label4.setForeground(Color.BLACK);
        label2.setBounds(100, 70, 500, 100);
        label2.setFont(new Font("Roboto Serif", Font.BOLD, 18));
        label2.setForeground(Color.BLACK);
        label7.setBounds(210, 200, 500, 100);
        label7.setFont(new Font("Roboto Serif", Font.BOLD, 21));
        label7.setForeground(Color.BLACK);
        label3.setBounds(40, 70, 50, 50);
        label3.setBorder(BorderFactory. createLineBorder(Color.BLACK,5));
        label3.setFont(new Font("Sonsie One", Font.BOLD, 18));
        label3.setForeground(Color.BLACK);
        button3.setBounds(250, 350, 100, 100);
        button3.setFont(new Font("Arial", Font.BOLD, 25));
        button4.setBounds(160, 350, 100, 80);
        button4.setFont(new Font("Arial", Font.BOLD, 10));
        button5.setBounds(310, 350, 100, 80);
        button5.setFont(new Font("Arial", Font.BOLD, 18));
        ans1.setBounds(130, 190, 300, 30);
        ans1.setForeground(Color.BLACK);
        ans2.setBounds(130, 230, 300, 30);
        ans2.setForeground(Color.BLACK);
        ans3.setBounds(130, 270, 300, 30);
        ans3.setForeground(Color.BLACK);
        ans4.setBounds(130, 310, 300, 30);
        ans4.setForeground(Color.BLACK);
        choice1.setBounds(100, 195, 20, 20);
        choice2.setBounds(100, 235, 20, 20);
        choice3.setBounds(100, 275, 20, 20);
        choice4.setBounds(100, 315, 20, 20);
        button1.setBounds(450, 400, 100, 30);
        button2.setBounds(450, 400, 100, 30);
        group.add(choice1);
        group.add(choice2);
        group.add(choice3);
        group.add(choice4);
        add(label);
        add(label1);
        add(button3);
        
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                q = 0;
                index = 0;
                score = 0;
                button3.setVisible(false);
                setBackground(c);
                add(button1);
                add(button2);
                add(label2);
                add(label3);
                add(ans1);
                add(ans2);
                add(ans3);
                add(ans4);
                add(choice1);
                add(choice2);
                add(choice3);
                add(choice4);
                ans1.setBounds(130, 190, 300, 30);
                ans2.setBounds(130, 230, 300, 30);
                ans3.setBounds(130, 270, 300, 30);
                ans4.setBounds(130, 310, 300, 30);
                choice1.setBounds(100, 195, 20, 20);
                choice2.setBounds(100, 235, 20, 20);
                choice3.setBounds(100, 275, 20, 20);
                choice4.setBounds(100, 315, 20, 20);
                button1.setBounds(450, 400, 100, 30);
                label2.setBackground(c);
                rand = new Random().nextInt(qa.length);
                label2.setText(qa[index][0]);
                label3.setText("   " + (q + 1));
                ans1.setText(qa[index][1]);
                ans2.setText(qa[index][2]);
                ans3.setText(qa[index][3]);
                ans4.setText(qa[index][4]);
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (choice1.isSelected() == true) {
                    JOptionPane.showMessageDialog(null, "CORRECT");
                    score++;
                } else if(choice2.isSelected() == true) {
                    JOptionPane.showInternalMessageDialog(null, "INCORRECT");
                } else if(choice3.isSelected() == true) {
                    JOptionPane.showInternalMessageDialog(null, "INCORRECT");
                } else if(choice4.isSelected() == true) {
                    JOptionPane.showInternalMessageDialog(null, "INCORRECT");
                } else {
                    JOptionPane.showInternalMessageDialog(null, "PLEASE ANSWER");
                }
                if(q <=18) {
                    button1.setBounds(0, 0, 0, 0);
                    button2.setBounds(450, 400, 100, 30);
                } else {
                    button1.setBounds(0, 0, 0, 0);
                    button2.setBounds(400, 380, 150, 50); 
                    button2.setText("Score");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c = new Color(Color.HSBtoRGB((float) Math.random(), (float) Math.random(), 0.5F + ((float) Math.random())/2F));
                setBackground(c);
                setLay();
            }   
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label5.setVisible(false);
                label7.setVisible(false);
                label4.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                button3.setVisible(true);
                group.clearSelection();
                button2.setBounds(450, 400, 100, 30); 
                button2.setText("Next");
            }   
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                win.dispose();
            }   
        });
    }
    public void setLay() {
        q++;
        if(q <= 19) {
            index++;
            label2.setBackground(c);
            rand = new Random().nextInt(qa.length);
            label2.setText(qa[index][0]);
            if(q <= 8) {
                label3.setText("   " + (q+1));
            } else {
                label3.setText("  " + (q+1));
            }
            ans1.setText(qa[index][1]);
            ans2.setText(qa[index][2]);
            ans3.setText(qa[index][3]);
            ans4.setText(qa[index][4]);
            group.clearSelection();
            button2.setBounds(0, 0, 0, 0);
            button1.setBounds(450, 400, 100, 30);
            if(qa[index] == qa[1] || qa[index] == qa[3] || qa[index] == qa[7] || qa[index] == qa[19]) { 
                ans1.setBounds(130, 230, 300, 30);
                ans2.setBounds(130, 270, 300, 30);
                ans3.setBounds(130, 310, 300, 30);
                ans4.setBounds(130, 190, 300, 30);
                choice1.setBounds(100, 235, 20, 20);
                choice2.setBounds(100, 275, 20, 20);
                choice3.setBounds(100, 315, 20, 20);
                choice4.setBounds(100, 195, 20, 20);
            } else if(qa[index] == qa[2] || qa[index] == qa[16] || qa[index] == qa[8] || qa[index] == qa[9]) { 
                ans1.setBounds(130, 310, 300, 30);
                ans2.setBounds(130, 230, 300, 30);
                ans3.setBounds(130, 190, 300, 30);
                ans4.setBounds(130, 270, 300, 30);
                choice1.setBounds(100, 315, 20, 20);
                choice2.setBounds(100, 235, 20, 20);
                choice3.setBounds(100, 195, 20, 20);
                choice4.setBounds(100, 275, 20, 20);
            } else if(qa[index] == qa[4] || qa[index] == qa[11] || qa[index] == qa[14] || qa[index] == qa[18]) {
                ans1.setBounds(130, 270, 300, 30);
                ans2.setBounds(130, 190, 300, 30);
                ans3.setBounds(130, 230, 300, 30);
                ans4.setBounds(130, 310, 300, 30);
                choice1.setBounds(100, 275, 20, 20);
                choice2.setBounds(100, 195, 20, 20);
                choice3.setBounds(100, 235, 20, 20);
                choice4.setBounds(100, 315, 20, 20);
            } else if(qa[index] == qa[6] || qa[index] == qa[12] || qa[index] == qa[17] || qa[index] == qa[10]) {
                ans1.setBounds(130, 190, 300, 30);
                ans2.setBounds(130, 230, 300, 30);
                ans3.setBounds(130, 270, 300, 30);
                ans4.setBounds(130, 310, 300, 30);
                choice1.setBounds(100, 195, 20, 20);
                choice2.setBounds(100, 235, 20, 20);
                choice3.setBounds(100, 275, 20, 20);
                choice4.setBounds(100, 315, 20, 20);
            } else {
                ans1.setBounds(130, 190, 300, 30);
                ans2.setBounds(130, 230, 300, 30);
                ans3.setBounds(130, 270, 300, 30);
                ans4.setBounds(130, 310, 300, 30);
                choice1.setBounds(100, 195, 20, 20);
                choice2.setBounds(100, 235, 20, 20);
                choice3.setBounds(100, 275, 20, 20);
                choice4.setBounds(100, 315, 20, 20);
            }
        } else {
            setBackground(new Color(0,204,204));
            remove(ans1);
            remove(ans2);
            remove(ans3);
            remove(ans4);
            remove(choice1);
            remove(choice2);
            remove(choice3);
            remove(choice4);
            remove(label3);
            remove(button2);
            remove(label2);
            label5.setVisible(true);
            label7.setVisible(true);
            label4.setVisible(true);
            button4.setVisible(true);
            button5.setVisible(true);
            if(score < 14) { 
                label5.setBounds(200, 90, 300, 30);
                label5.setText("Need Some Work!!");
                label5.setFont(new Font("Merriweather", Font.BOLD, 20));
                label5.setForeground(Color.RED);
                label7.setBackground(new Color(0,204,204));
                label7.setText("        Score:\n\n " + score + " / 20  =  " + (score*5) + "%");
                add(label5);
                add(label4);
                add(label7);
                add(button4);
                add(button5);
            } else if(score >= 14 && score <= 16) {
                label5.setBounds(205, 90, 300, 30);
                label5.setText("YAY, You Passed.");
                label5.setFont(new Font("Oswald", Font.BOLD, 20));
                label5.setForeground(Color.ORANGE);
                label7.setBackground(new Color(0,204,204));
                label7.setText("       Score:\n\n " + score + " / 20  =  " + (score*5) + "%");
                add(label7); 
                add(label5);
                add(label4);
                add(button4);
                add(button5);
            } else if(score >= 17 && score <= 19 ) { 
                label5.setBounds(175, 90, 300, 30);
                label5.setText("Amazing, Wonderful Job!");
                label5.setFont(new Font("Noto Serif", Font.BOLD, 20));
                label5.setForeground(Color.MAGENTA);
                label7.setBackground(new Color(0,204,204));
                label7.setText("       Score:\n\n " + score + " / 20  =  " + (score*5) + "%");
                add(label7);
                add(label5);
                add(label4);
                add(button4);
                add(button5);
            } else if(score == 20) {
                label5.setBounds(155 , 90, 300, 30);
                label5.setText("Your a Genius to the Society!!!");
                label5.setFont(new Font("Smooch Sans", Font.BOLD, 20));
                label5.setForeground(new Color(0,51,102));
                label4.setText("_______________________________________");
                label4.setBounds(165, 105, 500, 30);
                label7.setBackground(new Color(0,204,204));
                label7.setText("       Score:\n\n " + score + " / 20  =  " + (score*5) + "%");
                add(label7);
                add(label5);
                add(label4);
                add(button4);
                add(button5);
            } 
        }
    }
}