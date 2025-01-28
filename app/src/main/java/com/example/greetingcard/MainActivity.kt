package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Pancakes")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val DancingScript = FontFamily(
        Font(R.font.dancing_script)
    )
    Surface(color = Color(0xFFCE2319)) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = androidx.compose.ui.Alignment.Center) {
            Box {
                Image(
                    painter = painterResource(R.drawable.border),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
                ) {
                Text(
                    text = "Happy New Year $name!",
                    fontFamily = DancingScript,
                    modifier = modifier.padding(24.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 45.sp,
                    color = Color(0xFFFAEB96),
                    textAlign = TextAlign.Center,
                    style = LocalTextStyle.current.merge(
                        TextStyle(
                            lineHeight = 1.8.em,
                            platformStyle = PlatformTextStyle(
                                includeFontPadding = false
                            ),
                            lineHeightStyle = LineHeightStyle(
                                alignment = LineHeightStyle.Alignment.Center,
                                trim = LineHeightStyle.Trim.None
                            )
                        )
                    )
                )
                val rainbowColorsBrush = remember {
                    Brush.sweepGradient(
                        listOf(
                            Color(0xFF9575CD),
                            Color(0xFFBA68C8),
                            Color(0xFFE57373),
                            Color(0xFFFFB74D),
                            Color(0xFFFFF176),
                            Color(0xFFAED581),
                            Color(0xFF4DD0E1),
                            Color(0xFF9575CD)
                        )
                    )
                }
                val borderWidth = 4.dp
                Image(
                    painter = painterResource(R.drawable.profile_picture),
                    contentDescription = "Profile picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .border(
                            BorderStroke(borderWidth, rainbowColorsBrush),
                            CircleShape
                        )
                        .padding(borderWidth)
                        .clip(CircleShape)
                )
                Text(
                    text = "May the coming year bring you happiness, good health, and the fullfillment of your dreams.",
                    modifier = modifier.padding(23.dp),
                    fontFamily = DancingScript,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    color = Color(0xFFFAEB96),
                    textAlign = TextAlign.Center,
                    style = LocalTextStyle.current.merge(
                        TextStyle(
                            lineHeight = 1.8.em,
                            platformStyle = PlatformTextStyle(
                                includeFontPadding = false
                            ),
                            lineHeightStyle = LineHeightStyle(
                                alignment = LineHeightStyle.Alignment.Center,
                                trim = LineHeightStyle.Trim.None
                            )
                        )
                    )
                )
                Image(
                    painter = painterResource(R.drawable.apricot_flowers),
                    contentDescription = "Apricot flowers",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(120.dp)
                )
            }
        }
    }
}