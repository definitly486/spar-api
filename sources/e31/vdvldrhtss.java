package e31;

import android.content.Context;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes5.dex */
final class vdvldrhtss implements tg.draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private FragmentContainerView f30378yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f30379zdlpuopuiu;

    public vdvldrhtss(int i13) {
        this.f30379zdlpuopuiu = i13;
    }

    public final FragmentContainerView iobyxmoadg() {
        FragmentContainerView fragmentContainerView = this.f30378yggfygwlhe;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new IllegalStateException(("AndroidView has not created a container for " + this.f30379zdlpuopuiu + " yet").toString());
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView invoke(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(this.f30379zdlpuopuiu);
        this.f30378yggfygwlhe = fragmentContainerView;
        return fragmentContainerView;
    }
}
