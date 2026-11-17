package kk;

import androidx.appcompat.widget.AppCompatImageView;
import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class ax implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.uo f55878zdlpuopuiu;

    public ax(npi.spay.uo uoVar) {
        this.f55878zdlpuopuiu = uoVar;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        int iIntValue = ((Number) obj).intValue();
        npi.spay.uo uoVar = this.f55878zdlpuopuiu;
        int i13 = npi.spay.uo.f70585cdpycssgdh;
        a6.iobyxmoadg iobyxmoadgVar = uoVar.f70565iwizpuwonk;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        AppCompatImageView appCompatImageView = ((r3) iobyxmoadgVar).f58262zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(appCompatImageView, "binding.sbssAcivBackground");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appCompatImageView, "<this>");
        appCompatImageView.setImageDrawable(i1.nufgyqmvbu.gxszxtbevo(appCompatImageView.getResources(), iIntValue, null));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
