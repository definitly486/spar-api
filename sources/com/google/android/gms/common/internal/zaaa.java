package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.DeviceProperties;

/* JADX INFO: loaded from: classes2.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i13, int i14, int i15, int i16) {
        if (i13 == 0) {
            return i14;
        }
        if (i13 == 1) {
            return i15;
        }
        if (i13 == 2) {
            return i16;
        }
        throw new IllegalStateException("Unknown color scheme: " + i13);
    }

    public final void zaa(Resources resources, int i13, int i14) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i15 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i15);
        setMinWidth(i15);
        int i16 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i17 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int iZab = zab(i14, i16, i17, i17);
        int i18 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i19 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int iZab2 = zab(i14, i18, i19, i19);
        if (i13 == 0 || i13 == 1) {
            iZab = iZab2;
        } else if (i13 != 2) {
            throw new IllegalStateException("Unknown button size: " + i13);
        }
        Drawable drawableOxmwwwfdhm = k1.iobyxmoadg.oxmwwwfdhm(resources.getDrawable(iZab));
        k1.iobyxmoadg.ojitshcjhn(drawableOxmwwwfdhm, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        k1.iobyxmoadg.rgvfuqvkyq(drawableOxmwwwfdhm, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableOxmwwwfdhm);
        int i23 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i24 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i14, i23, i24, i24))));
        if (i13 == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i13 == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("Unknown button size: " + i13);
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
