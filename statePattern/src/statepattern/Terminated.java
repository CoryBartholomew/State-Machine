/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author cbartholomew
 */
public class Terminated implements stateInterface {
    MachineState myMachineState;
    public Terminated(MachineState newMachineState) {
        myMachineState = newMachineState;
    }
 public void submit() {
     System.out.println("Service already submitted");
 }
    public void accepted() {
        System.out.println("Service already accepted");
        
 }
    public void rejected() {
        System.out.println("Cannot reject.  Has been terminated");
        
    }
    public void terminate() {
        System.out.println("Already terminated");
        
    }
    public void deployed() {
        System.out.println("Can't deploy, service terminated");
    }
    public void resume() {
        System.out.println("can't resume.  service terminated");
        
    }
    public void modify() {
        System.out.println("can't modify.  service terminated");
         
    }
    public void purge() {
        System.out.println("Purging.  Service deleted");
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