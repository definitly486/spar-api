package se;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends lqeggnwhkg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final short f106048ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final short f106049wkgbmnqykc;

    zoijcleaow(lqeggnwhkg lqeggnwhkgVar, int i13, int i14) {
        super(lqeggnwhkgVar);
        this.f106048ppxfxbqfkf = (short) i13;
        this.f106049wkgbmnqykc = (short) i14;
    }

    @Override // se.lqeggnwhkg
    public void ppxfxbqfkf(te.iobyxmoadg iobyxmoadgVar, byte[] bArr) {
        int i13 = 0;
        while (true) {
            short s13 = this.f106049wkgbmnqykc;
            if (i13 >= s13) {
                return;
            }
            if (i13 == 0 || (i13 == 31 && s13 <= 62)) {
                iobyxmoadgVar.ppxfxbqfkf(31, 5);
                short s14 = this.f106049wkgbmnqykc;
                if (s14 > 62) {
                    iobyxmoadgVar.ppxfxbqfkf(s14 - 31, 16);
                } else if (i13 == 0) {
                    iobyxmoadgVar.ppxfxbqfkf(Math.min((int) s14, 31), 5);
                } else {
                    iobyxmoadgVar.ppxfxbqfkf(s14 - 31, 5);
                }
            }
            iobyxmoadgVar.ppxfxbqfkf(bArr[this.f106048ppxfxbqfkf + i13], 8);
            i13++;
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append((int) this.f106048ppxfxbqfkf);
        sb3.append("::");
        sb3.append((this.f106048ppxfxbqfkf + this.f106049wkgbmnqykc) - 1);
        sb3.append('>');
        return sb3.toString();
    }
}
