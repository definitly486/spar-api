package hg;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx extends zoijcleaow implements Set, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f40229zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final boolean iobyxmoadg(Set c13, Set other) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
            if (c13.size() != other.size()) {
                return false;
            }
            return c13.containsAll(other);
        }

        public final int zoijcleaow(Collection c13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
            Iterator it = c13.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        private iobyxmoadg() {
        }
    }

    protected gtknphoqwx() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f40229zdlpuopuiu.iobyxmoadg(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f40229zdlpuopuiu.zoijcleaow(this);
    }
}
