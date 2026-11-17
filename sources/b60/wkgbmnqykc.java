package b60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import s40.dxjokdxxww;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TextView f15362iobyxmoadg;

    private wkgbmnqykc(TextView textView) {
        this.f15362iobyxmoadg = textView;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        if (view != null) {
            return new wkgbmnqykc((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static wkgbmnqykc ppxfxbqfkf(LayoutInflater layoutInflater) {
        return wkgbmnqykc(layoutInflater, null, false);
    }

    public static wkgbmnqykc wkgbmnqykc(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(dxjokdxxww.popup_advertisement, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.f15362iobyxmoadg;
    }
}
