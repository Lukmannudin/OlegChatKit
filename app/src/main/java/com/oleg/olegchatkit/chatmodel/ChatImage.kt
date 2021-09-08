package com.oleg.olegchatkit.chatmodel

/**
 * Crafted by Lukman on 07/09/21.
 **/

class ChatImage(
    id: Long,
    senderId: Long,
    receiverId: Long,
    pictureUrl: String
) : Chat(id, senderId, receiverId) {

    override fun accept(viewHolderVisitor: ViewHolderVisitor, layout: String): Int {
        return viewHolderVisitor.visit(this, layout)
    }

}