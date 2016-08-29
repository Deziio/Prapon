import java.util.Scanner;
public class RNA2
{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   int cases = sc.nextInt(); 
   int count = 1;
   while(count<=cases){
     
     String rna = sc.next();
     int n = rna.length();
     int min = 0;
     int max = 3;
     int nl = max;
     int lmin = 0;
     int lmax = 3;
     int trnan = 0;
     while(lmax<=n){
       
       String trna = rna.substring(lmin, lmax);
      
       switch(trna){
         case "TTT":{break;}
         case "TTC":{break;}
         case "ACT":{break;}
         case "ACC":{break;}
         case "ACA":{break;}
         case "ACG":{break;}
         case "TGT":{break;}
         case "TGC":{break;}
         default:
       {
           trnan++;
      }
     }
       lmin = lmin+3;
       lmax = lmax+3;
    }
     System.out.print("Case #" + count + ":");
     if(trnan==(n/nl)){
       
       System.out.print(" No interested protein found");
     }
     while(max<=n && trnan!=(n/nl)){
       
       String mrna = rna.substring(min, max);
       switch(mrna){
         
         case "TTT":{
           System.out.print(" Phenylalanine"); break;
         }
         case "TTC":{
           System.out.print(" Phenylalanine"); break;
         }
         case "ACT":{
           System.out.print(" Threonine"); break;
         }
         case "ACC":{
           System.out.print(" Threonine"); break;
         }
         case "ACA":{
           System.out.print(" Threonine"); break;
         }
         case "ACG":{
           System.out.print(" Threonine"); break;
         }
         case "TGT":{
           System.out.print(" Cysteine"); break;
         }
         case "TGC":{
           System.out.print(" Cysteine"); break;
         }
       }
       
       min = min+3;
       max = max+3;
     }
     System.out.println();
     count++;
   }
 }
}
