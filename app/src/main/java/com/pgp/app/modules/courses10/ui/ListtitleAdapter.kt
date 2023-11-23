package com.pgp.app.modules.courses10.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pgp.app.R
import com.pgp.app.appcomponents.database.GolfClub
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.databinding.RowListtitleBinding
import com.pgp.app.modules.courses10.`data`.model.ListtitleRowModel
import com.pgp.app.modules.courses10.data.viewmodel.Courses10VM
import kotlin.Int
import kotlin.collections.List

class ListtitleAdapter(
  private val viewModel: Courses10VM,
  var golfClubs: List<GolfClub>
) : RecyclerView.Adapter<ListtitleAdapter.RowListtitleVH>() {
  val randomImageResId = getRandomImageResourceId()
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtitleVH {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.row_listtitle, parent, false)
    return RowListtitleVH(view)
  }

  override fun onBindViewHolder(holder: RowListtitleVH, position: Int) {
    val golfClub = golfClubs[position]
    val listtitleRowModel = ListtitleRowModel(
      txtTitle = golfClub.name,
      txtSelangor = golfClub.location,
      imageResId = getRandomImageResourceId()
    )

    holder.binding.listtitleRowModel = listtitleRowModel
  }

  override fun getItemCount(): Int = golfClubs.size

  public fun updateData(newData: List<GolfClub>) {
    golfClubs = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: GolfClub
    )
  }

  private fun getRandomImageResourceId(): Int {
    val imageResources = intArrayOf(
      R.drawable.img_image,
      R.drawable.img_image_1,
      R.drawable.img_image_2,
      R.drawable.img_image_3,
      R.drawable.img_image_4,
      R.drawable.img_image_5
    )
    return imageResources.random()
  }

  inner class RowListtitleVH(view: View) : RecyclerView.ViewHolder(view) {
    val binding: RowListtitleBinding = RowListtitleBinding.bind(itemView)

    init {
      binding.linearColumnline.setOnClickListener {
        val position = adapterPosition
        if (position != RecyclerView.NO_POSITION) {
          val golfClub = golfClubs[position]

          // Save txtSelangor and txtClub here
          val txtSelangor = golfClub.location
          val txtClub = golfClub.name

          // Save data using AppPreferencesHelper
          AppPreferencesHelper.saveGolfClubData(itemView.context, txtClub, txtSelangor, "", "")

          val destIntent = Courses11Activity.getIntent(itemView.context, null)
          itemView.context.startActivity(destIntent)
        }
      }
    }
  }
}