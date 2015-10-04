package Snake;
import java.util.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Gameboard extends location{
	
	static int [][] gameboard = new int[1][1]; 
	static Scanner input = new Scanner(System.in);
	static int i = 0;
	static int j = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getArray();
		PrintArray(gameboard);
		
	}
	
	public static void PrintArray(int[][] array) {
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
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] getArray() {
		System.out.println("How big would you like the gameboard?");
		System.out.println("Width?");
		int width = input.nextInt();
				
		System.out.println("Length?");
		int length = input.nextInt();
		return gameboard = new int[width][length];
	}
	
	} 

