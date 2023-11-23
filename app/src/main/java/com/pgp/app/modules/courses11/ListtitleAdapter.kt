package com.pgp.app.modules.courses11.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pgp.app.R
import com.pgp.app.databinding.RowListtitle2Binding
import com.pgp.app.modules.courses11.`data`.model.Listtitle2RowModel
import kotlin.Int
import kotlin.collections.List

class ListtitleAdapter(
  var list: List<Listtitle2RowModel>
) : RecyclerView.Adapter<ListtitleAdapter.RowListtitle2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtitle2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtitle2,parent,false)
    return RowListtitle2VH(view)
  }

  override fun onBindViewHolder(holder: RowListtitle2VH, position: Int) {
    val listtitle2RowModel = Listtitle2RowModel()
    // TODO uncomment following line after integration with data source
    // val listtitle2RowModel = list[position]
    holder.binding.listtitle2RowModel = listtitle2RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listtitle2RowModel>) {
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
      item: Listtitle2RowModel
    ) {
    }
  }

  inner class RowListtitle2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtitle2Binding = RowListtitle2Binding.bind(itemView)
    init {
      binding.linearColumntitle.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listtitle2RowModel())
      }
    }
  }
}
