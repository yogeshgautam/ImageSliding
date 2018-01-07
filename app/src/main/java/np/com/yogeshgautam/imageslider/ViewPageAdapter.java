package np.com.yogeshgautam.imageslider;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.squareup.picasso.Picasso;

/**
 * Created by yogesh on 1/7/2018.
 */
public class ViewPageAdapter extends PagerAdapter {

    Context activity;
    int[] images;
    int pos=0;

    LayoutInflater inflater;

    public ViewPageAdapter(Context activity, int[] images) {
        this.activity = activity;
        this.images = images;

        inflater=LayoutInflater.from(activity);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        inflater=(LayoutInflater)activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=inflater.inflate(R.layout.viewpager_item,container,false);

        ImageView image;
        image=(ImageView) itemView.findViewById(R.id.imageView);
        image.setId(position);
        image.setImageResource(images[position]);
        if(image.getId()==pos){
           image.setBackgroundColor(Color.RED);
        }





        container.addView(itemView);
        return itemView;




    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
        pos=MainActivity.viewPager.getRealItem();
        Toast.makeText(activity,"image: "+(pos+1),Toast.LENGTH_LONG).show();
    }




}
