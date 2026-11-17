package vh0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import kotlin.jvm.internal.zdlpuopuiu;
import nb0.gxszxtbevo;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final z10.wkgbmnqykc f116815zdlpuopuiu;

    public wkgbmnqykc(z10.wkgbmnqykc getFeatureMyCouponsIdUseCase) {
        zdlpuopuiu.btonecajqb(getFeatureMyCouponsIdUseCase, "getFeatureMyCouponsIdUseCase");
        this.f116815zdlpuopuiu = getFeatureMyCouponsIdUseCase;
    }

    private final List btonecajqb(List list, int i13) {
        String str = (String) this.f116815zdlpuopuiu.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gxszxtbevo gxszxtbevoVarIobyxmoadg = (gxszxtbevo) it.next();
            if (zdlpuopuiu.eablkybsjg(gxszxtbevoVarIobyxmoadg.getId(), str)) {
                gxszxtbevoVarIobyxmoadg = gxszxtbevoVarIobyxmoadg.iobyxmoadg((447 & 1) != 0 ? gxszxtbevoVarIobyxmoadg.f69526zdlpuopuiu : null, (447 & 2) != 0 ? gxszxtbevoVarIobyxmoadg.f69525yggfygwlhe : null, (447 & 4) != 0 ? gxszxtbevoVarIobyxmoadg.f69522jyumaefscl : 0, (447 & 8) != 0 ? gxszxtbevoVarIobyxmoadg.f69521iwizpuwonk : null, (447 & 16) != 0 ? gxszxtbevoVarIobyxmoadg.f69519cqumvgiudr : null, (447 & 32) != 0 ? gxszxtbevoVarIobyxmoadg.f69520esjtqupxsv : null, (447 & 64) != 0 ? gxszxtbevoVarIobyxmoadg.f69523lereixgezr : ppxfxbqfkf(i13), (447 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? gxszxtbevoVarIobyxmoadg.f69524pmvmpeiblj : null, (447 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? gxszxtbevoVarIobyxmoadg.f69527zynmafqrjb : null);
            }
            arrayList.add(gxszxtbevoVarIobyxmoadg);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh0.iobyxmoadg gxszxtbevo(wkgbmnqykc wkgbmnqykcVar, int i13, String str, yh0.iobyxmoadg iobyxmoadgVar) {
        yh0.iobyxmoadg.eablkybsjg.zoijcleaow zoijcleaowVarLqeggnwhkg;
        zdlpuopuiu.btonecajqb(str, "<unused var>");
        yh0.iobyxmoadg.eablkybsjg.zoijcleaow zoijcleaowVar = iobyxmoadgVar instanceof yh0.iobyxmoadg.eablkybsjg.zoijcleaow ? (yh0.iobyxmoadg.eablkybsjg.zoijcleaow) iobyxmoadgVar : null;
        return (zoijcleaowVar == null || (zoijcleaowVarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg(wkgbmnqykcVar.btonecajqb(zoijcleaowVar.nufgyqmvbu(), i13))) == null) ? iobyxmoadgVar : zoijcleaowVarLqeggnwhkg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh0.iobyxmoadg lqeggnwhkg(rgvfuqvkyq rgvfuqvkyqVar, Object obj, Object obj2) {
        return (yh0.iobyxmoadg) rgvfuqvkyqVar.invoke(obj, obj2);
    }

    private final nb0.zoijcleaow ppxfxbqfkf(int i13) {
        return nb0.zoijcleaow.f69535iobyxmoadg.iobyxmoadg(Integer.valueOf(i13));
    }

    public Map eablkybsjg(final int i13, Map currentSection) {
        zdlpuopuiu.btonecajqb(currentSection, "currentSection");
        Map mapIwizpuwonk = tzroggbefp.iwizpuwonk(currentSection);
        final rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq() { // from class: vh0.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.gxszxtbevo(this.f116817zdlpuopuiu, i13, (String) obj, (yh0.iobyxmoadg) obj2);
            }
        };
        mapIwizpuwonk.replaceAll(new BiFunction() { // from class: vh0.ppxfxbqfkf
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return wkgbmnqykc.lqeggnwhkg(rgvfuqvkyqVar, obj, obj2);
            }
        });
        return mapIwizpuwonk;
    }

    @Override // tg.rgvfuqvkyq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return eablkybsjg(((Number) obj).intValue(), (Map) obj2);
    }
}
