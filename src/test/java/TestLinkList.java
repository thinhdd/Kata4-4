import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 7/30/13
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestLinkList
{
    List<Model> list= new ArrayList<Model>();
    @Before
    public void setUp()
    {
        Model model = new Model("thinh");
        Model model1 = new Model("dai");
        list.add(model);
        list.add(model1);
    }
    @Test
    public void testEmptyLinkList()
    {
        LinkList linkList = new LinkList();
        assertTrue(linkList.size()==0);
    }
    @Test
    public void testAddFirst()
    {
        LinkList linkList = new LinkList((ArrayList<Model>) list);
        Model model = new Model("daoduc");
        linkList.first(model);
        assertEquals(model,linkList.getNode(0));
    }
    @Test
    public void testAddLast()
    {
        LinkList linkList = new LinkList((ArrayList<Model>) list);
        Model model = new Model("daoduc");
        linkList.last(model);
        assertEquals(model,linkList.getNode(2));
    }
    @Test
    public void testBefore()
    {
        LinkList linkList = new LinkList((ArrayList<Model>) list);
        Model model = new Model("daoducthinh");
        linkList.first(model);
        assertEquals(model,linkList.before(1));
    }
    @Test
    public void testAfter()
    {
        LinkList linkList = new LinkList((ArrayList<Model>) list);
        Model model = new Model("tranducthanh");
        linkList.last(model);
        assertEquals(model,linkList.after(1));
    }
    @Test
    public void testFind()
    {
        LinkList linkList = new LinkList((ArrayList<Model>) list);
        Model model = new Model("daoduc");
        linkList.first(model);
        linkList.last(model);
        assertEquals(0,linkList.find(model));
    }

}
