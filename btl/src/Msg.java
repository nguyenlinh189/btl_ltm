/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Msg implements Serializable{
    private ArrayList<String> addressSent;
    private Date dateSent;
    private String subject;
    private Object content;

    public Msg(ArrayList<String> addressSent, Date dateSent, String subject, Object content) {
        this.addressSent = addressSent;
        this.dateSent = dateSent;
        this.subject = subject;
        this.content = content;
    }

    public ArrayList<String> getAddressSent() {
        return addressSent;
    }

    public void setAddressSent(ArrayList<String> addressSent) {
        this.addressSent = addressSent;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    public Object[] toObject(){
        
        return new Object[]{addressSent,subject+" - "+content,dateSent};
    }
}
