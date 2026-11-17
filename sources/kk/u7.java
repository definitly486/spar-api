package kk;

import npi.spay.Ln;
import npi.spay.Nf;
import spay.sdk.view.SpayBnplGraphCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class u7 implements la0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final /* synthetic */ Nf f58785iobyxmoadg;

    public u7(Nf nf2) {
        this.f58785iobyxmoadg = nf2;
    }

    @Override // kk.la0
    public final void iobyxmoadg(int i13) {
        Nf nf2 = this.f58785iobyxmoadg;
        int i14 = Nf.f70560lereixgezr;
        a6.iobyxmoadg iobyxmoadgVar = nf2.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        SpayBnplGraphCompositeView spayBnplGraphCompositeView = ((u00) iobyxmoadgVar).f58738btonecajqb;
        spayBnplGraphCompositeView.a(spayBnplGraphCompositeView.f107873c.size(), i13);
    }
}
