package md;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f66819iobyxmoadg;

    private lqeggnwhkg() {
        this.f66819iobyxmoadg = null;
    }

    public static lqeggnwhkg eablkybsjg(Object obj) {
        return new lqeggnwhkg(obj);
    }

    public static lqeggnwhkg iobyxmoadg() {
        return new lqeggnwhkg();
    }

    public static lqeggnwhkg zoijcleaow(Object obj) {
        return obj == null ? iobyxmoadg() : eablkybsjg(obj);
    }

    public Object ppxfxbqfkf() {
        Object obj = this.f66819iobyxmoadg;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean wkgbmnqykc() {
        return this.f66819iobyxmoadg != null;
    }

    private lqeggnwhkg(Object obj) {
        if (obj != null) {
            this.f66819iobyxmoadg = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
