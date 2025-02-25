package com.java.chenguo.DataBase;

import org.litepal.crud.LitePalSupport;

public class UserTopMenuOthers extends LitePalSupport {
    private String userID;
    private String oneMenu;

    public UserTopMenuOthers(String userID, String oneMenu) {
        this.userID = userID;
        this.oneMenu = oneMenu;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getOneMenu() {
        return oneMenu;
    }

    public void setOneMenu(String oneMenu) {
        this.oneMenu = oneMenu;
    }
}
