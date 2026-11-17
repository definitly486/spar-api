package nf1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import mf1.wkgbmnqykc;
import ru.myspar.proloyalty.legacy.presentation.view.SwitchableTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f70028iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SwitchableTextView f70029zoijcleaow;

    private ppxfxbqfkf(FrameLayout frameLayout, SwitchableTextView switchableTextView) {
        this.f70028iobyxmoadg = frameLayout;
        this.f70029zoijcleaow = switchableTextView;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        int i13 = mf1.ppxfxbqfkf.stvAutoRenewalSubscription;
        SwitchableTextView switchableTextView = (SwitchableTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (switchableTextView != null) {
            return new ppxfxbqfkf((FrameLayout) view, switchableTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ppxfxbqfkf ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(wkgbmnqykc.item_user_subscription_setting_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f70028iobyxmoadg;
    }
}
