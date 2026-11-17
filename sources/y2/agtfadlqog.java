package y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog implements Iterable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f123522zdlpuopuiu = new Object();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Map f123521yggfygwlhe = new HashMap();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Set f123520jyumaefscl = Collections.emptySet();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private List f123519iwizpuwonk = Collections.emptyList();

    public Set i() {
        Set set;
        synchronized (this.f123522zdlpuopuiu) {
            set = this.f123520jyumaefscl;
        }
        return set;
    }

    public void iobyxmoadg(Object obj) {
        synchronized (this.f123522zdlpuopuiu) {
            try {
                ArrayList arrayList = new ArrayList(this.f123519iwizpuwonk);
                arrayList.add(obj);
                this.f123519iwizpuwonk = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f123521yggfygwlhe.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f123520jyumaefscl);
                    hashSet.add(obj);
                    this.f123520jyumaefscl = Collections.unmodifiableSet(hashSet);
                }
                this.f123521yggfygwlhe.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f123522zdlpuopuiu) {
            it = this.f123519iwizpuwonk.iterator();
        }
        return it;
    }

    public void ppxfxbqfkf(Object obj) {
        synchronized (this.f123522zdlpuopuiu) {
            try {
                Integer num = (Integer) this.f123521yggfygwlhe.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f123519iwizpuwonk);
                arrayList.remove(obj);
                this.f123519iwizpuwonk = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f123521yggfygwlhe.remove(obj);
                    HashSet hashSet = new HashSet(this.f123520jyumaefscl);
                    hashSet.remove(obj);
                    this.f123520jyumaefscl = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f123521yggfygwlhe.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int zoijcleaow(Object obj) {
        int iIntValue;
        synchronized (this.f123522zdlpuopuiu) {
            try {
                iIntValue = this.f123521yggfygwlhe.containsKey(obj) ? ((Integer) this.f123521yggfygwlhe.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }
}
