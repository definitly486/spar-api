package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final byte[] f60049iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final ByteBuffer f60050zoijcleaow;

    public interface iobyxmoadg {
        int getNumber();
    }

    public interface zoijcleaow {
        iobyxmoadg findValueByNumber(int i13);
    }

    static {
        byte[] bArr = new byte[0];
        f60049iobyxmoadg = bArr;
        f60050zoijcleaow = ByteBuffer.wrap(bArr);
    }

    public static boolean iobyxmoadg(byte[] bArr) {
        return yggfygwlhe.eablkybsjg(bArr);
    }

    public static String zoijcleaow(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException("UTF-8 not supported?", e13);
        }
    }
}
