/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author cbartholomew
 */
public class Cleaning implements stateInterface {
    MachineState myMachineState;
    public Cleaning(MachineState newMachineState) {
        myMachineState = newMachineState;
        myMachineState.setState(myMachineState.getTerminated());
    }
 public void submit() {
     System.out.println("You are currently analyzing.  Please specify a correct event ");
 }
    public void accepted() {
        System.out.println("Y");
        
 }
    public void rejected() {
        System.out.println("Service has been rejected.  Moving to failed State");
        
    }
    public void terminate() {
        System.out.println("Moving to terminate");
    }
    public void deployed() {
        System.out.println("Cannot deploy. ");
    }
    public void resume() {
        System.out.println("Cannot resume.  You are not in suspended state");
    }
    public void modify() {
        System.out.println("Nothing to modify");
    }
    public void purge() {
        System.out.println("Cannot purge.  Not in failed or terminated state");
    }
    public void cantModify() {
        System.out.println("not an option");
        
    }
    public void cantResume() {
        System.out.println("not an option");
        
    }
    public void pause() {
        System.out.println("not an option");
    }
}
