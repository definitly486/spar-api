package ub;

/* JADX INFO: loaded from: classes2.dex */
public final class pmvmpeiblj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f113148iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Class f113149zoijcleaow;

    private @interface iobyxmoadg {
    }

    public pmvmpeiblj(Class cls, Class cls2) {
        this.f113148iobyxmoadg = cls;
        this.f113149zoijcleaow = cls2;
    }

    public static pmvmpeiblj iobyxmoadg(Class cls, Class cls2) {
        return new pmvmpeiblj(cls, cls2);
    }

    public static pmvmpeiblj zoijcleaow(Class cls) {
        return new pmvmpeiblj(iobyxmoadg.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pmvmpeiblj.class != obj.getClass()) {
            return false;
        }
        pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) obj;
        if (this.f113149zoijcleaow.equals(pmvmpeibljVar.f113149zoijcleaow)) {
            return this.f113148iobyxmoadg.equals(pmvmpeibljVar.f113148iobyxmoadg);
        }
        return false;
    }

    public int hashCode() {
        return (this.f113149zoijcleaow.hashCode() * 31) + this.f113148iobyxmoadg.hashCode();
    }

    public String toString() {
        if (this.f113148iobyxmoadg == iobyxmoadg.class) {
            return this.f113149zoijcleaow.getName();
        }
        return "@" + this.f113148iobyxmoadg.getName() + " " + this.f113149zoijcleaow.getName();
    }
}
