package androidx.camera.core;

import istkbnxepw.cllcsxoeiz;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class gtknphoqwx extends dxjokdxxww {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private zoijcleaow f3687iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    agtfadlqog f3688jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f3689yggfygwlhe = new Object();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final Executor f3690zdlpuopuiu;

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f3691iobyxmoadg;

        iobyxmoadg(zoijcleaow zoijcleaowVar) {
            this.f3691iobyxmoadg = zoijcleaowVar;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            this.f3691iobyxmoadg.close();
        }
    }

    static class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final WeakReference f3693iwizpuwonk;

        zoijcleaow(agtfadlqog agtfadlqogVar, gtknphoqwx gtknphoqwxVar) {
            super(agtfadlqogVar);
            this.f3693iwizpuwonk = new WeakReference(gtknphoqwxVar);
            iobyxmoadg(new eablkybsjg.iobyxmoadg() { // from class: androidx.camera.core.draadjrbmk
                @Override // androidx.camera.core.eablkybsjg.iobyxmoadg
                public final void zoijcleaow(agtfadlqog agtfadlqogVar2) {
                    this.f3664iobyxmoadg.btonecajqb(agtfadlqogVar2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void btonecajqb(agtfadlqog agtfadlqogVar) {
            final gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f3693iwizpuwonk.get();
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.f3690zdlpuopuiu.execute(new Runnable() { // from class: androidx.camera.core.wflxmlrfwp
                    @Override // java.lang.Runnable
                    public final void run() {
                        gtknphoqwxVar.lereixgezr();
                    }
                });
            }
        }
    }

    gtknphoqwx(Executor executor) {
        this.f3690zdlpuopuiu = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void lereixgezr() {
        synchronized (this.f3689yggfygwlhe) {
            try {
                this.f3687iwizpuwonk = null;
                agtfadlqog agtfadlqogVar = this.f3688jyumaefscl;
                if (agtfadlqogVar != null) {
                    this.f3688jyumaefscl = null;
                    ojitshcjhn(agtfadlqogVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.dxjokdxxww
    void lqeggnwhkg() {
        synchronized (this.f3689yggfygwlhe) {
            try {
                agtfadlqog agtfadlqogVar = this.f3688jyumaefscl;
                if (agtfadlqogVar != null) {
                    agtfadlqogVar.close();
                    this.f3688jyumaefscl = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.dxjokdxxww
    void ojitshcjhn(agtfadlqog agtfadlqogVar) {
        synchronized (this.f3689yggfygwlhe) {
            try {
                if (!this.f3673kcexrzcfyt) {
                    agtfadlqogVar.close();
                    return;
                }
                if (this.f3687iwizpuwonk == null) {
                    zoijcleaow zoijcleaowVar = new zoijcleaow(agtfadlqogVar, this);
                    this.f3687iwizpuwonk = zoijcleaowVar;
                    iozdgvuglv.gtknphoqwx.lqeggnwhkg(eablkybsjg(zoijcleaowVar), new iobyxmoadg(zoijcleaowVar), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
                } else {
                    if (agtfadlqogVar.K().getTimestamp() <= this.f3687iwizpuwonk.K().getTimestamp()) {
                        agtfadlqogVar.close();
                    } else {
                        agtfadlqog agtfadlqogVar2 = this.f3688jyumaefscl;
                        if (agtfadlqogVar2 != null) {
                            agtfadlqogVar2.close();
                        }
                        this.f3688jyumaefscl = agtfadlqogVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.dxjokdxxww
    agtfadlqog wkgbmnqykc(cllcsxoeiz cllcsxoeizVar) {
        return cllcsxoeizVar.ppxfxbqfkf();
    }
}
