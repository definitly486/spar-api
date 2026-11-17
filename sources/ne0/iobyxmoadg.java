package ne0;

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

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends RelativeLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final C1503iobyxmoadg f69800cqumvgiudr = new C1503iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f69801esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f69802iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f69803jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ImageView f69804yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ImageView f69805zdlpuopuiu;

    /* JADX INFO: renamed from: ne0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1503iobyxmoadg {
        public /* synthetic */ C1503iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1503iobyxmoadg() {
        }
    }

    public /* synthetic */ iobyxmoadg(Context context, int i13, int i14, int i15, int i16, AttributeSet attributeSet, int i17, int i18, gtknphoqwx gtknphoqwxVar) {
        this(context, i13, i14, i15, i16, (i18 & 32) != 0 ? null : attributeSet, (i18 & 64) != 0 ? 0 : i17);
    }

    private final void iobyxmoadg() {
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
        int i13 = this.f69803jyumaefscl;
        if (i13 == 0) {
            i13 = -2;
        }
        int i14 = this.f69802iwizpuwonk;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i13, i14 != 0 ? i14 : -2);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(getContext());
        this.f69805zdlpuopuiu = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f69805zdlpuopuiu, layoutParams);
        ImageView imageView2 = new ImageView(getContext());
        this.f69804yggfygwlhe = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f69804yggfygwlhe, layoutParams);
        zoijcleaow();
    }

    public final void ppxfxbqfkf() {
        ImageView imageView = this.f69805zdlpuopuiu;
        if (imageView != null) {
            imageView.setImageLevel(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
        }
        ImageView imageView2 = this.f69804yggfygwlhe;
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
        ImageView imageView = this.f69804yggfygwlhe;
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
        ImageView imageView = this.f69805zdlpuopuiu;
        if (imageView != null) {
            imageView.setImageDrawable(clipDrawable);
        }
    }

    public final void setPartialFilled(float f13) {
        int i13 = (int) (AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND * (f13 % 1));
        if (i13 == 0) {
            i13 = 10000;
        }
        ImageView imageView = this.f69805zdlpuopuiu;
        if (imageView != null) {
            imageView.setImageLevel(i13);
        }
        ImageView imageView2 = this.f69804yggfygwlhe;
        if (imageView2 != null) {
            imageView2.setImageLevel(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND - i13);
        }
    }

    public final void zoijcleaow() {
        ImageView imageView = this.f69805zdlpuopuiu;
        if (imageView != null) {
            imageView.setImageLevel(0);
        }
        ImageView imageView2 = this.f69804yggfygwlhe;
        if (imageView2 != null) {
            imageView2.setImageLevel(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Context context, int i13, int i14, int i15, int i16, AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f69803jyumaefscl = i14;
        this.f69802iwizpuwonk = i15;
        setTag(Integer.valueOf(i13));
        setPadding(i16, i16, i16, i16);
        iobyxmoadg();
    }
}
