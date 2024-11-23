package com.example.itproger.data

//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import androidx.recyclerview.widget.RecyclerView
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
//        val holder: RecyclerView.ViewHolder;
//        if(convertView == null) {
//            convertView =layoutInflater.inflate(R.layout.activity_main, null)
//        }
//    }
//}
