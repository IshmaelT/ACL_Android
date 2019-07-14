package example.com.alc4

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object ImageViewBindingAdapter {
    @BindingAdapter(value = ["url"])
    @JvmStatic
    fun setImage(view: View, url: String?) {
        Glide
            .with(view.context)
            .load(url ?: R.drawable.vd_profile_placeholder)
            .into(view as ImageView)
    }
}