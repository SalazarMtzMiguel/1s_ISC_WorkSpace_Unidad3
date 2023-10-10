package arreglo_alumnos;
import java.util.*;
public class Arreglo_Alumnos {

    public static void main(String[] args) {
        int x=0,y=0,a=0,aux1=0,b=0;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String nom[]=new String[10];
        int cal[]=new int[10];
        String aux2="";
        
        for(x=0;x<=9;x++){
            System.out.println("Escribe el nombre del alumno "+ (x+1));
            nom[x]=sc1.nextLine();
            
            System.out.println("Escribe su promedio");
            cal[x]=sc2.nextInt();
        }
        for(x=0;x<=9;x++){ 
            for(a=x+1;a<=9;a++){
                if(cal[x]<cal[a]){
                    aux1=cal[x];
                    cal[x]=cal[a];
                    cal[a]=aux1;
                    
                    aux2=nom[x];
                    nom[x]=nom[a];
                    nom[a]=aux2;
                }
                }
            }
            
            for(x=0;x<=9;x++){
                System.out.println(nom[x]+" "+cal[x]);
            }
            
        }
        
    }


