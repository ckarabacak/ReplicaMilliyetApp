package live.codemy.replicamilliyetapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     22/02/2020 - 20:40     ║
╚════════════════════════════╝
 */

@Parcelize
data class WriterModel(
    val profilePhotoLink: String,
    val writerName: String,
    val writerEmail: String,
    val writeTitle: String
) : Parcelable