package li;

import gg.wwaezpbzkn;
import java.util.Collection;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oxmwwwfdhm {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(jj.draadjrbmk draadjrbmkVar, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
        draadjrbmkVar.add(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final Collection zoijcleaow(Collection collection, tg.draadjrbmk descriptorByHandle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        jj.draadjrbmk draadjrbmkVarIobyxmoadg = jj.draadjrbmk.f51581jyumaefscl.iobyxmoadg();
        while (!linkedList.isEmpty()) {
            Object objOpjhrmiecq = hg.jyumaefscl.opjhrmiecq(linkedList);
            jj.draadjrbmk draadjrbmkVarIobyxmoadg2 = jj.draadjrbmk.f51581jyumaefscl.iobyxmoadg();
            Collection collectionRgvfuqvkyq = ojitshcjhn.rgvfuqvkyq(objOpjhrmiecq, linkedList, descriptorByHandle, new vdvldrhtss(draadjrbmkVarIobyxmoadg2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionRgvfuqvkyq, "extractMembersOverridableInBothWays(...)");
            if (collectionRgvfuqvkyq.size() == 1 && draadjrbmkVarIobyxmoadg2.isEmpty()) {
                Object objRhgxfdycjh = hg.jyumaefscl.rhgxfdycjh(collectionRgvfuqvkyq);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objRhgxfdycjh, "single(...)");
                draadjrbmkVarIobyxmoadg.add(objRhgxfdycjh);
            } else {
                Object objJpowsppfya = ojitshcjhn.jpowsppfya(collectionRgvfuqvkyq, descriptorByHandle);
                jh.iobyxmoadg iobyxmoadgVar = (jh.iobyxmoadg) descriptorByHandle.invoke(objJpowsppfya);
                for (Object obj : collectionRgvfuqvkyq) {
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
                    if (!ojitshcjhn.zynmafqrjb(iobyxmoadgVar, (jh.iobyxmoadg) descriptorByHandle.invoke(obj))) {
                        draadjrbmkVarIobyxmoadg2.add(obj);
                    }
                }
                if (!draadjrbmkVarIobyxmoadg2.isEmpty()) {
                    draadjrbmkVarIobyxmoadg.addAll(draadjrbmkVarIobyxmoadg2);
                }
                draadjrbmkVarIobyxmoadg.add(objJpowsppfya);
            }
        }
        return draadjrbmkVarIobyxmoadg;
    }
}
