package objectstreams;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

import java.io.*;

public class MiOutputStream extends ObjectOutputStream {

    public MiOutputStream (OutputStream o) throws IOException
    {
        super(o);
    }

    protected void writeStreamHeader()
    {

    }

}
