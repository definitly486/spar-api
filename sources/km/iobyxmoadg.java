package km;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static String iobyxmoadg(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b13 : bArr) {
            short s13 = (short) (b13 & 255);
            sb3.append("0123456789ABCDEF".charAt((byte) (s13 >> 4)));
            sb3.append("0123456789ABCDEF".charAt((byte) (s13 & 15)));
        }
        return sb3.toString();
    }
}
