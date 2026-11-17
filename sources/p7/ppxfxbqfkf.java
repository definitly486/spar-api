package p7;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf extends agtfadlqog {
    public ppxfxbqfkf(List list) {
        super(zoijcleaow(list));
    }

    private static w7.iobyxmoadg iobyxmoadg(w7.iobyxmoadg iobyxmoadgVar) {
        q7.wkgbmnqykc wkgbmnqykcVar = (q7.wkgbmnqykc) iobyxmoadgVar.f118920zoijcleaow;
        q7.wkgbmnqykc wkgbmnqykcVar2 = (q7.wkgbmnqykc) iobyxmoadgVar.f118916ppxfxbqfkf;
        if (wkgbmnqykcVar == null || wkgbmnqykcVar2 == null || wkgbmnqykcVar.eablkybsjg().length == wkgbmnqykcVar2.eablkybsjg().length) {
            return iobyxmoadgVar;
        }
        float[] fArrPpxfxbqfkf = ppxfxbqfkf(wkgbmnqykcVar.eablkybsjg(), wkgbmnqykcVar2.eablkybsjg());
        return iobyxmoadgVar.zoijcleaow(wkgbmnqykcVar.zoijcleaow(fArrPpxfxbqfkf), wkgbmnqykcVar2.zoijcleaow(fArrPpxfxbqfkf));
    }

    static float[] ppxfxbqfkf(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f13 = Float.NaN;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            float f14 = fArr3[i14];
            if (f14 != f13) {
                fArr3[i13] = f14;
                i13++;
                f13 = fArr3[i14];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i13);
    }

    private static List zoijcleaow(List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.set(i13, iobyxmoadg((w7.iobyxmoadg) list.get(i13)));
        }
        return list;
    }

    @Override // p7.wflxmlrfwp
    public l7.iobyxmoadg eablkybsjg() {
        return new l7.eablkybsjg(this.f75855iobyxmoadg);
    }

    @Override // p7.agtfadlqog, p7.wflxmlrfwp
    public /* bridge */ /* synthetic */ List gxszxtbevo() {
        return super.gxszxtbevo();
    }

    @Override // p7.agtfadlqog
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // p7.agtfadlqog, p7.wflxmlrfwp
    public /* bridge */ /* synthetic */ boolean wkgbmnqykc() {
        return super.wkgbmnqykc();
    }
}
