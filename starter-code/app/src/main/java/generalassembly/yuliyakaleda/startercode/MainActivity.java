package generalassembly.yuliyakaleda.startercode;

import android.animation.LayoutTransition;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private static final String TAG = "MyActivity";
  EditText inputWish;
  TextView textView;
  Button addButon;
  ViewGroup viewGroup;
  /**
   * ATTENTION: This was auto-generated to implement the App Indexing API.
   * See https://g.co/AppIndexing/AndroidStudio for more information.
   */
  private GoogleApiClient client;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    LayoutTransition layoutTransition = new LayoutTransition();
    layoutTransition.enableTransitionType(LayoutTransition.CHANGING);

    viewGroup = (ViewGroup) findViewById(R.id.ll);
    viewGroup.setLayoutTransition(layoutTransition);

    addButon = (Button) findViewById(R.id.addButton) ;
    addButon.setOnClickListener(this);

    textView = (TextView) findViewById(R.id.textView);


    //TODO: set up all the view and event listeners.
    // ATTENTION: This was auto-generated to implement the App Indexing API.
    // See https://g.co/AppIndexing/AndroidStudio for more information.
    client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
  }



  @Override
  public void onClick(View v) {
    // TODO: 1. get the text from the input field
    //       2. animate it in the center of the screen
    //       3. add it to the list wish
    inputWish = (EditText) findViewById(R.id.editInputWish);
    String stWish = inputWish.getText().toString();

    switch (v.getId()){
      case R.id.addButton:
        textView.setText(stWish);
        viewGroup.addView(?????????????????);
    }
   //       4. clear the input field

    Log.d(TAG, "asdfasdfa");
  }


  @Override
  public void onStart() {
    super.onStart();

    // ATTENTION: This was auto-generated to implement the App Indexing API.
    // See https://g.co/AppIndexing/AndroidStudio for more information.
    client.connect();
    Action viewAction = Action.newAction(
            Action.TYPE_VIEW, // TODO: choose an action type.
            "Main Page", // TODO: Define a title for the content shown.
            // TODO: If you have web page content that matches this app activity's content,
            // make sure this auto-generated web page URL is correct.
            // Otherwise, set the URL to null.
            Uri.parse("http://host/path"),
            // TODO: Make sure this auto-generated app URL is correct.
            Uri.parse("android-app://generalassembly.yuliyakaleda.startercode/http/host/path")
    );
    AppIndex.AppIndexApi.start(client, viewAction);
  }

  @Override
  public void onStop() {
    super.onStop();

    // ATTENTION: This was auto-generated to implement the App Indexing API.
    // See https://g.co/AppIndexing/AndroidStudio for more information.
    Action viewAction = Action.newAction(
            Action.TYPE_VIEW, // TODO: choose an action type.
            "Main Page", // TODO: Define a title for the content shown.
            // TODO: If you have web page content that matches this app activity's content,
            // make sure this auto-generated web page URL is correct.
            // Otherwise, set the URL to null.
            Uri.parse("http://host/path"),
            // TODO: Make sure this auto-generated app URL is correct.
            Uri.parse("android-app://generalassembly.yuliyakaleda.startercode/http/host/path")
    );
    AppIndex.AppIndexApi.end(client, viewAction);
    client.disconnect();
  }
}
