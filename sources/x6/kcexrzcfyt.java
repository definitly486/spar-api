package x6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import gg.cqumvgiudr;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.tbqsvytpvh;

/* JADX INFO: loaded from: classes2.dex */
public final class kcexrzcfyt implements lqeggnwhkg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f121216wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f121217iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f121218ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final e7.draadjrbmk f121219zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {
        ppxfxbqfkf() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final eablkybsjg invoke() {
            float fNufgyqmvbu;
            float fGxszxtbevo;
            int iWkgbmnqykc;
            int iWkgbmnqykc2;
            bl.eablkybsjg eablkybsjgVarWkgbmnqykc = kcexrzcfyt.this.f121217iobyxmoadg.wkgbmnqykc();
            try {
                com.caverock.androidsvg.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = com.caverock.androidsvg.lqeggnwhkg.draadjrbmk(eablkybsjgVarWkgbmnqykc.j0());
                rg.zoijcleaow.iobyxmoadg(eablkybsjgVarWkgbmnqykc, null);
                RectF rectFLqeggnwhkg = lqeggnwhkgVarDraadjrbmk.lqeggnwhkg();
                if (!kcexrzcfyt.this.gxszxtbevo() || rectFLqeggnwhkg == null) {
                    fNufgyqmvbu = lqeggnwhkgVarDraadjrbmk.nufgyqmvbu();
                    fGxszxtbevo = lqeggnwhkgVarDraadjrbmk.gxszxtbevo();
                } else {
                    fNufgyqmvbu = rectFLqeggnwhkg.width();
                    fGxszxtbevo = rectFLqeggnwhkg.height();
                }
                kcexrzcfyt kcexrzcfytVar = kcexrzcfyt.this;
                gg.vdvldrhtss vdvldrhtssVarEablkybsjg = kcexrzcfytVar.eablkybsjg(fNufgyqmvbu, fGxszxtbevo, kcexrzcfytVar.f121219zoijcleaow.agtfadlqog());
                float fFloatValue = ((Number) vdvldrhtssVarEablkybsjg.iobyxmoadg()).floatValue();
                float fFloatValue2 = ((Number) vdvldrhtssVarEablkybsjg.wkgbmnqykc()).floatValue();
                if (fNufgyqmvbu <= 0.0f || fGxszxtbevo <= 0.0f) {
                    iWkgbmnqykc = vg.iobyxmoadg.wkgbmnqykc(fFloatValue);
                    iWkgbmnqykc2 = vg.iobyxmoadg.wkgbmnqykc(fFloatValue2);
                } else {
                    float fWkgbmnqykc = gxszxtbevo.wkgbmnqykc(fNufgyqmvbu, fGxszxtbevo, fFloatValue, fFloatValue2, kcexrzcfyt.this.f121219zoijcleaow.agtfadlqog());
                    iWkgbmnqykc = (int) (fWkgbmnqykc * fNufgyqmvbu);
                    iWkgbmnqykc2 = (int) (fWkgbmnqykc * fGxszxtbevo);
                }
                if (rectFLqeggnwhkg == null && fNufgyqmvbu > 0.0f && fGxszxtbevo > 0.0f) {
                    lqeggnwhkgVarDraadjrbmk.iwizpuwonk(0.0f, 0.0f, fNufgyqmvbu, fGxszxtbevo);
                }
                lqeggnwhkgVarDraadjrbmk.esjtqupxsv("100%");
                lqeggnwhkgVarDraadjrbmk.yggfygwlhe("100%");
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWkgbmnqykc, iWkgbmnqykc2, i7.btonecajqb.wkgbmnqykc(kcexrzcfyt.this.f121219zoijcleaow.gxszxtbevo()));
                zdlpuopuiu.dxjokdxxww(bitmapCreateBitmap, "createBitmap(width, height, config)");
                String strIobyxmoadg = e7.vdvldrhtss.iobyxmoadg(kcexrzcfyt.this.f121219zoijcleaow.draadjrbmk());
                lqeggnwhkgVarDraadjrbmk.ojitshcjhn(new Canvas(bitmapCreateBitmap), strIobyxmoadg != null ? new com.caverock.androidsvg.gxszxtbevo().iobyxmoadg(strIobyxmoadg) : null);
                return new eablkybsjg(new BitmapDrawable(kcexrzcfyt.this.f121219zoijcleaow.lqeggnwhkg().getResources(), bitmapCreateBitmap), true);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(eablkybsjgVarWkgbmnqykc, th2);
                    throw th3;
                }
            }
        }
    }

    public kcexrzcfyt(agtfadlqog agtfadlqogVar, e7.draadjrbmk draadjrbmkVar, boolean z13) {
        this.f121217iobyxmoadg = agtfadlqogVar;
        this.f121219zoijcleaow = draadjrbmkVar;
        this.f121218ppxfxbqfkf = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.vdvldrhtss eablkybsjg(float f13, float f14, f7.nufgyqmvbu nufgyqmvbuVar) {
        if (!f7.zoijcleaow.iobyxmoadg(this.f121219zoijcleaow.ojitshcjhn())) {
            f7.dxjokdxxww dxjokdxxwwVarOjitshcjhn = this.f121219zoijcleaow.ojitshcjhn();
            return cqumvgiudr.iobyxmoadg(Float.valueOf(i7.btonecajqb.ppxfxbqfkf(dxjokdxxwwVarOjitshcjhn.iobyxmoadg(), nufgyqmvbuVar)), Float.valueOf(i7.btonecajqb.ppxfxbqfkf(dxjokdxxwwVarOjitshcjhn.zoijcleaow(), nufgyqmvbuVar)));
        }
        if (f13 <= 0.0f) {
            f13 = 512.0f;
        }
        if (f14 <= 0.0f) {
            f14 = 512.0f;
        }
        return cqumvgiudr.iobyxmoadg(Float.valueOf(f13), Float.valueOf(f14));
    }

    public final boolean gxszxtbevo() {
        return this.f121218ppxfxbqfkf;
    }

    @Override // x6.lqeggnwhkg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        return tbqsvytpvh.ppxfxbqfkf(null, new ppxfxbqfkf(), gxszxtbevoVar, 1, null);
    }

    public static final class zoijcleaow implements lqeggnwhkg.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f121221iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f121221iobyxmoadg = z13;
        }

        private final boolean zoijcleaow(z6.wflxmlrfwp wflxmlrfwpVar) {
            return zdlpuopuiu.eablkybsjg(wflxmlrfwpVar.zoijcleaow(), "image/svg+xml") || oxmwwwfdhm.iobyxmoadg(gxszxtbevo.f121213iobyxmoadg, wflxmlrfwpVar.ppxfxbqfkf().wkgbmnqykc());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f121221iobyxmoadg == ((zoijcleaow) obj).f121221iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f121221iobyxmoadg);
        }

        @Override // x6.lqeggnwhkg.iobyxmoadg
        public lqeggnwhkg iobyxmoadg(z6.wflxmlrfwp wflxmlrfwpVar, e7.draadjrbmk draadjrbmkVar, v6.wkgbmnqykc wkgbmnqykcVar) {
            if (zoijcleaow(wflxmlrfwpVar)) {
                return new kcexrzcfyt(wflxmlrfwpVar.ppxfxbqfkf(), draadjrbmkVar, this.f121221iobyxmoadg);
            }
            return null;
        }

        public /* synthetic */ zoijcleaow(boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? true : z13);
        }
    }
}
