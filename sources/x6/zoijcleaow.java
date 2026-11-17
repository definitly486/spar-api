package x6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import bl.wwaezpbzkn;
import bl.zdlpuopuiu;
import kotlin.jvm.internal.jyumaefscl;
import pj.tbqsvytpvh;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f121251eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f121252iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yj.nufgyqmvbu f121253ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final btonecajqb f121254wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final e7.draadjrbmk f121255zoijcleaow;

    static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {
        eablkybsjg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final x6.eablkybsjg invoke() {
            return zoijcleaow.this.eablkybsjg(new BitmapFactory.Options());
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final btonecajqb f121257iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final yj.nufgyqmvbu f121258zoijcleaow;

        public ppxfxbqfkf(int i13, btonecajqb btonecajqbVar) {
            this.f121257iobyxmoadg = btonecajqbVar;
            this.f121258zoijcleaow = yj.draadjrbmk.zoijcleaow(i13, 0, 2, null);
        }

        public boolean equals(Object obj) {
            return obj instanceof ppxfxbqfkf;
        }

        public int hashCode() {
            return ppxfxbqfkf.class.hashCode();
        }

        @Override // x6.lqeggnwhkg.iobyxmoadg
        public lqeggnwhkg iobyxmoadg(z6.wflxmlrfwp wflxmlrfwpVar, e7.draadjrbmk draadjrbmkVar, v6.wkgbmnqykc wkgbmnqykcVar) {
            return new zoijcleaow(wflxmlrfwpVar.ppxfxbqfkf(), draadjrbmkVar, this.f121258zoijcleaow, this.f121257iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f121259cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f121261jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f121262yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f121263zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f121261jyumaefscl = obj;
            this.f121259cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: x6.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static final class C3053zoijcleaow extends bl.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Exception f121264yggfygwlhe;

        public C3053zoijcleaow(wwaezpbzkn wwaezpbzknVar) {
            super(wwaezpbzknVar);
        }

        @Override // bl.draadjrbmk, bl.wwaezpbzkn
        public long fmlbqenlif(bl.ppxfxbqfkf ppxfxbqfkfVar, long j13) throws Exception {
            try {
                return super.fmlbqenlif(ppxfxbqfkfVar, j13);
            } catch (Exception e13) {
                this.f121264yggfygwlhe = e13;
                throw e13;
            }
        }

        public final Exception wkgbmnqykc() {
            return this.f121264yggfygwlhe;
        }
    }

    public zoijcleaow(agtfadlqog agtfadlqogVar, e7.draadjrbmk draadjrbmkVar, yj.nufgyqmvbu nufgyqmvbuVar, btonecajqb btonecajqbVar) {
        this.f121252iobyxmoadg = agtfadlqogVar;
        this.f121255zoijcleaow = draadjrbmkVar;
        this.f121253ppxfxbqfkf = nufgyqmvbuVar;
        this.f121254wkgbmnqykc = btonecajqbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x6.eablkybsjg eablkybsjg(BitmapFactory.Options options) throws Exception {
        C3053zoijcleaow c3053zoijcleaow = new C3053zoijcleaow(this.f121252iobyxmoadg.wkgbmnqykc());
        bl.eablkybsjg eablkybsjgVarPpxfxbqfkf = zdlpuopuiu.ppxfxbqfkf(c3053zoijcleaow);
        boolean z13 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eablkybsjgVarPpxfxbqfkf.peek().j0(), null, options);
        Exception excWkgbmnqykc = c3053zoijcleaow.wkgbmnqykc();
        if (excWkgbmnqykc != null) {
            throw excWkgbmnqykc;
        }
        options.inJustDecodeBounds = false;
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.f121211iobyxmoadg;
        nufgyqmvbu nufgyqmvbuVarIobyxmoadg = gtknphoqwxVar.iobyxmoadg(options.outMimeType, eablkybsjgVarPpxfxbqfkf, this.f121254wkgbmnqykc);
        Exception excWkgbmnqykc2 = c3053zoijcleaow.wkgbmnqykc();
        if (excWkgbmnqykc2 != null) {
            throw excWkgbmnqykc2;
        }
        options.inMutable = false;
        if (this.f121255zoijcleaow.eablkybsjg() != null) {
            options.inPreferredColorSpace = this.f121255zoijcleaow.eablkybsjg();
        }
        options.inPremultiplied = this.f121255zoijcleaow.wflxmlrfwp();
        ppxfxbqfkf(options, nufgyqmvbuVarIobyxmoadg);
        wkgbmnqykc(options, nufgyqmvbuVarIobyxmoadg);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(eablkybsjgVarPpxfxbqfkf.j0(), null, options);
            rg.zoijcleaow.iobyxmoadg(eablkybsjgVarPpxfxbqfkf, null);
            Exception excWkgbmnqykc3 = c3053zoijcleaow.wkgbmnqykc();
            if (excWkgbmnqykc3 != null) {
                throw excWkgbmnqykc3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.f121255zoijcleaow.lqeggnwhkg().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f121255zoijcleaow.lqeggnwhkg().getResources(), gtknphoqwxVar.zoijcleaow(bitmapDecodeStream, nufgyqmvbuVarIobyxmoadg));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z13 = false;
            }
            return new x6.eablkybsjg(bitmapDrawable, z13);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(eablkybsjgVarPpxfxbqfkf, th2);
                throw th3;
            }
        }
    }

    private final void ppxfxbqfkf(BitmapFactory.Options options, nufgyqmvbu nufgyqmvbuVar) {
        Bitmap.Config configGxszxtbevo = this.f121255zoijcleaow.gxszxtbevo();
        if (nufgyqmvbuVar.zoijcleaow() || draadjrbmk.iobyxmoadg(nufgyqmvbuVar)) {
            configGxszxtbevo = i7.iobyxmoadg.eablkybsjg(configGxszxtbevo);
        }
        if (this.f121255zoijcleaow.wkgbmnqykc() && configGxszxtbevo == Bitmap.Config.ARGB_8888 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(options.outMimeType, "image/jpeg")) {
            configGxszxtbevo = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config == config2 && configGxszxtbevo != Bitmap.Config.HARDWARE) {
            configGxszxtbevo = config2;
        }
        options.inPreferredConfig = configGxszxtbevo;
    }

    private final void wkgbmnqykc(BitmapFactory.Options options, nufgyqmvbu nufgyqmvbuVar) {
        agtfadlqog.iobyxmoadg iobyxmoadgVarIobyxmoadg = this.f121252iobyxmoadg.iobyxmoadg();
        if ((iobyxmoadgVarIobyxmoadg instanceof rgvfuqvkyq) && f7.zoijcleaow.iobyxmoadg(this.f121255zoijcleaow.ojitshcjhn())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((rgvfuqvkyq) iobyxmoadgVarIobyxmoadg).iobyxmoadg();
            options.inTargetDensity = this.f121255zoijcleaow.lqeggnwhkg().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i13 = draadjrbmk.zoijcleaow(nufgyqmvbuVar) ? options.outHeight : options.outWidth;
        int i14 = draadjrbmk.zoijcleaow(nufgyqmvbuVar) ? options.outWidth : options.outHeight;
        f7.dxjokdxxww dxjokdxxwwVarOjitshcjhn = this.f121255zoijcleaow.ojitshcjhn();
        int iPmvmpeiblj = f7.zoijcleaow.iobyxmoadg(dxjokdxxwwVarOjitshcjhn) ? i13 : i7.gtknphoqwx.pmvmpeiblj(dxjokdxxwwVarOjitshcjhn.wkgbmnqykc(), this.f121255zoijcleaow.agtfadlqog());
        f7.dxjokdxxww dxjokdxxwwVarOjitshcjhn2 = this.f121255zoijcleaow.ojitshcjhn();
        int iPmvmpeiblj2 = f7.zoijcleaow.iobyxmoadg(dxjokdxxwwVarOjitshcjhn2) ? i14 : i7.gtknphoqwx.pmvmpeiblj(dxjokdxxwwVarOjitshcjhn2.ppxfxbqfkf(), this.f121255zoijcleaow.agtfadlqog());
        int iIobyxmoadg = gxszxtbevo.iobyxmoadg(i13, i14, iPmvmpeiblj, iPmvmpeiblj2, this.f121255zoijcleaow.agtfadlqog());
        options.inSampleSize = iIobyxmoadg;
        double dZoijcleaow = gxszxtbevo.zoijcleaow(((double) i13) / ((double) iIobyxmoadg), ((double) i14) / ((double) iIobyxmoadg), iPmvmpeiblj, iPmvmpeiblj2, this.f121255zoijcleaow.agtfadlqog());
        if (this.f121255zoijcleaow.ppxfxbqfkf()) {
            dZoijcleaow = zg.gtknphoqwx.nufgyqmvbu(dZoijcleaow, 1.0d);
        }
        boolean z13 = dZoijcleaow == 1.0d;
        options.inScaled = !z13;
        if (z13) {
            return;
        }
        if (dZoijcleaow > 1.0d) {
            options.inDensity = vg.iobyxmoadg.ppxfxbqfkf(((double) Integer.MAX_VALUE) / dZoijcleaow);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = vg.iobyxmoadg.ppxfxbqfkf(((double) Integer.MAX_VALUE) * dZoijcleaow);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x6.lqeggnwhkg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        wkgbmnqykc wkgbmnqykcVar;
        yj.nufgyqmvbu nufgyqmvbuVar;
        zoijcleaow zoijcleaowVar;
        yj.nufgyqmvbu nufgyqmvbuVar2;
        Throwable th2;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f121259cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f121259cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f121261jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f121259cqumvgiudr;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbuVar = this.f121253ppxfxbqfkf;
                wkgbmnqykcVar.f121263zdlpuopuiu = this;
                wkgbmnqykcVar.f121262yggfygwlhe = nufgyqmvbuVar;
                wkgbmnqykcVar.f121259cqumvgiudr = 1;
                if (nufgyqmvbuVar.zoijcleaow(wkgbmnqykcVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nufgyqmvbuVar2 = (yj.nufgyqmvbu) wkgbmnqykcVar.f121263zdlpuopuiu;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        x6.eablkybsjg eablkybsjgVar = (x6.eablkybsjg) obj;
                        nufgyqmvbuVar2.release();
                        return eablkybsjgVar;
                    } catch (Throwable th3) {
                        th2 = th3;
                        nufgyqmvbuVar2.release();
                        throw th2;
                    }
                }
                yj.nufgyqmvbu nufgyqmvbuVar3 = (yj.nufgyqmvbu) wkgbmnqykcVar.f121262yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) wkgbmnqykcVar.f121263zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbuVar = nufgyqmvbuVar3;
            }
            eablkybsjg eablkybsjgVar2 = zoijcleaowVar.new eablkybsjg();
            wkgbmnqykcVar.f121263zdlpuopuiu = nufgyqmvbuVar;
            wkgbmnqykcVar.f121262yggfygwlhe = null;
            wkgbmnqykcVar.f121259cqumvgiudr = 2;
            Object objPpxfxbqfkf = tbqsvytpvh.ppxfxbqfkf(null, eablkybsjgVar2, wkgbmnqykcVar, 1, null);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            nufgyqmvbuVar2 = nufgyqmvbuVar;
            obj = objPpxfxbqfkf;
            x6.eablkybsjg eablkybsjgVar3 = (x6.eablkybsjg) obj;
            nufgyqmvbuVar2.release();
            return eablkybsjgVar3;
        } catch (Throwable th4) {
            nufgyqmvbuVar2 = nufgyqmvbuVar;
            th2 = th4;
            nufgyqmvbuVar2.release();
            throw th2;
        }
    }
}
