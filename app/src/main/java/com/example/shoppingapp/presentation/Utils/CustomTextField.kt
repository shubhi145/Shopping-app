package com.example.shoppingapp.presentation.Utils

import android.graphics.drawable.Icon
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.HistoricalChange
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation


@Composable
fun CustomTextFiled(
    value: String,
    onValueChange: (String)->Unit,
    label : String,
    modifier: Modifier = Modifier,
    singleLine: Boolean = true,
    leadingIcon: ImageVector? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        modifier = modifier,
        singleLine = singleLine,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        leadingIcon = leadingIcon?.let {{
            Icon(imageVector = it, contentDescription = null)}
        }

    )
}