/*  
    Garcia Milord
    MWF 11:00am-11:50am
    Wei Wang
    PID: 6168616
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathnum;

/**
 *
 * @author garci
 */
public class MathNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Math();
//        MathTwo();
        MathThree();
    }

    public static void Math() //Fixed point iteration
    {
        double error = 0.01;
        double x = 0.5;
        double GxOne;
        double GxTwo;
        double fixP = x;

        while (!(fixP < error)) {
            GxOne = .5 * ((Math.pow(x, 3) + 1));
            fixP = Math.abs(GxOne - x);
            x = GxOne;
            System.out.println("g1 " + x);
        }
        while (!(fixP < error)) {
            GxTwo = (2 / x) * (1 / (Math.pow(x, 2)));
            fixP = Math.abs(GxTwo - x);
            x = GxTwo;
            System.out.println("g2 " + x);
        }

    }

//    public static void MathTwo(){
//        //Newton Method
//        double x = 1;
//        double fun;
//        for(int i= 0; i<=2; i++){
//            fun= x-((Math.pow(x, 2)-4)/(2*x));
//            x=fun;
//            System.out.println("Newton Method "+fun);
//        }
//        //Secant Method
//        double y = 4.0;
//        double z = 0;
//        double funTwo;
//      for(int i= 0; i<=2; i++){
//            funTwo = y-((Math.pow(y,2.0)-4.0)/(((Math.pow(y, 2.0)-4)-(Math.pow(z,2.0)-4.0))/(y-z)));
//            z=y;
//            y=funTwo;
//            
//            
//            System.out.println("Secant Method "+funTwo);
//
//        }
//    }
    public static void MathThree() {
        //Bisection Method part A
        double a = -1, b = 2.0, p;
        double Oldp = 0;
        final double error = .0001;
        double funA, funB, funP;
        double erro;

        do {
            p = (a + b) / 2;
            funA = Math.pow(a, 3) - Math.pow(a, 2) - (2 * a);
            funB = Math.pow(b, 3) - Math.pow(b, 2) - (2 * b);
            funP = Math.pow(p, 3) - Math.pow(p, 2) - (2 * p);

            if (funA * funP < 0) {
                b = p;
            } else {
                a = p;
            }
            erro = Math.abs(p - Oldp);
            Oldp = p;
            System.out.println("Bisection method pt a " + p);
        } while (!(erro < error));

        //Bisection Method pt B
        double A = -3.5, B = 1.0, P;
        double Oldp2 = 0;
        double erro2;
        double funa, funb, funp;
        do {
            P = (A + B) / 2;
            funa = Math.exp(A) - A - 1;
            funb = Math.exp(B) - B - 1;
            funp = Math.exp(P) - P - 1;
            if (funa * funp < 0) {
                B = P;
            } else {
                A = P;
            }
            erro2 = Math.abs(P - Oldp2);
            Oldp2 = P;
            System.out.println("Bisection method pt b " + P);

        } while (!(erro2 < error));

        //Newton Method part a
        double x = 1;
        double xOld = 0;
        double fun;
        double erro3;
        do {
            fun = x - ((Math.pow(x, 3) + Math.pow(x, 2) + (2 * x)) / (3 * Math.pow(x, 2) + (2 * x) + 2));
            erro3 = Math.abs(xOld - x);
            xOld = x;
            x = fun;
            System.out.println("Newton Method pt a " + fun);

        } while (!(erro3 < error));
        //Newton Method part b
        double X = 1;
        double XOld;
        double Fun;
        do {
            Fun = X - (Math.exp(X) - X - 1) / (Math.exp(X) - 1);
            XOld = X;
            X = Fun;
            System.out.println("Newton Method pt b " + Fun);

        } while (!(Math.abs(XOld - X) < error));

        //Secant Method pt a
        double e = 1.0;
        double f = -1.0;
        double point = 0;
        double form;
        double form2;
        double fun2;
        double erroOne;

        do {
            form = Math.pow(e, 3) + Math.pow(e, 2) + (2 * e);

            form2 = Math.pow(f, 3) + Math.pow(f, 2) + (2 * f);

            fun2 = f - ((form2 * (f - e)) / (form2 - form));

            point = Math.pow(fun2, 3) + Math.pow(fun2, 2) + (2 * fun2);
            erroOne = Math.abs(fun2 - f);
            e = f;
            f = fun2;

            System.out.println("Secant Method pt a " + fun2);

        } while (!(erroOne < error));
        //Secant Method pt b
        double E = 4.0;
        double F = -2.0;
        double Point = 0;
        double Form;
        double Form2;
        double Fun2;
        double erroFour;

        do {
            Form = Math.exp(E) - E - 1;

            Form2 = Math.exp(F) - F - 1;

            Fun2 = F - ((Form2 * (F - E)) / (Form2 - Form));

            erroFour = Math.abs(Fun2 - F);

            E = F;

            F = Fun2;

            System.out.println("Secant Method pt b " + Fun2);

        } while (!(erroFour < error));

    }
}
    

