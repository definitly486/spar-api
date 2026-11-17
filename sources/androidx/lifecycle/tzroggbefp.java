package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class tzroggbefp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kcexrzcfyt f9555iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private iobyxmoadg f9556ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Handler f9557zoijcleaow;

    public static final class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f9558jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final gtknphoqwx.iobyxmoadg f9559yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final kcexrzcfyt f9560zdlpuopuiu;

        public iobyxmoadg(kcexrzcfyt registry, gtknphoqwx.iobyxmoadg event) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(registry, "registry");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
            this.f9560zdlpuopuiu = registry;
            this.f9559yggfygwlhe = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9558jyumaefscl) {
                return;
            }
            this.f9560zdlpuopuiu.dxjokdxxww(this.f9559yggfygwlhe);
            this.f9558jyumaefscl = true;
        }
    }

    public tzroggbefp(vdvldrhtss provider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(provider, "provider");
        this.f9555iobyxmoadg = new kcexrzcfyt(provider);
        this.f9557zoijcleaow = new Handler();
    }

    private final void gxszxtbevo(gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadg iobyxmoadgVar2 = this.f9556ppxfxbqfkf;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.run();
        }
        iobyxmoadg iobyxmoadgVar3 = new iobyxmoadg(this.f9555iobyxmoadg, iobyxmoadgVar);
        this.f9556ppxfxbqfkf = iobyxmoadgVar3;
        Handler handler = this.f9557zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar3);
        handler.postAtFrontOfQueue(iobyxmoadgVar3);
    }

    public void eablkybsjg() {
        gxszxtbevo(gtknphoqwx.iobyxmoadg.ON_START);
    }

    public gtknphoqwx iobyxmoadg() {
        return this.f9555iobyxmoadg;
    }

    public void ppxfxbqfkf() {
        gxszxtbevo(gtknphoqwx.iobyxmoadg.ON_CREATE);
    }

    public void wkgbmnqykc() {
        gxszxtbevo(gtknphoqwx.iobyxmoadg.ON_STOP);
        gxszxtbevo(gtknphoqwx.iobyxmoadg.ON_DESTROY);
    }

    public void zoijcleaow() {
        gxszxtbevo(gtknphoqwx.iobyxmoadg.ON_START);
    }
}
