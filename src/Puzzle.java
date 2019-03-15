import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Puzzle implements  ActionListener{

    private int width=570,height = 380;
    private JFrame f = new JFrame("Puzzle game");
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,b22,b33,b44,b55,b66,b77,b88,b99;
    private JPanel jp;
    private JLabel lable1, label2;

    Puzzle()
    {
        lable1 =  new JLabel("Make pattern  ");
        lable1.setBounds(50,30,150,30);

        b1 = new JButton("4");  b2 = new JButton("1");    b3 = new JButton("2");
        b4 = new JButton("8");  b5 = new JButton(" ");    b6 = new JButton("3");
        b7 = new JButton("7");  b8 = new JButton("6");    b9 = new JButton("5");

        jp = new JPanel(new GridLayout(3,3,30,30));

        jp.add(b1);     jp.add(b2);     jp.add(b3);     jp.add(b4);     jp.add(b5);
        jp.add(b6);     jp.add(b7);     jp.add(b8);     jp.add(b9);

        jp.setBounds(50,80,200,200);
        jp.setBackground(Color.CYAN);

        b1.addActionListener(this);     b2.addActionListener(this);     b3.addActionListener(this);
        b4.addActionListener(this);     b5.addActionListener(this);     b6.addActionListener(this);
        b7.addActionListener(this);     b8.addActionListener(this);     b9.addActionListener(this);


        label2 =  new JLabel("Output Patten  ");
        label2.setBounds(350,30,150,30);

        b11 = new JButton("1");  b22 = new JButton("2");    b33 = new JButton("3");
        b44 = new JButton("4");  b55 = new JButton("5");    b66 = new JButton("6");
        b77 = new JButton("7");  b88 = new JButton("8");    b99 = new JButton(" ");

        b11.setEnabled(false);  b44.setEnabled(false);  b77.setEnabled(false);
        b22.setEnabled(false);  b55.setEnabled(false);  b88.setEnabled(false);
        b33.setEnabled(false);  b66.setEnabled(false);  b99.setEnabled(false);

        JPanel p2 = new JPanel(new GridLayout(3,3,10,10));

        p2.add(b11);     p2.add(b22);     p2.add(b33);     p2.add(b44);     p2.add(b55);
        p2.add(b66);     p2.add(b77);     p2.add(b88);     p2.add(b99);

        p2.setBounds(350,80,160,140);
        p2.setBackground(Color.pink);


        f.add(lable1);   f.add(label2);    f.add(jp);   f.add(p2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(width,height);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
    }


    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            if(b2.getText().equals(" "))   {     b2.setText(b1.getText());  b1.setText(" ");  }
            if(b4.getText().equals(" "))   {     b4.setText(b1.getText());  b1.setText(" ");  }
        }

        if(e.getSource() == b2)
        {
            if(b1.getText().equals(" "))   {     b1.setText(b2.getText());  b2.setText(" ");  }
            if(b3.getText().equals(" "))   {     b3.setText(b2.getText());  b2.setText(" ");  }
            if(b5.getText().equals(" "))   {     b5.setText(b2.getText());  b2.setText(" ");  }
        }

        if(e.getSource() == b3)
        {
            if(b2.getText().equals(" "))   {     b2.setText(b3.getText());  b3.setText(" ");  }
            if(b6.getText().equals(" "))   {     b6.setText(b3.getText());  b3.setText(" ");  }
        }

        if(e.getSource() == b4)
        {
            if(b1.getText().equals(" "))   {     b1.setText(b4.getText());  b4.setText(" ");  }
            if(b5.getText().equals(" "))   {     b5.setText(b4.getText());  b4.setText(" ");  }
            if(b7.getText().equals(" "))   {     b7.setText(b4.getText());  b4.setText(" ");  }
        }

        if(e.getSource() == b5)
        {
            if(b2.getText().equals(" "))   {     b2.setText(b5.getText());  b5.setText(" ");  }
            if(b4.getText().equals(" "))   {     b4.setText(b5.getText());  b5.setText(" ");  }
            if(b8.getText().equals(" "))   {     b8.setText(b5.getText());  b5.setText(" ");  }
            if(b6.getText().equals(" "))   {     b6.setText(b5.getText());  b5.setText(" ");  }
        }

        if(e.getSource() == b6)
        {
            if(b5.getText().equals(" "))   {     b5.setText(b6.getText());  b6.setText(" ");  }
            if(b9.getText().equals(" "))   {     b9.setText(b6.getText());  b6.setText(" ");  }
            if(b3.getText().equals(" "))   {     b3.setText(b6.getText());  b6.setText(" ");  }

        }

        if(e.getSource() == b7)
        {
            if(b4.getText().equals(" "))   {     b4.setText(b7.getText());  b7.setText(" ");  }
            if(b8.getText().equals(" "))   {     b8.setText(b7.getText());  b7.setText(" ");  }
        }

        if(e.getSource() == b8)
        {
            if(b5.getText().equals(" "))   {     b5.setText(b8.getText());  b8.setText(" ");  }
            if(b7.getText().equals(" "))   {     b7.setText(b8.getText());  b8.setText(" ");  }
            if(b9.getText().equals(" "))   {     b9.setText(b8.getText());  b8.setText(" ");  }
        }

        if(e.getSource() == b9)
        {
            if(b6.getText().equals(" "))   {     b6.setText(b9.getText());  b9.setText(" ");  }
            if(b8.getText().equals(" "))   {     b8.setText(b9.getText());  b9.setText(" ");  }
        }

        if(b1.getText().equals("1") & b4.getText().equals("4") & b7.getText().equals("7") &
                b2.getText().equals("2") & b5.getText().equals("5") & b8.getText().equals("8") &
                b3.getText().equals("3") & b6.getText().equals("6") & b9.getText().equals(" ") )

        {
            JOptionPane.showMessageDialog(f, "You won ");
            f.dispose();
            new Puzzle();
        }
    }

    public static void main(String[] args){
        new Puzzle();
    }
}
