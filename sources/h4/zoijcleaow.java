package h4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow extends dxjokdxxww {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final byte[] f39381zoijcleaow;

    public zoijcleaow(String str, byte[] bArr) {
        super(str);
        this.f39381zoijcleaow = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zoijcleaow.class != obj.getClass()) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f39346iobyxmoadg.equals(zoijcleaowVar.f39346iobyxmoadg) && Arrays.equals(this.f39381zoijcleaow, zoijcleaowVar.f39381zoijcleaow);
    }

    public int hashCode() {
        return ((527 + this.f39346iobyxmoadg.hashCode()) * 31) + Arrays.hashCode(this.f39381zoijcleaow);
    }
}
