package categorias;

import java.io.IOException;
import com.google.gson.stream.JsonReader;

import salud.isa.gsonMedDB.ElementoCadenaDeMando;

public class Posologies extends ElementoCadenaDeMando{
	
	private static final String TAGNAME = "posologies";
	private static final String NAME_FIELD_TAGNAME = "description";

	public Posologies(ElementoCadenaDeMando s) {
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
