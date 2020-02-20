package com.armanco.formula.view.main;

import com.armanco.formula.data.models.Section;
import com.armanco.formula.data.repositories.Repository;
import com.armanco.formula.data.repositories.RepositoryImpl;
import com.armanco.formula.view.base.BasePresenter;

import java.util.List;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {
    private Repository repository = new RepositoryImpl();
    private List<Section> sections;

    @Override
    public void onViewCreated() {
        sections = repository.getAllSections();
        view.showPager(sections);
    }
}
