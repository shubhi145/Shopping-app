package com.example.shoppingapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
       Text(text = "SignUp",
           fontWeight = FontWeight.Bold,
           fontSize = 24.sp,
           modifier = Modifier.padding(vertical = 30.dp)
               .align(Alignment.Start)
       )
        CustomTextFiled(
            value = lastName,
            onValueChange = {lastName = it},
            label = "Last Name",
            leadingIcon = Icons.Default.Person,
            modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp),
        )
        CustomTextFiled(
            value = firstName,
            onValueChange = {firstName = it},
            label = "First Name",
            leadingIcon = Icons.Default.Person,
            modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp),
        )
        CustomTextFiled(
            value = email,
            onValueChange = {email = it},
            label = "Email",
            leadingIcon = Icons.Default.Email,
            modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp),
        )
        CustomTextFiled(
            value = phoneNumber,
            onValueChange = {phoneNumber = it},
            label = "Phone Number",
            leadingIcon = Icons.Default.Phone,
            modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp),
        )
        CustomTextFiled(
            value = password,
            onValueChange = {password = it},
            label = "Create Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp),
        )
        CustomTextFiled(
            value = confirmPassword,
            onValueChange = {confirmPassword = it},
            label = "Confirm Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp),
        )




    }
}
