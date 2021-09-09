package com.oleg.olegchatkit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.oleg.olegchatkit.dummy.Dummy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvChats = findViewById<RecyclerView>(R.id.rv_chat)
        val chats = Dummy.produce()

        val chatAdapter = ChatAdapter()
        chatAdapter.setChats(chats)
        rvChats.adapter = chatAdapter
    }
}