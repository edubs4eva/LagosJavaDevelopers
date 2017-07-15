package com.alc.richman.andela.lagosjavadevelopers;

/**
 * Created by eDUBS on 7/10/2017.
 */

public class UserRecords {
    private String login;
    private String avatar_url;
    private String html_url;

    public UserRecords(String avatar_url, String login, String html_url) {
        this.avatar_url = avatar_url;
        this.login = login;
        this.html_url = html_url;
    }

    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatar_url;
    }

    public String getHtmlUrl() { return html_url; }
}
