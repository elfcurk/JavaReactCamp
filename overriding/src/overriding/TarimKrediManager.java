package overriding;

public class TarimKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		// System.out.println("tar�m kredi tutar: " + tutar * 1.18);
		return tutar * 1.18;
	}

}
