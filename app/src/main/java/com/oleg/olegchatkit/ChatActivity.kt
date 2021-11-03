package com.oleg.olegchatkit

import android.os.Bundle
import android.view.View
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
        binding.rvChat.apply {
            adapter = chatAdapter
            setHasFixedSize(true)
            itemAnimator = null
        }

        binding.clMessageInput.apply {

            onSendClickListener = {

            }
            getSendMessageButtonClickListener {
                sendMessage(getSendMessage())
            }
        }
    }

    fun sendMessage(message: String) {
        binding.clMessageInput.apply {
            chatAdapter.addChat(ChatText(13121, 1, 2, message))
            scroolToLastPosition()
        }
    }

    private fun scroolToLastPosition() {
        binding.rvChat.smoothScrollToPosition(chatAdapter.itemCount)
    }

}