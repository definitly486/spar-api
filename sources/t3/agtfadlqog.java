package t3;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f109354iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f109355ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f109356zoijcleaow;

    private agtfadlqog(int i13, int i14, String str) {
        this.f109354iobyxmoadg = i13;
        this.f109356zoijcleaow = i14;
        this.f109355ppxfxbqfkf = str;
    }

    public static agtfadlqog iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        String str;
        yadqdtsiqtVar.crxdokpmqz(2);
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        int i13 = iWwaezpbzkn >> 1;
        int iWwaezpbzkn2 = ((yadqdtsiqtVar.wwaezpbzkn() >> 3) & 31) | ((iWwaezpbzkn & 1) << 5);
        if (i13 == 4 || i13 == 5 || i13 == 7 || i13 == 8) {
            str = "dvhe";
        } else if (i13 == 9) {
            str = "dvav";
        } else {
            if (i13 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(i13 < 10 ? ".0" : ".");
        sb3.append(i13);
        sb3.append(iWwaezpbzkn2 < 10 ? ".0" : ".");
        sb3.append(iWwaezpbzkn2);
        return new agtfadlqog(i13, iWwaezpbzkn2, sb3.toString());
    }
}
