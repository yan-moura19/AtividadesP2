
public class NotasMoeda {
	public static void main(String[] args) {
		double valor = 91.01 ;
		
	
		
		int notaCem = (int) (valor/100);
		valor = valor%100 ;
		
		int notaCinquenta = (int) (valor/50);
		valor = valor%50 ;
		
		int notaVinte = (int) (valor/20);
		valor = valor%20 ;
		
		int notaDez = (int) (valor/10);
		valor = valor%10 ;
		
		int notaCinco = (int) (valor/5);
		valor = valor%5 ;
		
		int notaDois = (int) (valor/2);
		valor = valor%2 ;
		
		int moedaUm = (int) (valor/1);
		
		
		double moedas = (valor*100)%100;
		
		int moedaCinq = (int) (moedas/50);
		moedas = moedas%50;
		
		int moedaVinte = (int) (moedas/25);
		moedas = moedas%25;
		
		int moedaDez = (int) (moedas/10);
		moedas = moedas%10;
		
		int moedaCinc = (int) (moedas/5);
		moedas = moedas%5;
		
		int moedaUmCent = (int) (moedas/1);
		moedas =moedas%1;
		
		
		System.out.println("NOTAS: ");
		System.out.println(notaCem +  " nota(s) de R$ 100.00 ");
		System.out.println(notaCinquenta +  " nota(s) de R$ 50.00 ");
		System.out.println(notaVinte +  " nota(s) de R$ 20.00 ");
		System.out.println(notaDez +  " nota(s) de R$ 10.00 ");
		System.out.println(notaCinco +  " nota(s) de R$ 5.00 ");
		System.out.println(notaDois + " nota(s) de R$ 2.00 " );
		System.out.println("MOEDAS: ");
		System.out.println(moedaUm + " moeda(s) de R$ 1.00 ");
		System.out.println(moedaCinq + " moeda(s) de R$ 0.50 ");
		System.out.println(moedaVinte + " moeda(s) de R$ 0.25 ");
		System.out.println(moedaDez + " moeda(s) de R$ 0.10 ");
		System.out.println(moedaCinc + " moeda(s) de R$ 0.05 ");
		System.out.println(moedaUmCent + " moeda(s) de R$ 0.01 ");
		
	}
}
