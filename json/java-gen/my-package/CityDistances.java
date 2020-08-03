
package my-package;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "desc",
    "updated",
    "uptodate",
    "author",
    "cities"
})
public class CityDistances implements Serializable
{

    @JsonProperty("desc")
    private String desc;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("uptodate")
    private Boolean uptodate;
    @JsonProperty("author")
    private Object author;
    @JsonProperty("cities")
    private Cities cities;
    private final static long serialVersionUID = 1566636091754437433L;

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("uptodate")
    public Boolean getUptodate() {
        return uptodate;
    }

    @JsonProperty("uptodate")
    public void setUptodate(Boolean uptodate) {
        this.uptodate = uptodate;
    }

    @JsonProperty("author")
    public Object getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Object author) {
        this.author = author;
    }

    @JsonProperty("cities")
    public Cities getCities() {
        return cities;
    }

    @JsonProperty("cities")
    public void setCities(Cities cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CityDistances.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("updated");
        sb.append('=');
        sb.append(((this.updated == null)?"<null>":this.updated));
        sb.append(',');
        sb.append("uptodate");
        sb.append('=');
        sb.append(((this.uptodate == null)?"<null>":this.uptodate));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("cities");
        sb.append('=');
        sb.append(((this.cities == null)?"<null>":this.cities));
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
        result = ((result* 31)+((this.uptodate == null)? 0 :this.uptodate.hashCode()));
        result = ((result* 31)+((this.cities == null)? 0 :this.cities.hashCode()));
        result = ((result* 31)+((this.updated == null)? 0 :this.updated.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CityDistances) == false) {
            return false;
        }
        CityDistances rhs = ((CityDistances) other);
        return ((((((this.uptodate == rhs.uptodate)||((this.uptodate!= null)&&this.uptodate.equals(rhs.uptodate)))&&((this.cities == rhs.cities)||((this.cities!= null)&&this.cities.equals(rhs.cities))))&&((this.updated == rhs.updated)||((this.updated!= null)&&this.updated.equals(rhs.updated))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
