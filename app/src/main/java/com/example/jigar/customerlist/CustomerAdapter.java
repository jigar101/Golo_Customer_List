package com.example.jigar.customerlist;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerAdapter extends  RecyclerView.Adapter<CustomerAdapter.ViewHolder> {

    private ArrayList<Customer> Customer;


    public CustomerAdapter(ArrayList<Customer> Customer) {
        this.Customer = Customer;
    }

    @Override
    public CustomerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list, viewGroup, false);
        return new CustomerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomerAdapter.ViewHolder viewHolder, int i) {


        viewHolder.name .setText(Customer.get(i).getName().toString());
        viewHolder.phone.setText(Customer.get(i).getPhoneNumber());

    }

    @Override
    public int getItemCount() {
        return Customer.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, phone;


        public ViewHolder(View view) {
            super(view);


            name = (TextView) view.findViewById(R.id.tvName);
            phone = (TextView) view.findViewById(R.id.tvPhone);


        }

    }

}