package o3;

import android.graphics.Point;
import java.util.Arrays;
import java.util.List;
import v2.wwaezpbzkn;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class istkbnxepw {
    public static wwaezpbzkn iobyxmoadg(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, List[] listArr) {
        boolean z13;
        com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVar2 = new com.google.common.collect.zdlpuopuiu.iobyxmoadg();
        for (int i13 = 0; i13 < iobyxmoadgVar.wkgbmnqykc(); i13++) {
            m3.iwizpuwonk iwizpuwonkVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(i13);
            List list = listArr[i13];
            for (int i14 = 0; i14 < iwizpuwonkVarGxszxtbevo.f65036iobyxmoadg; i14++) {
                v2.yadqdtsiqt yadqdtsiqtVarZoijcleaow = iwizpuwonkVarGxszxtbevo.zoijcleaow(i14);
                boolean z14 = iobyxmoadgVar.iobyxmoadg(i13, i14, false) != 0;
                int i15 = yadqdtsiqtVarZoijcleaow.f115705iobyxmoadg;
                int[] iArr = new int[i15];
                boolean[] zArr = new boolean[i15];
                for (int i16 = 0; i16 < yadqdtsiqtVarZoijcleaow.f115705iobyxmoadg; i16++) {
                    iArr[i16] = iobyxmoadgVar.lqeggnwhkg(i13, i14, i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) list.get(i17);
                        if (zynmafqrjbVar.nufgyqmvbu().equals(yadqdtsiqtVarZoijcleaow) && zynmafqrjbVar.lqeggnwhkg(i16) != -1) {
                            z13 = true;
                            break;
                        }
                        i17++;
                    }
                    zArr[i16] = z13;
                }
                iobyxmoadgVar2.iobyxmoadg(new wwaezpbzkn.iobyxmoadg(yadqdtsiqtVarZoijcleaow, z14, iArr, zArr));
            }
        }
        m3.iwizpuwonk iwizpuwonkVarNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu();
        for (int i18 = 0; i18 < iwizpuwonkVarNufgyqmvbu.f65036iobyxmoadg; i18++) {
            v2.yadqdtsiqt yadqdtsiqtVarZoijcleaow2 = iwizpuwonkVarNufgyqmvbu.zoijcleaow(i18);
            int[] iArr2 = new int[yadqdtsiqtVarZoijcleaow2.f115705iobyxmoadg];
            Arrays.fill(iArr2, 0);
            iobyxmoadgVar2.iobyxmoadg(new wwaezpbzkn.iobyxmoadg(yadqdtsiqtVarZoijcleaow2, false, iArr2, new boolean[yadqdtsiqtVarZoijcleaow2.f115705iobyxmoadg]));
        }
        return new wwaezpbzkn(iobyxmoadgVar2.gtknphoqwx());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    public static Point ppxfxbqfkf(boolean z13, int i13, int i14, int i15, int i16) {
        if (z13) {
            if ((i15 > i16) == (i13 > i14)) {
                i14 = i13;
                i13 = i14;
            }
        } else {
            i14 = i13;
            i13 = i14;
        }
        int i17 = i15 * i13;
        int i18 = i16 * i14;
        return i17 >= i18 ? new Point(i14, stevsuqkhv.btonecajqb(i18, i15)) : new Point(stevsuqkhv.btonecajqb(i17, i16), i13);
    }

    public static wwaezpbzkn zoijcleaow(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, zynmafqrjb[] zynmafqrjbVarArr) {
        List[] listArr = new List[zynmafqrjbVarArr.length];
        for (int i13 = 0; i13 < zynmafqrjbVarArr.length; i13++) {
            zynmafqrjb zynmafqrjbVar = zynmafqrjbVarArr[i13];
            listArr[i13] = zynmafqrjbVar != null ? com.google.common.collect.zdlpuopuiu.istkbnxepw(zynmafqrjbVar) : com.google.common.collect.zdlpuopuiu.zynmafqrjb();
        }
        return iobyxmoadg(iobyxmoadgVar, listArr);
    }
}
