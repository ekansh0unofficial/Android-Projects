package com.example.a30day

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30day.model.Day
import com.example.a30day.ui.theme._30DayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    DaysApp()
                }
            }
        }
    }
}

@Composable
fun DaysApp( modifier: Modifier = Modifier) {
    Text(
        text = "Hello!",
        modifier = modifier
    )
}
val d = Day(
R.string.day1_headline,
R.string.day1_activity,
R.string.day1_quote,
R.string.day1_writer,
R.drawable.day1
)
@Composable
fun DayCard(modifier: Modifier = Modifier , day : Day = d){
    
}



@Preview(showBackground = true,
        showSystemUi = true
    )
@Composable
fun GreetingPreview() {
    _30DayTheme {
        //DayCard(day)
    }
}