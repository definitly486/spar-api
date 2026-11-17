package kk;

import kotlin.NoWhenBranchMatchedException;
import npi.spay.C7;
import npi.spay.Ln;
import npi.spay.N6;
import npi.spay.S;
import npi.spay.T7;
import npi.spay.Z6;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ph0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ C7 f58086zdlpuopuiu;

    public ph0(C7 c13) {
        this.f58086zdlpuopuiu = c13;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        gg.vdvldrhtss vdvldrhtssVar;
        t tVar = (t) obj;
        C7 c13 = this.f58086zdlpuopuiu;
        int i13 = C7.f70539iwizpuwonk;
        a6.iobyxmoadg iobyxmoadgVar = c13.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        int iOrdinal = tVar.ordinal();
        if (iOrdinal == 0) {
            vdvldrhtssVar = new gg.vdvldrhtss(new npi.spay.m7(), "FraudMonOtpReviewFragment");
        } else if (iOrdinal == 1) {
            vdvldrhtssVar = new gg.vdvldrhtss(new T7(), "FraudMonReviewHintFragment");
        } else if (iOrdinal == 2) {
            vdvldrhtssVar = new gg.vdvldrhtss(new Z6(), "FraudMonDenyFragment");
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            vdvldrhtssVar = new gg.vdvldrhtss(new N6(), "FraudMonDenyBlockFragment");
        }
        this.f58086zdlpuopuiu.getParentFragmentManager().kcexrzcfyt().oxmwwwfdhm(R.id.spay_root_fc, (S) vdvldrhtssVar.iobyxmoadg(), (String) vdvldrhtssVar.wkgbmnqykc()).dxjokdxxww();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
