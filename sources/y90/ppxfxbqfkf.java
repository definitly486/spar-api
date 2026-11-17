package y90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import m60.h;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f124213iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final h f124214ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final LinearLayout f124215wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final TextView f124216zoijcleaow;

    private ppxfxbqfkf(FrameLayout frameLayout, TextView textView, h hVar, LinearLayout linearLayout) {
        this.f124213iobyxmoadg = frameLayout;
        this.f124216zoijcleaow = textView;
        this.f124214ppxfxbqfkf = hVar;
        this.f124215wkgbmnqykc = linearLayout;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = q90.wkgbmnqykc.code;
        TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (textView != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = q90.wkgbmnqykc.copyToBuffer))) != null) {
            h hVarIobyxmoadg = h.iobyxmoadg(viewIobyxmoadg);
            int i14 = q90.wkgbmnqykc.dashBackground;
            LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i14);
            if (linearLayout != null) {
                return new ppxfxbqfkf((FrameLayout) view, textView, hVarIobyxmoadg, linearLayout);
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ppxfxbqfkf ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(q90.eablkybsjg.item_evropolis_dialog_coupon, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f124213iobyxmoadg;
    }
}
