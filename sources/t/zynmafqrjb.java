package t;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.esjtqupxsv f109208iobyxmoadg = new androidx.collection.esjtqupxsv(0, 1, null);

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final long f109209iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f109210ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f109211zoijcleaow;

        public /* synthetic */ iobyxmoadg(long j13, long j14, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(j13, j14, z13);
        }

        public final boolean iobyxmoadg() {
            return this.f109210ppxfxbqfkf;
        }

        public final long ppxfxbqfkf() {
            return this.f109209iobyxmoadg;
        }

        public final long zoijcleaow() {
            return this.f109211zoijcleaow;
        }

        private iobyxmoadg(long j13, long j14, boolean z13) {
            this.f109209iobyxmoadg = j13;
            this.f109211zoijcleaow = j14;
            this.f109210ppxfxbqfkf = z13;
        }
    }

    public final void iobyxmoadg() {
        this.f109208iobyxmoadg.iobyxmoadg();
    }

    public final gxszxtbevo zoijcleaow(istkbnxepw istkbnxepwVar, dsvhmnatus dsvhmnatusVar) {
        long jGtknphoqwx;
        boolean zIobyxmoadg;
        long jWflxmlrfwp;
        androidx.collection.esjtqupxsv esjtqupxsvVar = new androidx.collection.esjtqupxsv(istkbnxepwVar.zoijcleaow().size());
        List listZoijcleaow = istkbnxepwVar.zoijcleaow();
        int size = listZoijcleaow.size();
        for (int i13 = 0; i13 < size; i13++) {
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) listZoijcleaow.get(i13);
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f109208iobyxmoadg.wkgbmnqykc(cdpycssgdhVar.wkgbmnqykc());
            if (iobyxmoadgVar == null) {
                jGtknphoqwx = cdpycssgdhVar.gtknphoqwx();
                jWflxmlrfwp = cdpycssgdhVar.gxszxtbevo();
                zIobyxmoadg = false;
            } else {
                long jPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
                jGtknphoqwx = jPpxfxbqfkf;
                zIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                jWflxmlrfwp = dsvhmnatusVar.wflxmlrfwp(iobyxmoadgVar.zoijcleaow());
            }
            esjtqupxsvVar.nufgyqmvbu(cdpycssgdhVar.wkgbmnqykc(), new pmvmpeiblj(cdpycssgdhVar.wkgbmnqykc(), cdpycssgdhVar.gtknphoqwx(), cdpycssgdhVar.gxszxtbevo(), cdpycssgdhVar.zoijcleaow(), cdpycssgdhVar.nufgyqmvbu(), jGtknphoqwx, jWflxmlrfwp, zIobyxmoadg, false, cdpycssgdhVar.btonecajqb(), cdpycssgdhVar.ppxfxbqfkf(), cdpycssgdhVar.dxjokdxxww(), cdpycssgdhVar.eablkybsjg(), null));
            if (cdpycssgdhVar.zoijcleaow()) {
                this.f109208iobyxmoadg.nufgyqmvbu(cdpycssgdhVar.wkgbmnqykc(), new iobyxmoadg(cdpycssgdhVar.gtknphoqwx(), cdpycssgdhVar.lqeggnwhkg(), cdpycssgdhVar.zoijcleaow(), null));
            } else {
                this.f109208iobyxmoadg.gtknphoqwx(cdpycssgdhVar.wkgbmnqykc());
            }
        }
        return new gxszxtbevo(esjtqupxsvVar, istkbnxepwVar);
    }
}
