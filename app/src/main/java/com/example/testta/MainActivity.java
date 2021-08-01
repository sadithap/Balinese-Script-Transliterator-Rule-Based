package com.example.testta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    EditText input;
    ImageButton paste;
    ImageButton copy;
    ImageButton ulu_candra;
    ImageButton ulu_ricem;
    TextView output;
    Filter1 f1;
    Filter2 f2;
    Filter3 f3;
    String text;

    public String filter4(String input){

        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }
        Python py= Python.getInstance();
        PyObject pyObject=py.getModule("filter4");

        PyObject obj=pyObject.callAttr("main",input);

        input=obj.toString();

        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=findViewById(R.id.input);
        ulu_candra=findViewById(R.id.ulu_candra);
        ulu_ricem=findViewById(R.id.ulu_ricem);
        paste=findViewById(R.id.paste);
        copy=findViewById(R.id.copy);
        output=findViewById(R.id.output);
        text=input.getText().toString();



        output.setMovementMethod(new ScrollingMovementMethod());
        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                text=input.getText().toString();

                f1=new Filter1();
                f2=new Filter2();
                f3=new Filter3();

                String temp=filter4(f3.transliterasi(f2.transliterasi(f1.transliterasi(text))));
                output.setText(temp);
                if(output.getText().toString().equals("")){
                   output.setVisibility(View.INVISIBLE);
                   copy.setVisibility(View.INVISIBLE);
                }
                else{
                    output.setVisibility(View.VISIBLE);
                    copy.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        paste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

                String temp=input.getText().toString();
                input.setText(temp+(clipboard.getPrimaryClip().getItemAt(0).getText().toString()));
                input.setSelection(input.getText().length());
            }
        });

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

                ClipData clip = ClipData.newPlainText("Terjemahan Aksara", output.getText().toString());
                clipboard.setPrimaryClip(clip);
            }
        });

        ulu_candra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String aksara = URLDecoder.decode("%E1%AC%81", "UTF-8");
                    String temp = input.getText().toString();

                    input.setText(temp+aksara);
                    input.setSelection(input.getText().length());
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });

        ulu_ricem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String aksara = URLDecoder.decode("%E1%AC%80", "UTF-8");
                    String temp = input.getText().toString();

                    input.setText(temp+aksara);
                    input.setSelection(input.getText().length());
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });

        ulu_candra.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int[] location = new int[2];
                ulu_candra.getLocationOnScreen(location);
                int x = location[0];
                int y = location[1];
                Toast toast=Toast.makeText(MainActivity.this,"Ulu Candra", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, x,(y-110));
                toast.show();
                return false;
            }
        });

        ulu_ricem.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int[] location = new int[2];
                ulu_ricem.getLocationOnScreen(location);
                int x = location[0];
                int y = location[1];
                Toast toast=Toast.makeText(MainActivity.this,"Ulu Ricem", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, x,(y-110));
                toast.show();
                return false;
            }
        });

    }
}
