package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ru extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58472iobyxmoadg;

    public ru(String number) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(number, "number");
        this.f58472iobyxmoadg = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58472iobyxmoadg, ((ru) obj).f58472iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58472iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "StartWebAuthorizationWithPhoneNumber(number=" + this.f58472iobyxmoadg + ")";
    }
}
