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
import com.example.jetprofile.ui.theme.JetProfileTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.draw.clip
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.jetprofile.conponents.CompanySection
import com.example.jetprofile.conponents.DetailSection
import com.example.jetprofile.conponents.ProfileText


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetProfileTheme {
        MainContent()
    }
}

@Composable
fun MainContent() {
    Column(
        // 水平方向中央寄せ
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            // スクロール対応
            .verticalScroll(rememberScrollState())
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

        CompanySection()

        Spacer(modifier = Modifier.height(20.dp))

        // 詳細表示ボタン
        // こいつが変更されるとComposeが再び発動
        var isShowDetail by remember { mutableStateOf(false) }
        // TODOに処理を書く
        Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color(0xFFF85F6A)),
            onClick = { isShowDetail = !isShowDetail }
        ) {
            Text(text = "詳細を表示", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))

        // 趣味と居住地
        // isShowDetailの値次第で表示するかどうか決める
        if (isShowDetail) {
            DetailSection()
        }
    }
}







