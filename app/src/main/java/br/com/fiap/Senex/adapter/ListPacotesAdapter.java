package br.com.fiap.senex.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.fiap.senex.R;
import br.com.fiap.senex.model.Pacote;

public class ListPacotesAdapter extends BaseAdapter {

    private final List<Pacote> pacotes;
    private Context context;

    public ListPacotesAdapter(List<Pacote> pacotes, Context context){

        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Pacote getItem(int position) {
        return pacotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewcriada = LayoutInflater.from(context).inflate(R.layout.item_pacote, parent, false);

        Pacote pacote = pacotes.get(position);

        TextView nome = viewcriada.findViewById(R.id.nome_resp_add2);
        nome.setText(pacote.getNome());
        TextView horario = viewcriada.findViewById(R.id.horario_med2);
        horario.setText(pacote.getHorario());
        TextView receita = viewcriada.findViewById(R.id.rusovas___ems3);
        receita.setText(pacote.getReceita());
        TextView quantidade = viewcriada.findViewById(R.id.comprimido_resp2);
        quantidade.setText(pacote.getQuantidade());
        TextView descricao = viewcriada.findViewById(R.id.motivo_med3);
        descricao.setText(pacote.getDescricao());

        return viewcriada;
    }
}
