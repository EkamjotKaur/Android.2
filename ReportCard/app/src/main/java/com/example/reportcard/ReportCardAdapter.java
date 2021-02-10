package com.example.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {
    public ReportCardAdapter(Activity context, ArrayList<ReportCard> reportCards) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, reportCards);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        ReportCard currentItem = getItem(position);

        TextView rollTextView =(TextView) listItemView.findViewById(R.id.roll_no);
        int rollno=position+1;
        rollTextView.setText("Roll No. "+ rollno);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText("Name: "+currentItem.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_grade);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        englishTextView.setText("English Grade: "+currentItem.getEnglishGrade());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView MathsTextView = (TextView) listItemView.findViewById(R.id.maths_grade);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        MathsTextView.setText("Mathematics Grade: "+currentItem.getMathsGrade());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView ScienceTextView = (TextView) listItemView.findViewById(R.id.science_grade);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        ScienceTextView.setText("Science Grade: "+currentItem.getScienceGrade());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView SocialScienceTextView = (TextView) listItemView.findViewById(R.id.social_grade);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        SocialScienceTextView.setText("Social Science Grade: "+currentItem.getSocialScienceGrade());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView hindiTextView = (TextView) listItemView.findViewById(R.id.hindi_grade);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        hindiTextView.setText("Hindi Grade: "+currentItem.getHindiGrade());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView punTextView = (TextView) listItemView.findViewById(R.id.pun_grade);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        punTextView.setText("Punjabi Grade: "+currentItem.getPunjabiGrade());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
