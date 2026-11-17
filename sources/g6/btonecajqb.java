package g6;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f36363iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Notification f36364ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f36365zoijcleaow;

    public btonecajqb(int i13, Notification notification, int i14) {
        this.f36363iobyxmoadg = i13;
        this.f36364ppxfxbqfkf = notification;
        this.f36365zoijcleaow = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || btonecajqb.class != obj.getClass()) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        if (this.f36363iobyxmoadg == btonecajqbVar.f36363iobyxmoadg && this.f36365zoijcleaow == btonecajqbVar.f36365zoijcleaow) {
            return this.f36364ppxfxbqfkf.equals(btonecajqbVar.f36364ppxfxbqfkf);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f36363iobyxmoadg * 31) + this.f36365zoijcleaow) * 31) + this.f36364ppxfxbqfkf.hashCode();
    }

    public int iobyxmoadg() {
        return this.f36365zoijcleaow;
    }

    public int ppxfxbqfkf() {
        return this.f36363iobyxmoadg;
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f36363iobyxmoadg + ", mForegroundServiceType=" + this.f36365zoijcleaow + ", mNotification=" + this.f36364ppxfxbqfkf + '}';
    }

    public Notification zoijcleaow() {
        return this.f36364ppxfxbqfkf;
    }
}
