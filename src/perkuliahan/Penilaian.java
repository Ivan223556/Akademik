/**
*
*/
package perkuliahan;


public class Penilaian {
    public String hitungNilaiHuruf (int nilaiFisika, int nilaiKimia, int nilaiBiologi, int nilaiMatematika, int nilaiKomputer){
        
        String nilaiDalamHuruf;
        
        if ((nilaiFisika + nilaiKimia + nilaiBiologi + nilaiMatematika + nilaiKomputer) / 5 >= 90 && (nilaiFisika + nilaiKimia + nilaiBiologi + nilaiMatematika + nilaiKomputer) / 5 <= 100 ){
            nilaiDalamHuruf = "A";
        
        } else if ((nilaiFisika + nilaiKimia + nilaiBiologi + nilaiMatematika + nilaiKomputer) / 5 >= 80 && (nilaiFisika + nilaiKimia + nilaiBiologi + nilaiMatematika + nilaiKomputer) / 5 <= 89 ){
            nilaiDalamHuruf = "B";
           
        } else if ((nilaiFisika + nilaiKimia + nilaiBiologi + nilaiMatematika + nilaiKomputer) / 5 >= 70 && (nilaiFisika + nilaiKimia + nilaiBiologi + nilaiMatematika + nilaiKomputer) / 5 <= 79 ){
            nilaiDalamHuruf = "C";
            
        } else if ((nilaiFisika + nilaiKimia + nilaiBiologi + nilaiMatematika + nilaiKomputer) / 5 >= 60 && (nilaiFisika + nilaiKimia + nilaiBiologi + nilaiMatematika + nilaiKomputer) / 5 <= 69 ){
            nilaiDalamHuruf = "D";
            
        } else if ((nilaiFisika + nilaiKimia + nilaiBiologi + nilaiMatematika + nilaiKomputer) / 5 >= 0 && (nilaiFisika + nilaiKimia + nilaiBiologi + nilaiMatematika + nilaiKomputer) / 5 <= 59 ){
            nilaiDalamHuruf = "E";    
        
        } else {
            nilaiDalamHuruf = "tidak dari kelima tsb";
            
        }
        
        return nilaiDalamHuruf;
        
        
    }
    
}
