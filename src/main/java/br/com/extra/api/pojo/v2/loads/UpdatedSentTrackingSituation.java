package br.com.extra.api.pojo.v2.loads;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcos.tanaka on 06/04/2015.
 */
public class UpdatedSentTrackingSituation implements Serializable {

    private static final long serialVersionUID = 7263715913733337337L;
    private List<Trackings> trackings;
    private Object metadata;

    public List<Trackings> getTrackings() {
        return trackings;
    }

    public Object getMetadata() {
        return metadata;
    }
}
