package com.oleg.olegchatkit.chatmodel

import com.oleg.olegchatkit.R
import com.oleg.olegchatkit.viewholders.ViewHolderTypeFactory

/**
 * Crafted by Lukman on 07/09/21.
 **/

open class Chat(
    open val id: Long,
    open val senderId: Long,
    open val receiverId: Long
) : IChat {

    override fun type(viewHolderTypeFactory: ViewHolderTypeFactory): Int {
        return viewHolderTypeFactory.type(this)
    }

    companion object {
        const val CHAT_TEXT_VIEW = R.layout.item_chat_text
        const val CHAT_IMAGE_VIEW = R.layout.item_chat_image
        const val CHAT_DEFAULT = R.layout.item_chat_default
    }

}