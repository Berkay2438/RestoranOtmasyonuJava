package ilk;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Proje {

	public static void main(String[] args) {
		    System.out.println("****************************************");
		    System.out.println("*           HOŞGELDİNİZ                *");
		    System.out.println("****************************************");
		//kullanıcı hesabı oluşturuyoruz
		    Scanner scanner=new Scanner(System.in);
		        System.out.println("Hesap oluşturun\n");
		        
		        System.out.println("İsminizi girin");
		        String isim = scanner.nextLine(); 
		        
		        
		        System.out.println("Soyadınızı girin");
		        String soyisim = scanner.nextLine();
		       
		       
		        System.out.println("Şifrenizi oluşturun....(sadece rakamlardan oluşmalıdır)");
		        int sifre= scanner.nextInt();
		     //Kullanıcının girdigi sifreleri döngüye sokarak birbiriyle eşleştiriyoruz
		        while (true) {
		            System.out.println("Şifrenizi tekrar girin:");
		            int sifre2 = scanner.nextInt();
		            if (sifre == sifre2) {
		                System.out.printf("Hoşgeldiniz %s %s\n", isim, soyisim);
		                break;
		            }
		            else {
		                System.out.println("HATA: Şifre yanlış. Tekrar deneyiniz.");
		            }
		              
					}
	

		            int toplambiletsayısı;
		            int satılanbiletsayısı;
		            int[] kalanbiletler= {100,100,100,100};
		            int[]kullanicibiletleri= {0,0,0,0};		        
		           
		            while(true){
		    			System.out.println("1- Konser bilgileri");
		    			System.out.println("2- Bilet seçiniz");
		    			System.out.println("3- Bilet bilgilerim");
		    			System.out.println("4- Çıkış");
		    			int secim = scanner.nextInt();
		    			//kullanıcıya konser bilgilerini ekrana yazdırıyoruz
		    			switch (secim) {
		    			case 1:
		    				System.out.println("-----------------------------------------------------------------------------------");
		    				System.out.println(" -1- Sanatçı:Tarkan\n Yer:Wolswagen arena\n Saat:19:00\n Kalan bilet adeti:"+ kalanbiletler[0]);
		    				System.out.println("-----------------------------------------------------------------------------------");
		    				System.out.println(" -2- Sanatçı:MaNga\n Yer:Beşiktaş Park\n Saat:20:00\n Kalan bilet adeti:"+  kalanbiletler[1]);
		    				System.out.println("-----------------------------------------------------------------------------------");
		    				System.out.println(" -3- Sanatçı:Sezen Aksu\n Yer:Harbiye açık hava konser alanı\n Saat:18:00\n Kalan bilet adeti:"+  kalanbiletler[2]);
		    				System.out.println("-----------------------------------------------------------------------------------");
		    				System.out.println(" -4- Sanatçı:Yıldız Tilbe\n Yer:Zorlu PSM\n Saat:20:00\n Kalan bilet adeti:"+  kalanbiletler[3]);
		    				System.out.println("-----------------------------------------------------------------------------------");
		    				
		    				
		    				break;
		    	        
		    			case 2:
		    				System.out.println("Hangi konsere gitmek istersiniz? (Lütfen konser numarasını giriniz):");
		    		        int konserSecim = scanner.nextInt();

		    		        // Kullanıcının girdiği konser numarasına göre ilgili konser bilgilerini yazdırma
		    		        switch (konserSecim) {
		    		            case 1:
		    		                System.out.println("Sanatçı: Tarkan\nYer: Wolswagen arena\nSaat: 19:00\nKalan bilet adeti:"+  kalanbiletler[0]);
		    		                break;
		    		            case 2:
		    		                System.out.println("Sanatçı: MaNga\nYer: Beşiktaş Park\nSaat: 20:00\nKalan bilet adeti:"+  kalanbiletler[1]);
		    		                break;
		    		            case 3:
		    		                System.out.println("Sanatçı: Sezen Aksu\nYer: Harbiye açık hava konser alanı\nSaat: 18:00\nKalan bilet adeti:"+  kalanbiletler[2]);
		    		                break;
		    		            case 4:
		    		                System.out.println("Sanatçı: Yıldız Tilbe\nYer: Zorlu PSM\nSaat: 20:00\nKalan bilet adeti:"+  kalanbiletler[3]);
		    		                break;
		    		            default:
		    		                System.out.println("Geçersiz konser numarası!");
		    		                break;
		    		        }

		    		        System.out.println("Kaç bilet satın almak istiyorsunuz?");
		    		        int biletAdedi = scanner.nextInt();
		    		        
							if (biletAdedi <= kalanbiletler[konserSecim - 1]) {
		                        kalanbiletler[konserSecim - 1] -= biletAdedi;
		                        kullanicibiletleri[konserSecim - 1] += biletAdedi;
		                        System.out.println(biletAdedi + " bilet satın alındı.");
		                    } else {
		                        System.out.println("Yeterli bilet yok! Kalan bilet sayısı: " + kalanbiletler[konserSecim - 1]);
		                    }
		                    
							break;
		    			//kullanıcının aldığı biletleri ekrana yazdırıyoruz
		    			    case 3:
		    			    	 System.out.println("Aldığınız biletler:");
		    	                    System.out.println(" - Tarkan: " + kullanicibiletleri[0] +" bilet");
		    	                    System.out.println(" - MaNga: " + kullanicibiletleri[1] +" bilet");
		    	                    System.out.println(" - Sezen Aksu: " + kullanicibiletleri[2] +" bilet");
		    	                    System.out.println(" - Yıldız Tilbe: " + kullanicibiletleri[3] +" bilet");
		    	                    break;
		    	                    
		    			    case 4:
		    			    	System.out.println("Çıkış yapılıyor...");
		    			    	return;
		    			    	
		    	                }
		    	              }
		    		        }
		                 }
