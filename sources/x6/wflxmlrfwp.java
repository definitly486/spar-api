package x6;

import bl.esjtqupxsv;
import bl.zdlpuopuiu;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp extends agtfadlqog {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final agtfadlqog.iobyxmoadg f121239cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f121240esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Closeable f121241iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f121242jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private bl.eablkybsjg f121243lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final bl.dxjokdxxww f121244yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final esjtqupxsv f121245zdlpuopuiu;

    public wflxmlrfwp(esjtqupxsv esjtqupxsvVar, bl.dxjokdxxww dxjokdxxwwVar, String str, Closeable closeable, agtfadlqog.iobyxmoadg iobyxmoadgVar) {
        super(null);
        this.f121245zdlpuopuiu = esjtqupxsvVar;
        this.f121244yggfygwlhe = dxjokdxxwwVar;
        this.f121242jyumaefscl = str;
        this.f121241iwizpuwonk = closeable;
        this.f121239cqumvgiudr = iobyxmoadgVar;
    }

    private final void lqeggnwhkg() {
        if (this.f121240esjtqupxsv) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f121240esjtqupxsv = true;
            bl.eablkybsjg eablkybsjgVar = this.f121243lereixgezr;
            if (eablkybsjgVar != null) {
                i7.gtknphoqwx.wkgbmnqykc(eablkybsjgVar);
            }
            Closeable closeable = this.f121241iwizpuwonk;
            if (closeable != null) {
                i7.gtknphoqwx.wkgbmnqykc(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public bl.dxjokdxxww dxjokdxxww() {
        return this.f121244yggfygwlhe;
    }

    @Override // x6.agtfadlqog
    public agtfadlqog.iobyxmoadg iobyxmoadg() {
        return this.f121239cqumvgiudr;
    }

    public final String nufgyqmvbu() {
        return this.f121242jyumaefscl;
    }

    @Override // x6.agtfadlqog
    public synchronized bl.eablkybsjg wkgbmnqykc() {
        lqeggnwhkg();
        bl.eablkybsjg eablkybsjgVar = this.f121243lereixgezr;
        if (eablkybsjgVar != null) {
            return eablkybsjgVar;
        }
        bl.eablkybsjg eablkybsjgVarPpxfxbqfkf = zdlpuopuiu.ppxfxbqfkf(dxjokdxxww().vdvldrhtss(this.f121245zdlpuopuiu));
        this.f121243lereixgezr = eablkybsjgVarPpxfxbqfkf;
        return eablkybsjgVarPpxfxbqfkf;
    }
}
