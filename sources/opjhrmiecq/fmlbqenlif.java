package opjhrmiecq;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class fmlbqenlif {
    private static final i2.iobyxmoadg eablkybsjg() {
        if (!i2.iobyxmoadg.wkgbmnqykc()) {
            return null;
        }
        i2.iobyxmoadg.iobyxmoadg();
        throw null;
    }

    private static final int iobyxmoadg(CharSequence charSequence, int i13, int i14) {
        return i13 <= 0 ? i14 : Character.offsetByCodePoints(charSequence, i13, -1);
    }

    public static final int ppxfxbqfkf(String str, int i13) {
        eablkybsjg();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i13);
    }

    public static final int wkgbmnqykc(String str, int i13) {
        eablkybsjg();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i13);
    }

    public static final int zoijcleaow(String str, int i13, int i14) {
        if (i13 <= 0) {
            return i14;
        }
        eablkybsjg();
        return iobyxmoadg(str, i13, i14);
    }
}
