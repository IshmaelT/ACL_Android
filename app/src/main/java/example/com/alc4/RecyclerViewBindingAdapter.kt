package example.com.alc4

import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


object RecyclerViewBindingAdapter {

    @BindingAdapter(value = ["entries", "layout"], requireAll = true)
    @JvmStatic
    fun setupRecyclerView(
        viewGroup: ViewGroup,
        profileItems: ArrayList<ProfileItem>,
        recyclerView: RecyclerView
    ) {
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(viewGroup.context)
        recyclerView.adapter = ProfileAdapter(profileItems)
    }
}
