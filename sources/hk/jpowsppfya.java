package hk;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jpowsppfya {
    public static final Object iobyxmoadg(gk.zoijcleaow json, gk.btonecajqb element, bk.iobyxmoadg deserializer) {
        ek.eablkybsjg jyumaefsclVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deserializer, "deserializer");
        if (element instanceof gk.cdpycssgdh) {
            jyumaefsclVar = new esjtqupxsv(json, (gk.cdpycssgdh) element, null, null, 12, null);
        } else if (element instanceof gk.ppxfxbqfkf) {
            jyumaefsclVar = new lereixgezr(json, (gk.ppxfxbqfkf) element);
        } else {
            if (!(element instanceof gk.iwizpuwonk) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(element, gk.pmvmpeiblj.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            jyumaefsclVar = new jyumaefscl(json, (gk.iozdgvuglv) element, null, 4, null);
        }
        return jyumaefsclVar.eablkybsjg(deserializer);
    }

    public static final Object zoijcleaow(gk.zoijcleaow zoijcleaowVar, String discriminator, gk.cdpycssgdh element, bk.iobyxmoadg deserializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(discriminator, "discriminator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deserializer, "deserializer");
        return new esjtqupxsv(zoijcleaowVar, element, discriminator, deserializer.iobyxmoadg()).eablkybsjg(deserializer);
    }
}
