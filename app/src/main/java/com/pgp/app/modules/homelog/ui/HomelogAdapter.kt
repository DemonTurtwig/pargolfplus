package com.pgp.app.modules.homelog.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pgp.app.R
import com.pgp.app.databinding.RowHomelogBinding
import com.pgp.app.modules.homelog.`data`.model.HomelogRowModel
import kotlin.Int
import kotlin.collections.List

class HomelogAdapter(
  var list: List<HomelogRowModel>
) : RecyclerView.Adapter<HomelogAdapter.RowHomelogVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomelogVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_homelog,parent,false)
    return RowHomelogVH(view)
  }

  override fun onBindViewHolder(holder: RowHomelogVH, position: Int) {
    val homelogRowModel = HomelogRowModel()
    // TODO uncomment following line after integration with data source
    // val homelogRowModel = list[position]
    holder.binding.homelogRowModel = homelogRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomelogRowModel>) {
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
      item: HomelogRowModel
    ) {
    }
  }

  inner class RowHomelogVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomelogBinding = RowHomelogBinding.bind(itemView)
    init {
      binding.imageImageTwo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HomelogRowModel())
      }
    }
  }
}
