package ub;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
class yggfygwlhe implements tc.zoijcleaow {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile Set f113175zoijcleaow = null;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private volatile Set f113174iobyxmoadg = Collections.newSetFromMap(new ConcurrentHashMap());

    yggfygwlhe(Collection collection) {
        this.f113174iobyxmoadg.addAll(collection);
    }

    private synchronized void wkgbmnqykc() {
        try {
            Iterator it = this.f113174iobyxmoadg.iterator();
            while (it.hasNext()) {
                this.f113175zoijcleaow.add(((tc.zoijcleaow) it.next()).get());
            }
            this.f113174iobyxmoadg = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static yggfygwlhe zoijcleaow(Collection collection) {
        return new yggfygwlhe((Set) collection);
    }

    synchronized void iobyxmoadg(tc.zoijcleaow zoijcleaowVar) {
        try {
            if (this.f113175zoijcleaow == null) {
                this.f113174iobyxmoadg.add(zoijcleaowVar);
            } else {
                this.f113175zoijcleaow.add(zoijcleaowVar.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // tc.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f113175zoijcleaow == null) {
            synchronized (this) {
                try {
                    if (this.f113175zoijcleaow == null) {
                        this.f113175zoijcleaow = Collections.newSetFromMap(new ConcurrentHashMap());
                        wkgbmnqykc();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f113175zoijcleaow);
    }
}
