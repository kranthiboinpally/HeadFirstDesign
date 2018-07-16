package com.tdd.decorator.starbuzz;

import java.io.FilterInputStream;
import java.io.InputStream;

public class LowerCaseInputStrem extends FilterInputStream
{

    protected LowerCaseInputStrem(InputStream in)
    {
        super(in);
     
    }

}
