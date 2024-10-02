package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		
		StdDraw.setPenColor(0,0,255);
		double[] x = {0.4,0.6,0.5};
        double[] y = {0.4,0.4,0.6};
		StdDraw.filledPolygon(x,y);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
		
	}
}