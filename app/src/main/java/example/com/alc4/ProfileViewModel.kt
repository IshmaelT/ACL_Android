package example.com.alc4

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class ProfileViewModel(
    private var _entries: ArrayList<ProfileItem> = ArrayList(),
    private var _name: String = ""
) : BaseObservable() {

    var entries: ArrayList<ProfileItem>
        @Bindable
        get() = _entries
        set(value) {
            _entries = value
            notifyPropertyChanged(BR.entries)
        }

    var name: String
        @Bindable
        get() = _name
        set(value) {
            _name = value
            notifyPropertyChanged(BR.name)
        }

    fun loadData() {
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
}