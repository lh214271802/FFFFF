package com.lightheart.commonsdk.ui.newact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lightheart.commonsdk.R;
import com.lightheart.commonsdk.R2;
import com.lightheart.commonsdk.app.Person;
import com.lightheart.commonsdk.app.Teacher;
import com.lightheart.commonsdk.ui.newfrag.NewFragment;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * @author LiaoHui
 * @date 2018/8/9
 * @desc
 */
@Route(path = "/xixi/new1")
public class NewActivity extends DaggerAppCompatActivity {

    @BindView(R2.id.show_some_thing)
    TextView showSomeThing;

    @Inject
    Person person;
    @Inject
    Teacher teacher;

    @Inject
    String jkName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);
        ButterKnife.bind(this);
        showSomeThing.setText(person.toString() + "---" + jkName + "---" + teacher.toString() + "\n" + this.getClass().getName());

    }

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, NewActivity.class));
    }


    @OnClick(R2.id.show_some_thing)
    public void clickSomeThing(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, new NewFragment());
        transaction.commitAllowingStateLoss();
    }

}
