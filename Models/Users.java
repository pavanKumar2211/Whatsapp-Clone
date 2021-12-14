package org.meicode.whatsppclone.Models;

public class Users {

    String profilePic, mail, userName, password, userID, lastMessage;
    String status;

    public Users(){}


    public Users(String profilePic, String mail, String userName, String password){
    this.profilePic = profilePic;
    this.mail = mail;
    this.userName = userName;
    this.password = password;

    }

    public Users(String userName, String mail, String password){
        this.userName =  userName;
        this.mail =  mail;
        this.password  =  password;

    }

    public String getProfilePic() {
        return profilePic;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
