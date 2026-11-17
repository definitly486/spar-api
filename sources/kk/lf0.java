package kk;

import npi.spay.Ln;
import npi.spay.Nb;

/* JADX INFO: loaded from: classes3.dex */
public final class lf0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Nb f57469zdlpuopuiu;

    public lf0(Nb nb3) {
        this.f57469zdlpuopuiu = nb3;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        vb vbVar = (vb) obj;
        Nb nb3 = this.f57469zdlpuopuiu;
        int i13 = Nb.f70557esjtqupxsv;
        a6.iobyxmoadg iobyxmoadgVar = nb3.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((ls) iobyxmoadgVar).f57530lqeggnwhkg.setClientData(vbVar);
        Nb nb4 = this.f57469zdlpuopuiu;
        a6.iobyxmoadg iobyxmoadgVar2 = nb4.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((ls) iobyxmoadgVar2).f57530lqeggnwhkg.setOnClickListener(new e70(nb4));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
