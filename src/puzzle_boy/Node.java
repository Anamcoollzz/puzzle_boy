/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle_boy;

/**
 *
 * @author Hairul Anam
 */
public class Node {
    private byte level = 0;
    private final byte state[];

    public Node(byte[] st, byte lvl) {
        state = st;
        level = lvl;
    }
    
    public byte getLevel(){
        return level;
    }
    
    public byte[] getState(){
        return state;
    }
}
