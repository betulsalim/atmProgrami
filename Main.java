import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String userName,password;
        int kalanHak=3;
        int total=1500;
        int secim ;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();

        System.out.println("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("dev123")){
            System.out.println("Merhaba, kodluyoruz bankasına hoşgeldiniz.");
            System.out.println("Lütfen yapmak istediğiniz seçimi seçiniz: ");
            System.out.println("1-Para Yatırma \n 2-Para Çekme \n 3-Bakiye Sorgulama \n 4-Çıkış Yap");
            secim = input.nextInt();
            switch (secim){
                case 1:
                    System.out.println("Para Miktarı: ");
                    int yatirilacakPara = input.nextInt();
                    total += yatirilacakPara;
                    System.out.println("Güncel paranız: "+total);
                    break;
                case 2:
                    System.out.println("Para miktarı: ");
                    yatirilacakPara = input.nextInt();
                    if(yatirilacakPara > total){
                        System.out.println("Yetersiz Bakiye");
                    }
                    else{
                        total -= yatirilacakPara;
                        System.out.println("Kalan paranız: "+total);
                    }
                    break;
                case 3:
                    System.out.println("Bakiyeniz: "+total);
                    break;
                case 4:
                    System.out.println("Tekrar Görüşmek Üzere");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız.");
            }

        }
        else{
            kalanHak --;
            System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyiniz.");
            if(kalanHak==0){
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");

            }
            else{
                System.out.println("Kalan hakkınız: "+kalanHak);
            }
        }
    }
}
