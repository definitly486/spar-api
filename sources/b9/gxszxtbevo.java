package b9;

import java.util.ArrayList;
import java.util.List;
import l8.btonecajqb;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f15567iobyxmoadg = new ArrayList();

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f15568iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final btonecajqb f15569zoijcleaow;

        iobyxmoadg(Class cls, btonecajqb btonecajqbVar) {
            this.f15568iobyxmoadg = cls;
            this.f15569zoijcleaow = btonecajqbVar;
        }

        boolean iobyxmoadg(Class cls) {
            return this.f15568iobyxmoadg.isAssignableFrom(cls);
        }
    }

    public synchronized void iobyxmoadg(Class cls, btonecajqb btonecajqbVar) {
        this.f15567iobyxmoadg.add(new iobyxmoadg(cls, btonecajqbVar));
    }

    public synchronized btonecajqb zoijcleaow(Class cls) {
        int size = this.f15567iobyxmoadg.size();
        for (int i13 = 0; i13 < size; i13++) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f15567iobyxmoadg.get(i13);
            if (iobyxmoadgVar.iobyxmoadg(cls)) {
                return iobyxmoadgVar.f15569zoijcleaow;
            }
        }
        return null;
    }
}
