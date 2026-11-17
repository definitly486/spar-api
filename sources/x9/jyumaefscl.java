package x9;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Executor f121772iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cqumvgiudr f121773ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final z9.iobyxmoadg f121774wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y9.wkgbmnqykc f121775zoijcleaow;

    jyumaefscl(Executor executor, y9.wkgbmnqykc wkgbmnqykcVar, cqumvgiudr cqumvgiudrVar, z9.iobyxmoadg iobyxmoadgVar) {
        this.f121772iobyxmoadg = executor;
        this.f121775zoijcleaow = wkgbmnqykcVar;
        this.f121773ppxfxbqfkf = cqumvgiudrVar;
        this.f121774wkgbmnqykc = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eablkybsjg() {
        this.f121774wkgbmnqykc.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.yggfygwlhe
            @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
            public final Object execute() {
                return this.f121818iobyxmoadg.wkgbmnqykc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object wkgbmnqykc() {
        Iterator it = this.f121775zoijcleaow.stevsuqkhv().iterator();
        while (it.hasNext()) {
            this.f121773ppxfxbqfkf.iobyxmoadg((q9.rgvfuqvkyq) it.next(), 1);
        }
        return null;
    }

    public void ppxfxbqfkf() {
        this.f121772iobyxmoadg.execute(new Runnable() { // from class: x9.zdlpuopuiu
            @Override // java.lang.Runnable
            public final void run() {
                this.f121819zdlpuopuiu.eablkybsjg();
            }
        });
    }
}
