package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) { // ger�ekten hesap d�nd�rmek istedi�im i�in void yerine double verdim
		
		return tutar * 1.18; // 1.18= faiz tutar� (�rnek)
	}
}
