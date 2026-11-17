package l0;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CharSequence f61203iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dxjokdxxww f61204zoijcleaow;

    public btonecajqb(CharSequence charSequence, dxjokdxxww dxjokdxxwwVar) {
        this.f61203iobyxmoadg = charSequence;
        this.f61204zoijcleaow = dxjokdxxwwVar;
    }

    @Override // l0.gxszxtbevo
    public int iobyxmoadg(int i13) {
        do {
            i13 = this.f61204zoijcleaow.rgvfuqvkyq(i13);
            if (i13 == -1 || i13 == this.f61203iobyxmoadg.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f61203iobyxmoadg.charAt(i13)));
        return i13;
    }

    @Override // l0.gxszxtbevo
    public int ppxfxbqfkf(int i13) {
        do {
            i13 = this.f61204zoijcleaow.rgvfuqvkyq(i13);
            if (i13 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f61203iobyxmoadg.charAt(i13 - 1)));
        return i13;
    }

    @Override // l0.gxszxtbevo
    public int wkgbmnqykc(int i13) {
        do {
            i13 = this.f61204zoijcleaow.vdvldrhtss(i13);
            if (i13 == -1 || i13 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f61203iobyxmoadg.charAt(i13 - 1)));
        return i13;
    }

    @Override // l0.gxszxtbevo
    public int zoijcleaow(int i13) {
        do {
            i13 = this.f61204zoijcleaow.vdvldrhtss(i13);
            if (i13 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f61203iobyxmoadg.charAt(i13)));
        return i13;
    }
}
