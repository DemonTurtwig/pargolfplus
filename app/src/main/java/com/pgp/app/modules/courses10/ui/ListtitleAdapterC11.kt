package com.pgp.app.modules.courses10.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pgp.app.R
import com.pgp.app.appcomponents.database.GolfCourse
import com.pgp.app.appcomponents.utility.AppPreferencesHelper
import com.pgp.app.databinding.RowListtitle2Binding
import com.pgp.app.modules.courses10.data.model.ListtitleRowModel2
import com.pgp.app.modules.courses10.data.viewmodel.Courses11VM

class ListtitleAdapterC11(
    private val viewModel: Courses11VM,
    private var golfCourses: List<GolfCourse>
) : RecyclerView.Adapter<ListtitleAdapterC11.RowListtitleVH>() {
    private var clickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtitleVH {
        val binding = RowListtitle2Binding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RowListtitleVH(binding)
    }

    override fun onBindViewHolder(holder: RowListtitleVH, position: Int) {
        val golfCourse = golfCourses[position]
        val listtitleRowModel2 = ListtitleRowModel2(
            txtTitle2 = golfCourse.courseName,
            imageResId2 = getRandomImageResourceId()

        )

        // Bind the data to the binding object
        holder.bind(listtitleRowModel2)
        holder.SetonClickListener()
        // Set click listener
        holder.itemView.setOnClickListener {
            clickListener?.onItemClick(it, position, golfCourse)
        }
    }

    override fun getItemCount(): Int = golfCourses.size

    fun updateData(newData: List<GolfCourse>) {
        // Remove duplicates
        golfCourses = newData.distinctBy { it.courseName }
        notifyDataSetChanged()
    }

    fun setOnItemClickListener(clickListener: OnItemClickListener) {
        this.clickListener = clickListener
    }

    interface OnItemClickListener {
        fun onItemClick(
            view: View,
            position: Int,
            item: GolfCourse
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

    inner class RowListtitleVH(private val binding: RowListtitle2Binding) :
        RecyclerView.ViewHolder(binding.root) {

        init {

        }
        fun SetonClickListener(){
            binding.linearColumnline.setOnClickListener {
                Log.d("ListtitleAdapterC11", "ViewHolder initialized at position $adapterPosition")
                val position = adapterPosition
                val golfCourse = golfCourses[position]
                val txtTitle2 = golfCourse.courseName

                if (position != RecyclerView.NO_POSITION) {
                    Log.d("ListtitleAdapterC11", "Item clicked at position $position, title: $txtTitle2")





                    AppPreferencesHelper.saveGolfCourseData(itemView.context, txtTitle2)

                    // Start Courses12Activity
                    val destIntent = Courses12Activity.getIntent(itemView.context, null)
                    itemView.context.startActivity(destIntent)
                }
            }
        }

        fun bind(item: ListtitleRowModel2) {
            binding.listtitleRowModel2 = item
            binding.executePendingBindings()
        }
    }
}