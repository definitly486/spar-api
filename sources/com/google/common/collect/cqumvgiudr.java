package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cqumvgiudr {

    class iobyxmoadg extends com.google.common.collect.zoijcleaow {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ xa.wflxmlrfwp f23632iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Iterator f23633jyumaefscl;

        iobyxmoadg(Iterator it, xa.wflxmlrfwp wflxmlrfwpVar) {
            this.f23633jyumaefscl = it;
            this.f23632iwizpuwonk = wflxmlrfwpVar;
        }

        @Override // com.google.common.collect.zoijcleaow
        protected Object iobyxmoadg() {
            while (this.f23633jyumaefscl.hasNext()) {
                Object next = this.f23633jyumaefscl.next();
                if (this.f23632iwizpuwonk.apply(next)) {
                    return next;
                }
            }
            return zoijcleaow();
        }
    }

    private static final class ppxfxbqfkf extends ulzqkzuiru {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f23634yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f23635zdlpuopuiu;

        ppxfxbqfkf(Object obj) {
            this.f23635zdlpuopuiu = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f23634yggfygwlhe;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f23634yggfygwlhe) {
                throw new NoSuchElementException();
            }
            this.f23634yggfygwlhe = true;
            return this.f23635zdlpuopuiu;
        }
    }

    private enum zoijcleaow implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            nufgyqmvbu.ppxfxbqfkf(false);
        }
    }

    public static boolean agtfadlqog(Iterator it, Collection collection) {
        xa.draadjrbmk.btonecajqb(collection);
        boolean z13 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z13 = true;
            }
        }
        return z13;
    }

    public static Object btonecajqb(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static int draadjrbmk(Iterator it, xa.wflxmlrfwp wflxmlrfwpVar) {
        xa.draadjrbmk.gtknphoqwx(wflxmlrfwpVar, "predicate");
        int i13 = 0;
        while (it.hasNext()) {
            if (wflxmlrfwpVar.apply(it.next())) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static Object dxjokdxxww(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static boolean eablkybsjg(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !xa.dxjokdxxww.iobyxmoadg(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static Object gtknphoqwx(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("expected one element but was: <");
        sb3.append(next);
        for (int i13 = 0; i13 < 4 && it.hasNext(); i13++) {
            sb3.append(", ");
            sb3.append(it.next());
        }
        if (it.hasNext()) {
            sb3.append(", ...");
        }
        sb3.append('>');
        throw new IllegalArgumentException(sb3.toString());
    }

    static Iterator gxszxtbevo() {
        return zoijcleaow.INSTANCE;
    }

    public static boolean iobyxmoadg(Collection collection, Iterator it) {
        xa.draadjrbmk.btonecajqb(collection);
        xa.draadjrbmk.btonecajqb(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static ulzqkzuiru lqeggnwhkg(Iterator it, xa.wflxmlrfwp wflxmlrfwpVar) {
        xa.draadjrbmk.btonecajqb(it);
        xa.draadjrbmk.btonecajqb(wflxmlrfwpVar);
        return new iobyxmoadg(it, wflxmlrfwpVar);
    }

    public static Object nufgyqmvbu(Iterator it, xa.wflxmlrfwp wflxmlrfwpVar) {
        xa.draadjrbmk.btonecajqb(it);
        xa.draadjrbmk.btonecajqb(wflxmlrfwpVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (wflxmlrfwpVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean ojitshcjhn(Iterator it, xa.wflxmlrfwp wflxmlrfwpVar) {
        xa.draadjrbmk.btonecajqb(wflxmlrfwpVar);
        boolean z13 = false;
        while (it.hasNext()) {
            if (wflxmlrfwpVar.apply(it.next())) {
                it.remove();
                z13 = true;
            }
        }
        return z13;
    }

    static void ppxfxbqfkf(Iterator it) {
        xa.draadjrbmk.btonecajqb(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static ulzqkzuiru rgvfuqvkyq(Object obj) {
        return new ppxfxbqfkf(obj);
    }

    static Object wflxmlrfwp(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean wkgbmnqykc(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean zoijcleaow(Iterator it, xa.wflxmlrfwp wflxmlrfwpVar) {
        return draadjrbmk(it, wflxmlrfwpVar) != -1;
    }
}
