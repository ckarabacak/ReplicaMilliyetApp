package live.codemy.replicamilliyetapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import live.codemy.replicamilliyetapp.R
import live.codemy.replicamilliyetapp.mock.MockList
import live.codemy.replicamilliyetapp.ui.adapter.WriterListAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycWriterList.adapter =
            WriterListAdapter(MockList.getMockedWriterList()) { writerModel, position ->
                when (position) {
                    0 -> {
                        val intent = Intent(this, WriterDetailActivity::class.java)
                        intent.putExtra("keyWriter", writerModel)
                        startActivity(intent)
                    }
                    else -> {
                        val intent = Intent(this, WriterDetailActivity::class.java)
                        intent.putExtra("keyWriter", writerModel)
                        startActivity(intent)
                    }
                }
            }
    }
}
