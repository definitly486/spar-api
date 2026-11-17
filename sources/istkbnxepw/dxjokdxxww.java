package istkbnxepw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww {

    public static final class iobyxmoadg extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f49314iobyxmoadg = new ArrayList();

        iobyxmoadg(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) it.next();
                if (!(nufgyqmvbuVar instanceof zoijcleaow)) {
                    this.f49314iobyxmoadg.add(nufgyqmvbuVar);
                }
            }
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void eablkybsjg(int i13) {
            Iterator it = this.f49314iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((nufgyqmvbu) it.next()).eablkybsjg(i13);
            }
        }

        public List gxszxtbevo() {
            return this.f49314iobyxmoadg;
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void iobyxmoadg(int i13) {
            Iterator it = this.f49314iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((nufgyqmvbu) it.next()).iobyxmoadg(i13);
            }
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void ppxfxbqfkf(int i13, btonecajqb btonecajqbVar) {
            Iterator it = this.f49314iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((nufgyqmvbu) it.next()).ppxfxbqfkf(i13, btonecajqbVar);
            }
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void wkgbmnqykc(int i13, int i14) {
            Iterator it = this.f49314iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((nufgyqmvbu) it.next()).wkgbmnqykc(i13, i14);
            }
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void zoijcleaow(int i13, ojitshcjhn ojitshcjhnVar) {
            Iterator it = this.f49314iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((nufgyqmvbu) it.next()).zoijcleaow(i13, ojitshcjhnVar);
            }
        }
    }

    static final class zoijcleaow extends nufgyqmvbu {
        zoijcleaow() {
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void eablkybsjg(int i13) {
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void ppxfxbqfkf(int i13, btonecajqb btonecajqbVar) {
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void zoijcleaow(int i13, ojitshcjhn ojitshcjhnVar) {
        }
    }

    static nufgyqmvbu iobyxmoadg(List list) {
        if (list.isEmpty()) {
            return ppxfxbqfkf();
        }
        return list.size() == 1 ? (nufgyqmvbu) list.get(0) : new iobyxmoadg(list);
    }

    public static nufgyqmvbu ppxfxbqfkf() {
        return new zoijcleaow();
    }

    public static nufgyqmvbu zoijcleaow(nufgyqmvbu... nufgyqmvbuVarArr) {
        return iobyxmoadg(Arrays.asList(nufgyqmvbuVarArr));
    }
}
