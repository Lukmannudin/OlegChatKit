package com.oleg.olegchatkit.chatmodel

import com.oleg.olegchatkit.viewholders.ViewHolderTypeFactory
import java.util.*

/**
 * Crafted by Lukman on 07/09/21.
 **/

data class ChatText(
    override val id: Long,
    override val senderId: Long,
    override val receiverId: Long,
    val message: String,
    override val date: Date = Date()
) : Chat(id, senderId, receiverId, date) {

    override fun type(viewHolderTypeFactory: ViewHolderTypeFactory): Int {
        return viewHolderTypeFactory.type(this)
    }
}