package com.oleg.olegchatkit.chatmodel

/**
 * Crafted by Lukman on 07/09/21.
 **/

class ChatText(
    id: Long,
    senderId: Long,
    receiverId: Long,
    message: String
) : Chat(id, senderId, receiverId)