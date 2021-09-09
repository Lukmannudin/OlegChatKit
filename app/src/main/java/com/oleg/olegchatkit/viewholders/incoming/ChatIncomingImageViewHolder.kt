package com.oleg.olegchatkit.viewholders.incoming

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.oleg.olegchatkit.BaseViewHolder
import com.oleg.olegchatkit.R
import com.oleg.olegchatkit.chatmodel.Chat
import com.oleg.olegchatkit.chatmodel.ChatImage

/**
 * Crafted by Lukman on 08/09/21.
 **/

class ChatIncomingImageViewHolder(itemView: View) : BaseViewHolder<Chat>(itemView) {

    private val ivPictureMessage: ImageView = itemView.findViewById(R.id.iv_chat_incoming_image)

    override fun bind(model: Chat) {
        val chat = model as ChatImage
        Glide.with(itemView.context).load(chat.pictureUrl).into(ivPictureMessage)
    }

}