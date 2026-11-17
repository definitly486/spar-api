package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vdvldrhtss extends lereixgezr {
    private static final float INVALID_DISTANCE = 1.0f;
    private yggfygwlhe mHorizontalHelper;
    private yggfygwlhe mVerticalHelper;

    private int eablkybsjg(View view, yggfygwlhe yggfygwlheVar) {
        return (yggfygwlheVar.lqeggnwhkg(view) + (yggfygwlheVar.eablkybsjg(view) / 2)) - (yggfygwlheVar.agtfadlqog() + (yggfygwlheVar.ojitshcjhn() / 2));
    }

    private yggfygwlhe getHorizontalHelper(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        yggfygwlhe yggfygwlheVar = this.mHorizontalHelper;
        if (yggfygwlheVar == null || yggfygwlheVar.f13151iobyxmoadg != rgvfuqvkyqVar) {
            this.mHorizontalHelper = yggfygwlhe.iobyxmoadg(rgvfuqvkyqVar);
        }
        return this.mHorizontalHelper;
    }

    private yggfygwlhe getVerticalHelper(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        yggfygwlhe yggfygwlheVar = this.mVerticalHelper;
        if (yggfygwlheVar == null || yggfygwlheVar.f13151iobyxmoadg != rgvfuqvkyqVar) {
            this.mVerticalHelper = yggfygwlhe.ppxfxbqfkf(rgvfuqvkyqVar);
        }
        return this.mVerticalHelper;
    }

    private int gxszxtbevo(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, yggfygwlhe yggfygwlheVar, int i13, int i14) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i13, i14);
        float fWkgbmnqykc = wkgbmnqykc(rgvfuqvkyqVar, yggfygwlheVar);
        if (fWkgbmnqykc <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / fWkgbmnqykc);
    }

    private View lqeggnwhkg(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, yggfygwlhe yggfygwlheVar) {
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

    private float wkgbmnqykc(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, yggfygwlhe yggfygwlheVar) {
        int iVipkmwdibw = rgvfuqvkyqVar.vipkmwdibw();
        if (iVipkmwdibw == 0) {
            return INVALID_DISTANCE;
        }
        View view = null;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i15 = 0; i15 < iVipkmwdibw; i15++) {
            View viewRibwqtqdhb = rgvfuqvkyqVar.ribwqtqdhb(i15);
            int iLrnfpwlwnk = rgvfuqvkyqVar.lrnfpwlwnk(viewRibwqtqdhb);
            if (iLrnfpwlwnk != -1) {
                if (iLrnfpwlwnk < i14) {
                    view = viewRibwqtqdhb;
                    i14 = iLrnfpwlwnk;
                }
                if (iLrnfpwlwnk > i13) {
                    view2 = viewRibwqtqdhb;
                    i13 = iLrnfpwlwnk;
                }
            }
        }
        if (view == null || view2 == null) {
            return INVALID_DISTANCE;
        }
        int iMax = Math.max(yggfygwlheVar.wkgbmnqykc(view), yggfygwlheVar.wkgbmnqykc(view2)) - Math.min(yggfygwlheVar.lqeggnwhkg(view), yggfygwlheVar.lqeggnwhkg(view2));
        return iMax == 0 ? INVALID_DISTANCE : (iMax * INVALID_DISTANCE) / ((i13 - i14) + 1);
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    public int[] calculateDistanceToFinalSnap(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, View view) {
        int[] iArr = new int[2];
        if (rgvfuqvkyqVar.pmvmpeiblj()) {
            iArr[0] = eablkybsjg(view, getHorizontalHelper(rgvfuqvkyqVar));
        } else {
            iArr[0] = 0;
        }
        if (rgvfuqvkyqVar.zynmafqrjb()) {
            iArr[1] = eablkybsjg(view, getVerticalHelper(rgvfuqvkyqVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    public View findSnapView(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        if (rgvfuqvkyqVar.zynmafqrjb()) {
            return lqeggnwhkg(rgvfuqvkyqVar, getVerticalHelper(rgvfuqvkyqVar));
        }
        if (rgvfuqvkyqVar.pmvmpeiblj()) {
            return lqeggnwhkg(rgvfuqvkyqVar, getHorizontalHelper(rgvfuqvkyqVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.lereixgezr
    public int findTargetSnapPosition(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14) {
        int iIobyxmoadg;
        View viewFindSnapView;
        int iLrnfpwlwnk;
        int i15;
        PointF pointFZoijcleaow;
        int iGxszxtbevo;
        int iGxszxtbevo2;
        if (!(rgvfuqvkyqVar instanceof RecyclerView.pmvmpeiblj.zoijcleaow) || (iIobyxmoadg = rgvfuqvkyqVar.iobyxmoadg()) == 0 || (viewFindSnapView = findSnapView(rgvfuqvkyqVar)) == null || (iLrnfpwlwnk = rgvfuqvkyqVar.lrnfpwlwnk(viewFindSnapView)) == -1 || (pointFZoijcleaow = ((RecyclerView.pmvmpeiblj.zoijcleaow) rgvfuqvkyqVar).zoijcleaow((i15 = iIobyxmoadg - 1))) == null) {
            return -1;
        }
        if (rgvfuqvkyqVar.pmvmpeiblj()) {
            iGxszxtbevo = gxszxtbevo(rgvfuqvkyqVar, getHorizontalHelper(rgvfuqvkyqVar), i13, 0);
            if (pointFZoijcleaow.x < 0.0f) {
                iGxszxtbevo = -iGxszxtbevo;
            }
        } else {
            iGxszxtbevo = 0;
        }
        if (rgvfuqvkyqVar.zynmafqrjb()) {
            iGxszxtbevo2 = gxszxtbevo(rgvfuqvkyqVar, getVerticalHelper(rgvfuqvkyqVar), 0, i14);
            if (pointFZoijcleaow.y < 0.0f) {
                iGxszxtbevo2 = -iGxszxtbevo2;
            }
        } else {
            iGxszxtbevo2 = 0;
        }
        if (rgvfuqvkyqVar.zynmafqrjb()) {
            iGxszxtbevo = iGxszxtbevo2;
        }
        if (iGxszxtbevo == 0) {
            return -1;
        }
        int i16 = iLrnfpwlwnk + iGxszxtbevo;
        int i17 = i16 >= 0 ? i16 : 0;
        return i17 >= iIobyxmoadg ? i15 : i17;
    }
}
