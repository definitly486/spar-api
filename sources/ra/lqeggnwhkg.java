package ra;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg extends Drawable implements agtfadlqog {

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private static final Paint f82319kegysxyocb;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private static final String f82320stevsuqkhv = "lqeggnwhkg";

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Region f82321cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int f82322cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f82323cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final RectF f82324dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Matrix f82325esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final draadjrbmk f82326hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private PorterDuffColorFilter f82327hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private gtknphoqwx f82328iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final RectF f82329istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final BitSet f82330iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private PorterDuffColorFilter f82331jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final wflxmlrfwp.lqeggnwhkg[] f82332jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Path f82333lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final Paint f82334lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final draadjrbmk.zoijcleaow f82335pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final Path f82336pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final Paint f82337wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private boolean f82338wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final Region f82339yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final wflxmlrfwp.lqeggnwhkg[] f82340yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final qa.iobyxmoadg f82341ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ppxfxbqfkf f82342zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final RectF f82343zynmafqrjb;

    class iobyxmoadg implements draadjrbmk.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // ra.draadjrbmk.zoijcleaow
        public void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, Matrix matrix, int i13) {
            lqeggnwhkg.this.f82330iwizpuwonk.set(i13, wflxmlrfwpVar.eablkybsjg());
            lqeggnwhkg.this.f82340yggfygwlhe[i13] = wflxmlrfwpVar.gxszxtbevo(matrix);
        }

        @Override // ra.draadjrbmk.zoijcleaow
        public void zoijcleaow(wflxmlrfwp wflxmlrfwpVar, Matrix matrix, int i13) {
            lqeggnwhkg.this.f82330iwizpuwonk.set(i13 + 4, wflxmlrfwpVar.eablkybsjg());
            lqeggnwhkg.this.f82332jyumaefscl[i13] = wflxmlrfwpVar.gxszxtbevo(matrix);
        }
    }

    class zoijcleaow implements gtknphoqwx.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ float f82367iobyxmoadg;

        zoijcleaow(float f13) {
            this.f82367iobyxmoadg = f13;
        }

        @Override // ra.gtknphoqwx.ppxfxbqfkf
        public ra.ppxfxbqfkf iobyxmoadg(ra.ppxfxbqfkf ppxfxbqfkfVar) {
            return ppxfxbqfkfVar instanceof dxjokdxxww ? ppxfxbqfkfVar : new ra.zoijcleaow(this.f82367iobyxmoadg, ppxfxbqfkfVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f82319kegysxyocb = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public lqeggnwhkg() {
        this(new gtknphoqwx());
    }

    private void agtfadlqog(Canvas canvas) {
        if (this.f82330iwizpuwonk.cardinality() > 0) {
            Log.w(f82320stevsuqkhv, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f82342zdlpuopuiu.f82354kcexrzcfyt != 0) {
            canvas.drawPath(this.f82333lereixgezr, this.f82341ylkuphrtab.ppxfxbqfkf());
        }
        for (int i13 = 0; i13 < 4; i13++) {
            this.f82340yggfygwlhe[i13].zoijcleaow(this.f82341ylkuphrtab, this.f82342zdlpuopuiu.f82358oxmwwwfdhm, canvas);
            this.f82332jyumaefscl[i13].zoijcleaow(this.f82341ylkuphrtab, this.f82342zdlpuopuiu.f82358oxmwwwfdhm, canvas);
        }
        if (this.f82338wypolnanlu) {
            int iZynmafqrjb = zynmafqrjb();
            int iIstkbnxepw = istkbnxepw();
            canvas.translate(-iZynmafqrjb, -iIstkbnxepw);
            canvas.drawPath(this.f82333lereixgezr, f82319kegysxyocb);
            canvas.translate(iZynmafqrjb, iIstkbnxepw);
        }
    }

    private PorterDuffColorFilter btonecajqb(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z13) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z13) {
            colorForState = draadjrbmk(colorForState);
        }
        this.f82322cllcsxoeiz = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private void cllcsxoeiz() {
        super.invalidateSelf();
    }

    private boolean czzsidtyhn(int[] iArr) {
        boolean z13;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f82342zdlpuopuiu.f82363wkgbmnqykc == null || color2 == (colorForState2 = this.f82342zdlpuopuiu.f82363wkgbmnqykc.getColorForState(iArr, (color2 = this.f82334lmojexxdyd.getColor())))) {
            z13 = false;
        } else {
            this.f82334lmojexxdyd.setColor(colorForState2);
            z13 = true;
        }
        if (this.f82342zdlpuopuiu.f82349eablkybsjg == null || color == (colorForState = this.f82342zdlpuopuiu.f82349eablkybsjg.getColorForState(iArr, (color = this.f82337wwaezpbzkn.getColor())))) {
            return z13;
        }
        this.f82337wwaezpbzkn.setColor(colorForState);
        return true;
    }

    private void dxjokdxxww() {
        gtknphoqwx gtknphoqwxVarEsjtqupxsv = cdpycssgdh().esjtqupxsv(new zoijcleaow(-yadqdtsiqt()));
        this.f82328iozdgvuglv = gtknphoqwxVarEsjtqupxsv;
        this.f82326hcddaimhww.wkgbmnqykc(gtknphoqwxVarEsjtqupxsv, this.f82342zdlpuopuiu.f82350gtknphoqwx, jyumaefscl(), this.f82336pmvmpeiblj);
    }

    private PorterDuffColorFilter gtknphoqwx(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z13) {
        return (colorStateList == null || mode == null) ? gxszxtbevo(paint, z13) : btonecajqb(colorStateList, mode, z13);
    }

    private PorterDuffColorFilter gxszxtbevo(Paint paint, boolean z13) {
        if (!z13) {
            return null;
        }
        int color = paint.getColor();
        int iDraadjrbmk = draadjrbmk(color);
        this.f82322cllcsxoeiz = iDraadjrbmk;
        if (iDraadjrbmk != color) {
            return new PorterDuffColorFilter(iDraadjrbmk, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private boolean hcddaimhww() {
        Paint.Style style = this.f82342zdlpuopuiu.f82353jyumaefscl;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean jpowsppfya() {
        Paint.Style style = this.f82342zdlpuopuiu.f82353jyumaefscl;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f82337wwaezpbzkn.getStrokeWidth() > 0.0f;
    }

    private RectF jyumaefscl() {
        this.f82329istkbnxepw.set(yggfygwlhe());
        float fYadqdtsiqt = yadqdtsiqt();
        this.f82329istkbnxepw.inset(fYadqdtsiqt, fYadqdtsiqt);
        return this.f82329istkbnxepw;
    }

    private static int kegysxyocb(int i13, int i14) {
        return (i13 * (i14 + (i14 >>> 7))) >>> 8;
    }

    private void lqeggnwhkg(RectF rectF, Path path) {
        nufgyqmvbu(rectF, path);
        if (this.f82342zdlpuopuiu.f82346btonecajqb != 1.0f) {
            this.f82325esjtqupxsv.reset();
            Matrix matrix = this.f82325esjtqupxsv;
            float f13 = this.f82342zdlpuopuiu.f82346btonecajqb;
            matrix.setScale(f13, f13, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f82325esjtqupxsv);
        }
        path.computeBounds(this.f82324dsvhmnatus, true);
    }

    private void ojitshcjhn(Canvas canvas) {
        vdvldrhtss(canvas, this.f82334lmojexxdyd, this.f82333lereixgezr, this.f82342zdlpuopuiu.f82352iobyxmoadg, yggfygwlhe());
    }

    private boolean pkzmftpjix() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        int i13 = ppxfxbqfkfVar.f82361vdvldrhtss;
        return i13 != 1 && ppxfxbqfkfVar.f82358oxmwwwfdhm > 0 && (i13 == 2 || mbcevpiqjq());
    }

    private void stevsuqkhv(Canvas canvas) {
        if (pkzmftpjix()) {
            canvas.save();
            tzroggbefp(canvas);
            if (!this.f82338wypolnanlu) {
                agtfadlqog(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f82324dsvhmnatus.width() - getBounds().width());
            int iHeight = (int) (this.f82324dsvhmnatus.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f82324dsvhmnatus.width()) + (this.f82342zdlpuopuiu.f82358oxmwwwfdhm * 2) + iWidth, ((int) this.f82324dsvhmnatus.height()) + (this.f82342zdlpuopuiu.f82358oxmwwwfdhm * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f13 = (getBounds().left - this.f82342zdlpuopuiu.f82358oxmwwwfdhm) - iWidth;
            float f14 = (getBounds().top - this.f82342zdlpuopuiu.f82358oxmwwwfdhm) - iHeight;
            canvas2.translate(-f13, -f14);
            agtfadlqog(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f13, f14, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private void tzroggbefp(Canvas canvas) {
        canvas.translate(zynmafqrjb(), istkbnxepw());
    }

    private boolean uwvvkdfqfp() {
        PorterDuffColorFilter porterDuffColorFilter = this.f82331jpowsppfya;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f82327hkdspvbjdz;
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        this.f82331jpowsppfya = gtknphoqwx(ppxfxbqfkfVar.f82355lqeggnwhkg, ppxfxbqfkfVar.f82356nufgyqmvbu, this.f82334lmojexxdyd, true);
        ppxfxbqfkf ppxfxbqfkfVar2 = this.f82342zdlpuopuiu;
        this.f82327hkdspvbjdz = gtknphoqwx(ppxfxbqfkfVar2.f82351gxszxtbevo, ppxfxbqfkfVar2.f82356nufgyqmvbu, this.f82337wwaezpbzkn, false);
        ppxfxbqfkf ppxfxbqfkfVar3 = this.f82342zdlpuopuiu;
        if (ppxfxbqfkfVar3.f82364yggfygwlhe) {
            this.f82341ylkuphrtab.wkgbmnqykc(ppxfxbqfkfVar3.f82355lqeggnwhkg.getColorForState(getState(), 0));
        }
        return (u1.zoijcleaow.iobyxmoadg(porterDuffColorFilter, this.f82331jpowsppfya) && u1.zoijcleaow.iobyxmoadg(porterDuffColorFilter2, this.f82327hkdspvbjdz)) ? false : true;
    }

    private void vdvldrhtss(Canvas canvas, Paint paint, Path path, gtknphoqwx gtknphoqwxVar, RectF rectF) {
        if (!gtknphoqwxVar.yggfygwlhe(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fIobyxmoadg = gtknphoqwxVar.zdlpuopuiu().iobyxmoadg(rectF) * this.f82342zdlpuopuiu.f82350gtknphoqwx;
            canvas.drawRoundRect(rectF, fIobyxmoadg, fIobyxmoadg, paint);
        }
    }

    public static lqeggnwhkg wflxmlrfwp(Context context, float f13, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ia.iobyxmoadg.ppxfxbqfkf(context, da.zoijcleaow.colorSurface, lqeggnwhkg.class.getSimpleName()));
        }
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg();
        lqeggnwhkgVar.hkdspvbjdz(context);
        lqeggnwhkgVar.crxdokpmqz(colorStateList);
        lqeggnwhkgVar.sopmlzcsov(f13);
        return lqeggnwhkgVar;
    }

    private float yadqdtsiqt() {
        if (jpowsppfya()) {
            return this.f82337wwaezpbzkn.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void yfnezrywwk() {
        float fYlkuphrtab = ylkuphrtab();
        this.f82342zdlpuopuiu.f82358oxmwwwfdhm = (int) Math.ceil(0.75f * fYlkuphrtab);
        this.f82342zdlpuopuiu.f82354kcexrzcfyt = (int) Math.ceil(fYlkuphrtab * 0.25f);
        uwvvkdfqfp();
        cllcsxoeiz();
    }

    public gtknphoqwx cdpycssgdh() {
        return this.f82342zdlpuopuiu.f82352iobyxmoadg;
    }

    public ColorStateList cqumvgiudr() {
        return this.f82342zdlpuopuiu.f82363wkgbmnqykc;
    }

    public void crxdokpmqz(ColorStateList colorStateList) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        if (ppxfxbqfkfVar.f82363wkgbmnqykc != colorStateList) {
            ppxfxbqfkfVar.f82363wkgbmnqykc = colorStateList;
            onStateChange(getState());
        }
    }

    protected int draadjrbmk(int i13) {
        float fYlkuphrtab = ylkuphrtab() + lereixgezr();
        ka.iobyxmoadg iobyxmoadgVar = this.f82342zdlpuopuiu.f82366zoijcleaow;
        return iobyxmoadgVar != null ? iobyxmoadgVar.ppxfxbqfkf(i13, fYlkuphrtab) : i13;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f82334lmojexxdyd.setColorFilter(this.f82331jpowsppfya);
        int alpha = this.f82334lmojexxdyd.getAlpha();
        this.f82334lmojexxdyd.setAlpha(kegysxyocb(alpha, this.f82342zdlpuopuiu.f82362wflxmlrfwp));
        this.f82337wwaezpbzkn.setColorFilter(this.f82327hkdspvbjdz);
        this.f82337wwaezpbzkn.setStrokeWidth(this.f82342zdlpuopuiu.f82347draadjrbmk);
        int alpha2 = this.f82337wwaezpbzkn.getAlpha();
        this.f82337wwaezpbzkn.setAlpha(kegysxyocb(alpha2, this.f82342zdlpuopuiu.f82362wflxmlrfwp));
        if (this.f82323cqumvgiudr) {
            dxjokdxxww();
            lqeggnwhkg(yggfygwlhe(), this.f82333lereixgezr);
            this.f82323cqumvgiudr = false;
        }
        stevsuqkhv(canvas);
        if (hcddaimhww()) {
            ojitshcjhn(canvas);
        }
        if (jpowsppfya()) {
            oxmwwwfdhm(canvas);
        }
        this.f82334lmojexxdyd.setAlpha(alpha);
        this.f82337wwaezpbzkn.setAlpha(alpha2);
    }

    public boolean dsvhmnatus() {
        ka.iobyxmoadg iobyxmoadgVar = this.f82342zdlpuopuiu.f82366zoijcleaow;
        return iobyxmoadgVar != null && iobyxmoadgVar.eablkybsjg();
    }

    public float esjtqupxsv() {
        return this.f82342zdlpuopuiu.f82350gtknphoqwx;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f82342zdlpuopuiu.f82362wflxmlrfwp;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f82342zdlpuopuiu;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f82342zdlpuopuiu.f82361vdvldrhtss == 2) {
            return;
        }
        if (wypolnanlu()) {
            outline.setRoundRect(getBounds(), iozdgvuglv() * this.f82342zdlpuopuiu.f82350gtknphoqwx);
        } else {
            lqeggnwhkg(yggfygwlhe(), this.f82333lereixgezr);
            com.google.android.material.drawable.wkgbmnqykc.btonecajqb(outline, this.f82333lereixgezr);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f82342zdlpuopuiu.f82348dxjokdxxww;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f82321cdpycssgdh.set(getBounds());
        lqeggnwhkg(yggfygwlhe(), this.f82333lereixgezr);
        this.f82339yadqdtsiqt.setPath(this.f82333lereixgezr, this.f82321cdpycssgdh);
        this.f82321cdpycssgdh.op(this.f82339yadqdtsiqt, Region.Op.DIFFERENCE);
        return this.f82321cdpycssgdh;
    }

    public void hkdspvbjdz(Context context) {
        this.f82342zdlpuopuiu.f82366zoijcleaow = new ka.iobyxmoadg(context);
        yfnezrywwk();
    }

    public void ikoacuggdj(int i13) {
        this.f82341ylkuphrtab.wkgbmnqykc(i13);
        this.f82342zdlpuopuiu.f82364yggfygwlhe = false;
        cllcsxoeiz();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f82323cqumvgiudr = true;
        super.invalidateSelf();
    }

    public float iozdgvuglv() {
        return this.f82342zdlpuopuiu.f82352iobyxmoadg.oxmwwwfdhm().iobyxmoadg(yggfygwlhe());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f82342zdlpuopuiu.f82355lqeggnwhkg) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f82342zdlpuopuiu.f82351gxszxtbevo) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f82342zdlpuopuiu.f82349eablkybsjg) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f82342zdlpuopuiu.f82363wkgbmnqykc) != null && colorStateList4.isStateful())));
    }

    public int istkbnxepw() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        return (int) (((double) ppxfxbqfkfVar.f82354kcexrzcfyt) * Math.cos(Math.toRadians(ppxfxbqfkfVar.f82365zdlpuopuiu)));
    }

    public float iwizpuwonk() {
        return this.f82342zdlpuopuiu.f82357ojitshcjhn;
    }

    public void jhduphickx(boolean z13) {
        this.f82338wypolnanlu = z13;
    }

    public void jlmebxxoox(float f13) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        if (ppxfxbqfkfVar.f82350gtknphoqwx != f13) {
            ppxfxbqfkfVar.f82350gtknphoqwx = f13;
            this.f82323cqumvgiudr = true;
            invalidateSelf();
        }
    }

    public void jztzpxfvev(float f13, int i13) {
        rlfsiqarku(f13);
        metgxyhuhe(ColorStateList.valueOf(i13));
    }

    public float kcexrzcfyt() {
        return this.f82342zdlpuopuiu.f82352iobyxmoadg.btonecajqb().iobyxmoadg(yggfygwlhe());
    }

    public float lereixgezr() {
        return this.f82342zdlpuopuiu.f82345agtfadlqog;
    }

    public float lmojexxdyd() {
        return this.f82342zdlpuopuiu.f82352iobyxmoadg.zdlpuopuiu().iobyxmoadg(yggfygwlhe());
    }

    public boolean mbcevpiqjq() {
        return (wypolnanlu() || this.f82333lereixgezr.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void metgxyhuhe(ColorStateList colorStateList) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        if (ppxfxbqfkfVar.f82349eablkybsjg != colorStateList) {
            ppxfxbqfkfVar.f82349eablkybsjg = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f82342zdlpuopuiu = new ppxfxbqfkf(this.f82342zdlpuopuiu);
        return this;
    }

    public void ntlheqmsrt(float f13) {
        setShapeAppearanceModel(this.f82342zdlpuopuiu.f82352iobyxmoadg.iwizpuwonk(f13));
    }

    protected final void nufgyqmvbu(RectF rectF, Path path) {
        draadjrbmk draadjrbmkVar = this.f82326hcddaimhww;
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        draadjrbmkVar.eablkybsjg(ppxfxbqfkfVar.f82352iobyxmoadg, ppxfxbqfkfVar.f82350gtknphoqwx, rectF, this.f82335pkzmftpjix, path);
    }

    public void okpsazkaxt(int i13) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        if (ppxfxbqfkfVar.f82361vdvldrhtss != i13) {
            ppxfxbqfkfVar.f82361vdvldrhtss = i13;
            cllcsxoeiz();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f82323cqumvgiudr = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.btonecajqb.zoijcleaow
    protected boolean onStateChange(int[] iArr) {
        boolean z13 = czzsidtyhn(iArr) || uwvvkdfqfp();
        if (z13) {
            invalidateSelf();
        }
        return z13;
    }

    protected void oxmwwwfdhm(Canvas canvas) {
        vdvldrhtss(canvas, this.f82337wwaezpbzkn, this.f82336pmvmpeiblj, this.f82328iozdgvuglv, jyumaefscl());
    }

    public int pmvmpeiblj() {
        return this.f82322cllcsxoeiz;
    }

    protected void rgvfuqvkyq(Canvas canvas, Paint paint, Path path, RectF rectF) {
        vdvldrhtss(canvas, paint, path, this.f82342zdlpuopuiu.f82352iobyxmoadg, rectF);
    }

    public void ribwqtqdhb(int i13, int i14, int i15, int i16) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        if (ppxfxbqfkfVar.f82348dxjokdxxww == null) {
            ppxfxbqfkfVar.f82348dxjokdxxww = new Rect();
        }
        this.f82342zdlpuopuiu.f82348dxjokdxxww.set(i13, i14, i15, i16);
        invalidateSelf();
    }

    public void rlfsiqarku(float f13) {
        this.f82342zdlpuopuiu.f82347draadjrbmk = f13;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        if (ppxfxbqfkfVar.f82362wflxmlrfwp != i13) {
            ppxfxbqfkfVar.f82362wflxmlrfwp = i13;
            cllcsxoeiz();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f82342zdlpuopuiu.f82359ppxfxbqfkf = colorFilter;
        cllcsxoeiz();
    }

    @Override // ra.agtfadlqog
    public void setShapeAppearanceModel(gtknphoqwx gtknphoqwxVar) {
        this.f82342zdlpuopuiu.f82352iobyxmoadg = gtknphoqwxVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i13) {
        setTintList(ColorStateList.valueOf(i13));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f82342zdlpuopuiu.f82355lqeggnwhkg = colorStateList;
        uwvvkdfqfp();
        cllcsxoeiz();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        if (ppxfxbqfkfVar.f82356nufgyqmvbu != mode) {
            ppxfxbqfkfVar.f82356nufgyqmvbu = mode;
            uwvvkdfqfp();
            cllcsxoeiz();
        }
    }

    public void sopmlzcsov(float f13) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        if (ppxfxbqfkfVar.f82357ojitshcjhn != f13) {
            ppxfxbqfkfVar.f82357ojitshcjhn = f13;
            yfnezrywwk();
        }
    }

    public void ulzqkzuiru(ra.ppxfxbqfkf ppxfxbqfkfVar) {
        setShapeAppearanceModel(this.f82342zdlpuopuiu.f82352iobyxmoadg.cqumvgiudr(ppxfxbqfkfVar));
    }

    public void vipkmwdibw(float f13) {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        if (ppxfxbqfkfVar.f82345agtfadlqog != f13) {
            ppxfxbqfkfVar.f82345agtfadlqog = f13;
            yfnezrywwk();
        }
    }

    public float wwaezpbzkn() {
        return this.f82342zdlpuopuiu.f82360rgvfuqvkyq;
    }

    public boolean wypolnanlu() {
        return this.f82342zdlpuopuiu.f82352iobyxmoadg.yggfygwlhe(yggfygwlhe());
    }

    public void xrmfcynszj(float f13, ColorStateList colorStateList) {
        rlfsiqarku(f13);
        metgxyhuhe(colorStateList);
    }

    protected RectF yggfygwlhe() {
        this.f82343zynmafqrjb.set(getBounds());
        return this.f82343zynmafqrjb;
    }

    public float ylkuphrtab() {
        return iwizpuwonk() + wwaezpbzkn();
    }

    public float zdlpuopuiu() {
        return this.f82342zdlpuopuiu.f82352iobyxmoadg.draadjrbmk().iobyxmoadg(yggfygwlhe());
    }

    public int zynmafqrjb() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f82342zdlpuopuiu;
        return (int) (((double) ppxfxbqfkfVar.f82354kcexrzcfyt) * Math.sin(Math.toRadians(ppxfxbqfkfVar.f82365zdlpuopuiu)));
    }

    public lqeggnwhkg(Context context, AttributeSet attributeSet, int i13, int i14) {
        this(gtknphoqwx.eablkybsjg(context, attributeSet, i13, i14).wflxmlrfwp());
    }

    public lqeggnwhkg(gtknphoqwx gtknphoqwxVar) {
        this(new ppxfxbqfkf(gtknphoqwxVar, null));
    }

    protected lqeggnwhkg(ppxfxbqfkf ppxfxbqfkfVar) {
        draadjrbmk draadjrbmkVar;
        this.f82340yggfygwlhe = new wflxmlrfwp.lqeggnwhkg[4];
        this.f82332jyumaefscl = new wflxmlrfwp.lqeggnwhkg[4];
        this.f82330iwizpuwonk = new BitSet(8);
        this.f82325esjtqupxsv = new Matrix();
        this.f82333lereixgezr = new Path();
        this.f82336pmvmpeiblj = new Path();
        this.f82343zynmafqrjb = new RectF();
        this.f82329istkbnxepw = new RectF();
        this.f82321cdpycssgdh = new Region();
        this.f82339yadqdtsiqt = new Region();
        Paint paint = new Paint(1);
        this.f82334lmojexxdyd = paint;
        Paint paint2 = new Paint(1);
        this.f82337wwaezpbzkn = paint2;
        this.f82341ylkuphrtab = new qa.iobyxmoadg();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            draadjrbmkVar = draadjrbmk.gtknphoqwx();
        } else {
            draadjrbmkVar = new draadjrbmk();
        }
        this.f82326hcddaimhww = draadjrbmkVar;
        this.f82324dsvhmnatus = new RectF();
        this.f82338wypolnanlu = true;
        this.f82342zdlpuopuiu = ppxfxbqfkfVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        uwvvkdfqfp();
        czzsidtyhn(getState());
        this.f82335pkzmftpjix = new iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class ppxfxbqfkf extends Drawable.ConstantState {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        float f82345agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        float f82346btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        float f82347draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        Rect f82348dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        ColorStateList f82349eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        float f82350gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        ColorStateList f82351gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        gtknphoqwx f82352iobyxmoadg;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Paint.Style f82353jyumaefscl;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        int f82354kcexrzcfyt;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        ColorStateList f82355lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        PorterDuff.Mode f82356nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        float f82357ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        int f82358oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        ColorFilter f82359ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        float f82360rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        int f82361vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        int f82362wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        ColorStateList f82363wkgbmnqykc;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f82364yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f82365zdlpuopuiu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        ka.iobyxmoadg f82366zoijcleaow;

        public ppxfxbqfkf(gtknphoqwx gtknphoqwxVar, ka.iobyxmoadg iobyxmoadgVar) {
            this.f82363wkgbmnqykc = null;
            this.f82349eablkybsjg = null;
            this.f82351gxszxtbevo = null;
            this.f82355lqeggnwhkg = null;
            this.f82356nufgyqmvbu = PorterDuff.Mode.SRC_IN;
            this.f82348dxjokdxxww = null;
            this.f82346btonecajqb = 1.0f;
            this.f82350gtknphoqwx = 1.0f;
            this.f82362wflxmlrfwp = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f82345agtfadlqog = 0.0f;
            this.f82357ojitshcjhn = 0.0f;
            this.f82360rgvfuqvkyq = 0.0f;
            this.f82361vdvldrhtss = 0;
            this.f82358oxmwwwfdhm = 0;
            this.f82354kcexrzcfyt = 0;
            this.f82365zdlpuopuiu = 0;
            this.f82364yggfygwlhe = false;
            this.f82353jyumaefscl = Paint.Style.FILL_AND_STROKE;
            this.f82352iobyxmoadg = gtknphoqwxVar;
            this.f82366zoijcleaow = iobyxmoadgVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(this);
            lqeggnwhkgVar.f82323cqumvgiudr = true;
            return lqeggnwhkgVar;
        }

        public ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f82363wkgbmnqykc = null;
            this.f82349eablkybsjg = null;
            this.f82351gxszxtbevo = null;
            this.f82355lqeggnwhkg = null;
            this.f82356nufgyqmvbu = PorterDuff.Mode.SRC_IN;
            this.f82348dxjokdxxww = null;
            this.f82346btonecajqb = 1.0f;
            this.f82350gtknphoqwx = 1.0f;
            this.f82362wflxmlrfwp = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f82345agtfadlqog = 0.0f;
            this.f82357ojitshcjhn = 0.0f;
            this.f82360rgvfuqvkyq = 0.0f;
            this.f82361vdvldrhtss = 0;
            this.f82358oxmwwwfdhm = 0;
            this.f82354kcexrzcfyt = 0;
            this.f82365zdlpuopuiu = 0;
            this.f82364yggfygwlhe = false;
            this.f82353jyumaefscl = Paint.Style.FILL_AND_STROKE;
            this.f82352iobyxmoadg = ppxfxbqfkfVar.f82352iobyxmoadg;
            this.f82366zoijcleaow = ppxfxbqfkfVar.f82366zoijcleaow;
            this.f82347draadjrbmk = ppxfxbqfkfVar.f82347draadjrbmk;
            this.f82359ppxfxbqfkf = ppxfxbqfkfVar.f82359ppxfxbqfkf;
            this.f82363wkgbmnqykc = ppxfxbqfkfVar.f82363wkgbmnqykc;
            this.f82349eablkybsjg = ppxfxbqfkfVar.f82349eablkybsjg;
            this.f82356nufgyqmvbu = ppxfxbqfkfVar.f82356nufgyqmvbu;
            this.f82355lqeggnwhkg = ppxfxbqfkfVar.f82355lqeggnwhkg;
            this.f82362wflxmlrfwp = ppxfxbqfkfVar.f82362wflxmlrfwp;
            this.f82346btonecajqb = ppxfxbqfkfVar.f82346btonecajqb;
            this.f82354kcexrzcfyt = ppxfxbqfkfVar.f82354kcexrzcfyt;
            this.f82361vdvldrhtss = ppxfxbqfkfVar.f82361vdvldrhtss;
            this.f82364yggfygwlhe = ppxfxbqfkfVar.f82364yggfygwlhe;
            this.f82350gtknphoqwx = ppxfxbqfkfVar.f82350gtknphoqwx;
            this.f82345agtfadlqog = ppxfxbqfkfVar.f82345agtfadlqog;
            this.f82357ojitshcjhn = ppxfxbqfkfVar.f82357ojitshcjhn;
            this.f82360rgvfuqvkyq = ppxfxbqfkfVar.f82360rgvfuqvkyq;
            this.f82358oxmwwwfdhm = ppxfxbqfkfVar.f82358oxmwwwfdhm;
            this.f82365zdlpuopuiu = ppxfxbqfkfVar.f82365zdlpuopuiu;
            this.f82351gxszxtbevo = ppxfxbqfkfVar.f82351gxszxtbevo;
            this.f82353jyumaefscl = ppxfxbqfkfVar.f82353jyumaefscl;
            if (ppxfxbqfkfVar.f82348dxjokdxxww != null) {
                this.f82348dxjokdxxww = new Rect(ppxfxbqfkfVar.f82348dxjokdxxww);
            }
        }
    }
}
