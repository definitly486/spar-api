package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final p0.ylkuphrtab f73920iobyxmoadg = new q1(p0.ylkuphrtab.f75324iobyxmoadg.iobyxmoadg(), 0, 0);

    public static final void eablkybsjg(p0.jhduphickx jhduphickxVar, int i13, int i14) {
        int length = jhduphickxVar.zoijcleaow().length();
        int iMin = Math.min(i13, i14);
        for (int i15 = 0; i15 < iMin; i15++) {
            lqeggnwhkg(jhduphickxVar.iobyxmoadg().zoijcleaow(i15), length, i15);
        }
        lqeggnwhkg(jhduphickxVar.iobyxmoadg().zoijcleaow(i13), length, i13);
        int iMin2 = Math.min(length, i14);
        for (int i16 = 0; i16 < iMin2; i16++) {
            nufgyqmvbu(jhduphickxVar.iobyxmoadg().iobyxmoadg(i16), i13, i16);
        }
        nufgyqmvbu(jhduphickxVar.iobyxmoadg().iobyxmoadg(length), i13, length);
    }

    public static /* synthetic */ void gxszxtbevo(p0.jhduphickx jhduphickxVar, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i14 = 100;
        }
        eablkybsjg(jhduphickxVar, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(int i13, int i14, int i15) {
        boolean z13 = false;
        if (i13 >= 0 && i13 <= i14) {
            z13 = true;
        }
        if (z13) {
            return;
        }
        rlfsiqarku.eablkybsjg.ppxfxbqfkf("OffsetMapping.originalToTransformed returned invalid mapping: " + i15 + " -> " + i13 + " is not in range of transformed text [0, " + i14 + ']');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(int i13, int i14, int i15) {
        boolean z13 = false;
        if (i13 >= 0 && i13 <= i14) {
            z13 = true;
        }
        if (z13) {
            return;
        }
        rlfsiqarku.eablkybsjg.ppxfxbqfkf("OffsetMapping.transformedToOriginal returned invalid mapping: " + i15 + " -> " + i13 + " is not in range of original text [0, " + i14 + ']');
    }

    public static final p0.jhduphickx ppxfxbqfkf(p0.okpsazkaxt okpsazkaxtVar, j0.eablkybsjg eablkybsjgVar) {
        p0.jhduphickx jhduphickxVarIobyxmoadg = okpsazkaxtVar.iobyxmoadg(eablkybsjgVar);
        gxszxtbevo(jhduphickxVarIobyxmoadg, eablkybsjgVar.length(), 0, 2, null);
        return new p0.jhduphickx(jhduphickxVarIobyxmoadg.zoijcleaow(), new q1(jhduphickxVarIobyxmoadg.iobyxmoadg(), eablkybsjgVar.length(), jhduphickxVarIobyxmoadg.zoijcleaow().length()));
    }

    public static final p0.ylkuphrtab wkgbmnqykc() {
        return f73920iobyxmoadg;
    }
}
