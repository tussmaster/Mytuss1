package meetukyang.com.mytuss1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import meetukyang.com.mytuss1.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  add Fragment to Activitivy
        if( savedInstanceState==null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.TussMainFragment,new MainFragment())
                    .commit();
        }

    } //Main Method
}// Main Class