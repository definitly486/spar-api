package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import lereixgezr.tbqsvytpvh;

/* JADX INFO: loaded from: classes.dex */
abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    Size f4147iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg f4148ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f4149wkgbmnqykc = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    FrameLayout f4150zoijcleaow;

    interface iobyxmoadg {
        void iobyxmoadg();
    }

    dxjokdxxww(FrameLayout frameLayout, eablkybsjg eablkybsjgVar) {
        this.f4150zoijcleaow = frameLayout;
        this.f4148ppxfxbqfkf = eablkybsjgVar;
    }

    abstract com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww();

    abstract void eablkybsjg();

    void gxszxtbevo() {
        this.f4149wkgbmnqykc = true;
        nufgyqmvbu();
    }

    Bitmap iobyxmoadg() {
        Bitmap bitmapPpxfxbqfkf = ppxfxbqfkf();
        if (bitmapPpxfxbqfkf == null) {
            return null;
        }
        return this.f4148ppxfxbqfkf.iobyxmoadg(bitmapPpxfxbqfkf, new Size(this.f4150zoijcleaow.getWidth(), this.f4150zoijcleaow.getHeight()), this.f4150zoijcleaow.getLayoutDirection());
    }

    abstract void lqeggnwhkg(tbqsvytpvh tbqsvytpvhVar, iobyxmoadg iobyxmoadgVar);

    void nufgyqmvbu() {
        View viewZoijcleaow = zoijcleaow();
        if (viewZoijcleaow == null || !this.f4149wkgbmnqykc) {
            return;
        }
        this.f4148ppxfxbqfkf.kcexrzcfyt(new Size(this.f4150zoijcleaow.getWidth(), this.f4150zoijcleaow.getHeight()), this.f4150zoijcleaow.getLayoutDirection(), viewZoijcleaow);
    }

    abstract Bitmap ppxfxbqfkf();

    abstract void wkgbmnqykc();

    abstract View zoijcleaow();
}
