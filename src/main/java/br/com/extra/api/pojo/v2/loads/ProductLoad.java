package br.com.extra.api.pojo.v2.loads;

import br.com.extra.api.pojo.Pojos;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.File;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductLoad extends Pojos {

	private static final long serialVersionUID = 7745159119155280847L;

	/** String que contém o JSON para compactação. **/
	private String productsJson;

	/** Arquivo JSON sem compactação. **/
	private File jsonFile;

	/** Arquivo JSON compactado. **/
	private File gzFile;

	public File getGzFile() {
		return gzFile;
	}

	public File getJsonFile() {
		return jsonFile;
	}

	public String getProductsJson() {
		return productsJson;
	}

	public void setGzFile(File gzFile) {
		this.gzFile = gzFile;
	}

	public void setJsonFile(File jsonFile) {
		this.jsonFile = jsonFile;
	}

	public void setProductsJson(String productsJson) {
		this.productsJson = productsJson;
	}

}
