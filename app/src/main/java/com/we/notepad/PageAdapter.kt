package com.we.notepad

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.RecyclerView
import java.io.File

class PageAdapter(private val letDirectory: File) : RecyclerView.Adapter<PageAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val editText: EditText = itemView.findViewById(R.id.editTextTextMultiLine)
    }

    // onCreateViewHolder is called when I need a new View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.page_item, parent, false))
    }

    // onBindViewHolder to provide and bound new View with data
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        val file = File(letDirectory, "page$position.txt")
        holder.editText.setText(file.readText())
        holder.editText.addTextChangedListener {
            file.writeText(it.toString())
        }
    }

    override fun getItemCount(): Int {
        return letDirectory.listFiles()!!.size
    }
}