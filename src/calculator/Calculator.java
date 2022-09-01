package calculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JTextField;

public class Calculator extends Frame implements ActionListener, WindowListener{

    JTextField t = new JTextField();
    Button bc = new Button("C");
    Button boff = new Button("OFF");
    Button bD = new Button(".");
    Button b0 = new Button("0");
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button ba = new Button("+");
    Button bs = new Button("-");
    Button bm = new Button("×");
    Button bi = new Button("/");
    Button be = new Button("=");
    Button bo = new Button("%");
    Button bbk = new Button("-->");
    Button bf = new Button("!");
    Button bsq = new Button("√");
    Button bpn = new Button("±");
    
    
    Font f = new Font("SansSerif", Font.BOLD, 24);
    Font b = new Font("SansSerif", Font.BOLD, 15);
    public Calculator() 
    {
        setLayout(null);
        setBounds(900,20,290,380);
        setVisible(true);
        
        t.setBounds(20, 50, 250, 40);
        t.setFont(f);
        t.setHorizontalAlignment(JTextField.RIGHT);
        add(t);
        
        bc.setBounds(170, 100, 40, 40);
        bc.setFont(b);
        add(bc);
        boff.setBounds(220, 100, 40, 40);
        boff.setFont(b);
        boff.setForeground(Color.red);
        add(boff);
        bD.setBounds(120, 300, 40, 40);
        bD.setFont(b);
        add(bD);
        b0.setBounds(20, 300, 90, 40);
        b0.setFont(b);
        add(b0);
        b1.setBounds(20, 250, 40, 40);
        b1.setFont(b);
        add(b1);
        b2.setBounds(70, 250, 40, 40);
        b2.setFont(b);
        add(b2);
        b3.setBounds(120, 250, 40, 40);
        b3.setFont(b);
        add(b3);
        b4.setBounds(20, 200, 40, 40);
        b4.setFont(b);
        add(b4);
        b5.setBounds(70, 200, 40, 40);
        b5.setFont(b);
        add(b5);
        b6.setBounds(120, 200, 40, 40);
        b6.setFont(b);
        add(b6);
        b7.setBounds(20, 150, 40, 40);
        b7.setFont(b);
        add(b7);
        b8.setBounds(70, 150, 40, 40);
        b8.setFont(b);
        add(b8);
        b9.setBounds(120, 150, 40, 40);
        b9.setFont(b);
        add(b9);
        ba.setBounds(170, 300, 40, 40);
        ba.setFont(b);
        add(ba);
        bs.setBounds(170, 250, 40, 40);
        bs.setFont(b);
        add(bs);
        bm.setBounds(170, 200, 40, 40);
        bm.setFont(b);
        add(bm);
        bi.setBounds(170, 150, 40, 40);
        bi.setFont(b);
        add(bi);
        be.setBounds(220, 250, 40, 90);
        be.setFont(b);
        add(be);
        bo.setBounds(220, 200, 40, 40);
        bo.setFont(b);
        add(bo);
        bbk.setBounds(220, 150, 40, 40);
        bbk.setFont(b);
        add(bbk);
        bf.setBounds(20, 100, 40, 40);
        bf.setFont(b);
        add(bf);
        bsq.setBounds(70, 100, 40, 40);
        bsq.setFont(b);
        add(bsq);
        bpn.setBounds(120, 100, 40, 40);
        bpn.setFont(b);
        add(bpn);
        boff.addActionListener(this);
        bc.addActionListener(this);
        bD.addActionListener(this);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bi.addActionListener(this);
        be.addActionListener(this);
        bpn.addActionListener(this);
        bo.addActionListener(this);
        bf.addActionListener(this);
        bbk.addActionListener(this);
        addWindowListener(this);
    }

    double n1,n2,result;
    char op;
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
    
    private void settext(String s){ // method to put one or more numbers in textfield
        String TT = t.getText() + s;
            t.setText(TT);
    }
    
    private void setop(char ope){ // method to do the operation
        n1 = Double.parseDouble(t.getText());
        t.setText("");
        op = ope;
    }
    private void fact(char ope){
    int i,fact=1;
    n1 = Double.parseDouble(t.getText());    
    for(i=1;i<=n1;i++)
    {    
      fact=fact*i;
    }
    op = ope;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boff)
             System.exit(0);
        if(e.getSource()==bc)
             t.setText(" ");
        if(e.getSource()==bD)
            settext(".");
        if(e.getSource()==b0)
            settext("0");  
        if(e.getSource()==b1)
            settext("1");
        if(e.getSource()==b2)
            settext("2");
        if(e.getSource()==b3)
            settext("3");
        if(e.getSource()==b4)
            settext("4");
        if(e.getSource()==b5)
            settext("5");
        if(e.getSource()==b6)
            settext("6");
        if(e.getSource()==b7)
            settext("7");
        if(e.getSource()==b8)
            settext("8");
        if(e.getSource()==b9)
            settext("9");
        if(e.getSource()==ba)
            setop('+');
        if(e.getSource()==bs)
            setop('-');
        if(e.getSource()==bm)
            setop('*');
        if(e.getSource()==bi)
            setop('/');
        if(e.getSource()==bo)
            setop('%');
        if(e.getSource()==bbk)
            settext("/b");
        if(e.getSource()==bpn) // to convert positive to neigative or negaitve to positive
        {
            double num = Double.parseDouble(t.getText());
            num = num * (-1);
            t.setText(String.valueOf(num));
        }
        if(e.getSource()==be)
        {
            n2 = Double.parseDouble(t.getText());
            switch(op){
                case '+': result = n1+n2;break;
                case '-': result = n1-n2;break;
                case '*': result = n1*n2;break;
                case '/': result = n1/n2;break;
                case '%': result = n1%n2;break;
                

            }
            t.setText(String.valueOf(result));
        }
 
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
        }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        }

    @Override
    public void windowDeiconified(WindowEvent e) {
        }

    @Override
    public void windowActivated(WindowEvent e) {
        }

    @Override
    public void windowDeactivated(WindowEvent e) {
        }
    
}