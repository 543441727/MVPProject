package com.qianmo.mvpproject.adapter;


import com.qianmo.mvpproject.model.bean.UserBean;

/**
 * Created by Administrator on 2016/11/7 0007.
 */
//public class UserAdapter extends BaseRecyclerViewAdapter<UserBean> {
//
//
//    public UserAdapter(Context context, List<UserBean> datas, int layoutId) {
//        super(context, datas, layoutId);
//    }
//
//    @Override
//    protected void bindData(final BaseViewHolder holder, UserBean data, final int position) {
//        LinearLayout ll_all = holder.getView(R.id.ll_all);
//        TextView tv_name = holder.getView(R.id.tv_name);
//        TextView tv_age = holder.getView(R.id.tv_age);
//
//        tv_age.setText(data.getAge());
//        tv_name.setText(data.getName());
//
//        ll_all.setOnClickListener(view -> {
//            if (onItemClickListner != null) {
//                onItemClickListner.onItemClickListner(holder.getRootView(), position);
//            }
//        });
//    }
//}
