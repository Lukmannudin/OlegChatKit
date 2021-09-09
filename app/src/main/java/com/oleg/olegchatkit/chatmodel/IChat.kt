package com.oleg.olegchatkit.chatmodel

import com.oleg.olegchatkit.viewholders.ViewHolderTypeFactory

/**
 * Crafted by Lukman on 07/09/21.
 **/

interface IChat {

    fun type(viewHolderTypeFactory: ViewHolderTypeFactory): Int

}