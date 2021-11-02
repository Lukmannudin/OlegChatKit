package com.oleg.olegchatkit.chatmodel

import com.oleg.olegchatkit.R
import com.oleg.olegchatkit.viewholders.ViewHolderTypeFactory
import java.util.*

/**
 * Crafted by Lukman on 07/09/21.
 **/

open class Chat(
    open val id: Long,
    open val senderId: Long,
    open val receiverId: Long,
    open val date: Date
) : IChat {

    override fun type(viewHolderTypeFactory: ViewHolderTypeFactory): Int {
        return viewHolderTypeFactory.type(this)
    }

    companion object {
        const val CHAT_TEXT_OUTGOING_VIEW = R.layout.item_chat_outgoing_text
        const val CHAT_TEXT_INCOMING_VIEW = R.layout.item_chat_incoming_text
        const val CHAT_IMAGE_OUTGOING_VIEW = R.layout.item_chat_outgoing_image
        const val CHAT_IMAGE_INCOMING_VIEW = R.layout.item_chat_incoming_image
        const val CHAT_DEFAULT = R.layout.item_chat_default
    }

}