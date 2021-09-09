package com.oleg.olegchatkit.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.oleg.olegchatkit.BaseViewHolder
import com.oleg.olegchatkit.R
import com.oleg.olegchatkit.chatmodel.Chat
import com.oleg.olegchatkit.chatmodel.ChatImage

/**
 * Crafted by Lukman on 08/09/21.
 **/

class ChatImageViewHolder(itemView: View) : BaseViewHolder<Chat>(itemView) {

    private val ivPictureMessage: ImageView = itemView.findViewById(R.id.iv_chat_image)

    override fun bind(model: Chat) {
        val chat = model as ChatImage
        Glide.with(itemView.context).load(chat.pictureUrl).into(ivPictureMessage)
    }

}