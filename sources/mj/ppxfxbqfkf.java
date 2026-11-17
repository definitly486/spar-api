package mj;

/* JADX INFO: loaded from: classes3.dex */
abstract class ppxfxbqfkf extends zoijcleaow {
    public static final boolean gxszxtbevo(char c13, char c14, boolean z13) {
        if (c13 == c14) {
            return true;
        }
        if (!z13) {
            return false;
        }
        char upperCase = Character.toUpperCase(c13);
        char upperCase2 = Character.toUpperCase(c14);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
