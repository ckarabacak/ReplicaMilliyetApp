package live.codemy.replicamilliyetapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import live.codemy.replicamilliyetapp.R
import live.codemy.replicamilliyetapp.mock.MockList
import live.codemy.replicamilliyetapp.ui.adapter.WriterListAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycWriterList.adapter = WriterListAdapter(MockList.getMockedWriterList())
        recycWriterList.layoutManager = LinearLayoutManager(this)
    }
}
