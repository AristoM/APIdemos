package swipetorefresh;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androidapidemo.R;

public class SwipeToRefresh extends Activity implements OnRefreshListener {
	ListView mListView;
	  SwipeRefreshLayout mSwipeRefreshLayout;
	  ArrayAdapter<String> mAdapter;
	  SwipeRefreshLayout swipeLayout;
	  
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.swipetorefresh);
	    swipeLayout = (SwipeRefreshLayout) findViewById(R.id.activity_main_swipe_refresh_layout);
	    swipeLayout.setOnRefreshListener(this);
	    swipeLayout.setColorScheme(android.R.color.holo_blue_bright, 
	            android.R.color.holo_green_light, 
	            android.R.color.holo_orange_light, 
	            android.R.color.holo_red_light);
	}
	 
	 
	@Override public void onRefresh() {
	    new Handler().postDelayed(new Runnable() {
	        @Override public void run() {
	            swipeLayout.setRefreshing(false);
	        }
	    }, 5000);
	}
}