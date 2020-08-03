
package my-package;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Brussels",
    "London",
    "Paris",
    "Amsterdam"
})
public class Cities implements Serializable
{

    @JsonProperty("Brussels")
    private List<Brussel> brussels = new ArrayList<Brussel>();
    @JsonProperty("London")
    private List<London> london = new ArrayList<London>();
    @JsonProperty("Paris")
    private List<Pari> paris = new ArrayList<Pari>();
    @JsonProperty("Amsterdam")
    private List<Amsterdam> amsterdam = new ArrayList<Amsterdam>();
    private final static long serialVersionUID = 9032415929060841452L;

    @JsonProperty("Brussels")
    public List<Brussel> getBrussels() {
        return brussels;
    }

    @JsonProperty("Brussels")
    public void setBrussels(List<Brussel> brussels) {
        this.brussels = brussels;
    }

    @JsonProperty("London")
    public List<London> getLondon() {
        return london;
    }

    @JsonProperty("London")
    public void setLondon(List<London> london) {
        this.london = london;
    }

    @JsonProperty("Paris")
    public List<Pari> getParis() {
        return paris;
    }

    @JsonProperty("Paris")
    public void setParis(List<Pari> paris) {
        this.paris = paris;
    }

    @JsonProperty("Amsterdam")
    public List<Amsterdam> getAmsterdam() {
        return amsterdam;
    }

    @JsonProperty("Amsterdam")
    public void setAmsterdam(List<Amsterdam> amsterdam) {
        this.amsterdam = amsterdam;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("brussels");
        sb.append('=');
        sb.append(((this.brussels == null)?"<null>":this.brussels));
        sb.append(',');
        sb.append("london");
        sb.append('=');
        sb.append(((this.london == null)?"<null>":this.london));
        sb.append(',');
        sb.append("paris");
        sb.append('=');
        sb.append(((this.paris == null)?"<null>":this.paris));
        sb.append(',');
        sb.append("amsterdam");
        sb.append('=');
        sb.append(((this.amsterdam == null)?"<null>":this.amsterdam));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.london == null)? 0 :this.london.hashCode()));
        result = ((result* 31)+((this.paris == null)? 0 :this.paris.hashCode()));
        result = ((result* 31)+((this.brussels == null)? 0 :this.brussels.hashCode()));
        result = ((result* 31)+((this.amsterdam == null)? 0 :this.amsterdam.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cities) == false) {
            return false;
        }
        Cities rhs = ((Cities) other);
        return (((((this.london == rhs.london)||((this.london!= null)&&this.london.equals(rhs.london)))&&((this.paris == rhs.paris)||((this.paris!= null)&&this.paris.equals(rhs.paris))))&&((this.brussels == rhs.brussels)||((this.brussels!= null)&&this.brussels.equals(rhs.brussels))))&&((this.amsterdam == rhs.amsterdam)||((this.amsterdam!= null)&&this.amsterdam.equals(rhs.amsterdam))));
    }

}
