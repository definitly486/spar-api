package x6;

import bl.esjtqupxsv;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class vdvldrhtss extends agtfadlqog {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private esjtqupxsv f121234cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private tg.iobyxmoadg f121235iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private bl.eablkybsjg f121236jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f121237yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final agtfadlqog.iobyxmoadg f121238zdlpuopuiu;

    public vdvldrhtss(bl.eablkybsjg eablkybsjgVar, tg.iobyxmoadg iobyxmoadgVar, agtfadlqog.iobyxmoadg iobyxmoadgVar2) {
        super(null);
        this.f121238zdlpuopuiu = iobyxmoadgVar2;
        this.f121236jyumaefscl = eablkybsjgVar;
        this.f121235iwizpuwonk = iobyxmoadgVar;
    }

    private final void lqeggnwhkg() {
        if (this.f121237yggfygwlhe) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f121237yggfygwlhe = true;
            bl.eablkybsjg eablkybsjgVar = this.f121236jyumaefscl;
            if (eablkybsjgVar != null) {
                i7.gtknphoqwx.wkgbmnqykc(eablkybsjgVar);
            }
            esjtqupxsv esjtqupxsvVar = this.f121234cqumvgiudr;
            if (esjtqupxsvVar != null) {
                nufgyqmvbu().nufgyqmvbu(esjtqupxsvVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // x6.agtfadlqog
    public agtfadlqog.iobyxmoadg iobyxmoadg() {
        return this.f121238zdlpuopuiu;
    }

    public bl.dxjokdxxww nufgyqmvbu() {
        return bl.dxjokdxxww.f16668zoijcleaow;
    }

    @Override // x6.agtfadlqog
    public synchronized bl.eablkybsjg wkgbmnqykc() {
        lqeggnwhkg();
        bl.eablkybsjg eablkybsjgVar = this.f121236jyumaefscl;
        if (eablkybsjgVar != null) {
            return eablkybsjgVar;
        }
        bl.dxjokdxxww dxjokdxxwwVarNufgyqmvbu = nufgyqmvbu();
        esjtqupxsv esjtqupxsvVar = this.f121234cqumvgiudr;
        zdlpuopuiu.lqeggnwhkg(esjtqupxsvVar);
        bl.eablkybsjg eablkybsjgVarPpxfxbqfkf = bl.zdlpuopuiu.ppxfxbqfkf(dxjokdxxwwVarNufgyqmvbu.vdvldrhtss(esjtqupxsvVar));
        this.f121236jyumaefscl = eablkybsjgVarPpxfxbqfkf;
        return eablkybsjgVarPpxfxbqfkf;
    }
}
