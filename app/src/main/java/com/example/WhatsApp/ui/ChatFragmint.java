package com.example.WhatsApp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.WhatsApp.data.model.UserModel;
import com.example.WhatsApp.ui.adapter.ChatAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;


public class ChatFragmint extends Fragment {

    RecyclerView chatrecycler;
    ArrayList<UserModel>users = new ArrayList<>();
    ChatAdapter chatAdapter;
    public ChatFragmint() {}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat_fragmint, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRecycler(view);
    }


    private void setupRecycler(View view) {

        users.add(new UserModel(R.drawable.ic_baseline_perm_identity_24,"Mahmoud"));
        users.add(new UserModel(R.drawable.ic_baseline_perm_identity_24,"Magdy"));
        users.add(new UserModel(R.drawable.ic_baseline_perm_identity_24,"Mohamed"));
        users.add(new UserModel(R.drawable.ic_baseline_perm_identity_24,"yosef"));


        chatrecycler=view.findViewById(R.id.chat_reacycelar);
        chatAdapter = new ChatAdapter(users);
        chatrecycler.setAdapter(chatAdapter);
        chatrecycler.setLayoutManager(new LinearLayoutManager(requireContext()));
    }


}