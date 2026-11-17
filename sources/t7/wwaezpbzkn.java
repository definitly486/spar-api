package t7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class wwaezpbzkn implements cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wwaezpbzkn f109994iobyxmoadg = new wwaezpbzkn();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109995zoijcleaow = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("c", "v", "i", "o");

    private wwaezpbzkn() {
    }

    @Override // t7.cllcsxoeiz
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public q7.ojitshcjhn iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13) {
        if (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.BEGIN_ARRAY) {
            ppxfxbqfkfVar.wkgbmnqykc();
        }
        ppxfxbqfkfVar.lqeggnwhkg();
        List listGxszxtbevo = null;
        List listGxszxtbevo2 = null;
        List listGxszxtbevo3 = null;
        boolean zDraadjrbmk = false;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109995zoijcleaow);
            if (iCqumvgiudr == 0) {
                zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
            } else if (iCqumvgiudr == 1) {
                listGxszxtbevo = kcexrzcfyt.gxszxtbevo(ppxfxbqfkfVar, f13);
            } else if (iCqumvgiudr == 2) {
                listGxszxtbevo2 = kcexrzcfyt.gxszxtbevo(ppxfxbqfkfVar, f13);
            } else if (iCqumvgiudr != 3) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                listGxszxtbevo3 = kcexrzcfyt.gxszxtbevo(ppxfxbqfkfVar, f13);
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        if (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.END_ARRAY) {
            ppxfxbqfkfVar.nufgyqmvbu();
        }
        if (listGxszxtbevo == null || listGxszxtbevo2 == null || listGxszxtbevo3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listGxszxtbevo.isEmpty()) {
            return new q7.ojitshcjhn(new PointF(), false, Collections.emptyList());
        }
        int size = listGxszxtbevo.size();
        PointF pointF = (PointF) listGxszxtbevo.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i13 = 1; i13 < size; i13++) {
            PointF pointF2 = (PointF) listGxszxtbevo.get(i13);
            int i14 = i13 - 1;
            arrayList.add(new o7.iobyxmoadg(v7.dxjokdxxww.iobyxmoadg((PointF) listGxszxtbevo.get(i14), (PointF) listGxszxtbevo3.get(i14)), v7.dxjokdxxww.iobyxmoadg(pointF2, (PointF) listGxszxtbevo2.get(i13)), pointF2));
        }
        if (zDraadjrbmk) {
            PointF pointF3 = (PointF) listGxszxtbevo.get(0);
            int i15 = size - 1;
            arrayList.add(new o7.iobyxmoadg(v7.dxjokdxxww.iobyxmoadg((PointF) listGxszxtbevo.get(i15), (PointF) listGxszxtbevo3.get(i15)), v7.dxjokdxxww.iobyxmoadg(pointF3, (PointF) listGxszxtbevo2.get(0)), pointF3));
        }
        return new q7.ojitshcjhn(pointF, zDraadjrbmk, arrayList);
    }
}
