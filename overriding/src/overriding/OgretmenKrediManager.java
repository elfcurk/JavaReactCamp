package overriding;

//bankan�n ��retmenlere uygulad��� kredi yap�s�
public class OgretmenKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		//System.out.println("��retmen kredi tutar: " + tutar*1.18);
		return tutar*1.18;
	}
}
