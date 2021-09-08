package com.oleg.olegchatkit.viewholders

import android.view.View
import com.oleg.olegchatkit.BaseViewHolder
import com.oleg.olegchatkit.R
import com.oleg.olegchatkit.chatmodel.Chat
import com.oleg.olegchatkit.chatmodel.ChatImage
import com.oleg.olegchatkit.chatmodel.ChatText
import com.oleg.olegchatkit.chatmodel.ViewHolderVisitor

/**
 * Crafted by Lukman on 08/09/21.
 **/

class ViewHolderLayoutVisitor : ViewHolderVisitor {
    override fun create(parent: View, viewType: Int): BaseViewHolder<Chat>? {
        return when (viewType){
            R.layout.item_chat_text -> ChatTextViewHolder(parent)
            R.layout.item_chat_image -> ChatImageViewHolder(parent)
            else -> null
        }
    }

    override fun visit(chat: ChatText, layout: String): Int {
        return R.layout.item_chat_text
    }

    override fun visit(chat: ChatImage, layout: String): Int {
        return R.layout.item_chat_image
    }
}