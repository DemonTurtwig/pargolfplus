package com.pgp.app.modules.courses10.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pgp.app.R
import com.pgp.app.databinding.RowListtitleBinding
import com.pgp.app.modules.courses10.`data`.model.ListtitleRowModel
import kotlin.Int
import kotlin.collections.List

class ListtitleAdapter(
  var list: List<ListtitleRowModel>
) : RecyclerView.Adapter<ListtitleAdapter.RowListtitleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtitleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtitle,parent,false)
    return RowListtitleVH(view)
  }

  override fun onBindViewHolder(holder: RowListtitleVH, position: Int) {
    val listtitleRowModel = ListtitleRowModel()
    // TODO uncomment following line after integration with data source
    // val listtitleRowModel = list[position]
    holder.binding.listtitleRowModel = listtitleRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtitleRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListtitleRowModel
    ) {
    }
  }

  inner class RowListtitleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtitleBinding = RowListtitleBinding.bind(itemView)
    init {
      binding.linearColumnline.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListtitleRowModel())
      }
    }
  }
}
