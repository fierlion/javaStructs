/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threestacks;

/**
 *
 * @author rfoote
 */
public class ThreeStacksTests {
    public static void main (String [] args) {
	ThreeStacks tri = new ThreeStacks();
	tri.onePush(6);
	tri.onePush(12);
	System.out.println(tri.getTop1());
    }
}
