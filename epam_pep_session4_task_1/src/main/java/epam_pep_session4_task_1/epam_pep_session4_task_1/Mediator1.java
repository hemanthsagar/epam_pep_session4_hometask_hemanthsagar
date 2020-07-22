package epam_pep_session4_task_1.epam_pep_session4_task_1;

//mediater for gui and internal program
import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Mediator1 implements ActionListener
{
  public static Button submitrec;
  static
  {
      creategui obj1=new creategui();
      submitrec=obj1.getsbutton();
  }
  private static Mediator1 instance = new Mediator1();
  public static Mediator1 getInstance()
  {
      return instance;
  }
  public void actionPerformed(ActionEvent e)
  {
      if(e.getSource()==submitrec)
      {
          Calculatecompoundinterest obj2=new Calculatecompoundinterest();
          obj2.calculatecompoundinterest();
          Calculatesimpleinterest obj1=new Calculatesimpleinterest();
          obj1.calculatesimpleinterest();
      }
  }

}