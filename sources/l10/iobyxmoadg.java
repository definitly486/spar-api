package l10;

import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f61331eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final LocalDateTime f61332gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f61333iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f61334ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f61335wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f61336zoijcleaow;

    public iobyxmoadg(String id2, String title, String body, String action, String reference, LocalDateTime dateFrom) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(body, "body");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(dateFrom, "dateFrom");
        this.f61333iobyxmoadg = id2;
        this.f61336zoijcleaow = title;
        this.f61334ppxfxbqfkf = body;
        this.f61335wkgbmnqykc = action;
        this.f61331eablkybsjg = reference;
        this.f61332gxszxtbevo = dateFrom;
    }

    public final String eablkybsjg() {
        return this.f61331eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f61333iobyxmoadg, iobyxmoadgVar.f61333iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61336zoijcleaow, iobyxmoadgVar.f61336zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61334ppxfxbqfkf, iobyxmoadgVar.f61334ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61335wkgbmnqykc, iobyxmoadgVar.f61335wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f61331eablkybsjg, iobyxmoadgVar.f61331eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f61332gxszxtbevo, iobyxmoadgVar.f61332gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f61336zoijcleaow;
    }

    public int hashCode() {
        return (((((((((this.f61333iobyxmoadg.hashCode() * 31) + this.f61336zoijcleaow.hashCode()) * 31) + this.f61334ppxfxbqfkf.hashCode()) * 31) + this.f61335wkgbmnqykc.hashCode()) * 31) + this.f61331eablkybsjg.hashCode()) * 31) + this.f61332gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f61335wkgbmnqykc;
    }

    public final LocalDateTime ppxfxbqfkf() {
        return this.f61332gxszxtbevo;
    }

    public String toString() {
        return "NotificationModel(id=" + this.f61333iobyxmoadg + ", title=" + this.f61336zoijcleaow + ", body=" + this.f61334ppxfxbqfkf + ", action=" + this.f61335wkgbmnqykc + ", reference=" + this.f61331eablkybsjg + ", dateFrom=" + this.f61332gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f61333iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f61334ppxfxbqfkf;
    }
}
