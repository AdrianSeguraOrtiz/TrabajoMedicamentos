package salud.isa.gsonMedDB;

import java.io.IOException;
import com.google.gson.stream.JsonReader;

public abstract class ElementoCadenaDeMando {
	
	protected ElementoCadenaDeMando sig;
	private String tagName;
	
	public ElementoCadenaDeMando(ElementoCadenaDeMando s, String tagName) {
		sig = s;
		this.tagName = tagName;
	}
	
	public StringBuffer leeObjetos(String name, JsonReader reader) throws IOException {
		StringBuffer res = new StringBuffer("");
		if (name.equals(tagName)) {
			StringBuffer data = new StringBuffer();
			reader.beginArray();
			while (reader.hasNext()) {
				reader.beginObject();
				data.append(leeDentro(reader)).append("\n");
				reader.endObject();
			}
			data.append("\n");
			reader.endArray();
			res = data;
		}
		else {
			try {
				res = sig.leeObjetos(name, reader);
			}
			catch (NullPointerException npe) {
				reader.skipValue();
				System.err.println("Category " + name + " not processed.");
			}
		}
		return res;
	}
	
	private String leeDentro(JsonReader reader) throws IOException {
		String res = "";
		while(reader.hasNext()){
			String nombreParametro = reader.nextName();
			res = res + leeParametro(nombreParametro, reader) + ";";
			if (res.equals("")) {
				reader.skipValue();
			}
		}
		return res.substring(0, res.length()-1);
	}
	
	public abstract String leeParametro(String nombreParametro, JsonReader reader) throws IOException;
}
