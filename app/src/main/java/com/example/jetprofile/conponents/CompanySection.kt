package com.example.jetprofile.conponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.conponents.ProfileText

@Composable
fun CompanySection() {
    Column (
        // 左寄せ
        horizontalAlignment = Alignment.Start,
        // これやらないと真ん中に寄っちゃう
        modifier = Modifier.fillMaxWidth()

    ) {
        Text(text = "東京工科大学", fontSize = 26.sp, fontWeight = FontWeight.ExtraBold)
        ProfileText(text_1 = "コンピュータサイエンス学部　先進情報専攻", fontS = 16)

        Spacer(modifier = Modifier.height(20.dp))

        // Email
        Label(icon = Icons.Default.Email, text = "Email")

        Spacer(modifier = Modifier.height(10.dp))
        ProfileText(text_1 = "example@ezweb.ne.jp", fontS = 16)
        Spacer(modifier = Modifier.height(5.dp))

        // 線を描画
        Divider(
            // 線の太さ
            thickness = 2.dp,
            // 角が完全に丸い
            modifier = Modifier.clip(RoundedCornerShape(1000.dp))
        )
    }
}