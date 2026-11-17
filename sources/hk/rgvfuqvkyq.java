package hk;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq extends ek.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f40544iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ik.zoijcleaow f40545zoijcleaow;

    public rgvfuqvkyq(iobyxmoadg lexer, gk.zoijcleaow json) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lexer, "lexer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        this.f40544iobyxmoadg = lexer;
        this.f40545zoijcleaow = json.iobyxmoadg();
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public long agtfadlqog() {
        iobyxmoadg iobyxmoadgVar = this.f40544iobyxmoadg;
        String strVdvldrhtss = iobyxmoadgVar.vdvldrhtss();
        try {
            return mj.hcddaimhww.lqeggnwhkg(strVdvldrhtss);
        } catch (IllegalArgumentException unused) {
            iobyxmoadg.cqumvgiudr(iobyxmoadgVar, "Failed to parse type 'ULong' for input '" + strVdvldrhtss + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ek.ppxfxbqfkf
    public ik.zoijcleaow iobyxmoadg() {
        return this.f40545zoijcleaow;
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public byte lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f40544iobyxmoadg;
        String strVdvldrhtss = iobyxmoadgVar.vdvldrhtss();
        try {
            return mj.hcddaimhww.iobyxmoadg(strVdvldrhtss);
        } catch (IllegalArgumentException unused) {
            iobyxmoadg.cqumvgiudr(iobyxmoadgVar, "Failed to parse type 'UByte' for input '" + strVdvldrhtss + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public int nufgyqmvbu() {
        iobyxmoadg iobyxmoadgVar = this.f40544iobyxmoadg;
        String strVdvldrhtss = iobyxmoadgVar.vdvldrhtss();
        try {
            return mj.hcddaimhww.wkgbmnqykc(strVdvldrhtss);
        } catch (IllegalArgumentException unused) {
            iobyxmoadg.cqumvgiudr(iobyxmoadgVar, "Failed to parse type 'UInt' for input '" + strVdvldrhtss + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ek.ppxfxbqfkf
    public int yadqdtsiqt(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // ek.iobyxmoadg, ek.eablkybsjg
    public short yggfygwlhe() {
        iobyxmoadg iobyxmoadgVar = this.f40544iobyxmoadg;
        String strVdvldrhtss = iobyxmoadgVar.vdvldrhtss();
        try {
            return mj.hcddaimhww.btonecajqb(strVdvldrhtss);
        } catch (IllegalArgumentException unused) {
            iobyxmoadg.cqumvgiudr(iobyxmoadgVar, "Failed to parse type 'UShort' for input '" + strVdvldrhtss + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
