package com.example.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {

    //declare
    private lateinit var ageInput: EditText
    private lateinit var searchButton: Button
    private lateinit var clearButton: Button
    private lateinit var resultTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //initialise
        ageInput = findViewById(R.id.ageInput)
        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        resultTextView = findViewById(R.id.resultTextView)

        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            //if age is not null and age is in range between 20 and 100
            if (age != null && age in 20..100) {
                val famouspersonName = when (age) {
                    39 -> "Martin Luther King Jr., Martin Luther King Jr. survived an assassination attempt a decade prior to his death."
                    75 -> "O.R Tambo, O.R Tambo became a founding member of the ANC Youth League in 1944 then was later elected to the Transvaal executive ANC in 1946."
                    30 -> "Steve Biko, The student affairs building at the University of Cape Town was named after Steve Biko. "
                    76 -> "Albert Einstein, Albert Einstein wrote his first scientific paper at the young age of 16."
                    47 -> "Frida Kahlo, Frida Kahlo painted 55 portraits of herself."
                    65 -> "Walt Disney, Walt Disney's very first animation studio went bankrupt in less than a year."
                    87 -> "Mother Teresa, Mother Teresa had already decided at the age of 12 to devote her life to religion."
                    78 -> "Mahatma Gandhi, Mahatma Gandhi was a very shy child and would therefore run home straight after school to avoid talking to anyone."
                    36 -> "Princess Diana, Princess Diana was given credit for removing the stigma associated with AIDS."
                    95 -> "Nelson Mandela, Nelson Mandela favourite dish was tripe - the lining of farm animals."
                    86 -> "Nikola Telsa, Nikola Tesla first worked for Thomas Edison, then later became his competitor."
                    84 -> "Isaac Newton, Issac Newton's studies on alchemy and occult is what led him to his invention of gravity."
                    52 -> "William Shakespeare, Before trying to be a playwright, William Shakespeare tried to be an actor."
                    else -> null
                }
                val message =
                    if (famouspersonName != null) "The famous person's name is $famouspersonName."
                    else "No famous person found with the entered age"
                resultTextView.text = message


            } else {
                resultTextView.text = "Invalid input. Please ensure that you enter a valid age which is a whole number between 20 and 100."
            }
        }


            clearButton.setOnClickListener {
                ageInput.text.clear()
                resultTextView.text = ""
            }
        }

     }

