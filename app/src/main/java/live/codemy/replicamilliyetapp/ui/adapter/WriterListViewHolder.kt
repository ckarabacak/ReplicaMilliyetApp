package live.codemy.replicamilliyetapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_item_writer_list.view.*
import live.codemy.replicamilliyetapp.R
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

class WriterListViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.adapter_item_writer_list,
            parent,
            false
        )
    ) {

    fun bind(
        writerModel: WriterModel,
        position: Int,
        setOnClickListener: (writerModel: WriterModel, position: Int) -> Unit
    ) {
        itemView.txtWriteTitle.text = writerModel.writeTitle
        itemView.txtWriterEmail.text = writerModel.writerEmail
        itemView.txtWriterName.text = writerModel.writerName
//      itemView.imgProfilePhoto.background = writerList[position].writeTitle

        itemView.setOnClickListener {
            setOnClickListener(writerModel, position)
        }
    }
}