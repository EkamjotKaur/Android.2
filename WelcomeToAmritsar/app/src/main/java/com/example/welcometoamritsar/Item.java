package com.example.welcometoamritsar;

public class Item {
    // name of the item (place,event,etc)
    private String name;
    // short description like opening,closing time
    private String description;
    // relevant image
    private int imageResourceId;

    private boolean hasGPS;

    public Item(String cname,String cdescription,int cimageResourceId,boolean chasGPS)
    {
        name=cname;
        description=cdescription;
        imageResourceId=cimageResourceId;
        hasGPS=chasGPS;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }
}
