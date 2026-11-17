package kk;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fh0 extends FrameLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final int f56561cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final int f56562esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public final boolean f56563istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final int f56564iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final int f56565jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final int f56566lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public final int f56567pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final int f56568yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final TextView f56569zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public final int f56570zynmafqrjb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SpayOtpTextView);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tyleable.SpayOtpTextView)");
        Context context2 = getContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context2, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context2, "<this>");
        float fApplyDimension = (int) TypedValue.applyDimension(1, 2.0f, context2.getResources().getDisplayMetrics());
        Context context3 = getContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context3, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context3, "<this>");
        float fApplyDimension2 = (int) TypedValue.applyDimension(1, 24.0f, context3.getResources().getDisplayMetrics());
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SpayOtpTextView_android_textColor, i1.nufgyqmvbu.wkgbmnqykc(getContext().getResources(), R.color.spay_otp_code_input_text_color, null));
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_bar_height, fApplyDimension);
        int i13 = R.styleable.SpayOtpTextView_spay_bar_margin;
        Context context4 = getContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context4, "context");
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(i13, xd0.iobyxmoadg(context4, 0));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_bar_margin_bottom, 2.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_bar_margin_right, 2.0f);
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_bar_margin_left, 2.0f);
        float dimension6 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_bar_margin_top, 2.0f);
        this.f56563istkbnxepw = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SpayOtpTextView_spay_hide_otp, false);
        this.f56562esjtqupxsv = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_hide_otp_drawable, R.drawable.spay_masked_pin);
        this.f56566lereixgezr = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_hide_otp_error_drawable, R.drawable.spay_pin);
        Resources resources = getContext().getResources();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(resources, "context.resources");
        this.f56567pmvmpeiblj = kl.iobyxmoadg(resources, R.color.spay_transparent);
        this.f56570zynmafqrjb = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_hide_otp_error_drawable, R.drawable.spay_error_pin);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SpayOtpTextView_spay_bar_enabled, false);
        float dimension7 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SpayOtpTextView_spay_otp_text_size, fApplyDimension2);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SpayOtpTextView_spay_text_typeface);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_otp_box_background, R.color.spay_transparent);
        this.f56568yggfygwlhe = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_otp_box_background_active, resourceId);
        this.f56565jyumaefscl = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_otp_box_background_inactive, resourceId);
        this.f56564iwizpuwonk = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_otp_box_background_success, resourceId);
        this.f56561cqumvgiudr = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SpayOtpTextView_spay_otp_box_background_error, resourceId);
        int i14 = R.styleable.SpayOtpTextView_spay_bar_active_color;
        Resources resources2 = getContext().getResources();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(resources2, "context.resources");
        typedArrayObtainStyledAttributes.getColor(i14, kl.iobyxmoadg(resources2, R.color.spay_main_text_color));
        int i15 = R.styleable.SpayOtpTextView_spay_bar_inactive_color;
        Resources resources3 = getContext().getResources();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(resources3, "context.resources");
        typedArrayObtainStyledAttributes.getColor(i15, kl.iobyxmoadg(resources3, R.color.spay_otp_code_input_hint_color));
        int i16 = R.styleable.SpayOtpTextView_spay_bar_error_color;
        Resources resources4 = getContext().getResources();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(resources4, "context.resources");
        typedArrayObtainStyledAttributes.getColor(i16, kl.iobyxmoadg(resources4, R.color.spay_otp_code_error_text_color));
        int i17 = R.styleable.SpayOtpTextView_spay_bar_success_color;
        Resources resources5 = getContext().getResources();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(resources5, "context.resources");
        typedArrayObtainStyledAttributes.getColor(i17, kl.iobyxmoadg(resources5, R.color.spay_otp_code_input_text_color));
        setBackgroundResource(resourceId);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        this.f56569zdlpuopuiu = textView;
        textView.setGravity(17);
        if (string != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(getContext().getAssets(), string));
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
        TextView textView2 = this.f56569zdlpuopuiu;
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
        TextView textView3 = this.f56569zdlpuopuiu;
        if (textView3 != null) {
            textView3.setTextSize(0, dimension7);
        }
        addView(this.f56569zdlpuopuiu, layoutParams);
        if (z13) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) dimension);
            layoutParams2.gravity = 80;
            if (dimension2 == 0.0f) {
                dimension2 = dimension6;
            } else {
                dimension3 = dimension2;
                dimension4 = dimension3;
                dimension5 = dimension4;
            }
            layoutParams2.leftMargin = (int) dimension5;
            layoutParams2.rightMargin = (int) dimension4;
            layoutParams2.bottomMargin = (int) dimension3;
            layoutParams2.topMargin = (int) dimension2;
            addView((View) null, layoutParams2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void ppxfxbqfkf(fh0 fh0Var, String str, boolean z13, boolean z14, boolean z15, int i13) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        if ((i13 & 4) != 0) {
            z14 = false;
        }
        if ((i13 & 8) != 0) {
            z15 = false;
        }
        fh0Var.iobyxmoadg(str, z13, z14, z15);
    }

    public static final void zoijcleaow(fh0 this$0, String value, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "$value");
        TextView textView = this$0.f56569zdlpuopuiu;
        if (textView != null) {
            textView.setText("");
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(value, "") && z13) {
            TextView textView2 = this$0.f56569zdlpuopuiu;
            if (textView2 != null) {
                textView2.setBackgroundResource(this$0.f56570zynmafqrjb);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(value, "") || z13) {
            TextView textView3 = this$0.f56569zdlpuopuiu;
            if (textView3 != null) {
                textView3.setBackgroundResource(this$0.f56562esjtqupxsv);
                return;
            }
            return;
        }
        TextView textView4 = this$0.f56569zdlpuopuiu;
        if (textView4 != null) {
            textView4.setBackgroundResource(this$0.f56566lereixgezr);
        }
    }

    public final void iobyxmoadg(final String value, boolean z13, final boolean z14, boolean z15) {
        TextView textView;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        if (!this.f56563istkbnxepw && (textView = this.f56569zdlpuopuiu) != null) {
            textView.setText(value);
            return;
        }
        if (z15 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(value, "")) {
            TextView textView2 = this.f56569zdlpuopuiu;
            if (textView2 != null) {
                textView2.setBackgroundResource(this.f56566lereixgezr);
                return;
            }
            return;
        }
        if (z15 && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(value, "")) {
            TextView textView3 = this.f56569zdlpuopuiu;
            if (textView3 != null) {
                textView3.setBackgroundResource(this.f56562esjtqupxsv);
                return;
            }
            return;
        }
        if (z13) {
            TextView textView4 = this.f56569zdlpuopuiu;
            if (textView4 != null) {
                textView4.setBackgroundResource(this.f56567pmvmpeiblj);
            }
            TextView textView5 = this.f56569zdlpuopuiu;
            if (textView5 != null) {
                textView5.setText(value);
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: kk.eh0
            @Override // java.lang.Runnable
            public final void run() {
                fh0.zoijcleaow(this.f56425zdlpuopuiu, value, z14);
            }
        }, 300L);
    }

    public final void setViewState(int i13) {
        if (i13 == -1) {
            setBackgroundResource(this.f56561cqumvgiudr);
            return;
        }
        if (i13 == 0) {
            setBackgroundResource(this.f56565jyumaefscl);
        } else if (i13 == 1) {
            setBackgroundResource(this.f56568yggfygwlhe);
        } else {
            if (i13 != 2) {
                return;
            }
            setBackgroundResource(this.f56564iwizpuwonk);
        }
    }
}
