package yggfygwlhe;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f124983iobyxmoadg;

    private static class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final InputConfiguration f124984iobyxmoadg;

        iobyxmoadg(Object obj) {
            this.f124984iobyxmoadg = (InputConfiguration) obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ppxfxbqfkf) {
                return Objects.equals(this.f124984iobyxmoadg, ((ppxfxbqfkf) obj).zoijcleaow());
            }
            return false;
        }

        public int hashCode() {
            return this.f124984iobyxmoadg.hashCode();
        }

        public String toString() {
            return this.f124984iobyxmoadg.toString();
        }

        @Override // yggfygwlhe.btonecajqb.ppxfxbqfkf
        public Object zoijcleaow() {
            return this.f124984iobyxmoadg;
        }
    }

    private interface ppxfxbqfkf {
        Object zoijcleaow();
    }

    private static final class zoijcleaow extends iobyxmoadg {
        zoijcleaow(Object obj) {
            super(obj);
        }
    }

    private btonecajqb(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f124983iobyxmoadg = ppxfxbqfkfVar;
    }

    public static btonecajqb zoijcleaow(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new btonecajqb(new zoijcleaow(obj)) : new btonecajqb(new iobyxmoadg(obj));
    }

    public boolean equals(Object obj) {
        if (obj instanceof btonecajqb) {
            return this.f124983iobyxmoadg.equals(((btonecajqb) obj).f124983iobyxmoadg);
        }
        return false;
    }

    public int hashCode() {
        return this.f124983iobyxmoadg.hashCode();
    }

    public Object iobyxmoadg() {
        return this.f124983iobyxmoadg.zoijcleaow();
    }

    public String toString() {
        return this.f124983iobyxmoadg.toString();
    }
}
