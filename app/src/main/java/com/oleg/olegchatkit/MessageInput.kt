package com.oleg.olegchatkit

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewOutlineProvider
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout

/**
 * Crafted by Lukman on 03/11/21.
 **/

class MessageInput(context: Context, attributeSet: AttributeSet) :
    ConstraintLayout(context, attributeSet), View.OnClickListener {

    private lateinit var messageInput: EditText
    private lateinit var btnAttachPhoto: ImageButton
    private lateinit var btnSend: ImageButton

    lateinit var onSendClickListener : (OnClickListener) -> Unit

    init {
        context.theme.obtainStyledAttributes(
            attributeSet,
            R.styleable.MessageInput,
            0,
            0
        ).apply {
            try {
                init(context)
            } finally {
                recycle()
            }
        }

    }

    private fun init(context: Context) {
        inflate(context, R.layout.view_message_input, this)

        messageInput = findViewById(R.id.edt_message_input)
        btnAttachPhoto = findViewById(R.id.ib_camera_icon)
        btnSend = findViewById(R.id.ib_send_button)

        btnSend.setOnClickListener(this)

        id = R.id.cl_message_input
        setBackgroundColor(context.getColor(R.color.lynx_white))
        elevation = 8f
        minimumHeight = 60
        outlineProvider = ViewOutlineProvider.BOUNDS
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.edt_message_input -> {
                clearFocus()
                messageInput.setText("")

                val imm: InputMethodManager = v.context
                    .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(this.windowToken, 0)
                onSendClickListener.invoke(this)

            }
        }
    }

    fun getSendMessageButton(): ImageButton {
        return btnSend
    }

    fun getSendMessage(): String {
        return messageInput.text.toString()
    }

    fun getSendMessageButtonClickListener(onClickListener: (OnClickListener) -> Unit) {
        this.onSendClickListener = onClickListener
    }

}