package v40;

import android.content.Context;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes4.dex */
final class kcexrzcfyt implements tg.draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private FragmentContainerView f116001yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f116002zdlpuopuiu;

    public kcexrzcfyt(int i13) {
        this.f116002zdlpuopuiu = i13;
    }

    public final FragmentContainerView iobyxmoadg() {
        FragmentContainerView fragmentContainerView = this.f116001yggfygwlhe;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new IllegalStateException(("AndroidView has not created a container for " + this.f116002zdlpuopuiu + " yet").toString());
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView invoke(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(this.f116002zdlpuopuiu);
        this.f116001yggfygwlhe = fragmentContainerView;
        return fragmentContainerView;
    }
}
