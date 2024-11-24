//region var1
//package com.example.itproger.data
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView.ViewHolder
//import com.example.itproger.R
//
//class CustomListAdapter (private val context: Context, val listData: List<Country>) :
//    BaseAdapter() {
//    val layoutInflater: LayoutInflater = LayoutInflater.from(context)
//
//    override fun getCount(): Int {
//        return listData.size; // Return the number of items in the list
//    }
//
//    override fun getItem(position: Int): Any {
//        return listData[position]
//    }
//
//    override fun getItemId(position: Int): Long {
//        return position.toLong()
//    }
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        val holder: ViewHolder;
//        if(convertView == null) {
//            val convertView =layoutInflater.inflate(R.layout.activity_main, null)
//            val holder = ViewHolder(convertView)
//            convertView.tag = holder
//        } else {
//            holder = convertView.tag as ViewHolder
//        }
//    }
//}
//endregion
//region var2
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.itproger.R
import com.example.itproger.data.Country

class CustomListAdapter(
    private val context: Context,
    private val listData: List<Country>
) : BaseAdapter() {

    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return listData.size
    }

    override fun getItem(position: Int): Any {
        return listData[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val holder: ViewHolder
        val view: View

        if (convertView == null) {
            val convertView =layoutInflater.inflate(R.layout.activity_main, null)

            holder = ViewHolder(
                flagView = convertView.findViewById(R.id.imageView_flag),
                countryNameView = convertView.findViewById(R.id.textView_countryName),
                populationView = convertView.findViewById(R.id.textView_population)
            )
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as ViewHolder
        }

        val country = listData[position]
        holder.countryNameView.text = country.countryName
        holder.populationView.text = "Population: ${country.population}"

        val imageId = getMipmapResIdByName(country.flagName)
        holder.flagView.setImageResource(imageId)

        return view
    }

    private fun getMipmapResIdByName(resName: String): Int {
        val pkgName = context.packageName
        val resId = context.resources.getIdentifier(resName, "mipmap", pkgName)
        return resId
    }

    private data class ViewHolder(
        val flagView: ImageView,
        val countryNameView: TextView,
        val populationView: TextView
    )
}
//endregion