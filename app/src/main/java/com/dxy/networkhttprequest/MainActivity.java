package com.dxy.networkhttprequest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;

import com.dxy.networkhttprequest.adapter.RecycleViewAdapter;
import com.dxy.networkhttprequest.bean.GankMeiziEntity;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.bt_http_get_button)
    Button btHttpGetButton;
    @InjectView(R.id.rv_recycler_view)
    RecyclerView mRecyclerView;
    String urlImage = "";
    private Context mContext;
    private  RecycleViewAdapter mRecycleviewAdapter;

    private ArrayList<GankMeiziEntity.ResultsBean> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        initData();
        mContext=this;


    }

    private void initData() {
        getDataFromService();
        btHttpGetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

                mRecycleviewAdapter = new RecycleViewAdapter(mContext, arrayList);
                mRecyclerView.setAdapter(mRecycleviewAdapter);

            }
        });
    }

    private void getDataFromService() {
        /**
         * http://gank.io/api/random/data/分类/个数
         *福利
         */

        String url = "http://gank.io/api/random/data/福利/60";
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new GankMeiziCallBack() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(GankMeiziEntity response, int id) {

                        arrayList=response.getResults();


                    }
                });


    }

    public abstract class GankMeiziCallBack extends Callback<GankMeiziEntity> {
        @Override
        public GankMeiziEntity parseNetworkResponse(Response response, int id) throws Exception {

            String string = response.body().string();

            GankMeiziEntity gankMeiziEntity = new Gson().fromJson(string, GankMeiziEntity.class);

            return gankMeiziEntity;
        }
    }
}
