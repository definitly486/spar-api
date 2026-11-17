package ru.myspar.proloyalty.legacy.presentation.view.ratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import b31.gxszxtbevo;
import b31.ojitshcjhn;
import ic1.iobyxmoadg;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u0000 V2\u00020\u0001:\u0002\"1B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010#J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010#J\u001f\u0010)\u001a\u00020\f2\u0006\u0010$\u001a\u00020 2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J'\u0010-\u001a\u00020\f2\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020 2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020 2\u0006\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\u000eJ\u0017\u00106\u001a\u00020\u00112\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00112\u0006\u00108\u001a\u00020 ¢\u0006\u0004\b9\u0010#R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010;R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010;R\u0016\u0010B\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u00100\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010J\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010ER\u0016\u0010+\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010AR\u0016\u0010,\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010AR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001d0R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006W"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/ratingbar/RatingBarView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "event", "", "gxszxtbevo", "(Landroid/view/MotionEvent;)Z", "Landroid/content/res/TypedArray;", "typedArray", "Lgg/wwaezpbzkn;", "lqeggnwhkg", "(Landroid/content/res/TypedArray;Landroid/content/Context;)V", "nufgyqmvbu", "()V", "partialViewId", "starWidth", "starHeight", "padding", "Landroid/graphics/drawable/Drawable;", "filledDrawable", "emptyDrawable", "Lic1/iobyxmoadg;", "ppxfxbqfkf", "(IIIILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lic1/iobyxmoadg;", "", "rating", "zoijcleaow", "(F)V", "eventX", "eablkybsjg", "wkgbmnqykc", "Landroid/view/View;", "ratingView", "btonecajqb", "(FLandroid/view/View;)Z", "startX", "startY", "dxjokdxxww", "(FFLandroid/view/MotionEvent;)Z", "starView", "stepSize", "iobyxmoadg", "(Lic1/iobyxmoadg;FF)F", "onTouchEvent", "Lru/myspar/proloyalty/legacy/presentation/view/ratingbar/RatingBarView$zoijcleaow;", "onRatingChangeListener", "setOnRatingChangeListener", "(Lru/myspar/proloyalty/legacy/presentation/view/ratingbar/RatingBarView$zoijcleaow;)V", "newRating", "setRating", "zdlpuopuiu", "I", "numStars", "yggfygwlhe", "jyumaefscl", "iwizpuwonk", "cqumvgiudr", "F", "generalRating", "esjtqupxsv", "lereixgezr", "Z", "isScrollable", "pmvmpeiblj", "changeEnabled", "zynmafqrjb", "handleTouchEventEnabled", "istkbnxepw", "cdpycssgdh", "yadqdtsiqt", "Landroid/graphics/drawable/Drawable;", "iozdgvuglv", "lmojexxdyd", "Lru/myspar/proloyalty/legacy/presentation/view/ratingbar/RatingBarView$zoijcleaow;", "", "wwaezpbzkn", "Ljava/util/List;", "starViews", "ylkuphrtab", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RatingBarView extends LinearLayout {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private float startY;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private float generalRating;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private float stepSize;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private Drawable filledDrawable;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private float startX;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private int starHeight;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private int starWidth;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private boolean isScrollable;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private zoijcleaow onRatingChangeListener;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private boolean changeEnabled;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private List starViews;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private Drawable emptyDrawable;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private int padding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private int numStars;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private boolean handleTouchEventEnabled;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static final int f97646pkzmftpjix = 8;

    public interface zoijcleaow {
        void iobyxmoadg(RatingBarView ratingBarView, float f13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final boolean btonecajqb(float eventX, View ratingView) {
        return eventX > ((float) ratingView.getLeft()) && eventX < ((float) ratingView.getRight());
    }

    private final boolean dxjokdxxww(float startX, float startY, MotionEvent event) {
        if (event.getEventTime() - event.getDownTime() > 200.0f) {
            return false;
        }
        return Math.abs(startX - event.getX()) <= 5.0f && Math.abs(startY - event.getY()) <= 5.0f;
    }

    private final void eablkybsjg(float eventX) {
        for (iobyxmoadg iobyxmoadgVar : this.starViews) {
            if (btonecajqb(eventX, iobyxmoadgVar)) {
                float fIobyxmoadg = iobyxmoadg(iobyxmoadgVar, this.stepSize, eventX);
                if (this.generalRating != fIobyxmoadg) {
                    setRating(fIobyxmoadg);
                }
            }
        }
    }

    private final boolean gxszxtbevo(MotionEvent event) {
        float x13 = event.getX();
        float y13 = event.getY();
        int action = event.getAction();
        if (action == 0) {
            this.startX = x13;
            this.startY = y13;
        } else if (action != 1) {
            if (action == 2) {
                if (!this.isScrollable) {
                    return false;
                }
                eablkybsjg(x13);
            }
        } else {
            if (!dxjokdxxww(this.startX, this.startY, event) || !this.changeEnabled) {
                return false;
            }
            wkgbmnqykc(x13);
        }
        if (this.changeEnabled) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    private final float iobyxmoadg(iobyxmoadg starView, float stepSize, float eventX) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        String str = decimalFormat.format(Float.valueOf((eventX - starView.getLeft()) / starView.getWidth()));
        float fGxszxtbevo = vg.iobyxmoadg.gxszxtbevo((str != null ? Float.parseFloat(str) : 0.0f) / stepSize) * stepSize;
        Object tag = starView.getTag();
        zdlpuopuiu.nufgyqmvbu(tag, "null cannot be cast to non-null type kotlin.Int");
        String str2 = decimalFormat.format(Float.valueOf(((Integer) tag).intValue() - (1 - fGxszxtbevo)));
        zdlpuopuiu.dxjokdxxww(str2, "format(...)");
        return Float.parseFloat(str2);
    }

    private final void lqeggnwhkg(TypedArray typedArray, Context context) {
        this.generalRating = typedArray.getFloat(ojitshcjhn.RatingBarView_rating, 0.0f);
        this.numStars = typedArray.getInt(ojitshcjhn.RatingBarView_num_stars, 5);
        this.stepSize = typedArray.getFloat(ojitshcjhn.RatingBarView_step_size, 1.0f);
        this.isScrollable = typedArray.getBoolean(ojitshcjhn.RatingBarView_scrollable, this.isScrollable);
        this.changeEnabled = typedArray.getBoolean(ojitshcjhn.RatingBarView_changeEnabled, this.changeEnabled);
        this.padding = typedArray.getDimensionPixelSize(ojitshcjhn.RatingBarView_star_padding, 0);
        this.starWidth = typedArray.getDimensionPixelSize(ojitshcjhn.RatingBarView_star_width, 0);
        this.starHeight = typedArray.getDimensionPixelSize(ojitshcjhn.RatingBarView_star_height, 0);
        this.handleTouchEventEnabled = typedArray.getBoolean(ojitshcjhn.RatingBarView_handleTouchEventEnabled, this.handleTouchEventEnabled);
        this.emptyDrawable = androidx.core.content.iobyxmoadg.getDrawable(context, typedArray.getResourceId(ojitshcjhn.RatingBarView_drawable_empty, gxszxtbevo.ic_star_16));
        this.filledDrawable = androidx.core.content.iobyxmoadg.getDrawable(context, typedArray.getResourceId(ojitshcjhn.RatingBarView_drawable_fill, gxszxtbevo.ic_star_16));
        Drawable drawable = this.emptyDrawable;
        if (drawable != null) {
            Drawable drawableOxmwwwfdhm = k1.iobyxmoadg.oxmwwwfdhm(drawable.mutate());
            zdlpuopuiu.dxjokdxxww(drawableOxmwwwfdhm, "wrap(...)");
            k1.iobyxmoadg.agtfadlqog(drawableOxmwwwfdhm, ppxfxbqfkf.ppxfxbqfkf(context, b31.ppxfxbqfkf.colorSurface2));
            this.emptyDrawable = drawableOxmwwwfdhm;
        }
        Drawable drawable2 = this.filledDrawable;
        if (drawable2 != null) {
            Drawable drawableOxmwwwfdhm2 = k1.iobyxmoadg.oxmwwwfdhm(drawable2.mutate());
            zdlpuopuiu.dxjokdxxww(drawableOxmwwwfdhm2, "wrap(...)");
            k1.iobyxmoadg.agtfadlqog(drawableOxmwwwfdhm2, ppxfxbqfkf.ppxfxbqfkf(context, b31.ppxfxbqfkf.colorAdditional2));
            this.filledDrawable = drawableOxmwwwfdhm2;
        }
        typedArray.recycle();
    }

    private final void nufgyqmvbu() {
        this.starViews = new ArrayList();
        int i13 = this.numStars;
        int i14 = 1;
        if (1 > i13) {
            return;
        }
        while (true) {
            iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(i14, this.starWidth, this.starHeight, this.padding, this.filledDrawable, this.emptyDrawable);
            addView(iobyxmoadgVarPpxfxbqfkf);
            this.starViews.add(iobyxmoadgVarPpxfxbqfkf);
            if (i14 == i13) {
                return;
            } else {
                i14++;
            }
        }
    }

    private final iobyxmoadg ppxfxbqfkf(int partialViewId, int starWidth, int starHeight, int padding, Drawable filledDrawable, Drawable emptyDrawable) {
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(context, partialViewId, starWidth, starHeight, padding, null, 0, 96, null);
        if (filledDrawable != null && emptyDrawable != null) {
            iobyxmoadgVar.setFilledDrawable(filledDrawable);
            iobyxmoadgVar.setEmptyDrawable(emptyDrawable);
        }
        return iobyxmoadgVar;
    }

    private final void wkgbmnqykc(float eventX) {
        float fIobyxmoadg;
        for (iobyxmoadg iobyxmoadgVar : this.starViews) {
            if (btonecajqb(eventX, iobyxmoadgVar)) {
                float f13 = this.stepSize;
                if (f13 == 1.0f) {
                    Object tag = iobyxmoadgVar.getTag();
                    zdlpuopuiu.nufgyqmvbu(tag, "null cannot be cast to non-null type kotlin.Int");
                    fIobyxmoadg = ((Integer) tag).intValue();
                } else {
                    fIobyxmoadg = iobyxmoadg(iobyxmoadgVar, f13, eventX);
                }
                setRating(fIobyxmoadg);
                return;
            }
        }
    }

    private final void zoijcleaow(float rating) {
        for (iobyxmoadg iobyxmoadgVar : this.starViews) {
            Object tag = iobyxmoadgVar.getTag();
            zdlpuopuiu.nufgyqmvbu(tag, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) tag).intValue();
            double dCeil = Math.ceil(rating);
            double d13 = iIntValue;
            if (d13 > dCeil) {
                iobyxmoadgVar.zoijcleaow();
            } else if (d13 == dCeil) {
                iobyxmoadgVar.setPartialFilled(rating);
            } else {
                iobyxmoadgVar.ppxfxbqfkf();
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        zdlpuopuiu.btonecajqb(event, "event");
        return this.handleTouchEventEnabled ? gxszxtbevo(event) : super.onTouchEvent(event);
    }

    public final void setOnRatingChangeListener(zoijcleaow onRatingChangeListener) {
        this.onRatingChangeListener = onRatingChangeListener;
    }

    public final void setRating(float newRating) {
        int i13 = this.numStars;
        if (newRating > i13) {
            newRating = i13;
        }
        if (this.generalRating == newRating) {
            return;
        }
        float fFloor = ((float) Math.floor(newRating / this.stepSize)) * this.stepSize;
        this.generalRating = fFloor;
        zoijcleaow zoijcleaowVar = this.onRatingChangeListener;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.iobyxmoadg(this, fFloor);
        }
        zoijcleaow(this.generalRating);
    }

    public /* synthetic */ RatingBarView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingBarView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        this.stepSize = 1.0f;
        this.isScrollable = true;
        this.changeEnabled = true;
        this.handleTouchEventEnabled = true;
        this.starViews = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ojitshcjhn.RatingBarView);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        lqeggnwhkg(typedArrayObtainStyledAttributes, context);
        nufgyqmvbu();
    }
}
