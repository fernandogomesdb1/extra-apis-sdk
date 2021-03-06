package br.com.extra.api.pojo.v2.loads;

import br.com.extra.api.pojo.v2.loads.Error;
import br.com.extra.api.pojo.v2.loads.Product;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsDetail extends Product {

    private List<Error> errors;

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
