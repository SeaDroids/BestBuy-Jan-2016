package my.sample.androidmeetup.activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bestbuy.androidmeetup.R;


public class Startup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.startup);

        // Wait a few and head for login
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... params) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    // Do nothing
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                // Move on to something
                // TODO
            }

        }.execute();
    }
}
