package com.nopalyer.navigationdrawer.teacher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.nopalyer.navigationdrawer.R;
import com.nopalyer.navigationdrawer.student.aboutus21.aboutdev;
import com.nopalyer.navigationdrawer.student.calender.calender1;

public class Tpmain extends AppCompatActivity implements View.OnClickListener {
    private CardView sch, not,att, cal, pro,msg,ok, help, website, au;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tp_main);
        sch = (CardView) findViewById(R.id.sch);
        not = (CardView) findViewById(R.id.not);
        att = (CardView) findViewById(R.id.att);
        cal = (CardView) findViewById(R.id.cal);
        pro = (CardView) findViewById(R.id.pro);
        msg = (CardView) findViewById(R.id.msg);
        ok = (CardView) findViewById(R.id.ok);
        help = (CardView) findViewById(R.id.help);
        website = (CardView) findViewById(R.id.website);
        au = (CardView) findViewById(R.id.au);

        sch.setOnClickListener(this);
        not.setOnClickListener(this);
        att.setOnClickListener(this);
        cal.setOnClickListener(this);
        pro.setOnClickListener(this);
        msg.setOnClickListener(this);
        ok.setOnClickListener(this);
        help.setOnClickListener(this);
        website.setOnClickListener(this);
        au.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.sch:
                i = new Intent(this, sch.class);
                startActivity(i);
                break;
            case R.id.not:
                i = new Intent(this, not.class);
                startActivity(i);
                break;
            case R.id.att:
                i = new Intent(this, att.class);
                startActivity(i);
                break;
            case R.id.cal:
                i = new Intent(this, calender1.class);
                startActivity(i);
                break;
            case R.id.pro:
                i = new Intent(this, pro.class);
                startActivity(i);
                break;
            case R.id.msg:
                i = new Intent(this, msg.class);
                startActivity(i);
                break;
            case R.id.ok:
                i = new Intent(this, ok.class);
                startActivity(i);
                break;
            case R.id.help:
                i = new Intent(this, com.nopalyer.navigationdrawer.student.help.help.class);
                startActivity(i);
                break;
            case R.id.website:
                Intent browsIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://nith.ac.in/"));
                startActivity(browsIntent);
                break;

            case R.id.au:
                i = new Intent(this, aboutdev.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }



}




