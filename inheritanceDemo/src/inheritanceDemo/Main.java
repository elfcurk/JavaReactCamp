package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
//		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
//		TarimKrediManager tarimKrediManager=new TarimKrediManager();
//		ogretmenKrediManager.hesapla();
//		tarimKrediManager.hesapla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new OgretmenKrediManager());
		krediUI.krediHesapla(new TarimKrediManager());
		krediUI.krediHesapla(new AskerKrediManager());
	}

}
