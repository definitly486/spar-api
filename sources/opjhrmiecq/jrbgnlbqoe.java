package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public abstract class jrbgnlbqoe {
    public static final int iobyxmoadg(CharSequence charSequence, int i13) {
        int length = charSequence.length();
        while (i13 < length) {
            if (charSequence.charAt(i13) == '\n') {
                return i13;
            }
            i13++;
        }
        return charSequence.length();
    }

    public static final long ppxfxbqfkf(CharSequence charSequence, int i13) {
        return j0.m.zoijcleaow(zoijcleaow(charSequence, i13), iobyxmoadg(charSequence, i13));
    }

    public static final int zoijcleaow(CharSequence charSequence, int i13) {
        while (i13 > 0) {
            if (charSequence.charAt(i13 - 1) == '\n') {
                return i13;
            }
            i13--;
        }
        return 0;
    }
}
