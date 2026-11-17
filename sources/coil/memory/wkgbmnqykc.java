package coil.memory;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements MemoryCache {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f20292iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f20293zoijcleaow;

    public wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar, nufgyqmvbu nufgyqmvbuVar) {
        this.f20292iobyxmoadg = lqeggnwhkgVar;
        this.f20293zoijcleaow = nufgyqmvbuVar;
    }

    @Override // coil.memory.MemoryCache
    public void iobyxmoadg(int i13) {
        this.f20292iobyxmoadg.iobyxmoadg(i13);
        this.f20293zoijcleaow.iobyxmoadg(i13);
    }

    @Override // coil.memory.MemoryCache
    public void ppxfxbqfkf(MemoryCache.Key key, MemoryCache.zoijcleaow zoijcleaowVar) {
        this.f20292iobyxmoadg.ppxfxbqfkf(MemoryCache.Key.ppxfxbqfkf(key, null, i7.ppxfxbqfkf.zoijcleaow(key.getExtras()), 1, null), zoijcleaowVar.iobyxmoadg(), i7.ppxfxbqfkf.zoijcleaow(zoijcleaowVar.zoijcleaow()));
    }

    @Override // coil.memory.MemoryCache
    public MemoryCache.zoijcleaow zoijcleaow(MemoryCache.Key key) {
        MemoryCache.zoijcleaow zoijcleaowVarZoijcleaow = this.f20292iobyxmoadg.zoijcleaow(key);
        return zoijcleaowVarZoijcleaow == null ? this.f20293zoijcleaow.zoijcleaow(key) : zoijcleaowVarZoijcleaow;
    }
}
