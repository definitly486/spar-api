package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
abstract class cqumvgiudr {
    static int iobyxmoadg(RecyclerView.zynmafqrjb zynmafqrjbVar, yggfygwlhe yggfygwlheVar, View view, View view2, RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        if (rgvfuqvkyqVar.vipkmwdibw() == 0 || zynmafqrjbVar.zoijcleaow() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z13) {
            return Math.abs(rgvfuqvkyqVar.lrnfpwlwnk(view) - rgvfuqvkyqVar.lrnfpwlwnk(view2)) + 1;
        }
        return Math.min(yggfygwlheVar.ojitshcjhn(), yggfygwlheVar.wkgbmnqykc(view2) - yggfygwlheVar.lqeggnwhkg(view));
    }

    static int ppxfxbqfkf(RecyclerView.zynmafqrjb zynmafqrjbVar, yggfygwlhe yggfygwlheVar, View view, View view2, RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        if (rgvfuqvkyqVar.vipkmwdibw() == 0 || zynmafqrjbVar.zoijcleaow() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z13) {
            return zynmafqrjbVar.zoijcleaow();
        }
        return (int) (((yggfygwlheVar.wkgbmnqykc(view2) - yggfygwlheVar.lqeggnwhkg(view)) / (Math.abs(rgvfuqvkyqVar.lrnfpwlwnk(view) - rgvfuqvkyqVar.lrnfpwlwnk(view2)) + 1)) * zynmafqrjbVar.zoijcleaow());
    }

    static int zoijcleaow(RecyclerView.zynmafqrjb zynmafqrjbVar, yggfygwlhe yggfygwlheVar, View view, View view2, RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, boolean z13, boolean z14) {
        if (rgvfuqvkyqVar.vipkmwdibw() == 0 || zynmafqrjbVar.zoijcleaow() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z14 ? Math.max(0, (zynmafqrjbVar.zoijcleaow() - Math.max(rgvfuqvkyqVar.lrnfpwlwnk(view), rgvfuqvkyqVar.lrnfpwlwnk(view2))) - 1) : Math.max(0, Math.min(rgvfuqvkyqVar.lrnfpwlwnk(view), rgvfuqvkyqVar.lrnfpwlwnk(view2)));
        if (z13) {
            return Math.round((iMax * (Math.abs(yggfygwlheVar.wkgbmnqykc(view2) - yggfygwlheVar.lqeggnwhkg(view)) / (Math.abs(rgvfuqvkyqVar.lrnfpwlwnk(view) - rgvfuqvkyqVar.lrnfpwlwnk(view2)) + 1))) + (yggfygwlheVar.agtfadlqog() - yggfygwlheVar.lqeggnwhkg(view)));
        }
        return iMax;
    }
}
