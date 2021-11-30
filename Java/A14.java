import java.util.*;
import java.util.stream.Collectors;

public class A14
{
    private static String getString()
    {
        String str;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter a string: ");
        str = sc.next();
        
        sc.close();
        return str;
    }
    public static void main(String[] args) 
    {
        Repeating object1 = new Repeating();

        String str = getString().trim();
        
        object1.findSequence(str);
        return;
    }
}

class Node
{
    char c;
    Node[] children;

    Node(char c)
    {
        this.c = c;
        children = new Node[26];
    }
}

class Trie
{
    Node object = new Node('\0');

    private Node root;

    Trie()
    {
        root = new Node('\0');
    }

    public void insert(char c, Node node)
    {
        Node current = node;
        
        if(current.children[c - 'a'] == null)
            current.children[c - 'a'] = new Node(c);
    }

    public Node search(String str)
    {
        Node current = root;
        char c = '\0';

        for(int i = 0; i < str.length(); i++)
        {
            c = str.charAt(i);

            if(current.children[c - 'a'] == null)
                return current;
            else
                current = current.children[c - 'a'];
        }

        return null;
    }
}

class Repeating
{
    private List<String> getSequence(String string)
    {
        string+=" ";

        Node object = new Node('\0');
        Trie object1 = new Trie();
        List<String> sequence = new ArrayList<String>();

        String str = "";
        Node node = null;

        int n = (string.length() / 2);

        for(int k = 1; k <= n; k++)
        {
            for(int i = 0; i < string.length()-1; i++)
            {
                if(i+k <= string.length())
                    str = string.substring(i, i+k).trim();

                if(str.length() == k)
                {
                    node = object1.search(str);

                    if(node != null)
                        object1.insert(str.charAt(str.length()-1), node);
                    else
                        sequence.add(str);
                }
            }
        }
        sequence = sequence.stream().distinct().collect(Collectors.toList());

        return sequence;
    }
    void findSequence(String string)
    {
        List<String> sequence = new ArrayList<String>();
       
        sequence = getSequence(string);

        if(sequence.isEmpty() == true)
        {
            System.out.println("\nNo such sequence found\n");
            return;
        }

        ListIterator<String> iterator = sequence.listIterator();

        int maxLength = sequence.get(0).length();

        while(iterator.hasNext())
        {
            String str = iterator.next();
            if(str.length() > maxLength)
                maxLength = str.length();
        }

        iterator = sequence.listIterator();

        System.out.println();
        while(iterator.hasNext())
        {
            String str = iterator.next();

            if(str.length() == maxLength)
                System.out.println(str);
        }
        System.out.println();

        return;

    }
}