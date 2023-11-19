package com.pgp.app.modules.statistics.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pgp.app.R
import com.pgp.app.databinding.RowStatisticsBinding
import com.pgp.app.modules.statistics.`data`.model.StatisticsRowModel
import kotlin.Int
import kotlin.collections.List

class StatisticsAdapter(
  var list: List<StatisticsRowModel>
) : RecyclerView.Adapter<StatisticsAdapter.RowStatisticsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStatisticsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_statistics,parent,false)
    return RowStatisticsVH(view)
  }

  override fun onBindViewHolder(holder: RowStatisticsVH, position: Int) {
    val statisticsRowModel = StatisticsRowModel()
    // TODO uncomment following line after integration with data source
    // val statisticsRowModel = list[position]
    holder.binding.statisticsRowModel = statisticsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<StatisticsRowModel>) {
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
      item: StatisticsRowModel
    ) {
    }
  }

  inner class RowStatisticsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStatisticsBinding = RowStatisticsBinding.bind(itemView)
    init {
      binding.linearColumnthirty.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, StatisticsRowModel())
      }
    }
  }
}
