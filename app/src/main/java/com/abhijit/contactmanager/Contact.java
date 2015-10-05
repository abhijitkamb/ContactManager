package com.abhijit.contactmanager;

import android.net.Uri;

/**
 * Created by Abhijit on 9/14/2015.
 */
public class Contact {

    private String _name, _phone, _email, _address;
    private Uri _image;
    private int _id;

    public Contact(int id, String name, String phone, String email, String address, Uri imageURI){
        _id = id;
        _name = name;
        _phone = phone;
        _email = email;
        _address = address;
        _image = imageURI;
    }

    public int getId(){
        return _id;
    }
    public String getName(){
        return _name;
    }

    public String getPhone(){
        return _phone;
    }

    public String getEmail(){
        return _email;
    }

    public String getAddress(){
        return _address;
    }

    public Uri getImageURI(){
        return _image;
    }
}
