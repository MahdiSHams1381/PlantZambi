package model;

import java.util.ArrayList;

public class user {
  private   String userName ;
    private   String Password ;
    private  int numberWin = 0 ;
    private    int numberNoWin = 0 ;
    private   int mony ;

    public void add(ArrayList<user>users){
        //***************************
    }
    public void remove(ArrayList<user>users){
        //***************************
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getNumberWin() {
        return numberWin;
    }

    public void setNumberWin(int numberWin) {
        this.numberWin = numberWin;
    }

    public int getNumberNoWin() {
        return numberNoWin;
    }

    public void setNumberNoWin(int numberNoWin) {
        this.numberNoWin = numberNoWin;
    }

    public int getMony() {
        return mony;
    }

    public void setMony(int mony) {
        this.mony = mony;
    }
}
