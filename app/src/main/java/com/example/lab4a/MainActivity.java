package com.example.lab4a;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ChipGroup chipGroup;
    private Chip chipSamsung, chipApple, chipOppo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        chipGroup = findViewById(R.id.chipGroup);
        chipSamsung = findViewById(R.id.chipSamsung);
        chipApple = findViewById(R.id.chipApple);

        chipOppo=findViewById(R.id.chipOppo);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);


        List<Mobile> mobiles = new ArrayList<>();
        ProductsAdapter adapter = new ProductsAdapter(mobiles);
        recyclerView.setAdapter(adapter);

        chipGroup.setOnCheckedChangeListener((group, checkedId) -> {
            mobiles.clear();
            if (checkedId == R.id.chipSamsung) {
                mobiles.add(new Mobile("Samsung Galaxy S23", "Latest Samsung flagship with Snapdragon 8 Gen 2", R.drawable.mobile, R.drawable.baseline_add_box_24));
                mobiles.add(new Mobile("Samsung Galaxy A54", "Mid-range Samsung phone with Exynos 1380", R.drawable.mobile, R.drawable.baseline_add_box_24));
                mobiles.add(new Mobile("Samsung Galaxy Z Flip 5", "Foldable Samsung phone with a compact design", R.drawable.mobile, R.drawable.baseline_add_box_24));
                showToast("Samsung Selected");
            } else if (checkedId == R.id.chipApple) {
                mobiles.add(new Mobile("iPhone 15 Pro", "Apple's newest iPhone with A17 Bionic chip", R.drawable.iphone, R.drawable.baseline_add_box_24));
                mobiles.add(new Mobile("iPhone 14", "Last year’s model with great performance and camera", R.drawable.iphone, R.drawable.baseline_add_box_24));
                mobiles.add(new Mobile("iPhone SE (2022)", "Compact iPhone with A15 Bionic chip", R.drawable.iphone, R.drawable.baseline_add_box_24));
                showToast("Apple Selected");
            } else if (checkedId == R.id.chipOppo) {
                mobiles.add(new Mobile("Oppo Find X6 Pro", "Oppo flagship with top-tier camera performance", R.drawable.oppo, R.drawable.baseline_add_box_24));
                mobiles.add(new Mobile("Oppo Reno 10", "Mid-range Oppo phone with a sleek design", R.drawable.oppo, R.drawable.baseline_add_box_24));
                mobiles.add(new Mobile("Oppo A78", "Budget-friendly Oppo phone with solid battery life", R.drawable.oppo, R.drawable.baseline_add_box_24));
                showToast("Oppo Selected");
            }
            adapter.notifyDataSetChanged();
            //recyclerView.setVisibility(View.VISIBLE);

        });
        // Adding only Samsung, iPhone, and Oppo devices


    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}