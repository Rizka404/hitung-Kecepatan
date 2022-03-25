package pbo.kalkulatorkecepatan;

public class Konektor {
public int jarak;
public int waktu;
public int Total;
private int getJarak() {return jarak;}       
    public double setJarak(double jarak) {return jarak = getJarak();}
              
private int getWaktu() {return waktu;}       
    public void setWaktu(int waktu) {this.waktu = waktu;} 
    
public double hitung(){
    return Total = getJarak()/getWaktu();
    }
}