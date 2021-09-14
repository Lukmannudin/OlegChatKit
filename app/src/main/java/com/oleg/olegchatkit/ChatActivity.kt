package com.oleg.olegchatkit

import android.content.Context
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.oleg.olegchatkit.chatmodel.ChatText
import com.oleg.olegchatkit.databinding.ActivityChatBinding
import com.oleg.olegchatkit.dummy.Dummy

class ChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBinding
    private lateinit var chatAdapter: ChatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val chats = Dummy.produce(this)

        chatAdapter = ChatAdapter()
        chatAdapter.setChats(chats)
        binding.rvChat.adapter = chatAdapter

        binding.apply {
            ibSendButton.setOnClickListener {
                sendMessage(binding.edtMessageInput.text.toString())
            }
        }
    }

    private fun sendMessage(message: String) {
        binding.edtMessageInput.apply {
            clearFocus()
            setText("")

            chatAdapter.addChat(ChatText(13121, 1, 2, message))

            // clear keyboard
            val imm: InputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(this.windowToken, 0)
        }
    }

}