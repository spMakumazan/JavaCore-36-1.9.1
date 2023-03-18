import com.fasterxml.jackson.annotation.JsonProperty;

public class AboutCats {
    private String id;
    private String text;
    private String type;
    private String user;
    private String upvotes;

    public AboutCats(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return  "\nid = " + id +
                "\ntext = " + text +
                "\ntype = " + type +
                "\nuser = " + user +
                "\nupvotes = " + upvotes;
    }
}
