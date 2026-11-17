package f3;

import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class cllcsxoeiz implements ylkuphrtab {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private v2.cqumvgiudr f32657cqumvgiudr = v2.cqumvgiudr.f115309wkgbmnqykc;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f32658iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private long f32659jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f32660yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final y2.dxjokdxxww f32661zdlpuopuiu;

    public cllcsxoeiz(y2.dxjokdxxww dxjokdxxwwVar) {
        this.f32661zdlpuopuiu = dxjokdxxwwVar;
    }

    @Override // f3.ylkuphrtab
    public void eablkybsjg(v2.cqumvgiudr cqumvgiudrVar) {
        if (this.f32660yggfygwlhe) {
            iobyxmoadg(hcddaimhww());
        }
        this.f32657cqumvgiudr = cqumvgiudrVar;
    }

    @Override // f3.ylkuphrtab
    public long hcddaimhww() {
        long j13 = this.f32659jyumaefscl;
        if (!this.f32660yggfygwlhe) {
            return j13;
        }
        long jElapsedRealtime = this.f32661zdlpuopuiu.elapsedRealtime() - this.f32658iwizpuwonk;
        v2.cqumvgiudr cqumvgiudrVar = this.f32657cqumvgiudr;
        return j13 + (cqumvgiudrVar.f115310iobyxmoadg == 1.0f ? stevsuqkhv.ixidwrxhsl(jElapsedRealtime) : cqumvgiudrVar.iobyxmoadg(jElapsedRealtime));
    }

    public void iobyxmoadg(long j13) {
        this.f32659jyumaefscl = j13;
        if (this.f32660yggfygwlhe) {
            this.f32658iwizpuwonk = this.f32661zdlpuopuiu.elapsedRealtime();
        }
    }

    @Override // f3.ylkuphrtab
    public v2.cqumvgiudr lqeggnwhkg() {
        return this.f32657cqumvgiudr;
    }

    public void ppxfxbqfkf() {
        if (this.f32660yggfygwlhe) {
            iobyxmoadg(hcddaimhww());
            this.f32660yggfygwlhe = false;
        }
    }

    public void zoijcleaow() {
        if (this.f32660yggfygwlhe) {
            return;
        }
        this.f32658iwizpuwonk = this.f32661zdlpuopuiu.elapsedRealtime();
        this.f32660yggfygwlhe = true;
    }
}
