package id.uchidd.aplikasilistwisatadetail.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import id.uchidd.aplikasilistwisatadetail.R;

public class AdapterListWisata extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] namaTempatWisata;
    private final String[] lokasiTempatWisata;
    private final Integer[] deskrepsiTempatWisata;
    private final Integer[] gambarTempatWisata;


    public AdapterListWisata(Activity context,
                             String[] namaTempatWisata,
                             String[] lokasiTempatWisata,
                             Integer[] deskrepsiTempatWisata,
                             Integer[] gambarTempatWisata) {
        super(context, R.layout.item_wisata, namaTempatWisata);

        this.context = context;
        this.namaTempatWisata = namaTempatWisata;
        this.lokasiTempatWisata = lokasiTempatWisata;
        this.deskrepsiTempatWisata = deskrepsiTempatWisata;
        this.gambarTempatWisata = gambarTempatWisata;

    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_wisata, null, true);

        TextView txtNamaWisata, txtLokasiWisata, txtDeskripsiWisata;
        ImageView imgTempatWisata;

        txtNamaWisata = (TextView)rowView.findViewById(R.id.namaWisata);
        txtLokasiWisata = (TextView)rowView.findViewById(R.id.lokasiWisata);
        txtDeskripsiWisata = (TextView)rowView.findViewById(R.id.deskripsiWisata);
        imgTempatWisata = (ImageView) rowView.findViewById(R.id.gambarWisata);

        txtNamaWisata.setText(namaTempatWisata[position]);
        txtLokasiWisata.setText(lokasiTempatWisata[position]);
        txtDeskripsiWisata.setText(deskrepsiTempatWisata[position]);
        Picasso.get().load(gambarTempatWisata[position]).into(imgTempatWisata);
        return rowView;
    }
}
