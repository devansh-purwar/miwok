package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout, parent, false);
        }
        Word word = getItem(position);
        TextView miwok = (TextView) listItemView.findViewById(R.id.textview1);
        miwok.setText(word.getMiwokTranslation());
        TextView english = (TextView) listItemView.findViewById(R.id.textview2);
        english.setText(word.getEnglishTranslation());
        ImageView img = (ImageView) listItemView.findViewById(R.id.y2);
        if(word.isHasImage()){
            img.setVisibility(View.VISIBLE);
            img.setImageResource(word.getResource_id());
        } else {
            img.setVisibility(View.GONE);
        }
        RelativeLayout textContainer = (RelativeLayout) listItemView.findViewById(R.id.container);
        int colId = ContextCompat.getColor(getContext(),color);
        textContainer.setBackgroundColor(colId);
        return listItemView;
    }
    private int color ;
    WordAdapter(Activity context, ArrayList<Word> words,int col){
        super(context,0,words);
        this.color=col;
    }

}
