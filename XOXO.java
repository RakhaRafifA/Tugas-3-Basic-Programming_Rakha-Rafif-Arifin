import java.util.Scanner;

class TugasXOXO{
    public static void main(String[] args){
        String kata;
        int x = 0, o = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan huruf X dan O = ");
        kata = input.nextLine();
        System.out.println("Anda memasukan kata = " + kata);

        kata = kata.toLowerCase();
        for (int i = 0; i < kata.length(); i++){
            char ch = kata.charAt(i);

            if (ch == 'x' ){
                x++;
            }
            else if (ch == 'o'){
                o++;
            }
        }
        if (x == o){
            System.out.println("True");
        }
        else if (x != o){
            System.out.println("False");
        }

        input.close();
    }
}