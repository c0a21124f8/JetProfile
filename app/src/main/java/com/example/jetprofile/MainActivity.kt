package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetprofile.ui.theme.JetProfileTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.size
import androidx.compose.ui.draw.clip
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Divider
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.vector.ImageVector

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetProfileTheme {
        Column(
            // 水平方向中央寄せ
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.tomato),
                contentDescription = null,
                modifier = Modifier
                    // 画像サイズ調整
                    .size(100.dp)
                    // 角丸くできる
                    .clip(RoundedCornerShape(20.dp))
            )
            Spacer(modifier = Modifier.height(20.dp))

            // 名前
            ProfileText("望月和馬",16)
            Spacer(modifier = Modifier.height(20.dp))

            //　職業
            ProfileText("職業： 大学生", 16)
            Spacer(modifier = Modifier.height(20.dp))

            Column (
                // 左寄せ
                horizontalAlignment = Alignment.Start,
                // これやらないと真ん中に寄っちゃう
                modifier = Modifier.fillMaxSize()

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
                Spacer(modifier = Modifier.height(20.dp))

                // TODOに処理を書く
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color(0xFFF85F6A)),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "詳細を表示", color = Color.White)
                }
                Spacer(modifier = Modifier.height(20.dp))

                // 趣味と居住地
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                        // カラムの背景色
                        // .copy(透明度)で透明度設定できる
                        .background(Color.LightGray.copy(alpha = 0.3f))
                        .padding(horizontal = 10.dp, vertical = 20.dp)
                ) {

                }
            }



        }
    }
}

@Composable
fun ProfileText(text_1: String, fontS: Int) {

    Text(
        text = text_1,
        color = Color.Gray,
        fontSize = fontS.sp,
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun Label(
    icon: ImageVector,
    text: String,

    // Colorに値入れないと元々設定してたやつにする
    color: Color = MaterialTheme.colorScheme.onBackground
){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = text, fontSize = 14.sp, fontWeight = FontWeight.Bold)
    }
}


