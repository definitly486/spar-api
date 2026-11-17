package kk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class v4 extends View {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final Paint f58943iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final float f58944jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f58945yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final int f58946zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(Context context, int i13, int i14) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f58946zdlpuopuiu = 10;
        Paint paint = new Paint();
        this.f58943iwizpuwonk = paint;
        this.f58946zdlpuopuiu = i13;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i14);
        this.f58944jyumaefscl = (this.f58945yggfygwlhe / 2) + i13;
    }

    public final int getStrokeWidth() {
        return this.f58945yggfygwlhe;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(canvas, "canvas");
        super.onDraw(canvas);
        float f13 = this.f58944jyumaefscl;
        canvas.drawCircle(f13, f13, this.f58946zdlpuopuiu, this.f58943iwizpuwonk);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int i15 = (this.f58946zdlpuopuiu * 2) + this.f58945yggfygwlhe;
        setMeasuredDimension(i15, i15);
    }

    public final void setStrokeWidth(int i13) {
        this.f58945yggfygwlhe = i13;
    }
}
