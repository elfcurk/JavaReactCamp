package overriding;

public class TarimKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		// System.out.println("tarım kredi tutar: " + tutar * 1.18);
		return tutar * 1.18;
	}

}
