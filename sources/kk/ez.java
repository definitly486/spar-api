package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ez extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f56474iobyxmoadg;

    public ez(String number) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(number, "number");
        this.f56474iobyxmoadg = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56474iobyxmoadg, ((ez) obj).f56474iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56474iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandleWebViewAuthorizationWithPhoneNumber(number=" + this.f56474iobyxmoadg + ")";
    }
}
