package br.com.extra.api.pojo.v2.loads;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdatedSentTrackingSituation implements Serializable {

    private static final long serialVersionUID = -3825565326944504810L;
    private List<Trackings> trackings;
    private Object metadata;

    public List<Trackings> getTrackings() {
        return trackings;
    }

    public void setTrackings(List<Trackings> trackings) {
        this.trackings = trackings;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }
}
