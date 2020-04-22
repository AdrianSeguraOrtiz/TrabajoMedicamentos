package categorias;

import java.io.IOException;
import com.google.gson.stream.JsonReader;

import salud.isa.gsonMedDB.ElementoCadenaDeMando;

public class Medicines extends ElementoCadenaDeMando{
	
	private static final String TAGNAME = "medicines";
	private static final String NAME_FIELD_TAGNAME = "name";

	public Medicines(ElementoCadenaDeMando s) {
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
