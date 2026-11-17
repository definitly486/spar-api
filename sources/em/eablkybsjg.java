package em;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final eablkybsjg f31438eablkybsjg = new eablkybsjg('0', '+', '-', '.');

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final ConcurrentMap f31439gxszxtbevo = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final char f31440iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final char f31441ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final char f31442wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final char f31443zoijcleaow;

    private eablkybsjg(char c13, char c14, char c15, char c16) {
        this.f31440iobyxmoadg = c13;
        this.f31443zoijcleaow = c14;
        this.f31441ppxfxbqfkf = c15;
        this.f31442wkgbmnqykc = c16;
    }

    public char eablkybsjg() {
        return this.f31440iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f31440iobyxmoadg == eablkybsjgVar.f31440iobyxmoadg && this.f31443zoijcleaow == eablkybsjgVar.f31443zoijcleaow && this.f31441ppxfxbqfkf == eablkybsjgVar.f31441ppxfxbqfkf && this.f31442wkgbmnqykc == eablkybsjgVar.f31442wkgbmnqykc;
    }

    public int hashCode() {
        return this.f31440iobyxmoadg + this.f31443zoijcleaow + this.f31441ppxfxbqfkf + this.f31442wkgbmnqykc;
    }

    String iobyxmoadg(String str) {
        char c13 = this.f31440iobyxmoadg;
        if (c13 == '0') {
            return str;
        }
        int i13 = c13 - '0';
        char[] charArray = str.toCharArray();
        for (int i14 = 0; i14 < charArray.length; i14++) {
            charArray[i14] = (char) (charArray[i14] + i13);
        }
        return new String(charArray);
    }

    public char ppxfxbqfkf() {
        return this.f31441ppxfxbqfkf;
    }

    public String toString() {
        return "DecimalStyle[" + this.f31440iobyxmoadg + this.f31443zoijcleaow + this.f31441ppxfxbqfkf + this.f31442wkgbmnqykc + "]";
    }

    public char wkgbmnqykc() {
        return this.f31443zoijcleaow;
    }

    public char zoijcleaow() {
        return this.f31442wkgbmnqykc;
    }
}
