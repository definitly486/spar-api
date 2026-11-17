package q9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc extends rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f78307iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final o9.gxszxtbevo f78308ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final byte[] f78309zoijcleaow;

    static final class zoijcleaow extends rgvfuqvkyq.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f78310iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private o9.gxszxtbevo f78311ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private byte[] f78312zoijcleaow;

        zoijcleaow() {
        }

        @Override // q9.rgvfuqvkyq.iobyxmoadg
        public rgvfuqvkyq iobyxmoadg() {
            String str = "";
            if (this.f78310iobyxmoadg == null) {
                str = " backendName";
            }
            if (this.f78311ppxfxbqfkf == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new wkgbmnqykc(this.f78310iobyxmoadg, this.f78312zoijcleaow, this.f78311ppxfxbqfkf);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // q9.rgvfuqvkyq.iobyxmoadg
        public rgvfuqvkyq.iobyxmoadg ppxfxbqfkf(byte[] bArr) {
            this.f78312zoijcleaow = bArr;
            return this;
        }

        @Override // q9.rgvfuqvkyq.iobyxmoadg
        public rgvfuqvkyq.iobyxmoadg wkgbmnqykc(o9.gxszxtbevo gxszxtbevoVar) {
            if (gxszxtbevoVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f78311ppxfxbqfkf = gxszxtbevoVar;
            return this;
        }

        @Override // q9.rgvfuqvkyq.iobyxmoadg
        public rgvfuqvkyq.iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f78310iobyxmoadg = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        if (this.f78307iobyxmoadg.equals(rgvfuqvkyqVar.zoijcleaow())) {
            if (Arrays.equals(this.f78309zoijcleaow, rgvfuqvkyqVar instanceof wkgbmnqykc ? ((wkgbmnqykc) rgvfuqvkyqVar).f78309zoijcleaow : rgvfuqvkyqVar.ppxfxbqfkf()) && this.f78308ppxfxbqfkf.equals(rgvfuqvkyqVar.wkgbmnqykc())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f78307iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f78309zoijcleaow)) * 1000003) ^ this.f78308ppxfxbqfkf.hashCode();
    }

    @Override // q9.rgvfuqvkyq
    public byte[] ppxfxbqfkf() {
        return this.f78309zoijcleaow;
    }

    @Override // q9.rgvfuqvkyq
    public o9.gxszxtbevo wkgbmnqykc() {
        return this.f78308ppxfxbqfkf;
    }

    @Override // q9.rgvfuqvkyq
    public String zoijcleaow() {
        return this.f78307iobyxmoadg;
    }

    private wkgbmnqykc(String str, byte[] bArr, o9.gxszxtbevo gxszxtbevoVar) {
        this.f78307iobyxmoadg = str;
        this.f78309zoijcleaow = bArr;
        this.f78308ppxfxbqfkf = gxszxtbevoVar;
    }
}
