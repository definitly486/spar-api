package mk;

import kotlin.jvm.internal.zdlpuopuiu;
import lk.cqumvgiudr;
import lk.istkbnxepw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dxjokdxxww {

    public static final class iobyxmoadg extends istkbnxepw {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ int f67356eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ int f67357ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ byte[] f67358wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ cqumvgiudr f67359zoijcleaow;

        iobyxmoadg(cqumvgiudr cqumvgiudrVar, int i13, byte[] bArr, int i14) {
            this.f67359zoijcleaow = cqumvgiudrVar;
            this.f67357ppxfxbqfkf = i13;
            this.f67358wkgbmnqykc = bArr;
            this.f67356eablkybsjg = i14;
        }

        @Override // lk.istkbnxepw
        public void dxjokdxxww(bl.wkgbmnqykc sink) {
            zdlpuopuiu.btonecajqb(sink, "sink");
            sink.gtknphoqwx(this.f67358wkgbmnqykc, this.f67356eablkybsjg, this.f67357ppxfxbqfkf);
        }

        @Override // lk.istkbnxepw
        public long iobyxmoadg() {
            return this.f67357ppxfxbqfkf;
        }

        @Override // lk.istkbnxepw
        public cqumvgiudr zoijcleaow() {
            return this.f67359zoijcleaow;
        }
    }

    public static final class zoijcleaow extends istkbnxepw {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ bl.gxszxtbevo f67360ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ cqumvgiudr f67361zoijcleaow;

        zoijcleaow(cqumvgiudr cqumvgiudrVar, bl.gxszxtbevo gxszxtbevoVar) {
            this.f67361zoijcleaow = cqumvgiudrVar;
            this.f67360ppxfxbqfkf = gxszxtbevoVar;
        }

        @Override // lk.istkbnxepw
        public void dxjokdxxww(bl.wkgbmnqykc sink) {
            zdlpuopuiu.btonecajqb(sink, "sink");
            sink.t(this.f67360ppxfxbqfkf);
        }

        @Override // lk.istkbnxepw
        public long iobyxmoadg() {
            return this.f67360ppxfxbqfkf.hcddaimhww();
        }

        @Override // lk.istkbnxepw
        public cqumvgiudr zoijcleaow() {
            return this.f67361zoijcleaow;
        }
    }

    public static final boolean iobyxmoadg(istkbnxepw istkbnxepwVar) {
        zdlpuopuiu.btonecajqb(istkbnxepwVar, "<this>");
        return false;
    }

    public static final istkbnxepw ppxfxbqfkf(bl.gxszxtbevo gxszxtbevoVar, cqumvgiudr cqumvgiudrVar) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        return new zoijcleaow(cqumvgiudrVar, gxszxtbevoVar);
    }

    public static final istkbnxepw wkgbmnqykc(byte[] bArr, cqumvgiudr cqumvgiudrVar, int i13, int i14) {
        zdlpuopuiu.btonecajqb(bArr, "<this>");
        wflxmlrfwp.eablkybsjg(bArr.length, i13, i14);
        return new iobyxmoadg(cqumvgiudrVar, i14, bArr, i13);
    }

    public static final boolean zoijcleaow(istkbnxepw istkbnxepwVar) {
        zdlpuopuiu.btonecajqb(istkbnxepwVar, "<this>");
        return false;
    }
}
