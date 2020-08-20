package dizikarakter;

import java.util.Scanner;

public class dizi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sevdiðiniz dizi karakterine göre karakter analizi : \n");
		System.out.println("**************************************************************\n");
		System.out.println("Sevdiðiniz diziyi seçiniz : \n"
				+ "1-) Game of Thrones\n"
				+ "2-) Breaking Bad\n"
				+ "3-) Prison Break\n"
				+ "4-) OZ\n"
				+ "5-) La Casa De Papel\n"
				+ "6-) Shamaless");
		int x=scanner.nextInt();
		scanner.nextLine();
		
		switch (x) {
		case 1:
			System.out.println("Sevdiðiniz karakteri seçin : \n"
					+ "a-) Jamie Lannister\n"
					+ "b-) Jon Snow\n"
					+ "c-) Khaleesi");
			String y=scanner.nextLine();
			if(y.equals("a")) {
				System.out.print("Þerefsiz ama delikanlý bir subaysýn.");
			}
			else if(y.equals("b")) {
				System.out.println("Tek derdi görevi olan bir Türk askerisin.");
			}
			else if (y.equals("c")) {
				System.out.println("Kaþ yapayým derken göz çýkartan cinstensin.");
			}
			else {
				System.out.println("Hatalý giriþ.");
			}
			break;
		case 2:
			System.out.println("Sevdiðiniz dizi karakterini seçin : \n"
					+ "a-) Walter White\n"
					+ "b-) Jesse Pinkman\n"
					+ "c-) Mike Ermanthouth\n");
			String y2=scanner.nextLine();
			if(y2.equals("a")) {
				System.out.println("Paragöz ve idealist birisin.");
			}
			else if(y2.equals("b")) {
				System.out.println("Parada gözü olmayan ama potansiyelini kötü kullanan birisin.");
			}
			else if(y2.equals("c")) {
				System.out.println("Tam bir soðukkanlý görev adamýsýn.");
			}
			else {
				System.out.println("Hatalý giriþ.");
			}
			break;
		case 3:
			System.out.println("Sevdiðiniz dizi karakterini seçin : \n"
					+ "a-) Michael Scofield\n"
					+ "b-) Tbag\n"
					+ "c-) Lincoln Burrows\n");
			String y3=scanner.nextLine();
			if(y3.equals("a")) {
				System.out.println("Dostum sen tam bir dahisin.");
			}
			else if(y3.equals("b")) {
				System.out.println("Sen tam bir psikopatsýn.");
			}
			else if(y3.equals("c")) {
				System.out.println("Eski usül pat küt adamýsýn.");
			}
			else {
				System.out.println("Hatalý seçim.");
			}
			break;
		case 4:
			System.out.println("Sevdiðiniz dizi karakterini seçin : \n"
					+ "a-) Tobias Beacher\n"
					+ "b-) Chris Keller\n"
					+ "c-) Ryan O'relly\n");
			String y4=scanner.nextLine();
			if(y4.equals("a")) {
				System.out.println("Saf temizsin ama hayat seni bozabilir.");
			}
			else if(y4.equals("b")) {
				System.out.println("Sen çok büyük orospu çocuðusun.");
			}
			else if(y4.equals("c")) {
				System.out.println("Çok çýkarcý bi adamsýn.");
			}
			else {
				System.out.println("Hatalý giriþ.");
			}
			break;
		case 5:
			System.out.println("Sevdiðiniz dizi karakterini seçin : \n"
					+ "a-) Professor\n"
					+ "b-) Tokyo\n"
					+ "c-) Denver\n");
			String y5=scanner.nextLine();
			if(y5.equals("a")) {
				System.out.println("Çok zeki ve analitik düþünebilen bi adamsýn.");
			}
			else if(y5.equals("b")) {
				System.out.println("Sexi ve bunu kullanmayý bilen bir kadýnsýn.");
			}
			else if(y5.equals("c")) {
				System.out.println("Boþ gürültü gerizekalý bi adamsýn.");
			}
			else {
				System.out.println("Hatalý giriþ.");
			}
			break;
		case 6:
			System.out.println("Sevdiðiniz dizi karakterini seçin : \n"
					+ "a-) Fiona Gallagher\n"
					+ "b-) Frank Gallagher\n"
					+ "c-) Kevin Ball\n");
			String y6=scanner.nextLine();
			if(y6.equals("a")) {
				System.out.println("Büyük bir sorumluluk altýndan kalkabilecek birisin.");
			}
			else if(y6.equals("b")) {
				System.out.println("Alkol için aileni bile satacak bi adamsýn.");
			}
			else if(y6.equals("c")) {
				System.out.println("Çok tatlý ve ailesine düþkün bir adamsýn.");
			}
			else {
				System.out.println("Hatalý giriþ.");
			}
			break;
		default:
			System.out.println("Hatalý giriþ.");
			break;
		}
	}

}
