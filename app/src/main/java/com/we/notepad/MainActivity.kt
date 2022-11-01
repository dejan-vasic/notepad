package com.we.notepad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val manager = support
//        manager.commit {
//
//        }
//        val transaction: FragmentTransaction = manager.beginTransaction()
//        transaction.replace(android.R.id.fragmentContainerView, PageFragment, YOUR_FRAGMENT_STRING_TAG)
//        transaction.addToBackStack(null)
//        transaction.commit()

//        val dirs = ArrayList<File>()
//
//        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
//        val button: Button = findViewById(R.id.button)
//        val path = this.getExternalFilesDir(null)
//        val letDirectory = File(path, "LET")
//        letDirectory.mkdirs()
//        letDirectory.listFiles()!!.sorted().forEach {
//            if (it.isDirectory) {
//                dirs.add(it)
//            }
//        }
//        recyclerView.layoutManager = LinearLayoutManager(this);
//        val adapter = BookAdapter(dirs)
//        recyclerView.adapter = adapter
//        button.setOnClickListener {
//            val dir = File(letDirectory, "dir${dirs.size}")
//            dir.mkdirs()
//            dirs.add(dir)
//            adapter.notifyItemInserted(dirs.size - 1)
//        }


//        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
//        val button: Button = findViewById(R.id.button)
//        val path = this.getExternalFilesDir(null)
//        val letDirectory = File(path, "LET")
//        letDirectory.mkdirs()
//        val adapter = PageAdapter(letDirectory)
//        viewPager2.adapter = adapter
//        button.setOnClickListener {
//            val file = File(letDirectory, "page${letDirectory.listFiles()!!.size}.txt")
//            file.appendText("")
//            adapter.notifyItemInserted(letDirectory.listFiles()!!.size - 1)
//        }
    }
}