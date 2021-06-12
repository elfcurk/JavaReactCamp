package overriding;

//bankanın öğretmenlere uyguladığı kredi yapısı
public class OgretmenKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		//System.out.println("öğretmen kredi tutar: " + tutar*1.18);
		return tutar*1.18;
	}
}
