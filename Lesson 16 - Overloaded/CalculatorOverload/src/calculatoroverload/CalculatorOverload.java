/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatoroverload;

/**
 * De creat o clasă calculator, care e capabilă să adune, să scadă, să împartă
 * numere de tip int, float, double, long.
 *
 *  În același calculator, adăugați o metodă care e 
 * capabilă să sustragă X procente din număr de tip int, byte, double.
 * @author John Rck
 */
public class CalculatorOverload {

    /**
     * @param args the command line arguments
     */
    public int Sum(int x, int y) {
        return x + y;
    }

    public float Sum(float x, float y) {
        return x + y;
    }

    public double Sum(double x, double y) {
        return x + y;
    }

    public long Sum(long x, long y) {
        return x + y;
    }

    public int Sub(int x, int y) {
        return x - y;
    }

    public float Sub(float x, float y) {
        return x - y;
    }

    public double Sub(double x, double y) {
        return x - y;
    }

    public long Sub(long x, long y) {
        return x - y;
    }

    public int Div(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return -1;
        }
    }

    public float Div(float x, float y) {
        if (y != 0) {
            return x / y;
        } else {
            return -1;
        }
    }

    public double Div(double x, double y) {
        if (y != 0) {
            return x / y;

        } else {
            return -1;
        }
    }

    public long Div(long x, long y) {
        if (y != 0) {
            return x / y;

        } else {
            return -1;
        }
    }

    
    public int procentFrom(int x,int y){
    return (x*y)/100;
    }
    
     public int procentFrom(byte x,byte y){
     return (x*y)/100;
    }
     
     
      public double procentFrom(double x,double y){
      return (x*y)/100;
    }
    
    public static void main(String[] args) {
        CalculatorOverload co = new CalculatorOverload();
// TODO code application logic here
        int x = 10, y = 223;
        byte bx=20,by=120;
        float fx = 23.23f, fy = 45.345f;
        double dx=123.1254145,dy=45234.34563456;
        long lx=123523562363456L,ly=2435235123512351253L;
        
        
        System.out.println("x=" + x + " y=" + y + "  Sum=" + co.Sum(x, y));
        System.out.println("fx=" + fx + " fy=" + fy + "  Sum=" + co.Sum(fx, fy));
        System.out.println("dx=" + dx + " dy=" + dy + "  Sum=" + co.Sum(dx, dy));
        System.out.println("lx=" + lx + " ly=" + ly + "  Sum=" + co.Sum(lx, ly));
        
        System.out.println("x=" + x + " y=" + y + "  Div=" + co.Div(x, y));
        System.out.println("fx=" + fx + " fy=" + fy + "  Div=" + co.Div(fx, fy));
        System.out.println("dx=" + dx + " dy=" + dy + "  Div=" + co.Div(dx, dy));
        System.out.println("lx=" + lx + " ly=" + ly + "  Div=" + co.Div(lx, ly));
        
        System.out.println("x=" + x + " y=" + y + "  Sub=" + co.Sub(x, y));
        System.out.println("fx=" + fx + " fy=" + fy + "  Sub=" + co.Sub(fx, fy));
        System.out.println("dx=" + dx + " dy=" + dy + "  Sub=" + co.Sub(dx, dy));
        System.out.println("lx=" + lx + " ly=" + ly + "  Sub=" + co.Sub(lx, ly));
        
        
         System.out.println( x + "% from " + y + "= " + co.procentFrom(x, y));
          System.out.println( dx + "% from " + dy + "= " + co.procentFrom(dx, dy));
         System.out.println( bx + "% from " + by + "= " + co.procentFrom(bx, by));
         
        
   }

}
