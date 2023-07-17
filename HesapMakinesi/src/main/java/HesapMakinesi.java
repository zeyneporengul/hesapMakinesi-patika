import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        double input1, input2;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        input1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        input2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println("Toplam: " + (input1+input2));
                break;
            case 2:
                System.out.println("Fark: " + (input1-input2));
                break;
            case 3:
                System.out.println("Çarpım: " + (input1*input2));
                break;
            case 4:
                if(input2==0){
                    System.out.println("İkinci sayı bölme işlemi için 0 olamaz!");
                } else {
                    System.out.println("Bölüm: " + (input1 / input2));
                }
                break;
            default:
                System.out.println("Hatalı seçim!");

        }
    }
}
