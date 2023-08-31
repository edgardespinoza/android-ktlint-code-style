package com.eespinor.ktlintcode

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.eespinor.ktlintcode.ui.theme.KtlintCodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(
            savedInstanceState
        )
        setContent { // addComment
            KtlintCodeTheme { }
        }
    }
}
