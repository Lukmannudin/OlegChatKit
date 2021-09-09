package com.oleg.olegchatkit.viewholders

import android.view.View
import com.oleg.olegchatkit.BaseViewHolder
import com.oleg.olegchatkit.chatmodel.Chat

/**
 * Crafted by Lukman on 09/09/21.
 **/

interface ViewHolderTypeFactory {

    fun type(chat: Chat): Int

    fun create(parent: View, viewType: Int): BaseViewHolder<Chat>

}