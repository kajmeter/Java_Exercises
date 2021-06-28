import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame {
    JTextArea mainTextarea;
    JScrollPane scrollPane;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;

    public frame(){

        // jframe
        super("Simple Swing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(600,400);
        setLayout(new BorderLayout(3,3));
        setBackground(Color.LIGHT_GRAY);
        setMinimumSize(new Dimension(335,235));

        //TOP
        // top button panels
        JPanel ABC = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel RGB = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // abc buttons
        JButton A = new JButton("A");
        JButton B = new JButton("B");
        JButton C = new JButton("C");
        ABC.add(A);
        ABC.add(B);
        ABC.add(C);

        // rgb buttons
        JButton FRButton = new JButton("FR");
        FRButton.setBackground(Color.RED);
        FRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextarea.setForeground(Color.RED);
            }
        });

        JButton FGButton = new JButton("FG");
        FGButton.setBackground(Color.GREEN);
        FGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextarea.setForeground(Color.GREEN);
            }
        });

        JButton FBButton = new JButton("FB");
        FBButton.setBackground(Color.BLUE);
        FBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextarea.setForeground(Color.BLUE);
            }
        });
        RGB.add(FRButton);
        RGB.add(FGButton);
        RGB.add(FBButton);

        // CENTER

        //textarea
        String spacing = "\n\n\n";
        mainTextarea = new JTextArea("Obszar tekstowy typu JTextArea" +
                "                                                                                                                                                                                                              "
                + spacing+"Pole tekstowe 1 typu JTextField"+spacing+"Pole tekstowe 2 typu JTextField"+spacing+"Pole tekstowe 3 typu JTextField"+spacing
                +spacing+spacing+spacing+spacing+spacing+spacing+spacing+spacing);
        mainTextarea.setForeground(Color.RED);
        mainTextarea.setEditable(false);
        mainTextarea.setFont(new Font(Font.DIALOG,Font.PLAIN,14));
        scrollPane = new JScrollPane(mainTextarea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        //BOTTOM

        // panels
        JPanel flowonetwothreepanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel onetwothreepanel = new JPanel(new GridLayout(3,3,3,3));
        JPanel bottomjtextfieldspanel = new JPanel(new GridLayout(3,1,3,3));

        // 1-9 buttons
        JButton onetwothree[];
        onetwothree = new JButton[10];
        for(int i = 1;i<onetwothree.length;i++){
            onetwothree[i] = new JButton(String.valueOf(i));
            onetwothreepanel.add(onetwothree[i]);
        }






        flowonetwothreepanel.add(onetwothreepanel);
        //textfields
        textField1 = new JTextField("Pole tekstowe 1 typu JTextField");
        textField1.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        textField1.setFont(new Font(Font.DIALOG,Font.PLAIN,14));
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = "";
                tmp = textField1.getText().toString();
                mainTextarea.append(tmp+spacing);
            }
        });
        textField2 = new JTextField("Pole tekstowe 2 typu JTextField");
        textField2.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        textField2.setFont(new Font(Font.DIALOG,Font.PLAIN,14));
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp1 = "";
                tmp1 = textField2.getText().toString();
                mainTextarea.append(tmp1+spacing);
            }
        });
        textField3 = new JTextField("Pole tekstowe 3 typu JTextField");
        textField3.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        textField3.setFont(new Font(Font.DIALOG,Font.PLAIN,14));
        textField3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp2 = "";
                tmp2 = textField3.getText().toString();
                mainTextarea.append(tmp2+spacing);
            }
        });

        bottomjtextfieldspanel.add(textField1);
        bottomjtextfieldspanel.add(textField2);
        bottomjtextfieldspanel.add(textField3);

        // top,center,bottom panels
        JPanel top = new JPanel(new GridLayout(1,2));
        JPanel center = new JPanel(new GridLayout(1,1));
        JPanel bottom = new JPanel(new GridLayout(1,2));
        add(top,BorderLayout.PAGE_START);
        add(center,BorderLayout.CENTER);
        add(bottom,BorderLayout.PAGE_END);
        //top
        top.add(RGB);
        top.add(ABC);
        //center
        center.add(scrollPane);
        //bottom
        bottom.add(flowonetwothreepanel);
        bottom.add(bottomjtextfieldspanel);

    }
}
