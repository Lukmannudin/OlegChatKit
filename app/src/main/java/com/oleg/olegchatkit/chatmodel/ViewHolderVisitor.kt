package com.oleg.olegchatkit.chatmodel

import android.view.View
import com.oleg.olegchatkit.BaseViewHolder

/**
 * Crafted by Lukman on 08/09/21.
 **/

interface ViewHolderVisitor {

    fun create(parent: View, viewType: Int): BaseViewHolder<Chat>

    fun visit(chat: ChatText, layout: String): Int

    fun visit(chat: ChatImage, layout: String): Int
}