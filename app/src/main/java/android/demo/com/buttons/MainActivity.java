package android.demo.com.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button image_text,text;
    ImageButton image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(Button)findViewById(R.id.button);
        image_text=(Button)findViewById(R.id.textimage);
        image=(ImageButton) findViewById(R.id.imageButton);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"YOU CLICKED TEXT BUTTON",Toast.LENGTH_LONG);
                toast.show();
            }
        });
        image_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"YOU CLICKED BUTTON OF TEXT HAVING IMAGE",Toast.LENGTH_LONG);
                toast.show();
            }
        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"YOU CLICKED IMAGE BUTTON",Toast.LENGTH_LONG);
                toast.show();

            }
        });
    }

}
