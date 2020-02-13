import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTikTok {
    private String nickName;
    private String useName;
    private String title;
    private String link;
    private double amountLike;
    private double amountComment;
    private static Pattern pattern;
    private Matcher matcher;
    private static Date timeTakeData;
    private static final String LINK_REGEX = "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)";

    public DataTikTok(String nickName, String useName, String title, String link, double amountLike, double amountComment, Matcher matcher) {
        this.nickName = nickName;
        this.useName = useName;
        this.title = title;
        this.link = link;
        this.amountLike = amountLike;
        this.amountComment = amountComment;
        this.matcher = matcher;
        pattern = Pattern.compile(LINK_REGEX);
    }

    public boolean checkLInk(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUseName() {
        return this.useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = this.title;
    }

    public double getAmountLike() {
        return this.amountLike;
    }

    public void setAmountLike(double amountLike) {
        this.amountLike = amountLike;
    }

    public double getAmountComment() {
        return this.amountComment;
    }

    public void setAmountComment(double amountComment) {
        this.amountComment = amountComment;
    }


    public static Date getTimeTakeData() {
        return timeTakeData;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
