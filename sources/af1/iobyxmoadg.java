package af1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.cqumvgiudr;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import m01.wkgbmnqykc;
import m91.nufgyqmvbu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f1681iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final m01.zoijcleaow f1682zoijcleaow;

    public iobyxmoadg(wkgbmnqykc getFeatureMyCouponsIdUseCase, m01.zoijcleaow getFeatureChatIdUseCase) {
        zdlpuopuiu.btonecajqb(getFeatureMyCouponsIdUseCase, "getFeatureMyCouponsIdUseCase");
        zdlpuopuiu.btonecajqb(getFeatureChatIdUseCase, "getFeatureChatIdUseCase");
        this.f1681iobyxmoadg = getFeatureMyCouponsIdUseCase;
        this.f1682zoijcleaow = getFeatureChatIdUseCase;
    }

    private final m91.zoijcleaow iobyxmoadg(String str, Map map) {
        Integer num = (Integer) map.get(str);
        if (num != null) {
            m91.zoijcleaow zoijcleaowVarIobyxmoadg = m91.zoijcleaow.f66632iobyxmoadg.iobyxmoadg(Integer.valueOf(num.intValue()));
            if (zoijcleaowVarIobyxmoadg != null) {
                return zoijcleaowVarIobyxmoadg;
            }
        }
        return m91.zoijcleaow.C1377zoijcleaow.f66634zoijcleaow;
    }

    public final List zoijcleaow(int i13, int i14, List bannerList, String groupId, String groupName) {
        iobyxmoadg iobyxmoadgVar = this;
        zdlpuopuiu.btonecajqb(bannerList, "bannerList");
        zdlpuopuiu.btonecajqb(groupId, "groupId");
        zdlpuopuiu.btonecajqb(groupName, "groupName");
        wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVar.f1681iobyxmoadg;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        Map mapDraadjrbmk = tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg((String) wkgbmnqykcVar.zoijcleaow(wwaezpbzknVar), Integer.valueOf(i13)), cqumvgiudr.iobyxmoadg((String) iobyxmoadgVar.f1682zoijcleaow.zoijcleaow(wwaezpbzknVar), Integer.valueOf(i14)));
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(bannerList, 10));
        Iterator it = bannerList.iterator();
        while (it.hasNext()) {
            hh1.iobyxmoadg iobyxmoadgVar2 = (hh1.iobyxmoadg) it.next();
            String strBtonecajqb = iobyxmoadgVar2.btonecajqb();
            String strGtknphoqwx = iobyxmoadgVar2.gtknphoqwx();
            int iRgvfuqvkyq = iobyxmoadgVar2.rgvfuqvkyq();
            String strKcexrzcfyt = iobyxmoadgVar2.kcexrzcfyt();
            ojitshcjhn ojitshcjhnVarDraadjrbmk = iobyxmoadgVar2.draadjrbmk();
            String strOjitshcjhn = iobyxmoadgVar2.ojitshcjhn();
            if (strOjitshcjhn == null) {
                strOjitshcjhn = "";
            }
            arrayList.add(new nufgyqmvbu(strBtonecajqb, strGtknphoqwx, iRgvfuqvkyq, strKcexrzcfyt, ojitshcjhnVarDraadjrbmk, strOjitshcjhn, iobyxmoadgVar.iobyxmoadg(iobyxmoadgVar2.btonecajqb(), mapDraadjrbmk), null, new m91.iobyxmoadg(groupId, groupName), UserVerificationMethods.USER_VERIFY_PATTERN, null));
            iobyxmoadgVar = this;
        }
        return arrayList;
    }
}
