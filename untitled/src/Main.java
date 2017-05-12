/**
 * Created by dl579 on 2017-05-12.
 */
        import sun.misc.*;

        import java.awt.*;
        import java.awt.event.*;
        import java.util.*;
        import java.util.Queue;

/**
 * Created by dl579 on 2017-05-07.
 */
class Calculation  implements ActionListener //ActionListener 상속
{
   Queue<String> stack = new <String> LinkedList();
    String[] Str= new String[100];
    String[] Str2= new String[100];
    Integer[] Num3 = new Integer[100];
    Button bt9 = new Button("9");
    Button bt8 =new Button("8");
    Button bt7 =new Button("7");
    Button btSum =new Button("+");
    Button bt6 =new Button("6");
    Button bt5 =new Button("5");
    Button bt4 =new Button("4");
    Button btMin =new Button("-");
    Button bt3 =new Button("3");
    Button bt2 =new Button("2");
    Button bt1 =new Button("1");
    Button btmul =new Button("*");
    Button btmadeby =new Button("made by sh");
    Button bt0 =new Button("0");
    Button btresult =new Button("=");
    Button btDiv =new Button("/");
    TextArea label1=new TextArea("상훈",17,130);
    Label label2=new Label("Perfect Calculation");
    int num1 = 0;
    int i=0;
    int k=0;
    int FinalSum=0;
    private Frame fr;
    private String Mul="",Mul2="";
    int Sum=0;
    public Calculation(String str)
    {
        fr = new Frame(str);
        Panel Num= new Panel();
        Panel resultWindow= new Panel();
        Panel Low = new Panel();
        Num.setLayout(new GridLayout(4,4,0,0));
        fr.setLayout(new BorderLayout());
        bt9.addActionListener(this);
        bt8.addActionListener(this);
        bt7.addActionListener(this);
        bt6.addActionListener(this);
        bt5.addActionListener(this);
        bt4.addActionListener(this);
        bt3.addActionListener(this);
        bt2.addActionListener(this);
        bt1.addActionListener(this);
        bt0.addActionListener(this);
        btMin.addActionListener(this);
        btresult.addActionListener(this);
        btSum.addActionListener(this);
        btDiv.addActionListener(this);
        btmul.addActionListener(this);
        btmadeby.addActionListener(this);
        Num.add(bt9);
        Num.add(bt8);
        Num.add(bt7);
        Num.add(btSum);
        Num.add(bt6);
        Num.add(bt5);
        Num.add(bt4);
        Num.add(btMin);
        Num.add(bt3);
        Num.add(bt2);
        Num.add(bt1);
        Num.add(btmul);
        Num.add(btmadeby);
        Num.add(bt0);
        Num.add(btresult);
        Num.add(btDiv);
        resultWindow.add(label1);
        Low.add(label2);
        resultWindow.setSize(30,30);
        fr.add(resultWindow,BorderLayout.NORTH);
        fr.add(Num,BorderLayout.CENTER);
        fr.add(Low,BorderLayout.SOUTH);
        fr.setSize(1000,1000);

    }
    public static void main(String[] args)
    {
        Calculation cal=new Calculation("Calculation");
        cal.fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button Bt1=(Button) e.getSource();
        if(Bt1 == bt9)
        {   Mul = Mul+9;
            Mul2 = Mul2+9;
            label1.setText(Mul);
        }
        else if(Bt1 == bt8)
        {
            Mul = Mul+8;
            Mul2 = Mul2+8;
            label1.setText(Mul);
        }
        else if(Bt1 == btmadeby)
        {
            label1.setText("상훈이가 만들었다");
            Mul = "";
        }
        else if(Bt1 == bt7)
        {
            Mul = Mul+7;
            Mul2 = Mul2+7;
            label1.setText(Mul);
        }
        else if(Bt1 == bt6)
        {
            Mul = Mul+6;
            Mul2 = Mul2+6;
            label1.setText(Mul);
        }
        else if(Bt1 == bt5)
        {
            Mul = Mul+5;
            Mul2 = Mul2+5;
            label1.setText(Mul);
        }
        else if(Bt1 == bt4)
        {
            Mul = Mul+4;
            Mul2 = Mul2+4;
            label1.setText(Mul);
        }
        else if(Bt1 == bt3)
        {
            Mul = Mul+3;
            Mul2 = Mul2+3;
            label1.setText(Mul);
        }
        else if(Bt1 == bt2)
        {
            Mul = Mul+2;
            Mul2 = Mul2+2;
            label1.setText(Mul);
        }
        else if(Bt1 == bt1)
        {
            Mul = Mul+1;
            Mul2 = Mul2+1;
            label1.setText(Mul);

        }
        else if(Bt1 == bt0)
        {
            Mul = Mul+0;
            Mul2 = Mul2+0;
            label1.setText(Mul);
        }
        else if(Bt1 == btSum)
        {
            num1 = Integer.parseInt(Mul2.toString());
            Mul= Mul+"+";
            label1.setText(Mul);
            Num3[k]=num1;
            k++;
            Mul2="";
            num1=0;
            stack.add("+");
        }
        else if(Bt1 == btMin)
        {
            num1 = Integer.parseInt(Mul2.toString());
            Mul= Mul+"-";
            label1.setText(Mul);
            Num3[k]=num1;
            k++;
            Mul2="";
            num1=0;
            stack.add("-");
        }
        else if(Bt1 == btDiv)
        {
            num1 = Integer.parseInt(Mul2.toString());
            Mul= Mul+"/";
            label1.setText(Mul);
            Num3[k]=num1;
            k++;
            Mul2="";
            num1=0;
            stack.add("/");
        }
        else if(Bt1 == btmul)
        {
           Mul= Mul+"*";
            num1 = Integer.parseInt(Mul2.toString());
            label1.setText(Mul);
            Num3[k]=num1;
            k++;
            Mul2="";
            num1=0;
            stack.add("*");
        }
        else if(Bt1 == btresult)
        {
            num1 = Integer.parseInt(Mul2.toString());
            Num3[k]=num1;
            num1=0;
            Sum=Num3[0];
            for(int J=1;J<=k;J++) {
                if (stack.isEmpty())
                {
                    break;
                }
                else if (stack.peek() == "+") {
                    Sum +=Num3[J];
                    stack.poll();
                } else if (stack.peek() == "-") {
                    Sum += -Num3[J];
                    stack.poll();
                } else if (stack.peek() == "*") {
                    Sum *= Num3[J];
                    stack.poll();
                } else if (stack.peek() == "/") {
                    Sum /= Num3[J];
                    stack.poll();
                }
            }
            label1.setText(Mul+"="+Sum);
        }
    }
}