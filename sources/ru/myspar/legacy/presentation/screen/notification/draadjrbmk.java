package ru.myspar.legacy.presentation.screen.notification;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f89325iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f89326ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f89327wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f89328zoijcleaow;

    public draadjrbmk(boolean z13, List items, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f89325iobyxmoadg = z13;
        this.f89328zoijcleaow = items;
        this.f89326ppxfxbqfkf = z14;
        this.f89327wkgbmnqykc = z15;
    }

    public static /* synthetic */ draadjrbmk zoijcleaow(draadjrbmk draadjrbmkVar, boolean z13, List list, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = draadjrbmkVar.f89325iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            list = draadjrbmkVar.f89328zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z14 = draadjrbmkVar.f89326ppxfxbqfkf;
        }
        if ((i13 & 8) != 0) {
            z15 = draadjrbmkVar.f89327wkgbmnqykc;
        }
        return draadjrbmkVar.iobyxmoadg(z13, list, z14, z15);
    }

    public final boolean eablkybsjg() {
        return this.f89325iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f89325iobyxmoadg == draadjrbmkVar.f89325iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f89328zoijcleaow, draadjrbmkVar.f89328zoijcleaow) && this.f89326ppxfxbqfkf == draadjrbmkVar.f89326ppxfxbqfkf && this.f89327wkgbmnqykc == draadjrbmkVar.f89327wkgbmnqykc;
    }

    public final boolean gxszxtbevo() {
        return this.f89327wkgbmnqykc;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f89325iobyxmoadg) * 31) + this.f89328zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f89326ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f89327wkgbmnqykc);
    }

    public final draadjrbmk iobyxmoadg(boolean z13, List items, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(items, "items");
        return new draadjrbmk(z13, items, z14, z15);
    }

    public final List ppxfxbqfkf() {
        return this.f89328zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f89325iobyxmoadg + ", items=" + this.f89328zoijcleaow + ", warningIsVisible=" + this.f89326ppxfxbqfkf + ", isUnauthorizedWarningTitle=" + this.f89327wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f89326ppxfxbqfkf;
    }

    public /* synthetic */ draadjrbmk(boolean z13, List list, boolean z14, boolean z15, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15);
    }
}
