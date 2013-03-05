/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author cbartholomew
 */
public interface stateInterface {
    void submit();
    void accepted();
    void rejected();
    void terminate();
    void deployed();
    void resume();
    void modify();
    void purge();
    void cantModify();
    void cantResume();
    void pause();
    
}
