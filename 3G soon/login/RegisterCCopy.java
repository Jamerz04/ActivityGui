package book.system.login;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import book.system.register.RegisterController;
import book.system.register.RegisterView;



public class RegisterCCopy extends RegisterController{

    LoginController LgController = new LoginController();

        public void registerCopy(){

            this.CancelButton();

              register.addActionListener(new ActionListener(){
                @Override

                public void actionPerformed(ActionEvent e){

                    LgController.RegisterButton();
                    


                }


            });




        }

     

   


    }






