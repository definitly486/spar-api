package coil.memory;

import android.graphics.Bitmap;
import hg.jyumaefscl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo implements nufgyqmvbu {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f20281ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinkedHashMap f20282iobyxmoadg = new LinkedHashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f20283zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f20284iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Map f20285ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f20286wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final WeakReference f20287zoijcleaow;

        public zoijcleaow(int i13, WeakReference weakReference, Map map, int i14) {
            this.f20284iobyxmoadg = i13;
            this.f20287zoijcleaow = weakReference;
            this.f20285ppxfxbqfkf = map;
            this.f20286wkgbmnqykc = i14;
        }

        public final WeakReference iobyxmoadg() {
            return this.f20287zoijcleaow;
        }

        public final int ppxfxbqfkf() {
            return this.f20284iobyxmoadg;
        }

        public final int wkgbmnqykc() {
            return this.f20286wkgbmnqykc;
        }

        public final Map zoijcleaow() {
            return this.f20285ppxfxbqfkf;
        }
    }

    private final void eablkybsjg() {
        int i13 = this.f20283zoijcleaow;
        this.f20283zoijcleaow = i13 + 1;
        if (i13 >= 10) {
            wkgbmnqykc();
        }
    }

    @Override // coil.memory.nufgyqmvbu
    public synchronized void iobyxmoadg(int i13) {
        if (i13 >= 10 && i13 != 20) {
            wkgbmnqykc();
        }
    }

    @Override // coil.memory.nufgyqmvbu
    public synchronized void ppxfxbqfkf(MemoryCache.Key key, Bitmap bitmap, Map map, int i13) {
        try {
            LinkedHashMap linkedHashMap = this.f20282iobyxmoadg;
            Object arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            zoijcleaow zoijcleaowVar = new zoijcleaow(iIdentityHashCode, new WeakReference(bitmap), map, i13);
            int size = arrayList2.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    arrayList2.add(zoijcleaowVar);
                    break;
                }
                zoijcleaow zoijcleaowVar2 = (zoijcleaow) arrayList2.get(i14);
                if (i13 >= zoijcleaowVar2.wkgbmnqykc()) {
                    if (zoijcleaowVar2.ppxfxbqfkf() != iIdentityHashCode || zoijcleaowVar2.iobyxmoadg().get() != bitmap) {
                        arrayList2.add(i14, zoijcleaowVar);
                        break;
                    } else {
                        arrayList2.set(i14, zoijcleaowVar);
                        break;
                    }
                }
                i14++;
            }
            eablkybsjg();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void wkgbmnqykc() {
        WeakReference weakReferenceIobyxmoadg;
        this.f20283zoijcleaow = 0;
        Iterator it = this.f20282iobyxmoadg.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) jyumaefscl.weqkydbzbr(arrayList);
                if (((zoijcleaowVar == null || (weakReferenceIobyxmoadg = zoijcleaowVar.iobyxmoadg()) == null) ? null : (Bitmap) weakReferenceIobyxmoadg.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i13 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    int i15 = i14 - i13;
                    if (((zoijcleaow) arrayList.get(i15)).iobyxmoadg().get() == null) {
                        arrayList.remove(i15);
                        i13++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // coil.memory.nufgyqmvbu
    public synchronized MemoryCache.zoijcleaow zoijcleaow(MemoryCache.Key key) {
        try {
            ArrayList arrayList = (ArrayList) this.f20282iobyxmoadg.get(key);
            MemoryCache.zoijcleaow zoijcleaowVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                zoijcleaow zoijcleaowVar2 = (zoijcleaow) arrayList.get(i13);
                Bitmap bitmap = (Bitmap) zoijcleaowVar2.iobyxmoadg().get();
                MemoryCache.zoijcleaow zoijcleaowVar3 = bitmap != null ? new MemoryCache.zoijcleaow(bitmap, zoijcleaowVar2.zoijcleaow()) : null;
                if (zoijcleaowVar3 != null) {
                    zoijcleaowVar = zoijcleaowVar3;
                    break;
                }
            }
            eablkybsjg();
            return zoijcleaowVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
