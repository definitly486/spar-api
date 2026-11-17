package t7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static u7.ppxfxbqfkf.iobyxmoadg f109997iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("k");

    static List iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar, float f13, cllcsxoeiz cllcsxoeizVar, boolean z13) {
        ArrayList arrayList = new ArrayList();
        if (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.STRING) {
            btonecajqbVar.iobyxmoadg("Lottie doesn't support expressions.");
            return arrayList;
        }
        ppxfxbqfkfVar.lqeggnwhkg();
        while (ppxfxbqfkfVar.btonecajqb()) {
            if (ppxfxbqfkfVar.cqumvgiudr(f109997iobyxmoadg) != 0) {
                ppxfxbqfkfVar.pmvmpeiblj();
            } else if (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.BEGIN_ARRAY) {
                ppxfxbqfkfVar.wkgbmnqykc();
                if (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.NUMBER) {
                    arrayList.add(zdlpuopuiu.ppxfxbqfkf(ppxfxbqfkfVar, btonecajqbVar, f13, cllcsxoeizVar, false, z13));
                } else {
                    while (ppxfxbqfkfVar.btonecajqb()) {
                        arrayList.add(zdlpuopuiu.ppxfxbqfkf(ppxfxbqfkfVar, btonecajqbVar, f13, cllcsxoeizVar, true, z13));
                    }
                }
                ppxfxbqfkfVar.nufgyqmvbu();
            } else {
                arrayList.add(zdlpuopuiu.ppxfxbqfkf(ppxfxbqfkfVar, btonecajqbVar, f13, cllcsxoeizVar, false, z13));
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        zoijcleaow(arrayList);
        return arrayList;
    }

    public static void zoijcleaow(List list) {
        int i13;
        Object obj;
        int size = list.size();
        int i14 = 0;
        while (true) {
            i13 = size - 1;
            if (i14 >= i13) {
                break;
            }
            w7.iobyxmoadg iobyxmoadgVar = (w7.iobyxmoadg) list.get(i14);
            i14++;
            w7.iobyxmoadg iobyxmoadgVar2 = (w7.iobyxmoadg) list.get(i14);
            iobyxmoadgVar.f118914nufgyqmvbu = Float.valueOf(iobyxmoadgVar2.f118913lqeggnwhkg);
            if (iobyxmoadgVar.f118916ppxfxbqfkf == null && (obj = iobyxmoadgVar2.f118920zoijcleaow) != null) {
                iobyxmoadgVar.f118916ppxfxbqfkf = obj;
                if (iobyxmoadgVar instanceof l7.dxjokdxxww) {
                    ((l7.dxjokdxxww) iobyxmoadgVar).btonecajqb();
                }
            }
        }
        w7.iobyxmoadg iobyxmoadgVar3 = (w7.iobyxmoadg) list.get(i13);
        if ((iobyxmoadgVar3.f118920zoijcleaow == null || iobyxmoadgVar3.f118916ppxfxbqfkf == null) && list.size() > 1) {
            list.remove(iobyxmoadgVar3);
        }
    }
}
