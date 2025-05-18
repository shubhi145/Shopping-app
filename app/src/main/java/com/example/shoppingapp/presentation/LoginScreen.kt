package com.example.shoppingapp.presentation

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingapp.R
import com.example.shoppingapp.presentation.Utils.CustomTextFiled

@Composable
fun LoginScreenUi(){

    val context = LocalContext.current
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (
        modifier = Modifier.fillMaxSize().padding(16.dp)
            , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center

    ){
        Text(text = "Login",
            fontSize = 24.sp,
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Start)
          )

        CustomTextFiled(
            value = email,
            onValueChange = {email = it},
            label = "Email",
            leadingIcon = Icons.Default.Email,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
        )
        CustomTextFiled(
            value = password,
            onValueChange = {password = it},
            label = "Password",
            leadingIcon = Icons.Default.Lock,
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
        )
        Spacer(modifier = Modifier.padding(4.dp))

        Text(text = "Forgot Password?",
            modifier = Modifier.align(Alignment.End))

        Spacer(modifier = Modifier.padding(16.dp))

        Button(
            onClick = {
                if(email.isNotEmpty() && password.isNotEmpty())
                {
                    //verify the user
                    Toast.makeText(context,"Login Successful", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(context,"Please fill all the fields", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.orange)),

        ) {
            Text(text = "Login", color = Color.White)
        }


        Row(
            modifier = Modifier, verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Do not have an account?")
            TextButton(onClick = {
                //navigate to Signup Screen
            }) { Text(text = "SignUp",
                color = colorResource(id = R.color.orange)) }
        }

        Row (
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            HorizontalDivider(modifier = Modifier.weight(1f))
            Text(text = "Or", modifier = Modifier.padding(horizontal = 8.dp))
            HorizontalDivider(modifier = Modifier.weight(1f))
        }


        OutlinedButton(onClick =
        {},
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            shape = RoundedCornerShape(8.dp),
        ){
            Image(painter = painterResource(R.drawable.google), contentDescription = null,
                modifier = Modifier.size(24.dp))

            Spacer(modifier = Modifier.size(8.dp))

            Text(text = "Continue with Google")
        }



    }
}