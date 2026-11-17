package b60;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import s40.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f15358iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final TextView f15359ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextView f15360wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f15361zoijcleaow;

    private ppxfxbqfkf(LinearLayout linearLayout, View view, TextView textView, TextView textView2) {
        this.f15358iobyxmoadg = linearLayout;
        this.f15361zoijcleaow = view;
        this.f15359ppxfxbqfkf = textView;
        this.f15360wkgbmnqykc = textView2;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        int i13 = nufgyqmvbu.curtain;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            i13 = nufgyqmvbu.header;
            TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (textView != null) {
                i13 = nufgyqmvbu.message;
                TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textView2 != null) {
                    return new ppxfxbqfkf((LinearLayout) view, viewIobyxmoadg, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f15358iobyxmoadg;
    }
}
