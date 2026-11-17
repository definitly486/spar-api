package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import kotlin.KotlinVersion;
import modern.payments.ecomAndroid.util.analytics.EcomMetricKey;

/* JADX INFO: loaded from: classes2.dex */
class nufgyqmvbu {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static HashSet f21616dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Stack f21617eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Stack f21618gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Canvas f21619iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Stack f21620lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private com.caverock.androidsvg.zoijcleaow.vdvldrhtss f21621nufgyqmvbu = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private com.caverock.androidsvg.lqeggnwhkg f21622ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private C0391nufgyqmvbu f21623wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f21624zoijcleaow;

    private abstract class btonecajqb {
        private btonecajqb() {
        }

        public boolean iobyxmoadg(com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox jlmebxxooxVar) {
            return true;
        }

        public abstract void zoijcleaow(String str);

        /* synthetic */ btonecajqb(nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private class dxjokdxxww extends btonecajqb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f21627ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        RectF f21628wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f21629zoijcleaow;

        dxjokdxxww(float f13, float f14) {
            super(nufgyqmvbu.this, null);
            this.f21628wkgbmnqykc = new RectF();
            this.f21629zoijcleaow = f13;
            this.f21627ppxfxbqfkf = f14;
        }

        @Override // com.caverock.androidsvg.nufgyqmvbu.btonecajqb
        public boolean iobyxmoadg(com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox jlmebxxooxVar) {
            if (!(jlmebxxooxVar instanceof com.caverock.androidsvg.lqeggnwhkg.ribwqtqdhb)) {
                return true;
            }
            com.caverock.androidsvg.lqeggnwhkg.ribwqtqdhb ribwqtqdhbVar = (com.caverock.androidsvg.lqeggnwhkg.ribwqtqdhb) jlmebxxooxVar;
            com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = jlmebxxooxVar.f21405iobyxmoadg.oxmwwwfdhm(ribwqtqdhbVar.f21496ojitshcjhn);
            if (cllcsxoeizVarOxmwwwfdhm == null) {
                nufgyqmvbu.iozdgvuglv("TextPath path reference '%s' not found", ribwqtqdhbVar.f21496ojitshcjhn);
                return false;
            }
            com.caverock.androidsvg.lqeggnwhkg.jyumaefscl jyumaefsclVar = (com.caverock.androidsvg.lqeggnwhkg.jyumaefscl) cllcsxoeizVarOxmwwwfdhm;
            Path pathZoijcleaow = nufgyqmvbu.this.new wkgbmnqykc(jyumaefsclVar.f21450ojitshcjhn).zoijcleaow();
            Matrix matrix = jyumaefsclVar.f21407agtfadlqog;
            if (matrix != null) {
                pathZoijcleaow.transform(matrix);
            }
            RectF rectF = new RectF();
            pathZoijcleaow.computeBounds(rectF, true);
            this.f21628wkgbmnqykc.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.nufgyqmvbu.btonecajqb
        public void zoijcleaow(String str) {
            if (nufgyqmvbu.this.d()) {
                Rect rect = new Rect();
                nufgyqmvbu.this.f21623wkgbmnqykc.f21651wkgbmnqykc.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f21629zoijcleaow, this.f21627ppxfxbqfkf);
                this.f21628wkgbmnqykc.union(rectF);
            }
            this.f21629zoijcleaow += nufgyqmvbu.this.f21623wkgbmnqykc.f21651wkgbmnqykc.measureText(str);
        }
    }

    private class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private Path f21630eablkybsjg;

        eablkybsjg(Path path, float f13, float f14) {
            super(f13, f14);
            this.f21630eablkybsjg = path;
        }

        @Override // com.caverock.androidsvg.nufgyqmvbu.gxszxtbevo, com.caverock.androidsvg.nufgyqmvbu.btonecajqb
        public void zoijcleaow(String str) {
            if (nufgyqmvbu.this.d()) {
                if (nufgyqmvbu.this.f21623wkgbmnqykc.f21652zoijcleaow) {
                    nufgyqmvbu.this.f21619iobyxmoadg.drawTextOnPath(str, this.f21630eablkybsjg, this.f21636zoijcleaow, this.f21634ppxfxbqfkf, nufgyqmvbu.this.f21623wkgbmnqykc.f21651wkgbmnqykc);
                }
                if (nufgyqmvbu.this.f21623wkgbmnqykc.f21650ppxfxbqfkf) {
                    nufgyqmvbu.this.f21619iobyxmoadg.drawTextOnPath(str, this.f21630eablkybsjg, this.f21636zoijcleaow, this.f21634ppxfxbqfkf, nufgyqmvbu.this.f21623wkgbmnqykc.f21645eablkybsjg);
                }
            }
            this.f21636zoijcleaow += nufgyqmvbu.this.f21623wkgbmnqykc.f21651wkgbmnqykc.measureText(str);
        }
    }

    private class gxszxtbevo extends btonecajqb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f21634ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f21636zoijcleaow;

        gxszxtbevo(float f13, float f14) {
            super(nufgyqmvbu.this, null);
            this.f21636zoijcleaow = f13;
            this.f21634ppxfxbqfkf = f14;
        }

        @Override // com.caverock.androidsvg.nufgyqmvbu.btonecajqb
        public void zoijcleaow(String str) {
            nufgyqmvbu.esjtqupxsv("TextSequence render", new Object[0]);
            if (nufgyqmvbu.this.d()) {
                if (nufgyqmvbu.this.f21623wkgbmnqykc.f21652zoijcleaow) {
                    nufgyqmvbu.this.f21619iobyxmoadg.drawText(str, this.f21636zoijcleaow, this.f21634ppxfxbqfkf, nufgyqmvbu.this.f21623wkgbmnqykc.f21651wkgbmnqykc);
                }
                if (nufgyqmvbu.this.f21623wkgbmnqykc.f21650ppxfxbqfkf) {
                    nufgyqmvbu.this.f21619iobyxmoadg.drawText(str, this.f21636zoijcleaow, this.f21634ppxfxbqfkf, nufgyqmvbu.this.f21623wkgbmnqykc.f21645eablkybsjg);
                }
            }
            this.f21636zoijcleaow += nufgyqmvbu.this.f21623wkgbmnqykc.f21651wkgbmnqykc.measureText(str);
        }
    }

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f21637iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final /* synthetic */ int[] f21638ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f21639zoijcleaow;

        static {
            int[] iArr = new int[com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.wkgbmnqykc.values().length];
            f21638ppxfxbqfkf = iArr;
            try {
                iArr[com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.wkgbmnqykc.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21638ppxfxbqfkf[com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.wkgbmnqykc.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21638ppxfxbqfkf[com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.wkgbmnqykc.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.ppxfxbqfkf.values().length];
            f21639zoijcleaow = iArr2;
            try {
                iArr2[com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.ppxfxbqfkf.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21639zoijcleaow[com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.ppxfxbqfkf.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21639zoijcleaow[com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.ppxfxbqfkf.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.caverock.androidsvg.eablkybsjg.iobyxmoadg.values().length];
            f21637iobyxmoadg = iArr3;
            try {
                iArr3[com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21637iobyxmoadg[com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21637iobyxmoadg[com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21637iobyxmoadg[com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21637iobyxmoadg[com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21637iobyxmoadg[com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21637iobyxmoadg[com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21637iobyxmoadg[com.caverock.androidsvg.eablkybsjg.iobyxmoadg.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private class lqeggnwhkg extends btonecajqb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f21641ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        Path f21642wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f21643zoijcleaow;

        lqeggnwhkg(float f13, float f14, Path path) {
            super(nufgyqmvbu.this, null);
            this.f21643zoijcleaow = f13;
            this.f21641ppxfxbqfkf = f14;
            this.f21642wkgbmnqykc = path;
        }

        @Override // com.caverock.androidsvg.nufgyqmvbu.btonecajqb
        public boolean iobyxmoadg(com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox jlmebxxooxVar) {
            if (!(jlmebxxooxVar instanceof com.caverock.androidsvg.lqeggnwhkg.ribwqtqdhb)) {
                return true;
            }
            nufgyqmvbu.e("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.caverock.androidsvg.nufgyqmvbu.btonecajqb
        public void zoijcleaow(String str) {
            if (nufgyqmvbu.this.d()) {
                Path path = new Path();
                nufgyqmvbu.this.f21623wkgbmnqykc.f21651wkgbmnqykc.getTextPath(str, 0, str.length(), this.f21643zoijcleaow, this.f21641ppxfxbqfkf, path);
                this.f21642wkgbmnqykc.addPath(path);
            }
            this.f21643zoijcleaow += nufgyqmvbu.this.f21623wkgbmnqykc.f21651wkgbmnqykc.measureText(str);
        }
    }

    private class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        boolean f21653eablkybsjg = false;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        float f21655iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f21656ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        float f21657wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f21658zoijcleaow;

        ppxfxbqfkf(float f13, float f14, float f15, float f16) {
            this.f21656ppxfxbqfkf = 0.0f;
            this.f21657wkgbmnqykc = 0.0f;
            this.f21655iobyxmoadg = f13;
            this.f21658zoijcleaow = f14;
            double dSqrt = Math.sqrt((f15 * f15) + (f16 * f16));
            if (dSqrt != 0.0d) {
                this.f21656ppxfxbqfkf = (float) (((double) f15) / dSqrt);
                this.f21657wkgbmnqykc = (float) (((double) f16) / dSqrt);
            }
        }

        void iobyxmoadg(float f13, float f14) {
            float f15 = f13 - this.f21655iobyxmoadg;
            float f16 = f14 - this.f21658zoijcleaow;
            double dSqrt = Math.sqrt((f15 * f15) + (f16 * f16));
            if (dSqrt != 0.0d) {
                f15 = (float) (((double) f15) / dSqrt);
                f16 = (float) (((double) f16) / dSqrt);
            }
            float f17 = this.f21656ppxfxbqfkf;
            if (f15 != (-f17) || f16 != (-this.f21657wkgbmnqykc)) {
                this.f21656ppxfxbqfkf = f17 + f15;
                this.f21657wkgbmnqykc += f16;
            } else {
                this.f21653eablkybsjg = true;
                this.f21656ppxfxbqfkf = -f16;
                this.f21657wkgbmnqykc = f15;
            }
        }

        public String toString() {
            return "(" + this.f21655iobyxmoadg + StringUtils.COMMA + this.f21658zoijcleaow + " " + this.f21656ppxfxbqfkf + StringUtils.COMMA + this.f21657wkgbmnqykc + ")";
        }

        void zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            float f13 = ppxfxbqfkfVar.f21656ppxfxbqfkf;
            float f14 = this.f21656ppxfxbqfkf;
            if (f13 == (-f14)) {
                float f15 = ppxfxbqfkfVar.f21657wkgbmnqykc;
                if (f15 == (-this.f21657wkgbmnqykc)) {
                    this.f21653eablkybsjg = true;
                    this.f21656ppxfxbqfkf = -f15;
                    this.f21657wkgbmnqykc = ppxfxbqfkfVar.f21656ppxfxbqfkf;
                    return;
                }
            }
            this.f21656ppxfxbqfkf = f14 + f13;
            this.f21657wkgbmnqykc += ppxfxbqfkfVar.f21657wkgbmnqykc;
        }
    }

    private class wkgbmnqykc implements com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        Path f21659iobyxmoadg = new Path();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f21660ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f21662zoijcleaow;

        wkgbmnqykc(com.caverock.androidsvg.lqeggnwhkg.iwizpuwonk iwizpuwonkVar) {
            if (iwizpuwonkVar == null) {
                return;
            }
            iwizpuwonkVar.nufgyqmvbu(this);
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void close() {
            this.f21659iobyxmoadg.close();
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void eablkybsjg(float f13, float f14, float f15, float f16) {
            this.f21659iobyxmoadg.quadTo(f13, f14, f15, f16);
            this.f21662zoijcleaow = f15;
            this.f21660ppxfxbqfkf = f16;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void gxszxtbevo(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17) {
            nufgyqmvbu.nufgyqmvbu(this.f21662zoijcleaow, this.f21660ppxfxbqfkf, f13, f14, f15, z13, z14, f16, f17, this);
            this.f21662zoijcleaow = f16;
            this.f21660ppxfxbqfkf = f17;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void iobyxmoadg(float f13, float f14) {
            this.f21659iobyxmoadg.moveTo(f13, f14);
            this.f21662zoijcleaow = f13;
            this.f21660ppxfxbqfkf = f14;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void ppxfxbqfkf(float f13, float f14, float f15, float f16, float f17, float f18) {
            this.f21659iobyxmoadg.cubicTo(f13, f14, f15, f16, f17, f18);
            this.f21662zoijcleaow = f17;
            this.f21660ppxfxbqfkf = f18;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void wkgbmnqykc(float f13, float f14) {
            this.f21659iobyxmoadg.lineTo(f13, f14);
            this.f21662zoijcleaow = f13;
            this.f21660ppxfxbqfkf = f14;
        }

        Path zoijcleaow() {
            return this.f21659iobyxmoadg;
        }
    }

    private class zoijcleaow implements com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr {

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private boolean f21668nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private float f21669ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private float f21671zoijcleaow;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private List f21666iobyxmoadg = new ArrayList();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private ppxfxbqfkf f21670wkgbmnqykc = null;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f21664eablkybsjg = false;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f21665gxszxtbevo = true;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f21667lqeggnwhkg = -1;

        zoijcleaow(com.caverock.androidsvg.lqeggnwhkg.iwizpuwonk iwizpuwonkVar) {
            if (iwizpuwonkVar == null) {
                return;
            }
            iwizpuwonkVar.nufgyqmvbu(this);
            if (this.f21668nufgyqmvbu) {
                this.f21670wkgbmnqykc.zoijcleaow((ppxfxbqfkf) this.f21666iobyxmoadg.get(this.f21667lqeggnwhkg));
                this.f21666iobyxmoadg.set(this.f21667lqeggnwhkg, this.f21670wkgbmnqykc);
                this.f21668nufgyqmvbu = false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = this.f21670wkgbmnqykc;
            if (ppxfxbqfkfVar != null) {
                this.f21666iobyxmoadg.add(ppxfxbqfkfVar);
            }
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void close() {
            this.f21666iobyxmoadg.add(this.f21670wkgbmnqykc);
            wkgbmnqykc(this.f21671zoijcleaow, this.f21669ppxfxbqfkf);
            this.f21668nufgyqmvbu = true;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void eablkybsjg(float f13, float f14, float f15, float f16) {
            this.f21670wkgbmnqykc.iobyxmoadg(f13, f14);
            this.f21666iobyxmoadg.add(this.f21670wkgbmnqykc);
            this.f21670wkgbmnqykc = nufgyqmvbu.this.new ppxfxbqfkf(f15, f16, f15 - f13, f16 - f14);
            this.f21668nufgyqmvbu = false;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void gxszxtbevo(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17) {
            this.f21664eablkybsjg = true;
            this.f21665gxszxtbevo = false;
            ppxfxbqfkf ppxfxbqfkfVar = this.f21670wkgbmnqykc;
            nufgyqmvbu.nufgyqmvbu(ppxfxbqfkfVar.f21655iobyxmoadg, ppxfxbqfkfVar.f21658zoijcleaow, f13, f14, f15, z13, z14, f16, f17, this);
            this.f21665gxszxtbevo = true;
            this.f21668nufgyqmvbu = false;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void iobyxmoadg(float f13, float f14) {
            if (this.f21668nufgyqmvbu) {
                this.f21670wkgbmnqykc.zoijcleaow((ppxfxbqfkf) this.f21666iobyxmoadg.get(this.f21667lqeggnwhkg));
                this.f21666iobyxmoadg.set(this.f21667lqeggnwhkg, this.f21670wkgbmnqykc);
                this.f21668nufgyqmvbu = false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = this.f21670wkgbmnqykc;
            if (ppxfxbqfkfVar != null) {
                this.f21666iobyxmoadg.add(ppxfxbqfkfVar);
            }
            this.f21671zoijcleaow = f13;
            this.f21669ppxfxbqfkf = f14;
            this.f21670wkgbmnqykc = nufgyqmvbu.this.new ppxfxbqfkf(f13, f14, 0.0f, 0.0f);
            this.f21667lqeggnwhkg = this.f21666iobyxmoadg.size();
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void ppxfxbqfkf(float f13, float f14, float f15, float f16, float f17, float f18) {
            if (this.f21665gxszxtbevo || this.f21664eablkybsjg) {
                this.f21670wkgbmnqykc.iobyxmoadg(f13, f14);
                this.f21666iobyxmoadg.add(this.f21670wkgbmnqykc);
                this.f21664eablkybsjg = false;
            }
            this.f21670wkgbmnqykc = nufgyqmvbu.this.new ppxfxbqfkf(f17, f18, f17 - f15, f18 - f16);
            this.f21668nufgyqmvbu = false;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void wkgbmnqykc(float f13, float f14) {
            this.f21670wkgbmnqykc.iobyxmoadg(f13, f14);
            this.f21666iobyxmoadg.add(this.f21670wkgbmnqykc);
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            ppxfxbqfkf ppxfxbqfkfVar = this.f21670wkgbmnqykc;
            this.f21670wkgbmnqykc = nufgyqmvbuVar.new ppxfxbqfkf(f13, f14, f13 - ppxfxbqfkfVar.f21655iobyxmoadg, f14 - ppxfxbqfkfVar.f21658zoijcleaow);
            this.f21668nufgyqmvbu = false;
        }

        List zoijcleaow() {
            return this.f21666iobyxmoadg;
        }
    }

    nufgyqmvbu(Canvas canvas, float f13) {
        this.f21619iobyxmoadg = canvas;
        this.f21624zoijcleaow = f13;
    }

    private void a(C0391nufgyqmvbu c0391nufgyqmvbu, com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar) {
        if (sopmlzcsov(yadqdtsiqtVar, 4096L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21544lmojexxdyd = yadqdtsiqtVar.f21544lmojexxdyd;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 2048L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21534iozdgvuglv = yadqdtsiqtVar.f21534iozdgvuglv;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 1L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21560yggfygwlhe = yadqdtsiqtVar.f21560yggfygwlhe;
            com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVar = yadqdtsiqtVar.f21560yggfygwlhe;
            c0391nufgyqmvbu.f21652zoijcleaow = (dsvhmnatusVar == null || dsvhmnatusVar == com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo.f21425jyumaefscl) ? false : true;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 4L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21536iwizpuwonk = yadqdtsiqtVar.f21536iwizpuwonk;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 6149L)) {
            fmlbqenlif(c0391nufgyqmvbu, true, c0391nufgyqmvbu.f21647iobyxmoadg.f21560yggfygwlhe);
        }
        if (sopmlzcsov(yadqdtsiqtVar, 2L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21540jyumaefscl = yadqdtsiqtVar.f21540jyumaefscl;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 8L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21527cqumvgiudr = yadqdtsiqtVar.f21527cqumvgiudr;
            com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVar2 = yadqdtsiqtVar.f21527cqumvgiudr;
            c0391nufgyqmvbu.f21650ppxfxbqfkf = (dsvhmnatusVar2 == null || dsvhmnatusVar2 == com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo.f21425jyumaefscl) ? false : true;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 16L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21530esjtqupxsv = yadqdtsiqtVar.f21530esjtqupxsv;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 6168L)) {
            fmlbqenlif(c0391nufgyqmvbu, false, c0391nufgyqmvbu.f21647iobyxmoadg.f21527cqumvgiudr);
        }
        if (sopmlzcsov(yadqdtsiqtVar, 34359738368L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21541jztzpxfvev = yadqdtsiqtVar.f21541jztzpxfvev;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 32L)) {
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar2 = c0391nufgyqmvbu.f21647iobyxmoadg;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = yadqdtsiqtVar.f21543lereixgezr;
            yadqdtsiqtVar2.f21543lereixgezr = rgvfuqvkyqVar;
            c0391nufgyqmvbu.f21645eablkybsjg.setStrokeWidth(rgvfuqvkyqVar.ppxfxbqfkf(this));
        }
        if (sopmlzcsov(yadqdtsiqtVar, 64L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21549pmvmpeiblj = yadqdtsiqtVar.f21549pmvmpeiblj;
            int i13 = iobyxmoadg.f21639zoijcleaow[yadqdtsiqtVar.f21549pmvmpeiblj.ordinal()];
            if (i13 == 1) {
                c0391nufgyqmvbu.f21645eablkybsjg.setStrokeCap(Paint.Cap.BUTT);
            } else if (i13 == 2) {
                c0391nufgyqmvbu.f21645eablkybsjg.setStrokeCap(Paint.Cap.ROUND);
            } else if (i13 == 3) {
                c0391nufgyqmvbu.f21645eablkybsjg.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (sopmlzcsov(yadqdtsiqtVar, 128L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21563zynmafqrjb = yadqdtsiqtVar.f21563zynmafqrjb;
            int i14 = iobyxmoadg.f21638ppxfxbqfkf[yadqdtsiqtVar.f21563zynmafqrjb.ordinal()];
            if (i14 == 1) {
                c0391nufgyqmvbu.f21645eablkybsjg.setStrokeJoin(Paint.Join.MITER);
            } else if (i14 == 2) {
                c0391nufgyqmvbu.f21645eablkybsjg.setStrokeJoin(Paint.Join.ROUND);
            } else if (i14 == 3) {
                c0391nufgyqmvbu.f21645eablkybsjg.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (sopmlzcsov(yadqdtsiqtVar, 256L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21535istkbnxepw = yadqdtsiqtVar.f21535istkbnxepw;
            c0391nufgyqmvbu.f21645eablkybsjg.setStrokeMiter(yadqdtsiqtVar.f21535istkbnxepw.floatValue());
        }
        if (sopmlzcsov(yadqdtsiqtVar, 512L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21525cdpycssgdh = yadqdtsiqtVar.f21525cdpycssgdh;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 1024L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21559yadqdtsiqt = yadqdtsiqtVar.f21559yadqdtsiqt;
        }
        Typeface typefaceZdlpuopuiu = null;
        if (sopmlzcsov(yadqdtsiqtVar, 1536L)) {
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq[] rgvfuqvkyqVarArr = c0391nufgyqmvbu.f21647iobyxmoadg.f21525cdpycssgdh;
            if (rgvfuqvkyqVarArr == null) {
                c0391nufgyqmvbu.f21645eablkybsjg.setPathEffect(null);
            } else {
                int length = rgvfuqvkyqVarArr.length;
                int i15 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i15];
                float f13 = 0.0f;
                for (int i16 = 0; i16 < i15; i16++) {
                    float fPpxfxbqfkf = c0391nufgyqmvbu.f21647iobyxmoadg.f21525cdpycssgdh[i16 % length].ppxfxbqfkf(this);
                    fArr[i16] = fPpxfxbqfkf;
                    f13 += fPpxfxbqfkf;
                }
                if (f13 == 0.0f) {
                    c0391nufgyqmvbu.f21645eablkybsjg.setPathEffect(null);
                } else {
                    float fPpxfxbqfkf2 = c0391nufgyqmvbu.f21647iobyxmoadg.f21559yadqdtsiqt.ppxfxbqfkf(this);
                    if (fPpxfxbqfkf2 < 0.0f) {
                        fPpxfxbqfkf2 = (fPpxfxbqfkf2 % f13) + f13;
                    }
                    c0391nufgyqmvbu.f21645eablkybsjg.setPathEffect(new DashPathEffect(fArr, fPpxfxbqfkf2));
                }
            }
        }
        if (sopmlzcsov(yadqdtsiqtVar, 16384L)) {
            float fStevsuqkhv = stevsuqkhv();
            c0391nufgyqmvbu.f21647iobyxmoadg.f21561ylkuphrtab = yadqdtsiqtVar.f21561ylkuphrtab;
            c0391nufgyqmvbu.f21651wkgbmnqykc.setTextSize(yadqdtsiqtVar.f21561ylkuphrtab.wkgbmnqykc(this, fStevsuqkhv));
            c0391nufgyqmvbu.f21645eablkybsjg.setTextSize(yadqdtsiqtVar.f21561ylkuphrtab.wkgbmnqykc(this, fStevsuqkhv));
        }
        if (sopmlzcsov(yadqdtsiqtVar, 8192L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21556wwaezpbzkn = yadqdtsiqtVar.f21556wwaezpbzkn;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 32768L)) {
            if (yadqdtsiqtVar.f21548pkzmftpjix.intValue() == -1 && c0391nufgyqmvbu.f21647iobyxmoadg.f21548pkzmftpjix.intValue() > 100) {
                com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar3 = c0391nufgyqmvbu.f21647iobyxmoadg;
                yadqdtsiqtVar3.f21548pkzmftpjix = Integer.valueOf(yadqdtsiqtVar3.f21548pkzmftpjix.intValue() - 100);
            } else if (yadqdtsiqtVar.f21548pkzmftpjix.intValue() != 1 || c0391nufgyqmvbu.f21647iobyxmoadg.f21548pkzmftpjix.intValue() >= 900) {
                c0391nufgyqmvbu.f21647iobyxmoadg.f21548pkzmftpjix = yadqdtsiqtVar.f21548pkzmftpjix;
            } else {
                com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar4 = c0391nufgyqmvbu.f21647iobyxmoadg;
                yadqdtsiqtVar4.f21548pkzmftpjix = Integer.valueOf(yadqdtsiqtVar4.f21548pkzmftpjix.intValue() + 100);
            }
        }
        if (sopmlzcsov(yadqdtsiqtVar, 65536L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21531hcddaimhww = yadqdtsiqtVar.f21531hcddaimhww;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 106496L)) {
            if (c0391nufgyqmvbu.f21647iobyxmoadg.f21556wwaezpbzkn != null && this.f21622ppxfxbqfkf != null) {
                com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx();
                for (String str : c0391nufgyqmvbu.f21647iobyxmoadg.f21556wwaezpbzkn) {
                    com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar5 = c0391nufgyqmvbu.f21647iobyxmoadg;
                    typefaceZdlpuopuiu = zdlpuopuiu(str, yadqdtsiqtVar5.f21548pkzmftpjix, yadqdtsiqtVar5.f21531hcddaimhww);
                    if (typefaceZdlpuopuiu != null) {
                        break;
                    }
                }
            }
            if (typefaceZdlpuopuiu == null) {
                com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar6 = c0391nufgyqmvbu.f21647iobyxmoadg;
                typefaceZdlpuopuiu = zdlpuopuiu("serif", yadqdtsiqtVar6.f21548pkzmftpjix, yadqdtsiqtVar6.f21531hcddaimhww);
            }
            c0391nufgyqmvbu.f21651wkgbmnqykc.setTypeface(typefaceZdlpuopuiu);
            c0391nufgyqmvbu.f21645eablkybsjg.setTypeface(typefaceZdlpuopuiu);
        }
        if (sopmlzcsov(yadqdtsiqtVar, 131072L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21539jpowsppfya = yadqdtsiqtVar.f21539jpowsppfya;
            Paint paint = c0391nufgyqmvbu.f21651wkgbmnqykc;
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg enumC0390lqeggnwhkg = yadqdtsiqtVar.f21539jpowsppfya;
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg enumC0390lqeggnwhkg2 = com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg.LineThrough;
            paint.setStrikeThruText(enumC0390lqeggnwhkg == enumC0390lqeggnwhkg2);
            Paint paint2 = c0391nufgyqmvbu.f21651wkgbmnqykc;
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg enumC0390lqeggnwhkg3 = yadqdtsiqtVar.f21539jpowsppfya;
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg enumC0390lqeggnwhkg4 = com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.EnumC0390lqeggnwhkg.Underline;
            paint2.setUnderlineText(enumC0390lqeggnwhkg3 == enumC0390lqeggnwhkg4);
            c0391nufgyqmvbu.f21645eablkybsjg.setStrikeThruText(yadqdtsiqtVar.f21539jpowsppfya == enumC0390lqeggnwhkg2);
            c0391nufgyqmvbu.f21645eablkybsjg.setUnderlineText(yadqdtsiqtVar.f21539jpowsppfya == enumC0390lqeggnwhkg4);
        }
        if (sopmlzcsov(yadqdtsiqtVar, 68719476736L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21532hkdspvbjdz = yadqdtsiqtVar.f21532hkdspvbjdz;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 262144L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21526cllcsxoeiz = yadqdtsiqtVar.f21526cllcsxoeiz;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 524288L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21529dsvhmnatus = yadqdtsiqtVar.f21529dsvhmnatus;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 2097152L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21552stevsuqkhv = yadqdtsiqtVar.f21552stevsuqkhv;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 4194304L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21542kegysxyocb = yadqdtsiqtVar.f21542kegysxyocb;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 8388608L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21553tzroggbefp = yadqdtsiqtVar.f21553tzroggbefp;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 16777216L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21545mbcevpiqjq = yadqdtsiqtVar.f21545mbcevpiqjq;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 33554432L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21546ntlheqmsrt = yadqdtsiqtVar.f21546ntlheqmsrt;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 1048576L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21557wypolnanlu = yadqdtsiqtVar.f21557wypolnanlu;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 268435456L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21528crxdokpmqz = yadqdtsiqtVar.f21528crxdokpmqz;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 536870912L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21538jlmebxxoox = yadqdtsiqtVar.f21538jlmebxxoox;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 1073741824L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21550ribwqtqdhb = yadqdtsiqtVar.f21550ribwqtqdhb;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 67108864L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21554ulzqkzuiru = yadqdtsiqtVar.f21554ulzqkzuiru;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 134217728L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21551sopmlzcsov = yadqdtsiqtVar.f21551sopmlzcsov;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 8589934592L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21533ikoacuggdj = yadqdtsiqtVar.f21533ikoacuggdj;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 17179869184L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21547okpsazkaxt = yadqdtsiqtVar.f21547okpsazkaxt;
        }
        if (sopmlzcsov(yadqdtsiqtVar, 137438953472L)) {
            c0391nufgyqmvbu.f21647iobyxmoadg.f21558xrmfcynszj = yadqdtsiqtVar.f21558xrmfcynszj;
        }
    }

    private void ageimvtcrz(com.caverock.androidsvg.lqeggnwhkg.draadjrbmk draadjrbmkVar) {
        com.caverock.androidsvg.lqeggnwhkg.oxmwwwfdhm oxmwwwfdhmVar;
        com.caverock.androidsvg.lqeggnwhkg.oxmwwwfdhm oxmwwwfdhmVar2;
        com.caverock.androidsvg.lqeggnwhkg.oxmwwwfdhm oxmwwwfdhmVar3;
        List listGtknphoqwx;
        int size;
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar = this.f21623wkgbmnqykc.f21647iobyxmoadg;
        String str = yadqdtsiqtVar.f21552stevsuqkhv;
        if (str == null && yadqdtsiqtVar.f21542kegysxyocb == null && yadqdtsiqtVar.f21553tzroggbefp == null) {
            return;
        }
        if (str == null) {
            oxmwwwfdhmVar = null;
        } else {
            com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = draadjrbmkVar.f21405iobyxmoadg.oxmwwwfdhm(str);
            if (cllcsxoeizVarOxmwwwfdhm != null) {
                oxmwwwfdhmVar = (com.caverock.androidsvg.lqeggnwhkg.oxmwwwfdhm) cllcsxoeizVarOxmwwwfdhm;
            } else {
                iozdgvuglv("Marker reference '%s' not found", this.f21623wkgbmnqykc.f21647iobyxmoadg.f21552stevsuqkhv);
                oxmwwwfdhmVar = null;
            }
        }
        String str2 = this.f21623wkgbmnqykc.f21647iobyxmoadg.f21542kegysxyocb;
        if (str2 == null) {
            oxmwwwfdhmVar2 = null;
        } else {
            com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm2 = draadjrbmkVar.f21405iobyxmoadg.oxmwwwfdhm(str2);
            if (cllcsxoeizVarOxmwwwfdhm2 != null) {
                oxmwwwfdhmVar2 = (com.caverock.androidsvg.lqeggnwhkg.oxmwwwfdhm) cllcsxoeizVarOxmwwwfdhm2;
            } else {
                iozdgvuglv("Marker reference '%s' not found", this.f21623wkgbmnqykc.f21647iobyxmoadg.f21542kegysxyocb);
                oxmwwwfdhmVar2 = null;
            }
        }
        String str3 = this.f21623wkgbmnqykc.f21647iobyxmoadg.f21553tzroggbefp;
        if (str3 == null) {
            oxmwwwfdhmVar3 = null;
        } else {
            com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm3 = draadjrbmkVar.f21405iobyxmoadg.oxmwwwfdhm(str3);
            if (cllcsxoeizVarOxmwwwfdhm3 != null) {
                oxmwwwfdhmVar3 = (com.caverock.androidsvg.lqeggnwhkg.oxmwwwfdhm) cllcsxoeizVarOxmwwwfdhm3;
            } else {
                iozdgvuglv("Marker reference '%s' not found", this.f21623wkgbmnqykc.f21647iobyxmoadg.f21553tzroggbefp);
                oxmwwwfdhmVar3 = null;
            }
        }
        if (draadjrbmkVar instanceof com.caverock.androidsvg.lqeggnwhkg.jyumaefscl) {
            listGtknphoqwx = new zoijcleaow(((com.caverock.androidsvg.lqeggnwhkg.jyumaefscl) draadjrbmkVar).f21450ojitshcjhn).zoijcleaow();
        } else {
            listGtknphoqwx = draadjrbmkVar instanceof com.caverock.androidsvg.lqeggnwhkg.vdvldrhtss ? gtknphoqwx((com.caverock.androidsvg.lqeggnwhkg.vdvldrhtss) draadjrbmkVar) : draadjrbmk((com.caverock.androidsvg.lqeggnwhkg.lereixgezr) draadjrbmkVar);
        }
        if (listGtknphoqwx == null || (size = listGtknphoqwx.size()) == 0) {
            return;
        }
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar2 = this.f21623wkgbmnqykc.f21647iobyxmoadg;
        yadqdtsiqtVar2.f21553tzroggbefp = null;
        yadqdtsiqtVar2.f21542kegysxyocb = null;
        yadqdtsiqtVar2.f21552stevsuqkhv = null;
        if (oxmwwwfdhmVar != null) {
            fiwbwshyhd(oxmwwwfdhmVar, (ppxfxbqfkf) listGtknphoqwx.get(0));
        }
        if (oxmwwwfdhmVar2 != null && listGtknphoqwx.size() > 2) {
            ppxfxbqfkf ppxfxbqfkfVarZfvoamnweg = (ppxfxbqfkf) listGtknphoqwx.get(0);
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) listGtknphoqwx.get(1);
            int i13 = 1;
            while (i13 < size - 1) {
                i13++;
                ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) listGtknphoqwx.get(i13);
                ppxfxbqfkfVarZfvoamnweg = ppxfxbqfkfVar.f21653eablkybsjg ? zfvoamnweg(ppxfxbqfkfVarZfvoamnweg, ppxfxbqfkfVar, ppxfxbqfkfVar2) : ppxfxbqfkfVar;
                fiwbwshyhd(oxmwwwfdhmVar2, ppxfxbqfkfVarZfvoamnweg);
                ppxfxbqfkfVar = ppxfxbqfkfVar2;
            }
        }
        if (oxmwwwfdhmVar3 != null) {
            fiwbwshyhd(oxmwwwfdhmVar3, (ppxfxbqfkf) listGtknphoqwx.get(size - 1));
        }
    }

    private float agtfadlqog(com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox jlmebxxooxVar) {
        gtknphoqwx gtknphoqwxVar = new gtknphoqwx(this, null);
        yadqdtsiqt(jlmebxxooxVar, gtknphoqwxVar);
        return gtknphoqwxVar.f21633zoijcleaow;
    }

    private void auzgnhcxok(com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv iozdgvuglvVar, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar2, com.caverock.androidsvg.eablkybsjg eablkybsjgVar) {
        esjtqupxsv("Svg render", new Object[0]);
        if (zoijcleaowVar.f21607ppxfxbqfkf == 0.0f || zoijcleaowVar.f21608wkgbmnqykc == 0.0f) {
            return;
        }
        if (eablkybsjgVar == null && (eablkybsjgVar = iozdgvuglvVar.f21524ojitshcjhn) == null) {
            eablkybsjgVar = com.caverock.androidsvg.eablkybsjg.f21363eablkybsjg;
        }
        b(this.f21623wkgbmnqykc, iozdgvuglvVar);
        if (pmvmpeiblj()) {
            C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
            c0391nufgyqmvbu.f21646gxszxtbevo = zoijcleaowVar;
            if (!c0391nufgyqmvbu.f21647iobyxmoadg.f21529dsvhmnatus.booleanValue()) {
                com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar3 = this.f21623wkgbmnqykc.f21646gxszxtbevo;
                jrbgnlbqoe(zoijcleaowVar3.f21606iobyxmoadg, zoijcleaowVar3.f21609zoijcleaow, zoijcleaowVar3.f21607ppxfxbqfkf, zoijcleaowVar3.f21608wkgbmnqykc);
            }
            vdvldrhtss(iozdgvuglvVar, this.f21623wkgbmnqykc.f21646gxszxtbevo);
            if (zoijcleaowVar2 != null) {
                this.f21619iobyxmoadg.concat(ojitshcjhn(this.f21623wkgbmnqykc.f21646gxszxtbevo, zoijcleaowVar2, eablkybsjgVar));
                this.f21623wkgbmnqykc.f21648lqeggnwhkg = iozdgvuglvVar.f21463rgvfuqvkyq;
            } else {
                Canvas canvas = this.f21619iobyxmoadg;
                com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar4 = this.f21623wkgbmnqykc.f21646gxszxtbevo;
                canvas.translate(zoijcleaowVar4.f21606iobyxmoadg, zoijcleaowVar4.f21609zoijcleaow);
            }
            boolean zSflfametgt = sflfametgt();
            c();
            wizcaqwiak(iozdgvuglvVar, true);
            if (zSflfametgt) {
                uwvvkdfqfp(iozdgvuglvVar);
            }
            krqnebusok(iozdgvuglvVar);
        }
    }

    private void b(C0391nufgyqmvbu c0391nufgyqmvbu, com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVar) {
        c0391nufgyqmvbu.f21647iobyxmoadg.zoijcleaow(jpowsppfyaVar.f21406zoijcleaow == null);
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar = jpowsppfyaVar.f21445eablkybsjg;
        if (yadqdtsiqtVar != null) {
            a(c0391nufgyqmvbu, yadqdtsiqtVar);
        }
        if (this.f21622ppxfxbqfkf.agtfadlqog()) {
            for (com.caverock.androidsvg.zoijcleaow.rgvfuqvkyq rgvfuqvkyqVar : this.f21622ppxfxbqfkf.wkgbmnqykc()) {
                if (com.caverock.androidsvg.zoijcleaow.draadjrbmk(this.f21621nufgyqmvbu, rgvfuqvkyqVar.f21740iobyxmoadg, jpowsppfyaVar)) {
                    a(c0391nufgyqmvbu, rgvfuqvkyqVar.f21742zoijcleaow);
                }
            }
        }
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar2 = jpowsppfyaVar.f21446gxszxtbevo;
        if (yadqdtsiqtVar2 != null) {
            a(c0391nufgyqmvbu, yadqdtsiqtVar2);
        }
    }

    private void bfopjjpdmp(com.caverock.androidsvg.lqeggnwhkg.dxjokdxxww dxjokdxxwwVar) {
        esjtqupxsv("Ellipse render", new Object[0]);
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = dxjokdxxwwVar.f21411vdvldrhtss;
        if (rgvfuqvkyqVar == null || dxjokdxxwwVar.f21409oxmwwwfdhm == null || rgvfuqvkyqVar.nufgyqmvbu() || dxjokdxxwwVar.f21409oxmwwwfdhm.nufgyqmvbu()) {
            return;
        }
        b(this.f21623wkgbmnqykc, dxjokdxxwwVar);
        if (pmvmpeiblj() && d()) {
            Matrix matrix = dxjokdxxwwVar.f21407agtfadlqog;
            if (matrix != null) {
                this.f21619iobyxmoadg.concat(matrix);
            }
            Path pathRibwqtqdhb = ribwqtqdhb(dxjokdxxwwVar);
            krqnebusok(dxjokdxxwwVar);
            oxmwwwfdhm(dxjokdxxwwVar);
            rgvfuqvkyq(dxjokdxxwwVar);
            boolean zSflfametgt = sflfametgt();
            if (this.f21623wkgbmnqykc.f21652zoijcleaow) {
                zynmafqrjb(dxjokdxxwwVar, pathRibwqtqdhb);
            }
            if (this.f21623wkgbmnqykc.f21650ppxfxbqfkf) {
                istkbnxepw(pathRibwqtqdhb);
            }
            if (zSflfametgt) {
                uwvvkdfqfp(dxjokdxxwwVar);
            }
        }
    }

    private Path btonecajqb(com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar) {
        Path pathMetgxyhuhe;
        com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = hcddaimhwwVar.f21405iobyxmoadg.oxmwwwfdhm(this.f21623wkgbmnqykc.f21647iobyxmoadg.f21528crxdokpmqz);
        if (cllcsxoeizVarOxmwwwfdhm == null) {
            iozdgvuglv("ClipPath reference '%s' not found", this.f21623wkgbmnqykc.f21647iobyxmoadg.f21528crxdokpmqz);
            return null;
        }
        com.caverock.androidsvg.lqeggnwhkg.eablkybsjg eablkybsjgVar = (com.caverock.androidsvg.lqeggnwhkg.eablkybsjg) cllcsxoeizVarOxmwwwfdhm;
        this.f21617eablkybsjg.push(this.f21623wkgbmnqykc);
        this.f21623wkgbmnqykc = hkdspvbjdz(eablkybsjgVar);
        Boolean bool = eablkybsjgVar.f21412rgvfuqvkyq;
        boolean z13 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z13) {
            matrix.preTranslate(zoijcleaowVar.f21606iobyxmoadg, zoijcleaowVar.f21609zoijcleaow);
            matrix.preScale(zoijcleaowVar.f21607ppxfxbqfkf, zoijcleaowVar.f21608wkgbmnqykc);
        }
        Matrix matrix2 = eablkybsjgVar.f21514ojitshcjhn;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVar : eablkybsjgVar.f21521dxjokdxxww) {
            if ((cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.hcddaimhww) && (pathMetgxyhuhe = metgxyhuhe((com.caverock.androidsvg.lqeggnwhkg.hcddaimhww) cllcsxoeizVar, true)) != null) {
                path.op(pathMetgxyhuhe, Path.Op.UNION);
            }
        }
        if (this.f21623wkgbmnqykc.f21647iobyxmoadg.f21528crxdokpmqz != null) {
            if (eablkybsjgVar.f21428nufgyqmvbu == null) {
                eablkybsjgVar.f21428nufgyqmvbu = wflxmlrfwp(path);
            }
            Path pathBtonecajqb = btonecajqb(eablkybsjgVar, eablkybsjgVar.f21428nufgyqmvbu);
            if (pathBtonecajqb != null) {
                path.op(pathBtonecajqb, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f21623wkgbmnqykc = (C0391nufgyqmvbu) this.f21617eablkybsjg.pop();
        return path;
    }

    private void c() {
        int iCqumvgiudr;
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar = this.f21623wkgbmnqykc.f21647iobyxmoadg;
        com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVar = yadqdtsiqtVar.f21533ikoacuggdj;
        if (dsvhmnatusVar instanceof com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo) {
            iCqumvgiudr = ((com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo) dsvhmnatusVar).f21427zdlpuopuiu;
        } else if (!(dsvhmnatusVar instanceof com.caverock.androidsvg.lqeggnwhkg.C0389lqeggnwhkg)) {
            return;
        } else {
            iCqumvgiudr = yadqdtsiqtVar.f21544lmojexxdyd.f21427zdlpuopuiu;
        }
        Float f13 = yadqdtsiqtVar.f21547okpsazkaxt;
        if (f13 != null) {
            iCqumvgiudr = cqumvgiudr(iCqumvgiudr, f13.floatValue());
        }
        this.f21619iobyxmoadg.drawColor(iCqumvgiudr);
    }

    private float cdpycssgdh(float f13, float f14, float f15, float f16) {
        return (f13 * f15) + (f14 * f16);
    }

    private C0391nufgyqmvbu cllcsxoeiz(com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVar, C0391nufgyqmvbu c0391nufgyqmvbu) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.jpowsppfya) {
                arrayList.add(0, (com.caverock.androidsvg.lqeggnwhkg.jpowsppfya) cllcsxoeizVar);
            }
            Object obj = cllcsxoeizVar.f21406zoijcleaow;
            if (obj == null) {
                break;
            }
            cllcsxoeizVar = (com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(c0391nufgyqmvbu, (com.caverock.androidsvg.lqeggnwhkg.jpowsppfya) it.next());
        }
        C0391nufgyqmvbu c0391nufgyqmvbu2 = this.f21623wkgbmnqykc;
        c0391nufgyqmvbu.f21648lqeggnwhkg = c0391nufgyqmvbu2.f21648lqeggnwhkg;
        c0391nufgyqmvbu.f21646gxszxtbevo = c0391nufgyqmvbu2.f21646gxszxtbevo;
        return c0391nufgyqmvbu;
    }

    private static int cqumvgiudr(int i13, float f13) {
        int i14 = KotlinVersion.MAX_COMPONENT_VALUE;
        int iRound = Math.round(((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) * f13);
        if (iRound < 0) {
            i14 = 0;
        } else if (iRound <= 255) {
            i14 = iRound;
        }
        return (i13 & 16777215) | (i14 << 24);
    }

    private void crxdokpmqz(boolean z13, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar, com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz hkdspvbjdzVar) {
        float f13;
        float fWkgbmnqykc;
        float f14;
        float f15;
        String str = hkdspvbjdzVar.f21400draadjrbmk;
        if (str != null) {
            wwaezpbzkn(hkdspvbjdzVar, str);
        }
        Boolean bool = hkdspvbjdzVar.f21401dxjokdxxww;
        int i13 = 0;
        boolean z14 = bool != null && bool.booleanValue();
        C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
        Paint paint = z13 ? c0391nufgyqmvbu.f21651wkgbmnqykc : c0391nufgyqmvbu.f21645eablkybsjg;
        if (z14) {
            com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVarTzroggbefp = tzroggbefp();
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = hkdspvbjdzVar.f21432wflxmlrfwp;
            float fEablkybsjg = rgvfuqvkyqVar != null ? rgvfuqvkyqVar.eablkybsjg(this) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = hkdspvbjdzVar.f21429agtfadlqog;
            float fGxszxtbevo = rgvfuqvkyqVar2 != null ? rgvfuqvkyqVar2.gxszxtbevo(this) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar3 = hkdspvbjdzVar.f21430ojitshcjhn;
            float fEablkybsjg2 = rgvfuqvkyqVar3 != null ? rgvfuqvkyqVar3.eablkybsjg(this) : zoijcleaowVarTzroggbefp.f21607ppxfxbqfkf;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar4 = hkdspvbjdzVar.f21431rgvfuqvkyq;
            f15 = fEablkybsjg2;
            f13 = fEablkybsjg;
            f14 = fGxszxtbevo;
            fWkgbmnqykc = rgvfuqvkyqVar4 != null ? rgvfuqvkyqVar4.gxszxtbevo(this) : 0.0f;
        } else {
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar5 = hkdspvbjdzVar.f21432wflxmlrfwp;
            float fWkgbmnqykc2 = rgvfuqvkyqVar5 != null ? rgvfuqvkyqVar5.wkgbmnqykc(this, 1.0f) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar6 = hkdspvbjdzVar.f21429agtfadlqog;
            float fWkgbmnqykc3 = rgvfuqvkyqVar6 != null ? rgvfuqvkyqVar6.wkgbmnqykc(this, 1.0f) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar7 = hkdspvbjdzVar.f21430ojitshcjhn;
            float fWkgbmnqykc4 = rgvfuqvkyqVar7 != null ? rgvfuqvkyqVar7.wkgbmnqykc(this, 1.0f) : 1.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar8 = hkdspvbjdzVar.f21431rgvfuqvkyq;
            f13 = fWkgbmnqykc2;
            fWkgbmnqykc = rgvfuqvkyqVar8 != null ? rgvfuqvkyqVar8.wkgbmnqykc(this, 1.0f) : 0.0f;
            f14 = fWkgbmnqykc3;
            f15 = fWkgbmnqykc4;
        }
        yzdjzghtvl();
        this.f21623wkgbmnqykc = hkdspvbjdz(hkdspvbjdzVar);
        Matrix matrix = new Matrix();
        if (!z14) {
            matrix.preTranslate(zoijcleaowVar.f21606iobyxmoadg, zoijcleaowVar.f21609zoijcleaow);
            matrix.preScale(zoijcleaowVar.f21607ppxfxbqfkf, zoijcleaowVar.f21608wkgbmnqykc);
        }
        Matrix matrix2 = hkdspvbjdzVar.f21399btonecajqb;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = hkdspvbjdzVar.f21403nufgyqmvbu.size();
        if (size == 0) {
            rhgxfdycjh();
            if (z13) {
                this.f21623wkgbmnqykc.f21652zoijcleaow = false;
                return;
            } else {
                this.f21623wkgbmnqykc.f21650ppxfxbqfkf = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = hkdspvbjdzVar.f21403nufgyqmvbu.iterator();
        float f16 = -1.0f;
        while (it.hasNext()) {
            com.caverock.androidsvg.lqeggnwhkg.cdpycssgdh cdpycssgdhVar = (com.caverock.androidsvg.lqeggnwhkg.cdpycssgdh) ((com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) it.next());
            Float f17 = cdpycssgdhVar.f21404nufgyqmvbu;
            float fFloatValue = f17 != null ? f17.floatValue() : 0.0f;
            if (i13 == 0 || fFloatValue >= f16) {
                fArr[i13] = fFloatValue;
                f16 = fFloatValue;
            } else {
                fArr[i13] = f16;
            }
            yzdjzghtvl();
            b(this.f21623wkgbmnqykc, cdpycssgdhVar);
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar = this.f21623wkgbmnqykc.f21647iobyxmoadg;
            com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo gxszxtbevoVar = (com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo) yadqdtsiqtVar.f21554ulzqkzuiru;
            if (gxszxtbevoVar == null) {
                gxszxtbevoVar = com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo.f21426yggfygwlhe;
            }
            iArr[i13] = cqumvgiudr(gxszxtbevoVar.f21427zdlpuopuiu, yadqdtsiqtVar.f21551sopmlzcsov.floatValue());
            i13++;
            rhgxfdycjh();
        }
        if ((f13 == f15 && f14 == fWkgbmnqykc) || size == 1) {
            rhgxfdycjh();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx gtknphoqwxVar = hkdspvbjdzVar.f21402gtknphoqwx;
        if (gtknphoqwxVar != null) {
            if (gtknphoqwxVar == com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gtknphoqwxVar == com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        rhgxfdycjh();
        LinearGradient linearGradient = new LinearGradient(f13, f14, f15, fWkgbmnqykc, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(iwizpuwonk(this.f21623wkgbmnqykc.f21647iobyxmoadg.f21536iwizpuwonk.floatValue()));
    }

    private void czzsidtyhn(com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar) {
        this.f21618gxszxtbevo.push(pkzmftpjixVar);
        this.f21620lqeggnwhkg.push(this.f21619iobyxmoadg.getMatrix());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        Boolean bool = this.f21623wkgbmnqykc.f21647iobyxmoadg.f21546ntlheqmsrt;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private List draadjrbmk(com.caverock.androidsvg.lqeggnwhkg.lereixgezr lereixgezrVar) {
        int length = lereixgezrVar.f21464ojitshcjhn.length;
        int i13 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = lereixgezrVar.f21464ojitshcjhn;
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(fArr[0], fArr[1], 0.0f, 0.0f);
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (i13 < length) {
            float[] fArr2 = lereixgezrVar.f21464ojitshcjhn;
            float f15 = fArr2[i13];
            float f16 = fArr2[i13 + 1];
            ppxfxbqfkfVar.iobyxmoadg(f15, f16);
            arrayList.add(ppxfxbqfkfVar);
            i13 += 2;
            ppxfxbqfkfVar = new ppxfxbqfkf(f15, f16, f15 - ppxfxbqfkfVar.f21655iobyxmoadg, f16 - ppxfxbqfkfVar.f21658zoijcleaow);
            f14 = f16;
            f13 = f15;
        }
        if (lereixgezrVar instanceof com.caverock.androidsvg.lqeggnwhkg.pmvmpeiblj) {
            float[] fArr3 = lereixgezrVar.f21464ojitshcjhn;
            float f17 = fArr3[0];
            if (f13 != f17) {
                float f18 = fArr3[1];
                if (f14 != f18) {
                    ppxfxbqfkfVar.iobyxmoadg(f17, f18);
                    arrayList.add(ppxfxbqfkfVar);
                    ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf(f17, f18, f17 - ppxfxbqfkfVar.f21655iobyxmoadg, f18 - ppxfxbqfkfVar.f21658zoijcleaow);
                    ppxfxbqfkfVar2.zoijcleaow((ppxfxbqfkf) arrayList.get(0));
                    arrayList.add(ppxfxbqfkfVar2);
                    arrayList.set(0, ppxfxbqfkfVar2);
                }
            }
        } else {
            arrayList.add(ppxfxbqfkfVar);
        }
        return arrayList;
    }

    private com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo dsvhmnatus() {
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo gxszxtbevoVar;
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar = this.f21623wkgbmnqykc.f21647iobyxmoadg;
        if (yadqdtsiqtVar.f21532hkdspvbjdz == com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.nufgyqmvbu.LTR || (gxszxtbevoVar = yadqdtsiqtVar.f21526cllcsxoeiz) == com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Middle) {
            return yadqdtsiqtVar.f21526cllcsxoeiz;
        }
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo gxszxtbevoVar2 = com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Start;
        return gxszxtbevoVar == gxszxtbevoVar2 ? com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.End : gxszxtbevoVar2;
    }

    private void dvvnrvtcbc(com.caverock.androidsvg.lqeggnwhkg.tzroggbefp tzroggbefpVar) {
        esjtqupxsv("Switch render", new Object[0]);
        b(this.f21623wkgbmnqykc, tzroggbefpVar);
        if (pmvmpeiblj()) {
            Matrix matrix = tzroggbefpVar.f21514ojitshcjhn;
            if (matrix != null) {
                this.f21619iobyxmoadg.concat(matrix);
            }
            rgvfuqvkyq(tzroggbefpVar);
            boolean zSflfametgt = sflfametgt();
            ipoelvxyzq(tzroggbefpVar);
            if (zSflfametgt) {
                uwvvkdfqfp(tzroggbefpVar);
            }
            krqnebusok(tzroggbefpVar);
        }
    }

    private static float[] dxjokdxxww(double d13, double d14) {
        int iCeil = (int) Math.ceil((Math.abs(d14) * 2.0d) / 3.141592653589793d);
        double d15 = d14 / ((double) iCeil);
        double d16 = d15 / 2.0d;
        double dSin = (Math.sin(d16) * 1.3333333333333333d) / (Math.cos(d16) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i13 = 0;
        int i14 = 0;
        while (i13 < iCeil) {
            double d17 = d13 + (((double) i13) * d15);
            double dCos = Math.cos(d17);
            double dSin2 = Math.sin(d17);
            double d18 = d15;
            fArr[i14] = (float) (dCos - (dSin * dSin2));
            fArr[i14 + 1] = (float) (dSin2 + (dCos * dSin));
            double d19 = d17 + d18;
            double dCos2 = Math.cos(d19);
            double dSin3 = Math.sin(d19);
            fArr[i14 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr[i14 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i15 = i14 + 5;
            fArr[i14 + 4] = (float) dCos2;
            i14 += 6;
            fArr[i15] = (float) dSin3;
            i13++;
            d15 = d18;
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void esjtqupxsv(String str, Object... objArr) {
    }

    private String eslsurpljm(String str, boolean z13, boolean z14) {
        if (this.f21623wkgbmnqykc.f21649nufgyqmvbu) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z13) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z14) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private void ezmngbhpjk(boolean z13, com.caverock.androidsvg.lqeggnwhkg.istkbnxepw istkbnxepwVar) {
        if (z13) {
            if (sopmlzcsov(istkbnxepwVar.f21445eablkybsjg, 2147483648L)) {
                C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
                com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar = c0391nufgyqmvbu.f21647iobyxmoadg;
                com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVar = istkbnxepwVar.f21445eablkybsjg.f21555vipkmwdibw;
                yadqdtsiqtVar.f21560yggfygwlhe = dsvhmnatusVar;
                c0391nufgyqmvbu.f21652zoijcleaow = dsvhmnatusVar != null;
            }
            if (sopmlzcsov(istkbnxepwVar.f21445eablkybsjg, 4294967296L)) {
                this.f21623wkgbmnqykc.f21647iobyxmoadg.f21536iwizpuwonk = istkbnxepwVar.f21445eablkybsjg.f21537jhduphickx;
            }
            if (sopmlzcsov(istkbnxepwVar.f21445eablkybsjg, 6442450944L)) {
                C0391nufgyqmvbu c0391nufgyqmvbu2 = this.f21623wkgbmnqykc;
                fmlbqenlif(c0391nufgyqmvbu2, z13, c0391nufgyqmvbu2.f21647iobyxmoadg.f21560yggfygwlhe);
                return;
            }
            return;
        }
        if (sopmlzcsov(istkbnxepwVar.f21445eablkybsjg, 2147483648L)) {
            C0391nufgyqmvbu c0391nufgyqmvbu3 = this.f21623wkgbmnqykc;
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar2 = c0391nufgyqmvbu3.f21647iobyxmoadg;
            com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVar2 = istkbnxepwVar.f21445eablkybsjg.f21555vipkmwdibw;
            yadqdtsiqtVar2.f21527cqumvgiudr = dsvhmnatusVar2;
            c0391nufgyqmvbu3.f21650ppxfxbqfkf = dsvhmnatusVar2 != null;
        }
        if (sopmlzcsov(istkbnxepwVar.f21445eablkybsjg, 4294967296L)) {
            this.f21623wkgbmnqykc.f21647iobyxmoadg.f21530esjtqupxsv = istkbnxepwVar.f21445eablkybsjg.f21537jhduphickx;
        }
        if (sopmlzcsov(istkbnxepwVar.f21445eablkybsjg, 6442450944L)) {
            C0391nufgyqmvbu c0391nufgyqmvbu4 = this.f21623wkgbmnqykc;
            fmlbqenlif(c0391nufgyqmvbu4, z13, c0391nufgyqmvbu4.f21647iobyxmoadg.f21527cqumvgiudr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void fiwbwshyhd(com.caverock.androidsvg.lqeggnwhkg.oxmwwwfdhm r12, com.caverock.androidsvg.nufgyqmvbu.ppxfxbqfkf r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.nufgyqmvbu.fiwbwshyhd(com.caverock.androidsvg.lqeggnwhkg$oxmwwwfdhm, com.caverock.androidsvg.nufgyqmvbu$ppxfxbqfkf):void");
    }

    private void fmlbqenlif(C0391nufgyqmvbu c0391nufgyqmvbu, boolean z13, com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVar) {
        int i13;
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar = c0391nufgyqmvbu.f21647iobyxmoadg;
        float fFloatValue = (z13 ? yadqdtsiqtVar.f21536iwizpuwonk : yadqdtsiqtVar.f21530esjtqupxsv).floatValue();
        if (dsvhmnatusVar instanceof com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo) {
            i13 = ((com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo) dsvhmnatusVar).f21427zdlpuopuiu;
        } else if (!(dsvhmnatusVar instanceof com.caverock.androidsvg.lqeggnwhkg.C0389lqeggnwhkg)) {
            return;
        } else {
            i13 = c0391nufgyqmvbu.f21647iobyxmoadg.f21544lmojexxdyd.f21427zdlpuopuiu;
        }
        int iCqumvgiudr = cqumvgiudr(i13, fFloatValue);
        if (z13) {
            c0391nufgyqmvbu.f21651wkgbmnqykc.setColor(iCqumvgiudr);
        } else {
            c0391nufgyqmvbu.f21645eablkybsjg.setColor(iCqumvgiudr);
        }
    }

    private void fyldjkxazc(com.caverock.androidsvg.lqeggnwhkg.kcexrzcfyt kcexrzcfytVar, com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar) {
        float fEablkybsjg;
        float fGxszxtbevo;
        esjtqupxsv("Mask render", new Object[0]);
        Boolean bool = kcexrzcfytVar.f21458ojitshcjhn;
        if (bool == null || !bool.booleanValue()) {
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = kcexrzcfytVar.f21457kcexrzcfyt;
            float fWkgbmnqykc = rgvfuqvkyqVar != null ? rgvfuqvkyqVar.wkgbmnqykc(this, 1.0f) : 1.2f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = kcexrzcfytVar.f21462zdlpuopuiu;
            float fWkgbmnqykc2 = rgvfuqvkyqVar2 != null ? rgvfuqvkyqVar2.wkgbmnqykc(this, 1.0f) : 1.2f;
            fEablkybsjg = fWkgbmnqykc * zoijcleaowVar.f21607ppxfxbqfkf;
            fGxszxtbevo = fWkgbmnqykc2 * zoijcleaowVar.f21608wkgbmnqykc;
        } else {
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar3 = kcexrzcfytVar.f21457kcexrzcfyt;
            fEablkybsjg = rgvfuqvkyqVar3 != null ? rgvfuqvkyqVar3.eablkybsjg(this) : zoijcleaowVar.f21607ppxfxbqfkf;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar4 = kcexrzcfytVar.f21462zdlpuopuiu;
            fGxszxtbevo = rgvfuqvkyqVar4 != null ? rgvfuqvkyqVar4.gxszxtbevo(this) : zoijcleaowVar.f21608wkgbmnqykc;
        }
        if (fEablkybsjg == 0.0f || fGxszxtbevo == 0.0f) {
            return;
        }
        yzdjzghtvl();
        C0391nufgyqmvbu c0391nufgyqmvbuHkdspvbjdz = hkdspvbjdz(kcexrzcfytVar);
        this.f21623wkgbmnqykc = c0391nufgyqmvbuHkdspvbjdz;
        c0391nufgyqmvbuHkdspvbjdz.f21647iobyxmoadg.f21534iozdgvuglv = Float.valueOf(1.0f);
        boolean zSflfametgt = sflfametgt();
        this.f21619iobyxmoadg.save();
        Boolean bool2 = kcexrzcfytVar.f21460rgvfuqvkyq;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f21619iobyxmoadg.translate(zoijcleaowVar.f21606iobyxmoadg, zoijcleaowVar.f21609zoijcleaow);
            this.f21619iobyxmoadg.scale(zoijcleaowVar.f21607ppxfxbqfkf, zoijcleaowVar.f21608wkgbmnqykc);
        }
        wizcaqwiak(kcexrzcfytVar, false);
        this.f21619iobyxmoadg.restore();
        if (zSflfametgt) {
            yfnezrywwk(hcddaimhwwVar, zoijcleaowVar);
        }
        rhgxfdycjh();
    }

    private void grlcpdaxtj(com.caverock.androidsvg.lqeggnwhkg.ribwqtqdhb ribwqtqdhbVar) {
        esjtqupxsv("TextPath render", new Object[0]);
        b(this.f21623wkgbmnqykc, ribwqtqdhbVar);
        if (pmvmpeiblj() && d()) {
            com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = ribwqtqdhbVar.f21405iobyxmoadg.oxmwwwfdhm(ribwqtqdhbVar.f21496ojitshcjhn);
            if (cllcsxoeizVarOxmwwwfdhm == null) {
                iozdgvuglv("TextPath reference '%s' not found", ribwqtqdhbVar.f21496ojitshcjhn);
                return;
            }
            com.caverock.androidsvg.lqeggnwhkg.jyumaefscl jyumaefsclVar = (com.caverock.androidsvg.lqeggnwhkg.jyumaefscl) cllcsxoeizVarOxmwwwfdhm;
            Path pathZoijcleaow = new wkgbmnqykc(jyumaefsclVar.f21450ojitshcjhn).zoijcleaow();
            Matrix matrix = jyumaefsclVar.f21407agtfadlqog;
            if (matrix != null) {
                pathZoijcleaow.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathZoijcleaow, false);
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = ribwqtqdhbVar.f21497rgvfuqvkyq;
            float fWkgbmnqykc = rgvfuqvkyqVar != null ? rgvfuqvkyqVar.wkgbmnqykc(this, pathMeasure.getLength()) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo gxszxtbevoVarDsvhmnatus = dsvhmnatus();
            if (gxszxtbevoVarDsvhmnatus != com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Start) {
                float fAgtfadlqog = agtfadlqog(ribwqtqdhbVar);
                if (gxszxtbevoVarDsvhmnatus == com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Middle) {
                    fAgtfadlqog /= 2.0f;
                }
                fWkgbmnqykc -= fAgtfadlqog;
            }
            oxmwwwfdhm((com.caverock.androidsvg.lqeggnwhkg.hcddaimhww) ribwqtqdhbVar.eablkybsjg());
            boolean zSflfametgt = sflfametgt();
            yadqdtsiqt(ribwqtqdhbVar, new eablkybsjg(pathZoijcleaow, fWkgbmnqykc, 0.0f));
            if (zSflfametgt) {
                uwvvkdfqfp(ribwqtqdhbVar);
            }
        }
    }

    private List gtknphoqwx(com.caverock.androidsvg.lqeggnwhkg.vdvldrhtss vdvldrhtssVar) {
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = vdvldrhtssVar.f21506ojitshcjhn;
        float fEablkybsjg = rgvfuqvkyqVar != null ? rgvfuqvkyqVar.eablkybsjg(this) : 0.0f;
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = vdvldrhtssVar.f21508rgvfuqvkyq;
        float fGxszxtbevo = rgvfuqvkyqVar2 != null ? rgvfuqvkyqVar2.gxszxtbevo(this) : 0.0f;
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar3 = vdvldrhtssVar.f21509vdvldrhtss;
        float fEablkybsjg2 = rgvfuqvkyqVar3 != null ? rgvfuqvkyqVar3.eablkybsjg(this) : 0.0f;
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar4 = vdvldrhtssVar.f21507oxmwwwfdhm;
        float fGxszxtbevo2 = rgvfuqvkyqVar4 != null ? rgvfuqvkyqVar4.gxszxtbevo(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f13 = fEablkybsjg2 - fEablkybsjg;
        float f14 = fGxszxtbevo2 - fGxszxtbevo;
        arrayList.add(new ppxfxbqfkf(fEablkybsjg, fGxszxtbevo, f13, f14));
        arrayList.add(new ppxfxbqfkf(fEablkybsjg2, fGxszxtbevo2, f13, f14));
        return arrayList;
    }

    private void hcddaimhww(com.caverock.androidsvg.lqeggnwhkg.esjtqupxsv esjtqupxsvVar, String str) {
        com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = esjtqupxsvVar.f21405iobyxmoadg.oxmwwwfdhm(str);
        if (cllcsxoeizVarOxmwwwfdhm == null) {
            e("Pattern reference '%s' not found", str);
            return;
        }
        if (!(cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.esjtqupxsv)) {
            iozdgvuglv("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (cllcsxoeizVarOxmwwwfdhm == esjtqupxsvVar) {
            iozdgvuglv("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        com.caverock.androidsvg.lqeggnwhkg.esjtqupxsv esjtqupxsvVar2 = (com.caverock.androidsvg.lqeggnwhkg.esjtqupxsv) cllcsxoeizVarOxmwwwfdhm;
        if (esjtqupxsvVar.f21418vdvldrhtss == null) {
            esjtqupxsvVar.f21418vdvldrhtss = esjtqupxsvVar2.f21418vdvldrhtss;
        }
        if (esjtqupxsvVar.f21417oxmwwwfdhm == null) {
            esjtqupxsvVar.f21417oxmwwwfdhm = esjtqupxsvVar2.f21417oxmwwwfdhm;
        }
        if (esjtqupxsvVar.f21416kcexrzcfyt == null) {
            esjtqupxsvVar.f21416kcexrzcfyt = esjtqupxsvVar2.f21416kcexrzcfyt;
        }
        if (esjtqupxsvVar.f21420zdlpuopuiu == null) {
            esjtqupxsvVar.f21420zdlpuopuiu = esjtqupxsvVar2.f21420zdlpuopuiu;
        }
        if (esjtqupxsvVar.f21419yggfygwlhe == null) {
            esjtqupxsvVar.f21419yggfygwlhe = esjtqupxsvVar2.f21419yggfygwlhe;
        }
        if (esjtqupxsvVar.f21415jyumaefscl == null) {
            esjtqupxsvVar.f21415jyumaefscl = esjtqupxsvVar2.f21415jyumaefscl;
        }
        if (esjtqupxsvVar.f21414iwizpuwonk == null) {
            esjtqupxsvVar.f21414iwizpuwonk = esjtqupxsvVar2.f21414iwizpuwonk;
        }
        if (esjtqupxsvVar.f21521dxjokdxxww.isEmpty()) {
            esjtqupxsvVar.f21521dxjokdxxww = esjtqupxsvVar2.f21521dxjokdxxww;
        }
        if (esjtqupxsvVar.f21463rgvfuqvkyq == null) {
            esjtqupxsvVar.f21463rgvfuqvkyq = esjtqupxsvVar2.f21463rgvfuqvkyq;
        }
        if (esjtqupxsvVar.f21524ojitshcjhn == null) {
            esjtqupxsvVar.f21524ojitshcjhn = esjtqupxsvVar2.f21524ojitshcjhn;
        }
        String str2 = esjtqupxsvVar2.f21413cqumvgiudr;
        if (str2 != null) {
            hcddaimhww(esjtqupxsvVar, str2);
        }
    }

    private C0391nufgyqmvbu hkdspvbjdz(com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVar) {
        C0391nufgyqmvbu c0391nufgyqmvbu = new C0391nufgyqmvbu();
        a(c0391nufgyqmvbu, com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg());
        return cllcsxoeiz(cllcsxoeizVar, c0391nufgyqmvbu);
    }

    private void igdgnonuha(com.caverock.androidsvg.lqeggnwhkg.sopmlzcsov sopmlzcsovVar) {
        esjtqupxsv("Text render", new Object[0]);
        b(this.f21623wkgbmnqykc, sopmlzcsovVar);
        if (pmvmpeiblj()) {
            Matrix matrix = sopmlzcsovVar.f21499kcexrzcfyt;
            if (matrix != null) {
                this.f21619iobyxmoadg.concat(matrix);
            }
            List list = sopmlzcsovVar.f21510ojitshcjhn;
            float fGxszxtbevo = 0.0f;
            float fEablkybsjg = (list == null || list.size() == 0) ? 0.0f : ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) sopmlzcsovVar.f21510ojitshcjhn.get(0)).eablkybsjg(this);
            List list2 = sopmlzcsovVar.f21512rgvfuqvkyq;
            float fGxszxtbevo2 = (list2 == null || list2.size() == 0) ? 0.0f : ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) sopmlzcsovVar.f21512rgvfuqvkyq.get(0)).gxszxtbevo(this);
            List list3 = sopmlzcsovVar.f21513vdvldrhtss;
            float fEablkybsjg2 = (list3 == null || list3.size() == 0) ? 0.0f : ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) sopmlzcsovVar.f21513vdvldrhtss.get(0)).eablkybsjg(this);
            List list4 = sopmlzcsovVar.f21511oxmwwwfdhm;
            if (list4 != null && list4.size() != 0) {
                fGxszxtbevo = ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) sopmlzcsovVar.f21511oxmwwwfdhm.get(0)).gxszxtbevo(this);
            }
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo gxszxtbevoVarDsvhmnatus = dsvhmnatus();
            if (gxszxtbevoVarDsvhmnatus != com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Start) {
                float fAgtfadlqog = agtfadlqog(sopmlzcsovVar);
                if (gxszxtbevoVarDsvhmnatus == com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Middle) {
                    fAgtfadlqog /= 2.0f;
                }
                fEablkybsjg -= fAgtfadlqog;
            }
            if (sopmlzcsovVar.f21428nufgyqmvbu == null) {
                dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(fEablkybsjg, fGxszxtbevo2);
                yadqdtsiqt(sopmlzcsovVar, dxjokdxxwwVar);
                RectF rectF = dxjokdxxwwVar.f21628wkgbmnqykc;
                sopmlzcsovVar.f21428nufgyqmvbu = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(rectF.left, rectF.top, rectF.width(), dxjokdxxwwVar.f21628wkgbmnqykc.height());
            }
            krqnebusok(sopmlzcsovVar);
            oxmwwwfdhm(sopmlzcsovVar);
            rgvfuqvkyq(sopmlzcsovVar);
            boolean zSflfametgt = sflfametgt();
            yadqdtsiqt(sopmlzcsovVar, new gxszxtbevo(fEablkybsjg + fEablkybsjg2, fGxszxtbevo2 + fGxszxtbevo));
            if (zSflfametgt) {
                uwvvkdfqfp(sopmlzcsovVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    private Path ikoacuggdj(com.caverock.androidsvg.lqeggnwhkg.zynmafqrjb zynmafqrjbVar) {
        float fEablkybsjg;
        float fGxszxtbevo;
        float fMin;
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar;
        float fEablkybsjg2;
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2;
        float fGxszxtbevo2;
        float fEablkybsjg3;
        float fGxszxtbevo3;
        float f13;
        float f14;
        Path path;
        Path path2;
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar3 = zynmafqrjbVar.f21610kcexrzcfyt;
        if (rgvfuqvkyqVar3 == null && zynmafqrjbVar.f21615zdlpuopuiu == null) {
            fEablkybsjg = 0.0f;
        } else {
            if (rgvfuqvkyqVar3 != null) {
                if (zynmafqrjbVar.f21615zdlpuopuiu == null) {
                    fEablkybsjg = rgvfuqvkyqVar3.eablkybsjg(this);
                } else {
                    fEablkybsjg = rgvfuqvkyqVar3.eablkybsjg(this);
                    fGxszxtbevo = zynmafqrjbVar.f21615zdlpuopuiu.gxszxtbevo(this);
                }
                fMin = Math.min(fEablkybsjg, zynmafqrjbVar.f21614vdvldrhtss.eablkybsjg(this) / 2.0f);
                float fMin2 = Math.min(fGxszxtbevo, zynmafqrjbVar.f21612oxmwwwfdhm.gxszxtbevo(this) / 2.0f);
                rgvfuqvkyqVar = zynmafqrjbVar.f21611ojitshcjhn;
                if (rgvfuqvkyqVar != null) {
                    fEablkybsjg2 = rgvfuqvkyqVar.eablkybsjg(this);
                } else {
                    fEablkybsjg2 = 0.0f;
                }
                rgvfuqvkyqVar2 = zynmafqrjbVar.f21613rgvfuqvkyq;
                if (rgvfuqvkyqVar2 != null) {
                    fGxszxtbevo2 = rgvfuqvkyqVar2.gxszxtbevo(this);
                } else {
                    fGxszxtbevo2 = 0.0f;
                }
                fEablkybsjg3 = zynmafqrjbVar.f21614vdvldrhtss.eablkybsjg(this);
                fGxszxtbevo3 = zynmafqrjbVar.f21612oxmwwwfdhm.gxszxtbevo(this);
                if (zynmafqrjbVar.f21428nufgyqmvbu == null) {
                    zynmafqrjbVar.f21428nufgyqmvbu = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(fEablkybsjg2, fGxszxtbevo2, fEablkybsjg3, fGxszxtbevo3);
                }
                f13 = fEablkybsjg2 + fEablkybsjg3;
                f14 = fGxszxtbevo2 + fGxszxtbevo3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path2 = path;
                    path2.moveTo(fEablkybsjg2, fGxszxtbevo2);
                    path2.lineTo(f13, fGxszxtbevo2);
                    path2.lineTo(f13, f14);
                    path2.lineTo(fEablkybsjg2, f14);
                    path2.lineTo(fEablkybsjg2, fGxszxtbevo2);
                } else {
                    float f15 = fMin * 0.5522848f;
                    float f16 = 0.5522848f * fMin2;
                    float f17 = fGxszxtbevo2 + fMin2;
                    path.moveTo(fEablkybsjg2, f17);
                    float f18 = f17 - f16;
                    float f19 = fEablkybsjg2 + fMin;
                    float f23 = f19 - f15;
                    path.cubicTo(fEablkybsjg2, f18, f23, fGxszxtbevo2, f19, fGxszxtbevo2);
                    float f24 = f13 - fMin;
                    path.lineTo(f24, fGxszxtbevo2);
                    float f25 = f24 + f15;
                    path.cubicTo(f25, fGxszxtbevo2, f13, f18, f13, f17);
                    float f26 = f14 - fMin2;
                    path.lineTo(f13, f26);
                    float f27 = f26 + f16;
                    path2 = path;
                    path.cubicTo(f13, f27, f25, f14, f24, f14);
                    path2.lineTo(f19, f14);
                    path2.cubicTo(f23, f14, fEablkybsjg2, f27, fEablkybsjg2, f26);
                    path2.lineTo(fEablkybsjg2, f17);
                }
                path2.close();
                return path2;
            }
            fEablkybsjg = zynmafqrjbVar.f21615zdlpuopuiu.gxszxtbevo(this);
        }
        fGxszxtbevo = fEablkybsjg;
        fMin = Math.min(fEablkybsjg, zynmafqrjbVar.f21614vdvldrhtss.eablkybsjg(this) / 2.0f);
        float fMin3 = Math.min(fGxszxtbevo, zynmafqrjbVar.f21612oxmwwwfdhm.gxszxtbevo(this) / 2.0f);
        rgvfuqvkyqVar = zynmafqrjbVar.f21611ojitshcjhn;
        if (rgvfuqvkyqVar != null) {
            fEablkybsjg2 = rgvfuqvkyqVar.eablkybsjg(this);
        } else {
            fEablkybsjg2 = 0.0f;
        }
        rgvfuqvkyqVar2 = zynmafqrjbVar.f21613rgvfuqvkyq;
        if (rgvfuqvkyqVar2 != null) {
            fGxszxtbevo2 = rgvfuqvkyqVar2.gxszxtbevo(this);
        } else {
            fGxszxtbevo2 = 0.0f;
        }
        fEablkybsjg3 = zynmafqrjbVar.f21614vdvldrhtss.eablkybsjg(this);
        fGxszxtbevo3 = zynmafqrjbVar.f21612oxmwwwfdhm.gxszxtbevo(this);
        if (zynmafqrjbVar.f21428nufgyqmvbu == null) {
            zynmafqrjbVar.f21428nufgyqmvbu = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(fEablkybsjg2, fGxszxtbevo2, fEablkybsjg3, fGxszxtbevo3);
        }
        f13 = fEablkybsjg2 + fEablkybsjg3;
        f14 = fGxszxtbevo2 + fGxszxtbevo3;
        path = new Path();
        if (fMin != 0.0f) {
            path2 = path;
            path2.moveTo(fEablkybsjg2, fGxszxtbevo2);
            path2.lineTo(f13, fGxszxtbevo2);
            path2.lineTo(f13, f14);
            path2.lineTo(fEablkybsjg2, f14);
            path2.lineTo(fEablkybsjg2, fGxszxtbevo2);
        } else {
            path2 = path;
            path2.moveTo(fEablkybsjg2, fGxszxtbevo2);
            path2.lineTo(f13, fGxszxtbevo2);
            path2.lineTo(f13, f14);
            path2.lineTo(fEablkybsjg2, f14);
            path2.lineTo(fEablkybsjg2, fGxszxtbevo2);
        }
        path2.close();
        return path2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void iozdgvuglv(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ipoelvxyzq(com.caverock.androidsvg.lqeggnwhkg.tzroggbefp tzroggbefpVar) {
        Set setZoijcleaow;
        String language = Locale.getDefault().getLanguage();
        com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx();
        for (com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVar : tzroggbefpVar.iobyxmoadg()) {
            if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd) {
                com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd lmojexxdydVar = (com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd) cllcsxoeizVar;
                if (lmojexxdydVar.ppxfxbqfkf() == null && ((setZoijcleaow = lmojexxdydVar.zoijcleaow()) == null || (!setZoijcleaow.isEmpty() && setZoijcleaow.contains(language)))) {
                    Set requiredFeatures = lmojexxdydVar.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (f21616dxjokdxxww == null) {
                            ulzqkzuiru();
                        }
                        if (requiredFeatures.isEmpty() || !f21616dxjokdxxww.containsAll(requiredFeatures)) {
                        }
                    }
                    Set setDraadjrbmk = lmojexxdydVar.draadjrbmk();
                    if (setDraadjrbmk != null) {
                        setDraadjrbmk.isEmpty();
                    } else {
                        Set setWflxmlrfwp = lmojexxdydVar.wflxmlrfwp();
                        if (setWflxmlrfwp == null) {
                            iwxlajgraz(cllcsxoeizVar);
                            return;
                        }
                        setWflxmlrfwp.isEmpty();
                    }
                }
            }
        }
    }

    private void istkbnxepw(Path path) {
        C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
        if (c0391nufgyqmvbu.f21647iobyxmoadg.f21541jztzpxfvev != com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.dxjokdxxww.NonScalingStroke) {
            this.f21619iobyxmoadg.drawPath(path, c0391nufgyqmvbu.f21645eablkybsjg);
            return;
        }
        Matrix matrix = this.f21619iobyxmoadg.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f21619iobyxmoadg.setMatrix(new Matrix());
        Shader shader = this.f21623wkgbmnqykc.f21645eablkybsjg.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f21619iobyxmoadg.drawPath(path2, this.f21623wkgbmnqykc.f21645eablkybsjg);
        this.f21619iobyxmoadg.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private static int iwizpuwonk(float f13) {
        int i13 = (int) (f13 * 256.0f);
        if (i13 < 0) {
            return 0;
        }
        return i13 > 255 ? KotlinVersion.MAX_COMPONENT_VALUE : i13;
    }

    private void iwxlajgraz(com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVar) {
        if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.zdlpuopuiu) {
            return;
        }
        yzdjzghtvl();
        yggfygwlhe(cllcsxoeizVar);
        if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv) {
            roivzttewh((com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.jztzpxfvev) {
            lxfrhoxuzk((com.caverock.androidsvg.lqeggnwhkg.jztzpxfvev) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.tzroggbefp) {
            dvvnrvtcbc((com.caverock.androidsvg.lqeggnwhkg.tzroggbefp) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.wflxmlrfwp) {
            opjhrmiecq((com.caverock.androidsvg.lqeggnwhkg.wflxmlrfwp) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.ojitshcjhn) {
            iyctptxqzt((com.caverock.androidsvg.lqeggnwhkg.ojitshcjhn) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.jyumaefscl) {
            lrnfpwlwnk((com.caverock.androidsvg.lqeggnwhkg.jyumaefscl) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.zynmafqrjb) {
            tbqsvytpvh((com.caverock.androidsvg.lqeggnwhkg.zynmafqrjb) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.wkgbmnqykc) {
            oipsdeybqn((com.caverock.androidsvg.lqeggnwhkg.wkgbmnqykc) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.dxjokdxxww) {
            bfopjjpdmp((com.caverock.androidsvg.lqeggnwhkg.dxjokdxxww) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.vdvldrhtss) {
            weqkydbzbr((com.caverock.androidsvg.lqeggnwhkg.vdvldrhtss) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.pmvmpeiblj) {
            nuxfzjnpeb((com.caverock.androidsvg.lqeggnwhkg.pmvmpeiblj) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.lereixgezr) {
            zeieaojujs((com.caverock.androidsvg.lqeggnwhkg.lereixgezr) cllcsxoeizVar);
        } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.sopmlzcsov) {
            igdgnonuha((com.caverock.androidsvg.lqeggnwhkg.sopmlzcsov) cllcsxoeizVar);
        }
        rhgxfdycjh();
    }

    private void ixidwrxhsl() {
        this.f21623wkgbmnqykc = new C0391nufgyqmvbu();
        this.f21617eablkybsjg = new Stack();
        a(this.f21623wkgbmnqykc, com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg());
        C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
        c0391nufgyqmvbu.f21646gxszxtbevo = null;
        c0391nufgyqmvbu.f21649nufgyqmvbu = false;
        this.f21617eablkybsjg.push(new C0391nufgyqmvbu(c0391nufgyqmvbu));
        this.f21620lqeggnwhkg = new Stack();
        this.f21618gxszxtbevo = new Stack();
    }

    private void iyctptxqzt(com.caverock.androidsvg.lqeggnwhkg.ojitshcjhn ojitshcjhnVar) {
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar;
        String str;
        esjtqupxsv("Image render", new Object[0]);
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = ojitshcjhnVar.f21468kcexrzcfyt;
        if (rgvfuqvkyqVar2 == null || rgvfuqvkyqVar2.nufgyqmvbu() || (rgvfuqvkyqVar = ojitshcjhnVar.f21473zdlpuopuiu) == null || rgvfuqvkyqVar.nufgyqmvbu() || (str = ojitshcjhnVar.f21470rgvfuqvkyq) == null) {
            return;
        }
        com.caverock.androidsvg.eablkybsjg eablkybsjgVar = ojitshcjhnVar.f21524ojitshcjhn;
        if (eablkybsjgVar == null) {
            eablkybsjgVar = com.caverock.androidsvg.eablkybsjg.f21363eablkybsjg;
        }
        Bitmap bitmapKcexrzcfyt = kcexrzcfyt(str);
        if (bitmapKcexrzcfyt == null) {
            com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx();
            return;
        }
        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(0.0f, 0.0f, bitmapKcexrzcfyt.getWidth(), bitmapKcexrzcfyt.getHeight());
        b(this.f21623wkgbmnqykc, ojitshcjhnVar);
        if (pmvmpeiblj() && d()) {
            Matrix matrix = ojitshcjhnVar.f21472yggfygwlhe;
            if (matrix != null) {
                this.f21619iobyxmoadg.concat(matrix);
            }
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar3 = ojitshcjhnVar.f21471vdvldrhtss;
            float fEablkybsjg = rgvfuqvkyqVar3 != null ? rgvfuqvkyqVar3.eablkybsjg(this) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar4 = ojitshcjhnVar.f21469oxmwwwfdhm;
            this.f21623wkgbmnqykc.f21646gxszxtbevo = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(fEablkybsjg, rgvfuqvkyqVar4 != null ? rgvfuqvkyqVar4.gxszxtbevo(this) : 0.0f, ojitshcjhnVar.f21468kcexrzcfyt.eablkybsjg(this), ojitshcjhnVar.f21473zdlpuopuiu.eablkybsjg(this));
            if (!this.f21623wkgbmnqykc.f21647iobyxmoadg.f21529dsvhmnatus.booleanValue()) {
                com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar2 = this.f21623wkgbmnqykc.f21646gxszxtbevo;
                jrbgnlbqoe(zoijcleaowVar2.f21606iobyxmoadg, zoijcleaowVar2.f21609zoijcleaow, zoijcleaowVar2.f21607ppxfxbqfkf, zoijcleaowVar2.f21608wkgbmnqykc);
            }
            ojitshcjhnVar.f21428nufgyqmvbu = this.f21623wkgbmnqykc.f21646gxszxtbevo;
            krqnebusok(ojitshcjhnVar);
            rgvfuqvkyq(ojitshcjhnVar);
            boolean zSflfametgt = sflfametgt();
            c();
            this.f21619iobyxmoadg.save();
            this.f21619iobyxmoadg.concat(ojitshcjhn(this.f21623wkgbmnqykc.f21646gxszxtbevo, zoijcleaowVar, eablkybsjgVar));
            this.f21619iobyxmoadg.drawBitmap(bitmapKcexrzcfyt, 0.0f, 0.0f, new Paint(this.f21623wkgbmnqykc.f21647iobyxmoadg.f21558xrmfcynszj != com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.eablkybsjg.optimizeSpeed ? 2 : 0));
            this.f21619iobyxmoadg.restore();
            if (zSflfametgt) {
                uwvvkdfqfp(ojitshcjhnVar);
            }
        }
    }

    private Path jhduphickx(com.caverock.androidsvg.lqeggnwhkg.lereixgezr lereixgezrVar) {
        Path path = new Path();
        float[] fArr = lereixgezrVar.f21464ojitshcjhn;
        path.moveTo(fArr[0], fArr[1]);
        int i13 = 2;
        while (true) {
            float[] fArr2 = lereixgezrVar.f21464ojitshcjhn;
            if (i13 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i13], fArr2[i13 + 1]);
            i13 += 2;
        }
        if (lereixgezrVar instanceof com.caverock.androidsvg.lqeggnwhkg.pmvmpeiblj) {
            path.close();
        }
        if (lereixgezrVar.f21428nufgyqmvbu == null) {
            lereixgezrVar.f21428nufgyqmvbu = wflxmlrfwp(path);
        }
        return path;
    }

    private Path jlmebxxoox(com.caverock.androidsvg.lqeggnwhkg.wkgbmnqykc wkgbmnqykcVar) {
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = wkgbmnqykcVar.f21515ojitshcjhn;
        float fEablkybsjg = rgvfuqvkyqVar != null ? rgvfuqvkyqVar.eablkybsjg(this) : 0.0f;
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = wkgbmnqykcVar.f21516rgvfuqvkyq;
        float fGxszxtbevo = rgvfuqvkyqVar2 != null ? rgvfuqvkyqVar2.gxszxtbevo(this) : 0.0f;
        float fPpxfxbqfkf = wkgbmnqykcVar.f21517vdvldrhtss.ppxfxbqfkf(this);
        float f13 = fEablkybsjg - fPpxfxbqfkf;
        float f14 = fGxszxtbevo - fPpxfxbqfkf;
        float f15 = fEablkybsjg + fPpxfxbqfkf;
        float f16 = fGxszxtbevo + fPpxfxbqfkf;
        if (wkgbmnqykcVar.f21428nufgyqmvbu == null) {
            float f17 = 2.0f * fPpxfxbqfkf;
            wkgbmnqykcVar.f21428nufgyqmvbu = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(f13, f14, f17, f17);
        }
        float f18 = 0.5522848f * fPpxfxbqfkf;
        Path path = new Path();
        path.moveTo(fEablkybsjg, f14);
        float f19 = fEablkybsjg + f18;
        float f23 = fGxszxtbevo - f18;
        path.cubicTo(f19, f14, f15, f23, f15, fGxszxtbevo);
        float f24 = fGxszxtbevo + f18;
        path.cubicTo(f15, f24, f19, f16, fEablkybsjg, f16);
        float f25 = fEablkybsjg - f18;
        path.cubicTo(f25, f16, f13, f24, f13, fGxszxtbevo);
        path.cubicTo(f13, f23, f25, f14, fEablkybsjg, f14);
        path.close();
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f6 A[LOOP:3: B:100:0x01f0->B:102:0x01f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x015d  */
    private void jpowsppfya(com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar, Path path, com.caverock.androidsvg.lqeggnwhkg.esjtqupxsv esjtqupxsvVar) {
        float fEablkybsjg;
        float fGxszxtbevo;
        float fGxszxtbevo2;
        float fEablkybsjg2;
        boolean z13;
        boolean z14;
        com.caverock.androidsvg.eablkybsjg eablkybsjgVar;
        Iterator it;
        Boolean bool = esjtqupxsvVar.f21418vdvldrhtss;
        boolean z15 = bool != null && bool.booleanValue();
        String str = esjtqupxsvVar.f21413cqumvgiudr;
        if (str != null) {
            hcddaimhww(esjtqupxsvVar, str);
        }
        if (z15) {
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = esjtqupxsvVar.f21420zdlpuopuiu;
            fEablkybsjg = rgvfuqvkyqVar != null ? rgvfuqvkyqVar.eablkybsjg(this) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = esjtqupxsvVar.f21419yggfygwlhe;
            fGxszxtbevo2 = rgvfuqvkyqVar2 != null ? rgvfuqvkyqVar2.gxszxtbevo(this) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar3 = esjtqupxsvVar.f21415jyumaefscl;
            fEablkybsjg2 = rgvfuqvkyqVar3 != null ? rgvfuqvkyqVar3.eablkybsjg(this) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar4 = esjtqupxsvVar.f21414iwizpuwonk;
            fGxszxtbevo = rgvfuqvkyqVar4 != null ? rgvfuqvkyqVar4.gxszxtbevo(this) : 0.0f;
        } else {
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar5 = esjtqupxsvVar.f21420zdlpuopuiu;
            float fWkgbmnqykc = rgvfuqvkyqVar5 != null ? rgvfuqvkyqVar5.wkgbmnqykc(this, 1.0f) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar6 = esjtqupxsvVar.f21419yggfygwlhe;
            float fWkgbmnqykc2 = rgvfuqvkyqVar6 != null ? rgvfuqvkyqVar6.wkgbmnqykc(this, 1.0f) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar7 = esjtqupxsvVar.f21415jyumaefscl;
            float fWkgbmnqykc3 = rgvfuqvkyqVar7 != null ? rgvfuqvkyqVar7.wkgbmnqykc(this, 1.0f) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar8 = esjtqupxsvVar.f21414iwizpuwonk;
            float fWkgbmnqykc4 = rgvfuqvkyqVar8 != null ? rgvfuqvkyqVar8.wkgbmnqykc(this, 1.0f) : 0.0f;
            com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar = hcddaimhwwVar.f21428nufgyqmvbu;
            float f13 = zoijcleaowVar.f21606iobyxmoadg;
            float f14 = zoijcleaowVar.f21607ppxfxbqfkf;
            fEablkybsjg = (fWkgbmnqykc * f14) + f13;
            float f15 = zoijcleaowVar.f21609zoijcleaow;
            float f16 = zoijcleaowVar.f21608wkgbmnqykc;
            float f17 = fWkgbmnqykc3 * f14;
            fGxszxtbevo = fWkgbmnqykc4 * f16;
            fGxszxtbevo2 = (fWkgbmnqykc2 * f16) + f15;
            fEablkybsjg2 = f17;
        }
        if (fEablkybsjg2 == 0.0f || fGxszxtbevo == 0.0f) {
            return;
        }
        com.caverock.androidsvg.eablkybsjg eablkybsjgVar2 = esjtqupxsvVar.f21524ojitshcjhn;
        if (eablkybsjgVar2 == null) {
            eablkybsjgVar2 = com.caverock.androidsvg.eablkybsjg.f21363eablkybsjg;
        }
        yzdjzghtvl();
        this.f21619iobyxmoadg.clipPath(path);
        C0391nufgyqmvbu c0391nufgyqmvbu = new C0391nufgyqmvbu();
        a(c0391nufgyqmvbu, com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg());
        c0391nufgyqmvbu.f21647iobyxmoadg.f21529dsvhmnatus = Boolean.FALSE;
        this.f21623wkgbmnqykc = cllcsxoeiz(esjtqupxsvVar, c0391nufgyqmvbu);
        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar2 = hcddaimhwwVar.f21428nufgyqmvbu;
        Matrix matrix = esjtqupxsvVar.f21416kcexrzcfyt;
        if (matrix != null) {
            this.f21619iobyxmoadg.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (esjtqupxsvVar.f21416kcexrzcfyt.invert(matrix2)) {
                com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar3 = hcddaimhwwVar.f21428nufgyqmvbu;
                float f18 = zoijcleaowVar3.f21606iobyxmoadg;
                float f19 = zoijcleaowVar3.f21609zoijcleaow;
                float fZoijcleaow = zoijcleaowVar3.zoijcleaow();
                com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar4 = hcddaimhwwVar.f21428nufgyqmvbu;
                float f23 = zoijcleaowVar4.f21609zoijcleaow;
                float fZoijcleaow2 = zoijcleaowVar4.zoijcleaow();
                float fPpxfxbqfkf = hcddaimhwwVar.f21428nufgyqmvbu.ppxfxbqfkf();
                com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar5 = hcddaimhwwVar.f21428nufgyqmvbu;
                float[] fArr = {f18, f19, fZoijcleaow, f23, fZoijcleaow2, fPpxfxbqfkf, zoijcleaowVar5.f21606iobyxmoadg, zoijcleaowVar5.ppxfxbqfkf()};
                matrix2.mapPoints(fArr);
                z14 = false;
                float f24 = fArr[0];
                float f25 = fArr[1];
                RectF rectF = new RectF(f24, f25, f24, f25);
                for (int i13 = 2; i13 <= 6; i13 += 2) {
                    float f26 = fArr[i13];
                    if (f26 < rectF.left) {
                        rectF.left = f26;
                    }
                    if (f26 > rectF.right) {
                        rectF.right = f26;
                    }
                    float f27 = fArr[i13 + 1];
                    if (f27 < rectF.top) {
                        rectF.top = f27;
                    }
                    if (f27 > rectF.bottom) {
                        rectF.bottom = f27;
                    }
                }
                z13 = true;
                float f28 = rectF.left;
                float f29 = rectF.top;
                zoijcleaowVar2 = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(f28, f29, rectF.right - f28, rectF.bottom - f29);
            } else {
                z13 = true;
                z14 = false;
            }
        } else {
            z13 = true;
            z14 = false;
        }
        float fFloor = fEablkybsjg + (((float) Math.floor((zoijcleaowVar2.f21606iobyxmoadg - fEablkybsjg) / fEablkybsjg2)) * fEablkybsjg2);
        float fFloor2 = fGxszxtbevo2 + (((float) Math.floor((zoijcleaowVar2.f21609zoijcleaow - fGxszxtbevo2) / fGxszxtbevo)) * fGxszxtbevo);
        float fZoijcleaow3 = zoijcleaowVar2.zoijcleaow();
        float fPpxfxbqfkf2 = zoijcleaowVar2.ppxfxbqfkf();
        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar6 = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(0.0f, 0.0f, fEablkybsjg2, fGxszxtbevo);
        boolean zSflfametgt = sflfametgt();
        while (fFloor2 < fPpxfxbqfkf2) {
            float f33 = fFloor;
            while (f33 < fZoijcleaow3) {
                zoijcleaowVar6.f21606iobyxmoadg = f33;
                zoijcleaowVar6.f21609zoijcleaow = fFloor2;
                yzdjzghtvl();
                if (!this.f21623wkgbmnqykc.f21647iobyxmoadg.f21529dsvhmnatus.booleanValue()) {
                    jrbgnlbqoe(zoijcleaowVar6.f21606iobyxmoadg, zoijcleaowVar6.f21609zoijcleaow, zoijcleaowVar6.f21607ppxfxbqfkf, zoijcleaowVar6.f21608wkgbmnqykc);
                }
                com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar7 = esjtqupxsvVar.f21463rgvfuqvkyq;
                if (zoijcleaowVar7 != null) {
                    eablkybsjgVar = eablkybsjgVar2;
                    this.f21619iobyxmoadg.concat(ojitshcjhn(zoijcleaowVar6, zoijcleaowVar7, eablkybsjgVar));
                } else {
                    eablkybsjgVar = eablkybsjgVar2;
                    Boolean bool2 = esjtqupxsvVar.f21417oxmwwwfdhm;
                    boolean z16 = (bool2 == null || bool2.booleanValue()) ? z13 : z14;
                    this.f21619iobyxmoadg.translate(f33, fFloor2);
                    if (!z16) {
                        Canvas canvas = this.f21619iobyxmoadg;
                        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar8 = hcddaimhwwVar.f21428nufgyqmvbu;
                        canvas.scale(zoijcleaowVar8.f21607ppxfxbqfkf, zoijcleaowVar8.f21608wkgbmnqykc);
                    }
                    it = esjtqupxsvVar.f21521dxjokdxxww.iterator();
                    while (it.hasNext()) {
                        iwxlajgraz((com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) it.next());
                    }
                    rhgxfdycjh();
                    f33 += fEablkybsjg2;
                    eablkybsjgVar2 = eablkybsjgVar;
                    z13 = true;
                }
                it = esjtqupxsvVar.f21521dxjokdxxww.iterator();
                while (it.hasNext()) {
                    iwxlajgraz((com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) it.next());
                }
                rhgxfdycjh();
                f33 += fEablkybsjg2;
                eablkybsjgVar2 = eablkybsjgVar;
                z13 = true;
            }
            fFloor2 += fGxszxtbevo;
            z13 = true;
        }
        if (zSflfametgt) {
            uwvvkdfqfp(esjtqupxsvVar);
        }
        rhgxfdycjh();
    }

    private void jrbgnlbqoe(float f13, float f14, float f15, float f16) {
        float fEablkybsjg = f15 + f13;
        float fGxszxtbevo = f16 + f14;
        com.caverock.androidsvg.lqeggnwhkg.ppxfxbqfkf ppxfxbqfkfVar = this.f21623wkgbmnqykc.f21647iobyxmoadg.f21557wypolnanlu;
        if (ppxfxbqfkfVar != null) {
            f13 += ppxfxbqfkfVar.f21492wkgbmnqykc.eablkybsjg(this);
            f14 += this.f21623wkgbmnqykc.f21647iobyxmoadg.f21557wypolnanlu.f21490iobyxmoadg.gxszxtbevo(this);
            fEablkybsjg -= this.f21623wkgbmnqykc.f21647iobyxmoadg.f21557wypolnanlu.f21493zoijcleaow.eablkybsjg(this);
            fGxszxtbevo -= this.f21623wkgbmnqykc.f21647iobyxmoadg.f21557wypolnanlu.f21491ppxfxbqfkf.gxszxtbevo(this);
        }
        this.f21619iobyxmoadg.clipRect(f13, f14, fEablkybsjg, fGxszxtbevo);
    }

    private static double jyumaefscl(double d13) {
        if (d13 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d13 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d13);
    }

    private void jztzpxfvev(boolean z13, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar, com.caverock.androidsvg.lqeggnwhkg.stevsuqkhv stevsuqkhvVar) {
        float f13;
        float fWkgbmnqykc;
        float f14;
        String str = stevsuqkhvVar.f21400draadjrbmk;
        if (str != null) {
            wwaezpbzkn(stevsuqkhvVar, str);
        }
        Boolean bool = stevsuqkhvVar.f21401dxjokdxxww;
        int i13 = 0;
        boolean z14 = bool != null && bool.booleanValue();
        C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
        Paint paint = z13 ? c0391nufgyqmvbu.f21651wkgbmnqykc : c0391nufgyqmvbu.f21645eablkybsjg;
        if (z14) {
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(50.0f, com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.percent);
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = stevsuqkhvVar.f21504wflxmlrfwp;
            float fEablkybsjg = rgvfuqvkyqVar2 != null ? rgvfuqvkyqVar2.eablkybsjg(this) : rgvfuqvkyqVar.eablkybsjg(this);
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar3 = stevsuqkhvVar.f21500agtfadlqog;
            float fGxszxtbevo = rgvfuqvkyqVar3 != null ? rgvfuqvkyqVar3.gxszxtbevo(this) : rgvfuqvkyqVar.gxszxtbevo(this);
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar4 = stevsuqkhvVar.f21501ojitshcjhn;
            fWkgbmnqykc = rgvfuqvkyqVar4 != null ? rgvfuqvkyqVar4.ppxfxbqfkf(this) : rgvfuqvkyqVar.ppxfxbqfkf(this);
            f13 = fEablkybsjg;
            f14 = fGxszxtbevo;
        } else {
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar5 = stevsuqkhvVar.f21504wflxmlrfwp;
            float fWkgbmnqykc2 = rgvfuqvkyqVar5 != null ? rgvfuqvkyqVar5.wkgbmnqykc(this, 1.0f) : 0.5f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar6 = stevsuqkhvVar.f21500agtfadlqog;
            float fWkgbmnqykc3 = rgvfuqvkyqVar6 != null ? rgvfuqvkyqVar6.wkgbmnqykc(this, 1.0f) : 0.5f;
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar7 = stevsuqkhvVar.f21501ojitshcjhn;
            f13 = fWkgbmnqykc2;
            fWkgbmnqykc = rgvfuqvkyqVar7 != null ? rgvfuqvkyqVar7.wkgbmnqykc(this, 1.0f) : 0.5f;
            f14 = fWkgbmnqykc3;
        }
        yzdjzghtvl();
        this.f21623wkgbmnqykc = hkdspvbjdz(stevsuqkhvVar);
        Matrix matrix = new Matrix();
        if (!z14) {
            matrix.preTranslate(zoijcleaowVar.f21606iobyxmoadg, zoijcleaowVar.f21609zoijcleaow);
            matrix.preScale(zoijcleaowVar.f21607ppxfxbqfkf, zoijcleaowVar.f21608wkgbmnqykc);
        }
        Matrix matrix2 = stevsuqkhvVar.f21399btonecajqb;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = stevsuqkhvVar.f21403nufgyqmvbu.size();
        if (size == 0) {
            rhgxfdycjh();
            if (z13) {
                this.f21623wkgbmnqykc.f21652zoijcleaow = false;
                return;
            } else {
                this.f21623wkgbmnqykc.f21650ppxfxbqfkf = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = stevsuqkhvVar.f21403nufgyqmvbu.iterator();
        float f15 = -1.0f;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.caverock.androidsvg.lqeggnwhkg.cdpycssgdh cdpycssgdhVar = (com.caverock.androidsvg.lqeggnwhkg.cdpycssgdh) ((com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) it.next());
            Float f16 = cdpycssgdhVar.f21404nufgyqmvbu;
            float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
            if (i13 == 0 || fFloatValue >= f15) {
                fArr[i13] = fFloatValue;
                f15 = fFloatValue;
            } else {
                fArr[i13] = f15;
            }
            yzdjzghtvl();
            b(this.f21623wkgbmnqykc, cdpycssgdhVar);
            com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar = this.f21623wkgbmnqykc.f21647iobyxmoadg;
            com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo gxszxtbevoVar = (com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo) yadqdtsiqtVar.f21554ulzqkzuiru;
            if (gxszxtbevoVar == null) {
                gxszxtbevoVar = com.caverock.androidsvg.lqeggnwhkg.gxszxtbevo.f21426yggfygwlhe;
            }
            iArr[i13] = cqumvgiudr(gxszxtbevoVar.f21427zdlpuopuiu, yadqdtsiqtVar.f21551sopmlzcsov.floatValue());
            i13++;
            rhgxfdycjh();
        }
        if (fWkgbmnqykc == 0.0f || size == 1) {
            rhgxfdycjh();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx gtknphoqwxVar = stevsuqkhvVar.f21402gtknphoqwx;
        if (gtknphoqwxVar != null) {
            if (gtknphoqwxVar == com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gtknphoqwxVar == com.caverock.androidsvg.lqeggnwhkg.gtknphoqwx.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        rhgxfdycjh();
        RadialGradient radialGradient = new RadialGradient(f13, f14, fWkgbmnqykc, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(iwizpuwonk(this.f21623wkgbmnqykc.f21647iobyxmoadg.f21536iwizpuwonk.floatValue()));
    }

    private Bitmap kcexrzcfyt(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e13) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e13);
            return null;
        }
    }

    private void krqnebusok(com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar) {
        if (hcddaimhwwVar.f21406zoijcleaow == null || hcddaimhwwVar.f21428nufgyqmvbu == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f21620lqeggnwhkg.peek()).invert(matrix)) {
            com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar = hcddaimhwwVar.f21428nufgyqmvbu;
            float f13 = zoijcleaowVar.f21606iobyxmoadg;
            float f14 = zoijcleaowVar.f21609zoijcleaow;
            float fZoijcleaow = zoijcleaowVar.zoijcleaow();
            com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar2 = hcddaimhwwVar.f21428nufgyqmvbu;
            float f15 = zoijcleaowVar2.f21609zoijcleaow;
            float fZoijcleaow2 = zoijcleaowVar2.zoijcleaow();
            float fPpxfxbqfkf = hcddaimhwwVar.f21428nufgyqmvbu.ppxfxbqfkf();
            com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar3 = hcddaimhwwVar.f21428nufgyqmvbu;
            float[] fArr = {f13, f14, fZoijcleaow, f15, fZoijcleaow2, fPpxfxbqfkf, zoijcleaowVar3.f21606iobyxmoadg, zoijcleaowVar3.ppxfxbqfkf()};
            matrix.preConcat(this.f21619iobyxmoadg.getMatrix());
            matrix.mapPoints(fArr);
            float f16 = fArr[0];
            float f17 = fArr[1];
            RectF rectF = new RectF(f16, f17, f16, f17);
            for (int i13 = 2; i13 <= 6; i13 += 2) {
                float f18 = fArr[i13];
                if (f18 < rectF.left) {
                    rectF.left = f18;
                }
                if (f18 > rectF.right) {
                    rectF.right = f18;
                }
                float f19 = fArr[i13 + 1];
                if (f19 < rectF.top) {
                    rectF.top = f19;
                }
                if (f19 > rectF.bottom) {
                    rectF.bottom = f19;
                }
            }
            com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar2 = (com.caverock.androidsvg.lqeggnwhkg.hcddaimhww) this.f21618gxszxtbevo.peek();
            com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar4 = hcddaimhwwVar2.f21428nufgyqmvbu;
            if (zoijcleaowVar4 == null) {
                hcddaimhwwVar2.f21428nufgyqmvbu = com.caverock.androidsvg.lqeggnwhkg.zoijcleaow.iobyxmoadg(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                zoijcleaowVar4.eablkybsjg(com.caverock.androidsvg.lqeggnwhkg.zoijcleaow.iobyxmoadg(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private void lereixgezr(boolean z13, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar, com.caverock.androidsvg.lqeggnwhkg.yggfygwlhe yggfygwlheVar) {
        com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = this.f21622ppxfxbqfkf.oxmwwwfdhm(yggfygwlheVar.f21600zdlpuopuiu);
        if (cllcsxoeizVarOxmwwwfdhm == null) {
            iozdgvuglv("%s reference '%s' not found", z13 ? "Fill" : "Stroke", yggfygwlheVar.f21600zdlpuopuiu);
            com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVar = yggfygwlheVar.f21599yggfygwlhe;
            if (dsvhmnatusVar != null) {
                fmlbqenlif(this.f21623wkgbmnqykc, z13, dsvhmnatusVar);
                return;
            } else if (z13) {
                this.f21623wkgbmnqykc.f21652zoijcleaow = false;
                return;
            } else {
                this.f21623wkgbmnqykc.f21650ppxfxbqfkf = false;
                return;
            }
        }
        if (cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz) {
            crxdokpmqz(z13, zoijcleaowVar, (com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz) cllcsxoeizVarOxmwwwfdhm);
        } else if (cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.stevsuqkhv) {
            jztzpxfvev(z13, zoijcleaowVar, (com.caverock.androidsvg.lqeggnwhkg.stevsuqkhv) cllcsxoeizVarOxmwwwfdhm);
        } else if (cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.istkbnxepw) {
            ezmngbhpjk(z13, (com.caverock.androidsvg.lqeggnwhkg.istkbnxepw) cllcsxoeizVarOxmwwwfdhm);
        }
    }

    private void lmojexxdyd(com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox jlmebxxooxVar, StringBuilder sb3) {
        Iterator it = jlmebxxooxVar.f21521dxjokdxxww.iterator();
        boolean z13 = true;
        while (it.hasNext()) {
            com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVar = (com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) it.next();
            if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox) {
                lmojexxdyd((com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox) cllcsxoeizVar, sb3);
            } else if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.ikoacuggdj) {
                sb3.append(eslsurpljm(((com.caverock.androidsvg.lqeggnwhkg.ikoacuggdj) cllcsxoeizVar).f21433ppxfxbqfkf, z13, !it.hasNext()));
            }
            z13 = false;
        }
    }

    private void lrnfpwlwnk(com.caverock.androidsvg.lqeggnwhkg.jyumaefscl jyumaefsclVar) {
        esjtqupxsv("Path render", new Object[0]);
        if (jyumaefsclVar.f21450ojitshcjhn == null) {
            return;
        }
        b(this.f21623wkgbmnqykc, jyumaefsclVar);
        if (pmvmpeiblj() && d()) {
            C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
            if (c0391nufgyqmvbu.f21650ppxfxbqfkf || c0391nufgyqmvbu.f21652zoijcleaow) {
                Matrix matrix = jyumaefsclVar.f21407agtfadlqog;
                if (matrix != null) {
                    this.f21619iobyxmoadg.concat(matrix);
                }
                Path pathZoijcleaow = new wkgbmnqykc(jyumaefsclVar.f21450ojitshcjhn).zoijcleaow();
                if (jyumaefsclVar.f21428nufgyqmvbu == null) {
                    jyumaefsclVar.f21428nufgyqmvbu = wflxmlrfwp(pathZoijcleaow);
                }
                krqnebusok(jyumaefsclVar);
                oxmwwwfdhm(jyumaefsclVar);
                rgvfuqvkyq(jyumaefsclVar);
                boolean zSflfametgt = sflfametgt();
                if (this.f21623wkgbmnqykc.f21652zoijcleaow) {
                    pathZoijcleaow.setFillType(ntlheqmsrt());
                    zynmafqrjb(jyumaefsclVar, pathZoijcleaow);
                }
                if (this.f21623wkgbmnqykc.f21650ppxfxbqfkf) {
                    istkbnxepw(pathZoijcleaow);
                }
                ageimvtcrz(jyumaefsclVar);
                if (zSflfametgt) {
                    uwvvkdfqfp(jyumaefsclVar);
                }
            }
        }
    }

    private void lxfrhoxuzk(com.caverock.androidsvg.lqeggnwhkg.jztzpxfvev jztzpxfvevVar) {
        esjtqupxsv("Use render", new Object[0]);
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = jztzpxfvevVar.f21452kcexrzcfyt;
        if (rgvfuqvkyqVar == null || !rgvfuqvkyqVar.nufgyqmvbu()) {
            com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = jztzpxfvevVar.f21456zdlpuopuiu;
            if (rgvfuqvkyqVar2 == null || !rgvfuqvkyqVar2.nufgyqmvbu()) {
                b(this.f21623wkgbmnqykc, jztzpxfvevVar);
                if (pmvmpeiblj()) {
                    com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = jztzpxfvevVar.f21405iobyxmoadg.oxmwwwfdhm(jztzpxfvevVar.f21454rgvfuqvkyq);
                    if (cllcsxoeizVarOxmwwwfdhm == null) {
                        iozdgvuglv("Use reference '%s' not found", jztzpxfvevVar.f21454rgvfuqvkyq);
                        return;
                    }
                    Matrix matrix = jztzpxfvevVar.f21514ojitshcjhn;
                    if (matrix != null) {
                        this.f21619iobyxmoadg.concat(matrix);
                    }
                    com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar3 = jztzpxfvevVar.f21455vdvldrhtss;
                    float fEablkybsjg = rgvfuqvkyqVar3 != null ? rgvfuqvkyqVar3.eablkybsjg(this) : 0.0f;
                    com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar4 = jztzpxfvevVar.f21453oxmwwwfdhm;
                    this.f21619iobyxmoadg.translate(fEablkybsjg, rgvfuqvkyqVar4 != null ? rgvfuqvkyqVar4.gxszxtbevo(this) : 0.0f);
                    rgvfuqvkyq(jztzpxfvevVar);
                    boolean zSflfametgt = sflfametgt();
                    czzsidtyhn(jztzpxfvevVar);
                    if (cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv) {
                        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVarXrmfcynszj = xrmfcynszj(null, null, jztzpxfvevVar.f21452kcexrzcfyt, jztzpxfvevVar.f21456zdlpuopuiu);
                        yzdjzghtvl();
                        uawqvzlxes((com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv) cllcsxoeizVarOxmwwwfdhm, zoijcleaowVarXrmfcynszj);
                        rhgxfdycjh();
                    } else if (cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.mbcevpiqjq) {
                        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar5 = jztzpxfvevVar.f21452kcexrzcfyt;
                        if (rgvfuqvkyqVar5 == null) {
                            rgvfuqvkyqVar5 = new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(100.0f, com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.percent);
                        }
                        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar6 = jztzpxfvevVar.f21456zdlpuopuiu;
                        if (rgvfuqvkyqVar6 == null) {
                            rgvfuqvkyqVar6 = new com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq(100.0f, com.caverock.androidsvg.lqeggnwhkg.okpsazkaxt.percent);
                        }
                        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVarXrmfcynszj2 = xrmfcynszj(null, null, rgvfuqvkyqVar5, rgvfuqvkyqVar6);
                        yzdjzghtvl();
                        skhdrjzrfn((com.caverock.androidsvg.lqeggnwhkg.mbcevpiqjq) cllcsxoeizVarOxmwwwfdhm, zoijcleaowVarXrmfcynszj2);
                        rhgxfdycjh();
                    } else {
                        iwxlajgraz(cllcsxoeizVarOxmwwwfdhm);
                    }
                    rlfsiqarku();
                    if (zSflfametgt) {
                        uwvvkdfqfp(jztzpxfvevVar);
                    }
                    krqnebusok(jztzpxfvevVar);
                }
            }
        }
    }

    private Path metgxyhuhe(com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar, boolean z13) {
        Path pathOkpsazkaxt;
        Path pathBtonecajqb;
        this.f21617eablkybsjg.push(this.f21623wkgbmnqykc);
        C0391nufgyqmvbu c0391nufgyqmvbu = new C0391nufgyqmvbu(this.f21623wkgbmnqykc);
        this.f21623wkgbmnqykc = c0391nufgyqmvbu;
        b(c0391nufgyqmvbu, hcddaimhwwVar);
        if (!pmvmpeiblj() || !d()) {
            this.f21623wkgbmnqykc = (C0391nufgyqmvbu) this.f21617eablkybsjg.pop();
            return null;
        }
        if (hcddaimhwwVar instanceof com.caverock.androidsvg.lqeggnwhkg.jztzpxfvev) {
            if (!z13) {
                iozdgvuglv("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            com.caverock.androidsvg.lqeggnwhkg.jztzpxfvev jztzpxfvevVar = (com.caverock.androidsvg.lqeggnwhkg.jztzpxfvev) hcddaimhwwVar;
            com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = hcddaimhwwVar.f21405iobyxmoadg.oxmwwwfdhm(jztzpxfvevVar.f21454rgvfuqvkyq);
            if (cllcsxoeizVarOxmwwwfdhm == null) {
                iozdgvuglv("Use reference '%s' not found", jztzpxfvevVar.f21454rgvfuqvkyq);
                this.f21623wkgbmnqykc = (C0391nufgyqmvbu) this.f21617eablkybsjg.pop();
                return null;
            }
            if (!(cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.hcddaimhww)) {
                this.f21623wkgbmnqykc = (C0391nufgyqmvbu) this.f21617eablkybsjg.pop();
                return null;
            }
            pathOkpsazkaxt = metgxyhuhe((com.caverock.androidsvg.lqeggnwhkg.hcddaimhww) cllcsxoeizVarOxmwwwfdhm, false);
            if (pathOkpsazkaxt == null) {
                return null;
            }
            if (jztzpxfvevVar.f21428nufgyqmvbu == null) {
                jztzpxfvevVar.f21428nufgyqmvbu = wflxmlrfwp(pathOkpsazkaxt);
            }
            Matrix matrix = jztzpxfvevVar.f21514ojitshcjhn;
            if (matrix != null) {
                pathOkpsazkaxt.transform(matrix);
            }
        } else if (hcddaimhwwVar instanceof com.caverock.androidsvg.lqeggnwhkg.draadjrbmk) {
            com.caverock.androidsvg.lqeggnwhkg.draadjrbmk draadjrbmkVar = (com.caverock.androidsvg.lqeggnwhkg.draadjrbmk) hcddaimhwwVar;
            if (hcddaimhwwVar instanceof com.caverock.androidsvg.lqeggnwhkg.jyumaefscl) {
                pathOkpsazkaxt = new wkgbmnqykc(((com.caverock.androidsvg.lqeggnwhkg.jyumaefscl) hcddaimhwwVar).f21450ojitshcjhn).zoijcleaow();
                if (hcddaimhwwVar.f21428nufgyqmvbu == null) {
                    hcddaimhwwVar.f21428nufgyqmvbu = wflxmlrfwp(pathOkpsazkaxt);
                }
            } else if (hcddaimhwwVar instanceof com.caverock.androidsvg.lqeggnwhkg.zynmafqrjb) {
                pathOkpsazkaxt = ikoacuggdj((com.caverock.androidsvg.lqeggnwhkg.zynmafqrjb) hcddaimhwwVar);
            } else if (hcddaimhwwVar instanceof com.caverock.androidsvg.lqeggnwhkg.wkgbmnqykc) {
                pathOkpsazkaxt = jlmebxxoox((com.caverock.androidsvg.lqeggnwhkg.wkgbmnqykc) hcddaimhwwVar);
            } else if (hcddaimhwwVar instanceof com.caverock.androidsvg.lqeggnwhkg.dxjokdxxww) {
                pathOkpsazkaxt = ribwqtqdhb((com.caverock.androidsvg.lqeggnwhkg.dxjokdxxww) hcddaimhwwVar);
            } else {
                pathOkpsazkaxt = hcddaimhwwVar instanceof com.caverock.androidsvg.lqeggnwhkg.lereixgezr ? jhduphickx((com.caverock.androidsvg.lqeggnwhkg.lereixgezr) hcddaimhwwVar) : null;
            }
            if (pathOkpsazkaxt == null) {
                return null;
            }
            if (draadjrbmkVar.f21428nufgyqmvbu == null) {
                draadjrbmkVar.f21428nufgyqmvbu = wflxmlrfwp(pathOkpsazkaxt);
            }
            Matrix matrix2 = draadjrbmkVar.f21407agtfadlqog;
            if (matrix2 != null) {
                pathOkpsazkaxt.transform(matrix2);
            }
            pathOkpsazkaxt.setFillType(wypolnanlu());
        } else {
            if (!(hcddaimhwwVar instanceof com.caverock.androidsvg.lqeggnwhkg.sopmlzcsov)) {
                iozdgvuglv("Invalid %s element found in clipPath definition", hcddaimhwwVar.agtfadlqog());
                return null;
            }
            com.caverock.androidsvg.lqeggnwhkg.sopmlzcsov sopmlzcsovVar = (com.caverock.androidsvg.lqeggnwhkg.sopmlzcsov) hcddaimhwwVar;
            pathOkpsazkaxt = okpsazkaxt(sopmlzcsovVar);
            if (pathOkpsazkaxt == null) {
                return null;
            }
            Matrix matrix3 = sopmlzcsovVar.f21499kcexrzcfyt;
            if (matrix3 != null) {
                pathOkpsazkaxt.transform(matrix3);
            }
            pathOkpsazkaxt.setFillType(wypolnanlu());
        }
        if (this.f21623wkgbmnqykc.f21647iobyxmoadg.f21528crxdokpmqz != null && (pathBtonecajqb = btonecajqb(hcddaimhwwVar, hcddaimhwwVar.f21428nufgyqmvbu)) != null) {
            pathOkpsazkaxt.op(pathBtonecajqb, Path.Op.INTERSECT);
        }
        this.f21623wkgbmnqykc = (C0391nufgyqmvbu) this.f21617eablkybsjg.pop();
        return pathOkpsazkaxt;
    }

    private boolean mhtqkkgtqm() {
        return this.f21623wkgbmnqykc.f21647iobyxmoadg.f21534iozdgvuglv.floatValue() < 1.0f || this.f21623wkgbmnqykc.f21647iobyxmoadg.f21550ribwqtqdhb != null;
    }

    private Path.FillType ntlheqmsrt() {
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg iobyxmoadgVar = this.f21623wkgbmnqykc.f21647iobyxmoadg.f21540jyumaefscl;
        return (iobyxmoadgVar == null || iobyxmoadgVar != com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void nufgyqmvbu(float f13, float f14, float f15, float f16, float f17, boolean z13, boolean z14, float f18, float f19, com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr cqumvgiudrVar) {
        if (f13 == f18 && f14 == f19) {
            return;
        }
        if (f15 == 0.0f || f16 == 0.0f) {
            cqumvgiudrVar.wkgbmnqykc(f18, f19);
            return;
        }
        float fAbs = Math.abs(f15);
        float fAbs2 = Math.abs(f16);
        double radians = Math.toRadians(((double) f17) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d13 = ((double) (f13 - f18)) / 2.0d;
        double d14 = ((double) (f14 - f19)) / 2.0d;
        double d15 = (dCos * d13) + (dSin * d14);
        double d16 = ((-dSin) * d13) + (d14 * dCos);
        double d17 = fAbs * fAbs;
        double d18 = fAbs2 * fAbs2;
        double d19 = d15 * d15;
        double d23 = d16 * d16;
        double d24 = (d19 / d17) + (d23 / d18);
        if (d24 > 0.99999d) {
            double dSqrt = Math.sqrt(d24) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d17 = fAbs * fAbs;
            d18 = fAbs2 * fAbs2;
        }
        double d25 = z13 == z14 ? -1.0d : 1.0d;
        double d26 = d17 * d18;
        double d27 = d17 * d23;
        double d28 = d18 * d19;
        double d29 = ((d26 - d27) - d28) / (d27 + d28);
        if (d29 < 0.0d) {
            d29 = 0.0d;
        }
        double dSqrt2 = d25 * Math.sqrt(d29);
        double d33 = fAbs;
        double d34 = fAbs2;
        double d35 = ((d33 * d16) / d34) * dSqrt2;
        float f23 = fAbs;
        float f24 = fAbs2;
        double d36 = dSqrt2 * (-((d34 * d15) / d33));
        double d37 = (((double) (f13 + f18)) / 2.0d) + ((dCos * d35) - (dSin * d36));
        double d38 = (((double) (f14 + f19)) / 2.0d) + (dSin * d35) + (dCos * d36);
        double d39 = (d15 - d35) / d33;
        double d43 = (d16 - d36) / d34;
        double d44 = ((-d15) - d35) / d33;
        double d45 = ((-d16) - d36) / d34;
        double d46 = (d39 * d39) + (d43 * d43);
        double dAcos = (d43 < 0.0d ? -1.0d : 1.0d) * Math.acos(d39 / Math.sqrt(d46));
        double dJyumaefscl = ((d39 * d45) - (d43 * d44) < 0.0d ? -1.0d : 1.0d) * jyumaefscl(((d39 * d44) + (d43 * d45)) / Math.sqrt(d46 * ((d44 * d44) + (d45 * d45))));
        if (!z14 && dJyumaefscl > 0.0d) {
            dJyumaefscl -= 6.283185307179586d;
        } else if (z14 && dJyumaefscl < 0.0d) {
            dJyumaefscl += 6.283185307179586d;
        }
        float[] fArrDxjokdxxww = dxjokdxxww(dAcos % 6.283185307179586d, dJyumaefscl % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(f23, f24);
        matrix.postRotate(f17);
        matrix.postTranslate((float) d37, (float) d38);
        matrix.mapPoints(fArrDxjokdxxww);
        fArrDxjokdxxww[fArrDxjokdxxww.length - 2] = f18;
        fArrDxjokdxxww[fArrDxjokdxxww.length - 1] = f19;
        for (int i13 = 0; i13 < fArrDxjokdxxww.length; i13 += 6) {
            cqumvgiudrVar.ppxfxbqfkf(fArrDxjokdxxww[i13], fArrDxjokdxxww[i13 + 1], fArrDxjokdxxww[i13 + 2], fArrDxjokdxxww[i13 + 3], fArrDxjokdxxww[i13 + 4], fArrDxjokdxxww[i13 + 5]);
        }
    }

    private void nuxfzjnpeb(com.caverock.androidsvg.lqeggnwhkg.pmvmpeiblj pmvmpeibljVar) {
        esjtqupxsv("Polygon render", new Object[0]);
        b(this.f21623wkgbmnqykc, pmvmpeibljVar);
        if (pmvmpeiblj() && d()) {
            C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
            if (c0391nufgyqmvbu.f21650ppxfxbqfkf || c0391nufgyqmvbu.f21652zoijcleaow) {
                Matrix matrix = pmvmpeibljVar.f21407agtfadlqog;
                if (matrix != null) {
                    this.f21619iobyxmoadg.concat(matrix);
                }
                if (pmvmpeibljVar.f21464ojitshcjhn.length < 2) {
                    return;
                }
                Path pathJhduphickx = jhduphickx(pmvmpeibljVar);
                krqnebusok(pmvmpeibljVar);
                oxmwwwfdhm(pmvmpeibljVar);
                rgvfuqvkyq(pmvmpeibljVar);
                boolean zSflfametgt = sflfametgt();
                if (this.f21623wkgbmnqykc.f21652zoijcleaow) {
                    zynmafqrjb(pmvmpeibljVar, pathJhduphickx);
                }
                if (this.f21623wkgbmnqykc.f21650ppxfxbqfkf) {
                    istkbnxepw(pathJhduphickx);
                }
                ageimvtcrz(pmvmpeibljVar);
                if (zSflfametgt) {
                    uwvvkdfqfp(pmvmpeibljVar);
                }
            }
        }
    }

    private void oipsdeybqn(com.caverock.androidsvg.lqeggnwhkg.wkgbmnqykc wkgbmnqykcVar) {
        esjtqupxsv("Circle render", new Object[0]);
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = wkgbmnqykcVar.f21517vdvldrhtss;
        if (rgvfuqvkyqVar == null || rgvfuqvkyqVar.nufgyqmvbu()) {
            return;
        }
        b(this.f21623wkgbmnqykc, wkgbmnqykcVar);
        if (pmvmpeiblj() && d()) {
            Matrix matrix = wkgbmnqykcVar.f21407agtfadlqog;
            if (matrix != null) {
                this.f21619iobyxmoadg.concat(matrix);
            }
            Path pathJlmebxxoox = jlmebxxoox(wkgbmnqykcVar);
            krqnebusok(wkgbmnqykcVar);
            oxmwwwfdhm(wkgbmnqykcVar);
            rgvfuqvkyq(wkgbmnqykcVar);
            boolean zSflfametgt = sflfametgt();
            if (this.f21623wkgbmnqykc.f21652zoijcleaow) {
                zynmafqrjb(wkgbmnqykcVar, pathJlmebxxoox);
            }
            if (this.f21623wkgbmnqykc.f21650ppxfxbqfkf) {
                istkbnxepw(pathJlmebxxoox);
            }
            if (zSflfametgt) {
                uwvvkdfqfp(wkgbmnqykcVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Matrix ojitshcjhn(com.caverock.androidsvg.lqeggnwhkg.zoijcleaow r10, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow r11, com.caverock.androidsvg.eablkybsjg r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            com.caverock.androidsvg.eablkybsjg$iobyxmoadg r1 = r12.iobyxmoadg()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f21607ppxfxbqfkf
            float r2 = r11.f21607ppxfxbqfkf
            float r1 = r1 / r2
            float r2 = r10.f21608wkgbmnqykc
            float r3 = r11.f21608wkgbmnqykc
            float r2 = r2 / r3
            float r3 = r11.f21606iobyxmoadg
            float r3 = -r3
            float r4 = r11.f21609zoijcleaow
            float r4 = -r4
            com.caverock.androidsvg.eablkybsjg r5 = com.caverock.androidsvg.eablkybsjg.f21369wkgbmnqykc
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f21606iobyxmoadg
            float r10 = r10.f21609zoijcleaow
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            com.caverock.androidsvg.eablkybsjg$zoijcleaow r5 = r12.zoijcleaow()
            com.caverock.androidsvg.eablkybsjg$zoijcleaow r6 = com.caverock.androidsvg.eablkybsjg.zoijcleaow.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f21607ppxfxbqfkf
            float r2 = r2 / r1
            float r5 = r10.f21608wkgbmnqykc
            float r5 = r5 / r1
            int[] r6 = com.caverock.androidsvg.nufgyqmvbu.iobyxmoadg.f21637iobyxmoadg
            com.caverock.androidsvg.eablkybsjg$iobyxmoadg r7 = r12.iobyxmoadg()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f21607ppxfxbqfkf
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f21607ppxfxbqfkf
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            com.caverock.androidsvg.eablkybsjg$iobyxmoadg r12 = r12.iobyxmoadg()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f21608wkgbmnqykc
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f21608wkgbmnqykc
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f21606iobyxmoadg
            float r10 = r10.f21609zoijcleaow
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.nufgyqmvbu.ojitshcjhn(com.caverock.androidsvg.lqeggnwhkg$zoijcleaow, com.caverock.androidsvg.lqeggnwhkg$zoijcleaow, com.caverock.androidsvg.eablkybsjg):android.graphics.Matrix");
    }

    private Path okpsazkaxt(com.caverock.androidsvg.lqeggnwhkg.sopmlzcsov sopmlzcsovVar) {
        List list = sopmlzcsovVar.f21510ojitshcjhn;
        float fGxszxtbevo = 0.0f;
        float fEablkybsjg = (list == null || list.size() == 0) ? 0.0f : ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) sopmlzcsovVar.f21510ojitshcjhn.get(0)).eablkybsjg(this);
        List list2 = sopmlzcsovVar.f21512rgvfuqvkyq;
        float fGxszxtbevo2 = (list2 == null || list2.size() == 0) ? 0.0f : ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) sopmlzcsovVar.f21512rgvfuqvkyq.get(0)).gxszxtbevo(this);
        List list3 = sopmlzcsovVar.f21513vdvldrhtss;
        float fEablkybsjg2 = (list3 == null || list3.size() == 0) ? 0.0f : ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) sopmlzcsovVar.f21513vdvldrhtss.get(0)).eablkybsjg(this);
        List list4 = sopmlzcsovVar.f21511oxmwwwfdhm;
        if (list4 != null && list4.size() != 0) {
            fGxszxtbevo = ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) sopmlzcsovVar.f21511oxmwwwfdhm.get(0)).gxszxtbevo(this);
        }
        if (this.f21623wkgbmnqykc.f21647iobyxmoadg.f21526cllcsxoeiz != com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Start) {
            float fAgtfadlqog = agtfadlqog(sopmlzcsovVar);
            if (this.f21623wkgbmnqykc.f21647iobyxmoadg.f21526cllcsxoeiz == com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Middle) {
                fAgtfadlqog /= 2.0f;
            }
            fEablkybsjg -= fAgtfadlqog;
        }
        if (sopmlzcsovVar.f21428nufgyqmvbu == null) {
            dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(fEablkybsjg, fGxszxtbevo2);
            yadqdtsiqt(sopmlzcsovVar, dxjokdxxwwVar);
            RectF rectF = dxjokdxxwwVar.f21628wkgbmnqykc;
            sopmlzcsovVar.f21428nufgyqmvbu = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(rectF.left, rectF.top, rectF.width(), dxjokdxxwwVar.f21628wkgbmnqykc.height());
        }
        Path path = new Path();
        yadqdtsiqt(sopmlzcsovVar, new lqeggnwhkg(fEablkybsjg + fEablkybsjg2, fGxszxtbevo2 + fGxszxtbevo, path));
        return path;
    }

    private void opjhrmiecq(com.caverock.androidsvg.lqeggnwhkg.wflxmlrfwp wflxmlrfwpVar) {
        esjtqupxsv("Group render", new Object[0]);
        b(this.f21623wkgbmnqykc, wflxmlrfwpVar);
        if (pmvmpeiblj()) {
            Matrix matrix = wflxmlrfwpVar.f21514ojitshcjhn;
            if (matrix != null) {
                this.f21619iobyxmoadg.concat(matrix);
            }
            rgvfuqvkyq(wflxmlrfwpVar);
            boolean zSflfametgt = sflfametgt();
            wizcaqwiak(wflxmlrfwpVar, true);
            if (zSflfametgt) {
                uwvvkdfqfp(wflxmlrfwpVar);
            }
            krqnebusok(wflxmlrfwpVar);
        }
    }

    private void oxmwwwfdhm(com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar) {
        com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVar = this.f21623wkgbmnqykc.f21647iobyxmoadg.f21560yggfygwlhe;
        if (dsvhmnatusVar instanceof com.caverock.androidsvg.lqeggnwhkg.yggfygwlhe) {
            lereixgezr(true, hcddaimhwwVar.f21428nufgyqmvbu, (com.caverock.androidsvg.lqeggnwhkg.yggfygwlhe) dsvhmnatusVar);
        }
        com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVar2 = this.f21623wkgbmnqykc.f21647iobyxmoadg.f21527cqumvgiudr;
        if (dsvhmnatusVar2 instanceof com.caverock.androidsvg.lqeggnwhkg.yggfygwlhe) {
            lereixgezr(false, hcddaimhwwVar.f21428nufgyqmvbu, (com.caverock.androidsvg.lqeggnwhkg.yggfygwlhe) dsvhmnatusVar2);
        }
    }

    private void pkzmftpjix(com.caverock.androidsvg.lqeggnwhkg.stevsuqkhv stevsuqkhvVar, com.caverock.androidsvg.lqeggnwhkg.stevsuqkhv stevsuqkhvVar2) {
        if (stevsuqkhvVar.f21504wflxmlrfwp == null) {
            stevsuqkhvVar.f21504wflxmlrfwp = stevsuqkhvVar2.f21504wflxmlrfwp;
        }
        if (stevsuqkhvVar.f21500agtfadlqog == null) {
            stevsuqkhvVar.f21500agtfadlqog = stevsuqkhvVar2.f21500agtfadlqog;
        }
        if (stevsuqkhvVar.f21501ojitshcjhn == null) {
            stevsuqkhvVar.f21501ojitshcjhn = stevsuqkhvVar2.f21501ojitshcjhn;
        }
        if (stevsuqkhvVar.f21502rgvfuqvkyq == null) {
            stevsuqkhvVar.f21502rgvfuqvkyq = stevsuqkhvVar2.f21502rgvfuqvkyq;
        }
        if (stevsuqkhvVar.f21503vdvldrhtss == null) {
            stevsuqkhvVar.f21503vdvldrhtss = stevsuqkhvVar2.f21503vdvldrhtss;
        }
    }

    private boolean pmvmpeiblj() {
        Boolean bool = this.f21623wkgbmnqykc.f21647iobyxmoadg.f21545mbcevpiqjq;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void rgvfuqvkyq(com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar) {
        vdvldrhtss(hcddaimhwwVar, hcddaimhwwVar.f21428nufgyqmvbu);
    }

    private void rhgxfdycjh() {
        this.f21619iobyxmoadg.restore();
        this.f21623wkgbmnqykc = (C0391nufgyqmvbu) this.f21617eablkybsjg.pop();
    }

    private Path ribwqtqdhb(com.caverock.androidsvg.lqeggnwhkg.dxjokdxxww dxjokdxxwwVar) {
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = dxjokdxxwwVar.f21408ojitshcjhn;
        float fEablkybsjg = rgvfuqvkyqVar != null ? rgvfuqvkyqVar.eablkybsjg(this) : 0.0f;
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = dxjokdxxwwVar.f21410rgvfuqvkyq;
        float fGxszxtbevo = rgvfuqvkyqVar2 != null ? rgvfuqvkyqVar2.gxszxtbevo(this) : 0.0f;
        float fEablkybsjg2 = dxjokdxxwwVar.f21411vdvldrhtss.eablkybsjg(this);
        float fGxszxtbevo2 = dxjokdxxwwVar.f21409oxmwwwfdhm.gxszxtbevo(this);
        float f13 = fEablkybsjg - fEablkybsjg2;
        float f14 = fGxszxtbevo - fGxszxtbevo2;
        float f15 = fEablkybsjg + fEablkybsjg2;
        float f16 = fGxszxtbevo + fGxszxtbevo2;
        if (dxjokdxxwwVar.f21428nufgyqmvbu == null) {
            dxjokdxxwwVar.f21428nufgyqmvbu = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(f13, f14, fEablkybsjg2 * 2.0f, 2.0f * fGxszxtbevo2);
        }
        float f17 = fEablkybsjg2 * 0.5522848f;
        float f18 = 0.5522848f * fGxszxtbevo2;
        Path path = new Path();
        path.moveTo(fEablkybsjg, f14);
        float f19 = fEablkybsjg + f17;
        float f23 = fGxszxtbevo - f18;
        path.cubicTo(f19, f14, f15, f23, f15, fGxszxtbevo);
        float f24 = f18 + fGxszxtbevo;
        path.cubicTo(f15, f24, f19, f16, fEablkybsjg, f16);
        float f25 = fEablkybsjg - f17;
        path.cubicTo(f25, f16, f13, f24, f13, fGxszxtbevo);
        path.cubicTo(f13, f23, f25, f14, fEablkybsjg, f14);
        path.close();
        return path;
    }

    private void rlfsiqarku() {
        this.f21618gxszxtbevo.pop();
        this.f21620lqeggnwhkg.pop();
    }

    private void roivzttewh(com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv iozdgvuglvVar) {
        auzgnhcxok(iozdgvuglvVar, xrmfcynszj(iozdgvuglvVar.f21438vdvldrhtss, iozdgvuglvVar.f21437oxmwwwfdhm, iozdgvuglvVar.f21436kcexrzcfyt, iozdgvuglvVar.f21440zdlpuopuiu), iozdgvuglvVar.f21463rgvfuqvkyq, iozdgvuglvVar.f21524ojitshcjhn);
    }

    private boolean sflfametgt() {
        com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm;
        if (!mhtqkkgtqm()) {
            return false;
        }
        this.f21619iobyxmoadg.saveLayerAlpha(null, iwizpuwonk(this.f21623wkgbmnqykc.f21647iobyxmoadg.f21534iozdgvuglv.floatValue()), 31);
        this.f21617eablkybsjg.push(this.f21623wkgbmnqykc);
        C0391nufgyqmvbu c0391nufgyqmvbu = new C0391nufgyqmvbu(this.f21623wkgbmnqykc);
        this.f21623wkgbmnqykc = c0391nufgyqmvbu;
        String str = c0391nufgyqmvbu.f21647iobyxmoadg.f21550ribwqtqdhb;
        if (str != null && ((cllcsxoeizVarOxmwwwfdhm = this.f21622ppxfxbqfkf.oxmwwwfdhm(str)) == null || !(cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.kcexrzcfyt))) {
            iozdgvuglv("Mask reference '%s' not found", this.f21623wkgbmnqykc.f21647iobyxmoadg.f21550ribwqtqdhb);
            this.f21623wkgbmnqykc.f21647iobyxmoadg.f21550ribwqtqdhb = null;
        }
        return true;
    }

    private void skhdrjzrfn(com.caverock.androidsvg.lqeggnwhkg.mbcevpiqjq mbcevpiqjqVar, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar) {
        esjtqupxsv("Symbol render", new Object[0]);
        if (zoijcleaowVar.f21607ppxfxbqfkf == 0.0f || zoijcleaowVar.f21608wkgbmnqykc == 0.0f) {
            return;
        }
        com.caverock.androidsvg.eablkybsjg eablkybsjgVar = mbcevpiqjqVar.f21524ojitshcjhn;
        if (eablkybsjgVar == null) {
            eablkybsjgVar = com.caverock.androidsvg.eablkybsjg.f21363eablkybsjg;
        }
        b(this.f21623wkgbmnqykc, mbcevpiqjqVar);
        C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
        c0391nufgyqmvbu.f21646gxszxtbevo = zoijcleaowVar;
        if (!c0391nufgyqmvbu.f21647iobyxmoadg.f21529dsvhmnatus.booleanValue()) {
            com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar2 = this.f21623wkgbmnqykc.f21646gxszxtbevo;
            jrbgnlbqoe(zoijcleaowVar2.f21606iobyxmoadg, zoijcleaowVar2.f21609zoijcleaow, zoijcleaowVar2.f21607ppxfxbqfkf, zoijcleaowVar2.f21608wkgbmnqykc);
        }
        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar3 = mbcevpiqjqVar.f21463rgvfuqvkyq;
        if (zoijcleaowVar3 != null) {
            this.f21619iobyxmoadg.concat(ojitshcjhn(this.f21623wkgbmnqykc.f21646gxszxtbevo, zoijcleaowVar3, eablkybsjgVar));
            this.f21623wkgbmnqykc.f21648lqeggnwhkg = mbcevpiqjqVar.f21463rgvfuqvkyq;
        } else {
            Canvas canvas = this.f21619iobyxmoadg;
            com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar4 = this.f21623wkgbmnqykc.f21646gxszxtbevo;
            canvas.translate(zoijcleaowVar4.f21606iobyxmoadg, zoijcleaowVar4.f21609zoijcleaow);
        }
        boolean zSflfametgt = sflfametgt();
        wizcaqwiak(mbcevpiqjqVar, true);
        if (zSflfametgt) {
            uwvvkdfqfp(mbcevpiqjqVar);
        }
        krqnebusok(mbcevpiqjqVar);
    }

    private boolean sopmlzcsov(com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt yadqdtsiqtVar, long j13) {
        return (yadqdtsiqtVar.f21562zdlpuopuiu & j13) != 0;
    }

    private void tbqsvytpvh(com.caverock.androidsvg.lqeggnwhkg.zynmafqrjb zynmafqrjbVar) {
        esjtqupxsv("Rect render", new Object[0]);
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = zynmafqrjbVar.f21614vdvldrhtss;
        if (rgvfuqvkyqVar == null || zynmafqrjbVar.f21612oxmwwwfdhm == null || rgvfuqvkyqVar.nufgyqmvbu() || zynmafqrjbVar.f21612oxmwwwfdhm.nufgyqmvbu()) {
            return;
        }
        b(this.f21623wkgbmnqykc, zynmafqrjbVar);
        if (pmvmpeiblj() && d()) {
            Matrix matrix = zynmafqrjbVar.f21407agtfadlqog;
            if (matrix != null) {
                this.f21619iobyxmoadg.concat(matrix);
            }
            Path pathIkoacuggdj = ikoacuggdj(zynmafqrjbVar);
            krqnebusok(zynmafqrjbVar);
            oxmwwwfdhm(zynmafqrjbVar);
            rgvfuqvkyq(zynmafqrjbVar);
            boolean zSflfametgt = sflfametgt();
            if (this.f21623wkgbmnqykc.f21652zoijcleaow) {
                zynmafqrjb(zynmafqrjbVar, pathIkoacuggdj);
            }
            if (this.f21623wkgbmnqykc.f21650ppxfxbqfkf) {
                istkbnxepw(pathIkoacuggdj);
            }
            if (zSflfametgt) {
                uwvvkdfqfp(zynmafqrjbVar);
            }
        }
    }

    private void uawqvzlxes(com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv iozdgvuglvVar, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar) {
        auzgnhcxok(iozdgvuglvVar, zoijcleaowVar, iozdgvuglvVar.f21463rgvfuqvkyq, iozdgvuglvVar.f21524ojitshcjhn);
    }

    private static synchronized void ulzqkzuiru() {
        HashSet hashSet = new HashSet();
        f21616dxjokdxxww = hashSet;
        hashSet.add("Structure");
        f21616dxjokdxxww.add("BasicStructure");
        f21616dxjokdxxww.add("ConditionalProcessing");
        f21616dxjokdxxww.add("Image");
        f21616dxjokdxxww.add("Style");
        f21616dxjokdxxww.add("ViewportAttribute");
        f21616dxjokdxxww.add("Shape");
        f21616dxjokdxxww.add("BasicText");
        f21616dxjokdxxww.add("PaintAttribute");
        f21616dxjokdxxww.add("BasicPaintAttribute");
        f21616dxjokdxxww.add("OpacityAttribute");
        f21616dxjokdxxww.add("BasicGraphicsAttribute");
        f21616dxjokdxxww.add("Marker");
        f21616dxjokdxxww.add("Gradient");
        f21616dxjokdxxww.add("Pattern");
        f21616dxjokdxxww.add("Clip");
        f21616dxjokdxxww.add("BasicClip");
        f21616dxjokdxxww.add("Mask");
        f21616dxjokdxxww.add(EcomMetricKey.VIEW);
    }

    private void uwvvkdfqfp(com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar) {
        yfnezrywwk(hcddaimhwwVar, hcddaimhwwVar.f21428nufgyqmvbu);
    }

    private void vdvldrhtss(com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar) {
        Path pathBtonecajqb;
        if (this.f21623wkgbmnqykc.f21647iobyxmoadg.f21528crxdokpmqz == null || (pathBtonecajqb = btonecajqb(hcddaimhwwVar, zoijcleaowVar)) == null) {
            return;
        }
        this.f21619iobyxmoadg.clipPath(pathBtonecajqb);
    }

    private Path vipkmwdibw(com.caverock.androidsvg.lqeggnwhkg.vdvldrhtss vdvldrhtssVar) {
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = vdvldrhtssVar.f21506ojitshcjhn;
        float fEablkybsjg = rgvfuqvkyqVar == null ? 0.0f : rgvfuqvkyqVar.eablkybsjg(this);
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = vdvldrhtssVar.f21508rgvfuqvkyq;
        float fGxszxtbevo = rgvfuqvkyqVar2 == null ? 0.0f : rgvfuqvkyqVar2.gxszxtbevo(this);
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar3 = vdvldrhtssVar.f21509vdvldrhtss;
        float fEablkybsjg2 = rgvfuqvkyqVar3 == null ? 0.0f : rgvfuqvkyqVar3.eablkybsjg(this);
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar4 = vdvldrhtssVar.f21507oxmwwwfdhm;
        float fGxszxtbevo2 = rgvfuqvkyqVar4 != null ? rgvfuqvkyqVar4.gxszxtbevo(this) : 0.0f;
        if (vdvldrhtssVar.f21428nufgyqmvbu == null) {
            vdvldrhtssVar.f21428nufgyqmvbu = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(Math.min(fEablkybsjg, fEablkybsjg2), Math.min(fGxszxtbevo, fGxszxtbevo2), Math.abs(fEablkybsjg2 - fEablkybsjg), Math.abs(fGxszxtbevo2 - fGxszxtbevo));
        }
        Path path = new Path();
        path.moveTo(fEablkybsjg, fGxszxtbevo);
        path.lineTo(fEablkybsjg2, fGxszxtbevo2);
        return path;
    }

    private void weqkydbzbr(com.caverock.androidsvg.lqeggnwhkg.vdvldrhtss vdvldrhtssVar) {
        esjtqupxsv("Line render", new Object[0]);
        b(this.f21623wkgbmnqykc, vdvldrhtssVar);
        if (pmvmpeiblj() && d() && this.f21623wkgbmnqykc.f21650ppxfxbqfkf) {
            Matrix matrix = vdvldrhtssVar.f21407agtfadlqog;
            if (matrix != null) {
                this.f21619iobyxmoadg.concat(matrix);
            }
            Path pathVipkmwdibw = vipkmwdibw(vdvldrhtssVar);
            krqnebusok(vdvldrhtssVar);
            oxmwwwfdhm(vdvldrhtssVar);
            rgvfuqvkyq(vdvldrhtssVar);
            boolean zSflfametgt = sflfametgt();
            istkbnxepw(pathVipkmwdibw);
            ageimvtcrz(vdvldrhtssVar);
            if (zSflfametgt) {
                uwvvkdfqfp(vdvldrhtssVar);
            }
        }
    }

    private com.caverock.androidsvg.lqeggnwhkg.zoijcleaow wflxmlrfwp(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private void wizcaqwiak(com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix pkzmftpjixVar, boolean z13) {
        if (z13) {
            czzsidtyhn(pkzmftpjixVar);
        }
        Iterator it = pkzmftpjixVar.iobyxmoadg().iterator();
        while (it.hasNext()) {
            iwxlajgraz((com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) it.next());
        }
        if (z13) {
            rlfsiqarku();
        }
    }

    private void wwaezpbzkn(com.caverock.androidsvg.lqeggnwhkg.btonecajqb btonecajqbVar, String str) {
        com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = btonecajqbVar.f21405iobyxmoadg.oxmwwwfdhm(str);
        if (cllcsxoeizVarOxmwwwfdhm == null) {
            e("Gradient reference '%s' not found", str);
            return;
        }
        if (!(cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.btonecajqb)) {
            iozdgvuglv("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (cllcsxoeizVarOxmwwwfdhm == btonecajqbVar) {
            iozdgvuglv("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        com.caverock.androidsvg.lqeggnwhkg.btonecajqb btonecajqbVar2 = (com.caverock.androidsvg.lqeggnwhkg.btonecajqb) cllcsxoeizVarOxmwwwfdhm;
        if (btonecajqbVar.f21401dxjokdxxww == null) {
            btonecajqbVar.f21401dxjokdxxww = btonecajqbVar2.f21401dxjokdxxww;
        }
        if (btonecajqbVar.f21399btonecajqb == null) {
            btonecajqbVar.f21399btonecajqb = btonecajqbVar2.f21399btonecajqb;
        }
        if (btonecajqbVar.f21402gtknphoqwx == null) {
            btonecajqbVar.f21402gtknphoqwx = btonecajqbVar2.f21402gtknphoqwx;
        }
        if (btonecajqbVar.f21403nufgyqmvbu.isEmpty()) {
            btonecajqbVar.f21403nufgyqmvbu = btonecajqbVar2.f21403nufgyqmvbu;
        }
        try {
            if (btonecajqbVar instanceof com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz) {
                ylkuphrtab((com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz) btonecajqbVar, (com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz) cllcsxoeizVarOxmwwwfdhm);
            } else {
                pkzmftpjix((com.caverock.androidsvg.lqeggnwhkg.stevsuqkhv) btonecajqbVar, (com.caverock.androidsvg.lqeggnwhkg.stevsuqkhv) cllcsxoeizVarOxmwwwfdhm);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = btonecajqbVar2.f21400draadjrbmk;
        if (str2 != null) {
            wwaezpbzkn(btonecajqbVar, str2);
        }
    }

    private Path.FillType wypolnanlu() {
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg iobyxmoadgVar = this.f21623wkgbmnqykc.f21647iobyxmoadg.f21538jlmebxxoox;
        return (iobyxmoadgVar == null || iobyxmoadgVar != com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private com.caverock.androidsvg.lqeggnwhkg.zoijcleaow xrmfcynszj(com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar, com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2, com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar3, com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar4) {
        float fEablkybsjg = rgvfuqvkyqVar != null ? rgvfuqvkyqVar.eablkybsjg(this) : 0.0f;
        float fGxszxtbevo = rgvfuqvkyqVar2 != null ? rgvfuqvkyqVar2.gxszxtbevo(this) : 0.0f;
        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVarTzroggbefp = tzroggbefp();
        return new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(fEablkybsjg, fGxszxtbevo, rgvfuqvkyqVar3 != null ? rgvfuqvkyqVar3.eablkybsjg(this) : zoijcleaowVarTzroggbefp.f21607ppxfxbqfkf, rgvfuqvkyqVar4 != null ? rgvfuqvkyqVar4.gxszxtbevo(this) : zoijcleaowVarTzroggbefp.f21608wkgbmnqykc);
    }

    private void yadqdtsiqt(com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox jlmebxxooxVar, btonecajqb btonecajqbVar) {
        if (pmvmpeiblj()) {
            Iterator it = jlmebxxooxVar.f21521dxjokdxxww.iterator();
            boolean z13 = true;
            while (it.hasNext()) {
                com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVar = (com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz) it.next();
                if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.ikoacuggdj) {
                    btonecajqbVar.zoijcleaow(eslsurpljm(((com.caverock.androidsvg.lqeggnwhkg.ikoacuggdj) cllcsxoeizVar).f21433ppxfxbqfkf, z13, !it.hasNext()));
                } else {
                    ydmasvzmpa(cllcsxoeizVar, btonecajqbVar);
                }
                z13 = false;
            }
        }
    }

    private void ydmasvzmpa(com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVar, btonecajqb btonecajqbVar) {
        float f13;
        float fGxszxtbevo;
        float fEablkybsjg;
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo gxszxtbevoVarDsvhmnatus;
        if (btonecajqbVar.iobyxmoadg((com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox) cllcsxoeizVar)) {
            if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.ribwqtqdhb) {
                yzdjzghtvl();
                grlcpdaxtj((com.caverock.androidsvg.lqeggnwhkg.ribwqtqdhb) cllcsxoeizVar);
                rhgxfdycjh();
                return;
            }
            if (!(cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.ulzqkzuiru)) {
                if (cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.ntlheqmsrt) {
                    yzdjzghtvl();
                    com.caverock.androidsvg.lqeggnwhkg.ntlheqmsrt ntlheqmsrtVar = (com.caverock.androidsvg.lqeggnwhkg.ntlheqmsrt) cllcsxoeizVar;
                    b(this.f21623wkgbmnqykc, ntlheqmsrtVar);
                    if (pmvmpeiblj()) {
                        oxmwwwfdhm((com.caverock.androidsvg.lqeggnwhkg.hcddaimhww) ntlheqmsrtVar.eablkybsjg());
                        com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = cllcsxoeizVar.f21405iobyxmoadg.oxmwwwfdhm(ntlheqmsrtVar.f21466ojitshcjhn);
                        if (cllcsxoeizVarOxmwwwfdhm == null || !(cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox)) {
                            iozdgvuglv("Tref reference '%s' not found", ntlheqmsrtVar.f21466ojitshcjhn);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            lmojexxdyd((com.caverock.androidsvg.lqeggnwhkg.jlmebxxoox) cllcsxoeizVarOxmwwwfdhm, sb3);
                            if (sb3.length() > 0) {
                                btonecajqbVar.zoijcleaow(sb3.toString());
                            }
                        }
                    }
                    rhgxfdycjh();
                    return;
                }
                return;
            }
            esjtqupxsv("TSpan render", new Object[0]);
            yzdjzghtvl();
            com.caverock.androidsvg.lqeggnwhkg.ulzqkzuiru ulzqkzuiruVar = (com.caverock.androidsvg.lqeggnwhkg.ulzqkzuiru) cllcsxoeizVar;
            b(this.f21623wkgbmnqykc, ulzqkzuiruVar);
            if (pmvmpeiblj()) {
                List list = ulzqkzuiruVar.f21510ojitshcjhn;
                boolean z13 = list != null && list.size() > 0;
                boolean z14 = btonecajqbVar instanceof gxszxtbevo;
                float fGxszxtbevo2 = 0.0f;
                if (z14) {
                    float fEablkybsjg2 = !z13 ? ((gxszxtbevo) btonecajqbVar).f21636zoijcleaow : ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) ulzqkzuiruVar.f21510ojitshcjhn.get(0)).eablkybsjg(this);
                    List list2 = ulzqkzuiruVar.f21512rgvfuqvkyq;
                    fGxszxtbevo = (list2 == null || list2.size() == 0) ? ((gxszxtbevo) btonecajqbVar).f21634ppxfxbqfkf : ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) ulzqkzuiruVar.f21512rgvfuqvkyq.get(0)).gxszxtbevo(this);
                    List list3 = ulzqkzuiruVar.f21513vdvldrhtss;
                    fEablkybsjg = (list3 == null || list3.size() == 0) ? 0.0f : ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) ulzqkzuiruVar.f21513vdvldrhtss.get(0)).eablkybsjg(this);
                    List list4 = ulzqkzuiruVar.f21511oxmwwwfdhm;
                    if (list4 != null && list4.size() != 0) {
                        fGxszxtbevo2 = ((com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq) ulzqkzuiruVar.f21511oxmwwwfdhm.get(0)).gxszxtbevo(this);
                    }
                    f13 = fGxszxtbevo2;
                    fGxszxtbevo2 = fEablkybsjg2;
                } else {
                    f13 = 0.0f;
                    fGxszxtbevo = 0.0f;
                    fEablkybsjg = 0.0f;
                }
                if (z13 && (gxszxtbevoVarDsvhmnatus = dsvhmnatus()) != com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Start) {
                    float fAgtfadlqog = agtfadlqog(ulzqkzuiruVar);
                    if (gxszxtbevoVarDsvhmnatus == com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.gxszxtbevo.Middle) {
                        fAgtfadlqog /= 2.0f;
                    }
                    fGxszxtbevo2 -= fAgtfadlqog;
                }
                oxmwwwfdhm((com.caverock.androidsvg.lqeggnwhkg.hcddaimhww) ulzqkzuiruVar.eablkybsjg());
                if (z14) {
                    gxszxtbevo gxszxtbevoVar = (gxszxtbevo) btonecajqbVar;
                    gxszxtbevoVar.f21636zoijcleaow = fGxszxtbevo2 + fEablkybsjg;
                    gxszxtbevoVar.f21634ppxfxbqfkf = fGxszxtbevo + f13;
                }
                boolean zSflfametgt = sflfametgt();
                yadqdtsiqt(ulzqkzuiruVar, btonecajqbVar);
                if (zSflfametgt) {
                    uwvvkdfqfp(ulzqkzuiruVar);
                }
            }
            rhgxfdycjh();
        }
    }

    private void yfnezrywwk(com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar, com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar) {
        if (this.f21623wkgbmnqykc.f21647iobyxmoadg.f21550ribwqtqdhb != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f21619iobyxmoadg.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f21619iobyxmoadg.saveLayer(null, paint2, 31);
            com.caverock.androidsvg.lqeggnwhkg.kcexrzcfyt kcexrzcfytVar = (com.caverock.androidsvg.lqeggnwhkg.kcexrzcfyt) this.f21622ppxfxbqfkf.oxmwwwfdhm(this.f21623wkgbmnqykc.f21647iobyxmoadg.f21550ribwqtqdhb);
            fyldjkxazc(kcexrzcfytVar, hcddaimhwwVar, zoijcleaowVar);
            this.f21619iobyxmoadg.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f21619iobyxmoadg.saveLayer(null, paint3, 31);
            fyldjkxazc(kcexrzcfytVar, hcddaimhwwVar, zoijcleaowVar);
            this.f21619iobyxmoadg.restore();
            this.f21619iobyxmoadg.restore();
        }
        rhgxfdycjh();
    }

    private void yggfygwlhe(com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVar) {
        Boolean bool;
        if ((cllcsxoeizVar instanceof com.caverock.androidsvg.lqeggnwhkg.jpowsppfya) && (bool = ((com.caverock.androidsvg.lqeggnwhkg.jpowsppfya) cllcsxoeizVar).f21449wkgbmnqykc) != null) {
            this.f21623wkgbmnqykc.f21649nufgyqmvbu = bool.booleanValue();
        }
    }

    private void ylkuphrtab(com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz hkdspvbjdzVar, com.caverock.androidsvg.lqeggnwhkg.hkdspvbjdz hkdspvbjdzVar2) {
        if (hkdspvbjdzVar.f21432wflxmlrfwp == null) {
            hkdspvbjdzVar.f21432wflxmlrfwp = hkdspvbjdzVar2.f21432wflxmlrfwp;
        }
        if (hkdspvbjdzVar.f21429agtfadlqog == null) {
            hkdspvbjdzVar.f21429agtfadlqog = hkdspvbjdzVar2.f21429agtfadlqog;
        }
        if (hkdspvbjdzVar.f21430ojitshcjhn == null) {
            hkdspvbjdzVar.f21430ojitshcjhn = hkdspvbjdzVar2.f21430ojitshcjhn;
        }
        if (hkdspvbjdzVar.f21431rgvfuqvkyq == null) {
            hkdspvbjdzVar.f21431rgvfuqvkyq = hkdspvbjdzVar2.f21431rgvfuqvkyq;
        }
    }

    private void yzdjzghtvl() {
        this.f21619iobyxmoadg.save();
        this.f21617eablkybsjg.push(this.f21623wkgbmnqykc);
        this.f21623wkgbmnqykc = new C0391nufgyqmvbu(this.f21623wkgbmnqykc);
    }

    private Typeface zdlpuopuiu(String str, Integer num, com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.zoijcleaow zoijcleaowVar) {
        int i13;
        boolean z13 = zoijcleaowVar == com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.zoijcleaow.Italic;
        if (num.intValue() > 500) {
            i13 = z13 ? 3 : 1;
        } else {
            i13 = z13 ? 2 : 0;
        }
        str.hashCode();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i13);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i13);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i13);
            case "serif":
                return Typeface.create(Typeface.SERIF, i13);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i13);
            default:
                return null;
        }
    }

    private void zeieaojujs(com.caverock.androidsvg.lqeggnwhkg.lereixgezr lereixgezrVar) {
        esjtqupxsv("PolyLine render", new Object[0]);
        b(this.f21623wkgbmnqykc, lereixgezrVar);
        if (pmvmpeiblj() && d()) {
            C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
            if (c0391nufgyqmvbu.f21650ppxfxbqfkf || c0391nufgyqmvbu.f21652zoijcleaow) {
                Matrix matrix = lereixgezrVar.f21407agtfadlqog;
                if (matrix != null) {
                    this.f21619iobyxmoadg.concat(matrix);
                }
                if (lereixgezrVar.f21464ojitshcjhn.length < 2) {
                    return;
                }
                Path pathJhduphickx = jhduphickx(lereixgezrVar);
                krqnebusok(lereixgezrVar);
                pathJhduphickx.setFillType(ntlheqmsrt());
                oxmwwwfdhm(lereixgezrVar);
                rgvfuqvkyq(lereixgezrVar);
                boolean zSflfametgt = sflfametgt();
                if (this.f21623wkgbmnqykc.f21652zoijcleaow) {
                    zynmafqrjb(lereixgezrVar, pathJhduphickx);
                }
                if (this.f21623wkgbmnqykc.f21650ppxfxbqfkf) {
                    istkbnxepw(pathJhduphickx);
                }
                ageimvtcrz(lereixgezrVar);
                if (zSflfametgt) {
                    uwvvkdfqfp(lereixgezrVar);
                }
            }
        }
    }

    private ppxfxbqfkf zfvoamnweg(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, ppxfxbqfkf ppxfxbqfkfVar3) {
        float fCdpycssgdh = cdpycssgdh(ppxfxbqfkfVar2.f21656ppxfxbqfkf, ppxfxbqfkfVar2.f21657wkgbmnqykc, ppxfxbqfkfVar2.f21655iobyxmoadg - ppxfxbqfkfVar.f21655iobyxmoadg, ppxfxbqfkfVar2.f21658zoijcleaow - ppxfxbqfkfVar.f21658zoijcleaow);
        if (fCdpycssgdh == 0.0f) {
            fCdpycssgdh = cdpycssgdh(ppxfxbqfkfVar2.f21656ppxfxbqfkf, ppxfxbqfkfVar2.f21657wkgbmnqykc, ppxfxbqfkfVar3.f21655iobyxmoadg - ppxfxbqfkfVar2.f21655iobyxmoadg, ppxfxbqfkfVar3.f21658zoijcleaow - ppxfxbqfkfVar2.f21658zoijcleaow);
        }
        if (fCdpycssgdh > 0.0f) {
            return ppxfxbqfkfVar2;
        }
        if (fCdpycssgdh == 0.0f && (ppxfxbqfkfVar2.f21656ppxfxbqfkf > 0.0f || ppxfxbqfkfVar2.f21657wkgbmnqykc >= 0.0f)) {
            return ppxfxbqfkfVar2;
        }
        ppxfxbqfkfVar2.f21656ppxfxbqfkf = -ppxfxbqfkfVar2.f21656ppxfxbqfkf;
        ppxfxbqfkfVar2.f21657wkgbmnqykc = -ppxfxbqfkfVar2.f21657wkgbmnqykc;
        return ppxfxbqfkfVar2;
    }

    private void zynmafqrjb(com.caverock.androidsvg.lqeggnwhkg.hcddaimhww hcddaimhwwVar, Path path) {
        com.caverock.androidsvg.lqeggnwhkg.dsvhmnatus dsvhmnatusVar = this.f21623wkgbmnqykc.f21647iobyxmoadg.f21560yggfygwlhe;
        if (dsvhmnatusVar instanceof com.caverock.androidsvg.lqeggnwhkg.yggfygwlhe) {
            com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz cllcsxoeizVarOxmwwwfdhm = this.f21622ppxfxbqfkf.oxmwwwfdhm(((com.caverock.androidsvg.lqeggnwhkg.yggfygwlhe) dsvhmnatusVar).f21600zdlpuopuiu);
            if (cllcsxoeizVarOxmwwwfdhm instanceof com.caverock.androidsvg.lqeggnwhkg.esjtqupxsv) {
                jpowsppfya(hcddaimhwwVar, path, (com.caverock.androidsvg.lqeggnwhkg.esjtqupxsv) cllcsxoeizVarOxmwwwfdhm);
                return;
            }
        }
        this.f21619iobyxmoadg.drawPath(path, this.f21623wkgbmnqykc.f21651wkgbmnqykc);
    }

    void hszhottldk(com.caverock.androidsvg.lqeggnwhkg lqeggnwhkgVar, com.caverock.androidsvg.gxszxtbevo gxszxtbevoVar) {
        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar;
        com.caverock.androidsvg.eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f21622ppxfxbqfkf = lqeggnwhkgVar;
        com.caverock.androidsvg.lqeggnwhkg.iozdgvuglv iozdgvuglvVarWflxmlrfwp = lqeggnwhkgVar.wflxmlrfwp();
        if (iozdgvuglvVarWflxmlrfwp == null) {
            e("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (gxszxtbevoVar.eablkybsjg()) {
            com.caverock.androidsvg.lqeggnwhkg.jpowsppfya jpowsppfyaVarBtonecajqb = this.f21622ppxfxbqfkf.btonecajqb(gxszxtbevoVar.f21386eablkybsjg);
            if (jpowsppfyaVarBtonecajqb == null || !(jpowsppfyaVarBtonecajqb instanceof com.caverock.androidsvg.lqeggnwhkg.xrmfcynszj)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", gxszxtbevoVar.f21386eablkybsjg));
                return;
            }
            com.caverock.androidsvg.lqeggnwhkg.xrmfcynszj xrmfcynszjVar = (com.caverock.androidsvg.lqeggnwhkg.xrmfcynszj) jpowsppfyaVarBtonecajqb;
            zoijcleaowVar = xrmfcynszjVar.f21463rgvfuqvkyq;
            if (zoijcleaowVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", gxszxtbevoVar.f21386eablkybsjg));
                return;
            }
            eablkybsjgVar = xrmfcynszjVar.f21524ojitshcjhn;
        } else {
            zoijcleaowVar = gxszxtbevoVar.gxszxtbevo() ? gxszxtbevoVar.f21390wkgbmnqykc : iozdgvuglvVarWflxmlrfwp.f21463rgvfuqvkyq;
            eablkybsjgVar = gxszxtbevoVar.ppxfxbqfkf() ? gxszxtbevoVar.f21391zoijcleaow : iozdgvuglvVarWflxmlrfwp.f21524ojitshcjhn;
        }
        if (gxszxtbevoVar.zoijcleaow()) {
            lqeggnwhkgVar.iobyxmoadg(gxszxtbevoVar.f21388iobyxmoadg);
        }
        if (gxszxtbevoVar.wkgbmnqykc()) {
            com.caverock.androidsvg.zoijcleaow.vdvldrhtss vdvldrhtssVar = new com.caverock.androidsvg.zoijcleaow.vdvldrhtss();
            this.f21621nufgyqmvbu = vdvldrhtssVar;
            vdvldrhtssVar.f21743iobyxmoadg = lqeggnwhkgVar.btonecajqb(gxszxtbevoVar.f21389ppxfxbqfkf);
        }
        ixidwrxhsl();
        yggfygwlhe(iozdgvuglvVarWflxmlrfwp);
        yzdjzghtvl();
        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar2 = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(gxszxtbevoVar.f21387gxszxtbevo);
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar = iozdgvuglvVarWflxmlrfwp.f21436kcexrzcfyt;
        if (rgvfuqvkyqVar != null) {
            zoijcleaowVar2.f21607ppxfxbqfkf = rgvfuqvkyqVar.wkgbmnqykc(this, zoijcleaowVar2.f21607ppxfxbqfkf);
        }
        com.caverock.androidsvg.lqeggnwhkg.rgvfuqvkyq rgvfuqvkyqVar2 = iozdgvuglvVarWflxmlrfwp.f21440zdlpuopuiu;
        if (rgvfuqvkyqVar2 != null) {
            zoijcleaowVar2.f21608wkgbmnqykc = rgvfuqvkyqVar2.wkgbmnqykc(this, zoijcleaowVar2.f21608wkgbmnqykc);
        }
        auzgnhcxok(iozdgvuglvVarWflxmlrfwp, zoijcleaowVar2, zoijcleaowVar, eablkybsjgVar);
        rhgxfdycjh();
        if (gxszxtbevoVar.zoijcleaow()) {
            lqeggnwhkgVar.zoijcleaow();
        }
    }

    float kegysxyocb() {
        return this.f21623wkgbmnqykc.f21651wkgbmnqykc.getTextSize() / 2.0f;
    }

    float mbcevpiqjq() {
        return this.f21624zoijcleaow;
    }

    float stevsuqkhv() {
        return this.f21623wkgbmnqykc.f21651wkgbmnqykc.getTextSize();
    }

    com.caverock.androidsvg.lqeggnwhkg.zoijcleaow tzroggbefp() {
        C0391nufgyqmvbu c0391nufgyqmvbu = this.f21623wkgbmnqykc;
        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar = c0391nufgyqmvbu.f21648lqeggnwhkg;
        return zoijcleaowVar != null ? zoijcleaowVar : c0391nufgyqmvbu.f21646gxszxtbevo;
    }

    private class gtknphoqwx extends btonecajqb {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f21633zoijcleaow;

        private gtknphoqwx() {
            super(nufgyqmvbu.this, null);
            this.f21633zoijcleaow = 0.0f;
        }

        @Override // com.caverock.androidsvg.nufgyqmvbu.btonecajqb
        public void zoijcleaow(String str) {
            this.f21633zoijcleaow += nufgyqmvbu.this.f21623wkgbmnqykc.f21651wkgbmnqykc.measureText(str);
        }

        /* synthetic */ gtknphoqwx(nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.nufgyqmvbu$nufgyqmvbu, reason: collision with other inner class name */
    private class C0391nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        Paint f21645eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow f21646gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt f21647iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        com.caverock.androidsvg.lqeggnwhkg.zoijcleaow f21648lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        boolean f21649nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        boolean f21650ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        Paint f21651wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        boolean f21652zoijcleaow;

        C0391nufgyqmvbu() {
            Paint paint = new Paint();
            this.f21651wkgbmnqykc = paint;
            paint.setFlags(193);
            this.f21651wkgbmnqykc.setHinting(0);
            this.f21651wkgbmnqykc.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f21651wkgbmnqykc;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f21645eablkybsjg = paint3;
            paint3.setFlags(193);
            this.f21645eablkybsjg.setHinting(0);
            this.f21645eablkybsjg.setStyle(Paint.Style.STROKE);
            this.f21645eablkybsjg.setTypeface(typeface);
            this.f21647iobyxmoadg = com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg();
        }

        C0391nufgyqmvbu(C0391nufgyqmvbu c0391nufgyqmvbu) {
            this.f21652zoijcleaow = c0391nufgyqmvbu.f21652zoijcleaow;
            this.f21650ppxfxbqfkf = c0391nufgyqmvbu.f21650ppxfxbqfkf;
            this.f21651wkgbmnqykc = new Paint(c0391nufgyqmvbu.f21651wkgbmnqykc);
            this.f21645eablkybsjg = new Paint(c0391nufgyqmvbu.f21645eablkybsjg);
            com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar = c0391nufgyqmvbu.f21646gxszxtbevo;
            if (zoijcleaowVar != null) {
                this.f21646gxszxtbevo = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(zoijcleaowVar);
            }
            com.caverock.androidsvg.lqeggnwhkg.zoijcleaow zoijcleaowVar2 = c0391nufgyqmvbu.f21648lqeggnwhkg;
            if (zoijcleaowVar2 != null) {
                this.f21648lqeggnwhkg = new com.caverock.androidsvg.lqeggnwhkg.zoijcleaow(zoijcleaowVar2);
            }
            this.f21649nufgyqmvbu = c0391nufgyqmvbu.f21649nufgyqmvbu;
            try {
                this.f21647iobyxmoadg = (com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt) c0391nufgyqmvbu.f21647iobyxmoadg.clone();
            } catch (CloneNotSupportedException e13) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e13);
                this.f21647iobyxmoadg = com.caverock.androidsvg.lqeggnwhkg.yadqdtsiqt.iobyxmoadg();
            }
        }
    }
}
