package epam_pep_session4_task_2.epam_pep_session4_task_2;



import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class creategui11
{
    //{
    static Button submit;
    static Frame f;
    static Panel p;
    static TextField tf1,tf2;
    static GridLayout g;
    static JRadioButton s1o1,s1o2,s1o3,s2o1,s2o2;
    //}



    public static void createguifunction()
    {

        JLabel l1=new JLabel("select standard of matierial");
        JLabel l2=new JLabel("Enter total area");
        JLabel l3=new JLabel("select automated or not");

        s1o1 = new JRadioButton();
        s1o1.setText("Normal matierial");
        s1o2 = new JRadioButton();
        s1o2.setText("Standard matierial");
        s1o3 = new JRadioButton();
        s1o3.setText("Highly standard matierial");

        s2o1=new JRadioButton();
        s2o1.setText("Automated");
        s2o2=new JRadioButton();
        s2o2.setText("Not Automated");

        ButtonGroup G1 = new ButtonGroup();
        ButtonGroup G2 = new ButtonGroup();

        G1.add(s1o1);
        G1.add(s1o2);
        G1.add(s1o3);


        G2.add(s2o1);
        G2.add(s2o2);

        s1o1.setVisible(true);
        s1o2.setVisible(true);

        submit=new Button("submit");

        f = new Frame("");
        p = new Panel();
        f.setLayout(new GridLayout(1,1));
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        submit.addActionListener(Mediator11.getInstance());
        g = new GridLayout(11,11);
        p.setLayout(g);
        p.add(l1);
        p.add(s1o1);
        p.add(s1o2);
        p.add(s1o3);
        p.add(l2);
        p.add(tf1);
        p.add(l3);
        p.add(s2o1);
        p.add(s2o2);
        p.add(submit);
        p.add(tf2);
        f.add(p);
        f.setSize(300,600);
        f.setVisible(true);

    }

    public static TextField getTextField1()
    {
        return tf1;
    }
    public static TextField getTextField2()
    {
        return tf2;
    }
    public static JRadioButton gets1o1()
    {
        return s1o1;
    }
    public static JRadioButton gets1o2()
    {
        return s1o2;
    }
    public static JRadioButton gets1o3()
    {
        return s1o3;
    }
    public static JRadioButton gets2o1()
    {
        return s2o1;
    }
    public static JRadioButton gets2o2()
    {
        return s2o2;
    }
    public static Button getsubmit()
    {
        return submit;
    }

}
