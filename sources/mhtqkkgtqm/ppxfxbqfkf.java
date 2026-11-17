package mhtqkkgtqm;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf extends hg.wkgbmnqykc implements grlcpdaxtj.eablkybsjg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean draadjrbmk(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    @Override // java.util.Collection, java.util.List, grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg addAll(Collection collection) {
        grlcpdaxtj.eablkybsjg.iobyxmoadg iobyxmoadgVarNufgyqmvbu = nufgyqmvbu();
        iobyxmoadgVarNufgyqmvbu.addAll(collection);
        return iobyxmoadgVarNufgyqmvbu.build();
    }

    @Override // hg.zoijcleaow, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // hg.zoijcleaow, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // hg.wkgbmnqykc, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg remove(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? jlmebxxoox(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg removeAll(final Collection collection) {
        return e0(new tg.draadjrbmk() { // from class: mhtqkkgtqm.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ppxfxbqfkf.draadjrbmk(collection, obj));
            }
        });
    }

    @Override // hg.wkgbmnqykc, java.util.List, grlcpdaxtj.ppxfxbqfkf
    public grlcpdaxtj.ppxfxbqfkf subList(int i13, int i14) {
        return super.subList(i13, i14);
    }
}
