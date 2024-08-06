package com.pstryksoft.quocalcus.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.pstryksoft.quocalcus.R
import com.pstryksoft.quocalcus.ui.theme.QuoCalCusTheme

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    QuoCalCusTheme {
        Surface(modifier = Modifier) {
            Column {
                Text(text = stringResource(R.string.test))
            }
            
        }
    }
}

@Preview
@Composable
private fun MainPrev() {
    MainScreen(modifier = Modifier)

}