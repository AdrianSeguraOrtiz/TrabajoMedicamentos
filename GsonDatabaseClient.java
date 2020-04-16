package salud.isa.gsonMedDB;

import java.io.FileNotFoundException;
import java.io.IOException;

import categorias.*;

public class GsonDatabaseClient {

	public static void main(String[] args) {
		try{
			Medicines m = new Medicines (null);
			RescueMedicinePresentations rmp = new RescueMedicinePresentations(m);
			ActiveIngredients ai = new ActiveIngredients(rmp);
			Physiotherapies p = new Physiotherapies(ai);
			Inhalers i = new Inhalers(p);
			Posologies po = new Posologies(i);
			MedicinePresentations mp = new MedicinePresentations(po);
			UserManualPhysioSteps umps = new UserManualPhysioSteps(mp);
			UserManualSteps ums = new UserManualSteps(umps);
			
			DatabaseJSonReader dbjp = new DatabaseJSonReader(ums);

			try {
				System.out.println(dbjp.parse("./datos.json"));
			} finally {
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}

	}

}
