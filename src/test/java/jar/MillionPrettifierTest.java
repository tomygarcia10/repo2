package jar;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MillionPrettifierTest {

    private MillionPrettifier millionPrettifier;

    @Before
    public void setUp(){
        millionPrettifier = new MillionPrettifier();
    }

    @Test
    public void shouldPrettifyNumberLowerThanMillion(){

        assertThat(millionPrettifier.prettify(123.24d), is("123.2"));
    }

    @Test
    public void shouldPrettifyNumberGreaterThanMillionAndLowerThanBillion(){

        assertThat(millionPrettifier.prettify(1234567.89), is("1.2M"));
    }

    @Test
    public void shouldPrettifyNumberGreaterThanBillionAndLowerThanTrillion(){

        assertThat(millionPrettifier.prettify(12e13), is("120B"));
    }

    @Test
    public void shouldPrettifyNumberGreaterThanTrillion(){

        assertThat(millionPrettifier.prettify(14e17), is("1.4T"));
    }

}