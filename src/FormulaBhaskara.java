public class FormulaBhaskara {
    public static void main(String[] args) {
        double R1;
        double R2;
        double X = 20.0;
        double Y = 10.1;
        double Z = 6.1;
        double DELTA = (Y*Y) - 4*X*Z;
        R1 = ((Y*-1) + Math.sqrt(DELTA))/(2*X);
        R2 = ((Y*-1) - Math.sqrt(DELTA))/(2*X); 
        
        if(X != 0 && DELTA >= 0){
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
        else{
            System.out.println("Impossível calcular");
       }
   }
}  