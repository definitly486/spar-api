package z;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract class mbcevpiqjq extends tzroggbefp implements x.pmvmpeiblj {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private x.istkbnxepw f127067cllcsxoeiz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private Map f127071jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final xrmfcynszj f127072pkzmftpjix;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private long f127069hcddaimhww = w0.agtfadlqog.f118237zoijcleaow.zoijcleaow();

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final x.esjtqupxsv f127070hkdspvbjdz = new x.esjtqupxsv(this);

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final androidx.collection.hcddaimhww f127068dsvhmnatus = androidx.collection.tzroggbefp.zoijcleaow();

    public mbcevpiqjq(xrmfcynszj xrmfcynszjVar) {
        this.f127072pkzmftpjix = xrmfcynszjVar;
    }

    private final void t0(long j13) {
        if (!w0.agtfadlqog.nufgyqmvbu(R(), j13)) {
            w0(j13);
            ntlheqmsrt ntlheqmsrtVarYggfygwlhe = S().okpsazkaxt().yggfygwlhe();
            if (ntlheqmsrtVarYggfygwlhe != null) {
                ntlheqmsrtVarYggfygwlhe.g0();
            }
            W(this.f127072pkzmftpjix);
        }
        if (c0()) {
            return;
        }
        t(E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(x.istkbnxepw istkbnxepwVar) {
        Map map;
        if (istkbnxepwVar != null) {
            f(w0.oxmwwwfdhm.ppxfxbqfkf((((long) istkbnxepwVar.getHeight()) & 4294967295L) | (((long) istkbnxepwVar.getWidth()) << 32)));
        } else {
            f(w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg());
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f127067cllcsxoeiz, istkbnxepwVar) && istkbnxepwVar != null && ((((map = this.f127071jpowsppfya) != null && !map.isEmpty()) || !istkbnxepwVar.agtfadlqog().isEmpty()) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(istkbnxepwVar.agtfadlqog(), this.f127071jpowsppfya))) {
            m0().agtfadlqog().wflxmlrfwp();
            Map linkedHashMap = this.f127071jpowsppfya;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f127071jpowsppfya = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(istkbnxepwVar.agtfadlqog());
        }
        this.f127067cllcsxoeiz = istkbnxepwVar;
    }

    @Override // z.tzroggbefp
    public boolean B() {
        return this.f127067cllcsxoeiz != null;
    }

    @Override // z.tzroggbefp
    public x.istkbnxepw E() {
        x.istkbnxepw istkbnxepwVar = this.f127067cllcsxoeiz;
        if (istkbnxepwVar != null) {
            return istkbnxepwVar;
        }
        w.iobyxmoadg.ppxfxbqfkf("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new KotlinNothingValueException();
    }

    @Override // w0.draadjrbmk
    public float F() {
        return this.f127072pkzmftpjix.F();
    }

    @Override // z.tzroggbefp
    public tzroggbefp H() {
        xrmfcynszj xrmfcynszjVarX0 = this.f127072pkzmftpjix.X0();
        if (xrmfcynszjVarX0 != null) {
            return xrmfcynszjVarX0.Q0();
        }
        return null;
    }

    @Override // z.tzroggbefp
    public long R() {
        return this.f127069hcddaimhww;
    }

    @Override // z.tzroggbefp, z.crxdokpmqz
    public pkzmftpjix S() {
        return this.f127072pkzmftpjix.S();
    }

    public abstract int czzsidtyhn(int i13);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.kcexrzcfyt
    public final void e(long j13, float f13, tg.draadjrbmk draadjrbmkVar) {
        t0(j13);
        if (d0()) {
            return;
        }
        s0();
    }

    @Override // z.tzroggbefp
    public void g0() {
        e(R(), 0.0f, null);
    }

    @Override // w0.wkgbmnqykc
    public float getDensity() {
        return this.f127072pkzmftpjix.getDensity();
    }

    @Override // x.wflxmlrfwp
    public w0.zdlpuopuiu getLayoutDirection() {
        return this.f127072pkzmftpjix.getLayoutDirection();
    }

    @Override // x.cdpycssgdh, x.draadjrbmk
    public Object lqeggnwhkg() {
        return this.f127072pkzmftpjix.lqeggnwhkg();
    }

    public zoijcleaow m0() {
        zoijcleaow zoijcleaowVarOjitshcjhn = this.f127072pkzmftpjix.S().okpsazkaxt().ojitshcjhn();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVarOjitshcjhn);
        return zoijcleaowVarOjitshcjhn;
    }

    public final int n0(x.iobyxmoadg iobyxmoadgVar) {
        return this.f127068dsvhmnatus.eablkybsjg(iobyxmoadgVar, Integer.MIN_VALUE);
    }

    protected final androidx.collection.hcddaimhww o0() {
        return this.f127068dsvhmnatus;
    }

    public final long p0() {
        return rhgxfdycjh();
    }

    @Override // z.tzroggbefp
    public x.rgvfuqvkyq pmvmpeiblj() {
        return this.f127070hkdspvbjdz;
    }

    public final xrmfcynszj q0() {
        return this.f127072pkzmftpjix;
    }

    public final x.esjtqupxsv r0() {
        return this.f127070hkdspvbjdz;
    }

    protected void s0() {
        E().ojitshcjhn();
    }

    public final void u0(long j13) {
        t0(w0.agtfadlqog.wflxmlrfwp(j13, wizcaqwiak()));
    }

    public final long v0(mbcevpiqjq mbcevpiqjqVar, boolean z13) {
        long jZoijcleaow = w0.agtfadlqog.f118237zoijcleaow.zoijcleaow();
        mbcevpiqjq mbcevpiqjqVarQ0 = this;
        while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mbcevpiqjqVarQ0, mbcevpiqjqVar)) {
            if (!mbcevpiqjqVarQ0.a0() || !z13) {
                jZoijcleaow = w0.agtfadlqog.wflxmlrfwp(jZoijcleaow, mbcevpiqjqVarQ0.R());
            }
            xrmfcynszj xrmfcynszjVarX0 = mbcevpiqjqVarQ0.f127072pkzmftpjix.X0();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(xrmfcynszjVarX0);
            mbcevpiqjqVarQ0 = xrmfcynszjVarX0.Q0();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(mbcevpiqjqVarQ0);
        }
        return jZoijcleaow;
    }

    public void w0(long j13) {
        this.f127069hcddaimhww = j13;
    }

    public abstract int wypolnanlu(int i13);

    public abstract int ydmasvzmpa(int i13);

    public abstract int yggfygwlhe(int i13);

    @Override // z.tzroggbefp
    public tzroggbefp z() {
        xrmfcynszj xrmfcynszjVarW0 = this.f127072pkzmftpjix.W0();
        if (xrmfcynszjVarW0 != null) {
            return xrmfcynszjVarW0.Q0();
        }
        return null;
    }

    @Override // z.tzroggbefp, x.wflxmlrfwp
    public boolean zeieaojujs() {
        return true;
    }
}
