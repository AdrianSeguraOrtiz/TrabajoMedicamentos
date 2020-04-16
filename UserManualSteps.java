package categorias;

import java.io.IOException;

import com.google.gson.stream.JsonReader;

import salud.isa.gsonMedDB.ElementoCadenaDeMando;

public class UserManualSteps extends ElementoCadenaDeMando{

	private static final String TAGNAME = "userManualSteps";
	private static final String STEPTITLE_FIELD_TAGNAME = "stepTitle";
	private static final String STEPIMAGE_FIELD_TAGNAME = "stepImage";
	private static final String STEPTEXT_FIELD_TAGNAME = "stepText";
	private static final String INHALERREF_FIELD_TAGNAME = "inhalerRef";

	public UserManualSteps(ElementoCadenaDeMando s) {
		super(s, TAGNAME);
	}
	
	public  String leeParametro(String nombreParametro, JsonReader reader) throws IOException {
		String res = "";
		if (nombreParametro.equals(STEPTITLE_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		else if (nombreParametro.equals(STEPIMAGE_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		else if (nombreParametro.equals(STEPTEXT_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		else if (nombreParametro.equals(INHALERREF_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		return res;
	}
}
