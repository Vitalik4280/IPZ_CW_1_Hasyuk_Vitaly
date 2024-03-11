package ua.edu.lntu.cw_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw_1.ui.theme.IPZ_CW_1_Hasyuk_VitalyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_1_Hasyuk_VitalyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Page();
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Page(modifier: Modifier = Modifier) {
    Column {
        Profile(
            image = R.drawable.ic_launcher_background,
            "John Doe",
            "Control work 1"
        )
        Spacer(modifier = Modifier.height(15.dp))
        Column() {
            Info(
                icon = R.drawable.baseline_local_phone_24,
                info = "+11111111111"
            )
            Spacer(modifier = Modifier.height(10.dp))
            Info(
                icon = R.drawable.baseline_share_24,
                info = "@AndroidDev"
            )
            Spacer(modifier = Modifier.height(10.dp))
            Info(
                icon = R.drawable.baseline_mail_24,
                info = "mail@mail.com"
            )

        }
    }
}

@Composable
fun Profile(
    image: Int,
    name: String,
    label: String,
    modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(
                color = MaterialTheme.colorScheme.background,
            )

    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        )
        Text(
            text = "$name",
        )
        Text(
            text = "$label",
        )
    }
}

@Composable
fun Info(
    icon: Int,
    info: String,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
        )
        Text(
            text = "$info"
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ_CW_1_Hasyuk_VitalyTheme {
        Page();
    }
}