package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ojitshcjhn f3088zdlpuopuiu;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        Bitmap bitmapZoijcleaow = this.f3088zdlpuopuiu.zoijcleaow();
        if (bitmapZoijcleaow != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapZoijcleaow.getWidth() * getNumStars(), i13, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        wypolnanlu.iobyxmoadg(this, getContext());
        ojitshcjhn ojitshcjhnVar = new ojitshcjhn(this);
        this.f3088zdlpuopuiu = ojitshcjhnVar;
        ojitshcjhnVar.ppxfxbqfkf(attributeSet, i13);
    }
}
