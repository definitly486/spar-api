package kk;

import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class ko implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.db f57335zdlpuopuiu;

    public ko(npi.spay.db dbVar) {
        this.f57335zdlpuopuiu = dbVar;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        String str = (String) obj;
        npi.spay.db dbVar = this.f57335zdlpuopuiu;
        int i13 = npi.spay.db.f70572iwizpuwonk;
        a6.iobyxmoadg iobyxmoadgVar = dbVar.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((uu) iobyxmoadgVar).f58890ppxfxbqfkf.setText(str);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
