package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf implements btonecajqb, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    int f2888cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    int f2889esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    ExpandedMenuView f2890iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    eablkybsjg f2891jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    int f2892lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private btonecajqb.iobyxmoadg f2893pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    LayoutInflater f2894yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    Context f2895zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    iobyxmoadg f2896zynmafqrjb;

    private class iobyxmoadg extends BaseAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f2897iobyxmoadg = -1;

        public iobyxmoadg() {
            iobyxmoadg();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = ppxfxbqfkf.this.f2891jyumaefscl.lereixgezr().size() - ppxfxbqfkf.this.f2888cqumvgiudr;
            return this.f2897iobyxmoadg < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i13) {
            return i13;
        }

        @Override // android.widget.Adapter
        public View getView(int i13, View view, ViewGroup viewGroup) {
            if (view == null) {
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                view = ppxfxbqfkfVar.f2894yggfygwlhe.inflate(ppxfxbqfkfVar.f2892lereixgezr, viewGroup, false);
            }
            ((gtknphoqwx.iobyxmoadg) view).ppxfxbqfkf(getItem(i13), 0);
            return view;
        }

        void iobyxmoadg() {
            lqeggnwhkg lqeggnwhkgVarJyumaefscl = ppxfxbqfkf.this.f2891jyumaefscl.jyumaefscl();
            if (lqeggnwhkgVarJyumaefscl != null) {
                ArrayList arrayListLereixgezr = ppxfxbqfkf.this.f2891jyumaefscl.lereixgezr();
                int size = arrayListLereixgezr.size();
                for (int i13 = 0; i13 < size; i13++) {
                    if (((lqeggnwhkg) arrayListLereixgezr.get(i13)) == lqeggnwhkgVarJyumaefscl) {
                        this.f2897iobyxmoadg = i13;
                        return;
                    }
                }
            }
            this.f2897iobyxmoadg = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            iobyxmoadg();
            super.notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public lqeggnwhkg getItem(int i13) {
            ArrayList arrayListLereixgezr = ppxfxbqfkf.this.f2891jyumaefscl.lereixgezr();
            int i14 = i13 + ppxfxbqfkf.this.f2888cqumvgiudr;
            int i15 = this.f2897iobyxmoadg;
            if (i15 >= 0 && i14 >= i15) {
                i14++;
            }
            return (lqeggnwhkg) arrayListLereixgezr.get(i14);
        }
    }

    public ppxfxbqfkf(Context context, int i13) {
        this(i13, 0);
        this.f2895zdlpuopuiu = context;
        this.f2894yggfygwlhe = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void btonecajqb(Context context, eablkybsjg eablkybsjgVar) {
        if (this.f2889esjtqupxsv != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f2889esjtqupxsv);
            this.f2895zdlpuopuiu = contextThemeWrapper;
            this.f2894yggfygwlhe = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f2895zdlpuopuiu != null) {
            this.f2895zdlpuopuiu = context;
            if (this.f2894yggfygwlhe == null) {
                this.f2894yggfygwlhe = LayoutInflater.from(context);
            }
        }
        this.f2891jyumaefscl = eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar = this.f2896zynmafqrjb;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean dxjokdxxww(eablkybsjg eablkybsjgVar, lqeggnwhkg lqeggnwhkgVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void eablkybsjg(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        this.f2893pmvmpeiblj = iobyxmoadgVar;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean gxszxtbevo(wflxmlrfwp wflxmlrfwpVar) {
        if (!wflxmlrfwpVar.hasVisibleItems()) {
            return false;
        }
        new gxszxtbevo(wflxmlrfwpVar).zoijcleaow(null);
        btonecajqb.iobyxmoadg iobyxmoadgVar = this.f2893pmvmpeiblj;
        if (iobyxmoadgVar == null) {
            return true;
        }
        iobyxmoadgVar.wkgbmnqykc(wflxmlrfwpVar);
        return true;
    }

    public ListAdapter iobyxmoadg() {
        if (this.f2896zynmafqrjb == null) {
            this.f2896zynmafqrjb = new iobyxmoadg();
        }
        return this.f2896zynmafqrjb;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void lqeggnwhkg(boolean z13) {
        iobyxmoadg iobyxmoadgVar = this.f2896zynmafqrjb;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean nufgyqmvbu() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        this.f2891jyumaefscl.cllcsxoeiz(this.f2896zynmafqrjb.getItem(i13), this, 0);
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void ppxfxbqfkf(eablkybsjg eablkybsjgVar, boolean z13) {
        btonecajqb.iobyxmoadg iobyxmoadgVar = this.f2893pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(eablkybsjgVar, z13);
        }
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean wkgbmnqykc(eablkybsjg eablkybsjgVar, lqeggnwhkg lqeggnwhkgVar) {
        return false;
    }

    public gtknphoqwx zoijcleaow(ViewGroup viewGroup) {
        if (this.f2890iwizpuwonk == null) {
            this.f2890iwizpuwonk = (ExpandedMenuView) this.f2894yggfygwlhe.inflate(lqeggnwhkg.lqeggnwhkg.abc_expanded_menu_layout, viewGroup, false);
            if (this.f2896zynmafqrjb == null) {
                this.f2896zynmafqrjb = new iobyxmoadg();
            }
            this.f2890iwizpuwonk.setAdapter((ListAdapter) this.f2896zynmafqrjb);
            this.f2890iwizpuwonk.setOnItemClickListener(this);
        }
        return this.f2890iwizpuwonk;
    }

    public ppxfxbqfkf(int i13, int i14) {
        this.f2892lereixgezr = i13;
        this.f2889esjtqupxsv = i14;
    }
}
