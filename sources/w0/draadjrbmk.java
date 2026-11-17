package w0;

/* JADX INFO: loaded from: classes.dex */
public interface draadjrbmk {
    float F();

    default long tzroggbefp(float f13) {
        x0.zoijcleaow zoijcleaowVar = x0.zoijcleaow.f120887iobyxmoadg;
        if (!zoijcleaowVar.gxszxtbevo(F())) {
            return iwizpuwonk.nufgyqmvbu(f13 / F());
        }
        x0.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaowVar.zoijcleaow(F());
        return iwizpuwonk.nufgyqmvbu(iobyxmoadgVarZoijcleaow != null ? iobyxmoadgVarZoijcleaow.iobyxmoadg(f13) : f13 / F());
    }

    default float vipkmwdibw(long j13) {
        if (!cqumvgiudr.lqeggnwhkg(jyumaefscl.lqeggnwhkg(j13), cqumvgiudr.f118246zoijcleaow.zoijcleaow())) {
            wflxmlrfwp.zoijcleaow("Only Sp can convert to Px");
        }
        x0.zoijcleaow zoijcleaowVar = x0.zoijcleaow.f120887iobyxmoadg;
        if (!zoijcleaowVar.gxszxtbevo(F())) {
            return nufgyqmvbu.lqeggnwhkg(jyumaefscl.nufgyqmvbu(j13) * F());
        }
        x0.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaowVar.zoijcleaow(F());
        float fNufgyqmvbu = jyumaefscl.nufgyqmvbu(j13);
        return nufgyqmvbu.lqeggnwhkg(iobyxmoadgVarZoijcleaow == null ? fNufgyqmvbu * F() : iobyxmoadgVarZoijcleaow.zoijcleaow(fNufgyqmvbu));
    }
}
