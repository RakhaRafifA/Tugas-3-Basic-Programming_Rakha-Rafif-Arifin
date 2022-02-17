class Main{
    public static void main(String[] args) {
        String line = "Alterra Indonesia";
        int vokal = 0, konsonan = 0, huruf = 0;

        line = line.toLowerCase();
        for (int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                huruf++;
            }
            else if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o' ){
                vokal++;
            }
            else if (ch >= 'a' && ch <= 'z'){
                konsonan++;
            }
        }
        System.out.println("Jumlah Vokal = " + vokal);
        System.out.println("Jumlah Konsonan = " + konsonan);
        System.out.println("Jumlah Huruf = " + huruf);
        
    }
}