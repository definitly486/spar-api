package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f8078zdlpuopuiu;

    public Guideline(Context context) {
        super(context);
        this.f8078zdlpuopuiu = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z13) {
        this.f8078zdlpuopuiu = z13;
    }

    public void setGuidelineBegin(int i13) {
        ConstraintLayout.zoijcleaow zoijcleaowVar = (ConstraintLayout.zoijcleaow) getLayoutParams();
        if (this.f8078zdlpuopuiu && zoijcleaowVar.f8020iobyxmoadg == i13) {
            return;
        }
        zoijcleaowVar.f8020iobyxmoadg = i13;
        setLayoutParams(zoijcleaowVar);
    }

    public void setGuidelineEnd(int i13) {
        ConstraintLayout.zoijcleaow zoijcleaowVar = (ConstraintLayout.zoijcleaow) getLayoutParams();
        if (this.f8078zdlpuopuiu && zoijcleaowVar.f8075zoijcleaow == i13) {
            return;
        }
        zoijcleaowVar.f8075zoijcleaow = i13;
        setLayoutParams(zoijcleaowVar);
    }

    public void setGuidelinePercent(float f13) {
        ConstraintLayout.zoijcleaow zoijcleaowVar = (ConstraintLayout.zoijcleaow) getLayoutParams();
        if (this.f8078zdlpuopuiu && zoijcleaowVar.f8048ppxfxbqfkf == f13) {
            return;
        }
        zoijcleaowVar.f8048ppxfxbqfkf = f13;
        setLayoutParams(zoijcleaowVar);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8078zdlpuopuiu = true;
        super.setVisibility(8);
    }
}
