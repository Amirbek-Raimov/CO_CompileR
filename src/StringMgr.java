/*
    Compiler Construction
    For C0 syntax language
    Developer:Amirbek Raimov

 */

import java.util.ArrayList;

/**
 * Bounding each .ascii2 string with a identifier -> MIPS
 * */
public class StringMgr
{
    private ArrayList<String> collection;
    private int stringcount;

    public StringMgr()
    {
        this.stringcount = 0;
        this.collection = new ArrayList<>();
        enter("\"\\n\""); // Str0 is always "\n"
    }
    private String stringIdAvailable()
    {
        return "Str"+this.stringcount++;
    }
    public String enter(String str)
    {
        String str_id = stringIdAvailable();
        str = str.substring(1, str.length()-1);
        if(!str_id.equals("Str0"))
            collection.add(str+"\\n");
        else
            collection.add(str);
        return str_id;
    }
    public int getSize()
    {
        return collection.size();
    }
    public String getItem(int index)
    {
        return collection.get(index);
    }
}
