package com.oleg.olegchatkit.dummy

import android.content.Context
import com.oleg.olegchatkit.R
import com.oleg.olegchatkit.chatmodel.Chat
import com.oleg.olegchatkit.chatmodel.ChatImage
import com.oleg.olegchatkit.chatmodel.ChatText

/**
 * Crafted by Lukman on 09/09/21.
 **/

object Dummy {
    fun produce(context: Context): List<Chat> {
        val chats = mutableListOf<Chat>()
        chats.add(ChatText(
            1,1, 2, "hallo"
        ))
        chats.add(ChatText(
            1,2, 1, "ya?"
        ))
        chats.add(ChatImage(
            1,1, 2, "http://s3.amazonaws.com/pix.iemoji.com/images/emoji/apple/ios-12/256/indonesia.png"
        ))
        chats.add(ChatText(
            1,2, 1, "baik, km gimana?"
        ))
        chats.add(ChatText(
            1,1, 2, "baik juga"
        ))
        chats.add(ChatText(
            1,2, 1, "btw, gimana sekarang kerjaan mu?"
        ))
        chats.add(ChatText(
            1,2, 1, "all good, why?"
        ))
        chats.add(ChatImage(
            1,2, 1, "https://i.pinimg.com/originals/d1/8d/3e/d18d3e964fdb8f4cb3c11b0cde7fe3a5.jpg"
        ))
        chats.add(ChatText(
            1,2, 1, context.getString(R.string.lorem_ipsum)
        ))
        chats.add(ChatText(
            1,1, 2, context.getString(R.string.lorem_ipsum)
        ))
        return chats
    }
}