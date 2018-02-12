import net.jcip.annotations.GuardedBy;

public class Sequence {
    @GuardedBy(value="this")
    private int zz;

}
