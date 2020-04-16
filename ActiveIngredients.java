package categorias;

import java.io.IOException;
import com.google.gson.stream.JsonReader;

import salud.isa.gsonMedDB.ElementoCadenaDeMando;

public class ActiveIngredients extends ElementoCadenaDeMando{
	
	private static final String TAGNAME = "activeIngredients";
	private static final String NAME_FIELD_TAGNAME = "name";

	public ActiveIngredients(ElementoCadenaDeMando s) {
		super(s, TAGNAME);
	}
	
	public  String leeParametro(String nombreParametro, JsonReader reader) throws IOException {
		String res = "";
		if (nombreParametro.equals(NAME_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		return res;
	}


}
