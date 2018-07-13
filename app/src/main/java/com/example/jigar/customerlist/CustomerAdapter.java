package com.example.jigar.customerlist;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

// Provide a reference to the views for each data item Complex data may require more than one view per item, and
// provide access to all the views for a data item in a view holder

public class CustomerAdapter extends  RecyclerView.Adapter<CustomerAdapter.ViewHolder> {

    private ArrayList<Customer> Customer;


    // Provide a constructor
    public CustomerAdapter(ArrayList<Customer> Customer) {
        this.Customer = Customer;
    }

    // Create new views which are invoked by the layout manager
    @Override
    public CustomerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list, viewGroup, false);
        return new CustomerAdapter.ViewHolder(view);
    }

    // Replace the contents of a view
    @Override
    public void onBindViewHolder(CustomerAdapter.ViewHolder viewHolder, int i) {


        viewHolder.name .setText(Customer.get(i).getName().toString());
        viewHolder.phone.setText(Customer.get(i).getPhoneNumber());

    }
    // Return the size of your dataset
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