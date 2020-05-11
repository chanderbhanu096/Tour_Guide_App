package com.example.tourguideapplication.CustomArrayList;

public class HikinglocationCustom {
    private String hikinglocation_name;

    private  String hikinglocation_Description;

    private int hikinglocation_picture_id;

    public HikinglocationCustom (String text_name,String text_desc,int hikinglocation_id)
    {
        hikinglocation_name = text_name;
        hikinglocation_Description = text_desc;
        hikinglocation_picture_id = hikinglocation_id;
    }

    public void setHikinglocation_name(String text_name) {
        hikinglocation_name = text_name;
    }


    public void setHikinglocation_Description(String text_desc) {
        hikinglocation_Description = text_desc;
    }

    public void setHikinglocation_picture_id(int hikinglocation_id){
        hikinglocation_picture_id = hikinglocation_id;
    }

    public String getHikinglocation_name() {
        return hikinglocation_name;
    }

    public String getHikinglocation_Description() {
        return hikinglocation_Description;
    }

    public int getHikinglocation_picture_id() {
        return hikinglocation_picture_id;
    }
}
