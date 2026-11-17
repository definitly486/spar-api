package r9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Iterable f82198iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final byte[] f82199zoijcleaow;

    static final class zoijcleaow extends gxszxtbevo.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Iterable f82200iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private byte[] f82201zoijcleaow;

        zoijcleaow() {
        }

        @Override // r9.gxszxtbevo.iobyxmoadg
        public gxszxtbevo iobyxmoadg() {
            String str = "";
            if (this.f82200iobyxmoadg == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new iobyxmoadg(this.f82200iobyxmoadg, this.f82201zoijcleaow);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r9.gxszxtbevo.iobyxmoadg
        public gxszxtbevo.iobyxmoadg ppxfxbqfkf(byte[] bArr) {
            this.f82201zoijcleaow = bArr;
            return this;
        }

        @Override // r9.gxszxtbevo.iobyxmoadg
        public gxszxtbevo.iobyxmoadg zoijcleaow(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f82200iobyxmoadg = iterable;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        if (this.f82198iobyxmoadg.equals(gxszxtbevoVar.zoijcleaow())) {
            if (Arrays.equals(this.f82199zoijcleaow, gxszxtbevoVar instanceof iobyxmoadg ? ((iobyxmoadg) gxszxtbevoVar).f82199zoijcleaow : gxszxtbevoVar.ppxfxbqfkf())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f82198iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f82199zoijcleaow);
    }

    @Override // r9.gxszxtbevo
    public byte[] ppxfxbqfkf() {
        return this.f82199zoijcleaow;
    }

    public String toString() {
        return "BackendRequest{events=" + this.f82198iobyxmoadg + ", extras=" + Arrays.toString(this.f82199zoijcleaow) + "}";
    }

    @Override // r9.gxszxtbevo
    public Iterable zoijcleaow() {
        return this.f82198iobyxmoadg;
    }

    private iobyxmoadg(Iterable iterable, byte[] bArr) {
        this.f82198iobyxmoadg = iterable;
        this.f82199zoijcleaow = bArr;
    }
}
