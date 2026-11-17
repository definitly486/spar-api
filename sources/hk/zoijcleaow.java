package hk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static final byte iobyxmoadg(char c13) {
        if (c13 < '~') {
            return lqeggnwhkg.f40532ppxfxbqfkf[c13];
        }
        return (byte) 0;
    }

    public static final String ppxfxbqfkf(byte b13) {
        if (b13 == 1) {
            return "quotation mark '\"'";
        }
        if (b13 == 2) {
            return "string escape sequence '\\'";
        }
        if (b13 == 4) {
            return "comma ','";
        }
        if (b13 == 5) {
            return "colon ':'";
        }
        if (b13 == 6) {
            return "start of the object '{'";
        }
        if (b13 == 7) {
            return "end of the object '}'";
        }
        if (b13 == 8) {
            return "start of the array '['";
        }
        if (b13 == 9) {
            return "end of the array ']'";
        }
        if (b13 == 10) {
            return "end of the input";
        }
        return b13 == 127 ? "invalid token" : "valid token";
    }

    public static final char zoijcleaow(int i13) {
        if (i13 < 117) {
            return lqeggnwhkg.f40533zoijcleaow[i13];
        }
        return (char) 0;
    }
}
