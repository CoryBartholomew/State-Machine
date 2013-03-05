/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author cbartholomew
 */
public class MachineState {
   stateInterface analyzing;
   stateInterface cleaning;
   stateInterface failed;
   stateInterface terminated;
   stateInterface suspended;
   stateInterface deployed;
   
   stateInterface myState;
   
   public MachineState() {
       analyzing = new Analyzing(this);
       cleaning = new Cleaning(this);
       failed = new Failed(this);
       terminated = new Terminated(this);
       suspended = new Suspended(this);
       deployed = new Deployed(this);
       myState = failed;
   }


void setState(stateInterface newState){
    myState = newState;
}

public void submit() {
    myState.submit();
}
   public void accepted() {
       myState.accepted();
   }
    public void rejected(){
        myState.rejected();
    }
    public void terminate() {
        myState.terminate();
    }
    public void deployed() {
        myState.deployed();
    }
    public void resume() {
        myState.resume();
    }
    public void modify() {
        myState.modify();
    }
    public void purge() {
        myState.purge();
    }
    public void cantModify() {
        myState.cantModify();
    }
    public void cantResume() {
        myState.cantResume();
    }
    public void pause() {
        myState.pause();
    }
 
   public stateInterface getAnalyzing() { return analyzing; }
   public stateInterface getCleaning () { return cleaning; }
   public stateInterface getFailed () { return failed; }
   public stateInterface getTerminated () { return terminated; }
   public stateInterface getSuspended () { return suspended; }
   public stateInterface getDeployed () { return deployed; }
   
    
}
