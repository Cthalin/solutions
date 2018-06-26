import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;
public class ProgramTest {

    @org.junit.Test
    public void alternatingCaps() {
        assertThat(Program.alternatingCapsSecond("hello"),is("HeLlO"));
    }

    @Test
    public void letterCheck() {
        assertThat(Program.letterCheck(new String[]{"trances", "nectar"}), is(true));
        assertThat(Program.letterCheck(new String[]{"THE EYES", "they see"}), is(true));
        assertThat(Program.letterCheck(new String[]{"assert", "staring"}), is(false));
        assertThat(Program.letterCheck(new String[]{"arches", "later"}), is(false));
        assertThat(Program.letterCheck(new String[]{"dale", "caller"}), is(false));
        assertThat(Program.letterCheck(new String[]{"parses", "parsecs"}), is(false));
        assertThat(Program.letterCheck(new String[]{"replays", "adam"}), is(false));
        assertThat(Program.letterCheck(new String[]{"mastering", "streaming"}), is(true));
        assertThat(Program.letterCheck(new String[]{"drapes", "compadres"}), is(false));
        assertThat(Program.letterCheck(new String[]{"deltas", "slated"}), is(true));
    }

    @Test
    public void mean(){
        assertThat(Program.mean(new int[]{1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}), is(2.55));
        assertThat(Program.mean(new int[]{324, 543, 654, 9876}), is(2849.25));
        assertThat(Program.mean(new int[]{0, 0, 0, 0}), is(0.00));
        assertThat(Program.mean(new int[]{30, 40, 20, 100, 30}), is(44.00));
        assertThat(Program.mean(new int[]{1, 1, 1, 0}), is(0.75));
        assertThat(Program.mean(new int[]{1, 1, 0, 1, 2, 1, 1, 1, 0, 0}), is(0.80));
        assertThat(Program.mean(new int[]{10000}), is(10000.00));
    }
}