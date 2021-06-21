package CoffeeShop.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import CoffeeShop.entities.concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckServices {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;

		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationality()),
					customer.getFirstName().toUpperCase(new Locale("tr")),
					customer.getLastName().toUpperCase(new Locale("tr")), customer.getDateOfBirth());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
