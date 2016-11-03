package elements.hyper.exampleparcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        User user = getIntent().getParcelableExtra("user");
        Log.e("RECEIVED data",user.getId()+"\n"+user.getName()+"\n"+user.getCharacteristics().get(0)+"\n"+user.getCharacteristics().get(1));
    }
}
