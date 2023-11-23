package book.system.login;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import book.system.FrameGUI;


public class LoginView{

    JPanel Lpanel;
    JButton register;

        public void loginV(){
        FrameGUI gui = new FrameGUI();

        Lpanel = new JPanel();
        Lpanel.setSize(380,480);
        Lpanel.setLayout(null);
        Lpanel.setBackground(Color.CYAN);


        register = new JButton("Register");

        register.setBounds(10,30,100,30);

        Lpanel.add(register);
        
        gui.Frames(Lpanel);

        






    }






}