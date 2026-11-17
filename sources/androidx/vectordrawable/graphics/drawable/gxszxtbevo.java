package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import i1.gtknphoqwx;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo extends androidx.vectordrawable.graphics.drawable.eablkybsjg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final PorterDuff.Mode f13597cdpycssgdh = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f13598cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f13599esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Rect f13600istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ColorFilter f13601iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private PorterDuffColorFilter f13602jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Drawable.ConstantState f13603lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final float[] f13604pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private nufgyqmvbu f13605yggfygwlhe;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Matrix f13606zynmafqrjb;

    private static abstract class eablkybsjg {
        private eablkybsjg() {
        }

        public boolean iobyxmoadg() {
            return false;
        }

        public boolean zoijcleaow(int[] iArr) {
            return false;
        }
    }

    private static class nufgyqmvbu extends Drawable.ConstantState {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        boolean f13629btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        Paint f13630draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        int f13631dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        boolean f13632eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        boolean f13633gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        Bitmap f13634gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f13635iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        ColorStateList f13636lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        PorterDuff.Mode f13637nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        ColorStateList f13638ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        PorterDuff.Mode f13639wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        lqeggnwhkg f13640zoijcleaow;

        public nufgyqmvbu(nufgyqmvbu nufgyqmvbuVar) {
            this.f13638ppxfxbqfkf = null;
            this.f13639wkgbmnqykc = gxszxtbevo.f13597cdpycssgdh;
            if (nufgyqmvbuVar != null) {
                this.f13635iobyxmoadg = nufgyqmvbuVar.f13635iobyxmoadg;
                lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(nufgyqmvbuVar.f13640zoijcleaow);
                this.f13640zoijcleaow = lqeggnwhkgVar;
                if (nufgyqmvbuVar.f13640zoijcleaow.f13617eablkybsjg != null) {
                    lqeggnwhkgVar.f13617eablkybsjg = new Paint(nufgyqmvbuVar.f13640zoijcleaow.f13617eablkybsjg);
                }
                if (nufgyqmvbuVar.f13640zoijcleaow.f13627wkgbmnqykc != null) {
                    this.f13640zoijcleaow.f13627wkgbmnqykc = new Paint(nufgyqmvbuVar.f13640zoijcleaow.f13627wkgbmnqykc);
                }
                this.f13638ppxfxbqfkf = nufgyqmvbuVar.f13638ppxfxbqfkf;
                this.f13639wkgbmnqykc = nufgyqmvbuVar.f13639wkgbmnqykc;
                this.f13632eablkybsjg = nufgyqmvbuVar.f13632eablkybsjg;
            }
        }

        public void btonecajqb(int i13, int i14) {
            this.f13634gxszxtbevo.eraseColor(0);
            this.f13640zoijcleaow.zoijcleaow(new Canvas(this.f13634gxszxtbevo), i13, i14, null);
        }

        public void dxjokdxxww() {
            this.f13636lqeggnwhkg = this.f13638ppxfxbqfkf;
            this.f13637nufgyqmvbu = this.f13639wkgbmnqykc;
            this.f13631dxjokdxxww = this.f13640zoijcleaow.getRootAlpha();
            this.f13629btonecajqb = this.f13632eablkybsjg;
            this.f13633gtknphoqwx = false;
        }

        public Paint eablkybsjg(ColorFilter colorFilter) {
            if (!gxszxtbevo() && colorFilter == null) {
                return null;
            }
            if (this.f13630draadjrbmk == null) {
                Paint paint = new Paint();
                this.f13630draadjrbmk = paint;
                paint.setFilterBitmap(true);
            }
            this.f13630draadjrbmk.setAlpha(this.f13640zoijcleaow.getRootAlpha());
            this.f13630draadjrbmk.setColorFilter(colorFilter);
            return this.f13630draadjrbmk;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13635iobyxmoadg;
        }

        public boolean gxszxtbevo() {
            return this.f13640zoijcleaow.getRootAlpha() < 255;
        }

        public boolean iobyxmoadg(int i13, int i14) {
            return i13 == this.f13634gxszxtbevo.getWidth() && i14 == this.f13634gxszxtbevo.getHeight();
        }

        public boolean lqeggnwhkg() {
            return this.f13640zoijcleaow.gxszxtbevo();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new gxszxtbevo(this);
        }

        public boolean nufgyqmvbu(int[] iArr) {
            boolean zLqeggnwhkg = this.f13640zoijcleaow.lqeggnwhkg(iArr);
            this.f13633gtknphoqwx |= zLqeggnwhkg;
            return zLqeggnwhkg;
        }

        public void ppxfxbqfkf(int i13, int i14) {
            if (this.f13634gxszxtbevo == null || !iobyxmoadg(i13, i14)) {
                this.f13634gxszxtbevo = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
                this.f13633gtknphoqwx = true;
            }
        }

        public void wkgbmnqykc(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f13634gxszxtbevo, (Rect) null, rect, eablkybsjg(colorFilter));
        }

        public boolean zoijcleaow() {
            return !this.f13633gtknphoqwx && this.f13636lqeggnwhkg == this.f13638ppxfxbqfkf && this.f13637nufgyqmvbu == this.f13639wkgbmnqykc && this.f13629btonecajqb == this.f13632eablkybsjg && this.f13631dxjokdxxww == this.f13640zoijcleaow.getRootAlpha();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new gxszxtbevo(this);
        }

        public nufgyqmvbu() {
            this.f13638ppxfxbqfkf = null;
            this.f13639wkgbmnqykc = gxszxtbevo.f13597cdpycssgdh;
            this.f13640zoijcleaow = new lqeggnwhkg();
        }
    }

    private static class zoijcleaow extends AbstractC0203gxszxtbevo {
        zoijcleaow() {
        }

        private void gxszxtbevo(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f13611zoijcleaow = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f13608iobyxmoadg = j1.gxszxtbevo.wkgbmnqykc(string2);
            }
            this.f13609ppxfxbqfkf = gtknphoqwx.gtknphoqwx(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public void eablkybsjg(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (gtknphoqwx.rgvfuqvkyq(xmlPullParser, "pathData")) {
                TypedArray typedArrayVdvldrhtss = gtknphoqwx.vdvldrhtss(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.iobyxmoadg.f13676wkgbmnqykc);
                gxszxtbevo(typedArrayVdvldrhtss, xmlPullParser);
                typedArrayVdvldrhtss.recycle();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.gxszxtbevo.AbstractC0203gxszxtbevo
        public boolean ppxfxbqfkf() {
            return true;
        }

        zoijcleaow(zoijcleaow zoijcleaowVar) {
            super(zoijcleaowVar);
        }
    }

    gxszxtbevo() {
        this.f13599esjtqupxsv = true;
        this.f13604pmvmpeiblj = new float[9];
        this.f13606zynmafqrjb = new Matrix();
        this.f13600istkbnxepw = new Rect();
        this.f13605yggfygwlhe = new nufgyqmvbu();
    }

    private boolean eablkybsjg() {
        return isAutoMirrored() && k1.iobyxmoadg.gxszxtbevo(this) == 1;
    }

    private static PorterDuff.Mode gxszxtbevo(int i13, PorterDuff.Mode mode) {
        if (i13 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i13 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i13 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i13) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    static int iobyxmoadg(int i13, float f13) {
        return (i13 & 16777215) | (((int) (Color.alpha(i13) * f13)) << 24);
    }

    private void nufgyqmvbu(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        nufgyqmvbu nufgyqmvbuVar = this.f13605yggfygwlhe;
        lqeggnwhkg lqeggnwhkgVar = nufgyqmvbuVar.f13640zoijcleaow;
        nufgyqmvbuVar.f13639wkgbmnqykc = gxszxtbevo(gtknphoqwx.gtknphoqwx(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListLqeggnwhkg = gtknphoqwx.lqeggnwhkg(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListLqeggnwhkg != null) {
            nufgyqmvbuVar.f13638ppxfxbqfkf = colorStateListLqeggnwhkg;
        }
        nufgyqmvbuVar.f13632eablkybsjg = gtknphoqwx.eablkybsjg(typedArray, xmlPullParser, "autoMirrored", 5, nufgyqmvbuVar.f13632eablkybsjg);
        lqeggnwhkgVar.f13618gtknphoqwx = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "viewportWidth", 7, lqeggnwhkgVar.f13618gtknphoqwx);
        float fBtonecajqb = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "viewportHeight", 8, lqeggnwhkgVar.f13615draadjrbmk);
        lqeggnwhkgVar.f13615draadjrbmk = fBtonecajqb;
        if (lqeggnwhkgVar.f13618gtknphoqwx <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fBtonecajqb <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        lqeggnwhkgVar.f13616dxjokdxxww = typedArray.getDimension(3, lqeggnwhkgVar.f13616dxjokdxxww);
        float dimension = typedArray.getDimension(2, lqeggnwhkgVar.f13614btonecajqb);
        lqeggnwhkgVar.f13614btonecajqb = dimension;
        if (lqeggnwhkgVar.f13616dxjokdxxww <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        lqeggnwhkgVar.setAlpha(gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "alpha", 4, lqeggnwhkgVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            lqeggnwhkgVar.f13613agtfadlqog = string;
            lqeggnwhkgVar.f13625rgvfuqvkyq.put(string, lqeggnwhkgVar);
        }
    }

    private void wkgbmnqykc(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        nufgyqmvbu nufgyqmvbuVar = this.f13605yggfygwlhe;
        lqeggnwhkg lqeggnwhkgVar = nufgyqmvbuVar.f13640zoijcleaow;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(lqeggnwhkgVar.f13622nufgyqmvbu);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z13 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) arrayDeque.peek();
                if ("path".equals(name)) {
                    ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
                    ppxfxbqfkfVar.lqeggnwhkg(resources, attributeSet, theme, xmlPullParser);
                    wkgbmnqykcVar.f13665zoijcleaow.add(ppxfxbqfkfVar);
                    if (ppxfxbqfkfVar.getPathName() != null) {
                        lqeggnwhkgVar.f13625rgvfuqvkyq.put(ppxfxbqfkfVar.getPathName(), ppxfxbqfkfVar);
                    }
                    nufgyqmvbuVar.f13635iobyxmoadg = ppxfxbqfkfVar.f13610wkgbmnqykc | nufgyqmvbuVar.f13635iobyxmoadg;
                    z13 = false;
                } else if ("clip-path".equals(name)) {
                    zoijcleaow zoijcleaowVar = new zoijcleaow();
                    zoijcleaowVar.eablkybsjg(resources, attributeSet, theme, xmlPullParser);
                    wkgbmnqykcVar.f13665zoijcleaow.add(zoijcleaowVar);
                    if (zoijcleaowVar.getPathName() != null) {
                        lqeggnwhkgVar.f13625rgvfuqvkyq.put(zoijcleaowVar.getPathName(), zoijcleaowVar);
                    }
                    nufgyqmvbuVar.f13635iobyxmoadg = zoijcleaowVar.f13610wkgbmnqykc | nufgyqmvbuVar.f13635iobyxmoadg;
                } else if ("group".equals(name)) {
                    wkgbmnqykc wkgbmnqykcVar2 = new wkgbmnqykc();
                    wkgbmnqykcVar2.ppxfxbqfkf(resources, attributeSet, theme, xmlPullParser);
                    wkgbmnqykcVar.f13665zoijcleaow.add(wkgbmnqykcVar2);
                    arrayDeque.push(wkgbmnqykcVar2);
                    if (wkgbmnqykcVar2.getGroupName() != null) {
                        lqeggnwhkgVar.f13625rgvfuqvkyq.put(wkgbmnqykcVar2.getGroupName(), wkgbmnqykcVar2);
                    }
                    nufgyqmvbuVar.f13635iobyxmoadg = wkgbmnqykcVar2.f13657gtknphoqwx | nufgyqmvbuVar.f13635iobyxmoadg;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z13) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public static gxszxtbevo zoijcleaow(Resources resources, int i13, Resources.Theme theme) {
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
        gxszxtbevoVar.f13596zdlpuopuiu = i1.nufgyqmvbu.gxszxtbevo(resources, i13, theme);
        gxszxtbevoVar.f13603lereixgezr = new dxjokdxxww(gxszxtbevoVar.f13596zdlpuopuiu.getConstantState());
        return gxszxtbevoVar;
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable == null) {
            return false;
        }
        k1.iobyxmoadg.zoijcleaow(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f13600istkbnxepw);
        if (this.f13600istkbnxepw.width() <= 0 || this.f13600istkbnxepw.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f13601iwizpuwonk;
        if (colorFilter == null) {
            colorFilter = this.f13602jyumaefscl;
        }
        canvas.getMatrix(this.f13606zynmafqrjb);
        this.f13606zynmafqrjb.getValues(this.f13604pmvmpeiblj);
        float fAbs = Math.abs(this.f13604pmvmpeiblj[0]);
        float fAbs2 = Math.abs(this.f13604pmvmpeiblj[4]);
        float fAbs3 = Math.abs(this.f13604pmvmpeiblj[1]);
        float fAbs4 = Math.abs(this.f13604pmvmpeiblj[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f13600istkbnxepw.width() * fAbs);
        int iHeight = (int) (this.f13600istkbnxepw.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f13600istkbnxepw;
        canvas.translate(rect.left, rect.top);
        if (eablkybsjg()) {
            canvas.translate(this.f13600istkbnxepw.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f13600istkbnxepw.offsetTo(0, 0);
        this.f13605yggfygwlhe.ppxfxbqfkf(iMin, iMin2);
        if (!this.f13599esjtqupxsv) {
            this.f13605yggfygwlhe.btonecajqb(iMin, iMin2);
        } else if (!this.f13605yggfygwlhe.zoijcleaow()) {
            this.f13605yggfygwlhe.btonecajqb(iMin, iMin2);
            this.f13605yggfygwlhe.dxjokdxxww();
        }
        this.f13605yggfygwlhe.wkgbmnqykc(canvas, colorFilter, this.f13600istkbnxepw);
        canvas.restoreToCount(iSave);
    }

    PorterDuffColorFilter dxjokdxxww(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? k1.iobyxmoadg.wkgbmnqykc(drawable) : this.f13605yggfygwlhe.f13640zoijcleaow.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f13605yggfygwlhe.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? k1.iobyxmoadg.eablkybsjg(drawable) : this.f13601iwizpuwonk;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f13596zdlpuopuiu != null) {
            return new dxjokdxxww(this.f13596zdlpuopuiu.getConstantState());
        }
        this.f13605yggfygwlhe.f13635iobyxmoadg = getChangingConfigurations();
        return this.f13605yggfygwlhe;
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f13605yggfygwlhe.f13640zoijcleaow.f13614btonecajqb;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f13605yggfygwlhe.f13640zoijcleaow.f13616dxjokdxxww;
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? k1.iobyxmoadg.nufgyqmvbu(drawable) : this.f13605yggfygwlhe.f13632eablkybsjg;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        nufgyqmvbu nufgyqmvbuVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((nufgyqmvbuVar = this.f13605yggfygwlhe) != null && (nufgyqmvbuVar.lqeggnwhkg() || ((colorStateList = this.f13605yggfygwlhe.f13638ppxfxbqfkf) != null && colorStateList.isStateful())));
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    void lqeggnwhkg(boolean z13) {
        this.f13599esjtqupxsv = z13;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f13598cqumvgiudr && super.mutate() == this) {
            this.f13605yggfygwlhe = new nufgyqmvbu(this.f13605yggfygwlhe);
            this.f13598cqumvgiudr = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z13;
        PorterDuff.Mode mode;
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        nufgyqmvbu nufgyqmvbuVar = this.f13605yggfygwlhe;
        ColorStateList colorStateList = nufgyqmvbuVar.f13638ppxfxbqfkf;
        if (colorStateList == null || (mode = nufgyqmvbuVar.f13639wkgbmnqykc) == null) {
            z13 = false;
        } else {
            this.f13602jyumaefscl = dxjokdxxww(this.f13602jyumaefscl, colorStateList, mode);
            invalidateSelf();
            z13 = true;
        }
        if (!nufgyqmvbuVar.lqeggnwhkg() || !nufgyqmvbuVar.nufgyqmvbu(iArr)) {
            return z13;
        }
        invalidateSelf();
        return true;
    }

    Object ppxfxbqfkf(String str) {
        return this.f13605yggfygwlhe.f13640zoijcleaow.f13625rgvfuqvkyq.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j13);
        } else {
            super.scheduleSelf(runnable, j13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.setAlpha(i13);
        } else if (this.f13605yggfygwlhe.f13640zoijcleaow.getRootAlpha() != i13) {
            this.f13605yggfygwlhe.f13640zoijcleaow.setRootAlpha(i13);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.btonecajqb(drawable, z13);
        } else {
            this.f13605yggfygwlhe.f13632eablkybsjg = z13;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i13) {
        super.setChangingConfigurations(i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i13, PorterDuff.Mode mode) {
        super.setColorFilter(i13, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z13) {
        super.setFilterBitmap(z13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f13, float f14) {
        super.setHotspot(f13, f14);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i13, int i14, int i15, int i16) {
        super.setHotspotBounds(i13, i14, i15, i16);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.agtfadlqog(drawable, i13);
        } else {
            setTintList(ColorStateList.valueOf(i13));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.ojitshcjhn(drawable, colorStateList);
            return;
        }
        nufgyqmvbu nufgyqmvbuVar = this.f13605yggfygwlhe;
        if (nufgyqmvbuVar.f13638ppxfxbqfkf != colorStateList) {
            nufgyqmvbuVar.f13638ppxfxbqfkf = colorStateList;
            this.f13602jyumaefscl = dxjokdxxww(this.f13602jyumaefscl, colorStateList, nufgyqmvbuVar.f13639wkgbmnqykc);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.rgvfuqvkyq(drawable, mode);
            return;
        }
        nufgyqmvbu nufgyqmvbuVar = this.f13605yggfygwlhe;
        if (nufgyqmvbuVar.f13639wkgbmnqykc != mode) {
            nufgyqmvbuVar.f13639wkgbmnqykc = mode;
            this.f13602jyumaefscl = dxjokdxxww(this.f13602jyumaefscl, nufgyqmvbuVar.f13638ppxfxbqfkf, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z13, boolean z14) {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.setVisible(z13, z14) : super.setVisible(z13, z14);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class dxjokdxxww extends Drawable.ConstantState {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Drawable.ConstantState f13607iobyxmoadg;

        public dxjokdxxww(Drawable.ConstantState constantState) {
            this.f13607iobyxmoadg = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f13607iobyxmoadg.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13607iobyxmoadg.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
            gxszxtbevoVar.f13596zdlpuopuiu = (VectorDrawable) this.f13607iobyxmoadg.newDrawable();
            return gxszxtbevoVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
            gxszxtbevoVar.f13596zdlpuopuiu = (VectorDrawable) this.f13607iobyxmoadg.newDrawable(resources);
            return gxszxtbevoVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
            gxszxtbevoVar.f13596zdlpuopuiu = (VectorDrawable) this.f13607iobyxmoadg.newDrawable(resources, theme);
            return gxszxtbevoVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f13601iwizpuwonk = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    private static abstract class AbstractC0203gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        protected j1.gxszxtbevo.zoijcleaow[] f13608iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f13609ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f13610wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        String f13611zoijcleaow;

        public AbstractC0203gxszxtbevo() {
            super();
            this.f13608iobyxmoadg = null;
            this.f13609ppxfxbqfkf = 0;
        }

        public j1.gxszxtbevo.zoijcleaow[] getPathData() {
            return this.f13608iobyxmoadg;
        }

        public String getPathName() {
            return this.f13611zoijcleaow;
        }

        public boolean ppxfxbqfkf() {
            return false;
        }

        public void setPathData(j1.gxszxtbevo.zoijcleaow[] zoijcleaowVarArr) {
            if (j1.gxszxtbevo.zoijcleaow(this.f13608iobyxmoadg, zoijcleaowVarArr)) {
                j1.gxszxtbevo.gtknphoqwx(this.f13608iobyxmoadg, zoijcleaowVarArr);
            } else {
                this.f13608iobyxmoadg = j1.gxszxtbevo.gxszxtbevo(zoijcleaowVarArr);
            }
        }

        public void wkgbmnqykc(Path path) {
            path.reset();
            j1.gxszxtbevo.zoijcleaow[] zoijcleaowVarArr = this.f13608iobyxmoadg;
            if (zoijcleaowVarArr != null) {
                j1.gxszxtbevo.zoijcleaow.nufgyqmvbu(zoijcleaowVarArr, path);
            }
        }

        public AbstractC0203gxszxtbevo(AbstractC0203gxszxtbevo abstractC0203gxszxtbevo) {
            super();
            this.f13608iobyxmoadg = null;
            this.f13609ppxfxbqfkf = 0;
            this.f13611zoijcleaow = abstractC0203gxszxtbevo.f13611zoijcleaow;
            this.f13610wkgbmnqykc = abstractC0203gxszxtbevo.f13610wkgbmnqykc;
            this.f13608iobyxmoadg = j1.gxszxtbevo.gxszxtbevo(abstractC0203gxszxtbevo.f13608iobyxmoadg);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.lqeggnwhkg(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        nufgyqmvbu nufgyqmvbuVar = this.f13605yggfygwlhe;
        nufgyqmvbuVar.f13640zoijcleaow = new lqeggnwhkg();
        TypedArray typedArrayVdvldrhtss = gtknphoqwx.vdvldrhtss(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.iobyxmoadg.f13672iobyxmoadg);
        nufgyqmvbu(typedArrayVdvldrhtss, xmlPullParser, theme);
        typedArrayVdvldrhtss.recycle();
        nufgyqmvbuVar.f13635iobyxmoadg = getChangingConfigurations();
        nufgyqmvbuVar.f13633gtknphoqwx = true;
        wkgbmnqykc(resources, xmlPullParser, attributeSet, theme);
        this.f13602jyumaefscl = dxjokdxxww(this.f13602jyumaefscl, nufgyqmvbuVar.f13638ppxfxbqfkf, nufgyqmvbuVar.f13639wkgbmnqykc);
    }

    gxszxtbevo(nufgyqmvbu nufgyqmvbuVar) {
        this.f13599esjtqupxsv = true;
        this.f13604pmvmpeiblj = new float[9];
        this.f13606zynmafqrjb = new Matrix();
        this.f13600istkbnxepw = new Rect();
        this.f13605yggfygwlhe = nufgyqmvbuVar;
        this.f13602jyumaefscl = dxjokdxxww(this.f13602jyumaefscl, nufgyqmvbuVar.f13638ppxfxbqfkf, nufgyqmvbuVar.f13639wkgbmnqykc);
    }

    private static class ppxfxbqfkf extends AbstractC0203gxszxtbevo {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        Paint.Cap f13641agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        float f13642btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        float f13643draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        float f13644dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int[] f13645eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        float f13646gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        i1.wkgbmnqykc f13647gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        float f13648lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        i1.wkgbmnqykc f13649nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        Paint.Join f13650ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        float f13651rgvfuqvkyq;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        float f13652wflxmlrfwp;

        ppxfxbqfkf() {
            this.f13648lqeggnwhkg = 0.0f;
            this.f13644dxjokdxxww = 1.0f;
            this.f13642btonecajqb = 1.0f;
            this.f13646gtknphoqwx = 0.0f;
            this.f13643draadjrbmk = 1.0f;
            this.f13652wflxmlrfwp = 0.0f;
            this.f13641agtfadlqog = Paint.Cap.BUTT;
            this.f13650ojitshcjhn = Paint.Join.MITER;
            this.f13651rgvfuqvkyq = 4.0f;
        }

        private Paint.Cap eablkybsjg(int i13, Paint.Cap cap) {
            if (i13 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i13 != 1) {
                return i13 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join gxszxtbevo(int i13, Paint.Join join) {
            if (i13 == 0) {
                return Paint.Join.MITER;
            }
            if (i13 != 1) {
                return i13 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void nufgyqmvbu(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f13645eablkybsjg = null;
            if (gtknphoqwx.rgvfuqvkyq(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f13611zoijcleaow = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f13608iobyxmoadg = j1.gxszxtbevo.wkgbmnqykc(string2);
                }
                this.f13649nufgyqmvbu = gtknphoqwx.dxjokdxxww(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f13642btonecajqb = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "fillAlpha", 12, this.f13642btonecajqb);
                this.f13641agtfadlqog = eablkybsjg(gtknphoqwx.gtknphoqwx(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f13641agtfadlqog);
                this.f13650ojitshcjhn = gxszxtbevo(gtknphoqwx.gtknphoqwx(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f13650ojitshcjhn);
                this.f13651rgvfuqvkyq = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f13651rgvfuqvkyq);
                this.f13647gxszxtbevo = gtknphoqwx.dxjokdxxww(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f13644dxjokdxxww = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "strokeAlpha", 11, this.f13644dxjokdxxww);
                this.f13648lqeggnwhkg = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "strokeWidth", 4, this.f13648lqeggnwhkg);
                this.f13643draadjrbmk = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "trimPathEnd", 6, this.f13643draadjrbmk);
                this.f13652wflxmlrfwp = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "trimPathOffset", 7, this.f13652wflxmlrfwp);
                this.f13646gtknphoqwx = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "trimPathStart", 5, this.f13646gtknphoqwx);
                this.f13609ppxfxbqfkf = gtknphoqwx.gtknphoqwx(typedArray, xmlPullParser, "fillType", 13, this.f13609ppxfxbqfkf);
            }
        }

        float getFillAlpha() {
            return this.f13642btonecajqb;
        }

        int getFillColor() {
            return this.f13649nufgyqmvbu.eablkybsjg();
        }

        float getStrokeAlpha() {
            return this.f13644dxjokdxxww;
        }

        int getStrokeColor() {
            return this.f13647gxszxtbevo.eablkybsjg();
        }

        float getStrokeWidth() {
            return this.f13648lqeggnwhkg;
        }

        float getTrimPathEnd() {
            return this.f13643draadjrbmk;
        }

        float getTrimPathOffset() {
            return this.f13652wflxmlrfwp;
        }

        float getTrimPathStart() {
            return this.f13646gtknphoqwx;
        }

        @Override // androidx.vectordrawable.graphics.drawable.gxszxtbevo.eablkybsjg
        public boolean iobyxmoadg() {
            return this.f13649nufgyqmvbu.dxjokdxxww() || this.f13647gxszxtbevo.dxjokdxxww();
        }

        public void lqeggnwhkg(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayVdvldrhtss = gtknphoqwx.vdvldrhtss(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.iobyxmoadg.f13675ppxfxbqfkf);
            nufgyqmvbu(typedArrayVdvldrhtss, xmlPullParser, theme);
            typedArrayVdvldrhtss.recycle();
        }

        void setFillAlpha(float f13) {
            this.f13642btonecajqb = f13;
        }

        void setFillColor(int i13) {
            this.f13649nufgyqmvbu.gtknphoqwx(i13);
        }

        void setStrokeAlpha(float f13) {
            this.f13644dxjokdxxww = f13;
        }

        void setStrokeColor(int i13) {
            this.f13647gxszxtbevo.gtknphoqwx(i13);
        }

        void setStrokeWidth(float f13) {
            this.f13648lqeggnwhkg = f13;
        }

        void setTrimPathEnd(float f13) {
            this.f13643draadjrbmk = f13;
        }

        void setTrimPathOffset(float f13) {
            this.f13652wflxmlrfwp = f13;
        }

        void setTrimPathStart(float f13) {
            this.f13646gtknphoqwx = f13;
        }

        @Override // androidx.vectordrawable.graphics.drawable.gxszxtbevo.eablkybsjg
        public boolean zoijcleaow(int[] iArr) {
            return this.f13647gxszxtbevo.btonecajqb(iArr) | this.f13649nufgyqmvbu.btonecajqb(iArr);
        }

        ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
            super(ppxfxbqfkfVar);
            this.f13648lqeggnwhkg = 0.0f;
            this.f13644dxjokdxxww = 1.0f;
            this.f13642btonecajqb = 1.0f;
            this.f13646gtknphoqwx = 0.0f;
            this.f13643draadjrbmk = 1.0f;
            this.f13652wflxmlrfwp = 0.0f;
            this.f13641agtfadlqog = Paint.Cap.BUTT;
            this.f13650ojitshcjhn = Paint.Join.MITER;
            this.f13651rgvfuqvkyq = 4.0f;
            this.f13645eablkybsjg = ppxfxbqfkfVar.f13645eablkybsjg;
            this.f13647gxszxtbevo = ppxfxbqfkfVar.f13647gxszxtbevo;
            this.f13648lqeggnwhkg = ppxfxbqfkfVar.f13648lqeggnwhkg;
            this.f13644dxjokdxxww = ppxfxbqfkfVar.f13644dxjokdxxww;
            this.f13649nufgyqmvbu = ppxfxbqfkfVar.f13649nufgyqmvbu;
            this.f13609ppxfxbqfkf = ppxfxbqfkfVar.f13609ppxfxbqfkf;
            this.f13642btonecajqb = ppxfxbqfkfVar.f13642btonecajqb;
            this.f13646gtknphoqwx = ppxfxbqfkfVar.f13646gtknphoqwx;
            this.f13643draadjrbmk = ppxfxbqfkfVar.f13643draadjrbmk;
            this.f13652wflxmlrfwp = ppxfxbqfkfVar.f13652wflxmlrfwp;
            this.f13641agtfadlqog = ppxfxbqfkfVar.f13641agtfadlqog;
            this.f13650ojitshcjhn = ppxfxbqfkfVar.f13650ojitshcjhn;
            this.f13651rgvfuqvkyq = ppxfxbqfkfVar.f13651rgvfuqvkyq;
        }
    }

    private static class lqeggnwhkg {

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private static final Matrix f13612vdvldrhtss = new Matrix();

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        String f13613agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        float f13614btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        float f13615draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        float f13616dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        Paint f13617eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        float f13618gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private PathMeasure f13619gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Path f13620iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f13621lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        final wkgbmnqykc f13622nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        Boolean f13623ojitshcjhn;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Matrix f13624ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        final androidx.collection.iobyxmoadg f13625rgvfuqvkyq;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        int f13626wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        Paint f13627wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Path f13628zoijcleaow;

        public lqeggnwhkg() {
            this.f13624ppxfxbqfkf = new Matrix();
            this.f13616dxjokdxxww = 0.0f;
            this.f13614btonecajqb = 0.0f;
            this.f13618gtknphoqwx = 0.0f;
            this.f13615draadjrbmk = 0.0f;
            this.f13626wflxmlrfwp = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f13613agtfadlqog = null;
            this.f13623ojitshcjhn = null;
            this.f13625rgvfuqvkyq = new androidx.collection.iobyxmoadg();
            this.f13622nufgyqmvbu = new wkgbmnqykc();
            this.f13620iobyxmoadg = new Path();
            this.f13628zoijcleaow = new Path();
        }

        private float eablkybsjg(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fIobyxmoadg = iobyxmoadg(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fIobyxmoadg) / fMax;
            }
            return 0.0f;
        }

        private static float iobyxmoadg(float f13, float f14, float f15, float f16) {
            return (f13 * f16) - (f14 * f15);
        }

        private void ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, Matrix matrix, Canvas canvas, int i13, int i14, ColorFilter colorFilter) {
            wkgbmnqykcVar.f13659iobyxmoadg.set(matrix);
            wkgbmnqykcVar.f13659iobyxmoadg.preConcat(wkgbmnqykcVar.f13653btonecajqb);
            canvas.save();
            for (int i15 = 0; i15 < wkgbmnqykcVar.f13665zoijcleaow.size(); i15++) {
                eablkybsjg eablkybsjgVar = (eablkybsjg) wkgbmnqykcVar.f13665zoijcleaow.get(i15);
                if (eablkybsjgVar instanceof wkgbmnqykc) {
                    ppxfxbqfkf((wkgbmnqykc) eablkybsjgVar, wkgbmnqykcVar.f13659iobyxmoadg, canvas, i13, i14, colorFilter);
                } else if (eablkybsjgVar instanceof AbstractC0203gxszxtbevo) {
                    wkgbmnqykc(wkgbmnqykcVar, (AbstractC0203gxszxtbevo) eablkybsjgVar, canvas, i13, i14, colorFilter);
                }
            }
            canvas.restore();
        }

        private void wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, AbstractC0203gxszxtbevo abstractC0203gxszxtbevo, Canvas canvas, int i13, int i14, ColorFilter colorFilter) {
            float f13 = i13 / this.f13618gtknphoqwx;
            float f14 = i14 / this.f13615draadjrbmk;
            float fMin = Math.min(f13, f14);
            Matrix matrix = wkgbmnqykcVar.f13659iobyxmoadg;
            this.f13624ppxfxbqfkf.set(matrix);
            this.f13624ppxfxbqfkf.postScale(f13, f14);
            float fEablkybsjg = eablkybsjg(matrix);
            if (fEablkybsjg == 0.0f) {
                return;
            }
            abstractC0203gxszxtbevo.wkgbmnqykc(this.f13620iobyxmoadg);
            Path path = this.f13620iobyxmoadg;
            this.f13628zoijcleaow.reset();
            if (abstractC0203gxszxtbevo.ppxfxbqfkf()) {
                this.f13628zoijcleaow.setFillType(abstractC0203gxszxtbevo.f13609ppxfxbqfkf == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f13628zoijcleaow.addPath(path, this.f13624ppxfxbqfkf);
                canvas.clipPath(this.f13628zoijcleaow);
                return;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) abstractC0203gxszxtbevo;
            float f15 = ppxfxbqfkfVar.f13646gtknphoqwx;
            if (f15 != 0.0f || ppxfxbqfkfVar.f13643draadjrbmk != 1.0f) {
                float f16 = ppxfxbqfkfVar.f13652wflxmlrfwp;
                float f17 = (f15 + f16) % 1.0f;
                float f18 = (ppxfxbqfkfVar.f13643draadjrbmk + f16) % 1.0f;
                if (this.f13619gxszxtbevo == null) {
                    this.f13619gxszxtbevo = new PathMeasure();
                }
                this.f13619gxszxtbevo.setPath(this.f13620iobyxmoadg, false);
                float length = this.f13619gxszxtbevo.getLength();
                float f19 = f17 * length;
                float f23 = f18 * length;
                path.reset();
                if (f19 > f23) {
                    this.f13619gxszxtbevo.getSegment(f19, length, path, true);
                    this.f13619gxszxtbevo.getSegment(0.0f, f23, path, true);
                } else {
                    this.f13619gxszxtbevo.getSegment(f19, f23, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f13628zoijcleaow.addPath(path, this.f13624ppxfxbqfkf);
            if (ppxfxbqfkfVar.f13649nufgyqmvbu.draadjrbmk()) {
                i1.wkgbmnqykc wkgbmnqykcVar2 = ppxfxbqfkfVar.f13649nufgyqmvbu;
                if (this.f13617eablkybsjg == null) {
                    Paint paint = new Paint(1);
                    this.f13617eablkybsjg = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f13617eablkybsjg;
                if (wkgbmnqykcVar2.nufgyqmvbu()) {
                    Shader shaderGxszxtbevo = wkgbmnqykcVar2.gxszxtbevo();
                    shaderGxszxtbevo.setLocalMatrix(this.f13624ppxfxbqfkf);
                    paint2.setShader(shaderGxszxtbevo);
                    paint2.setAlpha(Math.round(ppxfxbqfkfVar.f13642btonecajqb * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    paint2.setColor(gxszxtbevo.iobyxmoadg(wkgbmnqykcVar2.eablkybsjg(), ppxfxbqfkfVar.f13642btonecajqb));
                }
                paint2.setColorFilter(colorFilter);
                this.f13628zoijcleaow.setFillType(ppxfxbqfkfVar.f13609ppxfxbqfkf == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f13628zoijcleaow, paint2);
            }
            if (ppxfxbqfkfVar.f13647gxszxtbevo.draadjrbmk()) {
                i1.wkgbmnqykc wkgbmnqykcVar3 = ppxfxbqfkfVar.f13647gxszxtbevo;
                if (this.f13627wkgbmnqykc == null) {
                    Paint paint3 = new Paint(1);
                    this.f13627wkgbmnqykc = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f13627wkgbmnqykc;
                Paint.Join join = ppxfxbqfkfVar.f13650ojitshcjhn;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = ppxfxbqfkfVar.f13641agtfadlqog;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(ppxfxbqfkfVar.f13651rgvfuqvkyq);
                if (wkgbmnqykcVar3.nufgyqmvbu()) {
                    Shader shaderGxszxtbevo2 = wkgbmnqykcVar3.gxszxtbevo();
                    shaderGxszxtbevo2.setLocalMatrix(this.f13624ppxfxbqfkf);
                    paint4.setShader(shaderGxszxtbevo2);
                    paint4.setAlpha(Math.round(ppxfxbqfkfVar.f13644dxjokdxxww * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    paint4.setColor(gxszxtbevo.iobyxmoadg(wkgbmnqykcVar3.eablkybsjg(), ppxfxbqfkfVar.f13644dxjokdxxww));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(ppxfxbqfkfVar.f13648lqeggnwhkg * fMin * fEablkybsjg);
                canvas.drawPath(this.f13628zoijcleaow, paint4);
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f13626wflxmlrfwp;
        }

        public boolean gxszxtbevo() {
            if (this.f13623ojitshcjhn == null) {
                this.f13623ojitshcjhn = Boolean.valueOf(this.f13622nufgyqmvbu.iobyxmoadg());
            }
            return this.f13623ojitshcjhn.booleanValue();
        }

        public boolean lqeggnwhkg(int[] iArr) {
            return this.f13622nufgyqmvbu.zoijcleaow(iArr);
        }

        public void setAlpha(float f13) {
            setRootAlpha((int) (f13 * 255.0f));
        }

        public void setRootAlpha(int i13) {
            this.f13626wflxmlrfwp = i13;
        }

        public void zoijcleaow(Canvas canvas, int i13, int i14, ColorFilter colorFilter) {
            ppxfxbqfkf(this.f13622nufgyqmvbu, f13612vdvldrhtss, canvas, i13, i14, colorFilter);
        }

        public lqeggnwhkg(lqeggnwhkg lqeggnwhkgVar) {
            this.f13624ppxfxbqfkf = new Matrix();
            this.f13616dxjokdxxww = 0.0f;
            this.f13614btonecajqb = 0.0f;
            this.f13618gtknphoqwx = 0.0f;
            this.f13615draadjrbmk = 0.0f;
            this.f13626wflxmlrfwp = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f13613agtfadlqog = null;
            this.f13623ojitshcjhn = null;
            androidx.collection.iobyxmoadg iobyxmoadgVar = new androidx.collection.iobyxmoadg();
            this.f13625rgvfuqvkyq = iobyxmoadgVar;
            this.f13622nufgyqmvbu = new wkgbmnqykc(lqeggnwhkgVar.f13622nufgyqmvbu, iobyxmoadgVar);
            this.f13620iobyxmoadg = new Path(lqeggnwhkgVar.f13620iobyxmoadg);
            this.f13628zoijcleaow = new Path(lqeggnwhkgVar.f13628zoijcleaow);
            this.f13616dxjokdxxww = lqeggnwhkgVar.f13616dxjokdxxww;
            this.f13614btonecajqb = lqeggnwhkgVar.f13614btonecajqb;
            this.f13618gtknphoqwx = lqeggnwhkgVar.f13618gtknphoqwx;
            this.f13615draadjrbmk = lqeggnwhkgVar.f13615draadjrbmk;
            this.f13621lqeggnwhkg = lqeggnwhkgVar.f13621lqeggnwhkg;
            this.f13626wflxmlrfwp = lqeggnwhkgVar.f13626wflxmlrfwp;
            this.f13613agtfadlqog = lqeggnwhkgVar.f13613agtfadlqog;
            String str = lqeggnwhkgVar.f13613agtfadlqog;
            if (str != null) {
                iobyxmoadgVar.put(str, this);
            }
            this.f13623ojitshcjhn = lqeggnwhkgVar.f13623ojitshcjhn;
        }
    }

    private static class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        final Matrix f13653btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private int[] f13654draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private float f13655dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private float f13656eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        int f13657gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private float f13658gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Matrix f13659iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private float f13660lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private float f13661nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f13662ppxfxbqfkf;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private String f13663wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private float f13664wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final ArrayList f13665zoijcleaow;

        public wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, androidx.collection.iobyxmoadg iobyxmoadgVar) {
            AbstractC0203gxszxtbevo zoijcleaowVar;
            super();
            this.f13659iobyxmoadg = new Matrix();
            this.f13665zoijcleaow = new ArrayList();
            this.f13662ppxfxbqfkf = 0.0f;
            this.f13664wkgbmnqykc = 0.0f;
            this.f13656eablkybsjg = 0.0f;
            this.f13658gxszxtbevo = 1.0f;
            this.f13660lqeggnwhkg = 1.0f;
            this.f13661nufgyqmvbu = 0.0f;
            this.f13655dxjokdxxww = 0.0f;
            Matrix matrix = new Matrix();
            this.f13653btonecajqb = matrix;
            this.f13663wflxmlrfwp = null;
            this.f13662ppxfxbqfkf = wkgbmnqykcVar.f13662ppxfxbqfkf;
            this.f13664wkgbmnqykc = wkgbmnqykcVar.f13664wkgbmnqykc;
            this.f13656eablkybsjg = wkgbmnqykcVar.f13656eablkybsjg;
            this.f13658gxszxtbevo = wkgbmnqykcVar.f13658gxszxtbevo;
            this.f13660lqeggnwhkg = wkgbmnqykcVar.f13660lqeggnwhkg;
            this.f13661nufgyqmvbu = wkgbmnqykcVar.f13661nufgyqmvbu;
            this.f13655dxjokdxxww = wkgbmnqykcVar.f13655dxjokdxxww;
            this.f13654draadjrbmk = wkgbmnqykcVar.f13654draadjrbmk;
            String str = wkgbmnqykcVar.f13663wflxmlrfwp;
            this.f13663wflxmlrfwp = str;
            this.f13657gtknphoqwx = wkgbmnqykcVar.f13657gtknphoqwx;
            if (str != null) {
                iobyxmoadgVar.put(str, this);
            }
            matrix.set(wkgbmnqykcVar.f13653btonecajqb);
            ArrayList arrayList = wkgbmnqykcVar.f13665zoijcleaow;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                Object obj = arrayList.get(i13);
                if (obj instanceof wkgbmnqykc) {
                    this.f13665zoijcleaow.add(new wkgbmnqykc((wkgbmnqykc) obj, iobyxmoadgVar));
                } else {
                    if (obj instanceof ppxfxbqfkf) {
                        zoijcleaowVar = new ppxfxbqfkf((ppxfxbqfkf) obj);
                    } else {
                        if (!(obj instanceof zoijcleaow)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        zoijcleaowVar = new zoijcleaow((zoijcleaow) obj);
                    }
                    this.f13665zoijcleaow.add(zoijcleaowVar);
                    Object obj2 = zoijcleaowVar.f13611zoijcleaow;
                    if (obj2 != null) {
                        iobyxmoadgVar.put(obj2, zoijcleaowVar);
                    }
                }
            }
        }

        private void eablkybsjg(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f13654draadjrbmk = null;
            this.f13662ppxfxbqfkf = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "rotation", 5, this.f13662ppxfxbqfkf);
            this.f13664wkgbmnqykc = typedArray.getFloat(1, this.f13664wkgbmnqykc);
            this.f13656eablkybsjg = typedArray.getFloat(2, this.f13656eablkybsjg);
            this.f13658gxszxtbevo = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "scaleX", 3, this.f13658gxszxtbevo);
            this.f13660lqeggnwhkg = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "scaleY", 4, this.f13660lqeggnwhkg);
            this.f13661nufgyqmvbu = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "translateX", 6, this.f13661nufgyqmvbu);
            this.f13655dxjokdxxww = gtknphoqwx.btonecajqb(typedArray, xmlPullParser, "translateY", 7, this.f13655dxjokdxxww);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f13663wflxmlrfwp = string;
            }
            wkgbmnqykc();
        }

        private void wkgbmnqykc() {
            this.f13653btonecajqb.reset();
            this.f13653btonecajqb.postTranslate(-this.f13664wkgbmnqykc, -this.f13656eablkybsjg);
            this.f13653btonecajqb.postScale(this.f13658gxszxtbevo, this.f13660lqeggnwhkg);
            this.f13653btonecajqb.postRotate(this.f13662ppxfxbqfkf, 0.0f, 0.0f);
            this.f13653btonecajqb.postTranslate(this.f13661nufgyqmvbu + this.f13664wkgbmnqykc, this.f13655dxjokdxxww + this.f13656eablkybsjg);
        }

        public String getGroupName() {
            return this.f13663wflxmlrfwp;
        }

        public Matrix getLocalMatrix() {
            return this.f13653btonecajqb;
        }

        public float getPivotX() {
            return this.f13664wkgbmnqykc;
        }

        public float getPivotY() {
            return this.f13656eablkybsjg;
        }

        public float getRotation() {
            return this.f13662ppxfxbqfkf;
        }

        public float getScaleX() {
            return this.f13658gxszxtbevo;
        }

        public float getScaleY() {
            return this.f13660lqeggnwhkg;
        }

        public float getTranslateX() {
            return this.f13661nufgyqmvbu;
        }

        public float getTranslateY() {
            return this.f13655dxjokdxxww;
        }

        @Override // androidx.vectordrawable.graphics.drawable.gxszxtbevo.eablkybsjg
        public boolean iobyxmoadg() {
            for (int i13 = 0; i13 < this.f13665zoijcleaow.size(); i13++) {
                if (((eablkybsjg) this.f13665zoijcleaow.get(i13)).iobyxmoadg()) {
                    return true;
                }
            }
            return false;
        }

        public void ppxfxbqfkf(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayVdvldrhtss = gtknphoqwx.vdvldrhtss(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.iobyxmoadg.f13677zoijcleaow);
            eablkybsjg(typedArrayVdvldrhtss, xmlPullParser);
            typedArrayVdvldrhtss.recycle();
        }

        public void setPivotX(float f13) {
            if (f13 != this.f13664wkgbmnqykc) {
                this.f13664wkgbmnqykc = f13;
                wkgbmnqykc();
            }
        }

        public void setPivotY(float f13) {
            if (f13 != this.f13656eablkybsjg) {
                this.f13656eablkybsjg = f13;
                wkgbmnqykc();
            }
        }

        public void setRotation(float f13) {
            if (f13 != this.f13662ppxfxbqfkf) {
                this.f13662ppxfxbqfkf = f13;
                wkgbmnqykc();
            }
        }

        public void setScaleX(float f13) {
            if (f13 != this.f13658gxszxtbevo) {
                this.f13658gxszxtbevo = f13;
                wkgbmnqykc();
            }
        }

        public void setScaleY(float f13) {
            if (f13 != this.f13660lqeggnwhkg) {
                this.f13660lqeggnwhkg = f13;
                wkgbmnqykc();
            }
        }

        public void setTranslateX(float f13) {
            if (f13 != this.f13661nufgyqmvbu) {
                this.f13661nufgyqmvbu = f13;
                wkgbmnqykc();
            }
        }

        public void setTranslateY(float f13) {
            if (f13 != this.f13655dxjokdxxww) {
                this.f13655dxjokdxxww = f13;
                wkgbmnqykc();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.gxszxtbevo.eablkybsjg
        public boolean zoijcleaow(int[] iArr) {
            boolean zZoijcleaow = false;
            for (int i13 = 0; i13 < this.f13665zoijcleaow.size(); i13++) {
                zZoijcleaow |= ((eablkybsjg) this.f13665zoijcleaow.get(i13)).zoijcleaow(iArr);
            }
            return zZoijcleaow;
        }

        public wkgbmnqykc() {
            super();
            this.f13659iobyxmoadg = new Matrix();
            this.f13665zoijcleaow = new ArrayList();
            this.f13662ppxfxbqfkf = 0.0f;
            this.f13664wkgbmnqykc = 0.0f;
            this.f13656eablkybsjg = 0.0f;
            this.f13658gxszxtbevo = 1.0f;
            this.f13660lqeggnwhkg = 1.0f;
            this.f13661nufgyqmvbu = 0.0f;
            this.f13655dxjokdxxww = 0.0f;
            this.f13653btonecajqb = new Matrix();
            this.f13663wflxmlrfwp = null;
        }
    }
}
