package com.example.android.miwok;

public class Word {
    private String miwok;
    private String english;
    private int resource_id;
    private boolean hasImage;
    private int color;
    private int audio;
    public Word(String a,String b,int audio) {
        this.english = a;
        this.miwok = b;
        this.audio = audio;
    }
    public Word(String a,String b,int c,int audio){
        this.english = a;
        this.miwok =b;
        this.hasImage=true;
        this.resource_id=c;
        this.audio = audio;
    }
    public String getMiwokTranslation(){
        return miwok;
    }
    public String getEnglishTranslation(){
        return english;
    }
    public int getResource_id(){return resource_id;}
    public boolean isHasImage(){return hasImage;}
    public int getAudio(){
        return audio;
    }
}
