/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author cbartholomew
 */
public class Deployed implements stateInterface {
    MachineState myMachineState;
    public Deployed(MachineState newMachineState) {
        myMachineState = newMachineState;
    }
 public void submit() {
     System.out.println("You are currently in Deployed. Already submitted");
 }
    public void accepted() {
        System.out.println("You are deployed.  Already accepted");
        
 }
    public void rejected() {
        System.out.println("Can't reject.  Have to terminate");
        
    }
    public void terminate() {
        System.out.println("Terminating.  Moving to cleaning state");
         myMachineState.setState(myMachineState.getCleaning());
    }
    public void deployed() {
        System.out.println("currenly deployed");
    }
    public void resume() {
        System.out.println("has to be paused to resume");
        
    }
    public void modify() {
        System.out.println("modifying.  Moving to analyzing state");
         myMachineState.setState(myMachineState.getAnalyzing());
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
        System.out.println("Service paused.  Moving to suspended state");
        myMachineState.setState(myMachineState.getSuspended());
    }
}
