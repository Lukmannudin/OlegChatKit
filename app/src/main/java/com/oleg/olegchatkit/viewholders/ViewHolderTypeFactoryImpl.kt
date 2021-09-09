package com.oleg.olegchatkit.viewholders

import android.view.View
import com.oleg.olegchatkit.BaseViewHolder
import com.oleg.olegchatkit.chatmodel.Chat
import com.oleg.olegchatkit.chatmodel.Chat.Companion.CHAT_DEFAULT
import com.oleg.olegchatkit.chatmodel.Chat.Companion.CHAT_IMAGE_VIEW
import com.oleg.olegchatkit.chatmodel.Chat.Companion.CHAT_TEXT_VIEW
import com.oleg.olegchatkit.chatmodel.ChatImage
import com.oleg.olegchatkit.chatmodel.ChatText

/**
 * Crafted by Lukman on 09/09/21.
 **/

class ViewHolderTypeFactoryImpl : ViewHolderTypeFactory {

    override fun create(parent: View, viewType: Int): BaseViewHolder<Chat> {
        return when (viewType){
            CHAT_TEXT_VIEW -> ChatTextViewHolder(parent)
            CHAT_IMAGE_VIEW -> ChatImageViewHolder(parent)
            else -> ChatDefaultViewHolder(parent)
        }
    }

    override fun type(chat: Chat): Int {
        return when (chat) {
            is ChatText -> {
                CHAT_TEXT_VIEW
            }
            is ChatImage -> {
                CHAT_IMAGE_VIEW
            }
            else -> {
                CHAT_DEFAULT
            }
        }
    }

}