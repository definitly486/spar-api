package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends View implements SubtitleView.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private d5.iobyxmoadg f11798cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private float f11799esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f11800iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f11801jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private List f11802yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f11803zdlpuopuiu;

    public iobyxmoadg(Context context) {
        this(context, null);
    }

    private static x2.iobyxmoadg zoijcleaow(x2.iobyxmoadg iobyxmoadgVar) {
        x2.iobyxmoadg.zoijcleaow zoijcleaowVarRgvfuqvkyq = iobyxmoadgVar.iobyxmoadg().gtknphoqwx(-3.4028235E38f).draadjrbmk(Integer.MIN_VALUE).rgvfuqvkyq(null);
        if (iobyxmoadgVar.f120961gxszxtbevo == 0) {
            zoijcleaowVarRgvfuqvkyq.nufgyqmvbu(1.0f - iobyxmoadgVar.f120959eablkybsjg, 0);
        } else {
            zoijcleaowVarRgvfuqvkyq.nufgyqmvbu((-iobyxmoadgVar.f120959eablkybsjg) - 1.0f, 1);
        }
        int i13 = iobyxmoadgVar.f120963lqeggnwhkg;
        if (i13 == 0) {
            zoijcleaowVarRgvfuqvkyq.dxjokdxxww(2);
        } else if (i13 == 2) {
            zoijcleaowVarRgvfuqvkyq.dxjokdxxww(0);
        }
        return zoijcleaowVarRgvfuqvkyq.iobyxmoadg();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.f11802yggfygwlhe;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i13 = paddingBottom - paddingTop;
        float fNufgyqmvbu = iozdgvuglv.nufgyqmvbu(this.f11801jyumaefscl, this.f11800iwizpuwonk, height, i13);
        if (fNufgyqmvbu <= 0.0f) {
            return;
        }
        int size = list.size();
        int i14 = 0;
        while (i14 < size) {
            x2.iobyxmoadg iobyxmoadgVarZoijcleaow = (x2.iobyxmoadg) list.get(i14);
            if (iobyxmoadgVarZoijcleaow.f120967rgvfuqvkyq != Integer.MIN_VALUE) {
                iobyxmoadgVarZoijcleaow = zoijcleaow(iobyxmoadgVarZoijcleaow);
            }
            x2.iobyxmoadg iobyxmoadgVar = iobyxmoadgVarZoijcleaow;
            int i15 = paddingBottom;
            ((istkbnxepw) this.f11803zdlpuopuiu.get(i14)).zoijcleaow(iobyxmoadgVar, this.f11798cqumvgiudr, fNufgyqmvbu, iozdgvuglv.nufgyqmvbu(iobyxmoadgVar.f120955agtfadlqog, iobyxmoadgVar.f120965ojitshcjhn, height, i13), this.f11799esjtqupxsv, canvas, paddingLeft, paddingTop, width, i15);
            i14++;
            size = size;
            i13 = i13;
            paddingBottom = i15;
            width = width;
        }
    }

    @Override // androidx.media3.ui.SubtitleView.iobyxmoadg
    public void iobyxmoadg(List list, d5.iobyxmoadg iobyxmoadgVar, float f13, int i13, float f14) {
        this.f11802yggfygwlhe = list;
        this.f11798cqumvgiudr = iobyxmoadgVar;
        this.f11800iwizpuwonk = f13;
        this.f11801jyumaefscl = i13;
        this.f11799esjtqupxsv = f14;
        while (this.f11803zdlpuopuiu.size() < list.size()) {
            this.f11803zdlpuopuiu.add(new istkbnxepw(getContext()));
        }
        invalidate();
    }

    public iobyxmoadg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11803zdlpuopuiu = new ArrayList();
        this.f11802yggfygwlhe = Collections.emptyList();
        this.f11801jyumaefscl = 0;
        this.f11800iwizpuwonk = 0.0533f;
        this.f11798cqumvgiudr = d5.iobyxmoadg.f27055lqeggnwhkg;
        this.f11799esjtqupxsv = 0.08f;
    }
}
