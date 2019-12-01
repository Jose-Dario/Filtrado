
import java.util.*;
public class Filtrado
{
    public static void main (String [] args){
        Scanner x=new Scanner(System.in);
        String y;
        char z;
        
        System.out.println ("Ingrese la cadena de texto");
        y=x.nextLine();
        
        char [] letra=y.toCharArray();
        
        
        System.out.println ("Ingrese la letra de la cual quiera saber las palabras que inicien por ella");
        z=x.next().charAt(0);
        System.out.println ("Las palabras que inician con la letra ingresada se muestran a continuacion");
        
        for (int k=1;k<letra.length;k++)
        {
            if (letra[k]==z){
                   for (int j=k;j<letra.length&& letra [j]!=' ';j++){
                    System.out.print (letra [j]);
                     }
                        System.out.print (" ");
             
            }
    }
}
}
