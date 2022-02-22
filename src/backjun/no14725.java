package backjun;

import java.util.Scanner;

public class no14725 {
	public static class Node<T> {
		private T meal;
		private Node<T> left;
		private Node<T> right;
		private int depth;
		Node(T meal, int depth) {
			this.meal = meal;
			this.left = null;
			this.right = null;		
			this.depth = depth;
		}
		private Node<T> add(Node<T> ant) {
			if( this.right == null ) {
				this.right = ant;
				return this.right;
			} else {
				if( this.right.meal.equals(ant.meal) ) {
					return this.right;									
				} else {
					if( this.left == null ) {
						this.left = ant;
						return this.left;
					} else {	

						return this.left;						
					}	
				}
			}
			
		}
		private void print() {			 
			if( this.left != null ) {
				int depth = this.left.depth;
				for( int i = 0 ; i < depth ; i++ ) {
					System.out.print("--");
				}
				System.out.println(this.left.meal);
				this.left.print();
				
			}
			if( this.right != null ) {
				int depth = this.right.depth;
				for( int i = 0 ; i < depth ; i++ ) {
					System.out.print("--");
				}
				System.out.println(this.right.meal);
				this.right.print();
			}
		}
	}
	
	public static class Tree<T> {
		private Node<T> root;
		Tree(Node<T> root) {
			this.root = root;
		}
		Tree() {
			this(null);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tree<String> tree = new Tree<String>();
		tree.root = new Node<String>(null,0);
		
		int total = sc.nextInt();
		
		for( int i = 0 ; i < total ; i++ ) {
			Node<String> now = tree.root;
			int k = sc.nextInt();
				for( int j = 0 ; j < k ; j++ ) {
					String t = sc.next();
					now = now.add( new Node<String>(t,j) );
				}
		}
		
		sc.close();
		tree.root.print();
	}
	
}
