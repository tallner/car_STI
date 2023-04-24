package com.example.bilar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//fkn

//@Entity
public class Bilar {
    
    //@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private static Integer num = 0;

    public Bilar() {
        super();
      //  id =  num++;
    }

    public Bilar(String namn,String model,String color, int year, int nrOfWheels  ) {
        super();
       // id =  num++;
        this.namn = namn;
        this.model = model;
        this.color = color;
        this.year = year;
        this.nrOfWheels = nrOfWheels;
    }


    public Integer getId() {
        return id;
      }
    
    public void setId(Integer id) {
        this.id = id;
      }
    
  
    private String namn;
    private String model;
    private String color;
    private int year;
    private int nrOfWheels;


    public void setNrofwheels(int n)
    {
        nrOfWheels  = n;
    }
    public int getNrofwheels()
    {
        return nrOfWheels;
    }



    public void setNamn(String s)
    {
        namn  = s;
    }
    public String getNamn()
    {
        return namn;
    }


    public void setModel(String v)
    {
        model = v;
    }

    public void setColor(String v)
    {
        color  = v;
    }
    public void setYear(int v)
    {
        year  = v;
    }
    public int getYear()
    {
        return year;
    }


    public String getModel()
    {
        return model;
    }
    public String getColor()
    {
        return color;
    }
}
