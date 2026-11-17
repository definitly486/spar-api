package pb2;

import gg.kcexrzcfyt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
final class lqeggnwhkg extends pb2.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f76328ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb2.iobyxmoadg f76329zoijcleaow;

    private final class iobyxmoadg implements ob2.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AtomicBoolean f76330iobyxmoadg = new AtomicBoolean();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AtomicReference f76332zoijcleaow = new AtomicReference(null);

        /* JADX INFO: renamed from: pb2.lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1687iobyxmoadg implements btonecajqb {

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ btonecajqb f76334zoijcleaow;

            C1687iobyxmoadg(btonecajqb btonecajqbVar) {
                this.f76334zoijcleaow = btonecajqbVar;
            }

            @Override // pb2.btonecajqb
            public void onSuccess(Object obj) {
                if (iobyxmoadg.this.f76330iobyxmoadg.compareAndSet(false, true)) {
                    this.f76334zoijcleaow.onSuccess(obj);
                }
            }

            @Override // pb2.btonecajqb
            public void ppxfxbqfkf(Throwable e13) {
                zdlpuopuiu.btonecajqb(e13, "e");
                if (iobyxmoadg.this.f76330iobyxmoadg.compareAndSet(false, true)) {
                    this.f76334zoijcleaow.ppxfxbqfkf(e13);
                }
            }

            @Override // pb2.btonecajqb
            public void wkgbmnqykc(ob2.gxszxtbevo d13) {
                ob2.gxszxtbevo gxszxtbevoVar;
                zdlpuopuiu.btonecajqb(d13, "d");
                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(iobyxmoadg.this.f76332zoijcleaow, null, d13);
                if (!iobyxmoadg.this.zoijcleaow() || (gxszxtbevoVar = (ob2.gxszxtbevo) iobyxmoadg.this.f76332zoijcleaow.getAndSet(null)) == null) {
                    return;
                }
                gxszxtbevoVar.iobyxmoadg();
            }
        }

        public iobyxmoadg() {
        }

        public final void eablkybsjg(btonecajqb downstream, Object obj) {
            Object objWkgbmnqykc;
            zdlpuopuiu.btonecajqb(downstream, "downstream");
            C1687iobyxmoadg c1687iobyxmoadg = new C1687iobyxmoadg(downstream);
            if (zoijcleaow()) {
                return;
            }
            lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((pb2.iobyxmoadg) lqeggnwhkgVar.f76328ppxfxbqfkf.invoke(obj));
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                pb2.iobyxmoadg iobyxmoadgVar3 = (pb2.iobyxmoadg) objWkgbmnqykc;
                if (!zoijcleaow()) {
                    iobyxmoadgVar3.iobyxmoadg(c1687iobyxmoadg);
                }
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww == null || zoijcleaow()) {
                return;
            }
            c1687iobyxmoadg.ppxfxbqfkf(thDxjokdxxww);
        }

        @Override // ob2.gxszxtbevo
        public void iobyxmoadg() {
            ob2.gxszxtbevo gxszxtbevoVar;
            if (!this.f76330iobyxmoadg.compareAndSet(false, true) || (gxszxtbevoVar = (ob2.gxszxtbevo) this.f76332zoijcleaow.getAndSet(null)) == null) {
                return;
            }
            gxszxtbevoVar.iobyxmoadg();
        }

        @Override // ob2.gxszxtbevo
        public boolean zoijcleaow() {
            return this.f76330iobyxmoadg.get();
        }
    }

    public static final class zoijcleaow implements btonecajqb, ob2.gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f76335eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ btonecajqb f76338wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AtomicBoolean f76336iobyxmoadg = new AtomicBoolean();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AtomicReference f76339zoijcleaow = new AtomicReference(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AtomicReference f76337ppxfxbqfkf = new AtomicReference(null);

        zoijcleaow(btonecajqb btonecajqbVar, lqeggnwhkg lqeggnwhkgVar) {
            this.f76338wkgbmnqykc = btonecajqbVar;
            this.f76335eablkybsjg = lqeggnwhkgVar;
        }

        @Override // ob2.gxszxtbevo
        public void iobyxmoadg() {
            if (this.f76336iobyxmoadg.compareAndSet(false, true)) {
                ob2.gxszxtbevo gxszxtbevoVar = (ob2.gxszxtbevo) this.f76339zoijcleaow.getAndSet(null);
                if (gxszxtbevoVar != null) {
                    gxszxtbevoVar.iobyxmoadg();
                }
                ob2.gxszxtbevo gxszxtbevoVar2 = (ob2.gxszxtbevo) this.f76337ppxfxbqfkf.getAndSet(null);
                if (gxszxtbevoVar2 != null) {
                    gxszxtbevoVar2.iobyxmoadg();
                }
            }
        }

        @Override // pb2.btonecajqb
        public void onSuccess(Object obj) {
            if (this.f76336iobyxmoadg.compareAndSet(false, true)) {
                iobyxmoadg iobyxmoadgVar = this.f76335eablkybsjg.new iobyxmoadg();
                this.f76337ppxfxbqfkf.set(iobyxmoadgVar);
                iobyxmoadgVar.eablkybsjg(this.f76338wkgbmnqykc, obj);
            }
        }

        @Override // pb2.btonecajqb
        public void ppxfxbqfkf(Throwable e13) {
            zdlpuopuiu.btonecajqb(e13, "e");
            if (this.f76336iobyxmoadg.compareAndSet(false, true)) {
                this.f76338wkgbmnqykc.ppxfxbqfkf(e13);
            }
        }

        @Override // pb2.btonecajqb
        public void wkgbmnqykc(ob2.gxszxtbevo d13) {
            zdlpuopuiu.btonecajqb(d13, "d");
            mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f76339zoijcleaow, null, d13);
            if (this.f76336iobyxmoadg.get()) {
                ob2.gxszxtbevo gxszxtbevoVar = (ob2.gxszxtbevo) this.f76339zoijcleaow.getAndSet(null);
                if (gxszxtbevoVar != null) {
                    gxszxtbevoVar.iobyxmoadg();
                }
                ob2.gxszxtbevo gxszxtbevoVar2 = (ob2.gxszxtbevo) this.f76337ppxfxbqfkf.getAndSet(null);
                if (gxszxtbevoVar2 != null) {
                    gxszxtbevoVar2.iobyxmoadg();
                }
            }
            this.f76338wkgbmnqykc.wkgbmnqykc(this);
        }

        @Override // ob2.gxszxtbevo
        public boolean zoijcleaow() {
            return this.f76336iobyxmoadg.get();
        }
    }

    public lqeggnwhkg(pb2.iobyxmoadg upstream, tg.draadjrbmk mapper) {
        zdlpuopuiu.btonecajqb(upstream, "upstream");
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        this.f76329zoijcleaow = upstream;
        this.f76328ppxfxbqfkf = mapper;
    }

    @Override // pb2.iobyxmoadg
    public void iobyxmoadg(btonecajqb downstream) {
        zdlpuopuiu.btonecajqb(downstream, "downstream");
        this.f76329zoijcleaow.iobyxmoadg(new zoijcleaow(downstream, this));
    }
}
