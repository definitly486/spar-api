package w1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends ClickableSpan {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f118499jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zdlpuopuiu f118500yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f118501zdlpuopuiu;

    public iobyxmoadg(int i13, zdlpuopuiu zdlpuopuiuVar, int i14) {
        this.f118501zdlpuopuiu = i13;
        this.f118500yggfygwlhe = zdlpuopuiuVar;
        this.f118499jyumaefscl = i14;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f118501zdlpuopuiu);
        this.f118500yggfygwlhe.jlmebxxoox(this.f118499jyumaefscl, bundle);
    }
}
