package androidx.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class pmvmpeiblj {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final jlmebxxoox.zoijcleaow lock;
    private final jlmebxxoox.ppxfxbqfkf map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public pmvmpeiblj(int i13) {
        this.maxSize = i13;
        if (!(i13 > 0)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("maxSize <= 0");
        }
        this.map = new jlmebxxoox.ppxfxbqfkf(0, 0.75f);
        this.lock = new jlmebxxoox.zoijcleaow();
    }

    private final int iobyxmoadg(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (!(iSizeOf >= 0)) {
            jlmebxxoox.wkgbmnqykc.zoijcleaow("Negative size: " + obj + '=' + obj2);
        }
        return iSizeOf;
    }

    protected Object create(Object key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        return null;
    }

    public final int createCount() {
        int i13;
        synchronized (this.lock) {
            i13 = this.createCount;
        }
        return i13;
    }

    protected void entryRemoved(boolean z13, Object key, Object oldValue, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i13;
        synchronized (this.lock) {
            i13 = this.evictionCount;
        }
        return i13;
    }

    public final Object get(Object key) {
        Object objWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        synchronized (this.lock) {
            Object objIobyxmoadg = this.map.iobyxmoadg(key);
            if (objIobyxmoadg != null) {
                this.hitCount++;
                return objIobyxmoadg;
            }
            this.missCount++;
            Object objCreate = create(key);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    objWkgbmnqykc = this.map.wkgbmnqykc(key, objCreate);
                    if (objWkgbmnqykc != null) {
                        this.map.wkgbmnqykc(key, objWkgbmnqykc);
                    } else {
                        this.size += iobyxmoadg(key, objCreate);
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objWkgbmnqykc != null) {
                entryRemoved(false, key, objCreate, objWkgbmnqykc);
                return objWkgbmnqykc;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i13;
        synchronized (this.lock) {
            i13 = this.hitCount;
        }
        return i13;
    }

    public final int maxSize() {
        int i13;
        synchronized (this.lock) {
            i13 = this.maxSize;
        }
        return i13;
    }

    public final int missCount() {
        int i13;
        synchronized (this.lock) {
            i13 = this.missCount;
        }
        return i13;
    }

    public final Object put(Object key, Object value) {
        Object objWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += iobyxmoadg(key, value);
                objWkgbmnqykc = this.map.wkgbmnqykc(key, value);
                if (objWkgbmnqykc != null) {
                    this.size -= iobyxmoadg(key, objWkgbmnqykc);
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (objWkgbmnqykc != null) {
            entryRemoved(false, key, objWkgbmnqykc, value);
        }
        trimToSize(this.maxSize);
        return objWkgbmnqykc;
    }

    public final int putCount() {
        int i13;
        synchronized (this.lock) {
            i13 = this.putCount;
        }
        return i13;
    }

    public final Object remove(Object key) {
        Object objEablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        synchronized (this.lock) {
            try {
                objEablkybsjg = this.map.eablkybsjg(key);
                if (objEablkybsjg != null) {
                    this.size -= iobyxmoadg(key, objEablkybsjg);
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (objEablkybsjg != null) {
            entryRemoved(false, key, objEablkybsjg, null);
        }
        return objEablkybsjg;
    }

    public void resize(int i13) {
        if (!(i13 > 0)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i13;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        trimToSize(i13);
    }

    public final int size() {
        int i13;
        synchronized (this.lock) {
            i13 = this.size;
        }
        return i13;
    }

    protected int sizeOf(Object key, Object value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.zoijcleaow().size());
            for (Map.Entry entry : this.map.zoijcleaow()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i13 = this.hitCount;
                int i14 = this.missCount + i13;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i14 != 0 ? (i13 * 100) / i14 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public void trimToSize(int i13) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (!(this.size >= 0 && (!this.map.ppxfxbqfkf() || this.size == 0))) {
                        jlmebxxoox.wkgbmnqykc.zoijcleaow("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.size <= i13 || this.map.ppxfxbqfkf()) {
                        break;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) hg.jyumaefscl.iyctptxqzt(this.map.zoijcleaow());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.map.eablkybsjg(key);
                    this.size -= iobyxmoadg(key, value);
                    this.evictionCount++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
