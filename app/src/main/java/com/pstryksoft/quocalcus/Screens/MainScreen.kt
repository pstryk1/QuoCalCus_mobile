package com.pstryksoft.quocalcus.Screens

import android.app.Application
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pstryksoft.quocalcus.R
import com.pstryksoft.quocalcus.mainViewModel
import com.pstryksoft.quocalcus.ui.theme.QuoCalCusTheme


@Composable
fun MainScreen(modifier: Modifier = Modifier, viewModel: mainViewModel) {
    QuoCalCusTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background) {
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = stringResource(R.string.depar), modifier = Modifier.align(Alignment.Start))
                TextField(
                    value = viewModel.departure,
                    onValueChange = {newValue -> viewModel.departure = newValue },
                    readOnly = false,

                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(text = stringResource(R.string.dest), modifier = Modifier.align(Alignment.Start))
                TextField(
                    value = viewModel.destination,
                    onValueChange = {newValue -> viewModel.destination = newValue},
                    readOnly = false,

                    modifier = Modifier
                        .fillMaxWidth()
                )

                Button(onClick = { viewModel.result = "Your trip: from " + viewModel.departure + " to " + viewModel.destination}, ) {
                    Text(text = "Calculate your trip!", modifier = Modifier.align(Alignment.CenterVertically))
                    
                }
                Text(text = viewModel.result)


            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MainPrev() {
    MainScreen(modifier = Modifier, viewModel = mainViewModel(application = Application()))

}