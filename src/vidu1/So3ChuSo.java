package vidu1;

import java.util.Scanner;

public class So3ChuSo {
    boolean chia7;
    int so3CS;
    int tong;
    boolean soDep;

    public void nhapSo(){
        Scanner in = new Scanner(System.in);
        System.out.print("nhap vao so co 3 chu so: ");
        so3CS = in.nextInt();
    }

    public void tong3CS(){

        tong = so3CS%10 + (so3CS/10)%10 + so3CS/100;
    }

    public void chia7(){
        int soHT;
        int soDV;
        soHT = so3CS/100;
        soDV = so3CS%10;

        chia7 = false;
        if((so3CS % 7 == 0)&&( soDV==soHT)) {
            chia7 = true;
            System.out.println("chia het cho 7 va doa di k doi:" + chia7);
        }
    }

    public void soDep(){

        soDep = false;
        int soHT;
        int soDV;
        soHT = so3CS/100;
        soDV = so3CS%10;
        if((tong % 2 == 0)&&(soDV==soHT)) {
            soDep = true;
            System.out.println("chia het cho 7 va doa di k doi:" + soDep);
        }

    }


}
