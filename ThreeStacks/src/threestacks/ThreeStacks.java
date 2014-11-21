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
public class ThreeStacks <E> {
    ArrayList <E> triStack;
    private int top1;
    private int top2;
    private int top3;
    
    public ThreeStacks() {
	triStack = new ArrayList<E>();
	top1 = 0;
	top2 = 0;
	top3 = 0;
    }
    
    public int getTop1() {
	return top1;
    }
    
    public int getTop2() {
	return top2;
    }
    
    public int getTop3() {
	return top3;
    }
      
    public void onePush(E val) {
	int index = top1 * 3;
	if (index > triStack.size()){
	    triStack.resize(index * index);
	}
	triStack.add(index, val);
	top1 += 1;
    }

    public E onePop() {
	int index = (top1 - 1) * 3;
	E itemOut = triStack.get(index);
	//triStack.remove(index);
	return itemOut;
    }
//	
//	public Integer top() {
//	    Integer intOut;
//	    return intOut;
//	}
//	

    

}
