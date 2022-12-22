package com.example.demo2;

import java.util.List;

public class Chart {
    int monthC;
    Double amount;
    Double remains;

public Chart(int id, Double amount, Double remains){
    this.monthC = id;
    this.amount = amount;
    this.remains =remains;

}
    public int getMonth(){
       return monthC;
    }
    public void setMonth(int month){
    this.monthC = month;
    }

    public double getAmount(){
        return amount;
    }
    public void setAmount(Double amount){
    this.amount = amount;
    }

    public double getRemains(){
        return remains;
    }
    public void setRemains(Double remains){
    this.remains = remains;
    }


}
