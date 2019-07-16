package example.com.alc4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(
    var profileItems: ArrayList<ProfileItem> ? = null
) : RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewDataBinding =
            DataBindingUtil.inflate<ViewDataBinding>(inflater, R.layout.view_profile_item, parent, false)
        return ViewHolder(viewDataBinding)
    }

    override fun getItemCount() = profileItems?.size?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = profileItems?.get(position) ?: return
        holder.bind(item)
    }

    class ViewHolder(
        private val binding: ViewDataBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ProfileItem) {
            binding.setVariable(BR.item, item)
            binding.executePendingBindings()
        }
    }
}