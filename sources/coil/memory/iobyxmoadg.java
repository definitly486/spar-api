package coil.memory;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f20288iobyxmoadg;

    public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        this.f20288iobyxmoadg = nufgyqmvbuVar;
    }

    @Override // coil.memory.lqeggnwhkg
    public void iobyxmoadg(int i13) {
    }

    @Override // coil.memory.lqeggnwhkg
    public void ppxfxbqfkf(MemoryCache.Key key, Bitmap bitmap, Map map) {
        this.f20288iobyxmoadg.ppxfxbqfkf(key, bitmap, map, i7.iobyxmoadg.iobyxmoadg(bitmap));
    }

    @Override // coil.memory.lqeggnwhkg
    public MemoryCache.zoijcleaow zoijcleaow(MemoryCache.Key key) {
        return null;
    }
}
