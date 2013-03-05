/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author cbartholomew
 */
public class Analyzing implements stateInterface {
    MachineState myMachineState;
    public Analyzing(MachineState newMachineState) {
        myMachineState = newMachineState;
    }
 public void submit() {
     System.out.println("You are currently analyzing.  Please specify a correct event ");
 }
    public void accepted() {
        System.out.println("You are deploying");
        myMachineState.setState(myMachineState.getDeployed());
 }
    public void rejected() {
        System.out.println("Service has been rejected.  Moving to failed State");
        myMachineState.setState(myMachineState.getFailed());
    }
    public void terminate() {
        System.out.println("Cannot terminate.  Have not deployed yet");
    }
    public void deployed() {
        System.out.println("Cannot deploy.  Have to accept");
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
        System.out.println("Moving to deployed state");
        myMachineState.setState(myMachineState.getDeployed());
    }
    public void cantResume() {
        System.out.println("Moving to suspended state");
        myMachineState.setState(myMachineState.getSuspended());
    }
    public void pause() {
        System.out.println("not an option");
    }
}
