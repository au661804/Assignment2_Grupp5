import android.app.AppComponentFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment2_grupp5.R
import com.google.firebase.auth.FirebaseAuth


class login_activity : AppCompatActivity(){
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginscreen)

        // Initialize Firebase Authentication instance
        auth = FirebaseAuth.getInstance()

        // Other code goes here
    }

    // Other methods go here
}