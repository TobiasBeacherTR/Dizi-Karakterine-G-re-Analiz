package dizikarakter;

import java.util.Scanner;

public class dizi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sevdi�iniz dizi karakterine g�re karakter analizi : \n");
		System.out.println("**************************************************************\n");
		System.out.println("Sevdi�iniz diziyi se�iniz : \n"
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
			System.out.println("Sevdi�iniz karakteri se�in : \n"
					+ "a-) Jamie Lannister\n"
					+ "b-) Jon Snow\n"
					+ "c-) Khaleesi");
			String y=scanner.nextLine();
			if(y.equals("a")) {
				System.out.print("�erefsiz ama delikanl� bir subays�n.");
			}
			else if(y.equals("b")) {
				System.out.println("Tek derdi g�revi olan bir T�rk askerisin.");
			}
			else if (y.equals("c")) {
				System.out.println("Ka� yapay�m derken g�z ��kartan cinstensin.");
			}
			else {
				System.out.println("Hatal� giri�.");
			}
			break;
		case 2:
			System.out.println("Sevdi�iniz dizi karakterini se�in : \n"
					+ "a-) Walter White\n"
					+ "b-) Jesse Pinkman\n"
					+ "c-) Mike Ermanthouth\n");
			String y2=scanner.nextLine();
			if(y2.equals("a")) {
				System.out.println("Parag�z ve idealist birisin.");
			}
			else if(y2.equals("b")) {
				System.out.println("Parada g�z� olmayan ama potansiyelini k�t� kullanan birisin.");
			}
			else if(y2.equals("c")) {
				System.out.println("Tam bir so�ukkanl� g�rev adam�s�n.");
			}
			else {
				System.out.println("Hatal� giri�.");
			}
			break;
		case 3:
			System.out.println("Sevdi�iniz dizi karakterini se�in : \n"
					+ "a-) Michael Scofield\n"
					+ "b-) Tbag\n"
					+ "c-) Lincoln Burrows\n");
			String y3=scanner.nextLine();
			if(y3.equals("a")) {
				System.out.println("Dostum sen tam bir dahisin.");
			}
			else if(y3.equals("b")) {
				System.out.println("Sen tam bir psikopats�n.");
			}
			else if(y3.equals("c")) {
				System.out.println("Eski us�l pat k�t adam�s�n.");
			}
			else {
				System.out.println("Hatal� se�im.");
			}
			break;
		case 4:
			System.out.println("Sevdi�iniz dizi karakterini se�in : \n"
					+ "a-) Tobias Beacher\n"
					+ "b-) Chris Keller\n"
					+ "c-) Ryan O'relly\n");
			String y4=scanner.nextLine();
			if(y4.equals("a")) {
				System.out.println("Saf temizsin ama hayat seni bozabilir.");
			}
			else if(y4.equals("b")) {
				System.out.println("Sen �ok b�y�k orospu �ocu�usun.");
			}
			else if(y4.equals("c")) {
				System.out.println("�ok ��karc� bi adams�n.");
			}
			else {
				System.out.println("Hatal� giri�.");
			}
			break;
		case 5:
			System.out.println("Sevdi�iniz dizi karakterini se�in : \n"
					+ "a-) Professor\n"
					+ "b-) Tokyo\n"
					+ "c-) Denver\n");
			String y5=scanner.nextLine();
			if(y5.equals("a")) {
				System.out.println("�ok zeki ve analitik d���nebilen bi adams�n.");
			}
			else if(y5.equals("b")) {
				System.out.println("Sexi ve bunu kullanmay� bilen bir kad�ns�n.");
			}
			else if(y5.equals("c")) {
				System.out.println("Bo� g�r�lt� gerizekal� bi adams�n.");
			}
			else {
				System.out.println("Hatal� giri�.");
			}
			break;
		case 6:
			System.out.println("Sevdi�iniz dizi karakterini se�in : \n"
					+ "a-) Fiona Gallagher\n"
					+ "b-) Frank Gallagher\n"
					+ "c-) Kevin Ball\n");
			String y6=scanner.nextLine();
			if(y6.equals("a")) {
				System.out.println("B�y�k bir sorumluluk alt�ndan kalkabilecek birisin.");
			}
			else if(y6.equals("b")) {
				System.out.println("Alkol i�in aileni bile satacak bi adams�n.");
			}
			else if(y6.equals("c")) {
				System.out.println("�ok tatl� ve ailesine d��k�n bir adams�n.");
			}
			else {
				System.out.println("Hatal� giri�.");
			}
			break;
		default:
			System.out.println("Hatal� giri�.");
			break;
		}
	}

}
