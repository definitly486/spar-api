package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import da.gtknphoqwx;
import oa.ppxfxbqfkf;
import ra.agtfadlqog;
import ra.draadjrbmk;
import ra.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements agtfadlqog {

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private static final int f22843dsvhmnatus = gtknphoqwx.Widget_MaterialComponents_ShapeableImageView;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private lqeggnwhkg f22844cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f22845cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final RectF f22846cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final RectF f22847esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private int f22848hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private int f22849hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private float f22850iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private ColorStateList f22851istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final draadjrbmk f22852iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private int f22853jpowsppfya;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Paint f22854lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private Path f22855lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f22856pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final Paint f22857pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int f22858wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private ra.gtknphoqwx f22859yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f22860ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Path f22861zynmafqrjb;

    class iobyxmoadg extends ViewOutlineProvider {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Rect f22862iobyxmoadg = new Rect();

        iobyxmoadg() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f22859yadqdtsiqt == null) {
                return;
            }
            if (ShapeableImageView.this.f22844cdpycssgdh == null) {
                ShapeableImageView.this.f22844cdpycssgdh = new lqeggnwhkg(ShapeableImageView.this.f22859yadqdtsiqt);
            }
            ShapeableImageView.this.f22846cqumvgiudr.round(this.f22862iobyxmoadg);
            ShapeableImageView.this.f22844cdpycssgdh.setBounds(this.f22862iobyxmoadg);
            ShapeableImageView.this.f22844cdpycssgdh.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void btonecajqb(int i13, int i14) {
        this.f22846cqumvgiudr.set(getPaddingLeft(), getPaddingTop(), i13 - getPaddingRight(), i14 - getPaddingBottom());
        this.f22852iwizpuwonk.wkgbmnqykc(this.f22859yadqdtsiqt, 1.0f, this.f22846cqumvgiudr, this.f22861zynmafqrjb);
        this.f22855lmojexxdyd.rewind();
        this.f22855lmojexxdyd.addPath(this.f22861zynmafqrjb);
        this.f22847esjtqupxsv.set(0.0f, 0.0f, i13, i14);
        this.f22855lmojexxdyd.addRect(this.f22847esjtqupxsv, Path.Direction.CCW);
    }

    private boolean dxjokdxxww() {
        return getLayoutDirection() == 1;
    }

    private void lqeggnwhkg(Canvas canvas) {
        if (this.f22851istkbnxepw == null) {
            return;
        }
        this.f22854lereixgezr.setStrokeWidth(this.f22850iozdgvuglv);
        int colorForState = this.f22851istkbnxepw.getColorForState(getDrawableState(), this.f22851istkbnxepw.getDefaultColor());
        if (this.f22850iozdgvuglv <= 0.0f || colorForState == 0) {
            return;
        }
        this.f22854lereixgezr.setColor(colorForState);
        canvas.drawPath(this.f22861zynmafqrjb, this.f22854lereixgezr);
    }

    private boolean nufgyqmvbu() {
        return (this.f22853jpowsppfya == Integer.MIN_VALUE && this.f22849hkdspvbjdz == Integer.MIN_VALUE) ? false : true;
    }

    public int getContentPaddingBottom() {
        return this.f22848hcddaimhww;
    }

    public final int getContentPaddingEnd() {
        int i13 = this.f22849hkdspvbjdz;
        if (i13 != Integer.MIN_VALUE) {
            return i13;
        }
        return dxjokdxxww() ? this.f22858wwaezpbzkn : this.f22856pkzmftpjix;
    }

    public int getContentPaddingLeft() {
        int i13;
        int i14;
        if (nufgyqmvbu()) {
            if (dxjokdxxww() && (i14 = this.f22849hkdspvbjdz) != Integer.MIN_VALUE) {
                return i14;
            }
            if (!dxjokdxxww() && (i13 = this.f22853jpowsppfya) != Integer.MIN_VALUE) {
                return i13;
            }
        }
        return this.f22858wwaezpbzkn;
    }

    public int getContentPaddingRight() {
        int i13;
        int i14;
        if (nufgyqmvbu()) {
            if (dxjokdxxww() && (i14 = this.f22853jpowsppfya) != Integer.MIN_VALUE) {
                return i14;
            }
            if (!dxjokdxxww() && (i13 = this.f22849hkdspvbjdz) != Integer.MIN_VALUE) {
                return i13;
            }
        }
        return this.f22856pkzmftpjix;
    }

    public final int getContentPaddingStart() {
        int i13 = this.f22853jpowsppfya;
        if (i13 != Integer.MIN_VALUE) {
            return i13;
        }
        return dxjokdxxww() ? this.f22856pkzmftpjix : this.f22858wwaezpbzkn;
    }

    public int getContentPaddingTop() {
        return this.f22860ylkuphrtab;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public ra.gtknphoqwx getShapeAppearanceModel() {
        return this.f22859yadqdtsiqt;
    }

    public ColorStateList getStrokeColor() {
        return this.f22851istkbnxepw;
    }

    public float getStrokeWidth() {
        return this.f22850iozdgvuglv;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f22855lmojexxdyd, this.f22857pmvmpeiblj);
        lqeggnwhkg(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (!this.f22845cllcsxoeiz && isLayoutDirectionResolved()) {
            this.f22845cllcsxoeiz = true;
            if (isPaddingRelative() || nufgyqmvbu()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        btonecajqb(i13, i14);
    }

    @Override // android.view.View
    public void setPadding(int i13, int i14, int i15, int i16) {
        super.setPadding(i13 + getContentPaddingLeft(), i14 + getContentPaddingTop(), i15 + getContentPaddingRight(), i16 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i13, int i14, int i15, int i16) {
        super.setPaddingRelative(i13 + getContentPaddingStart(), i14 + getContentPaddingTop(), i15 + getContentPaddingEnd(), i16 + getContentPaddingBottom());
    }

    @Override // ra.agtfadlqog
    public void setShapeAppearanceModel(ra.gtknphoqwx gtknphoqwxVar) {
        this.f22859yadqdtsiqt = gtknphoqwxVar;
        lqeggnwhkg lqeggnwhkgVar = this.f22844cdpycssgdh;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.setShapeAppearanceModel(gtknphoqwxVar);
        }
        btonecajqb(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f22851istkbnxepw = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i13) {
        setStrokeColor(nufgyqmvbu.iobyxmoadg.iobyxmoadg(getContext(), i13));
    }

    public void setStrokeWidth(float f13) {
        if (this.f22850iozdgvuglv != f13) {
            this.f22850iozdgvuglv = f13;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i13) {
        setStrokeWidth(getResources().getDimensionPixelSize(i13));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f22843dsvhmnatus;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        this.f22852iwizpuwonk = draadjrbmk.gtknphoqwx();
        this.f22861zynmafqrjb = new Path();
        this.f22845cllcsxoeiz = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f22857pmvmpeiblj = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f22846cqumvgiudr = new RectF();
        this.f22847esjtqupxsv = new RectF();
        this.f22855lmojexxdyd = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, da.draadjrbmk.ShapeableImageView, i13, i14);
        setLayerType(2, null);
        this.f22851istkbnxepw = ppxfxbqfkf.iobyxmoadg(context2, typedArrayObtainStyledAttributes, da.draadjrbmk.ShapeableImageView_strokeColor);
        this.f22850iozdgvuglv = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.ShapeableImageView_contentPadding, 0);
        this.f22858wwaezpbzkn = dimensionPixelSize;
        this.f22860ylkuphrtab = dimensionPixelSize;
        this.f22856pkzmftpjix = dimensionPixelSize;
        this.f22848hcddaimhww = dimensionPixelSize;
        this.f22858wwaezpbzkn = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.f22860ylkuphrtab = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.f22856pkzmftpjix = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.f22848hcddaimhww = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.f22853jpowsppfya = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.f22849hkdspvbjdz = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f22854lereixgezr = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f22859yadqdtsiqt = ra.gtknphoqwx.eablkybsjg(context2, attributeSet, i13, i14).wflxmlrfwp();
        setOutlineProvider(new iobyxmoadg());
    }
}
