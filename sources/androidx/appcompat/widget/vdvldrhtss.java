package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class vdvldrhtss extends SeekBar {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final oxmwwwfdhm f3400zdlpuopuiu;

    public vdvldrhtss(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3400zdlpuopuiu.nufgyqmvbu();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f3400zdlpuopuiu.dxjokdxxww();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3400zdlpuopuiu.lqeggnwhkg(canvas);
    }

    public vdvldrhtss(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        wypolnanlu.iobyxmoadg(this, getContext());
        oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(this);
        this.f3400zdlpuopuiu = oxmwwwfdhmVar;
        oxmwwwfdhmVar.ppxfxbqfkf(attributeSet, i13);
    }
}
