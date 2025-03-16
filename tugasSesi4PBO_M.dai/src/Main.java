/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author M.DAY
 */
public class Main {
    public static void main(String[] args) {
     
        Bank bankUmum = new Bank();
        bankUmum.transferUang(100000, "1234567890");
        bankUmum.transferUang(1000000, "9876543210", "Mandiri");
        bankUmum.transferUang(800000, "1233445566", "BRI", "Pembayaran tagihan");
        bankUmum.sukuBunga();
        
        System.out.println("\n");

       
        BankBNI bni = new BankBNI();
        bni.transferUang(250000, "1122334455", "BNI"); 
        bni.sukuBunga(); 
        
        System.out.println("\n");

        
        BankBCA bca = new BankBCA();
        bca.transferUang(300000, "6677889900", "BCA"); 
        bca.sukuBunga(); 
    }
}