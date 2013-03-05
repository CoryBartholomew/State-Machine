/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

import java.util.Scanner;
public class StatePattern {

  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MachineState stateObject = new MachineState();
        int tempOption;
        int option = 6;
        boolean terminated = false;
        while (terminated == false) {
            switch(option) {
                case 1:
                    System.out.println("You are in analyzing state\n 1. Accepted\n2. Rejected\n3. Can't Modify\n4. Can't resume");
                    tempOption = input.nextInt();
                    if (tempOption == 1) {
                        option = 2;
                        stateObject.accepted();
                    }
                    else if (tempOption == 2) {
                        option = 6;
                        stateObject.rejected();
                    }
                    else if (tempOption == 3) {
                        option = 3;
                        stateObject.cantModify();
                    }
                    else if (tempOption == 4) {
                        option = 4;
                        stateObject.cantResume();
                    }
                    else
                        System.out.println("Not a valid option");
                    break;
                case 2:
                    System.out.println("You are in Deploying state\n1.deployed\n2.terminate");
                    tempOption = input.nextInt();
                    if (tempOption == 1) {
                        option = 3;
                        stateObject.deployed();
                    }
                    else if (tempOption == 2) {
                        option = 5;
                        stateObject.terminate();
                    }
                    else
                        System.out.println("Not a valid option");
                    break;
                case 3:
                    System.out.println("You are in Deployed state\n1.modify\n2. pause\n3. terminate ");
                    tempOption = input.nextInt();
                    if (tempOption == 1) {
                        option = 1;
                        stateObject.modify();
                    }
                    else if (tempOption == 2) {
                        option = 4;
                        stateObject.pause();
                    }
                    else if (tempOption == 3) {
                        option = 5;
                        stateObject.terminate();
                    }
                    else
                        System.out.println("Not a valid option");
                    break;
                case 4:
                    System.out.println("You are in Suspended state\n1. Resume\n2.terminate");
                    tempOption = input.nextInt();
                    if (tempOption == 1) {
                        option = 1;
                        stateObject.resume();
                    }
                    else if (tempOption == 2) {
                        option = 5;
                        stateObject.terminate();
                    }
                    else
                        System.out.println("Not a valid option");
                    break;
                 case 5:
                    System.out.println("You are in Cleaning  state, moving to terminate state");
                    option = 7;
                     break;
                  case 6:
                    System.out.println("You are in Failed state\n1.submit\n2. purge");
                    tempOption = input.nextInt();
                    if (tempOption == 1) {
                        option = 1;
                        stateObject.submit();
                    }
                    else if (tempOption == 2) {
                        System.out.println("Goodbye");
                        terminated = true;
                    }
                    else
                        System.out.println("Not a valid option");
                    break;
                 case 7:
                    System.out.println("You are in Terminated state, purging.  Goodbye");
                    terminated = true;
                    break;
                    
            
            }
        
    }
        
    }
}
