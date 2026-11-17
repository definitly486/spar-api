package w9;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import o9.gtknphoqwx;
import q9.rgvfuqvkyq;
import q9.yggfygwlhe;
import r9.wflxmlrfwp;
import x9.cqumvgiudr;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements eablkybsjg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Logger f119030gxszxtbevo = Logger.getLogger(yggfygwlhe.class.getName());

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final z9.iobyxmoadg f119031eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cqumvgiudr f119032iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final r9.eablkybsjg f119033ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final y9.wkgbmnqykc f119034wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f119035zoijcleaow;

    public ppxfxbqfkf(Executor executor, r9.eablkybsjg eablkybsjgVar, cqumvgiudr cqumvgiudrVar, y9.wkgbmnqykc wkgbmnqykcVar, z9.iobyxmoadg iobyxmoadgVar) {
        this.f119035zoijcleaow = executor;
        this.f119033ppxfxbqfkf = eablkybsjgVar;
        this.f119032iobyxmoadg = cqumvgiudrVar;
        this.f119034wkgbmnqykc = wkgbmnqykcVar;
        this.f119031eablkybsjg = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eablkybsjg(final rgvfuqvkyq rgvfuqvkyqVar, gtknphoqwx gtknphoqwxVar, q9.dxjokdxxww dxjokdxxwwVar) {
        try {
            wflxmlrfwp wflxmlrfwpVar = this.f119033ppxfxbqfkf.get(rgvfuqvkyqVar.zoijcleaow());
            if (wflxmlrfwpVar == null) {
                String str = String.format("Transport backend '%s' is not registered", rgvfuqvkyqVar.zoijcleaow());
                f119030gxszxtbevo.warning(str);
                gtknphoqwxVar.iobyxmoadg(new IllegalArgumentException(str));
            } else {
                final q9.dxjokdxxww dxjokdxxwwVarIobyxmoadg = wflxmlrfwpVar.iobyxmoadg(dxjokdxxwwVar);
                this.f119031eablkybsjg.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: w9.zoijcleaow
                    @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
                    public final Object execute() {
                        return this.f119041iobyxmoadg.wkgbmnqykc(rgvfuqvkyqVar, dxjokdxxwwVarIobyxmoadg);
                    }
                });
                gtknphoqwxVar.iobyxmoadg(null);
            }
        } catch (Exception e13) {
            f119030gxszxtbevo.warning("Error scheduling event " + e13.getMessage());
            gtknphoqwxVar.iobyxmoadg(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object wkgbmnqykc(rgvfuqvkyq rgvfuqvkyqVar, q9.dxjokdxxww dxjokdxxwwVar) {
        this.f119034wkgbmnqykc.bfopjjpdmp(rgvfuqvkyqVar, dxjokdxxwwVar);
        this.f119032iobyxmoadg.iobyxmoadg(rgvfuqvkyqVar, 1);
        return null;
    }

    @Override // w9.eablkybsjg
    public void iobyxmoadg(final rgvfuqvkyq rgvfuqvkyqVar, final q9.dxjokdxxww dxjokdxxwwVar, final gtknphoqwx gtknphoqwxVar) {
        this.f119035zoijcleaow.execute(new Runnable() { // from class: w9.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                this.f119028zdlpuopuiu.eablkybsjg(rgvfuqvkyqVar, gtknphoqwxVar, dxjokdxxwwVar);
            }
        });
    }
}
