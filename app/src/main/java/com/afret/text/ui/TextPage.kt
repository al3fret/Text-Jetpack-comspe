package com.afret.text.ui


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afret.text.R
import com.afret.text.ui.theme.ColorGunmetal
import com.afret.text.ui.theme.cairoPlatinumSemiBold25
import com.afret.text.ui.theme.ibarraPlatinumBold25
import com.afret.text.ui.theme.mrsPlatinumNormal25


@Composable
fun TextPage() {


    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ,modifier = Modifier
            .fillMaxSize()
            .background(color = ColorGunmetal)) {


        Text(text = stringResource(id = R.string.test_Bilal_cairo),
        style = cairoPlatinumSemiBold25)

        Spacer(modifier = Modifier.height(15.dp))


        Text(text = stringResource(id = R.string.test_Bilal_ibarra),
        style = ibarraPlatinumBold25)
        Spacer(modifier = Modifier.height(15.dp))


        Text(text = stringResource(id = R.string.test_Bilal_mrs),
        style = mrsPlatinumNormal25)
    }
}


@Composable
@Preview
fun TextPagePreview() {
    TextPage()
}