// File: T07AFraction.java
public class T07AFraction {
    // bagian ide/ algoritma
    static void sumFraction(int e1, int d1, int e2, int d2){
        //method sumFraction() untuk penjumlahan pecahan
        int es = e1 * d2 + e2 * d1;
        int ds = d1 * d2;
        //untuk menampilkan hasil penjumlahan   
        printFraction(es, ds);  
    }

    static void productFraction(int e1, int d1, int e2, int d2){
        //method productFraction() untuk perkalian pecahan
        int ep = e1 * e2;
        int dp = d1 * d2; 
        //untuk menampilkan hasil perkalian   
        printFraction(ep, dp);  
    }

    static int fpb(int a, int b){
        //method untuk menemukan faktor persekutuan terbesar (fpb) sehingga dapat menyederhanakan pecahan
        if(b == 0){
            return a;
        }
        else{
            return fpb(b, a % b);
        }
    }

   static void printFraction(int ex, int dx){
        //method untuk mencetak hasil
        //int faktor ialah nilai fpb untuk menyederhanakan pecahan
        int faktor = fpb(ex, dx);

        //menyederhanakan pecahan
        ex = ex / faktor;
        dx = dx / faktor;

        //menampilkan hasil akhir pecahan
        if (ex == dx || dx == 1) {
            int ey = ex / dx;
            System.out.println(ey);
        }else{
            System.out.println(ex+" / "+dx);
        }
   }

    public static void main(String[] args) {
        //method utama untuk melakukan testcase
        //untuk 1 / 2 + 2 / 3
        sumFraction(1, 2, 2, 3);
        //untuk 1 / 3 + 3 / 4
        sumFraction(1, 3, 3, 4);
        //untuk 1 / 2 * 2 / 3
        productFraction(1, 2, 2, 3);
        //untuk 1 / 4 * 2 / 3
        productFraction(1, 4, 2, 3);
    }
}
