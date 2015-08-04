package jar;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MillionUnitTest {

        @Test
        public void shouldReturtCorrectValues_Empty(){
            assertThat(MillionUnit.getMillonUnitFromNumber(12d), is(MillionUnit.EMPTY));
            assertThat(MillionUnit.getMillonUnitFromNumber(-12d), is(MillionUnit.EMPTY));
            assertThat(MillionUnit.EMPTY.toString(), is(""));
        }

        @Test
        public void shouldReturtCorrectValues_Million(){
            assertThat(MillionUnit.getMillonUnitFromNumber(1234567d), is(MillionUnit.MILLION));
            assertThat(MillionUnit.getMillonUnitFromNumber(-1234567d), is(MillionUnit.MILLION));
            assertThat(MillionUnit.MILLION.toString(), is("M"));
        }

        @Test
        public void shouldReturtCorrectValues_Billion(){
            assertThat(MillionUnit.getMillonUnitFromNumber(1e12), is(MillionUnit.BILLION));
            assertThat(MillionUnit.getMillonUnitFromNumber(-1e12), is(MillionUnit.BILLION));
            assertThat(MillionUnit.BILLION.toString(), is("B"));
        }

        @Test
        public void shouldReturtCorrectValues_Trillion(){
            assertThat(MillionUnit.getMillonUnitFromNumber(1e19), is(MillionUnit.TRILLION));
            assertThat(MillionUnit.getMillonUnitFromNumber(-1e19), is(MillionUnit.TRILLION));
            assertThat(MillionUnit.TRILLION.toString(), is("T"));
        }

}