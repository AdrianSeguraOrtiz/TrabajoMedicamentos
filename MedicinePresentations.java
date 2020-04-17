package categorias;

import java.io.IOException;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import salud.isa.gsonMedDB.ElementoCadenaDeMando;

public class MedicinePresentations extends ElementoCadenaDeMando{

	private static final String TAGNAME = "medicinePresentations";
	private static final String MEDREF_FIELD_TAGNAME = "medicineRef";
	private static final String ACTINGREF_FIELD_TAGNAME = "activeIngRef";
	private static final String INHREF_FIELD_TAGNAME = "inhalerRef";
	private static final String DOSE_FIELD_TAGNAME = "dose";
	private static final String POSOLOGYREF_FIELD_TAGNAME = "posologyRef";

	public MedicinePresentations(ElementoCadenaDeMando s) {
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
			if (reader.peek() == JsonToken.STRING) {
				res = reader.nextString();
			}
			else if (reader.peek() == JsonToken.BEGIN_ARRAY) {
				reader.beginArray();
				while (reader.hasNext()) {
					res = res + reader.nextString() + ";";
				}
				reader.endArray();
				res = res.substring(0, res.length()-1);
			}
			else {
				res = "No se puede leer";
			}
		}
		else if (nombreParametro.equals(DOSE_FIELD_TAGNAME)) {
			if (reader.peek() == JsonToken.STRING) {
				res = reader.nextString();
			}
			else if (reader.peek() == JsonToken.BEGIN_ARRAY) {
				reader.beginArray();
				while (reader.hasNext()) {
					res = res + reader.nextString() + ";";
				}
				reader.endArray();
				res = res.substring(0, res.length()-1);
			}
			else {
				res = "No se puede leer";
			}
		}
		else if (nombreParametro.equals(POSOLOGYREF_FIELD_TAGNAME )) {
			if (reader.peek() == JsonToken.STRING) {
				res = reader.nextString();
			}
			else if (reader.peek() == JsonToken.BEGIN_ARRAY) {
				reader.beginArray();
				while (reader.hasNext()) {
					res = res + reader.nextString() + ";";
				}
				reader.endArray();
				res = res.substring(0, res.length()-1);
			}
			else {
				res = "No se puede leer";
			}
		}
		return res;
	}
}
