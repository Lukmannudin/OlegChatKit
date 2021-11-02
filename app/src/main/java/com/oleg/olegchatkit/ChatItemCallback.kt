package com.oleg.olegchatkit

import androidx.recyclerview.widget.DiffUtil
import com.oleg.olegchatkit.chatmodel.Chat

/**
 * Crafted by Lukman on 02/11/21.
 **/

class ChatItemCallback : DiffUtil.ItemCallback<Chat>() {

    override fun areItemsTheSame(oldItem: Chat, newItem: Chat): Boolean {
        return (oldItem.id == newItem.id)
    }

    override fun areContentsTheSame(oldItem: Chat, newItem: Chat): Boolean {
        return (oldItem.receiverId == newItem.receiverId) &&
                (oldItem.senderId == newItem.senderId) &&
                (oldItem.date == newItem.date)
    }

}