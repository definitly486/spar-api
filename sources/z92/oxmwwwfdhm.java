package z92;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.jhduphickx;
import p0.okpsazkaxt;
import p0.ylkuphrtab;

/* JADX INFO: loaded from: classes6.dex */
final class oxmwwwfdhm implements okpsazkaxt {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j0.eablkybsjg f129402zoijcleaow;

    public static final class iobyxmoadg implements ylkuphrtab {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ j0.eablkybsjg f129403zoijcleaow;

        iobyxmoadg(j0.eablkybsjg eablkybsjgVar) {
            this.f129403zoijcleaow = eablkybsjgVar;
        }

        @Override // p0.ylkuphrtab
        public int iobyxmoadg(int i13) {
            return i13 < this.f129403zoijcleaow.length() ? i13 : this.f129403zoijcleaow.length();
        }

        @Override // p0.ylkuphrtab
        public int zoijcleaow(int i13) {
            return i13;
        }
    }

    public oxmwwwfdhm(String unit) {
        zdlpuopuiu.btonecajqb(unit, "unit");
        this.f129402zoijcleaow = new j0.eablkybsjg(" " + unit, null, 2, null);
    }

    @Override // p0.okpsazkaxt
    public jhduphickx iobyxmoadg(j0.eablkybsjg text) {
        zdlpuopuiu.btonecajqb(text, "text");
        return new jhduphickx(text.vdvldrhtss(this.f129402zoijcleaow), new iobyxmoadg(text));
    }
}
