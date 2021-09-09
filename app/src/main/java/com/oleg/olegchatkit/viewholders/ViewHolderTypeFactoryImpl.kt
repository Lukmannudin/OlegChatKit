package com.oleg.olegchatkit.viewholders

import android.view.View
import com.oleg.olegchatkit.BaseViewHolder
import com.oleg.olegchatkit.chatmodel.Chat
import com.oleg.olegchatkit.chatmodel.Chat.Companion.CHAT_DEFAULT
import com.oleg.olegchatkit.chatmodel.Chat.Companion.CHAT_IMAGE_INCOMING_VIEW
import com.oleg.olegchatkit.chatmodel.Chat.Companion.CHAT_IMAGE_OUTGOING_VIEW
import com.oleg.olegchatkit.chatmodel.Chat.Companion.CHAT_TEXT_INCOMING_VIEW
import com.oleg.olegchatkit.chatmodel.Chat.Companion.CHAT_TEXT_OUTGOING_VIEW
import com.oleg.olegchatkit.chatmodel.ChatImage
import com.oleg.olegchatkit.chatmodel.ChatText
import com.oleg.olegchatkit.viewholders.incoming.ChatIncomingImageViewHolder
import com.oleg.olegchatkit.viewholders.incoming.ChatIncomingTextViewHolder
import com.oleg.olegchatkit.viewholders.outgoing.ChatOutgoingImageViewHolder
import com.oleg.olegchatkit.viewholders.outgoing.ChatOutgoingTextViewHolder

/**
 * Crafted by Lukman on 09/09/21.
 **/

class ViewHolderTypeFactoryImpl : ViewHolderTypeFactory {

    override fun create(parent: View, viewType: Int): BaseViewHolder<Chat> {
        return when (viewType){
            CHAT_TEXT_OUTGOING_VIEW -> ChatOutgoingTextViewHolder(parent)
            CHAT_TEXT_INCOMING_VIEW -> ChatIncomingTextViewHolder(parent)
            CHAT_IMAGE_OUTGOING_VIEW -> ChatOutgoingImageViewHolder(parent)
            CHAT_IMAGE_INCOMING_VIEW -> ChatIncomingImageViewHolder(parent)
            else -> ChatDefaultViewHolder(parent)
        }
    }

    override fun type(chat: Chat): Int {
        val userId = 1L

        return when (chat) {
            is ChatText -> {
                if (chat.senderId == userId){
                    CHAT_TEXT_OUTGOING_VIEW
                } else {
                    CHAT_TEXT_INCOMING_VIEW
                }
            }
            is ChatImage -> {
                if (chat.senderId == userId){
                    CHAT_IMAGE_OUTGOING_VIEW
                } else {
                    CHAT_IMAGE_INCOMING_VIEW
                }
            }
            else -> {
                CHAT_DEFAULT
            }
        }
    }

}