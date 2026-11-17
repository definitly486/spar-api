package ac;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class ppxfxbqfkf extends zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dc.iozdgvuglv f1413iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final File f1414ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1415zoijcleaow;

    ppxfxbqfkf(dc.iozdgvuglv iozdgvuglvVar, String str, File file) {
        if (iozdgvuglvVar == null) {
            throw new NullPointerException("Null report");
        }
        this.f1413iobyxmoadg = iozdgvuglvVar;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f1415zoijcleaow = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f1414ppxfxbqfkf = file;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zynmafqrjb)) {
            return false;
        }
        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) obj;
        return this.f1413iobyxmoadg.equals(zynmafqrjbVar.zoijcleaow()) && this.f1415zoijcleaow.equals(zynmafqrjbVar.wkgbmnqykc()) && this.f1414ppxfxbqfkf.equals(zynmafqrjbVar.ppxfxbqfkf());
    }

    public int hashCode() {
        return ((((this.f1413iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f1415zoijcleaow.hashCode()) * 1000003) ^ this.f1414ppxfxbqfkf.hashCode();
    }

    @Override // ac.zynmafqrjb
    public File ppxfxbqfkf() {
        return this.f1414ppxfxbqfkf;
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f1413iobyxmoadg + ", sessionId=" + this.f1415zoijcleaow + ", reportFile=" + this.f1414ppxfxbqfkf + "}";
    }

    @Override // ac.zynmafqrjb
    public String wkgbmnqykc() {
        return this.f1415zoijcleaow;
    }

    @Override // ac.zynmafqrjb
    public dc.iozdgvuglv zoijcleaow() {
        return this.f1413iobyxmoadg;
    }
}
