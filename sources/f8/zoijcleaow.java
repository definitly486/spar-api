package f8;

import a8.eablkybsjg;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import z7.gxszxtbevo;
import z7.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gxszxtbevo f33105eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final z7.ppxfxbqfkf f33106gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final a8.iobyxmoadg f33107iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gxszxtbevo f33108lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f33109nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.ppxfxbqfkf f33110ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f33111wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.zoijcleaow f33112zoijcleaow;

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, zoijcleaow.class, "onIntent", "onIntent(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Object p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((zoijcleaow) this.receiver).wflxmlrfwp(p13);
        }
    }

    public static final class ppxfxbqfkf implements a8.zoijcleaow.iobyxmoadg {
        ppxfxbqfkf() {
        }

        @Override // a8.zoijcleaow.iobyxmoadg
        public Object getState() {
            return zoijcleaow.this.f33106gxszxtbevo.getValue();
        }

        @Override // a8.zoijcleaow.iobyxmoadg
        public void iobyxmoadg(Object message) {
            zdlpuopuiu.btonecajqb(message, "message");
            b8.ppxfxbqfkf.iobyxmoadg();
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            if (zoijcleaowVar.zoijcleaow()) {
                return;
            }
            zoijcleaowVar.f33106gxszxtbevo.iobyxmoadg(zoijcleaowVar.f33110ppxfxbqfkf.iobyxmoadg(zoijcleaowVar.f33106gxszxtbevo.getValue(), message));
        }

        @Override // a8.zoijcleaow.iobyxmoadg
        public void zoijcleaow(Object label) {
            zdlpuopuiu.btonecajqb(label, "label");
            b8.ppxfxbqfkf.iobyxmoadg();
            zoijcleaow.this.f33108lqeggnwhkg.iobyxmoadg(label);
        }
    }

    /* JADX INFO: renamed from: f8.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C0724zoijcleaow extends vdvldrhtss implements draadjrbmk {
        C0724zoijcleaow(Object obj) {
            super(1, obj, zoijcleaow.class, "onAction", "onAction(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Object p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((zoijcleaow) this.receiver).draadjrbmk(p13);
        }
    }

    public zoijcleaow(Object initialState, a8.iobyxmoadg iobyxmoadgVar, a8.zoijcleaow executor, a8.ppxfxbqfkf reducer) {
        zdlpuopuiu.btonecajqb(initialState, "initialState");
        zdlpuopuiu.btonecajqb(executor, "executor");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        this.f33107iobyxmoadg = iobyxmoadgVar;
        this.f33112zoijcleaow = executor;
        this.f33110ppxfxbqfkf = reducer;
        this.f33111wkgbmnqykc = nufgyqmvbu.iobyxmoadg();
        this.f33105eablkybsjg = nufgyqmvbu.iobyxmoadg();
        this.f33106gxszxtbevo = z7.eablkybsjg.iobyxmoadg(initialState);
        this.f33108lqeggnwhkg = nufgyqmvbu.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void draadjrbmk(Object obj) {
        if (zoijcleaow()) {
            return;
        }
        this.f33112zoijcleaow.pmvmpeiblj(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(zoijcleaow zoijcleaowVar, Object action) {
        zdlpuopuiu.btonecajqb(action, "action");
        b8.ppxfxbqfkf.iobyxmoadg();
        zoijcleaowVar.f33105eablkybsjg.iobyxmoadg(action);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wflxmlrfwp(Object obj) {
        if (zoijcleaow()) {
            return;
        }
        this.f33112zoijcleaow.zynmafqrjb(obj);
    }

    @Override // a8.eablkybsjg
    public void accept(Object intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        b8.ppxfxbqfkf.iobyxmoadg();
        this.f33111wkgbmnqykc.iobyxmoadg(intent);
    }

    @Override // a8.eablkybsjg
    public Object getState() {
        return this.f33106gxszxtbevo.getValue();
    }

    @Override // a8.eablkybsjg
    public void init() {
        b8.ppxfxbqfkf.iobyxmoadg();
        if (this.f33109nufgyqmvbu) {
            return;
        }
        this.f33109nufgyqmvbu = true;
        this.f33111wkgbmnqykc.zoijcleaow(y7.eablkybsjg.zoijcleaow(null, new iobyxmoadg(this), 1, null));
        this.f33105eablkybsjg.zoijcleaow(y7.eablkybsjg.zoijcleaow(null, new C0724zoijcleaow(this), 1, null));
        this.f33112zoijcleaow.ntlheqmsrt(new ppxfxbqfkf());
        a8.iobyxmoadg iobyxmoadgVar = this.f33107iobyxmoadg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.zoijcleaow(new draadjrbmk() { // from class: f8.iobyxmoadg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return zoijcleaow.gtknphoqwx(this.f33104zdlpuopuiu, obj);
                }
            });
        }
        a8.iobyxmoadg iobyxmoadgVar2 = this.f33107iobyxmoadg;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.invoke();
        }
    }

    @Override // a8.eablkybsjg
    public void iobyxmoadg() {
        b8.ppxfxbqfkf.iobyxmoadg();
        if (zoijcleaow()) {
            return;
        }
        a8.iobyxmoadg iobyxmoadgVar = this.f33107iobyxmoadg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg();
        }
        this.f33112zoijcleaow.iobyxmoadg();
        this.f33111wkgbmnqykc.onComplete();
        this.f33106gxszxtbevo.onComplete();
        this.f33108lqeggnwhkg.onComplete();
    }

    @Override // a8.eablkybsjg
    public y7.iobyxmoadg ppxfxbqfkf(y7.ppxfxbqfkf observer) {
        zdlpuopuiu.btonecajqb(observer, "observer");
        return this.f33106gxszxtbevo.zoijcleaow(observer);
    }

    @Override // a8.eablkybsjg
    public y7.iobyxmoadg wkgbmnqykc(y7.ppxfxbqfkf observer) {
        zdlpuopuiu.btonecajqb(observer, "observer");
        return this.f33108lqeggnwhkg.zoijcleaow(observer);
    }

    @Override // a8.eablkybsjg
    public boolean zoijcleaow() {
        return !this.f33106gxszxtbevo.isActive();
    }
}
