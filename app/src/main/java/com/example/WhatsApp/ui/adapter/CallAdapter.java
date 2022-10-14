package com.example.WhatsApp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.WhatsApp.data.model.UserModel;
import com.example.myapplication.R;

import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<com.example.WhatsApp.ui.adapter.ChatAdapter.ChatHolder>{

        private List<UserModel> users;
        public CallAdapter(List<UserModel>users){

            this.users=users;
        }

        @NonNull
        @Override
        public com.example.WhatsApp.ui.adapter.ChatAdapter.ChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_chat_layout,parent,false);
            return new com.example.WhatsApp.ui.adapter.ChatAdapter.ChatHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull com.example.WhatsApp.ui.adapter.ChatAdapter.ChatHolder holder, int position) {
            UserModel userModel=users.get(position);
            holder.username.setText(userModel.getUsername());
            holder.userimage.setImageResource(UserModel.getUserimage());


        }

        @Override
        public int getItemCount() {
            if (users != null)
                return users.size();


            return 0;
        }


        static class ChatHolder extends RecyclerView.ViewHolder{
            ImageView userimage;
            TextView username;

            public ChatHolder(@NonNull View itemView) {
                super(itemView);
                userimage=itemView.findViewById(R.id.user_image);
                username=itemView.findViewById(R.id.user_name);
            }
        }

    }


