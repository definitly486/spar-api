package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final int f22407iobyxmoadg;

    class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f22408zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(int i13, CarouselLayoutManager carouselLayoutManager) {
            super(i13, null);
            this.f22408zoijcleaow = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int btonecajqb() {
            return 0;
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        public void draadjrbmk(View view, Rect rect, float f13, float f14) {
            view.offsetTopAndBottom((int) (f14 - (rect.top + f13)));
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int dxjokdxxww() {
            return btonecajqb();
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int eablkybsjg() {
            return this.f22408zoijcleaow.zfvoamnweg();
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        public void gtknphoqwx(View view, int i13, int i14) {
            int iLqeggnwhkg = lqeggnwhkg();
            this.f22408zoijcleaow.mhtqkkgtqm(view, iLqeggnwhkg, i13, iLqeggnwhkg + wflxmlrfwp(view), i14);
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int gxszxtbevo() {
            return eablkybsjg();
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int lqeggnwhkg() {
            return this.f22408zoijcleaow.getPaddingLeft();
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int nufgyqmvbu() {
            return this.f22408zoijcleaow.iwxlajgraz() - this.f22408zoijcleaow.getPaddingRight();
        }

        int wflxmlrfwp(View view) {
            RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
            return this.f22408zoijcleaow.uwvvkdfqfp(view) + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).leftMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).rightMargin;
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        public float wkgbmnqykc(RecyclerView.vdvldrhtss vdvldrhtssVar) {
            return ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).topMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).bottomMargin;
        }
    }

    class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f22409zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(int i13, CarouselLayoutManager carouselLayoutManager) {
            super(i13, null);
            this.f22409zoijcleaow = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int btonecajqb() {
            return this.f22409zoijcleaow.getPaddingTop();
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        public void draadjrbmk(View view, Rect rect, float f13, float f14) {
            view.offsetLeftAndRight((int) (f14 - (rect.left + f13)));
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int dxjokdxxww() {
            return this.f22409zoijcleaow.U0() ? nufgyqmvbu() : lqeggnwhkg();
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int eablkybsjg() {
            return this.f22409zoijcleaow.zfvoamnweg() - this.f22409zoijcleaow.getPaddingBottom();
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        public void gtknphoqwx(View view, int i13, int i14) {
            int iBtonecajqb = btonecajqb();
            this.f22409zoijcleaow.mhtqkkgtqm(view, i13, iBtonecajqb, i14, iBtonecajqb + wflxmlrfwp(view));
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int gxszxtbevo() {
            return this.f22409zoijcleaow.U0() ? lqeggnwhkg() : nufgyqmvbu();
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int lqeggnwhkg() {
            return 0;
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        int nufgyqmvbu() {
            return this.f22409zoijcleaow.iwxlajgraz();
        }

        int wflxmlrfwp(View view) {
            RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
            return this.f22409zoijcleaow.czzsidtyhn(view) + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).topMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).bottomMargin;
        }

        @Override // com.google.android.material.carousel.ppxfxbqfkf
        public float wkgbmnqykc(RecyclerView.vdvldrhtss vdvldrhtssVar) {
            return ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).rightMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).leftMargin;
        }
    }

    /* synthetic */ ppxfxbqfkf(int i13, iobyxmoadg iobyxmoadgVar) {
        this(i13);
    }

    private static ppxfxbqfkf iobyxmoadg(CarouselLayoutManager carouselLayoutManager) {
        return new zoijcleaow(0, carouselLayoutManager);
    }

    private static ppxfxbqfkf ppxfxbqfkf(CarouselLayoutManager carouselLayoutManager) {
        return new iobyxmoadg(1, carouselLayoutManager);
    }

    static ppxfxbqfkf zoijcleaow(CarouselLayoutManager carouselLayoutManager, int i13) {
        if (i13 == 0) {
            return iobyxmoadg(carouselLayoutManager);
        }
        if (i13 == 1) {
            return ppxfxbqfkf(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    abstract int btonecajqb();

    abstract void draadjrbmk(View view, Rect rect, float f13, float f14);

    abstract int dxjokdxxww();

    abstract int eablkybsjg();

    abstract void gtknphoqwx(View view, int i13, int i14);

    abstract int gxszxtbevo();

    abstract int lqeggnwhkg();

    abstract int nufgyqmvbu();

    abstract float wkgbmnqykc(RecyclerView.vdvldrhtss vdvldrhtssVar);

    private ppxfxbqfkf(int i13) {
        this.f22407iobyxmoadg = i13;
    }
}
