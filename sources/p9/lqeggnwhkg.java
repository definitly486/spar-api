package p9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class lqeggnwhkg extends vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f76120iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final byte[] f76121zoijcleaow;

    static final class zoijcleaow extends vdvldrhtss.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private byte[] f76122iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private byte[] f76123zoijcleaow;

        zoijcleaow() {
        }

        @Override // p9.vdvldrhtss.iobyxmoadg
        public vdvldrhtss iobyxmoadg() {
            return new lqeggnwhkg(this.f76122iobyxmoadg, this.f76123zoijcleaow);
        }

        @Override // p9.vdvldrhtss.iobyxmoadg
        public vdvldrhtss.iobyxmoadg ppxfxbqfkf(byte[] bArr) {
            this.f76123zoijcleaow = bArr;
            return this;
        }

        @Override // p9.vdvldrhtss.iobyxmoadg
        public vdvldrhtss.iobyxmoadg zoijcleaow(byte[] bArr) {
            this.f76122iobyxmoadg = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        boolean z13 = vdvldrhtssVar instanceof lqeggnwhkg;
        if (Arrays.equals(this.f76120iobyxmoadg, z13 ? ((lqeggnwhkg) vdvldrhtssVar).f76120iobyxmoadg : vdvldrhtssVar.zoijcleaow())) {
            if (Arrays.equals(this.f76121zoijcleaow, z13 ? ((lqeggnwhkg) vdvldrhtssVar).f76121zoijcleaow : vdvldrhtssVar.ppxfxbqfkf())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f76120iobyxmoadg) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f76121zoijcleaow);
    }

    @Override // p9.vdvldrhtss
    public byte[] ppxfxbqfkf() {
        return this.f76121zoijcleaow;
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f76120iobyxmoadg) + ", encryptedBlob=" + Arrays.toString(this.f76121zoijcleaow) + "}";
    }

    @Override // p9.vdvldrhtss
    public byte[] zoijcleaow() {
        return this.f76120iobyxmoadg;
    }

    private lqeggnwhkg(byte[] bArr, byte[] bArr2) {
        this.f76120iobyxmoadg = bArr;
        this.f76121zoijcleaow = bArr2;
    }
}
