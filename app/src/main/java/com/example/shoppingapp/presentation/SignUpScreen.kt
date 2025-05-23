package com.example.shoppingapp.presentation

import android.widget.Toast
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingapp.R
import com.example.shoppingapp.presentation.Utils.CustomTextFiled

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpScreen(){
    val context = LocalContext.current
    var firstName by remember{
        mutableStateOf("")
    }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
       Text(text = "SignUp",
           fontWeight = FontWeight.Bold,
           fontSize = 24.sp,
           modifier = Modifier
               .padding(vertical = 30.dp)
               .align(Alignment.Start)
       )
        CustomTextFiled(
            value = lastName,
            onValueChange = {lastName = it},
            label = "Last Name",
            leadingIcon = Icons.Default.Person,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
        )
        CustomTextFiled(
            value = firstName,
            onValueChange = {firstName = it},
            label = "First Name",
            leadingIcon = Icons.Default.Person,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
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
            value = phoneNumber,
            onValueChange = {phoneNumber = it},
            label = "Phone Number",
            leadingIcon = Icons.Default.Phone,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
        )
        CustomTextFiled(
            value = password,
            onValueChange = {password = it},
            label = "Create Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
            visualTransformation = PasswordVisualTransformation(),
        )
        CustomTextFiled(
            value = confirmPassword,
            onValueChange = {confirmPassword = it},
            label = "Confirm Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
            visualTransformation = PasswordVisualTransformation(),
        )
        Button(
            onClick = {
                if (firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && phoneNumber.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty())
                {

                    if(password == confirmPassword){

                        Toast.makeText(context, "SignUp Successful", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(context,"Password and Confirm Password does not match ", Toast.LENGTH_SHORT).show()
                    }
                }
                else{
                    Toast.makeText(context, "Please fill all the fields", Toast.LENGTH_SHORT).show()
                }
                      }, modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                          shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                colorResource(id = R.color.orange)
            )
              )
        {
            Text(text = "Sign Up", modifier = Modifier, color = Color.White)
        }

        Row(
            modifier = Modifier, verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Already have an account?")
            TextButton(onClick = {
                //navigate to login screen
            }) { Text(text = "Login",
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
