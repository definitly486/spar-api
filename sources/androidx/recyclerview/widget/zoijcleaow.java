package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final RecyclerView.nufgyqmvbu f13155iobyxmoadg;

    public zoijcleaow(RecyclerView.nufgyqmvbu nufgyqmvbuVar) {
        this.f13155iobyxmoadg = nufgyqmvbuVar;
    }

    @Override // androidx.recyclerview.widget.kcexrzcfyt
    public void iobyxmoadg(int i13, int i14) {
        this.f13155iobyxmoadg.notifyItemRangeInserted(i13, i14);
    }

    @Override // androidx.recyclerview.widget.kcexrzcfyt
    public void ppxfxbqfkf(int i13, int i14, Object obj) {
        this.f13155iobyxmoadg.notifyItemRangeChanged(i13, i14, obj);
    }

    @Override // androidx.recyclerview.widget.kcexrzcfyt
    public void wkgbmnqykc(int i13, int i14) {
        this.f13155iobyxmoadg.notifyItemMoved(i13, i14);
    }

    @Override // androidx.recyclerview.widget.kcexrzcfyt
    public void zoijcleaow(int i13, int i14) {
        this.f13155iobyxmoadg.notifyItemRangeRemoved(i13, i14);
    }
}
