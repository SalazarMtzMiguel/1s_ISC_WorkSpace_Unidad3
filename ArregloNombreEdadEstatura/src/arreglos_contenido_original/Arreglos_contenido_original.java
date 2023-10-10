package arreglos_contenido_original;
import java.util.*;
public class Arreglos_contenido_original {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Scanner leer1=new Scanner(System.in);
        
        int x=0,op=0,y=0,aux=0,est=0,ed=0,a=0;
        String n="";
        
        String nom[]=new String[5];
        int edad[]=new int[5];
        int estatura[]=new int[5];
        
        for(x=0;x<=4;x++)
        {
        System.out.println("Escribe el nombre de la persona "+(x+1));
        nom[x]=leer1.nextLine();
        
        System.out.println("Escribe la edad del sujeto "+(x+1));
        edad[x]=leer.nextInt();
        
        System.out.println("Escribe la estatura de la persona "+(x+1));
        estatura[x]=leer.nextInt();
        }
        
        System.out.println("¿Que quieres hacer?" + "\n" + "1.-Mostrar los datos ingresados" + "\n"
        + "2.-Mostrar edades de menor a mayor" + "\n" + "3.-Mostrar estatura de mayor a menor");
        op=leer.nextInt();
        
        
        switch(op)
        {
            case 1:
            {
                
                for(x=0;x<=4;x++)
                {
                    System.out.println(nom[x]+" tiene una edad de "+edad[x]+" y una estatura de "+estatura[x]);
                }
                
                
                    
                
                
                break;
            }
            case 2:
            {
                for(a=0;a<=4;a++)
                {
                    for(y=a+1;y<=4;y++)
                    {
                        if(edad[a]>edad[y])
                        {
                            aux=edad[a];
                            edad[a]=edad[y];
                            edad[y]=aux;
                            
                            n=nom[a];
                            nom[a]=nom[y];
                            nom[y]=n;
                            
                            est=estatura[a];
                            estatura[a]=estatura[y];
                            estatura[y]=est;
                        }
                    }
                }
                for(x=0;x<=4;x++)
                {
                    System.out.println(nom[x]+" tiene una edad de "+edad[x]+" y una estatura de "+estatura[x]);
                }
                
                break;
            }
            case 3:
            {
                for(a=0;a<=4;a++)
                {
                    for(y=a+1;y<=4;y++)
                    {
                        if(estatura[a]<estatura[y])
                        {
                            aux=estatura[a];
                            estatura[a]=estatura[y];
                            estatura[y]=aux;
                            
                            n=nom[a];
                            nom[a]=nom[y];
                            nom[y]=n;
                            
                            ed=edad[a];
                            edad[a]=edad[y];
                            edad[y]=ed;
                        }
                    }
                }
                for(x=0;x<=4;x++)
                {
                    System.out.println(nom[x]+" tiene una edad de "+edad[x]+" y una estatura de "+estatura[x]);
                }
                
                break;
            }
        }
        
    }
    
}
