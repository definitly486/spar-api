package krqnebusok;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
final class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f60502iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f60503zoijcleaow;

    public yggfygwlhe(String str) {
        this.f60502iobyxmoadg = str;
    }

    public static /* synthetic */ void zoijcleaow(yggfygwlhe yggfygwlheVar, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 1;
        }
        yggfygwlheVar.iobyxmoadg(i13);
    }

    public final int btonecajqb(String str) throws kcexrzcfyt {
        Integer numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(gtknphoqwx(str));
        if (numVdvldrhtss != null) {
            return numVdvldrhtss.intValue();
        }
        wflxmlrfwp("expected int");
        throw new KotlinNothingValueException();
    }

    public final String draadjrbmk() {
        String str = this.f60502iobyxmoadg;
        String strSubstring = str.substring(this.f60503zoijcleaow, str.length());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void dxjokdxxww(String str) {
        while (this.f60503zoijcleaow < this.f60502iobyxmoadg.length() && !mj.kcexrzcfyt.ulzqkzuiru(str, this.f60502iobyxmoadg.charAt(this.f60503zoijcleaow), false, 2, null)) {
            this.f60503zoijcleaow++;
        }
    }

    public final void eablkybsjg(char c13) throws kcexrzcfyt {
        if (nufgyqmvbu(c13)) {
            return;
        }
        wflxmlrfwp("expected " + c13);
        throw new KotlinNothingValueException();
    }

    public final String gtknphoqwx(String str) {
        int i13 = this.f60503zoijcleaow;
        dxjokdxxww(str);
        int i14 = this.f60503zoijcleaow;
        if (i14 <= i13) {
            return "";
        }
        String strSubstring = this.f60502iobyxmoadg.substring(i13, i14);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String gxszxtbevo() {
        return this.f60502iobyxmoadg;
    }

    public final void iobyxmoadg(int i13) {
        this.f60503zoijcleaow += i13;
    }

    public final int lqeggnwhkg() {
        return this.f60503zoijcleaow;
    }

    public final boolean nufgyqmvbu(char c13) {
        return this.f60503zoijcleaow < this.f60502iobyxmoadg.length() && this.f60502iobyxmoadg.charAt(this.f60503zoijcleaow) == c13;
    }

    public final boolean ppxfxbqfkf() {
        return this.f60503zoijcleaow >= this.f60502iobyxmoadg.length();
    }

    public final Void wflxmlrfwp(String str) throws kcexrzcfyt {
        int iMin = Math.min(this.f60503zoijcleaow, this.f60502iobyxmoadg.length());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Error while parsing source information: ");
        sb3.append(str);
        sb3.append(" at ");
        String strSubstring = this.f60502iobyxmoadg.substring(0, iMin);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        sb3.append(strSubstring);
        sb3.append('|');
        String strSubstring2 = this.f60502iobyxmoadg.substring(iMin);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
        sb3.append(strSubstring2);
        throw new kcexrzcfyt(sb3.toString());
    }

    public final char wkgbmnqykc() {
        return this.f60502iobyxmoadg.charAt(this.f60503zoijcleaow);
    }
}
