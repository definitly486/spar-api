package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
public abstract class metgxyhuhe {
    public static /* synthetic */ long eablkybsjg(long j13, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = w0.zoijcleaow.agtfadlqog(j13);
        }
        int i18 = i13;
        if ((i17 & 2) != 0) {
            i14 = w0.zoijcleaow.draadjrbmk(j13);
        }
        int i19 = i14;
        if ((i17 & 4) != 0) {
            i15 = w0.zoijcleaow.wflxmlrfwp(j13);
        }
        int i23 = i15;
        if ((i17 & 8) != 0) {
            i16 = w0.zoijcleaow.gtknphoqwx(j13);
        }
        return wkgbmnqykc(j13, i18, i19, i23, i16);
    }

    public static final long gxszxtbevo(long j13, ikoacuggdj ikoacuggdjVar) {
        return ikoacuggdjVar == ikoacuggdj.Horizontal ? w0.ppxfxbqfkf.iobyxmoadg(w0.zoijcleaow.agtfadlqog(j13), w0.zoijcleaow.draadjrbmk(j13), w0.zoijcleaow.wflxmlrfwp(j13), w0.zoijcleaow.gtknphoqwx(j13)) : w0.ppxfxbqfkf.iobyxmoadg(w0.zoijcleaow.wflxmlrfwp(j13), w0.zoijcleaow.gtknphoqwx(j13), w0.zoijcleaow.agtfadlqog(j13), w0.zoijcleaow.draadjrbmk(j13));
    }

    public static long iobyxmoadg(int i13, int i14, int i15, int i16) {
        return zoijcleaow(w0.ppxfxbqfkf.iobyxmoadg(i13, i14, i15, i16));
    }

    public static long ppxfxbqfkf(long j13, ikoacuggdj ikoacuggdjVar) {
        ikoacuggdj ikoacuggdjVar2 = ikoacuggdj.Horizontal;
        return iobyxmoadg(ikoacuggdjVar == ikoacuggdjVar2 ? w0.zoijcleaow.agtfadlqog(j13) : w0.zoijcleaow.wflxmlrfwp(j13), ikoacuggdjVar == ikoacuggdjVar2 ? w0.zoijcleaow.draadjrbmk(j13) : w0.zoijcleaow.gtknphoqwx(j13), ikoacuggdjVar == ikoacuggdjVar2 ? w0.zoijcleaow.wflxmlrfwp(j13) : w0.zoijcleaow.agtfadlqog(j13), ikoacuggdjVar == ikoacuggdjVar2 ? w0.zoijcleaow.gtknphoqwx(j13) : w0.zoijcleaow.draadjrbmk(j13));
    }

    public static final long wkgbmnqykc(long j13, int i13, int i14, int i15, int i16) {
        return iobyxmoadg(i13, i14, i15, i16);
    }

    private static long zoijcleaow(long j13) {
        return j13;
    }
}
