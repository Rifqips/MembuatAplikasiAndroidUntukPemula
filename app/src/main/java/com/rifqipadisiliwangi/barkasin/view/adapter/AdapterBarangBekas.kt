package com.rifqipadisiliwangi.barkasin.view.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rifqipadisiliwangi.barkasin.databinding.ItemListBinding
import com.rifqipadisiliwangi.barkasin.model.BarangBekas
import com.rifqipadisiliwangi.barkasin.view.detail.DetilActivity

class AdapterBarangBekas(private var barkas : ArrayList<BarangBekas>): RecyclerView.Adapter<AdapterBarangBekas.ListViewHolder>() {

    class ListViewHolder (val binding : ItemListBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        var view = ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.binding.ivBarangBekas.setImageResource(barkas[position].pict)
        holder.binding.tvTitle.text = barkas[position].title
        holder.binding.tvSubTitle.text = barkas[position].subTitle
        holder.binding.tvDate.text = barkas[position].date

        holder.binding.content.setOnClickListener {
            val intent = Intent(it.context, DetilActivity::class.java)
            intent.putExtra("gambar", barkas[position].pict)
            intent.putExtra("title", barkas[position].title)
            intent.putExtra("date", barkas[position].date)
            intent.putExtra("subtitle", barkas[position].subTitle)
            it.context.startActivity(intent)

        }
    }

    fun setDataBarkas(BarkasList : ArrayList<BarangBekas>){
        this.barkas = BarkasList
    }

    override fun getItemCount(): Int {
        return barkas.size
    }

}