package kk;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class t70 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ rd0 f58627zdlpuopuiu;

    public t70(rd0 rd0Var) {
        this.f58627zdlpuopuiu = rd0Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        String str = (String) obj;
        this.f58627zdlpuopuiu.f58318zoijcleaow.setText(str);
        AppCompatTextView spaySlspActvLocalSessionId = this.f58627zdlpuopuiu.f58318zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySlspActvLocalSessionId, "spaySlspActvLocalSessionId");
        String strWkgbmnqykc = ir.wkgbmnqykc(str);
        spaySlspActvLocalSessionId.setVisibility((strWkgbmnqykc == null || strWkgbmnqykc.length() == 0) ? 8 : 0);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
