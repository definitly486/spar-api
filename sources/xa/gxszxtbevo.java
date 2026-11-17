package xa;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f121847iobyxmoadg;

    private gxszxtbevo(String str) {
        this.f121847iobyxmoadg = (String) draadjrbmk.btonecajqb(str);
    }

    public static gxszxtbevo gxszxtbevo(char c13) {
        return new gxszxtbevo(String.valueOf(c13));
    }

    public static gxszxtbevo lqeggnwhkg(String str) {
        return new gxszxtbevo(str);
    }

    public final String eablkybsjg(Iterator it) {
        return ppxfxbqfkf(new StringBuilder(), it).toString();
    }

    public Appendable iobyxmoadg(Appendable appendable, Iterator it) throws IOException {
        draadjrbmk.btonecajqb(appendable);
        if (it.hasNext()) {
            appendable.append(nufgyqmvbu(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f121847iobyxmoadg);
                appendable.append(nufgyqmvbu(it.next()));
            }
        }
        return appendable;
    }

    CharSequence nufgyqmvbu(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final StringBuilder ppxfxbqfkf(StringBuilder sb3, Iterator it) {
        try {
            iobyxmoadg(sb3, it);
            return sb3;
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public final String wkgbmnqykc(Iterable iterable) {
        return eablkybsjg(iterable.iterator());
    }

    public final StringBuilder zoijcleaow(StringBuilder sb3, Iterable iterable) {
        return ppxfxbqfkf(sb3, iterable.iterator());
    }
}
