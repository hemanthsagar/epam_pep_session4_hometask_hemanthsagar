package epam_pep_session4_task_1.epam_pep_session4_task_1;



//program to calculate compound interest
import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Calculatecompoundinterest
{
    public static void calculatecompoundinterest()
    {
        creategui obj1=new creategui();
        TextField tf1=obj1.getTextField1();
        TextField tf2=obj1.getTextField2();
        TextField tf3=obj1.getTextField3();
        TextField tf4=obj1.getTextField4();
        TextField tf5=obj1.getTextField5();
        String s1=tf1.getText();
        String s2=tf2.getText();
        String s3=tf3.getText();
        try
        {
            Double p=Double.parseDouble(s1);
            Double t=Double.parseDouble(s2);
            Double r=Double.parseDouble(s3);
            Double ci=p*(Math.pow((1+(r/100)),t));
            tf5.setText(Double.toString(ci-p));
        }
        catch(NumberFormatException e)
        {
            tf5.setText("please fill correst information");
        }

    }
}