package bl;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hkdspvbjdz {
    public static final byte[] iobyxmoadg(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        byte[] bytes = str.getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String ppxfxbqfkf(byte[] bArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        return new String(bArr, mj.wkgbmnqykc.f67326zoijcleaow);
    }

    public static final ReentrantLock zoijcleaow() {
        return new ReentrantLock();
    }
}
