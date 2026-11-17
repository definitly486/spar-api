package df;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg extends zoijcleaow {
    protected abstract void btonecajqb(Object obj, RecyclerView.iozdgvuglv iozdgvuglvVar, List list);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.zoijcleaow
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public final boolean iobyxmoadg(List list, int i13) {
        return nufgyqmvbu(list.get(i13), list, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public final void zoijcleaow(List list, int i13, RecyclerView.iozdgvuglv iozdgvuglvVar, List list2) {
        btonecajqb(list.get(i13), iozdgvuglvVar, list2);
    }

    protected abstract boolean nufgyqmvbu(Object obj, List list, int i13);
}
