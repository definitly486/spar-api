package a5;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg implements t3.rgvfuqvkyq {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final t3.yggfygwlhe f452wkgbmnqykc = new t3.yggfygwlhe() { // from class: a5.wkgbmnqykc
        @Override // t3.yggfygwlhe
        public final t3.rgvfuqvkyq[] lqeggnwhkg() {
            return eablkybsjg.gxszxtbevo();
        }
    };

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f454ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f453iobyxmoadg = new gxszxtbevo("audio/ac4");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.yadqdtsiqt f455zoijcleaow = new y2.yadqdtsiqt(16384);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t3.rgvfuqvkyq[] gxszxtbevo() {
        return new t3.rgvfuqvkyq[]{new eablkybsjg()};
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(t3.vdvldrhtss vdvldrhtssVar) {
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(10);
        int i13 = 0;
        while (true) {
            vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, 10);
            yadqdtsiqtVar.sopmlzcsov(0);
            if (yadqdtsiqtVar.hcddaimhww() != 4801587) {
                break;
            }
            yadqdtsiqtVar.crxdokpmqz(3);
            int iLmojexxdyd = yadqdtsiqtVar.lmojexxdyd();
            i13 += iLmojexxdyd + 10;
            vdvldrhtssVar.dxjokdxxww(iLmojexxdyd);
        }
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.dxjokdxxww(i13);
        int i14 = 0;
        int i15 = i13;
        while (true) {
            vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, 7);
            yadqdtsiqtVar.sopmlzcsov(0);
            int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
            if (iWypolnanlu == 44096 || iWypolnanlu == 44097) {
                i14++;
                if (i14 >= 4) {
                    return true;
                }
                int iLqeggnwhkg = t3.ppxfxbqfkf.lqeggnwhkg(yadqdtsiqtVar.eablkybsjg(), iWypolnanlu);
                if (iLqeggnwhkg == -1) {
                    return false;
                }
                vdvldrhtssVar.dxjokdxxww(iLqeggnwhkg - 7);
            } else {
                vdvldrhtssVar.gxszxtbevo();
                i15++;
                if (i15 - i13 >= 8192) {
                    return false;
                }
                vdvldrhtssVar.dxjokdxxww(i15);
                i14 = 0;
            }
        }
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        this.f454ppxfxbqfkf = false;
        this.f453iobyxmoadg.ppxfxbqfkf();
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(t3.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f453iobyxmoadg.gxszxtbevo(oxmwwwfdhmVar, new jpowsppfya.wkgbmnqykc(0, 1));
        oxmwwwfdhmVar.agtfadlqog();
        oxmwwwfdhmVar.gxszxtbevo(new t3.pkzmftpjix.zoijcleaow(-9223372036854775807L));
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar) {
        int iZoijcleaow = vdvldrhtssVar.zoijcleaow(this.f455zoijcleaow.eablkybsjg(), 0, 16384);
        if (iZoijcleaow == -1) {
            return -1;
        }
        this.f455zoijcleaow.sopmlzcsov(0);
        this.f455zoijcleaow.ulzqkzuiru(iZoijcleaow);
        if (!this.f454ppxfxbqfkf) {
            this.f453iobyxmoadg.eablkybsjg(0L, 4);
            this.f454ppxfxbqfkf = true;
        }
        this.f453iobyxmoadg.iobyxmoadg(this.f455zoijcleaow);
        return 0;
    }
}
