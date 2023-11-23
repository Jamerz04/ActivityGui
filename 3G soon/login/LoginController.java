package book.system.login;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import book.system.FrameGUI;
import book.system.register.RegisterController;


public class LoginController extends LoginView{
     
        RegisterView rgControl = new RegisterView();
    


        public void RegisterButton(){
           loginV();

         

            register.addActionListener(new ActionListener(){
                @Override

                public void actionPerformed(ActionEvent e){

                        rgControl.RegisterV();


                }


            });



        }



        



    }


    






