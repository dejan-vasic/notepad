package com.we.notepad

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.RecyclerView
import java.io.File


class BookAdapter(private val dirs: ArrayList<File>) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

    // onCreateViewHolder is called when I need a new View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return ViewHolder(itemView)
    }

    // onBindViewHolder to provide and bound new View with data
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("getItem", dirs.toString())
        holder.textView.text = dirs[position].name
        holder.itemView.setOnClickListener {
            val activity = it!!.context as AppCompatActivity
            activity.supportFragmentManager.commit {
                val pageFragment = PageFragment.newInstance(dirs[position].name, "")
                replace(R.id.fragmentContainerView, pageFragment)
                setReorderingAllowed(true)
                addToBackStack(null)
            }

//            supportFragmentManager.commit {
//                replace<PageFragment>(R.id.fragmentContainerView)
//                setReorderingAllowed(true)
//                addToBackStack(null)
        }
    }
//        holder.setIsRecyclable(false)
//        val file = File(letDirectory, "page$position.txt")
//        holder.editText.setText(file.readText())
//        holder.editText.addTextChangedListener {
//            file.writeText(it.toString())
//        }
//    }

    override fun getItemCount(): Int {
        return dirs.size
    }
}