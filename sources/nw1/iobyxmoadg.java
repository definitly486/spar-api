package nw1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f71290iobyxmoadg;

    public iobyxmoadg(String str) {
        this.f71290iobyxmoadg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71290iobyxmoadg, ((iobyxmoadg) obj).f71290iobyxmoadg);
    }

    public int hashCode() {
        String str = this.f71290iobyxmoadg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f71290iobyxmoadg;
    }

    public String toString() {
        return "UploadSettingsResult(surveyUrl=" + this.f71290iobyxmoadg + ")";
    }
}
