package zg;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf extends zg.iobyxmoadg implements lqeggnwhkg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final iobyxmoadg f129935cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final ppxfxbqfkf f129936esjtqupxsv = new ppxfxbqfkf(1, 0);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public ppxfxbqfkf(char c13, char c14) {
        super(c13, c14, 1);
    }

    public boolean dxjokdxxww(char c13) {
        return zdlpuopuiu.draadjrbmk(wkgbmnqykc(), c13) <= 0 && zdlpuopuiu.draadjrbmk(c13, eablkybsjg()) <= 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ppxfxbqfkf) {
            if (!isEmpty() || !((ppxfxbqfkf) obj).isEmpty()) {
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
                if (wkgbmnqykc() != ppxfxbqfkfVar.wkgbmnqykc() || eablkybsjg() != ppxfxbqfkfVar.eablkybsjg()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (wkgbmnqykc() * 31) + eablkybsjg();
    }

    @Override // zg.lqeggnwhkg
    public /* bridge */ /* synthetic */ boolean iobyxmoadg(Comparable comparable) {
        return dxjokdxxww(((Character) comparable).charValue());
    }

    public boolean isEmpty() {
        return zdlpuopuiu.draadjrbmk(wkgbmnqykc(), eablkybsjg()) > 0;
    }

    public String toString() {
        return wkgbmnqykc() + ".." + eablkybsjg();
    }
}
