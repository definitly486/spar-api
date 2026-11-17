package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public final class iwxlajgraz implements yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.kegysxyocb f5024iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f5025ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object[] f5026zoijcleaow;

    public iwxlajgraz(zg.btonecajqb btonecajqbVar, rgvfuqvkyq rgvfuqvkyqVar) {
        gxszxtbevo gxszxtbevoVarGtknphoqwx = rgvfuqvkyqVar.gtknphoqwx();
        final int iWkgbmnqykc = btonecajqbVar.wkgbmnqykc();
        if (!(iWkgbmnqykc >= 0)) {
            rlfsiqarku.eablkybsjg.ppxfxbqfkf("negative nearestRange.first");
        }
        final int iMin = Math.min(btonecajqbVar.eablkybsjg(), gxszxtbevoVarGtknphoqwx.getSize() - 1);
        if (iMin < iWkgbmnqykc) {
            this.f5024iobyxmoadg = androidx.collection.tzroggbefp.iobyxmoadg();
            this.f5026zoijcleaow = new Object[0];
            this.f5025ppxfxbqfkf = 0;
        } else {
            int i13 = (iMin - iWkgbmnqykc) + 1;
            this.f5026zoijcleaow = new Object[i13];
            this.f5025ppxfxbqfkf = iWkgbmnqykc;
            final androidx.collection.hcddaimhww hcddaimhwwVar = new androidx.collection.hcddaimhww(i13);
            gxszxtbevoVarGtknphoqwx.iobyxmoadg(iWkgbmnqykc, iMin, new tg.draadjrbmk() { // from class: androidx.compose.foundation.lazy.layout.auzgnhcxok
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return iwxlajgraz.zoijcleaow(iWkgbmnqykc, iMin, hcddaimhwwVar, this, (gxszxtbevo.iobyxmoadg) obj);
                }
            });
            this.f5024iobyxmoadg = hcddaimhwwVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0035  */
    public static final gg.wwaezpbzkn zoijcleaow(int i13, int i14, androidx.collection.hcddaimhww hcddaimhwwVar, iwxlajgraz iwxlajgrazVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        Object objIobyxmoadg;
        tg.draadjrbmk key = ((rgvfuqvkyq.iobyxmoadg) iobyxmoadgVar.ppxfxbqfkf()).getKey();
        int iMax = Math.max(i13, iobyxmoadgVar.zoijcleaow());
        int iMin = Math.min(i14, (iobyxmoadgVar.zoijcleaow() + iobyxmoadgVar.iobyxmoadg()) - 1);
        if (iMax <= iMin) {
            while (true) {
                if (key == null) {
                    objIobyxmoadg = roivzttewh.iobyxmoadg(iMax);
                } else {
                    objIobyxmoadg = key.invoke(Integer.valueOf(iMax - iobyxmoadgVar.zoijcleaow()));
                    if (objIobyxmoadg == null) {
                        objIobyxmoadg = roivzttewh.iobyxmoadg(iMax);
                    }
                }
                hcddaimhwwVar.yggfygwlhe(objIobyxmoadg, iMax);
                iwxlajgrazVar.f5026zoijcleaow[iMax - iwxlajgrazVar.f5025ppxfxbqfkf] = objIobyxmoadg;
                if (iMax == iMin) {
                    break;
                }
                iMax++;
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // androidx.compose.foundation.lazy.layout.yadqdtsiqt
    public int ppxfxbqfkf(Object obj) {
        androidx.collection.kegysxyocb kegysxyocbVar = this.f5024iobyxmoadg;
        int iZoijcleaow = kegysxyocbVar.zoijcleaow(obj);
        if (iZoijcleaow >= 0) {
            return kegysxyocbVar.f4327ppxfxbqfkf[iZoijcleaow];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.yadqdtsiqt
    public Object wkgbmnqykc(int i13) {
        Object[] objArr = this.f5026zoijcleaow;
        int i14 = i13 - this.f5025ppxfxbqfkf;
        if (i14 < 0 || i14 >= objArr.length) {
            return null;
        }
        return objArr[i14];
    }
}
