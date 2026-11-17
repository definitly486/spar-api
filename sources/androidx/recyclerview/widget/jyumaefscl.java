package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class jyumaefscl extends lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private yggfygwlhe f13025iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private yggfygwlhe f13026zoijcleaow;

    class iobyxmoadg extends rgvfuqvkyq {
        iobyxmoadg(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.rgvfuqvkyq
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.rgvfuqvkyq
        protected int calculateTimeForScrolling(int i13) {
            return Math.min(100, super.calculateTimeForScrolling(i13));
        }

        @Override // androidx.recyclerview.widget.rgvfuqvkyq, androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
        protected void onTargetFound(View view, RecyclerView.zynmafqrjb zynmafqrjbVar, RecyclerView.pmvmpeiblj.iobyxmoadg iobyxmoadgVar) {
            jyumaefscl jyumaefsclVar = jyumaefscl.this;
            int[] iArrCalculateDistanceToFinalSnap = jyumaefsclVar.calculateDistanceToFinalSnap(jyumaefsclVar.mRecyclerView.getLayoutManager(), view);
            int i13 = iArrCalculateDistanceToFinalSnap[0];
            int i14 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i13), Math.abs(i14)));
            if (iCalculateTimeForDeceleration > 0) {
                iobyxmoadgVar.wkgbmnqykc(i13, i14, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private View eablkybsjg(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, yggfygwlhe yggfygwlheVar) {
        int iVipkmwdibw = rgvfuqvkyqVar.vipkmwdibw();
        View view = null;
        if (iVipkmwdibw == 0) {
            return null;
        }
        int iAgtfadlqog = yggfygwlheVar.agtfadlqog() + (yggfygwlheVar.ojitshcjhn() / 2);
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < iVipkmwdibw; i14++) {
            View viewRibwqtqdhb = rgvfuqvkyqVar.ribwqtqdhb(i14);
            int iAbs = Math.abs((yggfygwlheVar.lqeggnwhkg(viewRibwqtqdhb) + (yggfygwlheVar.eablkybsjg(viewRibwqtqdhb) / 2)) - iAgtfadlqog);
            if (iAbs < i13) {
                view = viewRibwqtqdhb;
                i13 = iAbs;
            }
        }
        return view;
    }

    private yggfygwlhe getHorizontalHelper(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        yggfygwlhe yggfygwlheVar = this.f13026zoijcleaow;
        if (yggfygwlheVar == null || yggfygwlheVar.f13151iobyxmoadg != rgvfuqvkyqVar) {
            this.f13026zoijcleaow = yggfygwlhe.iobyxmoadg(rgvfuqvkyqVar);
        }
        return this.f13026zoijcleaow;
    }

    private yggfygwlhe getVerticalHelper(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        yggfygwlhe yggfygwlheVar = this.f13025iobyxmoadg;
        if (yggfygwlheVar == null || yggfygwlheVar.f13151iobyxmoadg != rgvfuqvkyqVar) {
            this.f13025iobyxmoadg = yggfygwlhe.ppxfxbqfkf(rgvfuqvkyqVar);
        }
        return this.f13025iobyxmoadg;
    }

    private yggfygwlhe gxszxtbevo(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        if (rgvfuqvkyqVar.zynmafqrjb()) {
            return getVerticalHelper(rgvfuqvkyqVar);
        }
        if (rgvfuqvkyqVar.pmvmpeiblj()) {
            return getHorizontalHelper(rgvfuqvkyqVar);
        }
        return null;
    }

    private boolean lqeggnwhkg(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14) {
        if (rgvfuqvkyqVar.pmvmpeiblj()) {
            return i13 > 0;
        }
        return i14 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean nufgyqmvbu(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        PointF pointFZoijcleaow;
        int iIobyxmoadg = rgvfuqvkyqVar.iobyxmoadg();
        if (!(rgvfuqvkyqVar instanceof RecyclerView.pmvmpeiblj.zoijcleaow) || (pointFZoijcleaow = ((RecyclerView.pmvmpeiblj.zoijcleaow) rgvfuqvkyqVar).zoijcleaow(iIobyxmoadg - 1)) == null) {
            return false;
        }
        return pointFZoijcleaow.x < 0.0f || pointFZoijcleaow.y < 0.0f;
    }

    private int wkgbmnqykc(View view, yggfygwlhe yggfygwlheVar) {
        return (yggfygwlheVar.lqeggnwhkg(view) + (yggfygwlheVar.eablkybsjg(view) / 2)) - (yggfygwlheVar.agtfadlqog() + (yggfygwlheVar.ojitshcjhn() / 2));
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    public int[] calculateDistanceToFinalSnap(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, View view) {
        int[] iArr = new int[2];
        if (rgvfuqvkyqVar.pmvmpeiblj()) {
            iArr[0] = wkgbmnqykc(view, getHorizontalHelper(rgvfuqvkyqVar));
        } else {
            iArr[0] = 0;
        }
        if (rgvfuqvkyqVar.zynmafqrjb()) {
            iArr[1] = wkgbmnqykc(view, getVerticalHelper(rgvfuqvkyqVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    protected RecyclerView.pmvmpeiblj createScroller(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        if (rgvfuqvkyqVar instanceof RecyclerView.pmvmpeiblj.zoijcleaow) {
            return new iobyxmoadg(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    public View findSnapView(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        if (rgvfuqvkyqVar.zynmafqrjb()) {
            return eablkybsjg(rgvfuqvkyqVar, getVerticalHelper(rgvfuqvkyqVar));
        }
        if (rgvfuqvkyqVar.pmvmpeiblj()) {
            return eablkybsjg(rgvfuqvkyqVar, getHorizontalHelper(rgvfuqvkyqVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    public int findTargetSnapPosition(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14) {
        yggfygwlhe yggfygwlheVarGxszxtbevo;
        int iIobyxmoadg = rgvfuqvkyqVar.iobyxmoadg();
        if (iIobyxmoadg == 0 || (yggfygwlheVarGxszxtbevo = gxszxtbevo(rgvfuqvkyqVar)) == null) {
            return -1;
        }
        int iVipkmwdibw = rgvfuqvkyqVar.vipkmwdibw();
        View view = null;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i17 = 0; i17 < iVipkmwdibw; i17++) {
            View viewRibwqtqdhb = rgvfuqvkyqVar.ribwqtqdhb(i17);
            if (viewRibwqtqdhb != null) {
                int iWkgbmnqykc = wkgbmnqykc(viewRibwqtqdhb, yggfygwlheVarGxszxtbevo);
                if (iWkgbmnqykc <= 0 && iWkgbmnqykc > i16) {
                    view2 = viewRibwqtqdhb;
                    i16 = iWkgbmnqykc;
                }
                if (iWkgbmnqykc >= 0 && iWkgbmnqykc < i15) {
                    view = viewRibwqtqdhb;
                    i15 = iWkgbmnqykc;
                }
            }
        }
        boolean zLqeggnwhkg = lqeggnwhkg(rgvfuqvkyqVar, i13, i14);
        if (zLqeggnwhkg && view != null) {
            return rgvfuqvkyqVar.lrnfpwlwnk(view);
        }
        if (!zLqeggnwhkg && view2 != null) {
            return rgvfuqvkyqVar.lrnfpwlwnk(view2);
        }
        if (zLqeggnwhkg) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iLrnfpwlwnk = rgvfuqvkyqVar.lrnfpwlwnk(view) + (nufgyqmvbu(rgvfuqvkyqVar) == zLqeggnwhkg ? -1 : 1);
        if (iLrnfpwlwnk < 0 || iLrnfpwlwnk >= iIobyxmoadg) {
            return -1;
        }
        return iLrnfpwlwnk;
    }
}
