package com.oleg.olegchatkit.chatmodel

/**
 * Crafted by Lukman on 07/09/21.
 **/

open class Chat (
    val id: Long,
    val senderId: Long,
    val receiverId: Long,
) : IChat