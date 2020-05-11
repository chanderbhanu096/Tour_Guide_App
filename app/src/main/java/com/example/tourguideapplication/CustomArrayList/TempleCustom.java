package com.example.tourguideapplication.CustomArrayList;

public class TempleCustom {
    private String temple_Name;

    private  String temple_Description;

    private int temple_picture_id;

    public TempleCustom(String text_name,String text_desc,int lake_id)
    {
        temple_Name = text_name;
        temple_Description = text_desc;
        temple_picture_id = lake_id;
    }

    public void setTemple_Name(String text_name) {
        temple_Name = text_name;
    }


    public void setTemple_Description(String text_desc) {
        temple_Description = text_desc;
    }

    public void setTemple_picture_id(int lake_id){
        temple_picture_id = lake_id;
    }

    public String getTemple_Name() {
        return temple_Name;
    }

    public String getTemple_Description() {
        return temple_Description;
    }

    public int getLake_Picture_Id() {
        return temple_picture_id;
    }
}
