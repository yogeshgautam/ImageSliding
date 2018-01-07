package np.com.yogeshgautam.imageslider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.gigamole.infinitecycleviewpager.OnInfiniteCyclePageTransformListener;

public class MainActivity extends AppCompatActivity {

    public static HorizontalInfiniteCycleViewPager viewPager;
    ViewPageAdapter adapter;
    public static int present=0;
    int a;

    private int[] images={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,
            R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image0

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first();

    }





    public void first(){
        viewPager=(HorizontalInfiniteCycleViewPager) findViewById(R.id.horizontal_cycle);
        adapter=new ViewPageAdapter(getBaseContext(),images);
        viewPager.setAdapter(adapter);

    }
}
