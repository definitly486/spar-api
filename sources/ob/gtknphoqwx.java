package ob;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtknphoqwx {
    public static byte[] iobyxmoadg(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i13 * 2;
            int iDigit = Character.digit(str.charAt(i14), 16);
            int iDigit2 = Character.digit(str.charAt(i14 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i13] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static String zoijcleaow(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b13 : bArr) {
            int i13 = b13 & 255;
            sb3.append("0123456789abcdef".charAt(i13 / 16));
            sb3.append("0123456789abcdef".charAt(i13 % 16));
        }
        return sb3.toString();
    }
}
