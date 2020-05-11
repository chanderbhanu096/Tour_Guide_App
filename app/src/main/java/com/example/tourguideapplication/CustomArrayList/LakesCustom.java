package com.example.tourguideapplication.CustomArrayList;

public class LakesCustom {

    private String lake_Name;

    private String lake_Description;

    private int lake_picture_id;

    public LakesCustom(String text_name, String text_desc, int lake_id) {
        lake_Name = text_name;
        lake_Description = text_desc;
        lake_picture_id = lake_id;
    }


    public String getLake_Name() {
        return lake_Name;
    }

    public String getLake_Description() {
        return lake_Description;
    }

    public int getLake_Picture_Id() {
        return lake_picture_id;
    }
}
