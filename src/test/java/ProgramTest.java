import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;
public class ProgramTest {

    @org.junit.Test
    public void alternatingCaps() {
        assertThat(Program.alternatingCaps("hello"),is("HeLlO"));
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

    @Test
    public void makeTitle(){
        assertThat(Program.makeTitle("i am a title"),is("I Am A Title"));
        assertThat(Program.makeTitle("I AM A TITLE"), is("I AM A TITLE"));
        assertThat(Program.makeTitle("i aM a tITLE"), is("I AM A TITLE"));
        assertThat(Program.makeTitle("the first letter of every word is capitalized"), is("The First Letter Of Every Word Is Capitalized"));
        assertThat(Program.makeTitle("I Like Pizza"), is("I Like Pizza"));
        assertThat(Program.makeTitle("Don't count your ChiCKens BeFore They HatCh"), is("Don't Count Your ChiCKens BeFore They HatCh"));
        assertThat(Program.makeTitle("All generalizations are false, including this one"), is("All Generalizations Are False, Including This One"));
        assertThat(Program.makeTitle("Me and my wife lived happily for twenty years and then we met."), is("Me And My Wife Lived Happily For Twenty Years And Then We Met."));
        assertThat(Program.makeTitle("There are no stupid questions, just stupid people."), is("There Are No Stupid Questions, Just Stupid People."));
        assertThat(Program.makeTitle("1f you c4n r34d 7h15, you r34lly n33d 2 g37 l41d"), is("1f You C4n R34d 7h15, You R34lly N33d 2 G37 L41d"));
    }
}