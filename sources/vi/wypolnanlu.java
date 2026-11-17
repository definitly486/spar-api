package vi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wypolnanlu {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f116990iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f116991ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f116992zoijcleaow;

        static {
            int[] iArr = new int[di.btonecajqb.values().length];
            try {
                iArr[di.btonecajqb.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[di.btonecajqb.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[di.btonecajqb.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[di.btonecajqb.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f116990iobyxmoadg = iArr;
            int[] iArr2 = new int[jh.zoijcleaow.iobyxmoadg.values().length];
            try {
                iArr2[jh.zoijcleaow.iobyxmoadg.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[jh.zoijcleaow.iobyxmoadg.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[jh.zoijcleaow.iobyxmoadg.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[jh.zoijcleaow.iobyxmoadg.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f116992zoijcleaow = iArr2;
            int[] iArr3 = new int[di.cqumvgiudr.values().length];
            try {
                iArr3[di.cqumvgiudr.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[di.cqumvgiudr.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[di.cqumvgiudr.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[di.cqumvgiudr.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[di.cqumvgiudr.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[di.cqumvgiudr.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f116991ppxfxbqfkf = iArr3;
        }
    }

    public static final jh.yggfygwlhe iobyxmoadg(dsvhmnatus dsvhmnatusVar, di.cqumvgiudr cqumvgiudrVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dsvhmnatusVar, "<this>");
        switch (cqumvgiudrVar == null ? -1 : iobyxmoadg.f116991ppxfxbqfkf[cqumvgiudrVar.ordinal()]) {
            case 1:
                jh.yggfygwlhe INTERNAL = jh.zdlpuopuiu.f51365wkgbmnqykc;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                jh.yggfygwlhe PRIVATE = jh.zdlpuopuiu.f51357iobyxmoadg;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                jh.yggfygwlhe PRIVATE_TO_THIS = jh.zdlpuopuiu.f51366zoijcleaow;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                jh.yggfygwlhe PROTECTED = jh.zdlpuopuiu.f51361ppxfxbqfkf;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                jh.yggfygwlhe PUBLIC = jh.zdlpuopuiu.f51354eablkybsjg;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                jh.yggfygwlhe LOCAL = jh.zdlpuopuiu.f51356gxszxtbevo;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(LOCAL, "LOCAL");
                return LOCAL;
            default:
                jh.yggfygwlhe PRIVATE2 = jh.zdlpuopuiu.f51357iobyxmoadg;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final jh.zoijcleaow.iobyxmoadg zoijcleaow(dsvhmnatus dsvhmnatusVar, di.btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dsvhmnatusVar, "<this>");
        int i13 = btonecajqbVar == null ? -1 : iobyxmoadg.f116990iobyxmoadg[btonecajqbVar.ordinal()];
        if (i13 == 1) {
            return jh.zoijcleaow.iobyxmoadg.DECLARATION;
        }
        if (i13 == 2) {
            return jh.zoijcleaow.iobyxmoadg.FAKE_OVERRIDE;
        }
        if (i13 != 3) {
            return i13 != 4 ? jh.zoijcleaow.iobyxmoadg.DECLARATION : jh.zoijcleaow.iobyxmoadg.SYNTHESIZED;
        }
        return jh.zoijcleaow.iobyxmoadg.DELEGATION;
    }
}
