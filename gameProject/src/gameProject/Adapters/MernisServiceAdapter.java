package gameProject.Adapters;

import java.rmi.RemoteException;

import gameProject.Abstract.PlayerCheckService;
import gameProject.Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{
	
	KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
	boolean result ;
	@Override
	public boolean checkIfRealPerson(Player player) {
		try {
			result = proxy.TCKimlikNoDogrula(
					Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(),
					player.getDateOfBirth().getYear());

		} catch (RemoteException e) {
			result = false;
			System.out.println("Clientte hata");
			e.printStackTrace();
		}
		return result;
	}

}
