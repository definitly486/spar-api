package y90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TextView f124217iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final TextView f124218zoijcleaow;

    private wkgbmnqykc(TextView textView, TextView textView2) {
        this.f124217iobyxmoadg = textView;
        this.f124218zoijcleaow = textView2;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new wkgbmnqykc(textView, textView);
    }

    public static wkgbmnqykc ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(q90.eablkybsjg.item_evropolis_dialog_instruction, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.f124217iobyxmoadg;
    }
}
