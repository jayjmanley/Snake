package Snake;
import java.util.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Snake extends location{
	
	static Scanner input = new Scanner(System.in);
	static int i = 0;
	static int j = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How big would you like the gameboard?");
		System.out.println("Width?");
		int width = input.nextInt();
				
		System.out.println("Length?");
		int length = input.nextInt();
		int [][] gameboard = new int[width][length];
		
		for (int i = 0; i < gameboard.length; i++) {
			
			for (int j = 0; j < gameboard[0].length; j++) {
				if (i == 0 || i == gameboard.length - 1 || j == 0|| j == gameboard[0].length - 1) {
					gameboard[i][j] = 1;
				}
				else {
					gameboard[i][j]= 0;
				}
				
			}
		}
		//for (int i = 0; i < gameboard.length; i++) 
		PrintArray(gameboard);
		
	}
	public static void PrintArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	private static void movement(KeyEvent event, int[][] array){
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			array[i][j] = array[i][j-1];
		} else if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			array[i][j] = array[i-1][j];
		} else if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			array[i][j] = array[i][j+1];
		} else { //last one it checks would be left
			 
		}
	}
	
	} 

