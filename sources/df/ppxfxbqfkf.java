package df;

import android.view.ViewGroup;
import androidx.collection.xrmfcynszj;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final List f27900ppxfxbqfkf = Collections.emptyList();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected xrmfcynszj f27901iobyxmoadg = new xrmfcynszj();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected zoijcleaow f27902zoijcleaow;

    public ppxfxbqfkf() {
    }

    public void btonecajqb(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(iozdgvuglvVar.getItemViewType());
        if (zoijcleaowVarWkgbmnqykc != null) {
            zoijcleaowVarWkgbmnqykc.gxszxtbevo(iozdgvuglvVar);
            return;
        }
        throw new NullPointerException("No delegate found for " + iozdgvuglvVar + " for item at position = " + iozdgvuglvVar.getAdapterPosition() + " for viewType = " + iozdgvuglvVar.getItemViewType());
    }

    public void dxjokdxxww(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(iozdgvuglvVar.getItemViewType());
        if (zoijcleaowVarWkgbmnqykc != null) {
            zoijcleaowVarWkgbmnqykc.eablkybsjg(iozdgvuglvVar);
            return;
        }
        throw new NullPointerException("No delegate found for " + iozdgvuglvVar + " for item at position = " + iozdgvuglvVar.getAdapterPosition() + " for viewType = " + iozdgvuglvVar.getItemViewType());
    }

    public int eablkybsjg(Object obj, int i13) {
        if (obj == null) {
            throw new NullPointerException("Items datasource is null!");
        }
        int iOjitshcjhn = this.f27901iobyxmoadg.ojitshcjhn();
        for (int i14 = 0; i14 < iOjitshcjhn; i14++) {
            if (((zoijcleaow) this.f27901iobyxmoadg.rgvfuqvkyq(i14)).iobyxmoadg(obj, i13)) {
                return this.f27901iobyxmoadg.gtknphoqwx(i14);
            }
        }
        if (this.f27902zoijcleaow != null) {
            return 2147483646;
        }
        throw new NullPointerException(obj instanceof List ? "No AdapterDelegate added that matches item=" + ((List) obj).get(i13).toString() + " at position=" + i13 + " in data source" : "No AdapterDelegate added for item at position=" + i13 + ". items=" + obj);
    }

    public void gtknphoqwx(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(iozdgvuglvVar.getItemViewType());
        if (zoijcleaowVarWkgbmnqykc != null) {
            zoijcleaowVarWkgbmnqykc.lqeggnwhkg(iozdgvuglvVar);
            return;
        }
        throw new NullPointerException("No delegate found for " + iozdgvuglvVar + " for item at position = " + iozdgvuglvVar.getAdapterPosition() + " for viewType = " + iozdgvuglvVar.getItemViewType());
    }

    public void gxszxtbevo(Object obj, int i13, RecyclerView.iozdgvuglv iozdgvuglvVar, List list) {
        zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(iozdgvuglvVar.getItemViewType());
        if (zoijcleaowVarWkgbmnqykc != null) {
            if (list == null) {
                list = f27900ppxfxbqfkf;
            }
            zoijcleaowVarWkgbmnqykc.zoijcleaow(obj, i13, iozdgvuglvVar, list);
        } else {
            throw new NullPointerException("No delegate found for item at position = " + i13 + " for viewType = " + iozdgvuglvVar.getItemViewType());
        }
    }

    public ppxfxbqfkf iobyxmoadg(int i13, zoijcleaow zoijcleaowVar) {
        return zoijcleaow(i13, false, zoijcleaowVar);
    }

    public RecyclerView.iozdgvuglv lqeggnwhkg(ViewGroup viewGroup, int i13) {
        zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(i13);
        if (zoijcleaowVarWkgbmnqykc == null) {
            throw new NullPointerException("No AdapterDelegate added for ViewType " + i13);
        }
        RecyclerView.iozdgvuglv iozdgvuglvVarPpxfxbqfkf = zoijcleaowVarWkgbmnqykc.ppxfxbqfkf(viewGroup);
        if (iozdgvuglvVarPpxfxbqfkf != null) {
            return iozdgvuglvVarPpxfxbqfkf;
        }
        throw new NullPointerException("ViewHolder returned from AdapterDelegate " + zoijcleaowVarWkgbmnqykc + " for ViewType =" + i13 + " is null!");
    }

    public boolean nufgyqmvbu(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(iozdgvuglvVar.getItemViewType());
        if (zoijcleaowVarWkgbmnqykc != null) {
            return zoijcleaowVarWkgbmnqykc.wkgbmnqykc(iozdgvuglvVar);
        }
        throw new NullPointerException("No delegate found for " + iozdgvuglvVar + " for item at position = " + iozdgvuglvVar.getAdapterPosition() + " for viewType = " + iozdgvuglvVar.getItemViewType());
    }

    public ppxfxbqfkf ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        int iOjitshcjhn = this.f27901iobyxmoadg.ojitshcjhn();
        while (this.f27901iobyxmoadg.eablkybsjg(iOjitshcjhn) != null) {
            iOjitshcjhn++;
            if (iOjitshcjhn == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        return zoijcleaow(iOjitshcjhn, false, zoijcleaowVar);
    }

    public zoijcleaow wkgbmnqykc(int i13) {
        return (zoijcleaow) this.f27901iobyxmoadg.gxszxtbevo(i13, this.f27902zoijcleaow);
    }

    public ppxfxbqfkf zoijcleaow(int i13, boolean z13, zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar == null) {
            throw new NullPointerException("AdapterDelegate is null!");
        }
        if (i13 == 2147483646) {
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        }
        if (z13 || this.f27901iobyxmoadg.eablkybsjg(i13) == null) {
            this.f27901iobyxmoadg.draadjrbmk(i13, zoijcleaowVar);
            return this;
        }
        throw new IllegalArgumentException("An AdapterDelegate is already registered for the viewType = " + i13 + ". Already registered AdapterDelegate is " + this.f27901iobyxmoadg.eablkybsjg(i13));
    }

    public ppxfxbqfkf(zoijcleaow... zoijcleaowVarArr) {
        for (zoijcleaow zoijcleaowVar : zoijcleaowVarArr) {
            ppxfxbqfkf(zoijcleaowVar);
        }
    }
}
