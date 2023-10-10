package arreglode5x5;
import java.util.*;
public class ArregloDe5x5 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        Double num[][] = new Double[5][5];
        Double dc[] = new Double[5];
        Double df[] = new Double[5];
        double sumc = 0.0;
        
        int x,y,a,b,c,d,e,con=0,f,g;
        Double n=0.0,sumf=0.0,sum=0.0,diagonal=0.0,prom=0.0;
        
        System.out.println("Escribe 25 Numeros, Recuerda el acomodo es de 5x5");
        
        for(x=0;x<=4;x++){
            
            for(y=0;y<=4;y++){
                num[x][y] = sc1.nextDouble();
                
                sumc=sumc+num[x][y];
            }
            dc[x]=sumc;
        }
         for(a=0;a<=4;a++){
            sumf=0.0;
            for(b=0;b<=4;b++){
                sumf=sumf+num[b][a];
            }
            
            df[a]=sumf;
        }
        
        for(c=0;c<=4;c++){
            sum=sum+num[c][c];
        }
        diagonal=sum;
        
        for(d=0;d<=4;d++){
            for(e=0;e<=4;e++){
                if(num[d][e]%2==0.0){
                    con++;
                }
            }
        }
        sum=0.0;
        for(f=0;f<=4;f++){
            sum=sum+dc[f];
        }
        prom=sum/5;
        
        for(g=0;g<=4;g++){
            System.out.println("La suma de datos de la columna " + (g+1) + ": " + dc[g]);
            
        }
        
        for(g=0;g<=4;g++){
            System.out.println("La suma de datos por fila " + (g+1) + ": " + df[g]);
            
        }
        
        System.out.println("La suma de datos en diagonal: " + diagonal);
        System.out.println("Las cantidades pares: " + con);
        System.out.println("Promedio: " + prom);
        
    }
    
}
