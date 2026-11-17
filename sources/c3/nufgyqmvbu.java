package c3;

import androidx.media3.datasource.cache.Cache;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements androidx.media3.datasource.cache.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f18636iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f18637ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TreeSet f18638zoijcleaow = new TreeSet(new Comparator() { // from class: c3.lqeggnwhkg
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return nufgyqmvbu.nufgyqmvbu((ppxfxbqfkf) obj, (ppxfxbqfkf) obj2);
        }
    });

    public nufgyqmvbu(long j13) {
        this.f18636iobyxmoadg = j13;
    }

    private void dxjokdxxww(Cache cache, long j13) {
        while (this.f18637ppxfxbqfkf + j13 > this.f18636iobyxmoadg && !this.f18638zoijcleaow.isEmpty()) {
            cache.gxszxtbevo((ppxfxbqfkf) this.f18638zoijcleaow.first());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int nufgyqmvbu(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
        long j13 = ppxfxbqfkfVar.f18640esjtqupxsv;
        long j14 = ppxfxbqfkfVar2.f18640esjtqupxsv;
        if (j13 - j14 == 0) {
            return ppxfxbqfkfVar.compareTo(ppxfxbqfkfVar2);
        }
        return j13 < j14 ? -1 : 1;
    }

    @Override // androidx.media3.datasource.cache.zoijcleaow
    public void eablkybsjg() {
    }

    @Override // androidx.media3.datasource.cache.Cache.iobyxmoadg
    public void gxszxtbevo(Cache cache, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f18638zoijcleaow.remove(ppxfxbqfkfVar);
        this.f18637ppxfxbqfkf -= ppxfxbqfkfVar.f18642jyumaefscl;
    }

    @Override // androidx.media3.datasource.cache.zoijcleaow
    public boolean iobyxmoadg() {
        return true;
    }

    @Override // androidx.media3.datasource.cache.Cache.iobyxmoadg
    public void ppxfxbqfkf(Cache cache, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
        gxszxtbevo(cache, ppxfxbqfkfVar);
        zoijcleaow(cache, ppxfxbqfkfVar2);
    }

    @Override // androidx.media3.datasource.cache.zoijcleaow
    public void wkgbmnqykc(Cache cache, String str, long j13, long j14) {
        if (j14 != -1) {
            dxjokdxxww(cache, j14);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.iobyxmoadg
    public void zoijcleaow(Cache cache, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f18638zoijcleaow.add(ppxfxbqfkfVar);
        this.f18637ppxfxbqfkf += ppxfxbqfkfVar.f18642jyumaefscl;
        dxjokdxxww(cache, 0L);
    }
}
