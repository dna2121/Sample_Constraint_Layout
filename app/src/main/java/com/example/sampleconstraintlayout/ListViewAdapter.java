package com.example.sampleconstraintlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    //deklarasi variable dengan jenis data context
    Context mContext;

    //deklarasi variable dengan jenis data layour inflater
    LayoutInflater inflater;

    //deklarasi variable dengan denis data arrayList
    private ArrayList<ClassNama> arrayList;

    public ListViewAdapter(Context context) {
        //memberi nilai mContext dengan context
        mContext = context;

        //mengatur layoutinflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        //memberikan nilai arrayList dari class ClassNama
        this.arrayList = new ArrayList<ClassNama>();

        //menambahkan semua elemen ke arraylist
        this.arrayList.addAll(Home_Activity.classNamaArrayList);
    }

    //buat class untuk deklarasi tempat untuk meletakkan isi ke dalam listview
    public class ViewHolder{
        //deklarasi variable dengan jenis TextView
        TextView name;
    }

    @Override
    public int getCount() {
        //return nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }

    //fungsi ini digunakan untuk mendapatkan data item yang terkait dengan posisi
    //tertentu dalam kumpulan data untuk mendapatkan data yang sesuai dari lokasi
    //tertentu dalam pengumpulan data item
    @Override
    public Object getItem(int i) {
        //mengembalikan nilai berupa objek dari array data
        return Home_Activity.classNamaArrayList.get(i);
    }

    //fungsi mengembalikan "nilai" dari posisi item ke adaptor.
    @Override
    public long getItemId(int i) {
        return i;
    }

    //fungsi ini secara otomatis dipanggil ketika tampilan item list siap untuk
    //ditampilkan atau akan ditampilkan
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //deklarasi variable dengan jenis data viewHolder
        final ViewHolder holder;

        //membuat kondisi apakah view null atau tidak
        if (view == null){

            //membuat objek view holder
            holder = new ViewHolder();

            //mengatur layout untuk menampilkan item
            view = inflater.inflate(R.layout.item_listview, null);

            //set id untuk textview
            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            //menyimpan data dalam tampilan tanpa menggunakan struktur data lain
            view.setTag(holder);
        } else {
            //mengatur holder untuk mengembalikan nilai dari view tag
            holder = (ViewHolder) view.getTag();
        }

        //set item ke textviews
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getName());

        //mengembalikan nilai ke var view
        return view;
    }



}
