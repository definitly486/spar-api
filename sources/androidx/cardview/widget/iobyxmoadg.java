package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class iobyxmoadg implements ppxfxbqfkf {
    iobyxmoadg() {
    }

    private wkgbmnqykc rgvfuqvkyq(zoijcleaow zoijcleaowVar) {
        return (wkgbmnqykc) zoijcleaowVar.wkgbmnqykc();
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public void agtfadlqog(zoijcleaow zoijcleaowVar, ColorStateList colorStateList) {
        rgvfuqvkyq(zoijcleaowVar).gxszxtbevo(colorStateList);
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public void btonecajqb(zoijcleaow zoijcleaowVar) {
        ojitshcjhn(zoijcleaowVar, wkgbmnqykc(zoijcleaowVar));
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public void draadjrbmk() {
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public float dxjokdxxww(zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar.gxszxtbevo().getElevation();
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public ColorStateList eablkybsjg(zoijcleaow zoijcleaowVar) {
        return rgvfuqvkyq(zoijcleaowVar).zoijcleaow();
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public void gtknphoqwx(zoijcleaow zoijcleaowVar) {
        if (!zoijcleaowVar.ppxfxbqfkf()) {
            zoijcleaowVar.iobyxmoadg(0, 0, 0, 0);
            return;
        }
        float fWkgbmnqykc = wkgbmnqykc(zoijcleaowVar);
        float fZoijcleaow = zoijcleaow(zoijcleaowVar);
        int iCeil = (int) Math.ceil(eablkybsjg.iobyxmoadg(fWkgbmnqykc, fZoijcleaow, zoijcleaowVar.eablkybsjg()));
        int iCeil2 = (int) Math.ceil(eablkybsjg.zoijcleaow(fWkgbmnqykc, fZoijcleaow, zoijcleaowVar.eablkybsjg()));
        zoijcleaowVar.iobyxmoadg(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public float gxszxtbevo(zoijcleaow zoijcleaowVar) {
        return zoijcleaow(zoijcleaowVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public void iobyxmoadg(zoijcleaow zoijcleaowVar, float f13) {
        rgvfuqvkyq(zoijcleaowVar).nufgyqmvbu(f13);
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public void lqeggnwhkg(zoijcleaow zoijcleaowVar) {
        ojitshcjhn(zoijcleaowVar, wkgbmnqykc(zoijcleaowVar));
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public void nufgyqmvbu(zoijcleaow zoijcleaowVar, Context context, ColorStateList colorStateList, float f13, float f14, float f15) {
        zoijcleaowVar.zoijcleaow(new wkgbmnqykc(colorStateList, f13));
        View viewGxszxtbevo = zoijcleaowVar.gxszxtbevo();
        viewGxszxtbevo.setClipToOutline(true);
        viewGxszxtbevo.setElevation(f14);
        ojitshcjhn(zoijcleaowVar, f15);
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public void ojitshcjhn(zoijcleaow zoijcleaowVar, float f13) {
        rgvfuqvkyq(zoijcleaowVar).lqeggnwhkg(f13, zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.eablkybsjg());
        gtknphoqwx(zoijcleaowVar);
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public void ppxfxbqfkf(zoijcleaow zoijcleaowVar, float f13) {
        zoijcleaowVar.gxszxtbevo().setElevation(f13);
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public float wflxmlrfwp(zoijcleaow zoijcleaowVar) {
        return zoijcleaow(zoijcleaowVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public float wkgbmnqykc(zoijcleaow zoijcleaowVar) {
        return rgvfuqvkyq(zoijcleaowVar).ppxfxbqfkf();
    }

    @Override // androidx.cardview.widget.ppxfxbqfkf
    public float zoijcleaow(zoijcleaow zoijcleaowVar) {
        return rgvfuqvkyq(zoijcleaowVar).wkgbmnqykc();
    }
}
