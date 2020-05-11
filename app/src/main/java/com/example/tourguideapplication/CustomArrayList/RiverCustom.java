package com.example.tourguideapplication.CustomArrayList;

public class RiverCustom{

        private String river_Name;

        private  String river_Description;

        private int river_picture_id;

        public RiverCustom(String text_name,String text_desc,int lake_id)
        {
            river_Name = text_name;
            river_Description = text_desc;
            river_picture_id = lake_id;
        }

        public void setRiver_Name(String text_name) {
            river_Name = text_name;
        }

        public void setRiver_Description(String text_desc) {
            river_Description = text_desc;
        }

        public void setRiver_picture_id(int lake_id){
            river_picture_id = lake_id;
        }

        public String getRiver_Name() {
            return river_Name;
        }

        public String getRiver_Description() {
            return river_Description;
        }

        public int getRiver_Picture_Id() {
            return river_picture_id;
        }
}

