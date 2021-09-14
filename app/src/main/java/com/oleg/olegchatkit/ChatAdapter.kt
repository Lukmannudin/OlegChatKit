package com.oleg.olegchatkit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oleg.olegchatkit.chatmodel.Chat
import com.oleg.olegchatkit.chatmodel.ChatItem
import com.oleg.olegchatkit.viewholders.ViewHolderTypeFactory
import com.oleg.olegchatkit.viewholders.ViewHolderTypeFactoryImpl

/**
 * Crafted by Lukman on 08/09/21.
 **/

class ChatAdapter : RecyclerView.Adapter<BaseViewHolder<Chat>>() {

    private val typeFactory: ViewHolderTypeFactory = ViewHolderTypeFactoryImpl()

    private val chats = mutableListOf<Chat>()

    fun setChats(chats: List<Chat>){
        this.chats.clear()
        this.chats.addAll(chats)
        notifyDataSetChanged()
    }

    fun addChat(chat: Chat){
        this.chats.add(chat)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Chat> {
        return typeFactory.create(
            LayoutInflater.from(parent.context).inflate(viewType, parent, false),
            viewType
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Chat>, position: Int) {
        holder.bind(chats[position])
    }

    override fun getItemCount() = chats.size

    override fun getItemViewType(position: Int): Int {
        return chats[position].type(typeFactory)
    }
}