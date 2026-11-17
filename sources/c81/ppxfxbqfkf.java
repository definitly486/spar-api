package c81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import z41.hszhottldk;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f19243iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final hszhottldk f19244ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final LinearLayout f19245wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final TextView f19246zoijcleaow;

    private ppxfxbqfkf(FrameLayout frameLayout, TextView textView, hszhottldk hszhottldkVar, LinearLayout linearLayout) {
        this.f19243iobyxmoadg = frameLayout;
        this.f19246zoijcleaow = textView;
        this.f19244ppxfxbqfkf = hszhottldkVar;
        this.f19245wkgbmnqykc = linearLayout;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = u71.wkgbmnqykc.code;
        TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (textView != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = u71.wkgbmnqykc.copyToBuffer))) != null) {
            hszhottldk hszhottldkVarIobyxmoadg = hszhottldk.iobyxmoadg(viewIobyxmoadg);
            int i14 = u71.wkgbmnqykc.dashBackground;
            LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i14);
            if (linearLayout != null) {
                return new ppxfxbqfkf((FrameLayout) view, textView, hszhottldkVarIobyxmoadg, linearLayout);
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ppxfxbqfkf ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(u71.eablkybsjg.item_evropolis_dialog_coupon_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f19243iobyxmoadg;
    }
}
