package bi;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
final class yggfygwlhe implements zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final yggfygwlhe f16344iobyxmoadg = new yggfygwlhe();

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f16345iobyxmoadg;

        static {
            int[] iArr = new int[gh.draadjrbmk.values().length];
            try {
                iArr[gh.draadjrbmk.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gh.draadjrbmk.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gh.draadjrbmk.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gh.draadjrbmk.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gh.draadjrbmk.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[gh.draadjrbmk.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[gh.draadjrbmk.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[gh.draadjrbmk.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f16345iobyxmoadg = iArr;
        }
    }

    private yggfygwlhe() {
    }

    @Override // bi.zdlpuopuiu
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt wkgbmnqykc(gh.draadjrbmk primitiveType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(primitiveType, "primitiveType");
        switch (iobyxmoadg.f16345iobyxmoadg[primitiveType.ordinal()]) {
            case 1:
                return kcexrzcfyt.f16278iobyxmoadg.iobyxmoadg();
            case 2:
                return kcexrzcfyt.f16278iobyxmoadg.ppxfxbqfkf();
            case 3:
                return kcexrzcfyt.f16278iobyxmoadg.zoijcleaow();
            case 4:
                return kcexrzcfyt.f16278iobyxmoadg.nufgyqmvbu();
            case 5:
                return kcexrzcfyt.f16278iobyxmoadg.gxszxtbevo();
            case 6:
                return kcexrzcfyt.f16278iobyxmoadg.eablkybsjg();
            case 7:
                return kcexrzcfyt.f16278iobyxmoadg.lqeggnwhkg();
            case 8:
                return kcexrzcfyt.f16278iobyxmoadg.wkgbmnqykc();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // bi.zdlpuopuiu
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public String ppxfxbqfkf(kcexrzcfyt type) {
        String strNufgyqmvbu;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        if (type instanceof kcexrzcfyt.iobyxmoadg) {
            return '[' + ppxfxbqfkf(((kcexrzcfyt.iobyxmoadg) type).dxjokdxxww());
        }
        if (type instanceof kcexrzcfyt.wkgbmnqykc) {
            qi.eablkybsjg eablkybsjgVarDxjokdxxww = ((kcexrzcfyt.wkgbmnqykc) type).dxjokdxxww();
            return (eablkybsjgVarDxjokdxxww == null || (strNufgyqmvbu = eablkybsjgVarDxjokdxxww.nufgyqmvbu()) == null) ? "V" : strNufgyqmvbu;
        }
        if (!(type instanceof kcexrzcfyt.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((kcexrzcfyt.ppxfxbqfkf) type).dxjokdxxww() + ';';
    }

    @Override // bi.zdlpuopuiu
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt.ppxfxbqfkf eablkybsjg(String internalName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(internalName, "internalName");
        return new kcexrzcfyt.ppxfxbqfkf(internalName);
    }

    @Override // bi.zdlpuopuiu
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt gxszxtbevo() {
        return eablkybsjg("java/lang/Class");
    }

    @Override // bi.zdlpuopuiu
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt zoijcleaow(kcexrzcfyt possiblyPrimitiveType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof kcexrzcfyt.wkgbmnqykc)) {
            return possiblyPrimitiveType;
        }
        kcexrzcfyt.wkgbmnqykc wkgbmnqykcVar = (kcexrzcfyt.wkgbmnqykc) possiblyPrimitiveType;
        if (wkgbmnqykcVar.dxjokdxxww() == null) {
            return possiblyPrimitiveType;
        }
        String strGxszxtbevo = qi.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVar.dxjokdxxww().draadjrbmk()).gxszxtbevo();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strGxszxtbevo, "getInternalName(...)");
        return eablkybsjg(strGxszxtbevo);
    }

    @Override // bi.zdlpuopuiu
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt iobyxmoadg(String representation) {
        qi.eablkybsjg eablkybsjgVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        qi.eablkybsjg[] eablkybsjgVarArrValues = qi.eablkybsjg.values();
        int length = eablkybsjgVarArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                eablkybsjgVar = null;
                break;
            }
            eablkybsjgVar = eablkybsjgVarArrValues[i13];
            if (eablkybsjgVar.nufgyqmvbu().charAt(0) == cCharAt) {
                break;
            }
            i13++;
        }
        if (eablkybsjgVar != null) {
            return new kcexrzcfyt.wkgbmnqykc(eablkybsjgVar);
        }
        if (cCharAt == 'V') {
            return new kcexrzcfyt.wkgbmnqykc(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
            return new kcexrzcfyt.iobyxmoadg(iobyxmoadg(strSubstring));
        }
        if (cCharAt == 'L') {
            mj.kcexrzcfyt.jhduphickx(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
        return new kcexrzcfyt.ppxfxbqfkf(strSubstring2);
    }
}
