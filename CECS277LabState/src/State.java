/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mimi
 */
public interface State {
    public void sleep(Cat cat);
    public void eat(Cat cat);
    public void play(Cat cat);
    public void ignore(Cat cat);
}
