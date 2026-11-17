package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Object f12330eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wflxmlrfwp f12331iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f12332ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f12333wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f12334zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f12335eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private wflxmlrfwp f12336iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Object f12337ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f12338wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f12339zoijcleaow;

        public final zoijcleaow iobyxmoadg() {
            wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = this.f12336iobyxmoadg;
            if (wflxmlrfwpVarPpxfxbqfkf == null) {
                wflxmlrfwpVarPpxfxbqfkf = wflxmlrfwp.f12250ppxfxbqfkf.ppxfxbqfkf(this.f12337ppxfxbqfkf);
                zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarPpxfxbqfkf, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new zoijcleaow(wflxmlrfwpVarPpxfxbqfkf, this.f12339zoijcleaow, this.f12337ppxfxbqfkf, this.f12338wkgbmnqykc, this.f12335eablkybsjg);
        }

        public final iobyxmoadg ppxfxbqfkf(boolean z13) {
            this.f12339zoijcleaow = z13;
            return this;
        }

        public final iobyxmoadg wkgbmnqykc(wflxmlrfwp type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f12336iobyxmoadg = type;
            return this;
        }

        public final iobyxmoadg zoijcleaow(Object obj) {
            this.f12337ppxfxbqfkf = obj;
            this.f12338wkgbmnqykc = true;
            return this;
        }
    }

    public zoijcleaow(wflxmlrfwp type, boolean z13, Object obj, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(type, "type");
        if (!type.ppxfxbqfkf() && z13) {
            throw new IllegalArgumentException((type.zoijcleaow() + " does not allow nullable values").toString());
        }
        if (!z13 && z14 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.zoijcleaow() + " has null value but is not nullable.").toString());
        }
        this.f12331iobyxmoadg = type;
        this.f12334zoijcleaow = z13;
        this.f12330eablkybsjg = obj;
        this.f12332ppxfxbqfkf = z14 || z15;
        this.f12333wkgbmnqykc = z15;
    }

    public final void eablkybsjg(String name, Bundle bundle) {
        Object obj;
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(bundle, "bundle");
        if (!this.f12332ppxfxbqfkf || (obj = this.f12330eablkybsjg) == null) {
            return;
        }
        this.f12331iobyxmoadg.nufgyqmvbu(bundle, name, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zdlpuopuiu.eablkybsjg(zoijcleaow.class, obj.getClass())) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        if (this.f12334zoijcleaow != zoijcleaowVar.f12334zoijcleaow || this.f12332ppxfxbqfkf != zoijcleaowVar.f12332ppxfxbqfkf || !zdlpuopuiu.eablkybsjg(this.f12331iobyxmoadg, zoijcleaowVar.f12331iobyxmoadg)) {
            return false;
        }
        Object obj2 = this.f12330eablkybsjg;
        if (obj2 != null) {
            return zdlpuopuiu.eablkybsjg(obj2, zoijcleaowVar.f12330eablkybsjg);
        }
        return zoijcleaowVar.f12330eablkybsjg == null;
    }

    public final boolean gxszxtbevo(String name, Bundle bundle) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(bundle, "bundle");
        if (!this.f12334zoijcleaow && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.f12331iobyxmoadg.iobyxmoadg(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.f12331iobyxmoadg.hashCode() * 31) + (this.f12334zoijcleaow ? 1 : 0)) * 31) + (this.f12332ppxfxbqfkf ? 1 : 0)) * 31;
        Object obj = this.f12330eablkybsjg;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final wflxmlrfwp iobyxmoadg() {
        return this.f12331iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f12333wkgbmnqykc;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(zoijcleaow.class.getSimpleName());
        sb3.append(" Type: " + this.f12331iobyxmoadg);
        sb3.append(" Nullable: " + this.f12334zoijcleaow);
        if (this.f12332ppxfxbqfkf) {
            sb3.append(" DefaultValue: " + this.f12330eablkybsjg);
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "sb.toString()");
        return string;
    }

    public final boolean wkgbmnqykc() {
        return this.f12334zoijcleaow;
    }

    public final boolean zoijcleaow() {
        return this.f12332ppxfxbqfkf;
    }
}
