package ob;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ThreadLocal f72518iobyxmoadg = new iobyxmoadg();

    class iobyxmoadg extends ThreadLocal {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return rgvfuqvkyq.zoijcleaow();
        }
    }

    public static byte[] ppxfxbqfkf(int i13) {
        byte[] bArr = new byte[i13];
        ((SecureRandom) f72518iobyxmoadg.get()).nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom zoijcleaow() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
