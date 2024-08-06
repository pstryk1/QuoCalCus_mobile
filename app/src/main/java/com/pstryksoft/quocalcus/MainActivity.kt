package com.pstryksoft.quocalcus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.pstryksoft.quocalcus.Screens.MainScreen
import com.pstryksoft.quocalcus.ui.theme.QuoCalCusTheme

class MainActivity : ComponentActivity() {
    private val mainVM: mainViewModel by viewModels{
        ViewModelProvider.AndroidViewModelFactory.getInstance(application)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen(modifier = Modifier)
        }
    }
}

@Composable
fun QuocalcusUi(name: String) {
    QuoCalCusTheme {
        Text(
            text = "Hello $name!"
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    QuoCalCusTheme {
        QuocalcusUi("Android")
    }
}