package jj;

import io.appmetrica.analytics.impl.C4007z9;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    public interface eablkybsjg {
        boolean iobyxmoadg(Object obj);
    }

    public static class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Set f51598iobyxmoadg;

        public gxszxtbevo() {
            this(new HashSet());
        }

        private static /* synthetic */ void zoijcleaow(int i13) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // jj.zoijcleaow.eablkybsjg
        public boolean iobyxmoadg(Object obj) {
            return this.f51598iobyxmoadg.add(obj);
        }

        public gxszxtbevo(Set set) {
            if (set == null) {
                zoijcleaow(0);
            }
            this.f51598iobyxmoadg = set;
        }
    }

    static class iobyxmoadg extends AbstractC1108zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51599iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ boolean[] f51600zoijcleaow;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar, boolean[] zArr) {
            this.f51599iobyxmoadg = draadjrbmkVar;
            this.f51600zoijcleaow = zArr;
        }

        @Override // jj.zoijcleaow.wkgbmnqykc
        public boolean ppxfxbqfkf(Object obj) {
            if (((Boolean) this.f51599iobyxmoadg.invoke(obj)).booleanValue()) {
                this.f51600zoijcleaow[0] = true;
            }
            return !this.f51600zoijcleaow[0];
        }

        @Override // jj.zoijcleaow.wkgbmnqykc
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public Boolean iobyxmoadg() {
            return Boolean.valueOf(this.f51600zoijcleaow[0]);
        }
    }

    public interface ppxfxbqfkf {
        Iterable iobyxmoadg(Object obj);
    }

    public interface wkgbmnqykc {
        Object iobyxmoadg();

        boolean ppxfxbqfkf(Object obj);

        void zoijcleaow(Object obj);
    }

    /* JADX INFO: renamed from: jj.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static abstract class AbstractC1108zoijcleaow implements wkgbmnqykc {
        @Override // jj.zoijcleaow.wkgbmnqykc
        public void zoijcleaow(Object obj) {
        }
    }

    public static Boolean eablkybsjg(Collection collection, ppxfxbqfkf ppxfxbqfkfVar, tg.draadjrbmk draadjrbmkVar) {
        if (collection == null) {
            iobyxmoadg(7);
        }
        if (ppxfxbqfkfVar == null) {
            iobyxmoadg(8);
        }
        if (draadjrbmkVar == null) {
            iobyxmoadg(9);
        }
        return (Boolean) zoijcleaow(collection, ppxfxbqfkfVar, new iobyxmoadg(draadjrbmkVar, new boolean[1]));
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        Object[] objArr = new Object[3];
        switch (i13) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case C4007z9.F /* 25 */:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i13) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case C4007z9.F /* 25 */:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object ppxfxbqfkf(Collection collection, ppxfxbqfkf ppxfxbqfkfVar, eablkybsjg eablkybsjgVar, wkgbmnqykc wkgbmnqykcVar) {
        if (collection == null) {
            iobyxmoadg(0);
        }
        if (ppxfxbqfkfVar == null) {
            iobyxmoadg(1);
        }
        if (eablkybsjgVar == null) {
            iobyxmoadg(2);
        }
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(3);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            wkgbmnqykc(it.next(), ppxfxbqfkfVar, eablkybsjgVar, wkgbmnqykcVar);
        }
        return wkgbmnqykcVar.iobyxmoadg();
    }

    public static void wkgbmnqykc(Object obj, ppxfxbqfkf ppxfxbqfkfVar, eablkybsjg eablkybsjgVar, wkgbmnqykc wkgbmnqykcVar) {
        if (obj == null) {
            iobyxmoadg(22);
        }
        if (ppxfxbqfkfVar == null) {
            iobyxmoadg(23);
        }
        if (eablkybsjgVar == null) {
            iobyxmoadg(24);
        }
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(25);
        }
        if (eablkybsjgVar.iobyxmoadg(obj) && wkgbmnqykcVar.ppxfxbqfkf(obj)) {
            Iterator it = ppxfxbqfkfVar.iobyxmoadg(obj).iterator();
            while (it.hasNext()) {
                wkgbmnqykc(it.next(), ppxfxbqfkfVar, eablkybsjgVar, wkgbmnqykcVar);
            }
            wkgbmnqykcVar.zoijcleaow(obj);
        }
    }

    public static Object zoijcleaow(Collection collection, ppxfxbqfkf ppxfxbqfkfVar, wkgbmnqykc wkgbmnqykcVar) {
        if (collection == null) {
            iobyxmoadg(4);
        }
        if (ppxfxbqfkfVar == null) {
            iobyxmoadg(5);
        }
        if (wkgbmnqykcVar == null) {
            iobyxmoadg(6);
        }
        return ppxfxbqfkf(collection, ppxfxbqfkfVar, new gxszxtbevo(), wkgbmnqykcVar);
    }
}
