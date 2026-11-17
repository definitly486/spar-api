package a5;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements t3.rgvfuqvkyq {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final t3.yggfygwlhe f807wkgbmnqykc = new t3.yggfygwlhe() { // from class: a5.iobyxmoadg
        @Override // t3.yggfygwlhe
        public final t3.rgvfuqvkyq[] lqeggnwhkg() {
            return zoijcleaow.gxszxtbevo();
        }
    };

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f809ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f808iobyxmoadg = new ppxfxbqfkf("audio/ac3");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.yadqdtsiqt f810zoijcleaow = new y2.yadqdtsiqt(2786);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t3.rgvfuqvkyq[] gxszxtbevo() {
        return new t3.rgvfuqvkyq[]{new zoijcleaow()};
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
            vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, 6);
            yadqdtsiqtVar.sopmlzcsov(0);
            if (yadqdtsiqtVar.wypolnanlu() != 2935) {
                vdvldrhtssVar.gxszxtbevo();
                i15++;
                if (i15 - i13 >= 8192) {
                    return false;
                }
                vdvldrhtssVar.dxjokdxxww(i15);
                i14 = 0;
            } else {
                i14++;
                if (i14 >= 4) {
                    return true;
                }
                int iLqeggnwhkg = t3.zoijcleaow.lqeggnwhkg(yadqdtsiqtVar.eablkybsjg());
                if (iLqeggnwhkg == -1) {
                    return false;
                }
                vdvldrhtssVar.dxjokdxxww(iLqeggnwhkg - 6);
            }
        }
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        this.f809ppxfxbqfkf = false;
        this.f808iobyxmoadg.ppxfxbqfkf();
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(t3.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f808iobyxmoadg.gxszxtbevo(oxmwwwfdhmVar, new jpowsppfya.wkgbmnqykc(0, 1));
        oxmwwwfdhmVar.agtfadlqog();
        oxmwwwfdhmVar.gxszxtbevo(new t3.pkzmftpjix.zoijcleaow(-9223372036854775807L));
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar) {
        int iZoijcleaow = vdvldrhtssVar.zoijcleaow(this.f810zoijcleaow.eablkybsjg(), 0, 2786);
        if (iZoijcleaow == -1) {
            return -1;
        }
        this.f810zoijcleaow.sopmlzcsov(0);
        this.f810zoijcleaow.ulzqkzuiru(iZoijcleaow);
        if (!this.f809ppxfxbqfkf) {
            this.f808iobyxmoadg.eablkybsjg(0L, 4);
            this.f809ppxfxbqfkf = true;
        }
        this.f808iobyxmoadg.iobyxmoadg(this.f810zoijcleaow);
        return 0;
    }
}
