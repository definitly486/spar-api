package l0;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f61213iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: l0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1233iobyxmoadg extends SegmentFinder {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f61214iobyxmoadg;

        C1233iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            this.f61214iobyxmoadg = gxszxtbevoVar;
        }

        public int nextEndBoundary(int i13) {
            return this.f61214iobyxmoadg.ppxfxbqfkf(i13);
        }

        public int nextStartBoundary(int i13) {
            return this.f61214iobyxmoadg.iobyxmoadg(i13);
        }

        public int previousEndBoundary(int i13) {
            return this.f61214iobyxmoadg.wkgbmnqykc(i13);
        }

        public int previousStartBoundary(int i13) {
            return this.f61214iobyxmoadg.zoijcleaow(i13);
        }
    }

    private iobyxmoadg() {
    }

    public final SegmentFinder iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        return k0.iobyxmoadg.iobyxmoadg(new C1233iobyxmoadg(gxszxtbevoVar));
    }
}
