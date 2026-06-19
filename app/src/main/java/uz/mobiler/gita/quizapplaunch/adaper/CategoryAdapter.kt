package uz.mobiler.gita.quizapplaunch.adaper

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import uz.mobiler.gita.quizapplaunch.R
import uz.mobiler.gita.quizapplaunch.models.CategoryData

class CategoryAdapter(
    private val list: List<CategoryData>,
    private val onItemClick: (CategoryData, position: Int) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.VH>() {

    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        val itemContainer: ConstraintLayout = view.findViewById(R.id.item_itself)
        val img: ImageView = view.findViewById(R.id.img)
        val title: TextView = view.findViewById(R.id.category_tv)
        val count: TextView = view.findViewById(R.id.questions_count_tv)
        fun bind() {
            val item = list[absoluteAdapterPosition]
            title.text = item.name
            count.text = item.questionCount.toString() + " question"
            img.setImageResource(item.img)

            itemContainer.setOnClickListener { onItemClick(item, position) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category, parent, false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
