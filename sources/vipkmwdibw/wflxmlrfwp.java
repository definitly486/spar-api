package vipkmwdibw;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.i1;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp implements i1 {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private long f117335cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f117336esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f117337iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private kcexrzcfyt f117338jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f117339yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ezmngbhpjk f117340zdlpuopuiu;

    public wflxmlrfwp(ezmngbhpjk ezmngbhpjkVar, Object obj, kcexrzcfyt kcexrzcfytVar, long j13, long j14, boolean z13) {
        kcexrzcfyt kcexrzcfytVarEablkybsjg;
        this.f117340zdlpuopuiu = ezmngbhpjkVar;
        this.f117339yggfygwlhe = c1.ppxfxbqfkf(obj, null, 2, null);
        this.f117338jyumaefscl = (kcexrzcfytVar == null || (kcexrzcfytVarEablkybsjg = zdlpuopuiu.eablkybsjg(kcexrzcfytVar)) == null) ? agtfadlqog.dxjokdxxww(ezmngbhpjkVar, obj) : kcexrzcfytVarEablkybsjg;
        this.f117337iwizpuwonk = j13;
        this.f117335cqumvgiudr = j14;
        this.f117336esjtqupxsv = z13;
    }

    public final Object agtfadlqog() {
        return this.f117340zdlpuopuiu.zoijcleaow().invoke(this.f117338jyumaefscl);
    }

    public final void cqumvgiudr(kcexrzcfyt kcexrzcfytVar) {
        this.f117338jyumaefscl = kcexrzcfytVar;
    }

    public final ezmngbhpjk draadjrbmk() {
        return this.f117340zdlpuopuiu;
    }

    @Override // androidx.compose.runtime.i1
    public Object getValue() {
        return this.f117339yggfygwlhe.getValue();
    }

    public final long iobyxmoadg() {
        return this.f117335cqumvgiudr;
    }

    public void jyumaefscl(Object obj) {
        this.f117339yggfygwlhe.setValue(obj);
    }

    public final void kcexrzcfyt(long j13) {
        this.f117337iwizpuwonk = j13;
    }

    public final kcexrzcfyt ojitshcjhn() {
        return this.f117338jyumaefscl;
    }

    public final boolean rgvfuqvkyq() {
        return this.f117336esjtqupxsv;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + agtfadlqog() + ", isRunning=" + this.f117336esjtqupxsv + ", lastFrameTimeNanos=" + this.f117337iwizpuwonk + ", finishedTimeNanos=" + this.f117335cqumvgiudr + ')';
    }

    public final void vdvldrhtss(long j13) {
        this.f117335cqumvgiudr = j13;
    }

    public final long wkgbmnqykc() {
        return this.f117337iwizpuwonk;
    }

    public final void zdlpuopuiu(boolean z13) {
        this.f117336esjtqupxsv = z13;
    }

    public /* synthetic */ wflxmlrfwp(ezmngbhpjk ezmngbhpjkVar, Object obj, kcexrzcfyt kcexrzcfytVar, long j13, long j14, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(ezmngbhpjkVar, obj, (i13 & 4) != 0 ? null : kcexrzcfytVar, (i13 & 8) != 0 ? Long.MIN_VALUE : j13, (i13 & 16) != 0 ? Long.MIN_VALUE : j14, (i13 & 32) != 0 ? false : z13);
    }
}
