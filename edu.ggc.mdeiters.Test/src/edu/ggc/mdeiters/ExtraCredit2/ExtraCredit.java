
package edu.ggc.mdeiters.ExtraCredit2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/** Class: ExtraCredit
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: May 2, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 * 
 */
public class ExtraCredit {

	private int a = 0;
	private int b = 0;
	private int c = 0;
	private int d = 0;
	private int e = 0;
	private int f = 0;
	private int g = 0;
	private int h = 0;
	private int i = 0;
	private int j = 0;
	private int k = 0;
	private int l = 0;
	private int m = 0;
	private int n = 0;
	private int o = 0;
	private int p = 0;
	private int q = 0;
	private int r = 0;
	private int s = 0;
	private int t = 0;
	private int u = 0;
	private int v = 0;
	private int w = 0;
	private int x = 0;
	private int y = 0;
	private int z = 0;
	private ArrayList<Integer> letters = new ArrayList<Integer>();
	private char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	public void firstLetterCount(File file) {

		try {

			FileReader reader = new FileReader(file);
			Scanner scan = new Scanner(reader);
			int i = 0;
			
			
		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());
		}
	}

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		ExtraCredit ec = new ExtraCredit();
		ec.letters.add(ec.a);
		ec.letters.add(ec.b);
		ec.letters.add(ec.c);
		ec.letters.add(ec.d);
		ec.letters.add(ec.e);
		ec.letters.add(ec.f);
		ec.letters.add(ec.g);
		ec.letters.add(ec.h);
		ec.letters.add(ec.i);
		ec.letters.add(ec.j);
		ec.letters.add(ec.k);
		ec.letters.add(ec.l);
		ec.letters.add(ec.m);
		ec.letters.add(ec.n);
		ec.letters.add(ec.o);
		ec.letters.add(ec.p);
		ec.letters.add(ec.q);
		ec.letters.add(ec.r);
		ec.letters.add(ec.s);
		ec.letters.add(ec.t);
		ec.letters.add(ec.u);
		ec.letters.add(ec.v);
		ec.letters.add(ec.w);
		ec.letters.add(ec.x);
		ec.letters.add(ec.y);
		ec.letters.add(ec.z);

	}

}
