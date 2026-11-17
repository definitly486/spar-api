package kcexrzcfyt;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
class jrbgnlbqoe {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ppxfxbqfkf f54806gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private DeferrableSurface f54807iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Size f54810wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private androidx.camera.core.impl.jyumaefscl f54811zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final iwizpuwonk.jyumaefscl f54805eablkybsjg = new iwizpuwonk.jyumaefscl();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private androidx.camera.core.impl.jyumaefscl.ppxfxbqfkf f54808lqeggnwhkg = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f54809ppxfxbqfkf = new zoijcleaow();

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Surface f54812iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f54814zoijcleaow;

        iobyxmoadg(Surface surface, SurfaceTexture surfaceTexture) {
            this.f54812iobyxmoadg = surface;
            this.f54814zoijcleaow = surfaceTexture;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
            this.f54812iobyxmoadg.release();
            this.f54814zoijcleaow.release();
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    interface ppxfxbqfkf {
        void iobyxmoadg();
    }

    private static class zoijcleaow implements androidx.camera.core.impl.istkbnxepw {

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        private final androidx.camera.core.impl.btonecajqb f54815ylkuphrtab;

        zoijcleaow() {
            androidx.camera.core.impl.oxmwwwfdhm oxmwwwfdhmVarJhduphickx = androidx.camera.core.impl.oxmwwwfdhm.jhduphickx();
            oxmwwwfdhmVarJhduphickx.vdvldrhtss(androidx.camera.core.impl.istkbnxepw.f3797jyumaefscl, new vipkmwdibw());
            oxmwwwfdhmVarJhduphickx.vdvldrhtss(androidx.camera.core.impl.ojitshcjhn.f3844nufgyqmvbu, 34);
            crxdokpmqz(oxmwwwfdhmVarJhduphickx);
            this.f54815ylkuphrtab = oxmwwwfdhmVarJhduphickx;
        }

        private void crxdokpmqz(androidx.camera.core.impl.oxmwwwfdhm oxmwwwfdhmVar) {
            oxmwwwfdhmVar.vdvldrhtss(lmojexxdyd.btonecajqb.f63631lmojexxdyd, jrbgnlbqoe.class);
            oxmwwwfdhmVar.vdvldrhtss(lmojexxdyd.btonecajqb.f63630iozdgvuglv, jrbgnlbqoe.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // androidx.camera.core.impl.istkbnxepw
        public androidx.camera.core.impl.cdpycssgdh.zoijcleaow dsvhmnatus() {
            return androidx.camera.core.impl.cdpycssgdh.zoijcleaow.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.yggfygwlhe
        public androidx.camera.core.impl.btonecajqb getConfig() {
            return this.f54815ylkuphrtab;
        }
    }

    jrbgnlbqoe(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, tbqsvytpvh tbqsvytpvhVar, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f54806gxszxtbevo = ppxfxbqfkfVar;
        Size sizeLqeggnwhkg = lqeggnwhkg(pmvmpeibljVar, tbqsvytpvhVar);
        this.f54810wkgbmnqykc = sizeLqeggnwhkg;
        lereixgezr.sopmlzcsov.iobyxmoadg("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeLqeggnwhkg);
        this.f54811zoijcleaow = wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void btonecajqb(androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.jyumaefscl.lqeggnwhkg lqeggnwhkgVar) {
        this.f54811zoijcleaow = wkgbmnqykc();
        ppxfxbqfkf ppxfxbqfkfVar = this.f54806gxszxtbevo;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.iobyxmoadg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int gtknphoqwx(Size size, Size size2) {
        return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
    }

    private Size lqeggnwhkg(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, tbqsvytpvh tbqsvytpvhVar) {
        Size[] sizeArrPpxfxbqfkf = pmvmpeibljVar.ppxfxbqfkf().ppxfxbqfkf(34);
        if (sizeArrPpxfxbqfkf == null) {
            lereixgezr.sopmlzcsov.ppxfxbqfkf("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrIobyxmoadg = this.f54805eablkybsjg.iobyxmoadg(sizeArrPpxfxbqfkf);
        List listAsList = Arrays.asList(sizeArrIobyxmoadg);
        Collections.sort(listAsList, new Comparator() { // from class: kcexrzcfyt.ixidwrxhsl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jrbgnlbqoe.gtknphoqwx((Size) obj, (Size) obj2);
            }
        });
        Size sizeGxszxtbevo = tbqsvytpvhVar.gxszxtbevo();
        long jMin = Math.min(((long) sizeGxszxtbevo.getWidth()) * ((long) sizeGxszxtbevo.getHeight()), 307200L);
        int length = sizeArrIobyxmoadg.length;
        Size size = null;
        int i13 = 0;
        while (i13 < length) {
            Size size2 = sizeArrIobyxmoadg[i13];
            long width = ((long) size2.getWidth()) * ((long) size2.getHeight());
            if (width == jMin) {
                return size2;
            }
            if (width > jMin) {
                if (size == null) {
                    break;
                }
                return size;
            }
            i13++;
            size = size2;
        }
        return (Size) listAsList.get(0);
    }

    androidx.camera.core.impl.istkbnxepw dxjokdxxww() {
        return this.f54809ppxfxbqfkf;
    }

    Size eablkybsjg() {
        return this.f54810wkgbmnqykc;
    }

    String gxszxtbevo() {
        return "MeteringRepeating";
    }

    androidx.camera.core.impl.jyumaefscl nufgyqmvbu() {
        return this.f54811zoijcleaow;
    }

    void ppxfxbqfkf() {
        lereixgezr.sopmlzcsov.iobyxmoadg("MeteringRepeating", "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.f54807iobyxmoadg;
        if (deferrableSurface != null) {
            deferrableSurface.wkgbmnqykc();
        }
        this.f54807iobyxmoadg = null;
    }

    androidx.camera.core.impl.jyumaefscl wkgbmnqykc() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f54810wkgbmnqykc.getWidth(), this.f54810wkgbmnqykc.getHeight());
        Surface surface = new Surface(surfaceTexture);
        androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVarVdvldrhtss = androidx.camera.core.impl.jyumaefscl.zoijcleaow.vdvldrhtss(this.f54809ppxfxbqfkf, this.f54810wkgbmnqykc);
        zoijcleaowVarVdvldrhtss.esjtqupxsv(1);
        istkbnxepw.dsvhmnatus dsvhmnatusVar = new istkbnxepw.dsvhmnatus(surface);
        this.f54807iobyxmoadg = dsvhmnatusVar;
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(dsvhmnatusVar.gtknphoqwx(), new iobyxmoadg(surface, surfaceTexture), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        zoijcleaowVarVdvldrhtss.wflxmlrfwp(this.f54807iobyxmoadg);
        androidx.camera.core.impl.jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar = this.f54808lqeggnwhkg;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.zoijcleaow();
        }
        androidx.camera.core.impl.jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar2 = new androidx.camera.core.impl.jyumaefscl.ppxfxbqfkf(new androidx.camera.core.impl.jyumaefscl.wkgbmnqykc() { // from class: kcexrzcfyt.mhtqkkgtqm
            @Override // androidx.camera.core.impl.jyumaefscl.wkgbmnqykc
            public final void iobyxmoadg(androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.jyumaefscl.lqeggnwhkg lqeggnwhkgVar) {
                this.f54884iobyxmoadg.btonecajqb(jyumaefsclVar, lqeggnwhkgVar);
            }
        });
        this.f54808lqeggnwhkg = ppxfxbqfkfVar2;
        zoijcleaowVarVdvldrhtss.oxmwwwfdhm(ppxfxbqfkfVar2);
        return zoijcleaowVarVdvldrhtss.rgvfuqvkyq();
    }
}
