package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	
	private static int[] towers;
	public final static int TOWER_AMOUNT = 3;
	public final static int TOWER_1 = 0;
	public final static int TOWER_2 = 1;
	public final static int TOWER_3 = 2;
	public static String info = "";
	
	public static void hanoiTower(int n) throws IOException {
		towers = new int[TOWER_AMOUNT];
		towers[TOWER_1] = n;
		towers[TOWER_2] = 0;
		towers[TOWER_3] = 0;
		
		/**
		System.out.print(towers[TOWER_1]);
		System.out.print(towers[TOWER_2]);
		System.out.print(towers[TOWER_3]);
		System.out.println();*/
		
		info += towers[0];
		info += towers[1];
		info += towers[2] + "\n";
		hanoi(n, 0, 1, 2, towers);
	}
	
	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String amountCases;
        amountCases = br.readLine();
        int intAmountCases = Integer.parseInt(amountCases);
        
        String amountDisks;
        int intAmountDisks;
        
        
        for(int i = 0; i < intAmountCases; i++) {
        	amountDisks = br.readLine();
        	intAmountDisks = Integer.parseInt(amountDisks);
        	hanoiTower(intAmountDisks);
        }
        
        System.out.println(info);
        br.close();
	}
	
	
	public static void hanoi(int k, int origin, int target, int aux, int[] towers) throws IOException {
		
		if(k > 0) {
			hanoi(k-1, origin, aux, target, towers);
			towers[origin]--;
			towers[aux]++;
			
			info += towers[0];
			info += towers[1];
			info += towers[2] + "\n";
			hanoi(k-1, aux, origin, target, towers);
			
		} else if(k == 0){
			
			/**
			info += "\n" + "\n";
			System.out.println("Siiiiiiiiuuuuuuuuuuu");*/
		}
	}
	
}