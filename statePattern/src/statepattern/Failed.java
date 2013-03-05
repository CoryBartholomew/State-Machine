/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author cbartholomew
 */
public class Failed implements stateInterface {
    MachineState myMachineState;
    public Failed(MachineState newMachineState) {
        myMachineState = newMachineState;
    }
 public void submit() {
     System.out.println("Submitting.  Moving to analyzing");
     myMachineState.setState(myMachineState.getAnalyzing());
 }
    public void accepted() {
        System.out.println("Service failed.  Have to re-submit");
        
 }
    public void rejected() {
        System.out.println("Service has failed");
        
    }
    public void terminate() {
        System.out.println("Service has failed, can't terminate");
        
    }
    public void deployed() {
        System.out.println("Service has failed, can't deploy");
    }
    public void resume() {
        System.out.println("can't resume, have to re-submit");
         myMachineState.setState(myMachineState.getAnalyzing());
    }
    public void modify() {
        System.out.println("Can't modify, have to re-submit");
         myMachineState.setState(myMachineState.getAnalyzing());
    }
    public void purge() {
        System.out.println("Purging.  Deleting service");
    }
    public void cantModify() {
        System.out.println("not an option");
        myMachineState.setState(myMachineState.getDeployed());
    }
    public void cantResume() {
        System.out.println("not an option");
        myMachineState.setState(myMachineState.getSuspended());
    }
    public void pause() {
        System.out.println("not an option");
    }
}
