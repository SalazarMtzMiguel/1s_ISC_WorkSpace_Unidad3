package empleados_bono;
import java.util.*;
public class Empleados_Bono {

    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        
        String nom[] = new String[5];
        int horas[][] = new int[5][10];
        Double pago[] = new Double[5];
        Double sum[] = new Double[5];
        Double p[] = new Double[5];
        
        int x=0,y=0,a=0,b=0,c=0,d=0,f=0,g=0;
        Double suma=0.0;
        Double aux=0.0;
        String n="";
        
        for(x=0;x<=4;x++)
        {
        System.out.println("Escribe el nombre del empleado " + (x+1));
        nom[x]=leer1.nextLine();
        
        for(y=0;y<=9;y++)
        {
        System.out.println("Igresa las horas trabajadas del mes " + (y+1));
        horas[x][y]=leer.nextInt();
        }
        System.out.println("¿Cuanto pagaras por hora?");
        pago[x]=leer.nextDouble();
        }
        
        for(a=0;a<=4;a++){
            suma=0.0;
            for(b=0;b<=9;b++){
                suma=suma+horas[a][b];
            }
            sum[a]=suma;
        }
        
        for(c=0;c<=4;c++){
                if(sum[c]>200){
                    p[c]=((sum[c]*pago[c])*0.20);
                }
                
                if(sum[c]>=160 && sum[c]<=200){
                    p[c]=((sum[c]*pago[c])*0.15);
                }
                
                if(sum[c]<160){
                    p[c]=1000.0;
                }
        }
        
        for(f=0;f<=4;f++){
            for(g=f+1;g<=4;g++){
                if(p[f]>p[g]){
                    aux=p[g];
                    p[g]=p[f];
                    p[f]=aux;
                    
                    n=nom[g];
                    nom[g]=nom[f];
                    nom[f]=n;
                }
            }
        }
        
        for(d=0;d<=4;d++){
           System.out.println("El empleado: " + nom[d] + " tuvo un bono de: " + p[d]);
        }
       
    }
    
}
