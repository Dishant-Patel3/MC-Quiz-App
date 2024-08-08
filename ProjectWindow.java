import javax.swing.JFrame;

public class ProjectWindow extends JFrame {

    public ProjectWindow() {
        setTitle("Quiz Project - Patel");
        setSize(600, 500);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        HomePanel sqr = new HomePanel(this);
        add(sqr);
        setVisible(true);
    }
}