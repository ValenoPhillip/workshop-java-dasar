import java.util.Scanner;
public class Main {
    public static void operasi(int a, int b, String op) {
      if (op.equals("+")) {
           System.out.println(a+b);
      }
      else if (op.equals("-")) {
            System.out.println(a-b);
       }
       else if (op.equals("x")) {
           System.out.println(a*b);
       }
        else if (op.equals(":")) {
           System.out.println(a/b);
       }
        else {
            System.out.println("input tidak valid");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean kondisi = true;
        while (kondisi) {
           System.out.println("silahkan masukkan nilai a: ");
           int a = Integer.parseInt(scanner.nextLine());

            System.out.println("silahkan masukkan nilai b: ");
            int b = Integer.parseInt(scanner.nextLine());

           System.out.println("masukkan operator: ");
           String op = scanner.nextLine();
           operasi(a, b, op);

            System.out.println("lanjut ?");
            String tanya = scanner.nextLine();
            if(tanya.equals("ya")){
                kondisi = true;
            } else {
                kondisi = false;
            }
        }

        scanner.close();
            //Scanner reload = new Scanners(System.in);


//        Scanner babi = new Scanner(System.in);
//        System.out.println("Masukan Nama Anda Bodoh : ");
//        String Nama = babi.nextLine();
//
//        System.out.println("Halo, " + Nama + "!");
//        if (Nama.equals("Arga")){
//            System.out.println("Man Whore");
//        }
//        else{
//            System.out.println("Biadab Anda");
//        }
//        babi.close();


//        //Vaariable
//        int umur = 32;
//        int tahun_kelahiran = 1990;
//        char simbol = 'A';
//        String kata = "ntah apa";
//
//        //double variable
//        int tahunx = tahun_kelahiran-umur;
//        int tahuny = tahun_kelahiran+umur;
//        int tahunz = tahun_kelahiran / umur;

            //Operator Logika atau dan & bukan
            //   System.out.println(true || true);
            // System.out.println(true || false);
            //  System.out.println(false || true);
            //    System.out.println(false || false);
            //   System.out.println(true && true);
            //   System.out.println(true && false);
            //   System.out.println(false && true);
//        System.out.println(!false);
            //   System.out.println(!true);

/*        System.out.println("Nilai = " + (umur+tahun_kelahiran));
        System.out.println(tahun_kelahiran-umur);
        System.out.println(tahun_kelahiran);
        System.out.println(simbol);
        System.out.println(kata);
        System.out.println(tahunx);
        System.out.println(tahuny);
        System.out.println(tahunz);


        // <> == <= >=
        int a = 31;
        int b = 45;
        System.out.println(a <= b);


        int saldo = 2000;
        int tarik = 1500;

        if (tarik>1000 && tarik <= saldo)
        {
            System.out.println("Saldo Berhasil di tarik tp kena pajak 25%");
        }

        else if (tarik < saldo) {
            System.out.println("Saldo Berhasil Ditarik");
        }
        else {
            System.out.println("Saldo Anda Kurang");

 */
//        int check = 1;
//        while (check <= 10) {
//            System.out.println("looping");
//            check = check + 1;

//        for (int i = 1; i <=10; i++) {
//            System.out.println("looping " + i);

        }
    }