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

        val viewModel = ProfileViewModel()

        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile)
        bind(viewModel)

        viewModel.loadData()

        title = getString(R.string.profile_toolbar_title)

        setSupportActionBar(binding?.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
        }
    }

    private fun bind(viewModel: ProfileViewModel) {
        binding?.setVariable(BR.viewModel, viewModel)
        binding?.executePendingBindings()
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
