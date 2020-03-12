package org.shanewalters.biographyassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
val name = "Shane Walters"
var age = 30
val birthPlace = "North Little Rock, AR"
var careerAspirations = "In my future career, I aspire to use design to further an organization's brand."

println("""Hello!
My name is $name.
I am $age years old.
And I was born in $birthPlace.
$careerAspirations""")