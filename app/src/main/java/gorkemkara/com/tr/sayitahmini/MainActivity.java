package gorkemkara.com.tr.sayitahmini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button sayi1, sayi2, sayi3, sayi4, sayi5, sayi6, sayi7, sayi8, sayi9;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayi1 =(Button) findViewById(R.id.sayi1);
        sayi2 =(Button) findViewById(R.id.sayi2);
        sayi3 =(Button) findViewById(R.id.sayi3);
        sayi4 =(Button) findViewById(R.id.sayi4);
        sayi5 =(Button) findViewById(R.id.sayi5);
        sayi6 =(Button) findViewById(R.id.sayi6);
        sayi7 =(Button) findViewById(R.id.sayi7);
        sayi8 =(Button) findViewById(R.id.sayi8);
        sayi9 =(Button) findViewById(R.id.sayi9);
        textView = (TextView) findViewById(R.id.textView);
        Random random = new Random();
        final int tahmin = random.nextInt(10);

        sayi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tahmin == 1)
                    textView.setText("Sayı "+tahmin+" Doğru");
                else{
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                    textView.setText("YANLIŞ!");
                }
            }
        });
        sayi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tahmin == 2)
                    textView.setText("Sayı "+tahmin+" Doğru");
                else{
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                    textView.setText("YANLIŞ!");
                }
            }
        });
        sayi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tahmin == 3)
                    textView.setText("Sayı "+tahmin+" Doğru");
                else{
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                    textView.setText("YANLIŞ!");
                }
            }
        });
        sayi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tahmin == 4)
                    textView.setText("Sayı "+tahmin+" Doğru");
                else{
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                    textView.setText("YANLIŞ!");
                }
            }
        });
        sayi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tahmin == 5)
                    textView.setText("Sayı "+tahmin+" Doğru");
                else{
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                    textView.setText("YANLIŞ!");
                }
            }
        });
        sayi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tahmin == 6)
                    textView.setText("Sayı "+tahmin+" Doğru");
                else{
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                    textView.setText("YANLIŞ!");
                }
            }
        });
        sayi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tahmin == 7)
                    textView.setText("Sayı "+tahmin+" Doğru");
                else{
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                    textView.setText("YANLIŞ!");
                }
            }
        });
        sayi8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tahmin == 8)
                    textView.setText("Sayı "+tahmin+" Doğru");
                else{
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                    textView.setText("YANLIŞ!");
                }
            }
        });
        sayi9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tahmin == 9)
                    textView.setText("Sayı "+tahmin+" Doğru");
                else{
                    textView.setTextColor(getResources().getColor(R.color.colorAccent));
                    textView.setText("YANLIŞ!");
                }
            }
        });



    }
}
