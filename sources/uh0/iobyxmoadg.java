package uh0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import nb0.eablkybsjg;
import q00.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {
    private final nb0.zoijcleaow iobyxmoadg(String str, Integer num) {
        return zdlpuopuiu.eablkybsjg(str, "promo") ? nb0.zoijcleaow.f69535iobyxmoadg.iobyxmoadg(num) : nb0.zoijcleaow.C1496zoijcleaow.f69538ppxfxbqfkf;
    }

    public final List zoijcleaow(String groupId, String groupName, Integer num, List bannerList) {
        zdlpuopuiu.btonecajqb(groupId, "groupId");
        zdlpuopuiu.btonecajqb(groupName, "groupName");
        zdlpuopuiu.btonecajqb(bannerList, "bannerList");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(bannerList, 10));
        Iterator it = bannerList.iterator();
        while (it.hasNext()) {
            q00.zoijcleaow zoijcleaowVar = (q00.zoijcleaow) it.next();
            String strBtonecajqb = zoijcleaowVar.btonecajqb();
            String strGtknphoqwx = zoijcleaowVar.gtknphoqwx();
            ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
            String strNufgyqmvbu = zoijcleaowVar.nufgyqmvbu();
            int iRgvfuqvkyq = zoijcleaowVar.rgvfuqvkyq();
            String strZdlpuopuiu = zoijcleaowVar.zdlpuopuiu();
            String strGxszxtbevo = zoijcleaowVar.gxszxtbevo();
            String strLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
            String strKcexrzcfyt = zoijcleaowVar.kcexrzcfyt();
            String strOxmwwwfdhm = zoijcleaowVar.oxmwwwfdhm();
            String strAgtfadlqog = zoijcleaowVar.agtfadlqog();
            boolean zDxjokdxxww = zoijcleaowVar.dxjokdxxww();
            String strWkgbmnqykc = zoijcleaowVar.wkgbmnqykc();
            List listVdvldrhtss = zoijcleaowVar.vdvldrhtss();
            f40.zoijcleaow zoijcleaowVarDraadjrbmk = zoijcleaowVar.draadjrbmk();
            String strOjitshcjhn = zoijcleaowVar.ojitshcjhn();
            if (strOjitshcjhn == null) {
                strOjitshcjhn = "";
            }
            arrayList.add(new eablkybsjg(strBtonecajqb, null, strGtknphoqwx, iRgvfuqvkyq, ppxfxbqfkfVarPpxfxbqfkf, strNufgyqmvbu, strZdlpuopuiu, strGxszxtbevo, strLqeggnwhkg, strKcexrzcfyt, strOxmwwwfdhm, strAgtfadlqog, zDxjokdxxww, strWkgbmnqykc, listVdvldrhtss, zoijcleaowVarDraadjrbmk, strOjitshcjhn, zoijcleaowVar.yggfygwlhe(), new nb0.iobyxmoadg(groupId, groupName), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.wflxmlrfwp(), iobyxmoadg(zoijcleaowVar.btonecajqb(), num), 2, null));
        }
        return arrayList;
    }
}
