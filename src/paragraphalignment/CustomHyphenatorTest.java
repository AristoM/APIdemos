package paragraphalignment;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidapidemo.R;

public class CustomHyphenatorTest extends Activity{

	WebView webview;
	EditText et;
	TextView clear, done;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.test_activity);
		
		WebView view = new WebView(this);
	    view.setVerticalScrollBarEnabled(false);

	    ((LinearLayout)findViewById(R.id.webview)).addView(view);

	    view.loadData(getString(R.string.paragraph), "text/html", "utf-8");
		
	}

}
