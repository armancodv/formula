package com.armanco.formula.view.sub_section;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Formula;
import com.armanco.formula.view.base.BaseFragment;

import java.util.List;

public class SubSectionFragment extends BaseFragment implements SubSectionContract.View {

    private SubSectionPresenter presenter = new SubSectionPresenter();
    private RecyclerView recycler;
    private FormulaAdapter adapter;
    private LinearLayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sub_section, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycler = view.findViewById(R.id.formula_recycler);

        presenter.onAttach(this);
        presenter.onViewCreated();

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            int subSectionPosition = bundle.getInt("subSectionPosition");
            int sectionPosition = bundle.getInt("sectionPosition");
            presenter.setPosition(sectionPosition, subSectionPosition);
        }

    }

    @Override
    public void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void showRecycler(List<Formula> formulas) {
        if(formulas!=null) {
            adapter = new FormulaAdapter(formulas, activity, R.layout.item_formula);
            recycler.setAdapter(adapter);
            layoutManager = new LinearLayoutManager(activity);
            recycler.setLayoutManager(layoutManager);
        }
    }
}
