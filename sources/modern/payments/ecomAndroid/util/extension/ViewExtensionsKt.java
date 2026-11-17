package modern.payments.ecomAndroid.util.extension;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a#\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a)\u0010\u000e\u001a\u00020\u0002*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0012\u001a\u00020\u0002*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a?\u0010\u001c\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroid/view/View;", "view", "Lgg/wwaezpbzkn;", "showDelayedKeyboard", "(Landroid/view/View;Landroid/view/View;)V", "", "delay", "(Landroid/view/View;Landroid/view/View;I)V", "hideKeyboardDelayed", "hideDelayedKeyboard", "Landroid/widget/TextView;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$FontParams;", "fontParams", "color", "setFontParams", "(Landroid/widget/TextView;Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository$FontParams;Ljava/lang/Integer;)V", "Lcom/google/android/material/button/MaterialButton;", "cornerRadius", "setCornerParams", "(Lcom/google/android/material/button/MaterialButton;Ljava/lang/Integer;)V", "startBottomMargin", "finalBottomMargin", "", "duration", "", "fillAfter", "Landroid/view/animation/Animation$AnimationListener;", "animationListener", "addBottomMarginAnimation", "(Landroid/view/View;IIJZLandroid/view/animation/Animation$AnimationListener;)V", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewExtensionsKt {
    public static final void addBottomMarginAnimation(final View view, final int i13, final int i14, long j13, boolean z13, Animation.AnimationListener animationListener) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        Animation animation = new Animation() { // from class: modern.payments.ecomAndroid.util.extension.ViewExtensionsKt$addBottomMarginAnimation$animation$1
            @Override // android.view.animation.Animation
            protected void applyTransformation(float interpolatedTime, Transformation t13) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    int i15 = i13;
                    int i16 = i14;
                    View view2 = view;
                    marginLayoutParams.bottomMargin = (int) (i15 + ((i16 - i15) * interpolatedTime));
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
        };
        animation.setDuration(j13);
        animation.setFillAfter(z13);
        animation.setAnimationListener(animationListener);
        view.startAnimation(animation);
    }

    public static /* synthetic */ void addBottomMarginAnimation$default(View view, int i13, int i14, long j13, boolean z13, Animation.AnimationListener animationListener, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z13 = true;
        }
        boolean z14 = z13;
        if ((i15 & 16) != 0) {
            animationListener = null;
        }
        addBottomMarginAnimation(view, i13, i14, j13, z14, animationListener);
    }

    public static final void hideDelayedKeyboard(final View view, final View view2, int i13) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        zdlpuopuiu.btonecajqb(view2, "view");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: modern.payments.ecomAndroid.util.extension.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                ViewExtensionsKt.hideDelayedKeyboard$lambda$1(view, view2);
            }
        }, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideDelayedKeyboard$lambda$1(View this_hideDelayedKeyboard, View view) {
        zdlpuopuiu.btonecajqb(this_hideDelayedKeyboard, "$this_hideDelayedKeyboard");
        zdlpuopuiu.btonecajqb(view, "$view");
        Context context = this_hideDelayedKeyboard.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        ContextExtensionsKt.hideKeyboard(context, view);
    }

    public static final void hideKeyboardDelayed(View view, View view2) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        zdlpuopuiu.btonecajqb(view2, "view");
        hideDelayedKeyboard(view, view2, 100);
    }

    public static final void setCornerParams(MaterialButton materialButton, Integer num) {
        int i13;
        zdlpuopuiu.btonecajqb(materialButton, "<this>");
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue != 8) {
                i13 = iIntValue != 24 ? R.drawable.ecom_button_shape_16 : R.drawable.ecom_button_shape_24;
            } else {
                i13 = R.drawable.ecom_button_shape_8;
            }
            materialButton.setBackgroundResource(i13);
        }
    }

    public static final void setFontParams(TextView textView, UIPreferencesRepository.FontParams fontParams, Integer num) {
        zdlpuopuiu.btonecajqb(textView, "<this>");
        if (fontParams != null) {
            textView.setTextSize(fontParams.getSize());
            Integer lineHeight = fontParams.getLineHeight();
            if (lineHeight != null) {
                textView.setMinHeight(lineHeight.intValue());
            }
            textView.setLineSpacing(fontParams.getLetterSpacing(), 1.0f);
        }
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
    }

    public static /* synthetic */ void setFontParams$default(TextView textView, UIPreferencesRepository.FontParams fontParams, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            num = null;
        }
        setFontParams(textView, fontParams, num);
    }

    public static final void showDelayedKeyboard(View view, View view2) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        zdlpuopuiu.btonecajqb(view2, "view");
        showDelayedKeyboard(view, view2, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDelayedKeyboard$lambda$0(View this_showDelayedKeyboard, View view) {
        zdlpuopuiu.btonecajqb(this_showDelayedKeyboard, "$this_showDelayedKeyboard");
        zdlpuopuiu.btonecajqb(view, "$view");
        Context context = this_showDelayedKeyboard.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        ContextExtensionsKt.showKeyboard(context, view);
    }

    public static final void showDelayedKeyboard(final View view, final View view2, int i13) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        zdlpuopuiu.btonecajqb(view2, "view");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: modern.payments.ecomAndroid.util.extension.ppxfxbqfkf
            @Override // java.lang.Runnable
            public final void run() {
                ViewExtensionsKt.showDelayedKeyboard$lambda$0(view, view2);
            }
        }, i13);
    }
}
