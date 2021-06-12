package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		//System.out.println("öğrenci kredi tutar: " + tutar * 1.18);
		return tutar * 1.10;

	}
}
