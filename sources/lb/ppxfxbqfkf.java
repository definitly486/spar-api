package lb;

import bb.gtknphoqwx;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lb.iobyxmoadg f62027iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Integer f62028ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f62029zoijcleaow;

    /* JADX INFO: renamed from: lb.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1261ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gtknphoqwx f62030iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f62031ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f62032wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f62033zoijcleaow;

        public boolean equals(Object obj) {
            if (!(obj instanceof C1261ppxfxbqfkf)) {
                return false;
            }
            C1261ppxfxbqfkf c1261ppxfxbqfkf = (C1261ppxfxbqfkf) obj;
            return this.f62030iobyxmoadg == c1261ppxfxbqfkf.f62030iobyxmoadg && this.f62033zoijcleaow == c1261ppxfxbqfkf.f62033zoijcleaow && this.f62031ppxfxbqfkf.equals(c1261ppxfxbqfkf.f62031ppxfxbqfkf) && this.f62032wkgbmnqykc.equals(c1261ppxfxbqfkf.f62032wkgbmnqykc);
        }

        public int hashCode() {
            return Objects.hash(this.f62030iobyxmoadg, Integer.valueOf(this.f62033zoijcleaow), this.f62031ppxfxbqfkf, this.f62032wkgbmnqykc);
        }

        public int iobyxmoadg() {
            return this.f62033zoijcleaow;
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f62030iobyxmoadg, Integer.valueOf(this.f62033zoijcleaow), this.f62031ppxfxbqfkf, this.f62032wkgbmnqykc);
        }

        private C1261ppxfxbqfkf(gtknphoqwx gtknphoqwxVar, int i13, String str, String str2) {
            this.f62030iobyxmoadg = gtknphoqwxVar;
            this.f62033zoijcleaow = i13;
            this.f62031ppxfxbqfkf = str;
            this.f62032wkgbmnqykc = str2;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private ArrayList f62034iobyxmoadg = new ArrayList();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private lb.iobyxmoadg f62036zoijcleaow = lb.iobyxmoadg.f62024zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Integer f62035ppxfxbqfkf = null;

        private boolean ppxfxbqfkf(int i13) {
            Iterator it = this.f62034iobyxmoadg.iterator();
            while (it.hasNext()) {
                if (((C1261ppxfxbqfkf) it.next()).iobyxmoadg() == i13) {
                    return true;
                }
            }
            return false;
        }

        public zoijcleaow eablkybsjg(int i13) {
            if (this.f62034iobyxmoadg == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f62035ppxfxbqfkf = Integer.valueOf(i13);
            return this;
        }

        public zoijcleaow iobyxmoadg(gtknphoqwx gtknphoqwxVar, int i13, String str, String str2) {
            ArrayList arrayList = this.f62034iobyxmoadg;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C1261ppxfxbqfkf(gtknphoqwxVar, i13, str, str2));
            return this;
        }

        public zoijcleaow wkgbmnqykc(lb.iobyxmoadg iobyxmoadgVar) {
            if (this.f62034iobyxmoadg == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f62036zoijcleaow = iobyxmoadgVar;
            return this;
        }

        public ppxfxbqfkf zoijcleaow() throws GeneralSecurityException {
            if (this.f62034iobyxmoadg == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f62035ppxfxbqfkf;
            if (num != null && !ppxfxbqfkf(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f62036zoijcleaow, Collections.unmodifiableList(this.f62034iobyxmoadg), this.f62035ppxfxbqfkf);
            this.f62034iobyxmoadg = null;
            return ppxfxbqfkfVar;
        }
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f62027iobyxmoadg.equals(ppxfxbqfkfVar.f62027iobyxmoadg) && this.f62029zoijcleaow.equals(ppxfxbqfkfVar.f62029zoijcleaow) && Objects.equals(this.f62028ppxfxbqfkf, ppxfxbqfkfVar.f62028ppxfxbqfkf);
    }

    public int hashCode() {
        return Objects.hash(this.f62027iobyxmoadg, this.f62029zoijcleaow);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f62027iobyxmoadg, this.f62029zoijcleaow, this.f62028ppxfxbqfkf);
    }

    private ppxfxbqfkf(lb.iobyxmoadg iobyxmoadgVar, List list, Integer num) {
        this.f62027iobyxmoadg = iobyxmoadgVar;
        this.f62029zoijcleaow = list;
        this.f62028ppxfxbqfkf = num;
    }
}
