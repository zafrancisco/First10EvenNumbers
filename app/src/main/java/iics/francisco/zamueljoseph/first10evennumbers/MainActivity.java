package iics.francisco.zamueljoseph.first10evennumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Label1 = (TextView) findViewById(R.id.Label1);
                TextView Label2 = (TextView) findViewById(R.id.Label2);

                int ctr=1;
                int num;

                while(ctr!=21){
                    if(ctr%2==0){
                        num=ctr;
                        Label2.append(num+", ");
                        ctr++;
                    }else{
                        ctr++;
                    }
                }
                Label1.setText(R.string.label1);
            }
        });
    }
}