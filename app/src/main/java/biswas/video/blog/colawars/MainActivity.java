package biswas.video.blog.colawars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pepcityVotes = 0;
    int voteUdacicola = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void votePepcity(View view) {
        pepcityVotes  = pepcityVotes  + 1;
        display(pepcityVotes );
        return;
    }

    public void voteUdacicola(View view) {
        voteUdacicola = voteUdacicola + 1;
        display1(voteUdacicola);
        return;
    }

    public void display(int p) {
        TextView t1 = (TextView) findViewById(R.id.display_text_view1);
        t1.setText("" + p);
    }

    public void display1(int c) {
        TextView t2 = (TextView) findViewById(R.id.display_text_view3);
        t2.setText("" + c);
    }
}
