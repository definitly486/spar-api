package ni;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ii.zoijcleaow f70094iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f70095zoijcleaow;

    public gxszxtbevo(ii.zoijcleaow classId, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
        this.f70094iobyxmoadg = classId;
        this.f70095zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f70094iobyxmoadg, gxszxtbevoVar.f70094iobyxmoadg) && this.f70095zoijcleaow == gxszxtbevoVar.f70095zoijcleaow;
    }

    public int hashCode() {
        return (this.f70094iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f70095zoijcleaow);
    }

    public final ii.zoijcleaow iobyxmoadg() {
        return this.f70094iobyxmoadg;
    }

    public final int ppxfxbqfkf() {
        return this.f70095zoijcleaow;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        int i13 = this.f70095zoijcleaow;
        for (int i14 = 0; i14 < i13; i14++) {
            sb3.append("kotlin/Array<");
        }
        sb3.append(this.f70094iobyxmoadg);
        int i15 = this.f70095zoijcleaow;
        for (int i16 = 0; i16 < i15; i16++) {
            sb3.append(">");
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final ii.zoijcleaow wkgbmnqykc() {
        return this.f70094iobyxmoadg;
    }

    public final int zoijcleaow() {
        return this.f70095zoijcleaow;
    }
}
