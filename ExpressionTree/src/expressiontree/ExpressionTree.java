/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressiontree;

/**
 *
 * @author rfoote
 */
public class ExpressionTree {
    public ListNode treeTop;
    public String expression;
    
    public ExpressionTree(String expIn) {
	treeTop = null;
	expression = expIn;
    }
    
    public void clearTree() {
	treeTop = null;
    }
    
    //simple tree class
    public class TreeNode {
	public char data;
	public TreeNode right;
	public TreeNode left;

	public TreeNode(char dataIn) {
	    this(dataIn, null, null);
	}

	public TreeNode(char dataIn, TreeNode rightIn, TreeNode leftIn) {
	    data = dataIn;
	    right = rightIn;
	    left = leftIn;
	}
    }
    
    //simple list class
    public class ListNode {
	public TreeNode treeNode;
	public ListNode next;
	
	public ListNode(TreeNode treeNodeIn) {
	    treeNode = treeNodeIn;
	    next = null;
	}
    }
    
    //stack functions
    public void push(TreeNode treeNode) {
	ListNode add = new ListNode(treeNode);
	if (treeTop == null) {
	    treeTop = add;
	}
	else {
	    treeTop.next = add;
	    treeTop = treeTop.next;
	}
    }
    
    public TreeNode pop() {
	if (treeTop.next != null) {
	    ListNode out = treeTop;
	    treeTop = treeTop.next;
	    out.next = null;
	    return out.treeNode;
	}
	else {
	    return treeTop.treeNode;
	}
    }
    
    public TreeNode top() {
	return treeTop.treeNode;
    }
    
    
}
