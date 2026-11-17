package okpsazkaxt;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.iwxlajgraz;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iwxlajgraz f73128iobyxmoadg;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: okpsazkaxt.vdvldrhtss$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1593iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C1593iobyxmoadg f73129iobyxmoadg = new C1593iobyxmoadg();

            private C1593iobyxmoadg() {
                super(null);
            }

            public String toString() {
                return "Closed";
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final long f73130iobyxmoadg;

            public /* synthetic */ zoijcleaow(long j13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this(j13);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof zoijcleaow) {
                    return g.eablkybsjg.btonecajqb(this.f73130iobyxmoadg, ((zoijcleaow) obj).f73130iobyxmoadg);
                }
                return false;
            }

            public int hashCode() {
                return g.eablkybsjg.ojitshcjhn(this.f73130iobyxmoadg);
            }

            public final long iobyxmoadg() {
                return this.f73130iobyxmoadg;
            }

            public String toString() {
                return "Open(offset=" + ((Object) g.eablkybsjg.kcexrzcfyt(this.f73130iobyxmoadg)) + ')';
            }

            private zoijcleaow(long j13) {
                super(null);
                this.f73130iobyxmoadg = j13;
                if ((j13 & 9223372034707292159L) != 9205357640488583168L) {
                    return;
                }
                rlfsiqarku.eablkybsjg.ppxfxbqfkf("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public vdvldrhtss(iobyxmoadg iobyxmoadgVar) {
        this.f73128iobyxmoadg = c1.ppxfxbqfkf(iobyxmoadgVar, null, 2, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vdvldrhtss) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((vdvldrhtss) obj).iobyxmoadg(), iobyxmoadg());
        }
        return false;
    }

    public int hashCode() {
        return iobyxmoadg().hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return (iobyxmoadg) this.f73128iobyxmoadg.getValue();
    }

    public String toString() {
        return "ContextMenuState(status=" + iobyxmoadg() + ')';
    }

    public final void zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        this.f73128iobyxmoadg.setValue(iobyxmoadgVar);
    }

    public /* synthetic */ vdvldrhtss(iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? iobyxmoadg.C1593iobyxmoadg.f73129iobyxmoadg : iobyxmoadgVar);
    }
}
