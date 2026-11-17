package hk;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public class yadqdtsiqt extends ek.iobyxmoadg implements gk.dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f40550eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private iobyxmoadg f40551gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gk.zoijcleaow f40552iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gk.lqeggnwhkg f40553lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final vdvldrhtss f40554nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final hk.iobyxmoadg f40555ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ik.zoijcleaow f40556wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hkdspvbjdz f40557zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public String f40558iobyxmoadg;

        public iobyxmoadg(String str) {
            this.f40558iobyxmoadg = str;
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f40559iobyxmoadg;

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
            try {
                iArr[hkdspvbjdz.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40559iobyxmoadg = iArr;
        }
    }

    public yadqdtsiqt(gk.zoijcleaow json, hkdspvbjdz mode, hk.iobyxmoadg lexer, dk.gxszxtbevo descriptor, iobyxmoadg iobyxmoadgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lexer, "lexer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        this.f40552iobyxmoadg = json;
        this.f40557zoijcleaow = mode;
        this.f40555ppxfxbqfkf = lexer;
        this.f40556wkgbmnqykc = json.iobyxmoadg();
        this.f40550eablkybsjg = -1;
        this.f40551gxszxtbevo = iobyxmoadgVar;
        gk.lqeggnwhkg lqeggnwhkgVarEablkybsjg = json.eablkybsjg();
        this.f40553lqeggnwhkg = lqeggnwhkgVarEablkybsjg;
        this.f40554nufgyqmvbu = lqeggnwhkgVarEablkybsjg.btonecajqb() ? null : new vdvldrhtss(descriptor);
    }

    private final int cllcsxoeiz() {
        int i13 = this.f40550eablkybsjg;
        boolean zHkdspvbjdz = false;
        boolean z13 = i13 % 2 != 0;
        if (!z13) {
            this.f40555ppxfxbqfkf.draadjrbmk(':');
        } else if (i13 != -1) {
            zHkdspvbjdz = this.f40555ppxfxbqfkf.hkdspvbjdz();
        }
        if (!this.f40555ppxfxbqfkf.eablkybsjg()) {
            if (!zHkdspvbjdz || this.f40552iobyxmoadg.eablkybsjg().wkgbmnqykc()) {
                return -1;
            }
            oxmwwwfdhm.nufgyqmvbu(this.f40555ppxfxbqfkf, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z13) {
            if (this.f40550eablkybsjg == -1) {
                hk.iobyxmoadg iobyxmoadgVar = this.f40555ppxfxbqfkf;
                int i14 = iobyxmoadgVar.f40509iobyxmoadg;
                if (zHkdspvbjdz) {
                    hk.iobyxmoadg.cqumvgiudr(iobyxmoadgVar, "Unexpected leading comma", i14, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                hk.iobyxmoadg iobyxmoadgVar2 = this.f40555ppxfxbqfkf;
                int i15 = iobyxmoadgVar2.f40509iobyxmoadg;
                if (!zHkdspvbjdz) {
                    hk.iobyxmoadg.cqumvgiudr(iobyxmoadgVar2, "Expected comma after the key-value pair", i15, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i16 = this.f40550eablkybsjg + 1;
        this.f40550eablkybsjg = i16;
        return i16;
    }

    private final int dsvhmnatus(dk.gxszxtbevo gxszxtbevoVar) {
        boolean zHkdspvbjdz;
        boolean zHkdspvbjdz2 = this.f40555ppxfxbqfkf.hkdspvbjdz();
        while (true) {
            boolean z13 = true;
            if (!this.f40555ppxfxbqfkf.eablkybsjg()) {
                if (zHkdspvbjdz2 && !this.f40552iobyxmoadg.eablkybsjg().wkgbmnqykc()) {
                    oxmwwwfdhm.nufgyqmvbu(this.f40555ppxfxbqfkf, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                vdvldrhtss vdvldrhtssVar = this.f40554nufgyqmvbu;
                if (vdvldrhtssVar != null) {
                    return vdvldrhtssVar.wkgbmnqykc();
                }
                return -1;
            }
            String strWypolnanlu = wypolnanlu();
            this.f40555ppxfxbqfkf.draadjrbmk(':');
            int iDxjokdxxww = zdlpuopuiu.dxjokdxxww(gxszxtbevoVar, this.f40552iobyxmoadg, strWypolnanlu);
            if (iDxjokdxxww == -3) {
                zHkdspvbjdz = false;
            } else {
                if (!this.f40553lqeggnwhkg.lqeggnwhkg() || !jpowsppfya(gxszxtbevoVar, iDxjokdxxww)) {
                    vdvldrhtss vdvldrhtssVar2 = this.f40554nufgyqmvbu;
                    if (vdvldrhtssVar2 != null) {
                        vdvldrhtssVar2.ppxfxbqfkf(iDxjokdxxww);
                    }
                    return iDxjokdxxww;
                }
                zHkdspvbjdz = this.f40555ppxfxbqfkf.hkdspvbjdz();
                z13 = false;
            }
            zHkdspvbjdz2 = z13 ? stevsuqkhv(strWypolnanlu) : zHkdspvbjdz;
        }
    }

    private final void hcddaimhww() {
        if (this.f40555ppxfxbqfkf.iozdgvuglv() != 4) {
            return;
        }
        hk.iobyxmoadg.cqumvgiudr(this.f40555ppxfxbqfkf, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int hkdspvbjdz() {
        boolean zHkdspvbjdz = this.f40555ppxfxbqfkf.hkdspvbjdz();
        if (!this.f40555ppxfxbqfkf.eablkybsjg()) {
            if (!zHkdspvbjdz || this.f40552iobyxmoadg.eablkybsjg().wkgbmnqykc()) {
                return -1;
            }
            oxmwwwfdhm.lqeggnwhkg(this.f40555ppxfxbqfkf, "array");
            throw new KotlinNothingValueException();
        }
        int i13 = this.f40550eablkybsjg;
        if (i13 != -1 && !zHkdspvbjdz) {
            hk.iobyxmoadg.cqumvgiudr(this.f40555ppxfxbqfkf, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i14 = i13 + 1;
        this.f40550eablkybsjg = i14;
        return i14;
    }

    private final boolean jpowsppfya(dk.gxszxtbevo gxszxtbevoVar, int i13) {
        String strLmojexxdyd;
        gk.zoijcleaow zoijcleaowVar = this.f40552iobyxmoadg;
        boolean zDxjokdxxww = gxszxtbevoVar.dxjokdxxww(i13);
        dk.gxszxtbevo gxszxtbevoVarLqeggnwhkg = gxszxtbevoVar.lqeggnwhkg(i13);
        if (zDxjokdxxww && !gxszxtbevoVarLqeggnwhkg.zoijcleaow() && this.f40555ppxfxbqfkf.cllcsxoeiz(true)) {
            return true;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVarLqeggnwhkg.getKind(), dk.agtfadlqog.zoijcleaow.f29058iobyxmoadg) && ((!gxszxtbevoVarLqeggnwhkg.zoijcleaow() || !this.f40555ppxfxbqfkf.cllcsxoeiz(false)) && (strLmojexxdyd = this.f40555ppxfxbqfkf.lmojexxdyd(this.f40553lqeggnwhkg.vdvldrhtss())) != null)) {
            int iDxjokdxxww = zdlpuopuiu.dxjokdxxww(gxszxtbevoVarLqeggnwhkg, zoijcleaowVar, strLmojexxdyd);
            boolean z13 = !zoijcleaowVar.eablkybsjg().btonecajqb() && gxszxtbevoVarLqeggnwhkg.zoijcleaow();
            if (iDxjokdxxww == -3 && (zDxjokdxxww || z13)) {
                this.f40555ppxfxbqfkf.ojitshcjhn();
                return true;
            }
        }
        return false;
    }

    private final void kegysxyocb(dk.gxszxtbevo gxszxtbevoVar) {
        while (yadqdtsiqt(gxszxtbevoVar) != -1) {
        }
    }

    private final boolean stevsuqkhv(String str) {
        if (this.f40553lqeggnwhkg.gtknphoqwx() || tzroggbefp(this.f40551gxszxtbevo, str)) {
            this.f40555ppxfxbqfkf.ylkuphrtab(this.f40553lqeggnwhkg.vdvldrhtss());
        } else {
            this.f40555ppxfxbqfkf.pmvmpeiblj(str);
        }
        return this.f40555ppxfxbqfkf.hkdspvbjdz();
    }

    private final boolean tzroggbefp(iobyxmoadg iobyxmoadgVar, String str) {
        if (iobyxmoadgVar == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.f40558iobyxmoadg, str)) {
            return false;
        }
        iobyxmoadgVar.f40558iobyxmoadg = null;
        return true;
    }

    private final String wypolnanlu() {
        return this.f40553lqeggnwhkg.vdvldrhtss() ? this.f40555ppxfxbqfkf.oxmwwwfdhm() : this.f40555ppxfxbqfkf.dxjokdxxww();
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public long agtfadlqog() {
        return this.f40555ppxfxbqfkf.wflxmlrfwp();
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public boolean cdpycssgdh() {
        vdvldrhtss vdvldrhtssVar = this.f40554nufgyqmvbu;
        return ((vdvldrhtssVar != null ? vdvldrhtssVar.zoijcleaow() : false) || hk.iobyxmoadg.dsvhmnatus(this.f40555ppxfxbqfkf, false, 1, null)) ? false : true;
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public boolean cqumvgiudr() {
        return this.f40555ppxfxbqfkf.lqeggnwhkg();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0159  */
    /* JADX WARN: Code duplicated, block: B:46:0x015a  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x015a, please report this as an issue */
    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public Object eablkybsjg(bk.iobyxmoadg deserializer) {
        String message;
        gk.iozdgvuglv iozdgvuglvVarBtonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deserializer, "deserializer");
        try {
            if ((deserializer instanceof fk.zoijcleaow) && !this.f40552iobyxmoadg.eablkybsjg().rgvfuqvkyq()) {
                String strPpxfxbqfkf = istkbnxepw.ppxfxbqfkf(((fk.zoijcleaow) deserializer).iobyxmoadg(), this.f40552iobyxmoadg);
                String strYadqdtsiqt = this.f40555ppxfxbqfkf.yadqdtsiqt(strPpxfxbqfkf, this.f40553lqeggnwhkg.vdvldrhtss());
                if (strYadqdtsiqt != null) {
                    try {
                        bk.iobyxmoadg iobyxmoadgVarIobyxmoadg = bk.lqeggnwhkg.iobyxmoadg((fk.zoijcleaow) deserializer, this, strYadqdtsiqt);
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarIobyxmoadg, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                        this.f40551gxszxtbevo = new iobyxmoadg(strPpxfxbqfkf);
                        return iobyxmoadgVarIobyxmoadg.zoijcleaow(this);
                    } catch (SerializationException e13) {
                        String message2 = e13.getMessage();
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(message2);
                        String strHszhottldk = mj.kcexrzcfyt.hszhottldk(mj.kcexrzcfyt.j(message2, '\n', null, 2, null), ".");
                        String message3 = e13.getMessage();
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(message3);
                        hk.iobyxmoadg.cqumvgiudr(this.f40555ppxfxbqfkf, strHszhottldk, 0, mj.kcexrzcfyt.krqnebusok(message3, '\n', ""), 2, null);
                        throw new KotlinNothingValueException();
                    }
                }
                if ((deserializer instanceof fk.zoijcleaow) && !wkgbmnqykc().eablkybsjg().rgvfuqvkyq()) {
                    String strPpxfxbqfkf2 = istkbnxepw.ppxfxbqfkf(((fk.zoijcleaow) deserializer).iobyxmoadg(), wkgbmnqykc());
                    gk.btonecajqb btonecajqbVarLqeggnwhkg = lqeggnwhkg();
                    String strNufgyqmvbu = ((fk.zoijcleaow) deserializer).iobyxmoadg().nufgyqmvbu();
                    if (btonecajqbVarLqeggnwhkg instanceof gk.cdpycssgdh) {
                        gk.cdpycssgdh cdpycssgdhVar = (gk.cdpycssgdh) btonecajqbVarLqeggnwhkg;
                        gk.btonecajqb btonecajqbVar = (gk.btonecajqb) cdpycssgdhVar.get(strPpxfxbqfkf2);
                        try {
                            bk.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = bk.lqeggnwhkg.iobyxmoadg((fk.zoijcleaow) deserializer, this, (btonecajqbVar == null || (iozdgvuglvVarBtonecajqb = gk.gtknphoqwx.btonecajqb(btonecajqbVar)) == null) ? null : gk.gtknphoqwx.gxszxtbevo(iozdgvuglvVarBtonecajqb));
                            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarIobyxmoadg2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                            return jpowsppfya.zoijcleaow(wkgbmnqykc(), strPpxfxbqfkf2, cdpycssgdhVar, iobyxmoadgVarIobyxmoadg2);
                        } catch (SerializationException e14) {
                            String message4 = e14.getMessage();
                            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(message4);
                            throw oxmwwwfdhm.eablkybsjg(-1, message4, cdpycssgdhVar.toString());
                        }
                    }
                    throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.cdpycssgdh.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarLqeggnwhkg.getClass()).jyumaefscl() + " as the serialized body of " + strNufgyqmvbu + " at element: " + this.f40555ppxfxbqfkf.f40512zoijcleaow.iobyxmoadg(), btonecajqbVarLqeggnwhkg.toString());
                }
                return deserializer.zoijcleaow(this);
                message = e.getMessage();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(message);
                if (mj.kcexrzcfyt.sopmlzcsov(message, "at path", false, 2, null)) {
                    throw e;
                }
                throw new MissingFieldException(e.getMissingFields(), e.getMessage() + " at path: " + this.f40555ppxfxbqfkf.f40512zoijcleaow.iobyxmoadg(), e);
            }
            return deserializer.zoijcleaow(this);
        } catch (MissingFieldException e15) {
            message = e15.getMessage();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(message);
            if (mj.kcexrzcfyt.sopmlzcsov(message, "at path", false, 2, null)) {
                throw e15;
            }
            throw new MissingFieldException(e15.getMissingFields(), e15.getMessage() + " at path: " + this.f40555ppxfxbqfkf.f40512zoijcleaow.iobyxmoadg(), e15);
        }
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public char esjtqupxsv() {
        String strVdvldrhtss = this.f40555ppxfxbqfkf.vdvldrhtss();
        if (strVdvldrhtss.length() == 1) {
            return strVdvldrhtss.charAt(0);
        }
        hk.iobyxmoadg.cqumvgiudr(this.f40555ppxfxbqfkf, "Expected single char, but got '" + strVdvldrhtss + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public Void gtknphoqwx() {
        return null;
    }

    @Override // ek.ppxfxbqfkf
    public ik.zoijcleaow iobyxmoadg() {
        return this.f40556wkgbmnqykc;
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public ek.eablkybsjg istkbnxepw(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return lmojexxdyd.zoijcleaow(descriptor) ? new rgvfuqvkyq(this.f40555ppxfxbqfkf, this.f40552iobyxmoadg) : super.istkbnxepw(descriptor);
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public double iwizpuwonk() {
        hk.iobyxmoadg iobyxmoadgVar = this.f40555ppxfxbqfkf;
        String strVdvldrhtss = iobyxmoadgVar.vdvldrhtss();
        try {
            double d13 = Double.parseDouble(strVdvldrhtss);
            if (this.f40552iobyxmoadg.eablkybsjg().zoijcleaow() || !(Double.isInfinite(d13) || Double.isNaN(d13))) {
                return d13;
            }
            oxmwwwfdhm.gtknphoqwx(this.f40555ppxfxbqfkf, Double.valueOf(d13));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            hk.iobyxmoadg.cqumvgiudr(iobyxmoadgVar, "Failed to parse type 'double' for input '" + strVdvldrhtss + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public float jyumaefscl() {
        hk.iobyxmoadg iobyxmoadgVar = this.f40555ppxfxbqfkf;
        String strVdvldrhtss = iobyxmoadgVar.vdvldrhtss();
        try {
            float f13 = Float.parseFloat(strVdvldrhtss);
            if (this.f40552iobyxmoadg.eablkybsjg().zoijcleaow() || !(Float.isInfinite(f13) || Float.isNaN(f13))) {
                return f13;
            }
            oxmwwwfdhm.gtknphoqwx(this.f40555ppxfxbqfkf, Float.valueOf(f13));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            hk.iobyxmoadg.cqumvgiudr(iobyxmoadgVar, "Failed to parse type 'float' for input '" + strVdvldrhtss + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ek.iobyxmoadg, ek.ppxfxbqfkf
    public Object lereixgezr(dk.gxszxtbevo descriptor, int i13, bk.iobyxmoadg deserializer, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deserializer, "deserializer");
        boolean z13 = this.f40557zoijcleaow == hkdspvbjdz.MAP && (i13 & 1) == 0;
        if (z13) {
            this.f40555ppxfxbqfkf.f40512zoijcleaow.wkgbmnqykc();
        }
        Object objLereixgezr = super.lereixgezr(descriptor, i13, deserializer, obj);
        if (z13) {
            this.f40555ppxfxbqfkf.f40512zoijcleaow.gxszxtbevo(objLereixgezr);
        }
        return objLereixgezr;
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public byte lmojexxdyd() {
        long jWflxmlrfwp = this.f40555ppxfxbqfkf.wflxmlrfwp();
        byte b13 = (byte) jWflxmlrfwp;
        if (jWflxmlrfwp == b13) {
            return b13;
        }
        hk.iobyxmoadg.cqumvgiudr(this.f40555ppxfxbqfkf, "Failed to parse byte for input '" + jWflxmlrfwp + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // gk.dxjokdxxww
    public gk.btonecajqb lqeggnwhkg() {
        return new zynmafqrjb(this.f40552iobyxmoadg.eablkybsjg(), this.f40555ppxfxbqfkf).eablkybsjg();
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public int nufgyqmvbu() {
        long jWflxmlrfwp = this.f40555ppxfxbqfkf.wflxmlrfwp();
        int i13 = (int) jWflxmlrfwp;
        if (jWflxmlrfwp == i13) {
            return i13;
        }
        hk.iobyxmoadg.cqumvgiudr(this.f40555ppxfxbqfkf, "Failed to parse int for input '" + jWflxmlrfwp + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public int oxmwwwfdhm(dk.gxszxtbevo enumDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumDescriptor, "enumDescriptor");
        return zdlpuopuiu.btonecajqb(enumDescriptor, this.f40552iobyxmoadg, pmvmpeiblj(), " at path " + this.f40555ppxfxbqfkf.f40512zoijcleaow.iobyxmoadg());
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public String pmvmpeiblj() {
        return this.f40553lqeggnwhkg.vdvldrhtss() ? this.f40555ppxfxbqfkf.oxmwwwfdhm() : this.f40555ppxfxbqfkf.ojitshcjhn();
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public ek.ppxfxbqfkf ppxfxbqfkf(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        hkdspvbjdz hkdspvbjdzVarZoijcleaow = cllcsxoeiz.zoijcleaow(this.f40552iobyxmoadg, descriptor);
        this.f40555ppxfxbqfkf.f40512zoijcleaow.ppxfxbqfkf(descriptor);
        this.f40555ppxfxbqfkf.draadjrbmk(hkdspvbjdzVarZoijcleaow.f40508zdlpuopuiu);
        hcddaimhww();
        int i13 = zoijcleaow.f40559iobyxmoadg[hkdspvbjdzVarZoijcleaow.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            return new yadqdtsiqt(this.f40552iobyxmoadg, hkdspvbjdzVarZoijcleaow, this.f40555ppxfxbqfkf, descriptor, this.f40551gxszxtbevo);
        }
        return (this.f40557zoijcleaow == hkdspvbjdzVarZoijcleaow && this.f40552iobyxmoadg.eablkybsjg().btonecajqb()) ? this : new yadqdtsiqt(this.f40552iobyxmoadg, hkdspvbjdzVarZoijcleaow, this.f40555ppxfxbqfkf, descriptor, this.f40551gxszxtbevo);
    }

    @Override // gk.dxjokdxxww
    public final gk.zoijcleaow wkgbmnqykc() {
        return this.f40552iobyxmoadg;
    }

    @Override // ek.ppxfxbqfkf
    public int yadqdtsiqt(dk.gxszxtbevo descriptor) {
        int iCllcsxoeiz;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        int i13 = zoijcleaow.f40559iobyxmoadg[this.f40557zoijcleaow.ordinal()];
        if (i13 != 2) {
            iCllcsxoeiz = i13 != 4 ? hkdspvbjdz() : dsvhmnatus(descriptor);
        } else {
            iCllcsxoeiz = cllcsxoeiz();
        }
        if (this.f40557zoijcleaow != hkdspvbjdz.MAP) {
            this.f40555ppxfxbqfkf.f40512zoijcleaow.lqeggnwhkg(iCllcsxoeiz);
        }
        return iCllcsxoeiz;
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public short yggfygwlhe() {
        long jWflxmlrfwp = this.f40555ppxfxbqfkf.wflxmlrfwp();
        short s13 = (short) jWflxmlrfwp;
        if (jWflxmlrfwp == s13) {
            return s13;
        }
        hk.iobyxmoadg.cqumvgiudr(this.f40555ppxfxbqfkf, "Failed to parse short for input '" + jWflxmlrfwp + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // ek.iobyxmoadg, ek.ppxfxbqfkf
    public void zoijcleaow(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (this.f40552iobyxmoadg.eablkybsjg().gtknphoqwx() && descriptor.wkgbmnqykc() == 0) {
            kegysxyocb(descriptor);
        }
        if (this.f40555ppxfxbqfkf.hkdspvbjdz() && !this.f40552iobyxmoadg.eablkybsjg().wkgbmnqykc()) {
            oxmwwwfdhm.lqeggnwhkg(this.f40555ppxfxbqfkf, "");
            throw new KotlinNothingValueException();
        }
        this.f40555ppxfxbqfkf.draadjrbmk(this.f40557zoijcleaow.f40507yggfygwlhe);
        this.f40555ppxfxbqfkf.f40512zoijcleaow.zoijcleaow();
    }
}
