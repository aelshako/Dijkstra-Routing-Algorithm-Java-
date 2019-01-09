public class Edge {
    Node n1;
    Node n2;
    int cost;


    public Edge(Node n1, Node n2, int cost){
        this.n1 = n1;
        this.n2 = n2;
        this.cost = cost;

        //adding n1 as neighbor to n2 and n2 as neighbor to n1
        if(!n1.neighbors.contains(n2)){
            n1.add_neighbor(n2);
        }
        if(!n2.neighbors.contains(n1)){
            n2.add_neighbor(n1);
        }


    }

    public int getDistance(){
        return cost;
    }
    public boolean is_proper_edge(String name1, String name2){ //returns whether this edge holds the two nodes passed in or not. This allows us to loop through all the edges to find proper costs
        boolean result = false;
        if((name1 == n1.getName() && name2 == n2.getName()) ||( name1 == n2.getName() && name2 == n1.getName())){
            result = true;
        }
        return result;
    }
}
