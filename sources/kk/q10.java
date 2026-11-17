package kk;

import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class q10 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.oi f58141zdlpuopuiu;

    public q10(npi.spay.oi oiVar) {
        this.f58141zdlpuopuiu = oiVar;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        int iIntValue = ((Number) obj).intValue();
        npi.spay.oi oiVar = this.f58141zdlpuopuiu;
        int i13 = npi.spay.oi.f70581iwizpuwonk;
        a6.iobyxmoadg iobyxmoadgVar = oiVar.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((n50) iobyxmoadgVar).f57736ppxfxbqfkf.setText(oiVar.getString(iIntValue));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
