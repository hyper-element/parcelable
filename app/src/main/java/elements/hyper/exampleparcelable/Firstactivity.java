package elements.hyper.exampleparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Firstactivity extends AppCompatActivity {

    Button btn_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstactivity);

        final List<String> characteristics = new ArrayList<String>();
        characteristics.add("cool");
        characteristics.add("intelligent");

        btn_change = (Button)findViewById(R.id.btn_change);
        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                User user = new User(1,"android",characteristics);//Here we are passing the object whcih ontains int,String and Arralist type. You can pass whatever you like
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                i.putExtra("user",user);
                startActivity(i);
            }
        });
    }
}
