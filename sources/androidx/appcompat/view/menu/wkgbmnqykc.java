package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc extends BaseAdapter {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final LayoutInflater f2901eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f2902gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    eablkybsjg f2903iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f2904ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f2905wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f2906zoijcleaow = -1;

    public wkgbmnqykc(eablkybsjg eablkybsjgVar, LayoutInflater layoutInflater, boolean z13, int i13) {
        this.f2905wkgbmnqykc = z13;
        this.f2901eablkybsjg = layoutInflater;
        this.f2903iobyxmoadg = eablkybsjgVar;
        this.f2902gxszxtbevo = i13;
        iobyxmoadg();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListLereixgezr = this.f2905wkgbmnqykc ? this.f2903iobyxmoadg.lereixgezr() : this.f2903iobyxmoadg.yadqdtsiqt();
        return this.f2906zoijcleaow < 0 ? arrayListLereixgezr.size() : arrayListLereixgezr.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i13) {
        return i13;
    }

    @Override // android.widget.Adapter
    public View getView(int i13, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2901eablkybsjg.inflate(this.f2902gxszxtbevo, viewGroup, false);
        }
        int groupId = getItem(i13).getGroupId();
        int i14 = i13 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f2903iobyxmoadg.lmojexxdyd() && groupId != (i14 >= 0 ? getItem(i14).getGroupId() : groupId));
        gtknphoqwx.iobyxmoadg iobyxmoadgVar = (gtknphoqwx.iobyxmoadg) view;
        if (this.f2904ppxfxbqfkf) {
            listMenuItemView.setForceShowIcon(true);
        }
        iobyxmoadgVar.ppxfxbqfkf(getItem(i13), 0);
        return view;
    }

    void iobyxmoadg() {
        lqeggnwhkg lqeggnwhkgVarJyumaefscl = this.f2903iobyxmoadg.jyumaefscl();
        if (lqeggnwhkgVarJyumaefscl != null) {
            ArrayList arrayListLereixgezr = this.f2903iobyxmoadg.lereixgezr();
            int size = arrayListLereixgezr.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (((lqeggnwhkg) arrayListLereixgezr.get(i13)) == lqeggnwhkgVarJyumaefscl) {
                    this.f2906zoijcleaow = i13;
                    return;
                }
            }
        }
        this.f2906zoijcleaow = -1;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        iobyxmoadg();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg getItem(int i13) {
        ArrayList arrayListLereixgezr = this.f2905wkgbmnqykc ? this.f2903iobyxmoadg.lereixgezr() : this.f2903iobyxmoadg.yadqdtsiqt();
        int i14 = this.f2906zoijcleaow;
        if (i14 >= 0 && i13 >= i14) {
            i13++;
        }
        return (lqeggnwhkg) arrayListLereixgezr.get(i13);
    }

    public void wkgbmnqykc(boolean z13) {
        this.f2904ppxfxbqfkf = z13;
    }

    public eablkybsjg zoijcleaow() {
        return this.f2903iobyxmoadg;
    }
}
