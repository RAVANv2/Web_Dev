package chatting.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;



public class Client extends JFrame implements ActionListener
{
    //    Pannel
    JPanel p1;
    //    Text Filed
    JTextField t1;
    //    Button
    JButton b1;
    //    TextArea
    static JTextArea a1;

//    Socket
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;

    Client()
    {
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0, 450, 70);
        add(p1);

//        Back button png
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(5,17,30,30);
        p1.add(l1);

        l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });


//        Gaitonde Image
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/2.png"));
        Image i5 = i4.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(40,5,60,60);
        p1.add(l2);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l5 = new JLabel(i9);
        l5.setBounds(290, 20, 30, 30);
        p1.add(l5);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/phone.png"));
        Image i12 = i11.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel l6 = new JLabel(i13);
        l6.setBounds(350, 20, 35, 30);
        p1.add(l6);

        ImageIcon i14 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/3icon.png"));
        Image i15 = i14.getImage().getScaledInstance(13, 25, Image.SCALE_DEFAULT);
        ImageIcon i16 = new ImageIcon(i15);
        JLabel l7 = new JLabel(i16);
        l7.setBounds(410, 20, 13, 25);
        p1.add(l7);



//        Gaitonde Name Label
        JLabel l3 = new JLabel("Bunty");
        l3.setFont(new Font("SAN_SERIF", Font.BOLD,18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(110,15,100,30);
        p1.add(l3);

//        Active Now Lable
        JLabel l4 = new JLabel("Active Now");
        l4.setFont(new Font("SAN_SERIF", Font.PLAIN,14));
        l4.setForeground(Color.WHITE);
        l4.setBounds(110,35,100,30);
        p1.add(l4);

//        Object of TextArea
        a1 = new JTextArea();
        a1.setBounds(5,75,438,540);
        a1.setBackground(Color.WHITE);
        a1.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        a1.setEditable(false);
        a1.setLineWrap(true);
        a1.setWrapStyleWord(true);
        add(a1);


//        Object of Textfield
        t1 = new JTextField();
        t1.setBounds(5,620,350,40);
        t1.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(t1);

//        Object of send button
        b1 = new JButton("Send");
        b1.setBounds(357, 620, 90,40);
        b1.setBackground(new Color(7,94,84));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font(("SAN_SERIF"),Font.PLAIN,16));
        b1.addActionListener(this);
        add(b1);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        setSize(450, 700);
        setLocation(800,200);
//        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        try {
            String out = t1.getText();
            a1.setText(a1.getText() + "\n\t\t" + out);
            dout.writeUTF(out);
            t1.setText("");
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        new Client().setVisible(true);

        String msginput = "";
        try{
            s = new Socket("127.0.0.1",6001);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            msginput = din.readUTF();
            a1.setText(a1.getText() + "\n" + msginput);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
