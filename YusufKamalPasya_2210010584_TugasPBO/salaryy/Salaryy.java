/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salaryy;
import penggajian.*;
import java.util.Scanner;

/**
 *
 * @author HOLW'S
 */
public class Salaryy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        karyawan saya = new karyawan();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan NIK Pegawai :");
        saya.inputNIK(input.nextLine());
        System.out.print("Masukan NAMA Pegawai :");
        saya.inputNAMA(input.nextLine());
        System.out.print("Masukan TELP Pegawai :");
        saya.inputTELP(input.nextLine());
        System.out.print("Masukan ALAMAT Pegawai :");
        saya.inputALAMAT(input.nextLine());
        System.out.print("Masukan Golongan Pegawai :");
        saya.inputGolongan(input.nextLine());
        System.out.print("Masukan Status Nikah(Menikah/Belum) Pegawai :");
        saya.inputStatusNikah(input.nextLine());
        
        if (saya.getStatus().equals("Menikah")){
            System.out.print ("Masukan Jumlah Anak Pegawai :");
            saya.inputJumlahAnak(input.nextInt());
            
        }else{
            saya.inputJumlahAnak(0);
        }
        
        System.out.print("Masukan Masa Kerja Pegawai :");
        saya.inputMasaKerja(input.nextInt()); 
        System.out.println("=====================================");
        System.out.println("Gaji Total Diterima : "+saya.gajiTotal());
            
        }
       
    }
    

