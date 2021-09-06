package com.oleg.olegchatkit.chatmodel

/**
 * Crafted by Lukman on 07/09/21.
 **/

class ChatImage(
    id: Long,
    senderId: Long,
    receiverId: Long,
    pictureUrl: String
) : Chat(id, senderId, receiverId)