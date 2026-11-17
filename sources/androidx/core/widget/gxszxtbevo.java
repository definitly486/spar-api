package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class gxszxtbevo extends iobyxmoadg {

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final ListView f8545jpowsppfya;

    public gxszxtbevo(ListView listView) {
        super(listView);
        this.f8545jpowsppfya = listView;
    }

    @Override // androidx.core.widget.iobyxmoadg
    public void btonecajqb(int i13, int i14) {
        this.f8545jpowsppfya.scrollListBy(i14);
    }

    @Override // androidx.core.widget.iobyxmoadg
    public boolean iobyxmoadg(int i13) {
        return false;
    }

    @Override // androidx.core.widget.iobyxmoadg
    public boolean zoijcleaow(int i13) {
        ListView listView = this.f8545jpowsppfya;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i14 = firstVisiblePosition + childCount;
        if (i13 > 0) {
            if (i14 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i13 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
