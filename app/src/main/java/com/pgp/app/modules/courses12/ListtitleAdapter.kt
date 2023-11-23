package com.pgp.app.modules.courses12.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pgp.app.R
import com.pgp.app.databinding.RowListtitle1Binding
import com.pgp.app.modules.courses12.`data`.model.Listtitle1RowModel
import kotlin.Int
import kotlin.collections.List

class ListtitleAdapter(
  var list: List<Listtitle1RowModel>
) : RecyclerView.Adapter<ListtitleAdapter.RowListtitle1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtitle1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtitle1,parent,false)
    return RowListtitle1VH(view)
  }

  override fun onBindViewHolder(holder: RowListtitle1VH, position: Int) {
    val listtitle1RowModel = Listtitle1RowModel()
    // TODO uncomment following line after integration with data source
    // val listtitle1RowModel = list[position]
    holder.binding.listtitle1RowModel = listtitle1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listtitle1RowModel>) {
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
      item: Listtitle1RowModel
    ) {
    }
  }

  inner class RowListtitle1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtitle1Binding = RowListtitle1Binding.bind(itemView)
    init {
      binding.linearColumntitle.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listtitle1RowModel())
      }
    }
  }
}
