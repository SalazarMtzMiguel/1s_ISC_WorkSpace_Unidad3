package mtra.selene;
import java.util.*;
public class MtraSelene {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int x=0,y=0,a=0,b=0,c=0,contador=0,con=0;
       Double sum=0.0,prom=0.0,suma=0.0;
       
       Double cal[][] = new Double[10][5];
       Double sa[] = new Double[10];
       
       for(x=0;x<=9;x++){   
           sum=0.0;
           for(y=0;y<=4;y++){
               System.out.println("Escribe la calificacion " + (y+1) + " del alumno " + (x+1));
               cal[x][y]=leer.nextDouble();
               
               sum=sum+cal[x][y];
           }
           sa[x]=sum;
       }
       
       for(a=0;a<=9;a++){
           System.out.println("El Promedio del alumno: " + (a+1) +": " + sa[a]/5);
           prom=prom+sa[a]/5;
       }
       prom=prom/10;
       
       for(b=0;b<=9;b++){
           if(cal[b][4]>=70){
               contador=contador+1;
           }
           
           if(cal[b][1]>=70 && cal[b][3]>=70){
               con=con+1;
           }
       }
       
       System.out.println(contador + " Es el total de Alumnos aprobaron la unidad 5");
       System.out.println(con + " Es el total de Alumnos aprobaron las unidades 2 Y 4");
       System.out.println("Promedio: " + prom);
       
    }
    
}
