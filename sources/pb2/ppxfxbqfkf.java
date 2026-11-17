package pb2;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
final class ppxfxbqfkf extends pb2.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.iobyxmoadg f76344ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb2.iobyxmoadg f76345zoijcleaow;

    public static final class iobyxmoadg implements btonecajqb, ob2.gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ btonecajqb f76347ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f76348wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AtomicBoolean f76346iobyxmoadg = new AtomicBoolean();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AtomicReference f76349zoijcleaow = new AtomicReference(null);

        iobyxmoadg(btonecajqb btonecajqbVar, ppxfxbqfkf ppxfxbqfkfVar) {
            this.f76347ppxfxbqfkf = btonecajqbVar;
            this.f76348wkgbmnqykc = ppxfxbqfkfVar;
        }

        @Override // ob2.gxszxtbevo
        public void iobyxmoadg() {
            Object objWkgbmnqykc;
            if (this.f76346iobyxmoadg.compareAndSet(false, true)) {
                ppxfxbqfkf ppxfxbqfkfVar = this.f76348wkgbmnqykc;
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    ppxfxbqfkfVar.f76344ppxfxbqfkf.invoke();
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                } catch (Throwable th2) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                }
                btonecajqb btonecajqbVar = this.f76347ppxfxbqfkf;
                Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    ob2.gxszxtbevo gxszxtbevoVar = (ob2.gxszxtbevo) this.f76349zoijcleaow.getAndSet(null);
                    if (gxszxtbevoVar != null) {
                        gxszxtbevoVar.iobyxmoadg();
                    }
                    btonecajqbVar.ppxfxbqfkf(thDxjokdxxww);
                }
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    ob2.gxszxtbevo gxszxtbevoVar2 = (ob2.gxszxtbevo) this.f76349zoijcleaow.getAndSet(null);
                    if (gxszxtbevoVar2 != null) {
                        gxszxtbevoVar2.iobyxmoadg();
                    }
                }
            }
        }

        @Override // pb2.btonecajqb
        public void onSuccess(Object obj) {
            if (this.f76346iobyxmoadg.compareAndSet(false, true)) {
                this.f76347ppxfxbqfkf.onSuccess(obj);
            }
        }

        @Override // pb2.btonecajqb
        public void ppxfxbqfkf(Throwable e13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(e13, "e");
            if (this.f76346iobyxmoadg.compareAndSet(false, true)) {
                this.f76347ppxfxbqfkf.ppxfxbqfkf(e13);
            }
        }

        @Override // pb2.btonecajqb
        public void wkgbmnqykc(ob2.gxszxtbevo d13) {
            ob2.gxszxtbevo gxszxtbevoVar;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(d13, "d");
            mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f76349zoijcleaow, null, d13);
            if (zoijcleaow() && (gxszxtbevoVar = (ob2.gxszxtbevo) this.f76349zoijcleaow.getAndSet(null)) != null) {
                gxszxtbevoVar.iobyxmoadg();
            }
            this.f76347ppxfxbqfkf.wkgbmnqykc(this);
        }

        @Override // ob2.gxszxtbevo
        public boolean zoijcleaow() {
            return this.f76346iobyxmoadg.get();
        }
    }

    public ppxfxbqfkf(pb2.iobyxmoadg upstream, tg.iobyxmoadg onDispose) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upstream, "upstream");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDispose, "onDispose");
        this.f76345zoijcleaow = upstream;
        this.f76344ppxfxbqfkf = onDispose;
    }

    @Override // pb2.iobyxmoadg
    public void iobyxmoadg(btonecajqb downstream) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(downstream, "downstream");
        this.f76345zoijcleaow.iobyxmoadg(new iobyxmoadg(downstream, this));
    }
}
