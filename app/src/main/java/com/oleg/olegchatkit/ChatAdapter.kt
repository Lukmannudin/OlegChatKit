package com.oleg.olegchatkit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oleg.olegchatkit.chatmodel.Chat
import com.oleg.olegchatkit.chatmodel.ChatItem

/**
 * Crafted by Lukman on 08/09/21.
 **/

class ChatAdapter(private val visitor: ViewHolderLayoutVisitor = ViewHolderLayoutVisitor())
    : RecyclerView.Adapter<BaseViewHolder<Chat>>() {

    private val chats = mutableListOf<ChatItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Chat> {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return visitor.create(view, viewType)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Chat>, position: Int) {
        holder.bind(chats[position].content)
    }

    override fun getItemCount() = chats.size

    override fun getItemViewType(position: Int): Int {
        val chatItem = chats[position]
        return chatItem.content.accept(visitor, chatItem.layout)
    }
}