package example.com.alc4

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import example.com.alc4.databinding.ActivityMainBinding


class MainActivity :
    AppCompatActivity(),
    IButtonClickListener {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_main)

        binding?.apply {
            listener = this@MainActivity
            setSupportActionBar(binding?.toolbar)
        }

        title = getString(R.string.main_toolbar_title)
    }

    override fun onAboutUsClick(view: View) {
        startActivity(Intent(this, AboutUsActivity::class.java))
    }

    override fun onMyProfileClick(view: View) {
        startActivity(Intent(this, ProfileActivity::class.java))
    }
}
