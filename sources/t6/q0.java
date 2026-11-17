package t6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class q0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Serializable f109874iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f109875zoijcleaow;

    q0(Serializable serializable) {
        this.f109874iobyxmoadg = serializable;
        this.f109875zoijcleaow = System.currentTimeMillis();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        return this.f109874iobyxmoadg.equals(((q0) obj).f109874iobyxmoadg);
    }

    public int hashCode() {
        return this.f109874iobyxmoadg.hashCode();
    }

    Serializable iobyxmoadg() {
        return this.f109874iobyxmoadg;
    }

    long zoijcleaow() {
        return this.f109875zoijcleaow;
    }

    q0(Serializable serializable, long j13) {
        this.f109874iobyxmoadg = serializable;
        this.f109875zoijcleaow = j13;
    }
}
