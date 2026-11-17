package kk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final List f57230iobyxmoadg;

    public jw(List links) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(links, "links");
        this.f57230iobyxmoadg = links;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57230iobyxmoadg, ((jw) obj).f57230iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57230iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "GetAgreementLinksTitlesUseCaseRequestParams(links=" + this.f57230iobyxmoadg + ")";
    }
}
