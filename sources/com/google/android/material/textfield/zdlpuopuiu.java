package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
abstract class zdlpuopuiu {
    static void btonecajqb(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }

    static void dxjokdxxww(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        gxszxtbevo(checkableImageButton, onLongClickListener);
    }

    static void eablkybsjg(CheckableImageButton checkableImageButton) {
    }

    private static void gxszxtbevo(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zDsvhmnatus = jhduphickx.dsvhmnatus(checkableImageButton);
        boolean z13 = onLongClickListener != null;
        boolean z14 = zDsvhmnatus || z13;
        checkableImageButton.setFocusable(z14);
        checkableImageButton.setClickable(zDsvhmnatus);
        checkableImageButton.setPressable(zDsvhmnatus);
        checkableImageButton.setLongClickable(z13);
        jhduphickx.uawqvzlxes(checkableImageButton, z14 ? 1 : 2);
    }

    static void iobyxmoadg(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                k1.iobyxmoadg.ojitshcjhn(drawable, colorStateList);
            } else {
                k1.iobyxmoadg.ojitshcjhn(drawable, ColorStateList.valueOf(colorStateList.getColorForState(ppxfxbqfkf(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                k1.iobyxmoadg.rgvfuqvkyq(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static void lqeggnwhkg(CheckableImageButton checkableImageButton, int i13) {
        checkableImageButton.setMinimumWidth(i13);
        checkableImageButton.setMinimumHeight(i13);
    }

    static void nufgyqmvbu(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        gxszxtbevo(checkableImageButton, onLongClickListener);
    }

    private static int[] ppxfxbqfkf(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    static void wkgbmnqykc(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(ppxfxbqfkf(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate();
        k1.iobyxmoadg.ojitshcjhn(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    static ImageView.ScaleType zoijcleaow(int i13) {
        if (i13 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i13 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i13 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i13 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i13 != 5) {
            return i13 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }
}
