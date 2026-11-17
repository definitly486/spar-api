package af1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.cqumvgiudr;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import m01.wkgbmnqykc;
import m91.nufgyqmvbu;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final m01.zoijcleaow f1703yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f1704zdlpuopuiu;

    public zoijcleaow(wkgbmnqykc getFeatureMyCouponsIdUseCase, m01.zoijcleaow getFeatureChatIdUseCase) {
        zdlpuopuiu.btonecajqb(getFeatureMyCouponsIdUseCase, "getFeatureMyCouponsIdUseCase");
        zdlpuopuiu.btonecajqb(getFeatureChatIdUseCase, "getFeatureChatIdUseCase");
        this.f1704zdlpuopuiu = getFeatureMyCouponsIdUseCase;
        this.f1703yggfygwlhe = getFeatureChatIdUseCase;
    }

    private final m91.zoijcleaow iobyxmoadg(int i13) {
        return m91.zoijcleaow.f66632iobyxmoadg.iobyxmoadg(Integer.valueOf(i13));
    }

    private final List ppxfxbqfkf(List list, int i13, int i14) {
        wkgbmnqykc wkgbmnqykcVar = this.f1704zdlpuopuiu;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        String str = (String) wkgbmnqykcVar.zoijcleaow(wwaezpbzknVar);
        String str2 = (String) this.f1703yggfygwlhe.zoijcleaow(wwaezpbzknVar);
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nufgyqmvbu nufgyqmvbuVarIobyxmoadg = (nufgyqmvbu) it.next();
            String id2 = nufgyqmvbuVarIobyxmoadg.getId();
            if (zdlpuopuiu.eablkybsjg(id2, str)) {
                nufgyqmvbuVarIobyxmoadg = nufgyqmvbuVarIobyxmoadg.iobyxmoadg((447 & 1) != 0 ? nufgyqmvbuVarIobyxmoadg.f66625zdlpuopuiu : null, (447 & 2) != 0 ? nufgyqmvbuVarIobyxmoadg.f66624yggfygwlhe : null, (447 & 4) != 0 ? nufgyqmvbuVarIobyxmoadg.f66621jyumaefscl : 0, (447 & 8) != 0 ? nufgyqmvbuVarIobyxmoadg.f66620iwizpuwonk : null, (447 & 16) != 0 ? nufgyqmvbuVarIobyxmoadg.f66618cqumvgiudr : null, (447 & 32) != 0 ? nufgyqmvbuVarIobyxmoadg.f66619esjtqupxsv : null, (447 & 64) != 0 ? nufgyqmvbuVarIobyxmoadg.f66622lereixgezr : iobyxmoadg(i13), (447 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nufgyqmvbuVarIobyxmoadg.f66623pmvmpeiblj : null, (447 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nufgyqmvbuVarIobyxmoadg.f66626zynmafqrjb : null);
            } else {
                if (zdlpuopuiu.eablkybsjg(id2, str2)) {
                    nufgyqmvbuVarIobyxmoadg = nufgyqmvbuVarIobyxmoadg.iobyxmoadg((447 & 1) != 0 ? nufgyqmvbuVarIobyxmoadg.f66625zdlpuopuiu : null, (447 & 2) != 0 ? nufgyqmvbuVarIobyxmoadg.f66624yggfygwlhe : null, (447 & 4) != 0 ? nufgyqmvbuVarIobyxmoadg.f66621jyumaefscl : 0, (447 & 8) != 0 ? nufgyqmvbuVarIobyxmoadg.f66620iwizpuwonk : null, (447 & 16) != 0 ? nufgyqmvbuVarIobyxmoadg.f66618cqumvgiudr : null, (447 & 32) != 0 ? nufgyqmvbuVarIobyxmoadg.f66619esjtqupxsv : null, (447 & 64) != 0 ? nufgyqmvbuVarIobyxmoadg.f66622lereixgezr : iobyxmoadg(i14), (447 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nufgyqmvbuVarIobyxmoadg.f66623pmvmpeiblj : null, (447 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nufgyqmvbuVarIobyxmoadg.f66626zynmafqrjb : null);
                }
                arrayList.add(nufgyqmvbuVarIobyxmoadg);
            }
            arrayList.add(nufgyqmvbuVarIobyxmoadg);
        }
        return arrayList;
    }

    @Override // tg.vdvldrhtss
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return zoijcleaow(((Number) obj).intValue(), ((Number) obj2).intValue(), (Map) obj3);
    }

    public gg.vdvldrhtss zoijcleaow(int i13, int i14, Map currentSection) {
        zdlpuopuiu.btonecajqb(currentSection, "currentSection");
        Object obj = currentSection.get("buttons");
        df1.iobyxmoadg.eablkybsjg eablkybsjgVar = obj instanceof df1.iobyxmoadg.eablkybsjg ? (df1.iobyxmoadg.eablkybsjg) obj : null;
        if (eablkybsjgVar instanceof df1.iobyxmoadg.eablkybsjg.zoijcleaow) {
            df1.iobyxmoadg.eablkybsjg.zoijcleaow zoijcleaowVar = (df1.iobyxmoadg.eablkybsjg.zoijcleaow) eablkybsjgVar;
            return cqumvgiudr.iobyxmoadg("buttons", zoijcleaowVar.lqeggnwhkg(ppxfxbqfkf(zoijcleaowVar.nufgyqmvbu(), i13, i14)));
        }
        if (eablkybsjgVar instanceof df1.iobyxmoadg.eablkybsjg.ppxfxbqfkf) {
            return cqumvgiudr.iobyxmoadg("buttons", ((df1.iobyxmoadg.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).lqeggnwhkg(Integer.valueOf(i13), Integer.valueOf(i14)));
        }
        return null;
    }
}
