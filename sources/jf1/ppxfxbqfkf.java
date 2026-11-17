package jf1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f51202eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f51203gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51204iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f51205lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f51206ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f51207wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f51208zoijcleaow;

    public ppxfxbqfkf(String id2, String title, String body, String action, String reference, String dateFrom, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(body, "body");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(dateFrom, "dateFrom");
        this.f51204iobyxmoadg = id2;
        this.f51208zoijcleaow = title;
        this.f51206ppxfxbqfkf = body;
        this.f51207wkgbmnqykc = action;
        this.f51202eablkybsjg = reference;
        this.f51203gxszxtbevo = dateFrom;
        this.f51205lqeggnwhkg = z13;
    }

    public final boolean eablkybsjg() {
        return this.f51205lqeggnwhkg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f51204iobyxmoadg, ppxfxbqfkfVar.f51204iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f51208zoijcleaow, ppxfxbqfkfVar.f51208zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f51206ppxfxbqfkf, ppxfxbqfkfVar.f51206ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f51207wkgbmnqykc, ppxfxbqfkfVar.f51207wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f51202eablkybsjg, ppxfxbqfkfVar.f51202eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f51203gxszxtbevo, ppxfxbqfkfVar.f51203gxszxtbevo) && this.f51205lqeggnwhkg == ppxfxbqfkfVar.f51205lqeggnwhkg;
    }

    public int hashCode() {
        return (((((((((((this.f51204iobyxmoadg.hashCode() * 31) + this.f51208zoijcleaow.hashCode()) * 31) + this.f51206ppxfxbqfkf.hashCode()) * 31) + this.f51207wkgbmnqykc.hashCode()) * 31) + this.f51202eablkybsjg.hashCode()) * 31) + this.f51203gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f51205lqeggnwhkg);
    }

    public final String iobyxmoadg() {
        return this.f51206ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f51204iobyxmoadg;
    }

    public String toString() {
        return "NotificationUiModel(id=" + this.f51204iobyxmoadg + ", title=" + this.f51208zoijcleaow + ", body=" + this.f51206ppxfxbqfkf + ", action=" + this.f51207wkgbmnqykc + ", reference=" + this.f51202eablkybsjg + ", dateFrom=" + this.f51203gxszxtbevo + ", isCopyButtonVisible=" + this.f51205lqeggnwhkg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f51208zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f51203gxszxtbevo;
    }
}
