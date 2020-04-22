package categorias;

import java.io.IOException;
import com.google.gson.stream.JsonReader;

import salud.isa.gsonMedDB.ElementoCadenaDeMando;

public class Physiotherapies extends ElementoCadenaDeMando{
	
	private static final String TAGNAME = "physiotherapies";
	private static final String NAME_FIELD_TAGNAME = "name";
	private static final String IMAGE_FIELD_TAGNAME = "image";

	public Physiotherapies(ElementoCadenaDeMando s) {
		super(s, TAGNAME);
	}
	
	public  String leeParametro(String nombreParametro, JsonReader reader) throws IOException {
		String res = "";
		if (nombreParametro.equals(NAME_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		else if(nombreParametro.equals(IMAGE_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		return res;
	}
	
}
