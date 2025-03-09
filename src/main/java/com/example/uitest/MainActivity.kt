package com.example.uitest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uitest.ui.theme.UITestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UITestTheme { // Ensure theme is applied
                Scaffold { padding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color.White)
                            .padding(padding)
                    ) {
                        UIReplicate()
                    }
                }
            }
        }
    }
}

@Composable
fun UIReplicate(){

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFF26225D)),
            contentAlignment = Alignment.Center
        ){


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ){


                Image(
                    painter = painterResource(R.drawable.mazadat),
                    contentDescription = "Image of Mazadat logo",
                    alignment = Alignment.TopCenter
                )

                Spacer(
                    modifier = Modifier.height(15.dp)
                )

                Text(
                    text = "Login",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.LightGray
                )

                Spacer(
                    modifier = Modifier.height(15.dp)
                )

                //NationalID feiled
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .height(50.dp)
                        .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                        .background(Color.Transparent),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "National ID",
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }

                Spacer(
                    modifier = Modifier.height(15.dp)
                )

                //Password feiled

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .height(50.dp)
                        .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                        .background(Color.Transparent),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Password",
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }

                Spacer(
                    modifier = Modifier.height(15.dp)
                )

                Button(
                    onClick = {},
                    shape =
                    RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .width(300.dp)
                        .height(50.dp),

                    colors = ButtonColors(Color(0xFF2A6DBB),
                        Color.White,
                        Color.Transparent,
                        Color.Transparent),


                ){
                    Text(
                        text = "Login",
                        fontSize = 16.sp,

                    )

                }



                Spacer(
                    modifier = Modifier.height(20.dp)
                )


                Text(
                    text = "Register",
                    fontSize = 16.sp,
                    color = Color(0xFF2A6DBB)
                )

                Spacer(
                    modifier = Modifier.height(40.dp)
                )

                Button(
                    onClick = {},
                    shape =
                    RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .width(300.dp)
                        .height(50.dp),

                    colors = ButtonColors(Color.Transparent,
                        Color.White,
                        Color.Transparent,
                        Color.Transparent),

                    border = BorderStroke(2.dp,Color(0xFF2A6DBB))
                ){
                    Text(
                        text = "Scan the code",
                        fontSize = 16.sp
                    )


                }


            }

        }

}
