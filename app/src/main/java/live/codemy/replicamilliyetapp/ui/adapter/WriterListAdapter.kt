package live.codemy.replicamilliyetapp.ui.adapter

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import live.codemy.replicamilliyetapp.model.WriterModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     22/02/2020 - 19:48     ║
╚════════════════════════════╝
 */

class WriterListAdapter(
    private val writerList: List<WriterModel>,
    private val setOnClicListener: (writerModel: WriterModel, position: Int) -> Unit
) :
    RecyclerView.Adapter<WriterListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WriterListViewHolder =
        WriterListViewHolder(parent)

    override fun getItemCount(): Int = writerList.size

    override fun onBindViewHolder(holder: WriterListViewHolder, position: Int) {
        holder.bind(writerList[position], position, setOnClicListener)
        Log.e("WriterListAdapter", "$position")
    }
}