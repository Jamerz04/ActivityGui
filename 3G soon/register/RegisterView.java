package book.system.register;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import book.system.FrameGUI;


public class RegisterView{

    RegisterController rgControl = new RegisterController();

    JPanel Lpanel;
   public JButton register;

        public void RegisterV(){
        FrameGUI gui = new FrameGUI();

        Lpanel = new JPanel();
        Lpanel.setSize(380,480);
        Lpanel.setLayout(null);
        Lpanel.setBackground(Color.CYAN);


        register = new JButton("Cancel");

        register.setBounds(10,30,100,30);

        Lpanel.add(register);
        
        gui.Frames(Lpanel);
        

        register.addActionListener(new ActionListener){
            public void actionPerformed(ActionEvent (){


            rgControl.CancelButton();




            });
        }
        






    }






}