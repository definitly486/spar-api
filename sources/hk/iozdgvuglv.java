package hk;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class iozdgvuglv extends ek.zoijcleaow implements gk.zdlpuopuiu {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private String f40513dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ik.zoijcleaow f40514eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gk.lqeggnwhkg f40515gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f40516iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f40517lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private String f40518nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hkdspvbjdz f40519ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gk.zdlpuopuiu[] f40520wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gk.zoijcleaow f40521zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f40522iobyxmoadg;

        static {
            int[] iArr = new int[hkdspvbjdz.values().length];
            try {
                iArr[hkdspvbjdz.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hkdspvbjdz.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hkdspvbjdz.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40522iobyxmoadg = iArr;
        }
    }

    public iozdgvuglv(nufgyqmvbu composer, gk.zoijcleaow json, hkdspvbjdz mode, gk.zdlpuopuiu[] zdlpuopuiuVarArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(composer, "composer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        this.f40516iobyxmoadg = composer;
        this.f40521zoijcleaow = json;
        this.f40519ppxfxbqfkf = mode;
        this.f40520wkgbmnqykc = zdlpuopuiuVarArr;
        this.f40514eablkybsjg = wkgbmnqykc().iobyxmoadg();
        this.f40515gxszxtbevo = wkgbmnqykc().eablkybsjg();
        int iOrdinal = mode.ordinal();
        if (zdlpuopuiuVarArr != null) {
            gk.zdlpuopuiu zdlpuopuiuVar = zdlpuopuiuVarArr[iOrdinal];
            if (zdlpuopuiuVar == null && zdlpuopuiuVar == this) {
                return;
            }
            zdlpuopuiuVarArr[iOrdinal] = this;
        }
    }

    private final void hcddaimhww(String str, String str2) {
        this.f40516iobyxmoadg.ppxfxbqfkf();
        lmojexxdyd(str);
        this.f40516iobyxmoadg.gxszxtbevo(':');
        this.f40516iobyxmoadg.rgvfuqvkyq();
        lmojexxdyd(str2);
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public ek.gxszxtbevo agtfadlqog(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (lmojexxdyd.zoijcleaow(descriptor)) {
            nufgyqmvbu btonecajqbVar = this.f40516iobyxmoadg;
            if (!(btonecajqbVar instanceof btonecajqb)) {
                btonecajqbVar = new btonecajqb(btonecajqbVar.f40534iobyxmoadg, this.f40517lqeggnwhkg);
            }
            return new iozdgvuglv(btonecajqbVar, wkgbmnqykc(), this.f40519ppxfxbqfkf, (gk.zdlpuopuiu[]) null);
        }
        if (lmojexxdyd.iobyxmoadg(descriptor)) {
            nufgyqmvbu dxjokdxxwwVar = this.f40516iobyxmoadg;
            if (!(dxjokdxxwwVar instanceof dxjokdxxww)) {
                dxjokdxxwwVar = new dxjokdxxww(dxjokdxxwwVar.f40534iobyxmoadg, this.f40517lqeggnwhkg);
            }
            return new iozdgvuglv(dxjokdxxwwVar, wkgbmnqykc(), this.f40519ppxfxbqfkf, (gk.zdlpuopuiu[]) null);
        }
        if (this.f40518nufgyqmvbu == null) {
            return super.agtfadlqog(descriptor);
        }
        this.f40513dxjokdxxww = descriptor.nufgyqmvbu();
        return this;
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void cqumvgiudr(short s13) {
        if (this.f40517lqeggnwhkg) {
            lmojexxdyd(String.valueOf((int) s13));
        } else {
            this.f40516iobyxmoadg.draadjrbmk(s13);
        }
    }

    @Override // gk.zdlpuopuiu
    public void draadjrbmk(gk.btonecajqb element) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        if (this.f40518nufgyqmvbu == null || (element instanceof gk.cdpycssgdh)) {
            rgvfuqvkyq(gk.oxmwwwfdhm.f37737iobyxmoadg, element);
        } else {
            istkbnxepw.wkgbmnqykc(this.f40513dxjokdxxww, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void esjtqupxsv(boolean z13) {
        if (this.f40517lqeggnwhkg) {
            lmojexxdyd(String.valueOf(z13));
        } else {
            this.f40516iobyxmoadg.wflxmlrfwp(z13);
        }
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void gxszxtbevo(double d13) {
        if (this.f40517lqeggnwhkg) {
            lmojexxdyd(String.valueOf(d13));
        } else {
            this.f40516iobyxmoadg.lqeggnwhkg(d13);
        }
        if (this.f40515gxszxtbevo.zoijcleaow()) {
            return;
        }
        if (Double.isInfinite(d13) || Double.isNaN(d13)) {
            throw oxmwwwfdhm.zoijcleaow(Double.valueOf(d13), this.f40516iobyxmoadg.f40534iobyxmoadg.toString());
        }
    }

    @Override // ek.gxszxtbevo
    public ik.zoijcleaow iobyxmoadg() {
        return this.f40514eablkybsjg;
    }

    @Override // ek.gxszxtbevo
    public void jyumaefscl() {
        this.f40516iobyxmoadg.gtknphoqwx("null");
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void kcexrzcfyt(long j13) {
        if (this.f40517lqeggnwhkg) {
            lmojexxdyd(String.valueOf(j13));
        } else {
            this.f40516iobyxmoadg.btonecajqb(j13);
        }
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void lereixgezr(float f13) {
        if (this.f40517lqeggnwhkg) {
            lmojexxdyd(String.valueOf(f13));
        } else {
            this.f40516iobyxmoadg.nufgyqmvbu(f13);
        }
        if (this.f40515gxszxtbevo.zoijcleaow()) {
            return;
        }
        if (Float.isInfinite(f13) || Float.isNaN(f13)) {
            throw oxmwwwfdhm.zoijcleaow(Float.valueOf(f13), this.f40516iobyxmoadg.f40534iobyxmoadg.toString());
        }
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void lmojexxdyd(String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        this.f40516iobyxmoadg.agtfadlqog(value);
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void nufgyqmvbu(byte b13) {
        if (this.f40517lqeggnwhkg) {
            lmojexxdyd(String.valueOf((int) b13));
        } else {
            this.f40516iobyxmoadg.eablkybsjg(b13);
        }
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void pmvmpeiblj(char c13) {
        lmojexxdyd(String.valueOf(c13));
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public ek.wkgbmnqykc ppxfxbqfkf(dk.gxszxtbevo descriptor) {
        gk.zdlpuopuiu zdlpuopuiuVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        hkdspvbjdz hkdspvbjdzVarZoijcleaow = cllcsxoeiz.zoijcleaow(wkgbmnqykc(), descriptor);
        char c13 = hkdspvbjdzVarZoijcleaow.f40508zdlpuopuiu;
        if (c13 != 0) {
            this.f40516iobyxmoadg.gxszxtbevo(c13);
            this.f40516iobyxmoadg.zoijcleaow();
        }
        String str = this.f40518nufgyqmvbu;
        if (str != null) {
            String strNufgyqmvbu = this.f40513dxjokdxxww;
            if (strNufgyqmvbu == null) {
                strNufgyqmvbu = descriptor.nufgyqmvbu();
            }
            hcddaimhww(str, strNufgyqmvbu);
            this.f40518nufgyqmvbu = null;
            this.f40513dxjokdxxww = null;
        }
        if (this.f40519ppxfxbqfkf == hkdspvbjdzVarZoijcleaow) {
            return this;
        }
        gk.zdlpuopuiu[] zdlpuopuiuVarArr = this.f40520wkgbmnqykc;
        return (zdlpuopuiuVarArr == null || (zdlpuopuiuVar = zdlpuopuiuVarArr[hkdspvbjdzVarZoijcleaow.ordinal()]) == null) ? new iozdgvuglv(this.f40516iobyxmoadg, wkgbmnqykc(), hkdspvbjdzVarZoijcleaow, this.f40520wkgbmnqykc) : zdlpuopuiuVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void rgvfuqvkyq(bk.agtfadlqog serializer, Object obj) {
        String strPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serializer, "serializer");
        if (wkgbmnqykc().eablkybsjg().rgvfuqvkyq()) {
            serializer.wkgbmnqykc(this, obj);
            return;
        }
        boolean z13 = serializer instanceof fk.zoijcleaow;
        if (!z13) {
            int i13 = istkbnxepw.iobyxmoadg.f40523iobyxmoadg[wkgbmnqykc().eablkybsjg().gxszxtbevo().ordinal()];
            if (i13 != 1 && i13 != 2) {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dk.agtfadlqog kind = serializer.iobyxmoadg().getKind();
                strPpxfxbqfkf = (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind, dk.ojitshcjhn.iobyxmoadg.f29095iobyxmoadg) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kind, dk.ojitshcjhn.wkgbmnqykc.f29097iobyxmoadg)) ? istkbnxepw.ppxfxbqfkf(serializer.iobyxmoadg(), wkgbmnqykc()) : null;
            }
        } else if (wkgbmnqykc().eablkybsjg().gxszxtbevo() != gk.iobyxmoadg.NONE) {
        }
        if (z13) {
            fk.zoijcleaow zoijcleaowVar = (fk.zoijcleaow) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + zoijcleaowVar.iobyxmoadg() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            bk.agtfadlqog agtfadlqogVarZoijcleaow = bk.lqeggnwhkg.zoijcleaow(zoijcleaowVar, this, obj);
            if (strPpxfxbqfkf != null) {
                istkbnxepw.eablkybsjg(serializer, agtfadlqogVarZoijcleaow, strPpxfxbqfkf);
            }
            istkbnxepw.zoijcleaow(agtfadlqogVarZoijcleaow.iobyxmoadg().getKind());
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(agtfadlqogVarZoijcleaow, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = agtfadlqogVarZoijcleaow;
        }
        if (strPpxfxbqfkf != null) {
            String strNufgyqmvbu = serializer.iobyxmoadg().nufgyqmvbu();
            this.f40518nufgyqmvbu = strPpxfxbqfkf;
            this.f40513dxjokdxxww = strNufgyqmvbu;
        }
        serializer.wkgbmnqykc(this, obj);
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void wflxmlrfwp(dk.gxszxtbevo enumDescriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumDescriptor, "enumDescriptor");
        lmojexxdyd(enumDescriptor.eablkybsjg(i13));
    }

    @Override // gk.zdlpuopuiu
    public gk.zoijcleaow wkgbmnqykc() {
        return this.f40521zoijcleaow;
    }

    @Override // ek.zoijcleaow
    public boolean wwaezpbzkn(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        int i14 = iobyxmoadg.f40522iobyxmoadg[this.f40519ppxfxbqfkf.ordinal()];
        if (i14 != 1) {
            boolean z13 = false;
            if (i14 != 2) {
                if (i14 != 3) {
                    if (!this.f40516iobyxmoadg.iobyxmoadg()) {
                        this.f40516iobyxmoadg.gxszxtbevo(',');
                    }
                    this.f40516iobyxmoadg.ppxfxbqfkf();
                    lmojexxdyd(zdlpuopuiu.nufgyqmvbu(descriptor, wkgbmnqykc(), i13));
                    this.f40516iobyxmoadg.gxszxtbevo(':');
                    this.f40516iobyxmoadg.rgvfuqvkyq();
                } else {
                    if (i13 == 0) {
                        this.f40517lqeggnwhkg = true;
                    }
                    if (i13 == 1) {
                        this.f40516iobyxmoadg.gxszxtbevo(',');
                        this.f40516iobyxmoadg.rgvfuqvkyq();
                        this.f40517lqeggnwhkg = false;
                    }
                }
            } else if (this.f40516iobyxmoadg.iobyxmoadg()) {
                this.f40517lqeggnwhkg = true;
                this.f40516iobyxmoadg.ppxfxbqfkf();
            } else {
                if (i13 % 2 == 0) {
                    this.f40516iobyxmoadg.gxszxtbevo(',');
                    this.f40516iobyxmoadg.ppxfxbqfkf();
                    z13 = true;
                } else {
                    this.f40516iobyxmoadg.gxszxtbevo(':');
                    this.f40516iobyxmoadg.rgvfuqvkyq();
                }
                this.f40517lqeggnwhkg = z13;
            }
        } else {
            if (!this.f40516iobyxmoadg.iobyxmoadg()) {
                this.f40516iobyxmoadg.gxszxtbevo(',');
            }
            this.f40516iobyxmoadg.ppxfxbqfkf();
        }
        return true;
    }

    @Override // ek.zoijcleaow, ek.gxszxtbevo
    public void yadqdtsiqt(int i13) {
        if (this.f40517lqeggnwhkg) {
            lmojexxdyd(String.valueOf(i13));
        } else {
            this.f40516iobyxmoadg.dxjokdxxww(i13);
        }
    }

    @Override // ek.zoijcleaow, ek.wkgbmnqykc
    public void yggfygwlhe(dk.gxszxtbevo descriptor, int i13, bk.agtfadlqog serializer, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serializer, "serializer");
        if (obj != null || this.f40515gxszxtbevo.btonecajqb()) {
            super.yggfygwlhe(descriptor, i13, serializer, obj);
        }
    }

    @Override // ek.zoijcleaow, ek.wkgbmnqykc
    public boolean zdlpuopuiu(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return this.f40515gxszxtbevo.dxjokdxxww();
    }

    @Override // ek.zoijcleaow, ek.wkgbmnqykc
    public void zoijcleaow(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (this.f40519ppxfxbqfkf.f40507yggfygwlhe != 0) {
            this.f40516iobyxmoadg.vdvldrhtss();
            this.f40516iobyxmoadg.wkgbmnqykc();
            this.f40516iobyxmoadg.gxszxtbevo(this.f40519ppxfxbqfkf.f40507yggfygwlhe);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iozdgvuglv(ojitshcjhn output, gk.zoijcleaow json, hkdspvbjdz mode, gk.zdlpuopuiu[] modeReuseCache) {
        this(draadjrbmk.iobyxmoadg(output, json), json, mode, modeReuseCache);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(output, "output");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modeReuseCache, "modeReuseCache");
    }
}
