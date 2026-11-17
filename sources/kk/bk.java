package kk;

import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class bk extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.ke f56021zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(npi.spay.ke keVar) {
        super(1);
        this.f56021zdlpuopuiu = keVar;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        String code = (String) obj;
        if (code != null) {
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(code, "code");
            npi.spay.ke keVar = this.f56021zdlpuopuiu;
            int i13 = npi.spay.ke.f70577esjtqupxsv;
            a6.iobyxmoadg iobyxmoadgVar = keVar.f70570yggfygwlhe;
            if (iobyxmoadgVar == null) {
                throw Ln.f70555zdlpuopuiu;
            }
            ((nz) iobyxmoadgVar).f57867wkgbmnqykc.setOTP(code);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
