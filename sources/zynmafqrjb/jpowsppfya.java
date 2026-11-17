package zynmafqrjb;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import istkbnxepw.jztzpxfvev;
import java.util.concurrent.Executor;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class jpowsppfya {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final boolean f131624agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private jpowsppfya.yggfygwlhe f131625btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private jpowsppfya.yggfygwlhe f131626draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private jpowsppfya.yggfygwlhe f131627dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private jpowsppfya.yggfygwlhe f131628eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private jpowsppfya.yggfygwlhe f131629gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private jpowsppfya.yggfygwlhe f131630gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Executor f131631iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private jpowsppfya.yggfygwlhe f131632lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private jpowsppfya.yggfygwlhe f131633nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private iobyxmoadg f131634ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final jztzpxfvev f131635wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private jpowsppfya.yggfygwlhe f131636wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final jpowsppfya.kcexrzcfyt f131637zoijcleaow;

    static abstract class iobyxmoadg {
        iobyxmoadg() {
        }

        static iobyxmoadg eablkybsjg(int i13, int i14) {
            return new wkgbmnqykc(new jpowsppfya.vdvldrhtss(), new jpowsppfya.vdvldrhtss(), i13, i14);
        }

        abstract jpowsppfya.vdvldrhtss iobyxmoadg();

        abstract int ppxfxbqfkf();

        abstract jpowsppfya.vdvldrhtss wkgbmnqykc();

        abstract int zoijcleaow();
    }

    static abstract class zoijcleaow {
        zoijcleaow() {
        }

        static zoijcleaow ppxfxbqfkf(hkdspvbjdz hkdspvbjdzVar, androidx.camera.core.agtfadlqog agtfadlqogVar) {
            return new eablkybsjg(hkdspvbjdzVar, agtfadlqogVar);
        }

        abstract androidx.camera.core.agtfadlqog iobyxmoadg();

        abstract hkdspvbjdz zoijcleaow();
    }

    jpowsppfya(Executor executor, jpowsppfya.kcexrzcfyt kcexrzcfytVar) {
        this(executor, kcexrzcfytVar, androidx.camera.core.internal.compat.quirk.iobyxmoadg.ppxfxbqfkf());
    }

    private jpowsppfya.jyumaefscl dxjokdxxww(jpowsppfya.jyumaefscl jyumaefsclVar, int i13) {
        u1.nufgyqmvbu.nufgyqmvbu(ImageUtil.lqeggnwhkg(jyumaefsclVar.eablkybsjg()));
        jpowsppfya.jyumaefscl jyumaefsclVar2 = (jpowsppfya.jyumaefscl) this.f131633nufgyqmvbu.apply(jyumaefsclVar);
        jpowsppfya.yggfygwlhe yggfygwlheVar = this.f131626draadjrbmk;
        if (yggfygwlheVar != null) {
            jyumaefsclVar2 = (jpowsppfya.jyumaefscl) yggfygwlheVar.apply(jyumaefsclVar2);
        }
        return (jpowsppfya.jyumaefscl) this.f131630gxszxtbevo.apply(lqeggnwhkg.zoijcleaow.ppxfxbqfkf(jyumaefsclVar2, i13));
    }

    private static void iwizpuwonk(final hkdspvbjdz hkdspvbjdzVar, final ImageCaptureException imageCaptureException) {
        yadqdtsiqt.iobyxmoadg.wkgbmnqykc().execute(new Runnable(hkdspvbjdzVar, imageCaptureException) { // from class: zynmafqrjb.cdpycssgdh

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            public final /* synthetic */ ImageCaptureException f131598yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public final /* synthetic */ hkdspvbjdz f131599zdlpuopuiu;

            {
                this.f131598yggfygwlhe = imageCaptureException;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f131599zdlpuopuiu.kcexrzcfyt(this.f131598yggfygwlhe);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ojitshcjhn(final zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar.zoijcleaow().btonecajqb()) {
            zoijcleaowVar.iobyxmoadg().close();
        } else {
            this.f131631iobyxmoadg.execute(new Runnable() { // from class: zynmafqrjb.wwaezpbzkn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131682zdlpuopuiu.agtfadlqog(zoijcleaowVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vdvldrhtss(final zoijcleaow zoijcleaowVar) {
        if (!zoijcleaowVar.zoijcleaow().btonecajqb()) {
            this.f131631iobyxmoadg.execute(new Runnable() { // from class: zynmafqrjb.lmojexxdyd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131645zdlpuopuiu.rgvfuqvkyq(zoijcleaowVar);
                }
            });
        } else {
            sopmlzcsov.draadjrbmk("ProcessingNode", "The postview image is closed due to request aborted");
            zoijcleaowVar.iobyxmoadg().close();
        }
    }

    public Void cqumvgiudr(iobyxmoadg iobyxmoadgVar) {
        this.f131634ppxfxbqfkf = iobyxmoadgVar;
        iobyxmoadgVar.iobyxmoadg().iobyxmoadg(new u1.iobyxmoadg() { // from class: zynmafqrjb.yadqdtsiqt
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                this.f131684iobyxmoadg.ojitshcjhn((jpowsppfya.zoijcleaow) obj);
            }
        });
        iobyxmoadgVar.wkgbmnqykc().iobyxmoadg(new u1.iobyxmoadg() { // from class: zynmafqrjb.iozdgvuglv
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                this.f131623iobyxmoadg.vdvldrhtss((jpowsppfya.zoijcleaow) obj);
            }
        });
        this.f131636wkgbmnqykc = new istkbnxepw();
        this.f131628eablkybsjg = new zdlpuopuiu(this.f131635wflxmlrfwp);
        this.f131633nufgyqmvbu = new iwizpuwonk();
        this.f131630gxszxtbevo = new lqeggnwhkg();
        this.f131632lqeggnwhkg = new cqumvgiudr();
        this.f131627dxjokdxxww = new lereixgezr();
        this.f131629gtknphoqwx = new kcexrzcfyt();
        if (iobyxmoadgVar.zoijcleaow() != 35 && !this.f131624agtfadlqog) {
            return null;
        }
        this.f131625btonecajqb = new esjtqupxsv();
        return null;
    }

    public void jyumaefscl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
    public void agtfadlqog(zoijcleaow zoijcleaowVar) {
        final hkdspvbjdz hkdspvbjdzVarZoijcleaow = zoijcleaowVar.zoijcleaow();
        try {
            if (zoijcleaowVar.zoijcleaow().gtknphoqwx()) {
                final androidx.camera.core.agtfadlqog agtfadlqogVarOxmwwwfdhm = oxmwwwfdhm(zoijcleaowVar);
                yadqdtsiqt.iobyxmoadg.wkgbmnqykc().execute(new Runnable(hkdspvbjdzVarZoijcleaow, agtfadlqogVarOxmwwwfdhm) { // from class: zynmafqrjb.ylkuphrtab

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    public final /* synthetic */ androidx.camera.core.agtfadlqog f131685yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    public final /* synthetic */ hkdspvbjdz f131686zdlpuopuiu;

                    {
                        this.f131685yggfygwlhe = agtfadlqogVarOxmwwwfdhm;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f131686zdlpuopuiu.ojitshcjhn(this.f131685yggfygwlhe);
                    }
                });
            } else {
                final lereixgezr.cllcsxoeiz.eablkybsjg eablkybsjgVarZdlpuopuiu = zdlpuopuiu(zoijcleaowVar);
                yadqdtsiqt.iobyxmoadg.wkgbmnqykc().execute(new Runnable(hkdspvbjdzVarZoijcleaow, eablkybsjgVarZdlpuopuiu) { // from class: zynmafqrjb.pkzmftpjix

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    public final /* synthetic */ lereixgezr.cllcsxoeiz.eablkybsjg f131661yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    public final /* synthetic */ hkdspvbjdz f131662zdlpuopuiu;

                    {
                        this.f131661yggfygwlhe = eablkybsjgVarZdlpuopuiu;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f131662zdlpuopuiu.rgvfuqvkyq(this.f131661yggfygwlhe);
                    }
                });
            }
        } catch (ImageCaptureException e13) {
            iwizpuwonk(hkdspvbjdzVarZoijcleaow, e13);
        } catch (OutOfMemoryError e14) {
            iwizpuwonk(hkdspvbjdzVarZoijcleaow, new ImageCaptureException(0, "Processing failed due to low memory.", e14));
        } catch (RuntimeException e15) {
            iwizpuwonk(hkdspvbjdzVarZoijcleaow, new ImageCaptureException(0, "Processing failed.", e15));
        }
    }

    androidx.camera.core.agtfadlqog oxmwwwfdhm(zoijcleaow zoijcleaowVar) {
        hkdspvbjdz hkdspvbjdzVarZoijcleaow = zoijcleaowVar.zoijcleaow();
        jpowsppfya.jyumaefscl jyumaefsclVar = (jpowsppfya.jyumaefscl) this.f131636wkgbmnqykc.apply(zoijcleaowVar);
        if ((jyumaefsclVar.eablkybsjg() == 35 || this.f131626draadjrbmk != null || this.f131624agtfadlqog) && this.f131634ppxfxbqfkf.ppxfxbqfkf() == 256) {
            jpowsppfya.jyumaefscl jyumaefsclVarDxjokdxxww = (jpowsppfya.jyumaefscl) this.f131628eablkybsjg.apply(zdlpuopuiu.iobyxmoadg.ppxfxbqfkf(jyumaefsclVar, hkdspvbjdzVarZoijcleaow.ppxfxbqfkf()));
            if (this.f131626draadjrbmk != null) {
                jyumaefsclVarDxjokdxxww = dxjokdxxww(jyumaefsclVarDxjokdxxww, hkdspvbjdzVarZoijcleaow.ppxfxbqfkf());
            }
            jyumaefsclVar = (jpowsppfya.jyumaefscl) this.f131625btonecajqb.apply(jyumaefsclVarDxjokdxxww);
        }
        return (androidx.camera.core.agtfadlqog) this.f131627dxjokdxxww.apply(jyumaefsclVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: yggfygwlhe, reason: merged with bridge method [inline-methods] */
    public void rgvfuqvkyq(zoijcleaow zoijcleaowVar) {
        int iPpxfxbqfkf = this.f131634ppxfxbqfkf.ppxfxbqfkf();
        u1.nufgyqmvbu.zoijcleaow(iPpxfxbqfkf == 35 || iPpxfxbqfkf == 256, String.format("Postview only support YUV and JPEG output formats. Output format: %s", Integer.valueOf(iPpxfxbqfkf)));
        final hkdspvbjdz hkdspvbjdzVarZoijcleaow = zoijcleaowVar.zoijcleaow();
        try {
            final Bitmap bitmap = (Bitmap) this.f131629gtknphoqwx.apply((jpowsppfya.jyumaefscl) this.f131636wkgbmnqykc.apply(zoijcleaowVar));
            yadqdtsiqt.iobyxmoadg.wkgbmnqykc().execute(new Runnable(hkdspvbjdzVarZoijcleaow, bitmap) { // from class: zynmafqrjb.hcddaimhww

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                public final /* synthetic */ Bitmap f131619yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                public final /* synthetic */ hkdspvbjdz f131620zdlpuopuiu;

                {
                    this.f131619yggfygwlhe = bitmap;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f131620zdlpuopuiu.oxmwwwfdhm(this.f131619yggfygwlhe);
                }
            });
        } catch (Exception e13) {
            zoijcleaowVar.iobyxmoadg().close();
            sopmlzcsov.wkgbmnqykc("ProcessingNode", "process postview input packet failed.", e13);
        }
    }

    lereixgezr.cllcsxoeiz.eablkybsjg zdlpuopuiu(zoijcleaow zoijcleaowVar) {
        int iPpxfxbqfkf = this.f131634ppxfxbqfkf.ppxfxbqfkf();
        u1.nufgyqmvbu.zoijcleaow(ImageUtil.lqeggnwhkg(iPpxfxbqfkf), String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", Integer.valueOf(iPpxfxbqfkf)));
        hkdspvbjdz hkdspvbjdzVarZoijcleaow = zoijcleaowVar.zoijcleaow();
        jpowsppfya.jyumaefscl jyumaefsclVar = (jpowsppfya.jyumaefscl) this.f131628eablkybsjg.apply(zdlpuopuiu.iobyxmoadg.ppxfxbqfkf((jpowsppfya.jyumaefscl) this.f131636wkgbmnqykc.apply(zoijcleaowVar), hkdspvbjdzVarZoijcleaow.ppxfxbqfkf()));
        if (jyumaefsclVar.dxjokdxxww() || this.f131626draadjrbmk != null) {
            dxjokdxxww(jyumaefsclVar, hkdspvbjdzVarZoijcleaow.ppxfxbqfkf());
        }
        hkdspvbjdzVarZoijcleaow.wkgbmnqykc();
        throw null;
    }

    jpowsppfya(Executor executor, jpowsppfya.kcexrzcfyt kcexrzcfytVar, jztzpxfvev jztzpxfvevVar) {
        if (androidx.camera.core.internal.compat.quirk.iobyxmoadg.zoijcleaow(LowMemoryQuirk.class) != null) {
            this.f131631iobyxmoadg = yadqdtsiqt.iobyxmoadg.gxszxtbevo(executor);
        } else {
            this.f131631iobyxmoadg = executor;
        }
        this.f131635wflxmlrfwp = jztzpxfvevVar;
        this.f131624agtfadlqog = jztzpxfvevVar.iobyxmoadg(IncorrectJpegMetadataQuirk.class);
    }
}
