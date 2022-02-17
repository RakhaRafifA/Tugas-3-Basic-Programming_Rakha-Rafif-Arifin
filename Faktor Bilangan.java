import java.util.Scanner;

class TugasMencariFaktor{
    public static void main(String[] args){
        int bilangan;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Bilangan yang akan di faktorisasi = ");
        bilangan = input.nextInt();
        System.out.println("Bilangan yang akan di faktorisasi = " + bilangan);

        input.close();
    }
}