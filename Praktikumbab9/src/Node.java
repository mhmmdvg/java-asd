import java.util.Random;
import java.util.Scanner;
public class Node {
    int data;
    Node nodeKiri;
    Node nodeKanan;

    public Node(int dt){
        data = dt;
        nodeKiri = nodeKanan = null;
    }
    public void sisipDt(int dtSisip ){
        if (dtSisip < data){
            if(nodeKiri == null)
                nodeKiri = new Node( dtSisip );
            else nodeKiri.sisipDt( dtSisip );
        }
        else if(dtSisip > data){
            if ( nodeKanan == null )
                nodeKanan = new Node(dtSisip);
            else nodeKanan.sisipDt(dtSisip);
        }
    }
}

