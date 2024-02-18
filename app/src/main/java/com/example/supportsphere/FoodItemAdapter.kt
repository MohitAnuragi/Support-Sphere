package com.example.supportsphere


    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView



    class FoodItemAdapter(private val foodItemsList: List<fooditem>) : RecyclerView.Adapter<FoodItemAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val itemName: TextView = view.findViewById(R.id.txtname)
            val itemPrice: TextView = view.findViewById(R.id.txtprice)
            val itemImage: ImageView = view.findViewById(R.id.imgcake1)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_food_item_layout, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val foodItem = foodItemsList[position]
            holder.itemName.text = foodItem.name
            holder.itemPrice.text = foodItem.price
            holder.itemImage.setImageResource(foodItem.imageResourceId)
        }

        override fun getItemCount(): Int {
            return foodItemsList.size
        }
    }