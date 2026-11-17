package kk;

import androidx.appcompat.widget.AppCompatTextView;
import npi.spay.Da;
import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Da f56318zdlpuopuiu;

    public draadjrbmk(Da da3) {
        this.f56318zdlpuopuiu = da3;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        String str = (String) obj;
        Da da3 = this.f56318zdlpuopuiu;
        int i13 = Da.f70542iwizpuwonk;
        a6.iobyxmoadg iobyxmoadgVar = da3.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        qt qtVar = (qt) iobyxmoadgVar;
        AppCompatTextView spaySllActvLocalSessionId = qtVar.f58238zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySllActvLocalSessionId, "spaySllActvLocalSessionId");
        spaySllActvLocalSessionId.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        if (str != null) {
            qtVar.f58238zoijcleaow.setText(str);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
