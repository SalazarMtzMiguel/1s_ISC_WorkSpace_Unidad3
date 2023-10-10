package empresa_mueblera;
import java.util.*;
public class Empresa_mueblera {

    public static void main(String[] args) {
       Scanner sc1 = new Scanner(System.in);
       Scanner sc2 = new Scanner(System.in);
       String productos[]  = new String[5];
       int ventas[][]= new int[5][9];
       int suma[]=new int[5];
       int mes[]=new int[5];
       int s[]=new int[9];
       int sum=0,mes1=0;
       
       int x=0,y=0,i=0,a=0,b=0,c=0,d=0,e=0,f,g=0,w=0,z=0;
       int aux,mayor=0,aux2;
       String n="";
       
       System.out.println("Escribe los 5 productos de la empresa mueblera");
       
       for(x=0;x<=4;x++){
       productos[x]=sc1.nextLine();
       }
       
       for(i=0;i<=4;i++){
           
       for(y=0;y<=8;y++){
           System.out.println("Escribe cuantas veces en el mes " + (y+1) +" se vendio el producto " + productos[i] );
           ventas[i][y] = sc2.nextInt();
       }
       }
       
       for(a=0;a<=4;a++){
         int  sumas=0;
           for(b=0;b<=8;b++){
               sumas=sumas+ventas[a][b];
           }
           suma[a]=sumas;
       }
       
       for(d=0;d<=4;d++){
           for(e=d+1;e<=4;e++){
               if(suma[d]<suma[e]){
                   aux=suma[e];
                   suma[e]=suma[d];
                   suma[d]=aux;
                   
                   n=productos[e];
                   productos[e]=productos[d];
                   productos[d]=n;
               }
           }
       }
       
              
       System.out.println("El Articulo mas vendido fue " + productos[0] + " con un total de " + suma[0] + " ventas");
       System.out.println("El Articulo menos vendido fue " + productos[4] + " con un total de " + suma[4] + " ventas");
    }
    
}
