package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private lmojexxdyd f3140zdlpuopuiu;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        lmojexxdyd lmojexxdydVar = this.f3140zdlpuopuiu;
        if (lmojexxdydVar != null) {
            lmojexxdydVar.iobyxmoadg(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(lmojexxdyd lmojexxdydVar) {
    }
}
