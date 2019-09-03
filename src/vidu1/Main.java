package vidu1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        So3ChuSo xuLySo = new So3ChuSo();
        while (true){
            System.out.print("1.nhap so co 3 chu so\n" );
            System.out.print("2.tong\n ");
            System.out.print("3.chia het 7, dao k doi\n ");
            System.out.print("4.so dep\n ");
            System.out.print("5.moi chon\t ");
            int chon;
            Scanner in = new Scanner(System.in);
            chon = in.nextInt();
            switch (chon){
                case 1: xuLySo.nhapSo();
                    break;
                case 2:xuLySo.tong3CS();
                    System.out.print("tong: "+ xuLySo.tong);
                    break;
                case 3:xuLySo.chia7();
                    System.out.print("chia het 7: " + xuLySo.chia7);
                    break;
                case 4:xuLySo.soDep();
                    System.out.print("so dep: " + xuLySo.soDep);
                    break;
                case 0:System.out.println("bye!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("chi chon 0->3");
            }


        }

    }

}
