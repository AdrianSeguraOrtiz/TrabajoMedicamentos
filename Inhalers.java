package categorias;

import java.io.IOException;
import com.google.gson.stream.JsonReader;

import salud.isa.gsonMedDB.ElementoCadenaDeMando;

public class Inhalers extends ElementoCadenaDeMando{
	
	private static final String TAGNAME = "inhalers";
	private static final String NAME_FIELD_TAGNAME = "name";
	private static final String IMAGE_FIELD_TAGNAME = "image";

	public Inhalers(ElementoCadenaDeMando s) {
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
