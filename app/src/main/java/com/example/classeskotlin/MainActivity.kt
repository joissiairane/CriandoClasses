package com.example.classeskotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.classeskotlin.ui.theme.ClassesKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClassesKotlinTheme {
                // A surface container using the 'background' color from the theme
                Principal()
            }
        }
    }
}

@Composable
fun Principal() {
  val crianca = Pessoa("Joana",13)
    val beatriz = Aluno("beatriz",27)
    val Wagner = Professor("Wagner",35,"DSII")
Column() {
    Text(text = "Me chamo ${crianca.nome}, e tenho ${crianca.Idade} anos...")
    Text(text = "O professor ${Wagner.nome} leciona a disciplina de ${Wagner.Disciplina} para a ${beatriz.nome}")
}

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Principal()
}