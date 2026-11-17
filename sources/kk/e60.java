package kk;

import npi.spay.Ln;
import npi.spay.Nf;

/* JADX INFO: loaded from: classes3.dex */
public final class e60 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Nf f56385zdlpuopuiu;

    public e60(Nf nf2) {
        this.f56385zdlpuopuiu = nf2;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        vb vbVar = (vb) obj;
        Nf nf2 = this.f56385zdlpuopuiu;
        int i13 = Nf.f70560lereixgezr;
        a6.iobyxmoadg iobyxmoadgVar = nf2.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((u00) iobyxmoadgVar).f58739draadjrbmk.setClientData(vbVar);
        Nf nf3 = this.f56385zdlpuopuiu;
        a6.iobyxmoadg iobyxmoadgVar2 = nf3.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((u00) iobyxmoadgVar2).f58739draadjrbmk.setOnClickListener(new jn(nf3));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
