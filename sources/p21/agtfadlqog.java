package p21;

import java.util.Iterator;
import java.util.Set;
import lm.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class agtfadlqog implements wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f75410iobyxmoadg;

    public agtfadlqog(Set converterFactories, btonecajqb proLoyaltyClient, s21.iobyxmoadg apiEndPointsProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(converterFactories, "converterFactories");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proLoyaltyClient, "proLoyaltyClient");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        zdlpuopuiu.zoijcleaow zoijcleaowVar = new zdlpuopuiu.zoijcleaow();
        Iterator it = converterFactories.iterator();
        while (it.hasNext()) {
            zoijcleaowVar = zoijcleaowVar.iobyxmoadg((lm.gxszxtbevo.iobyxmoadg) it.next());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVar, "addConverterFactory(...)");
        }
        zdlpuopuiu zdlpuopuiuVarWkgbmnqykc = zoijcleaowVar.zoijcleaow(apiEndPointsProvider.zoijcleaow()).gxszxtbevo(proLoyaltyClient.iobyxmoadg()).wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarWkgbmnqykc, "build(...)");
        this.f75410iobyxmoadg = zdlpuopuiuVarWkgbmnqykc;
    }

    @Override // p21.ojitshcjhn
    public zdlpuopuiu iobyxmoadg() {
        return this.f75410iobyxmoadg;
    }
}
