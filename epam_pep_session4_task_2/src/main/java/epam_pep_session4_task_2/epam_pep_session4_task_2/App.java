package epam_pep_session4_task_2.epam_pep_session4_task_2;


public class App extends Thread
{
    public void run()
    {
        creategui11 a=new creategui11();
        a.createguifunction();
    }
    public static void main(String args[])
    {
        App t1=new App();
        t1.start();
    }
}
