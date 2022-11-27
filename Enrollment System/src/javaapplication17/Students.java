/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author Grey
 */
public class Students {
    private int id, age;
    private String name, gender, address;
    
    public Students(int id, String name, String gender, int age, String address)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
}

 public int getId()
    {
        return this.id;
    }
    //Set method
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    public void setAddress(String course)
    {
        this.address = address;
    }
}