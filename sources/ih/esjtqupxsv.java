package ih;

import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.yfnezrywwk;
import zi.ikoacuggdj;
import zi.nuxfzjnpeb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class esjtqupxsv {
    public static final nuxfzjnpeb iobyxmoadg(jh.eablkybsjg from, jh.eablkybsjg to2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(from, "from");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(to2, "to");
        from.rgvfuqvkyq().size();
        to2.rgvfuqvkyq().size();
        nuxfzjnpeb.iobyxmoadg iobyxmoadgVar = nuxfzjnpeb.f130098ppxfxbqfkf;
        List listRgvfuqvkyq = from.rgvfuqvkyq();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRgvfuqvkyq, "getDeclaredTypeParameters(...)");
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listRgvfuqvkyq, 10));
        Iterator it = listRgvfuqvkyq.iterator();
        while (it.hasNext()) {
            arrayList.add(((yfnezrywwk) it.next()).btonecajqb());
        }
        List listRgvfuqvkyq2 = to2.rgvfuqvkyq();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRgvfuqvkyq2, "getDeclaredTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listRgvfuqvkyq2, 10));
        Iterator it2 = listRgvfuqvkyq2.iterator();
        while (it2.hasNext()) {
            ikoacuggdj ikoacuggdjVarOjitshcjhn = ((yfnezrywwk) it2.next()).ojitshcjhn();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarOjitshcjhn, "getDefaultType(...)");
            arrayList2.add(ej.wkgbmnqykc.wkgbmnqykc(ikoacuggdjVarOjitshcjhn));
        }
        return nuxfzjnpeb.iobyxmoadg.eablkybsjg(iobyxmoadgVar, tzroggbefp.kcexrzcfyt(hg.jyumaefscl.w(arrayList, arrayList2)), false, 2, null);
    }
}
