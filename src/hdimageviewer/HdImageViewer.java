package hdimageviewer;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidapidemo.R;

public class HdImageViewer extends Activity{

	ImageView image;
	Bitmap mIcon_val;
	String url = "http://www.keepandroid.com/wp-content/uploads/2014/05/creative-android-hd-wallpapers-free.jpg";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.hd_image_viewer);
		
		image = (ImageView) findViewById(R.id.img);
		
		URL newurl;
		try {
			newurl = new URL(url);
			mIcon_val = BitmapFactory.decodeStream(newurl.openConnection().getInputStream());
			image.setImageBitmap(mIcon_val);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	
}
