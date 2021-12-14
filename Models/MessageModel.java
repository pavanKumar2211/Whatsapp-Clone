package org.meicode.whatsppclone.Models;

public class MessageModel {
    String uId, message, messageId;
    Long timestamp;



    public MessageModel(){
    }


    public MessageModel(String uId, String message, Long timestamp){
        this.uId = uId;
        this.message = message;
        this.timestamp = timestamp;

    }


    public MessageModel(String uId, String message){

        this.uId = uId;
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getuId() {
        return uId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
}
