package categorias;

import java.io.IOException;

import com.google.gson.stream.JsonReader;

import salud.isa.gsonMedDB.ElementoCadenaDeMando;

public class RescueMedicinePresentations extends ElementoCadenaDeMando{

	private static final String TAGNAME = "rescueMedicinePresentations";
	private static final String MEDREF_FIELD_TAGNAME = "medicineRef";
	private static final String ACTINGREF_FIELD_TAGNAME = "activeIngRef";
	private static final String INHREF_FIELD_TAGNAME = "inhalerRef";
	private static final String DOSE_FIELD_TAGNAME = "dose";

	public RescueMedicinePresentations(ElementoCadenaDeMando s) {
		super(s, TAGNAME);
	}
	
	public  String leeParametro(String nombreParametro, JsonReader reader) throws IOException {
		String res = "";
		if (nombreParametro.equals(MEDREF_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		else if (nombreParametro.equals(ACTINGREF_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		else if (nombreParametro.equals(INHREF_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		else if (nombreParametro.equals(DOSE_FIELD_TAGNAME)) {
			res = reader.nextString();
		}
		return res;
	}
}
