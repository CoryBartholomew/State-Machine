/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author cbartholomew
 */
public class Deploying implements stateInterface {
    MachineState myMachineState;
    public Deploying(MachineState newMachineState) {
        myMachineState = newMachineState;
    }
 public void submit() {
     System.out.println("Already submitted, you are deploying ");
 }
    public void accepted() {
        System.out.println("Already accepted, You are deploying");
        
 }
    public void rejected() {
        System.out.println("Can't reject, have to terminate");
       
    }
    public void terminate() {
        System.out.println("Terminating, moving to cleaning");
        myMachineState.setState(myMachineState.getCleaning());
    }
    public void deployed() {
        System.out.println("Moving to deployed state");
        myMachineState.setState(myMachineState.getDeployed());
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
        System.out.println("Not an option");
       
    }
    public void cantResume() {
        System.out.println("not an option");
       
    }
    public void pause() {
        System.out.println("not an option");
    }
}
