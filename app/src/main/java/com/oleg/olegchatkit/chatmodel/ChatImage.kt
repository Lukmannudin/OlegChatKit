package com.oleg.olegchatkit.chatmodel

import com.oleg.olegchatkit.viewholders.ViewHolderTypeFactory

/**
 * Crafted by Lukman on 07/09/21.
 **/

data class ChatImage(
    override val id: Long,
    override val senderId: Long,
    override val receiverId: Long,
    val pictureUrl: String
) : Chat(id, senderId, receiverId) {

    override fun type(viewHolderTypeFactory: ViewHolderTypeFactory): Int {
        return viewHolderTypeFactory.type(this)
    }
}