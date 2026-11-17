package df;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.nufgyqmvbu;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc extends RecyclerView.nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final ppxfxbqfkf f27903iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected final androidx.recyclerview.widget.wkgbmnqykc f27904zoijcleaow;

    public wkgbmnqykc(nufgyqmvbu.gxszxtbevo gxszxtbevoVar) {
        this(gxszxtbevoVar, new ppxfxbqfkf());
    }

    public void eablkybsjg(List list, Runnable runnable) {
        this.f27904zoijcleaow.gxszxtbevo(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public int getItemCount() {
        return this.f27904zoijcleaow.zoijcleaow().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public int getItemViewType(int i13) {
        return this.f27903iobyxmoadg.eablkybsjg(this.f27904zoijcleaow.zoijcleaow(), i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public void onBindViewHolder(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13) {
        this.f27903iobyxmoadg.gxszxtbevo(this.f27904zoijcleaow.zoijcleaow(), i13, iozdgvuglvVar, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public RecyclerView.iozdgvuglv onCreateViewHolder(ViewGroup viewGroup, int i13) {
        return this.f27903iobyxmoadg.lqeggnwhkg(viewGroup, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public boolean onFailedToRecycleView(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        return this.f27903iobyxmoadg.nufgyqmvbu(iozdgvuglvVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public void onViewAttachedToWindow(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        this.f27903iobyxmoadg.dxjokdxxww(iozdgvuglvVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public void onViewDetachedFromWindow(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        this.f27903iobyxmoadg.btonecajqb(iozdgvuglvVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public void onViewRecycled(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        this.f27903iobyxmoadg.gtknphoqwx(iozdgvuglvVar);
    }

    public List ppxfxbqfkf() {
        return this.f27904zoijcleaow.zoijcleaow();
    }

    public void wkgbmnqykc(List list) {
        this.f27904zoijcleaow.eablkybsjg(list);
    }

    public wkgbmnqykc(nufgyqmvbu.gxszxtbevo gxszxtbevoVar, ppxfxbqfkf ppxfxbqfkfVar) {
        if (gxszxtbevoVar == null) {
            throw new NullPointerException("ItemCallback is null");
        }
        if (ppxfxbqfkfVar == null) {
            throw new NullPointerException("AdapterDelegatesManager is null");
        }
        this.f27904zoijcleaow = new androidx.recyclerview.widget.wkgbmnqykc(this, gxszxtbevoVar);
        this.f27903iobyxmoadg = ppxfxbqfkfVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public void onBindViewHolder(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13, List list) {
        this.f27903iobyxmoadg.gxszxtbevo(this.f27904zoijcleaow.zoijcleaow(), i13, iozdgvuglvVar, list);
    }

    public wkgbmnqykc(nufgyqmvbu.gxszxtbevo gxszxtbevoVar, zoijcleaow... zoijcleaowVarArr) {
        if (gxszxtbevoVar != null) {
            this.f27904zoijcleaow = new androidx.recyclerview.widget.wkgbmnqykc(this, gxszxtbevoVar);
            this.f27903iobyxmoadg = new ppxfxbqfkf(zoijcleaowVarArr);
            return;
        }
        throw new NullPointerException("ItemCallback is null");
    }
}
