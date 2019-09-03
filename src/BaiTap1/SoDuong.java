package BaiTap1;
import java.util.Scanner;
public class SoDuong {
    int soD;

    void nhapSo(){
       Scanner in = new Scanner(System.in);
       System.out.println("nhap vao so duong: ");
       soD = in.nextInt();
    }

    void tongNSo(){
        int tongNSo;
        for(int i = 1; i < soD+1;i++ ){
            tongNSo +=i;
        }
    }

    void tichNSo(){
        int tichNSo;
        for(int i = 1; i< soD+1; i++){
            tichNSo *=i;
        }
    }

    void tongChan(){
        int tongChan;
        int chan;
        for(int i=2; i<soD+1; i++ ){
            if(i%2==0){
                chan =i;
            }
            tongChan += chan;
        }
    }

    void tongLe(){
        int tongLe;
        int le;
        for(int i=2; i<soD+1; i++ ){
            if(i%2==1){
                le =i;
            }
            tongLe += le;
        }
    }

    void soNT(int sNT){
        int soNT;
        boolean kQua;
        kQua = false;
        for(int i ==2 ;i< soD/2; i++){
            if( )
        }
    }



}
