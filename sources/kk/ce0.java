package kk;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ce0 extends androidx.recyclerview.widget.vdvldrhtss {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final la0 f56137btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final zc0 f56138draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public androidx.recyclerview.widget.yggfygwlhe f56139dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final float f56140eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public RecyclerView f56141gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final int f56142gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f56143iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final float f56144lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public androidx.recyclerview.widget.yggfygwlhe f56145nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int f56146ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public boolean f56147wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public boolean f56148zoijcleaow;

    public ce0(la0 snapListener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(snapListener, "snapListener");
        this.f56140eablkybsjg = 100.0f;
        this.f56142gxszxtbevo = -1;
        this.f56144lqeggnwhkg = -1.0f;
        this.f56138draadjrbmk = new zc0(this);
        this.f56143iobyxmoadg = 8388611;
        this.f56137btonecajqb = snapListener;
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    public final void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f56141gtknphoqwx;
        if (recyclerView2 != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView2);
            recyclerView2.r(this.f56138draadjrbmk);
        }
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            int i13 = this.f56143iobyxmoadg;
            if (i13 == 8388611 || i13 == 8388613) {
                this.f56148zoijcleaow = t1.ojitshcjhn.iobyxmoadg(Locale.getDefault()) == 1;
            }
            recyclerView.agtfadlqog(this.f56138draadjrbmk);
            this.f56141gtknphoqwx = recyclerView;
        } else {
            this.f56141gtknphoqwx = null;
        }
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.vdvldrhtss, androidx.recyclerview.widget.lereixgezr
    public final int[] calculateDistanceToFinalSnap(RecyclerView.rgvfuqvkyq layoutManager, View targetView) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetView, "targetView");
        if (this.f56143iobyxmoadg == 17) {
            int[] iArrCalculateDistanceToFinalSnap = super.calculateDistanceToFinalSnap(layoutManager, targetView);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iArrCalculateDistanceToFinalSnap);
            return iArrCalculateDistanceToFinalSnap;
        }
        int[] iArr = new int[2];
        if (layoutManager instanceof LinearLayoutManager) {
            if (layoutManager.pmvmpeiblj()) {
                boolean z13 = this.f56148zoijcleaow;
                if (!(z13 && this.f56143iobyxmoadg == 8388613) && (z13 || this.f56143iobyxmoadg != 8388611)) {
                    androidx.recyclerview.widget.yggfygwlhe horizontalHelper = getHorizontalHelper(layoutManager);
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(horizontalHelper);
                    int iWkgbmnqykc = horizontalHelper.wkgbmnqykc(targetView);
                    iArr[0] = iWkgbmnqykc >= horizontalHelper.nufgyqmvbu() - ((horizontalHelper.nufgyqmvbu() - horizontalHelper.dxjokdxxww()) / 2) ? horizontalHelper.wkgbmnqykc(targetView) - horizontalHelper.nufgyqmvbu() : iWkgbmnqykc - horizontalHelper.dxjokdxxww();
                    return iArr;
                }
                androidx.recyclerview.widget.yggfygwlhe horizontalHelper2 = getHorizontalHelper(layoutManager);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(horizontalHelper2);
                int iLqeggnwhkg = horizontalHelper2.lqeggnwhkg(targetView);
                if (iLqeggnwhkg >= horizontalHelper2.agtfadlqog() / 2) {
                    iLqeggnwhkg -= horizontalHelper2.agtfadlqog();
                }
                iArr[0] = iLqeggnwhkg;
                return iArr;
            }
            if (layoutManager.zynmafqrjb()) {
                if (this.f56143iobyxmoadg == 48) {
                    androidx.recyclerview.widget.yggfygwlhe verticalHelper = getVerticalHelper(layoutManager);
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(verticalHelper);
                    int iLqeggnwhkg2 = verticalHelper.lqeggnwhkg(targetView);
                    if (iLqeggnwhkg2 >= verticalHelper.agtfadlqog() / 2) {
                        iLqeggnwhkg2 -= verticalHelper.agtfadlqog();
                    }
                    iArr[1] = iLqeggnwhkg2;
                    return iArr;
                }
                androidx.recyclerview.widget.yggfygwlhe verticalHelper2 = getVerticalHelper(layoutManager);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(verticalHelper2);
                int iWkgbmnqykc2 = verticalHelper2.wkgbmnqykc(targetView);
                iArr[1] = iWkgbmnqykc2 >= verticalHelper2.nufgyqmvbu() - ((verticalHelper2.nufgyqmvbu() - verticalHelper2.dxjokdxxww()) / 2) ? verticalHelper2.wkgbmnqykc(targetView) - verticalHelper2.nufgyqmvbu() : iWkgbmnqykc2 - verticalHelper2.dxjokdxxww();
            }
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    @Override // androidx.recyclerview.widget.lereixgezr
    public final int[] calculateScrollDistance(int i13, int i14) {
        float width;
        float f13;
        int i15;
        if (this.f56141gtknphoqwx == null || ((this.f56145nufgyqmvbu == null && this.f56139dxjokdxxww == null) || (this.f56142gxszxtbevo == -1 && this.f56144lqeggnwhkg == -1.0f))) {
            int[] iArrCalculateScrollDistance = super.calculateScrollDistance(i13, i14);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCalculateScrollDistance, "super.calculateScrollDis…nce(velocityX, velocityY)");
            return iArrCalculateScrollDistance;
        }
        RecyclerView recyclerView = this.f56141gtknphoqwx;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView);
        Scroller scroller = new Scroller(recyclerView.getContext(), new DecelerateInterpolator());
        if (this.f56144lqeggnwhkg == -1.0f) {
            i15 = this.f56142gxszxtbevo;
            if (i15 == -1) {
                i15 = Integer.MAX_VALUE;
            }
        } else {
            if (this.f56145nufgyqmvbu != null) {
                RecyclerView recyclerView2 = this.f56141gtknphoqwx;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView2);
                width = recyclerView2.getHeight();
                f13 = this.f56144lqeggnwhkg;
            } else if (this.f56139dxjokdxxww != null) {
                RecyclerView recyclerView3 = this.f56141gtknphoqwx;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView3);
                width = recyclerView3.getWidth();
                f13 = this.f56144lqeggnwhkg;
            } else {
                i15 = Integer.MAX_VALUE;
            }
            i15 = (int) (width * f13);
        }
        int i16 = i15;
        int i17 = -i16;
        scroller.fling(0, 0, i13, i14, i17, i16, i17, i16);
        return new int[]{scroller.getFinalX(), scroller.getFinalY()};
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    public final RecyclerView.pmvmpeiblj createScroller(RecyclerView.rgvfuqvkyq layoutManager) {
        RecyclerView recyclerView;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        if (!(layoutManager instanceof RecyclerView.pmvmpeiblj.zoijcleaow) || (recyclerView = this.f56141gtknphoqwx) == null) {
            return null;
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView);
        return new qb0(this, recyclerView.getContext());
    }

    public final View dxjokdxxww(RecyclerView.rgvfuqvkyq lm2, boolean z13) {
        View viewNufgyqmvbu;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lm2, "lm");
        int i13 = this.f56143iobyxmoadg;
        if (i13 != 17) {
            if (i13 == 48) {
                androidx.recyclerview.widget.yggfygwlhe verticalHelper = getVerticalHelper(lm2);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(verticalHelper);
                viewNufgyqmvbu = nufgyqmvbu(lm2, verticalHelper, 8388611, z13);
            } else if (i13 == 80) {
                androidx.recyclerview.widget.yggfygwlhe verticalHelper2 = getVerticalHelper(lm2);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(verticalHelper2);
                viewNufgyqmvbu = nufgyqmvbu(lm2, verticalHelper2, 8388613, z13);
            } else if (i13 == 8388611) {
                androidx.recyclerview.widget.yggfygwlhe horizontalHelper = getHorizontalHelper(lm2);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(horizontalHelper);
                viewNufgyqmvbu = nufgyqmvbu(lm2, horizontalHelper, 8388611, z13);
            } else if (i13 != 8388613) {
                viewNufgyqmvbu = null;
            } else {
                androidx.recyclerview.widget.yggfygwlhe horizontalHelper2 = getHorizontalHelper(lm2);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(horizontalHelper2);
                viewNufgyqmvbu = nufgyqmvbu(lm2, horizontalHelper2, 8388613, z13);
            }
        } else if (lm2.pmvmpeiblj()) {
            androidx.recyclerview.widget.yggfygwlhe horizontalHelper3 = getHorizontalHelper(lm2);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(horizontalHelper3);
            viewNufgyqmvbu = nufgyqmvbu(lm2, horizontalHelper3, 17, z13);
        } else {
            androidx.recyclerview.widget.yggfygwlhe verticalHelper3 = getVerticalHelper(lm2);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(verticalHelper3);
            viewNufgyqmvbu = nufgyqmvbu(lm2, verticalHelper3, 17, z13);
        }
        if (viewNufgyqmvbu == null) {
            this.f56146ppxfxbqfkf = -1;
            return viewNufgyqmvbu;
        }
        RecyclerView recyclerView = this.f56141gtknphoqwx;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView);
        this.f56146ppxfxbqfkf = recyclerView.yfnezrywwk(viewNufgyqmvbu);
        return viewNufgyqmvbu;
    }

    @Override // androidx.recyclerview.widget.vdvldrhtss, androidx.recyclerview.widget.lereixgezr
    public final View findSnapView(RecyclerView.rgvfuqvkyq lm2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lm2, "lm");
        return dxjokdxxww(lm2, true);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    public final androidx.recyclerview.widget.yggfygwlhe getHorizontalHelper(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        androidx.recyclerview.widget.yggfygwlhe yggfygwlheVar = this.f56139dxjokdxxww;
        if (yggfygwlheVar != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yggfygwlheVar);
            if (yggfygwlheVar.gtknphoqwx() != rgvfuqvkyqVar) {
                this.f56139dxjokdxxww = androidx.recyclerview.widget.yggfygwlhe.iobyxmoadg(rgvfuqvkyqVar);
            }
        } else {
            this.f56139dxjokdxxww = androidx.recyclerview.widget.yggfygwlhe.iobyxmoadg(rgvfuqvkyqVar);
        }
        return this.f56139dxjokdxxww;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    public final androidx.recyclerview.widget.yggfygwlhe getVerticalHelper(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        androidx.recyclerview.widget.yggfygwlhe yggfygwlheVar = this.f56145nufgyqmvbu;
        if (yggfygwlheVar != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yggfygwlheVar);
            if (yggfygwlheVar.gtknphoqwx() != rgvfuqvkyqVar) {
                this.f56145nufgyqmvbu = androidx.recyclerview.widget.yggfygwlhe.ppxfxbqfkf(rgvfuqvkyqVar);
            }
        } else {
            this.f56145nufgyqmvbu = androidx.recyclerview.widget.yggfygwlhe.ppxfxbqfkf(rgvfuqvkyqVar);
        }
        return this.f56145nufgyqmvbu;
    }

    public final View nufgyqmvbu(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, androidx.recyclerview.widget.yggfygwlhe yggfygwlheVar, int i13, boolean z13) {
        int iAbs;
        View view = null;
        if (rgvfuqvkyqVar.vipkmwdibw() != 0 && (rgvfuqvkyqVar instanceof LinearLayoutManager)) {
            boolean z14 = true;
            if (z13) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) rgvfuqvkyqVar;
                if ((linearLayoutManager.H0() || this.f56143iobyxmoadg != 8388611) && ((!linearLayoutManager.H0() || this.f56143iobyxmoadg != 8388613) && ((linearLayoutManager.H0() || this.f56143iobyxmoadg != 48) && (!linearLayoutManager.H0() || this.f56143iobyxmoadg != 80))) ? !(this.f56143iobyxmoadg != 17 ? linearLayoutManager.o0() != 0 : linearLayoutManager.o0() != 0 && linearLayoutManager.t0() != linearLayoutManager.iobyxmoadg() - 1) : linearLayoutManager.t0() == linearLayoutManager.iobyxmoadg() - 1) {
                    return null;
                }
            }
            int iOjitshcjhn = rgvfuqvkyqVar.okpsazkaxt() ? (yggfygwlheVar.ojitshcjhn() / 2) + yggfygwlheVar.agtfadlqog() : yggfygwlheVar.nufgyqmvbu() / 2;
            boolean z15 = (i13 == 8388611 && !this.f56148zoijcleaow) || (i13 == 8388613 && this.f56148zoijcleaow);
            if ((i13 != 8388611 || !this.f56148zoijcleaow) && (i13 != 8388613 || this.f56148zoijcleaow)) {
                z14 = false;
            }
            int iVipkmwdibw = ((LinearLayoutManager) rgvfuqvkyqVar).vipkmwdibw();
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < iVipkmwdibw; i15++) {
                View viewRibwqtqdhb = rgvfuqvkyqVar.ribwqtqdhb(i15);
                if (z15) {
                    iAbs = Math.abs(yggfygwlheVar.lqeggnwhkg(viewRibwqtqdhb));
                } else if (z14) {
                    iAbs = Math.abs(yggfygwlheVar.wkgbmnqykc(viewRibwqtqdhb) - yggfygwlheVar.nufgyqmvbu());
                } else {
                    iAbs = Math.abs(((yggfygwlheVar.eablkybsjg(viewRibwqtqdhb) / 2) + yggfygwlheVar.lqeggnwhkg(viewRibwqtqdhb)) - iOjitshcjhn);
                }
                if (iAbs < i14) {
                    view = viewRibwqtqdhb;
                    i14 = iAbs;
                }
            }
        }
        return view;
    }
}
