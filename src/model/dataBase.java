package model;

import model.user;

import java.util.ArrayList;

public class dataBase {
  public   ArrayList<user>users=new ArrayList<>() ;
    public dataBase(){
        user test = new user() ;
        test.setUserName("MahdiShams");
        test.setPassword("123456789");
        test.setMony(0);
        test.setNumberWin(0);
        test.setNumberNoWin(0);
        users.add(test) ;
    }
}
