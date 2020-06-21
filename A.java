import java.awt.*;
public class A{
     public static void main(String[]args){
     final Frame f=new Frame("BorderLayout");
    f.setLayout(new BorderLayout());
    f.setSize(300,300);
    f.setLocation(300,200);
    f.setVisible(true);
    Button but1=new Button("dong bu");
   Button but2= new Button("xi bu");
   Button but3= new Button("nan bu");
   Button but4= new Button("bei bu");
   Button but5= new Button("zhong bu");
   f.add(but1,BorderLayout.EAST);
   f.add(but2,BorderLayout.WEST);
   f.add(but3,BorderLayout.SOUTH);
   f.add(but4,BorderLayout.NORTH);
   f.add(but5,BorderLayout.CENTER);
   but1.setBackground(Color.yellow);
    but2.setBackground(Color.yellow); 
   but3.setBackground(Color.green);
   but4.setBackground(Color.blue); 
   but5.setBackground(Color.black); 
}
}
