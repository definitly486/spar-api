package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oxmwwwfdhm extends RecyclerView.nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final wkgbmnqykc f13116iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc.zoijcleaow f13117zoijcleaow;

    class iobyxmoadg implements wkgbmnqykc.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.wkgbmnqykc.zoijcleaow
        public void iobyxmoadg(List list, List list2) {
            oxmwwwfdhm.this.wkgbmnqykc(list, list2);
        }
    }

    protected oxmwwwfdhm(nufgyqmvbu.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        this.f13117zoijcleaow = iobyxmoadgVar;
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(new zoijcleaow(this), new ppxfxbqfkf.iobyxmoadg(gxszxtbevoVar).iobyxmoadg());
        this.f13116iobyxmoadg = wkgbmnqykcVar;
        wkgbmnqykcVar.iobyxmoadg(iobyxmoadgVar);
    }

    public void eablkybsjg(List list) {
        this.f13116iobyxmoadg.eablkybsjg(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public int getItemCount() {
        return this.f13116iobyxmoadg.zoijcleaow().size();
    }

    protected Object ppxfxbqfkf(int i13) {
        return this.f13116iobyxmoadg.zoijcleaow().get(i13);
    }

    public void wkgbmnqykc(List list, List list2) {
    }
}
