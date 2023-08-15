package ProjetoCinema.Compra;
import ProjetoCinema.*;
import java.util.ArrayList;

public class CompraItens {
    private ArrayList<Item> itens;

    public CompraItens(){
        this.itens = new ArrayList<>();
    }
    public void CompraItem(Item item){
        itens.add(item);
    }
    public void cancelarItem(Item item){
        itens.remove(item);
    }
    public CancelarTodosItens(){
        itens.clear();
    }
}
