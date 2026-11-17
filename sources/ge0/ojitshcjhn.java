package ge0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class ojitshcjhn extends ViewOutlineProvider {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f37000iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f37001ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f37002zoijcleaow;

    public ojitshcjhn(int i13, int i14, float f13) {
        this.f37000iobyxmoadg = i13;
        this.f37002zoijcleaow = i14;
        this.f37001ppxfxbqfkf = f13;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outline, "outline");
        outline.setRoundRect(0, 0, this.f37000iobyxmoadg, this.f37002zoijcleaow, this.f37001ppxfxbqfkf);
    }
}
