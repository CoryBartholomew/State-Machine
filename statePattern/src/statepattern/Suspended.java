/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author cbartholomew
 */
public class Suspended implements stateInterface {
    MachineState myMachineState;
    public Suspended(MachineState newMachineState) {
        myMachineState = newMachineState;
    }
 public void submit() {
     System.out.println("Service Already submitted");
 }
    public void accepted() {
        System.out.println("Service already accepted");
        
 }
    public void rejected() {
        System.out.println("Can't reject.  Have to terminate");
        
    }
    public void terminate() {
        System.out.println("Terminating.  Moving to cleaning state");
         myMachineState.setState(myMachineState.getCleaning());
    }
    public void deployed() {
        System.out.println("not an option");
    }
    public void resume() {
        System.out.println("resuming.  Moving to analyzing state");
         
    }
    public void modify() {
        System.out.println("Cannot modify");
         
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