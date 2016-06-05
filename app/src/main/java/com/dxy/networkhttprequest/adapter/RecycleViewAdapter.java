package com.dxy.networkhttprequest.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dxy.networkhttprequest.R;
import com.dxy.networkhttprequest.bean.GankMeiziEntity;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dangxueyi on 16/5/30.
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyBaseViewHolder> {

    private Context context;
    private ArrayList<GankMeiziEntity.ResultsBean>  arrayList;

    private List<Integer> mHeights;

    private OnItemClickListener mOnItemClickListener;
    public RecycleViewAdapter(Context context, ArrayList<GankMeiziEntity.ResultsBean> arrayList) {
        this.context = context;
        this.arrayList = arrayList;

        mHeights = new ArrayList<>();
        for(int i = 0 ; i<arrayList.size();i++){
            mHeights.add((int)(250+Math.random()*150));
        }
    }
    public interface OnItemClickListener{
        void onItemClick(View view, int position);
        void onItemLongClickListener(View view, int position);
    }

    public  void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.mOnItemClickListener= onItemClickListener;
    }
    @Override
    public MyBaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        MyBaseViewHolder myBaseViewHolder = new MyBaseViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recycler_view,parent,false));

        return myBaseViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyBaseViewHolder holder, final int position) {

       ViewGroup.LayoutParams lp = holder.textView.getLayoutParams();
        lp.height= mHeights.get(position);
        holder.textView.setLayoutParams(lp);
        holder.textView.setImageURI(Uri.parse(arrayList.get(position).getUrl()));

        if(mOnItemClickListener!=null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos  = holder.getLayoutPosition();
                    mOnItemClickListener.onItemClick(holder.itemView,pos);
                }
            });
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    int pos = holder.getLayoutPosition();
                    mOnItemClickListener.onItemLongClickListener(holder.itemView,pos);
                    return false;
                }
            });
        }
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyBaseViewHolder extends RecyclerView.ViewHolder {
        SimpleDraweeView textView;

        public MyBaseViewHolder(View view) {
            super(view);
            textView = (SimpleDraweeView) view.findViewById(R.id.sdv__content_simple_view);
        }

    }


}
