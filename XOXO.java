import java.util.Scanner;

class Tugas4XO{
    public static void main(String[] args){
        int x, o, lain;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan huruf X dan O = ");
        String kata = input.nextLine();
        System.out.println("Anda memasukan kata = " + kata);

        input.close();

        kata = kata.toLowerCase();
        for (int i = 0; i < kata.length(); i++){
            char ch = kata.charAt(i);

            if (ch == 'x' ){
                x++;
            }
            else if (ch == 'o'){
                o++;
            }
            else (ch != 'x' && ch != 'o'){
                lain++;
            }
        }
        if (x == o){
            System.out.println("True");
        }
        else if (x != o){
            System.out.println("False");
        }
    }
}