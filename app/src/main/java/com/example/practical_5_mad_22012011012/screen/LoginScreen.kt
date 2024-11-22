import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practical_5_mad_22012011012.R
import com.example.practical_5_mad_22012011012.screen.components.FormField

@Preview(showBackground = true)
@Composable
fun LoginScreen( modifier: Modifier= Modifier){
    Column (
        modifier= Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Spacer(modifier=Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.guni_pink_logo),
            contentDescription = "Guni Logo",
            modifier = Modifier
                .size(120.dp)
                .fillMaxSize(),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(20.dp))

    Spacer(modifier = Modifier.height(20.dp))

    Card(
        elevation = CardDefaults.cardElevation(20.dp),
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column( modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)) {
            FormField(Label = "Email")
            FormField(Label = "Password", isPasswordField = true)
            Text(
                text = "ForgotPassword?",
                fontSize = 18.sp,
                modifier= Modifier
                    .padding(bottom = 50.dp)
                    .align(Alignment.End)
            )
            Button(onClick = { //
            },
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
            ) {

            }
        }
        }
}
}