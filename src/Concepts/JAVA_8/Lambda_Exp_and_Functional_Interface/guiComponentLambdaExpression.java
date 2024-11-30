package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

import javax.swing.JButton;

public class guiComponentLambdaExpression {
    
    public static void main(String[] args) {
        
        JButton jbButton = new JButton("Submit");
        jbButton.addActionListener( (e)->{

            System.out.println("Click event trigged" +e);
        });
    }
}
