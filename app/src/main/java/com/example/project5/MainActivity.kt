package com.example.project5

import android.os.Bundle
import androidx.compose.ui.Alignment

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project5.ui.theme.Project5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project5Theme {
                QuadrantScreen()


            }
        }
    }
}

@Composable
fun ComposeTutorialScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),
            color = Color.Black
        )
        Text(
            text = stringResource(R.string.jetpack_compose_description),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp),
            color = Color.Black
        )

        Text(
            text = stringResource(R.string.jetpack_compose_tutorial_content),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp),
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeTutorialScreenPreview() {
    Project5Theme {
        ComposeTutorialScreen()
    }
}
@Composable
fun CompleteTaskScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp),
                contentScale = ContentScale.Fit
            )
            Text(
                text = stringResource(R.string.all_tasks_completed),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 24.dp, bottom = 8.dp)
            )
            Text(
                text = stringResource(R.string.nice_work),
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CompleteTaskScreenPreview() {
    Project5Theme {
        CompleteTaskScreen()
    }}
    @Composable
    fun QuadrantScreen() {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier.weight(1f)
            ) {
                QuadrantContent(
                    title = "Text composable",
                    description = "Displays text and follows the recommended Material Design guidelines.",
                    backgroundColor = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f)
                )
                QuadrantContent(
                    title = "Image composable",
                    description = "Creates a composable that lays out and draws a given Painter class object.",
                    backgroundColor = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(1f)
                )
            }
            Row(
                modifier = Modifier.weight(1f)
            ) {
                QuadrantContent(
                    title = "Row composable",
                    description = "A layout composable that places its children in a horizontal sequence.",
                    backgroundColor = Color(0xFFB69DF8),
                    modifier = Modifier.weight(1f)
                )
                QuadrantContent(
                    title = "Column composable",
                    description = "A layout composable that places its children in a vertical sequence.",
                    backgroundColor = Color(0xFFF6EDFF),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
    @Composable
    fun QuadrantContent(
        title: String,
        description: String,
        backgroundColor: Color,
        modifier: Modifier = Modifier
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(backgroundColor)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = description,
                fontSize = 16.sp,
                lineHeight = 20.sp
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun QuadrantScreenPreview() {
        Project5Theme {
            QuadrantScreen()
        }
    }
