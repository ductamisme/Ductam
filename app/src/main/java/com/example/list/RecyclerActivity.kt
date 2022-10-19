package com.example.list

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.managerokr.R
import com.example.managerokr.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {

    private  val viewModel : MyViewModel by viewModels()

    private lateinit var binding: ActivityRecyclerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.recyclerviewActivitysecond

        recyclerView.adapter = MyAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)

        setContentView(R.layout.activity_recycler)
       /* val intent = intent
        val data_ : String? = intent.getStringExtra("data")  // lấy dữ liệu nhận được thông qua biên data để gán vào biến data_

        val textView = findViewById<TextView>(R.id.textview_itemview_title)
        textView.text = data_ //gán text của textView bằng data để hiển thị.*/
        val username = binding.textviewRecyclerTittle
        val business = binding.textviewRecyclerDetails
        val data = intent?.getStringExtra("data").toString()
        data.let {
            username.text = "${getString(R.string.enter_user_name)}"
            business.text = "${getString(R.string.enter_your_name_business)}"
        }
    }
}

