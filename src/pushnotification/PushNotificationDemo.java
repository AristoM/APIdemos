package pushnotification;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.androidapidemo.R;

public class PushNotificationDemo extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.push_notification);
		
		Toast.makeText(this, "For testing", Toast.LENGTH_LONG).show();
		
		
	}

}
