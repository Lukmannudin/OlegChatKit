package com.oleg.olegchatkit.viewholders

import android.view.View
import android.widget.TextView
import com.oleg.olegchatkit.BaseViewHolder
import com.oleg.olegchatkit.R
import com.oleg.olegchatkit.chatmodel.Chat
import com.oleg.olegchatkit.chatmodel.ChatText

/**
 * Crafted by Lukman on 08/09/21.
 **/

class ChatTextViewHolder(itemView: View) : BaseViewHolder<Chat>(itemView) {

    private val tvChatMessage: TextView = itemView.findViewById(R.id.tv_chat_sender_message)

    override fun bind(model: Chat) {
        val chat = model as ChatText
        tvChatMessage.text = chat.message
    }
}