package Adaptadores;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.alexd.primerevaluacion.R;
import java.util.List;
import Estudiante.Estudiante;

public class AdaptadorEst extends BaseAdapter{
    private List<Estudiante>datasource;
    private Context cntx;
    private int idLayoutPlantilla;
    int i=0;

    public List<Estudiante> GetData(){ return this.datasource;}

    public AdaptadorEst(Context context, int IdPlantilla, List<Estudiante> sources){
        this.cntx=context;
        this.idLayoutPlantilla=IdPlantilla;
        this.datasource=sources;
    }

    public  int getCount(){ return this.datasource.size();}

    public Estudiante getItem(int position){return this.datasource.get(position);}

    public long getItemId(int position){return position;}

    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            LayoutInflater inflater= (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(this.idLayoutPlantilla,null);

            TextView lblNombre=convertView.findViewById(R.id.txtnom);
            TextView lblCodigo=convertView.findViewById(R.id.txtcod);
            TextView lblMateria=convertView.findViewById(R.id.txtmat);
            TextView lblPromedio=convertView.findViewById(R.id.txtnota);
            TextView lblid= convertView.findViewById(R.id.txtid);

            lblNombre.setText(this.datasource.get(position).GetNombre());
            lblCodigo.setText(this.datasource.get(position).GetCodigo());
            lblMateria.setText(this.datasource.get(position).GetMateria());
            lblPromedio.setText(this.datasource.get(position).GetPromedio().toString());
            lblid.setText(Integer.toString(i=i+1));

        }
        return convertView;
    }
}
