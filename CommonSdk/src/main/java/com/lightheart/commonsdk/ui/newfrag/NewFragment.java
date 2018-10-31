package com.lightheart.commonsdk.ui.newfrag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lightheart.commonsdk.R;
import com.lightheart.commonsdk.R2;
import com.lightheart.commonsdk.app.Person;
import com.lightheart.commonsdk.app.Teacher;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerFragment;

/**
 * @author LiaoHui
 * @date 2018/8/9
 * @desc
 */
public class NewFragment extends DaggerFragment {
    @BindView(R2.id.show_some_thing)
    TextView showSomeThing;
    Unbinder unbinder;

    @Inject
    Person person;
    @Inject
    Teacher teacher;

    @Inject
    String jkName;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_test_main, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showSomeThing.setText(person.toString() + "---" + jkName + "---" + teacher.toString() + "\n" + this.getClass().getName());

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
