package tv1;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.jhduphickx;
import p0.okpsazkaxt;
import p0.ylkuphrtab;

/* JADX INFO: loaded from: classes6.dex */
final class oxmwwwfdhm implements okpsazkaxt {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j0.eablkybsjg f111599zoijcleaow;

    public static final class iobyxmoadg implements ylkuphrtab {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ j0.eablkybsjg f111600zoijcleaow;

        iobyxmoadg(j0.eablkybsjg eablkybsjgVar) {
            this.f111600zoijcleaow = eablkybsjgVar;
        }

        @Override // p0.ylkuphrtab
        public int iobyxmoadg(int i13) {
            return i13 < this.f111600zoijcleaow.length() ? i13 : this.f111600zoijcleaow.length();
        }

        @Override // p0.ylkuphrtab
        public int zoijcleaow(int i13) {
            return i13;
        }
    }

    public oxmwwwfdhm(String unit) {
        zdlpuopuiu.btonecajqb(unit, "unit");
        this.f111599zoijcleaow = new j0.eablkybsjg(" " + unit, null, 2, null);
    }

    @Override // p0.okpsazkaxt
    public jhduphickx iobyxmoadg(j0.eablkybsjg text) {
        zdlpuopuiu.btonecajqb(text, "text");
        return new jhduphickx(text.vdvldrhtss(this.f111599zoijcleaow), new iobyxmoadg(text));
    }
}
