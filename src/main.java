import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int year;
        boolean isError=false;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz :");
        year=input.nextInt();

        if (year >0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year+" Yılı bir artık yıldır.");
                }else {
                    System.out.println(year+" Yılı bir artık yıl değildir.");
                }
            }else{
                if (year % 4 == 0){
                    System.out.println(year+" Yılı bir artık yıldır.");
                }else {
                    System.out.println(year+" Yılı bir artık yıl değildir.");
                }
            }
        }else {
            isError=true;
        }

        if (isError){
            System.out.println("Hatalı bir seçim Yaptınız!");
        }
    }
}
