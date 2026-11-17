package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f4993iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Object f4994ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f4995zoijcleaow;

        public iobyxmoadg(int i13, int i14, Object obj) {
            this.f4993iobyxmoadg = i13;
            this.f4995zoijcleaow = i14;
            this.f4994ppxfxbqfkf = obj;
            if (!(i13 >= 0)) {
                rlfsiqarku.eablkybsjg.iobyxmoadg("startIndex should be >= 0");
            }
            if (i14 > 0) {
                return;
            }
            rlfsiqarku.eablkybsjg.iobyxmoadg("size should be > 0");
        }

        public final int iobyxmoadg() {
            return this.f4995zoijcleaow;
        }

        public final Object ppxfxbqfkf() {
            return this.f4994ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return this.f4993iobyxmoadg;
        }
    }

    iobyxmoadg get(int i13);

    int getSize();

    void iobyxmoadg(int i13, int i14, tg.draadjrbmk draadjrbmkVar);
}
