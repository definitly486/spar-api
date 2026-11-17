package zl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import wl.kcexrzcfyt;
import xl.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu extends ArrayList {
    public nufgyqmvbu() {
    }

    public zdlpuopuiu agtfadlqog(int i13, zdlpuopuiu zdlpuopuiuVar) {
        vl.zoijcleaow.btonecajqb(zdlpuopuiuVar);
        zdlpuopuiu zdlpuopuiuVar2 = (zdlpuopuiu) super.set(i13, zdlpuopuiuVar);
        zdlpuopuiuVar2.ribwqtqdhb(zdlpuopuiuVar);
        return zdlpuopuiuVar2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        draadjrbmk();
        super.clear();
    }

    public nufgyqmvbu draadjrbmk() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            ((zdlpuopuiu) it.next()).mbcevpiqjq();
        }
        return this;
    }

    public String iobyxmoadg() {
        return (String) stream().map(new Function() { // from class: zl.lqeggnwhkg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((zdlpuopuiu) obj).ylkuphrtab();
            }
        }).collect(kcexrzcfyt.kcexrzcfyt("\n"));
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = super.indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        wkgbmnqykc(iIndexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public boolean removeIf(Predicate predicate) {
        Iterator<E> it = iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            if (predicate.test((zdlpuopuiu) it.next())) {
                it.remove();
                z13 = true;
            }
        }
        return z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        for (int i13 = 0; i13 < size(); i13++) {
            agtfadlqog(i13, (zdlpuopuiu) unaryOperator.apply((zdlpuopuiu) get(i13)));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        Iterator<E> it = iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            if (!collection.contains((zdlpuopuiu) it.next())) {
                it.remove();
                z13 = true;
            }
        }
        return z13;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return iobyxmoadg();
    }

    public zdlpuopuiu wkgbmnqykc(int i13) {
        zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) super.remove(i13);
        zdlpuopuiuVar.mbcevpiqjq();
        return zdlpuopuiuVar;
    }

    public nufgyqmvbu(int i13) {
        super(i13);
    }
}
