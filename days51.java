import java.util.Scanner;
public class days51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor hari (1-7): ");
        int hari = scanner.nextInt();  
        
        switch(hari) {  
            case 1:
                System.out.println("SENIN");
                break;
            case 2:
                System.out.println("SELESA");
                break;
            case 3:
                System.out.println("RABU");
                break;
            case 4:
                System.out.println("KAMIS");
                break;
            case 5:
                System.out.println("JUMAT");
                break;
            case 6:
                System.out.println("SABTU");
                break;
            case 7:
                System.out.println("MINGGU");
                break;
            default:
                System.out.println("HARI TIDAK VALID");
        }
    }
}
