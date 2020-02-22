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

class WriterListAdapter(val writerList: List<WriterModel>) :
    RecyclerView.Adapter<WriterListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WriterListViewHolder {
        return WriterListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return writerList.size
    }

    override fun onBindViewHolder(holder: WriterListViewHolder, position: Int) {
        holder.bind(writerList[position])
        Log.e("Adapter", "$position")
    }
}