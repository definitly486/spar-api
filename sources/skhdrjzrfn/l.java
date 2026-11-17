package skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final float iobyxmoadg(j0.f fVar, int i13, boolean z13, boolean z14) {
        return fVar.btonecajqb(i13, fVar.ppxfxbqfkf(((!z13 || z14) && (z13 || !z14)) ? Math.max(i13 + (-1), 0) : i13) == fVar.esjtqupxsv(i13));
    }

    public static final long zoijcleaow(j0.f fVar, int i13, boolean z13, boolean z14) {
        int iVdvldrhtss = fVar.vdvldrhtss(i13);
        if (iVdvldrhtss >= fVar.agtfadlqog()) {
            return g.eablkybsjg.f35584zoijcleaow.zoijcleaow();
        }
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(zg.gtknphoqwx.wflxmlrfwp(iobyxmoadg(fVar, i13, z13, z14), 0.0f, (int) (fVar.zynmafqrjb() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(zg.gtknphoqwx.wflxmlrfwp(fVar.wflxmlrfwp(iVdvldrhtss), 0.0f, (int) (fVar.zynmafqrjb() & 4294967295L)))) & 4294967295L));
    }
}
