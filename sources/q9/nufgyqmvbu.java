package q9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o9.ppxfxbqfkf f78291iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final byte[] f78292zoijcleaow;

    public nufgyqmvbu(o9.ppxfxbqfkf ppxfxbqfkfVar, byte[] bArr) {
        if (ppxfxbqfkfVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f78291iobyxmoadg = ppxfxbqfkfVar;
        this.f78292zoijcleaow = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        if (this.f78291iobyxmoadg.equals(nufgyqmvbuVar.f78291iobyxmoadg)) {
            return Arrays.equals(this.f78292zoijcleaow, nufgyqmvbuVar.f78292zoijcleaow);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f78291iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f78292zoijcleaow);
    }

    public byte[] iobyxmoadg() {
        return this.f78292zoijcleaow;
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f78291iobyxmoadg + ", bytes=[...]}";
    }

    public o9.ppxfxbqfkf zoijcleaow() {
        return this.f78291iobyxmoadg;
    }
}
