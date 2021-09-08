package com.oleg.olegchatkit

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.oleg.olegchatkit.chatmodel.IChat

/**
 * Crafted by Lukman on 08/09/21.
 **/

abstract class BaseViewHolder<Model: IChat>(view: View) : RecyclerView.ViewHolder(view) {

    abstract fun bind(mode: Model)

}