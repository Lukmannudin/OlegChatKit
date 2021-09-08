package com.oleg.olegchatkit.chatmodel

/**
 * Crafted by Lukman on 07/09/21.
 **/

abstract class Chat (
    private val id: Long,
    private val senderId: Long,
    private val receiverId: Long,
) : IChat {

    abstract fun accept(
        viewHolderVisitor: ViewHolderVisitor,
        layout: String
    ) : Int
}