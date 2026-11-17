package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu extends RecyclerView.iozdgvuglv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f12510eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Drawable f12511iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SparseArray f12512ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f12513wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ColorStateList f12514zoijcleaow;

    nufgyqmvbu(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f12512ppxfxbqfkf = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i13 = draadjrbmk.icon_frame;
        sparseArray.put(i13, view.findViewById(i13));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f12511iobyxmoadg = view.getBackground();
        if (textView != null) {
            this.f12514zoijcleaow = textView.getTextColors();
        }
    }

    void eablkybsjg() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f12511iobyxmoadg;
        if (background != drawable) {
            jhduphickx.weqkydbzbr(this.itemView, drawable);
        }
        TextView textView = (TextView) zoijcleaow(R.id.title);
        if (textView == null || this.f12514zoijcleaow == null || textView.getTextColors().equals(this.f12514zoijcleaow)) {
            return;
        }
        textView.setTextColor(this.f12514zoijcleaow);
    }

    public void gxszxtbevo(boolean z13) {
        this.f12513wkgbmnqykc = z13;
    }

    public void lqeggnwhkg(boolean z13) {
        this.f12510eablkybsjg = z13;
    }

    public boolean ppxfxbqfkf() {
        return this.f12513wkgbmnqykc;
    }

    public boolean wkgbmnqykc() {
        return this.f12510eablkybsjg;
    }

    public View zoijcleaow(int i13) {
        View view = (View) this.f12512ppxfxbqfkf.get(i13);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i13);
        if (viewFindViewById != null) {
            this.f12512ppxfxbqfkf.put(i13, viewFindViewById);
        }
        return viewFindViewById;
    }
}
