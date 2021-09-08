package com.oleg.olegchatkit

import android.view.View
import com.oleg.olegchatkit.chatmodel.*
import com.oleg.olegchatkit.viewholders.ChatDefaultViewHolder
import com.oleg.olegchatkit.viewholders.ChatTextViewHolder
import com.oleg.olegchatkit.viewholders.ChatImageViewHolder

/**
 * Crafted by Lukman on 08/09/21.
 **/

class ViewHolderLayoutVisitor : ViewHolderVisitor {
    override fun create(parent: View, viewType: Int): BaseViewHolder<Chat> {
        return when (viewType){
            R.layout.item_chat_text -> ChatImageViewHolder(parent)
            R.layout.item_chat_receiver -> ChatTextViewHolder(parent)
            else -> ChatDefaultViewHolder(parent)
        }
    }

    override fun visit(chat: ChatText, layout: String): Int {
        return R.layout.item_chat_text
    }

    override fun visit(chat: ChatImage, layout: String): Int {
        return R.layout.item_chat_receiver
    }
}