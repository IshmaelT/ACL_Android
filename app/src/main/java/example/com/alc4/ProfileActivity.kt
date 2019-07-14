package example.com.alc4

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import example.com.alc4.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    var binding: ActivityProfileBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile)

        binding?.apply {
            name = "Ishmael Tshikhovhokhovho"

            entries = arrayListOf(
                ProfileItem(
                    "Track",
                    "Android"
                ),
                ProfileItem(
                    "Country",
                    "South Africa"
                ),
                ProfileItem(
                    "Email",
                    "ishmael.zt@gmail.com"
                ),
                ProfileItem(
                    "Phone Number",
                    "0720828312"
                ),
                ProfileItem(
                    "Slack Username",
                    "@ishmael"
                )
            )
        }
        title = getString(R.string.profile_toolbar_title)

        setSupportActionBar(binding?.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
