package ichgw.jp.ohayo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var date = Date();
        var calendar = GregorianCalendar()
        calendar.time = date
        var hour = calendar.get(Calendar.HOUR_OF_DAY)
        var greeting: String
        if (hour in 6..8){
            greeting = "おきてえぇ！"
        }else if (hour in 9..11){
            greeting = "おはよぉぉぉ"
        }else if (hour in 12..17){
            greeting = "こんちわぁ"
        }else if (hour in 18..22){
            greeting = "こんばんは"
        }else{
            greeting = "おやすみぃ"
        }
        textview.text = greeting
    }
}
