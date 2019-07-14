package example.com.alc4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


object LayoutBindingAdapter {
    @BindingAdapter(value = ["entries", "layout"], requireAll = false)
    @JvmStatic
    fun <T> setEntries(viewGroup: ViewGroup, entries: List<T>, layoutId: Int) {
        viewGroup.removeAllViews()
        if (entries.isNullOrEmpty()) {
            return
        }
        val inflater = LayoutInflater.from(viewGroup.context)
        entries.forEach {
            val binding = DataBindingUtil.inflate<ViewDataBinding>(inflater, layoutId, viewGroup, true)
            binding?.setVariable(BR.item, it)
            binding.executePendingBindings()
        }
    }
}
