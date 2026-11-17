package h4;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp extends dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final byte[] f39374ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f39375zoijcleaow;

    public wflxmlrfwp(String str, byte[] bArr) {
        super("PRIV");
        this.f39375zoijcleaow = str;
        this.f39374ppxfxbqfkf = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wflxmlrfwp.class != obj.getClass()) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return Objects.equals(this.f39375zoijcleaow, wflxmlrfwpVar.f39375zoijcleaow) && Arrays.equals(this.f39374ppxfxbqfkf, wflxmlrfwpVar.f39374ppxfxbqfkf);
    }

    public int hashCode() {
        String str = this.f39375zoijcleaow;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f39374ppxfxbqfkf);
    }

    @Override // h4.dxjokdxxww
    public String toString() {
        return this.f39346iobyxmoadg + ": owner=" + this.f39375zoijcleaow;
    }
}
