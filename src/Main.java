import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName, password;
        Scanner sc = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = sc.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = sc.nextLine();
            if (userName.equals("admin") && password.equals("admin")) {
                System.out.println("Merhaba, Bankamıza Hoşgeldiniz :)");
                do {

                    System.out.println("1. Para Yatırma");
                    System.out.println("2. Para Çekme");
                    System.out.println("3. Bakiye Sorgulama");
                    System.out.println("4. Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = sc.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz miktarı giriniz : ");
                            int amount = sc.nextInt();
                            balance += amount;
                            System.out.println("Yeni bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı giriniz : ");
                            int amount2 = sc.nextInt();
                            if (amount2 > balance) {
                                System.out.println("Yetersiz bakiye");
                            } else if (balance > 0 && amount2 > 0) {
                                balance -= amount2;
                                System.out.println("Yeni bakiyeniz : " + balance);
                            } else {
                                System.out.println("Çekmek istediğniz miktar 0'dan büyük olmalıdır.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;
                        default:
                            System.out.println("Yanlış seçim yaptınız");
                            break;
                    }
                } while (select != 4);

            } else {
                System.out.println("Kullanıcı adı veya şifre yanlış");
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke edildi");
                } else {
                    System.out.println("Kalan hak : " + right);
                }
            }
        }
    }
}
