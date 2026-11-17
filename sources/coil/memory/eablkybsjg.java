package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.pmvmpeiblj;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg implements lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f20275iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f20276zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Bitmap f20277iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f20278ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f20279zoijcleaow;

        public iobyxmoadg(Bitmap bitmap, Map map, int i13) {
            this.f20277iobyxmoadg = bitmap;
            this.f20279zoijcleaow = map;
            this.f20278ppxfxbqfkf = i13;
        }

        public final Bitmap iobyxmoadg() {
            return this.f20277iobyxmoadg;
        }

        public final int ppxfxbqfkf() {
            return this.f20278ppxfxbqfkf;
        }

        public final Map zoijcleaow() {
            return this.f20279zoijcleaow;
        }
    }

    public static final class zoijcleaow extends pmvmpeiblj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f20280iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(int i13, eablkybsjg eablkybsjgVar) {
            super(i13);
            this.f20280iobyxmoadg = eablkybsjgVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.pmvmpeiblj
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public int sizeOf(MemoryCache.Key key, iobyxmoadg iobyxmoadgVar) {
            return iobyxmoadgVar.ppxfxbqfkf();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.pmvmpeiblj
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z13, MemoryCache.Key key, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
            this.f20280iobyxmoadg.f20275iobyxmoadg.ppxfxbqfkf(key, iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.ppxfxbqfkf());
        }
    }

    public eablkybsjg(int i13, nufgyqmvbu nufgyqmvbuVar) {
        this.f20275iobyxmoadg = nufgyqmvbuVar;
        this.f20276zoijcleaow = new zoijcleaow(i13, this);
    }

    public void eablkybsjg() {
        this.f20276zoijcleaow.evictAll();
    }

    public int gxszxtbevo() {
        return this.f20276zoijcleaow.maxSize();
    }

    @Override // coil.memory.lqeggnwhkg
    public void iobyxmoadg(int i13) {
        if (i13 >= 40) {
            eablkybsjg();
        } else {
            if (10 > i13 || i13 >= 20) {
                return;
            }
            this.f20276zoijcleaow.trimToSize(lqeggnwhkg() / 2);
        }
    }

    public int lqeggnwhkg() {
        return this.f20276zoijcleaow.size();
    }

    @Override // coil.memory.lqeggnwhkg
    public void ppxfxbqfkf(MemoryCache.Key key, Bitmap bitmap, Map map) {
        int iIobyxmoadg = i7.iobyxmoadg.iobyxmoadg(bitmap);
        if (iIobyxmoadg <= gxszxtbevo()) {
            this.f20276zoijcleaow.put(key, new iobyxmoadg(bitmap, map, iIobyxmoadg));
        } else {
            this.f20276zoijcleaow.remove(key);
            this.f20275iobyxmoadg.ppxfxbqfkf(key, bitmap, map, iIobyxmoadg);
        }
    }

    @Override // coil.memory.lqeggnwhkg
    public MemoryCache.zoijcleaow zoijcleaow(MemoryCache.Key key) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f20276zoijcleaow.get(key);
        if (iobyxmoadgVar != null) {
            return new MemoryCache.zoijcleaow(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow());
        }
        return null;
    }
}
