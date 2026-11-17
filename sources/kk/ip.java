package kk;

import androidx.appcompat.widget.AppCompatTextView;
import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class ip implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.e6 f57083zdlpuopuiu;

    public ip(npi.spay.e6 e6Var) {
        this.f57083zdlpuopuiu = e6Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        String str = (String) obj;
        npi.spay.e6 e6Var = this.f57083zdlpuopuiu;
        int i13 = npi.spay.e6.f70573iwizpuwonk;
        a6.iobyxmoadg iobyxmoadgVar = e6Var.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        AppCompatTextView observeViewModel$lambda$2$lambda$1 = ((pl) iobyxmoadgVar).f58099zoijcleaow;
        observeViewModel$lambda$2$lambda$1.setText(str);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(observeViewModel$lambda$2$lambda$1, "observeViewModel$lambda$2$lambda$1");
        String strWkgbmnqykc = ir.wkgbmnqykc(str);
        observeViewModel$lambda$2$lambda$1.setVisibility((strWkgbmnqykc == null || strWkgbmnqykc.length() == 0) ? 8 : 0);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
