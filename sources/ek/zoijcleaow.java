package ek;

import bk.agtfadlqog;
import fk.jhduphickx;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow implements gxszxtbevo, wkgbmnqykc {
    @Override // ek.gxszxtbevo
    public gxszxtbevo agtfadlqog(dk.gxszxtbevo descriptor) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return this;
    }

    @Override // ek.wkgbmnqykc
    public final void btonecajqb(dk.gxszxtbevo descriptor, int i13, byte b13) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (wwaezpbzkn(descriptor, i13)) {
            nufgyqmvbu(b13);
        }
    }

    @Override // ek.wkgbmnqykc
    public final void cdpycssgdh(dk.gxszxtbevo descriptor, int i13, char c13) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (wwaezpbzkn(descriptor, i13)) {
            pmvmpeiblj(c13);
        }
    }

    @Override // ek.gxszxtbevo
    public void cqumvgiudr(short s13) {
        pkzmftpjix(Short.valueOf(s13));
    }

    @Override // ek.wkgbmnqykc
    public final void dxjokdxxww(dk.gxszxtbevo descriptor, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (wwaezpbzkn(descriptor, i13)) {
            esjtqupxsv(z13);
        }
    }

    @Override // ek.wkgbmnqykc
    public final gxszxtbevo eablkybsjg(dk.gxszxtbevo descriptor, int i13) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return wwaezpbzkn(descriptor, i13) ? agtfadlqog(descriptor.lqeggnwhkg(i13)) : jhduphickx.f34181iobyxmoadg;
    }

    @Override // ek.gxszxtbevo
    public void esjtqupxsv(boolean z13) {
        pkzmftpjix(Boolean.valueOf(z13));
    }

    @Override // ek.wkgbmnqykc
    public final void gtknphoqwx(dk.gxszxtbevo descriptor, int i13, float f13) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (wwaezpbzkn(descriptor, i13)) {
            lereixgezr(f13);
        }
    }

    @Override // ek.gxszxtbevo
    public void gxszxtbevo(double d13) {
        pkzmftpjix(Double.valueOf(d13));
    }

    @Override // ek.gxszxtbevo
    public wkgbmnqykc iozdgvuglv(dk.gxszxtbevo gxszxtbevoVar, int i13) {
        return gxszxtbevo.iobyxmoadg.iobyxmoadg(this, gxszxtbevoVar, i13);
    }

    @Override // ek.wkgbmnqykc
    public final void istkbnxepw(dk.gxszxtbevo descriptor, int i13, String value) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        zdlpuopuiu.btonecajqb(value, "value");
        if (wwaezpbzkn(descriptor, i13)) {
            lmojexxdyd(value);
        }
    }

    @Override // ek.wkgbmnqykc
    public final void iwizpuwonk(dk.gxszxtbevo descriptor, int i13, short s13) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (wwaezpbzkn(descriptor, i13)) {
            cqumvgiudr(s13);
        }
    }

    @Override // ek.gxszxtbevo
    public void kcexrzcfyt(long j13) {
        pkzmftpjix(Long.valueOf(j13));
    }

    @Override // ek.gxszxtbevo
    public void lereixgezr(float f13) {
        pkzmftpjix(Float.valueOf(f13));
    }

    @Override // ek.gxszxtbevo
    public void lmojexxdyd(String value) {
        zdlpuopuiu.btonecajqb(value, "value");
        pkzmftpjix(value);
    }

    @Override // ek.wkgbmnqykc
    public void lqeggnwhkg(dk.gxszxtbevo descriptor, int i13, agtfadlqog serializer, Object obj) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        zdlpuopuiu.btonecajqb(serializer, "serializer");
        if (wwaezpbzkn(descriptor, i13)) {
            rgvfuqvkyq(serializer, obj);
        }
    }

    @Override // ek.gxszxtbevo
    public void nufgyqmvbu(byte b13) {
        pkzmftpjix(Byte.valueOf(b13));
    }

    @Override // ek.wkgbmnqykc
    public final void ojitshcjhn(dk.gxszxtbevo descriptor, int i13, double d13) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (wwaezpbzkn(descriptor, i13)) {
            gxszxtbevo(d13);
        }
    }

    @Override // ek.wkgbmnqykc
    public final void oxmwwwfdhm(dk.gxszxtbevo descriptor, int i13, int i14) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (wwaezpbzkn(descriptor, i13)) {
            yadqdtsiqt(i14);
        }
    }

    public void pkzmftpjix(Object value) {
        zdlpuopuiu.btonecajqb(value, "value");
        throw new SerializationException("Non-serializable " + cllcsxoeiz.zoijcleaow(value.getClass()) + " is not supported by " + cllcsxoeiz.zoijcleaow(getClass()) + " encoder");
    }

    @Override // ek.gxszxtbevo
    public void pmvmpeiblj(char c13) {
        pkzmftpjix(Character.valueOf(c13));
    }

    @Override // ek.gxszxtbevo
    public wkgbmnqykc ppxfxbqfkf(dk.gxszxtbevo descriptor) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return this;
    }

    @Override // ek.gxszxtbevo
    public void rgvfuqvkyq(agtfadlqog agtfadlqogVar, Object obj) {
        gxszxtbevo.iobyxmoadg.wkgbmnqykc(this, agtfadlqogVar, obj);
    }

    @Override // ek.wkgbmnqykc
    public final void vdvldrhtss(dk.gxszxtbevo descriptor, int i13, long j13) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (wwaezpbzkn(descriptor, i13)) {
            kcexrzcfyt(j13);
        }
    }

    @Override // ek.gxszxtbevo
    public void wflxmlrfwp(dk.gxszxtbevo enumDescriptor, int i13) {
        zdlpuopuiu.btonecajqb(enumDescriptor, "enumDescriptor");
        pkzmftpjix(Integer.valueOf(i13));
    }

    public boolean wwaezpbzkn(dk.gxszxtbevo descriptor, int i13) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return true;
    }

    @Override // ek.gxszxtbevo
    public void yadqdtsiqt(int i13) {
        pkzmftpjix(Integer.valueOf(i13));
    }

    @Override // ek.wkgbmnqykc
    public void yggfygwlhe(dk.gxszxtbevo descriptor, int i13, agtfadlqog serializer, Object obj) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        zdlpuopuiu.btonecajqb(serializer, "serializer");
        if (wwaezpbzkn(descriptor, i13)) {
            ylkuphrtab(serializer, obj);
        }
    }

    public void ylkuphrtab(agtfadlqog agtfadlqogVar, Object obj) {
        gxszxtbevo.iobyxmoadg.ppxfxbqfkf(this, agtfadlqogVar, obj);
    }

    @Override // ek.wkgbmnqykc
    public boolean zdlpuopuiu(dk.gxszxtbevo gxszxtbevoVar, int i13) {
        return wkgbmnqykc.iobyxmoadg.iobyxmoadg(this, gxszxtbevoVar, i13);
    }

    @Override // ek.wkgbmnqykc
    public void zoijcleaow(dk.gxszxtbevo descriptor) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
    }

    @Override // ek.gxszxtbevo
    public void zynmafqrjb() {
        gxszxtbevo.iobyxmoadg.zoijcleaow(this);
    }
}
