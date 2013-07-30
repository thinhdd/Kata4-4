import java.util.List;
import java.util.ArrayList;
public class LinkList
{
    List<Model> list = new ArrayList<Model>();

    public LinkList(ArrayList<Model> list)
    {
        this.list = list;
    }

    public LinkList()
    {
    }

    public int size()
    {
        return list.size();
    }
    public Model getNode(int n)
    {
        return list.get(n);
    }

    public void first(Model model)
    {
        list.add(0,model);
    }

    public void last(Model model)
    {
        list.add(list.size(), model);
    }

    public Model before(int index)
    {
        return list.get(index-1);
    }

    public Model after(int index)
    {
        return list.get(index+1);
    }

    public int find(Model model)
    {
        return list.indexOf(model);
    }
}
