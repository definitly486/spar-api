package vh0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import nb0.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final z10.wkgbmnqykc f116813iobyxmoadg;

    public iobyxmoadg(z10.wkgbmnqykc getFeatureMyCouponsIdUseCase) {
        zdlpuopuiu.btonecajqb(getFeatureMyCouponsIdUseCase, "getFeatureMyCouponsIdUseCase");
        this.f116813iobyxmoadg = getFeatureMyCouponsIdUseCase;
    }

    private final nb0.zoijcleaow iobyxmoadg(String str, int i13, String str2) {
        return zdlpuopuiu.eablkybsjg(str, str2) ? nb0.zoijcleaow.f69535iobyxmoadg.iobyxmoadg(Integer.valueOf(i13)) : nb0.zoijcleaow.C1496zoijcleaow.f69538ppxfxbqfkf;
    }

    public final List zoijcleaow(int i13, List bannerList, String groupId, String groupName) {
        zdlpuopuiu.btonecajqb(bannerList, "bannerList");
        zdlpuopuiu.btonecajqb(groupId, "groupId");
        zdlpuopuiu.btonecajqb(groupName, "groupName");
        String str = (String) this.f116813iobyxmoadg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(bannerList, 10));
        Iterator it = bannerList.iterator();
        while (it.hasNext()) {
            q00.zoijcleaow zoijcleaowVar = (q00.zoijcleaow) it.next();
            String strBtonecajqb = zoijcleaowVar.btonecajqb();
            String strGtknphoqwx = zoijcleaowVar.gtknphoqwx();
            int iRgvfuqvkyq = zoijcleaowVar.rgvfuqvkyq();
            String strKcexrzcfyt = zoijcleaowVar.kcexrzcfyt();
            f40.zoijcleaow zoijcleaowVarDraadjrbmk = zoijcleaowVar.draadjrbmk();
            String strOjitshcjhn = zoijcleaowVar.ojitshcjhn();
            if (strOjitshcjhn == null) {
                strOjitshcjhn = "";
            }
            arrayList.add(new gxszxtbevo(strBtonecajqb, strGtknphoqwx, iRgvfuqvkyq, strKcexrzcfyt, zoijcleaowVarDraadjrbmk, strOjitshcjhn, iobyxmoadg(zoijcleaowVar.btonecajqb(), i13, str), null, new nb0.iobyxmoadg(groupId, groupName), UserVerificationMethods.USER_VERIFY_PATTERN, null));
        }
        return arrayList;
    }
}
