package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f12503yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f12504zdlpuopuiu;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f12503yggfygwlhe;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f12504zdlpuopuiu;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i13);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i13);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i13 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i14);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i14);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i14 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i13, i14);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i13) {
        this.f12503yggfygwlhe = i13;
        super.setMaxHeight(i13);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i13) {
        this.f12504zdlpuopuiu = i13;
        super.setMaxWidth(i13);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f12504zdlpuopuiu = Integer.MAX_VALUE;
        this.f12503yggfygwlhe = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.PreferenceImageView, i13, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(vdvldrhtss.PreferenceImageView_maxWidth, Integer.MAX_VALUE));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(vdvldrhtss.PreferenceImageView_maxHeight, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }
}
