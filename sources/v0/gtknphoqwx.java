package v0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f114957iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f114956zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final gtknphoqwx f114954ppxfxbqfkf = new gtknphoqwx(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final gtknphoqwx f114955wkgbmnqykc = new gtknphoqwx(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final gtknphoqwx f114953eablkybsjg = new gtknphoqwx(2);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gtknphoqwx iobyxmoadg(List list) {
            Integer numValueOf = 0;
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | ((gtknphoqwx) list.get(i13)).eablkybsjg());
            }
            return new gtknphoqwx(numValueOf.intValue());
        }

        public final gtknphoqwx ppxfxbqfkf() {
            return gtknphoqwx.f114954ppxfxbqfkf;
        }

        public final gtknphoqwx wkgbmnqykc() {
            return gtknphoqwx.f114955wkgbmnqykc;
        }

        public final gtknphoqwx zoijcleaow() {
            return gtknphoqwx.f114953eablkybsjg;
        }

        private iobyxmoadg() {
        }
    }

    public gtknphoqwx(int i13) {
        this.f114957iobyxmoadg = i13;
    }

    public final int eablkybsjg() {
        return this.f114957iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gtknphoqwx) && this.f114957iobyxmoadg == ((gtknphoqwx) obj).f114957iobyxmoadg;
    }

    public int hashCode() {
        return this.f114957iobyxmoadg;
    }

    public String toString() {
        if (this.f114957iobyxmoadg == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f114957iobyxmoadg & f114955wkgbmnqykc.f114957iobyxmoadg) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f114957iobyxmoadg & f114953eablkybsjg.f114957iobyxmoadg) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + y0.ppxfxbqfkf.eablkybsjg(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    public final boolean wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        int i13 = this.f114957iobyxmoadg;
        return (gtknphoqwxVar.f114957iobyxmoadg | i13) == i13;
    }
}
