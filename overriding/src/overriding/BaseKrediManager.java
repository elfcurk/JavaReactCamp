package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) { // gerçekten hesap döndürmek istediğim için void yerine double verdim
		
		return tutar * 1.18; // 1.18= faiz tutarı (örnek)
	}
}
