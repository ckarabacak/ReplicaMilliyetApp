package live.codemy.replicamilliyetapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
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

class WriterListViewHolder(container: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(container.context).inflate(
            R.layout.adapter_item_writer_list,
            container,
            false
        )
    ) {

    val imgProfilePhoto: ImageView = itemView.findViewById(R.id.imgProfilePhoto)
    val txtWriterName: TextView = itemView.findViewById(R.id.txtWriterName)
    val txtWriterEmail: TextView = itemView.findViewById(R.id.txtWriterEmail)
    val txtWriteTitle: TextView = itemView.findViewById(R.id.txtWriteTitle)

    fun bind(writerModel: WriterModel) {

        txtWriterName.text = writerModel.writerName
        txtWriterEmail.text = writerModel.writerEmail
        txtWriteTitle.text = writerModel.writeTitle
    }
}