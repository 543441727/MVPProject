package com.qianmo.mvpproject.adapter;


import com.qianmo.mvpproject.model.bean.UserBean;

/**
 * Created by wangjitao on 2016/11/7 0007.
 */
//public class UserSimpleRecycleAdapter extends RecyclerView.Adapter<UserSimpleRecycleAdapter.ViewHolder> {
//    private Context context;
//    private LayoutInflater inflater;
//    private List<UserBean> datas;
//
//    public UserSimpleRecycleAdapter(Context context, List<UserBean> datas) {
//        this.context = context;
//        this.inflater = LayoutInflater.from(context);
//        this.datas = datas;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View itemView = inflater.inflate(R.layout.item_user, parent, false);
//        ViewHolder holder = new ViewHolder(itemView);
//        return holder;
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        holder.tv_name.setText(datas.get(position).getName());
//        holder.tv_age.setText(datas.get(position).getAge());
//    }
//
//    @Override
//    public int getItemCount() {
//        return datas == null ? 0 : datas.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        TextView tv_name;
//        TextView tv_age;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//
//            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
//            tv_age = (TextView) itemView.findViewById(R.id.tv_age);
//        }
//    }
//}
