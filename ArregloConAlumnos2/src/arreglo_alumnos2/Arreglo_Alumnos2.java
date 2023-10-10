package arreglo_alumnos2;
import java.util.*;
public class Arreglo_Alumnos2 {

    public static void main(String[] args) {
        
       Scanner sc1 = new Scanner(System.in);
       Scanner sc2 = new Scanner(System.in);
       
       String nom[]=new String[10];
       int cal[]=new int[10];
       
       int x,y,a,b,c,aux1=0,z;
       int sum=0;
       int prom=0;
       String aux2="";
       
       for(x=0;x<=9;x++){
           sum=0;
           System.out.println("Escribe el nombre del alumno "+(x+1));
           nom[x]=sc1.next();
           
           System.out.println("Ingresa su calificacion");
           cal[x]=sc2.nextInt();
       }
       
       for(b=0;b<=9;b++){
           for(c=b+1;c<=9;c++){
               if(cal[b]<cal[c]){
                   aux1=cal[b];
                   cal[b]=cal[c];
                   cal[c]=aux1;
                   
                   aux2=nom[b];
                   nom[b]=nom[c];
                   nom[c]=aux2;
               }
           }
       }
       
       
       System.out.println("\n" + "" + "\n");
       for(z=0;z<=9;z++){ 
           System.out.println("El alumno: " + nom[z] + "  con calificacion: " + cal[z]);
       }
       
       
    }
    
}
