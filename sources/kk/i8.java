package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class i8 extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f57011iobyxmoadg;

    public i8(String phone) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f57011iobyxmoadg = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57011iobyxmoadg, ((i8) obj).f57011iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57011iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "OneTimePassword(phone=" + this.f57011iobyxmoadg + ")";
    }
}
