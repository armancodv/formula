package com.armanco.formula.view.section;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.base.BaseActivity;
import com.ramotion.cardslider.CardSliderLayoutManager;
import com.ramotion.cardslider.CardSnapHelper;

import java.util.List;

public class SectionActivity extends BaseActivity implements SectionContract.View {

    private SectionPresenter presenter = new SectionPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        presenter.onAttach(this);
        presenter.onViewCreated();
    }


    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

}
