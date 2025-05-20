package ex_22_ENUM;

public class enum APIURL {
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    APIURLS(String url){
        this.url = url;
    }

    APIURL(String url) {
        this.url = url;
    }


    String getUrl(){
        return this.url;
    }
}
