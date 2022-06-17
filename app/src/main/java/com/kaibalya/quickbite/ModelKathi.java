//package com.kaibalya.quickbite;
//
//public class ModelKathi {
//    private static String textview1,textview3;
//    private String textview2;
//
//    ModelKathi(String textview1,String textview2, String textview3){
//        this.textview1 = textview1;
//        this.textview2 = textview2;
//        this.textview3 = textview3;
//    }
//
//    public static String getTextview1() {
//        return textview1;
//    }
//
//    public String getTextview2() {
//        return textview2;
//    }
//
//    public static String getTextview3() {
//        return textview3;
//    }
//
//    public void setTextview1(String textview1) {
//        this.textview1 = textview1;
//    }
//
//    public void setTextview2(String textview2) {
//        this.textview2 = textview2;
//    }
//
//    public void setTextview3(String textview3) {
//        this.textview3 = textview3;
//    }
//}
package com.kaibalya.quickbite;

public class ModelKathi {
    private String textview1,textview2,textview3;

    ModelKathi(String textview1,String textview2, String textview3){
        this.textview1 = textview1;
        this.textview2 = textview2;
        this.textview3 = textview3;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public String getTextview3() {
        return textview3;
    }
}