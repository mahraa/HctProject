package om.gov.ita.hctproject.initialsetup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;

import om.gov.ita.hctproject.MainActivity;
import om.gov.ita.hctproject.R;

public class TermconditionScreen extends AppCompatActivity {
    WebView webView;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termcondition_screen);
        webView=(WebView)findViewById(R.id.hct_terms_condition);
        webView.loadUrl("file:///android_asset/abc.html");
        checkBox=(CheckBox)findViewById(R.id.check);
    }
    public void accept(View view) {
        if(!checkBox.isChecked()){
            return;
        }
        else {
            Intent intent=new Intent(TermconditionScreen.this,MainActivity.class);
            startActivity(intent);
        }
    }
}
