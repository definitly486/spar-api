package p21;

import java.util.Iterator;
import java.util.Set;
import lm.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f75413iobyxmoadg;

    public eablkybsjg(Set converterFactories, zoijcleaow defaultClient, s21.iobyxmoadg apiEndPointsProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(converterFactories, "converterFactories");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(defaultClient, "defaultClient");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        zdlpuopuiu.zoijcleaow zoijcleaowVar = new zdlpuopuiu.zoijcleaow();
        Iterator it = converterFactories.iterator();
        while (it.hasNext()) {
            zoijcleaowVar = zoijcleaowVar.iobyxmoadg((lm.gxszxtbevo.iobyxmoadg) it.next());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVar, "addConverterFactory(...)");
        }
        zdlpuopuiu zdlpuopuiuVarWkgbmnqykc = zoijcleaowVar.zoijcleaow(apiEndPointsProvider.iobyxmoadg()).gxszxtbevo(defaultClient.iobyxmoadg()).wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarWkgbmnqykc, "build(...)");
        this.f75413iobyxmoadg = zdlpuopuiuVarWkgbmnqykc;
    }

    @Override // p21.ojitshcjhn
    public zdlpuopuiu iobyxmoadg() {
        return this.f75413iobyxmoadg;
    }
}
