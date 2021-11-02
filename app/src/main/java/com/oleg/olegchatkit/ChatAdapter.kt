package com.oleg.olegchatkit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.oleg.olegchatkit.chatmodel.Chat
import com.oleg.olegchatkit.chatmodel.ChatItem
import com.oleg.olegchatkit.viewholders.ViewHolderTypeFactory
import com.oleg.olegchatkit.viewholders.ViewHolderTypeFactoryImpl

/**
 * Crafted by Lukman on 08/09/21.
 **/

class ChatAdapter : ListAdapter<Chat, BaseViewHolder<Chat>>(ChatItemCallback()) {

    private val typeFactory: ViewHolderTypeFactory = ViewHolderTypeFactoryImpl()

    fun setChats(chats: List<Chat>){
        submitList(chats)
    }

    fun addChat(chat: Chat){
        val chats = currentList.toMutableList()
        chats.add(chat)
        submitList(chats)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Chat> {
        return typeFactory.create(
            LayoutInflater.from(parent.context).inflate(viewType, parent, false),
            viewType
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Chat>, position: Int) {
        holder.bind(currentList[position])
    }

    override fun getItemCount() = currentList.size

    override fun getItemViewType(position: Int): Int {
        return currentList[position].type(typeFactory)
    }
}