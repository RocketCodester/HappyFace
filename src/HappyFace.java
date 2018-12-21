/* 
   11/11/14
   JDK 1.7
   Draw a happy face
*/
import javax.swing.*;
import java.awt.*;
public class HappyFace extends JComponent {
    JFrame frame = new JFrame("Happy Face");
    Container content = frame.getContentPane();
    public static void main(String[] args) {
        String response = JOptionPane.showInputDialog(null, 
        "Enter: happy, bored, or angry  ");
       String guess = (response);
       HappyFace drawing = new HappyFace();
       drawing.setUp();
    }
    public void setUp(){
        content.setBackground(new Color(131,168,237));
        content.add(this);
        frame.setSize(200,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void paintComponent(Graphics g){
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Happy Face",20,40);
        g.setColor(new Color(204,202,164)); //face color
        g.fillOval(50,75,100,100); //face
        g.setColor(Color.BLACK); //nose color
        g.drawLine(100,110,100,130); //nose
        g.setColor(Color.BLUE); //eye color
        g.drawOval(70,100,12,5); //left eye
        g.drawOval(110,100,12,5); //right eye
        g.setColor(Color.RED); //smile color
        g.drawArc(70,95,60,60,225,90); //smile
    }
}