package e9;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f30972iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f30973zoijcleaow;

    public zoijcleaow(int i13, boolean z13) {
        this.f30972iobyxmoadg = i13;
        this.f30973zoijcleaow = z13;
    }

    @Override // e9.wkgbmnqykc
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Drawable drawable, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        Drawable drawableEablkybsjg = iobyxmoadgVar.eablkybsjg();
        if (drawableEablkybsjg == null) {
            drawableEablkybsjg = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableEablkybsjg, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f30973zoijcleaow);
        transitionDrawable.startTransition(this.f30972iobyxmoadg);
        iobyxmoadgVar.wkgbmnqykc(transitionDrawable);
        return true;
    }
}
