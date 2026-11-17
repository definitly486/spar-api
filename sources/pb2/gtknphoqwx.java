package pb2;

import gg.kcexrzcfyt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
final class gtknphoqwx extends pb2.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f76318ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb2.iobyxmoadg f76319zoijcleaow;

    public static final class iobyxmoadg implements btonecajqb, ob2.gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ btonecajqb f76321ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f76322wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AtomicBoolean f76320iobyxmoadg = new AtomicBoolean();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AtomicReference f76323zoijcleaow = new AtomicReference(null);

        iobyxmoadg(btonecajqb btonecajqbVar, gtknphoqwx gtknphoqwxVar) {
            this.f76321ppxfxbqfkf = btonecajqbVar;
            this.f76322wkgbmnqykc = gtknphoqwxVar;
        }

        @Override // ob2.gxszxtbevo
        public void iobyxmoadg() {
            ob2.gxszxtbevo gxszxtbevoVar;
            if (!this.f76320iobyxmoadg.compareAndSet(false, true) || (gxszxtbevoVar = (ob2.gxszxtbevo) this.f76323zoijcleaow.getAndSet(null)) == null) {
                return;
            }
            gxszxtbevoVar.iobyxmoadg();
        }

        @Override // pb2.btonecajqb
        public void onSuccess(Object obj) {
            if (this.f76320iobyxmoadg.compareAndSet(false, true)) {
                this.f76321ppxfxbqfkf.onSuccess(obj);
            }
        }

        @Override // pb2.btonecajqb
        public void ppxfxbqfkf(Throwable e13) {
            Object objWkgbmnqykc;
            zdlpuopuiu.btonecajqb(e13, "e");
            if (this.f76320iobyxmoadg.compareAndSet(false, true)) {
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(this.f76322wkgbmnqykc.f76318ppxfxbqfkf.invoke(e13));
                } catch (Throwable th2) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                }
                btonecajqb btonecajqbVar = this.f76321ppxfxbqfkf;
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    btonecajqbVar.onSuccess(objWkgbmnqykc);
                }
                btonecajqb btonecajqbVar2 = this.f76321ppxfxbqfkf;
                Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    btonecajqbVar2.ppxfxbqfkf(thDxjokdxxww);
                }
            }
        }

        @Override // pb2.btonecajqb
        public void wkgbmnqykc(ob2.gxszxtbevo d13) {
            zdlpuopuiu.btonecajqb(d13, "d");
            this.f76321ppxfxbqfkf.wkgbmnqykc(d13);
        }

        @Override // ob2.gxszxtbevo
        public boolean zoijcleaow() {
            return this.f76320iobyxmoadg.get();
        }
    }

    public gtknphoqwx(pb2.iobyxmoadg upstream, tg.draadjrbmk mapper) {
        zdlpuopuiu.btonecajqb(upstream, "upstream");
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        this.f76319zoijcleaow = upstream;
        this.f76318ppxfxbqfkf = mapper;
    }

    @Override // pb2.iobyxmoadg
    public void iobyxmoadg(btonecajqb downstream) {
        zdlpuopuiu.btonecajqb(downstream, "downstream");
        this.f76319zoijcleaow.iobyxmoadg(new iobyxmoadg(downstream, this));
    }
}
