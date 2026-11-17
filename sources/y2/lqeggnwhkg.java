package y2;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Object f123570eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f123571gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ojitshcjhn f123572iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f123573ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Object f123574wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f123575zoijcleaow;

    public interface iobyxmoadg {
        void iobyxmoadg(Object obj, Object obj2);
    }

    public lqeggnwhkg(Object obj, Looper looper, Looper looper2, dxjokdxxww dxjokdxxwwVar, iobyxmoadg iobyxmoadgVar) {
        this.f123572iobyxmoadg = dxjokdxxwwVar.iobyxmoadg(looper, null);
        this.f123575zoijcleaow = dxjokdxxwwVar.iobyxmoadg(looper2, null);
        this.f123574wkgbmnqykc = obj;
        this.f123570eablkybsjg = obj;
        this.f123573ppxfxbqfkf = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eablkybsjg(Object obj) {
        if (this.f123571gxszxtbevo == 0) {
            gtknphoqwx(obj);
        }
    }

    private void gtknphoqwx(Object obj) {
        Object obj2 = this.f123574wkgbmnqykc;
        this.f123574wkgbmnqykc = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.f123573ppxfxbqfkf.iobyxmoadg(obj2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gxszxtbevo(Object obj) {
        int i13 = this.f123571gxszxtbevo - 1;
        this.f123571gxszxtbevo = i13;
        if (i13 == 0) {
            gtknphoqwx(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lqeggnwhkg(xa.eablkybsjg eablkybsjgVar) {
        final Object objApply = eablkybsjgVar.apply(this.f123570eablkybsjg);
        this.f123570eablkybsjg = objApply;
        this.f123575zoijcleaow.lqeggnwhkg(new Runnable() { // from class: y2.gxszxtbevo
            @Override // java.lang.Runnable
            public final void run() {
                this.f123552zdlpuopuiu.gxszxtbevo(objApply);
            }
        });
    }

    public void btonecajqb(xa.eablkybsjg eablkybsjgVar, final xa.eablkybsjg eablkybsjgVar2) {
        y2.iobyxmoadg.lqeggnwhkg(Looper.myLooper() == this.f123575zoijcleaow.getLooper());
        this.f123571gxszxtbevo++;
        this.f123572iobyxmoadg.lqeggnwhkg(new Runnable() { // from class: y2.eablkybsjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f123546zdlpuopuiu.lqeggnwhkg(eablkybsjgVar2);
            }
        });
        gtknphoqwx(eablkybsjgVar.apply(this.f123574wkgbmnqykc));
    }

    public void dxjokdxxww(final Object obj) {
        this.f123570eablkybsjg = obj;
        this.f123575zoijcleaow.lqeggnwhkg(new Runnable() { // from class: y2.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                this.f123616zdlpuopuiu.eablkybsjg(obj);
            }
        });
    }

    public void nufgyqmvbu(Runnable runnable) {
        this.f123572iobyxmoadg.lqeggnwhkg(runnable);
    }

    public Object wkgbmnqykc() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f123575zoijcleaow.getLooper()) {
            return this.f123574wkgbmnqykc;
        }
        y2.iobyxmoadg.lqeggnwhkg(looperMyLooper == this.f123572iobyxmoadg.getLooper());
        return this.f123570eablkybsjg;
    }
}
