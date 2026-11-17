package ic1;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends RelativeLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final C0999iobyxmoadg f42399cqumvgiudr = new C0999iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f42400esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f42401iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f42402jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ImageView f42403yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ImageView f42404zdlpuopuiu;

    /* JADX INFO: renamed from: ic1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0999iobyxmoadg {
        public /* synthetic */ C0999iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0999iobyxmoadg() {
        }
    }

    public /* synthetic */ iobyxmoadg(Context context, int i13, int i14, int i15, int i16, AttributeSet attributeSet, int i17, int i18, gtknphoqwx gtknphoqwxVar) {
        this(context, i13, i14, i15, i16, (i18 & 32) != 0 ? null : attributeSet, (i18 & 64) != 0 ? 0 : i17);
    }

    private final void iobyxmoadg() {
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
        int i13 = this.f42402jyumaefscl;
        if (i13 == 0) {
            i13 = -2;
        }
        int i14 = this.f42401iwizpuwonk;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i13, i14 != 0 ? i14 : -2);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(getContext());
        this.f42404zdlpuopuiu = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f42404zdlpuopuiu, layoutParams);
        ImageView imageView2 = new ImageView(getContext());
        this.f42403yggfygwlhe = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f42403yggfygwlhe, layoutParams);
        zoijcleaow();
    }

    public final void ppxfxbqfkf() {
        ImageView imageView = this.f42404zdlpuopuiu;
        if (imageView != null) {
            imageView.setImageLevel(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
        }
        ImageView imageView2 = this.f42403yggfygwlhe;
        if (imageView2 != null) {
            imageView2.setImageLevel(0);
        }
    }

    public final void setEmptyDrawable(Drawable drawable) {
        zdlpuopuiu.btonecajqb(drawable, "drawable");
        if (drawable.getConstantState() == null) {
            return;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        zdlpuopuiu.lqeggnwhkg(constantState);
        ClipDrawable clipDrawable = new ClipDrawable(constantState.newDrawable(), 8388613, 1);
        ImageView imageView = this.f42403yggfygwlhe;
        if (imageView != null) {
            imageView.setImageDrawable(clipDrawable);
        }
    }

    public final void setFilledDrawable(Drawable drawable) {
        zdlpuopuiu.btonecajqb(drawable, "drawable");
        if (drawable.getConstantState() == null) {
            return;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        zdlpuopuiu.lqeggnwhkg(constantState);
        ClipDrawable clipDrawable = new ClipDrawable(constantState.newDrawable(), 8388611, 1);
        ImageView imageView = this.f42404zdlpuopuiu;
        if (imageView != null) {
            imageView.setImageDrawable(clipDrawable);
        }
    }

    public final void setPartialFilled(float f13) {
        int i13 = (int) (AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND * (f13 % 1));
        if (i13 == 0) {
            i13 = 10000;
        }
        ImageView imageView = this.f42404zdlpuopuiu;
        if (imageView != null) {
            imageView.setImageLevel(i13);
        }
        ImageView imageView2 = this.f42403yggfygwlhe;
        if (imageView2 != null) {
            imageView2.setImageLevel(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND - i13);
        }
    }

    public final void zoijcleaow() {
        ImageView imageView = this.f42404zdlpuopuiu;
        if (imageView != null) {
            imageView.setImageLevel(0);
        }
        ImageView imageView2 = this.f42403yggfygwlhe;
        if (imageView2 != null) {
            imageView2.setImageLevel(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Context context, int i13, int i14, int i15, int i16, AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f42402jyumaefscl = i14;
        this.f42401iwizpuwonk = i15;
        setTag(Integer.valueOf(i13));
        setPadding(i16, i16, i16, i16);
        iobyxmoadg();
    }
}
