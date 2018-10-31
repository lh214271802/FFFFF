package com.lightheart.commonsdk.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lightheart.commonsdk.R;
import com.lightheart.commonsdk.R2;
import com.lightheart.commonsdk.app.Person;
import com.lightheart.commonsdk.app.Teacher;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import dagger.android.support.DaggerAppCompatActivity;

@Route(path = "/xixi/main1")
public class MainActivity extends DaggerAppCompatActivity {
    @Inject
    Person person;

    @Inject
    String jkName;
    @Inject
    Teacher teacher;

    @BindView(R2.id.show_some_thing)
    TextView showSomeThing;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test_main);
        unbinder = ButterKnife.bind(this);
        showSomeThing.setText(person.toString() + "---" + jkName + "---" + teacher.toString() + "\n" + this.getClass().getName());


    }

    @OnClick(R2.id.show_some_thing)
    public void clickSomeThing(View view) {
        teacher.age += 3;
        ARouter.getInstance().build("/xixi/new1").navigation();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }
}
