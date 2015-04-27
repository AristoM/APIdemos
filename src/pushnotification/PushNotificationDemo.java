package pushnotification;

import com.example.androidapidemo.R;

import android.app.Activity;
import android.os.Bundle;

public class PushNotificationDemo extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.push_notification);
		
		Toast.maketext(this, "Testin", Toast.LENTH).show();
		
		
	}

}
