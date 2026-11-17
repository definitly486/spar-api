package ud;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113353iobyxmoadg;

    public draadjrbmk(String str) {
        this.f113353iobyxmoadg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof draadjrbmk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113353iobyxmoadg, ((draadjrbmk) obj).f113353iobyxmoadg);
    }

    public int hashCode() {
        String str = this.f113353iobyxmoadg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f113353iobyxmoadg;
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f113353iobyxmoadg + ')';
    }
}
