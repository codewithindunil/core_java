
package surfacearea;

import java.util.Scanner;


public class SurfaceArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float length, width, height, volume, surfaceArea;
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("length :");
        length = in.nextFloat();
        
        System.out.println("width :");
        width = in.nextFloat();
        
        System.out.println("height :");
        height = in.nextFloat();
        
        volume = length * width * height;
        
        surfaceArea = 2*(length*width + width*height + length*height);
        
        System.out.println("Volume :  " + volume);
        System.out.println("Area   :  " + surfaceArea);
        
    }
    
}
