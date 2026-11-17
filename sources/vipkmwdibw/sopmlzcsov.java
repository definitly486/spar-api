package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class sopmlzcsov implements cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f117295iobyxmoadg;

    public static final class iobyxmoadg extends ulzqkzuiru {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f117296ppxfxbqfkf;

        public /* synthetic */ iobyxmoadg(Object obj, yadqdtsiqt yadqdtsiqtVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(obj, yadqdtsiqtVar, i13);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.zoijcleaow(), zoijcleaow()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.iobyxmoadg(), iobyxmoadg()) && jyumaefscl.ppxfxbqfkf(iobyxmoadgVar.f117296ppxfxbqfkf, this.f117296ppxfxbqfkf);
        }

        public int hashCode() {
            Object objZoijcleaow = zoijcleaow();
            return ((((objZoijcleaow != null ? objZoijcleaow.hashCode() : 0) * 31) + jyumaefscl.wkgbmnqykc(this.f117296ppxfxbqfkf)) * 31) + iobyxmoadg().hashCode();
        }

        public final int wkgbmnqykc() {
            return this.f117296ppxfxbqfkf;
        }

        public /* synthetic */ iobyxmoadg(Object obj, yadqdtsiqt yadqdtsiqtVar, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(obj, (i14 & 2) != 0 ? lmojexxdyd.wkgbmnqykc() : yadqdtsiqtVar, (i14 & 4) != 0 ? jyumaefscl.f117163iobyxmoadg.iobyxmoadg() : i13, null);
        }

        private iobyxmoadg(Object obj, yadqdtsiqt yadqdtsiqtVar, int i13) {
            super(obj, yadqdtsiqtVar, null);
            this.f117296ppxfxbqfkf = i13;
        }
    }

    public static final class zoijcleaow extends crxdokpmqz {
        public zoijcleaow() {
            super(null);
        }

        public iobyxmoadg gxszxtbevo(Object obj, int i13) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(obj, null, 0, 6, null);
            ppxfxbqfkf().oxmwwwfdhm(i13, iobyxmoadgVar);
            return iobyxmoadgVar;
        }
    }

    public sopmlzcsov(zoijcleaow zoijcleaowVar) {
        this.f117295iobyxmoadg = zoijcleaowVar;
    }

    @Override // vipkmwdibw.cdpycssgdh, vipkmwdibw.gtknphoqwx
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public z iobyxmoadg(ezmngbhpjk ezmngbhpjkVar) {
        long[] jArr;
        int[] iArr;
        int i13;
        androidx.collection.yadqdtsiqt yadqdtsiqtVar = new androidx.collection.yadqdtsiqt(this.f117295iobyxmoadg.ppxfxbqfkf().wkgbmnqykc() + 2);
        androidx.collection.iozdgvuglv iozdgvuglvVar = new androidx.collection.iozdgvuglv(this.f117295iobyxmoadg.ppxfxbqfkf().wkgbmnqykc());
        androidx.collection.iozdgvuglv iozdgvuglvVarPpxfxbqfkf = this.f117295iobyxmoadg.ppxfxbqfkf();
        int[] iArr2 = iozdgvuglvVarPpxfxbqfkf.f4353zoijcleaow;
        Object[] objArr = iozdgvuglvVarPpxfxbqfkf.f4351ppxfxbqfkf;
        long[] jArr2 = iozdgvuglvVarPpxfxbqfkf.f4350iobyxmoadg;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j13 = jArr2[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((255 & j13) < 128) {
                            int i18 = (i14 << 3) + i17;
                            int i19 = iArr2[i18];
                            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) objArr[i18];
                            yadqdtsiqtVar.btonecajqb(i19);
                            iozdgvuglvVar.oxmwwwfdhm(i19, new y((kcexrzcfyt) ezmngbhpjkVar.iobyxmoadg().invoke(iobyxmoadgVar.zoijcleaow()), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.wkgbmnqykc(), null));
                            i13 = 8;
                        } else {
                            i13 = i15;
                        }
                        j13 >>= i13;
                        i17++;
                        i15 = i13;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    if (i16 != i15) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        }
        if (!this.f117295iobyxmoadg.ppxfxbqfkf().iobyxmoadg(0)) {
            yadqdtsiqtVar.dxjokdxxww(0, 0);
        }
        if (!this.f117295iobyxmoadg.ppxfxbqfkf().iobyxmoadg(this.f117295iobyxmoadg.zoijcleaow())) {
            yadqdtsiqtVar.btonecajqb(this.f117295iobyxmoadg.zoijcleaow());
        }
        yadqdtsiqtVar.vdvldrhtss();
        return new z(yadqdtsiqtVar, iozdgvuglvVar, this.f117295iobyxmoadg.zoijcleaow(), this.f117295iobyxmoadg.iobyxmoadg(), lmojexxdyd.wkgbmnqykc(), jyumaefscl.f117163iobyxmoadg.iobyxmoadg(), null);
    }
}
