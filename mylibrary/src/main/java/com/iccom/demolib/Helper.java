package com.iccom.demolib;

import android.util.Log;

import com.iccom.demolib.ex.Person;

public class Helper {
    public static void printLog(String tag, String msg){
        Person person = new Person();
        person.setFullName("abc");
        Log.d(tag,person.getFullName());
    }
}
