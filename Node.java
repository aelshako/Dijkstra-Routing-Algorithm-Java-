import java.util.ArrayList;

public class Node {
    public String name;
    int cost_from_start;
    boolean is_start = false;
    boolean is_end = false;
    boolean visited = false;  //unvisited by false
    Node prev;
    public ArrayList<Node> neighbors; //we add to this upon the creation of an edge

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost_from_start() {
        return cost_from_start;
    }

    public void setCost_from_start(int cost_from_start) {
        this.cost_from_start = cost_from_start;
    }

    public boolean isIs_start() {
        return is_start;
    }

    public void setIs_start(boolean is_start) {
        this.is_start = is_start;
    }

    public boolean isIs_end() {
        return is_end;
    }

    public void setIs_end(boolean is_end) {
        this.is_end = is_end;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public void add_neighbor(Node node_to_add){  //allows for addition of a neighbor to the node
        this.neighbors.add(node_to_add);
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node(String name, boolean is_start, boolean is_end){
        this.name = name;
        this.is_start = is_start;
        this.is_end = is_end;
        this.neighbors = new ArrayList<>();
        if(this.isIs_start()){
            this.cost_from_start = 0;
        }else{
            this.cost_from_start = 1000;
        }
    }

}
