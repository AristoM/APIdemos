package broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v4.app.TaskStackBuilder;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		Toast.makeText(context, "Don't panik but your time is up!!!!.",
				Toast.LENGTH_LONG).show();
		Intent broad = new Intent(context, BroadCastReceiver.class);
		TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
		stackBuilder.addNextIntent(broad);
		
		// Vibrate the mobile phone
		Vibrator vibrator = (Vibrator) context
				.getSystemService(Context.VIBRATOR_SERVICE);
		vibrator.vibrate(500);
	}

}
