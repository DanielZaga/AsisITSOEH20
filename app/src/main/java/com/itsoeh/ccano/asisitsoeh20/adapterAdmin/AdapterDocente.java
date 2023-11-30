package com.itsoeh.ccano.asisitsoeh20.adapterAdmin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.itsoeh.ccano.asisitsoeh20.R;
import com.itsoeh.ccano.asisitsoeh20.modelo.MUsuario;

import java.util.ArrayList;

    public class AdapterDocente extends RecyclerView.Adapter<AdapterDocente.ViewHolderDocente> {

        private ArrayList<MUsuario> users;

        public AdapterDocente(ArrayList<MUsuario> users) {
            this.users = new ArrayList<>();
        }

        public void setData(ArrayList<MUsuario> users) {
            this.users = users;
            notifyDataSetChanged();
        }

        @Override
        public ViewHolderDocente onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profesor, parent, false);
            return new ViewHolderDocente(view);

        }

        @Override
        public void onBindViewHolder(ViewHolderDocente holder, int position) {
            MUsuario user = users.get(position);
            holder.nameTextView.setText(user.getNombre());
            holder.emailTextView.setText(user.getEmail());
        }

        @Override
        public int getItemCount() {
            return users.size();
        }

        public class ViewHolderDocente extends RecyclerView.ViewHolder {

            public TextView nameTextView;
            public TextView emailTextView;

            public ViewHolderDocente(View itemView) {
                super(itemView);

                nameTextView = itemView.findViewById(R.id.itemDoc_txt_nombre);
                emailTextView = itemView.findViewById(R.id.itemDoc_txt_grado);
            }
        }


    }

