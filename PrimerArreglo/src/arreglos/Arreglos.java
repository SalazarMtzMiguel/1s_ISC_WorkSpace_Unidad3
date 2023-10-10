package arreglos;
import java.util.*;
public class Arreglos {

    public static void main(String[] args) {
        int x=0,y=0;
        String aux="";
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        
        int nums[]=new int[5];
        int edades[]=new int[4];
        double estatura[]=new double[4];
        String noms[][]=new String[5][6];
        String nom[]=new String[4];
        
        for(x=0;x<=4;x++)
        {
          System.out.println("Escribe el nombre " + (x+1)); 
          nom[x]=sc1.next();
          
          System.out.println("Escribe la edad " + (x+1));
          edades[x]=sc2.nextInt();
          
          System.out.println("Escribe la estatura " + (x+1));
          estatura[x]=sc3.nextDouble();
        }
        for(x=0;x<=4;x++)
        {
            System.out.println("La persona: " + nom[x]+" Tiene una edad de: " + edades[x]+" años y una estatura de; " + estatura[x] + "\n");
        }
        
        
        
       
    }
    
}
