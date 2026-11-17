package ek;

import bk.agtfadlqog;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg {
        public static wkgbmnqykc iobyxmoadg(gxszxtbevo gxszxtbevoVar, dk.gxszxtbevo descriptor, int i13) {
            zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            return gxszxtbevoVar.ppxfxbqfkf(descriptor);
        }

        public static void ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, agtfadlqog serializer, Object obj) {
            zdlpuopuiu.btonecajqb(serializer, "serializer");
            if (serializer.iobyxmoadg().zoijcleaow()) {
                gxszxtbevoVar.rgvfuqvkyq(serializer, obj);
            } else if (obj == null) {
                gxszxtbevoVar.jyumaefscl();
            } else {
                gxszxtbevoVar.zynmafqrjb();
                gxszxtbevoVar.rgvfuqvkyq(serializer, obj);
            }
        }

        public static void wkgbmnqykc(gxszxtbevo gxszxtbevoVar, agtfadlqog serializer, Object obj) {
            zdlpuopuiu.btonecajqb(serializer, "serializer");
            serializer.wkgbmnqykc(gxszxtbevoVar, obj);
        }

        public static void zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        }
    }

    gxszxtbevo agtfadlqog(dk.gxszxtbevo gxszxtbevoVar);

    void cqumvgiudr(short s13);

    void esjtqupxsv(boolean z13);

    void gxszxtbevo(double d13);

    ik.zoijcleaow iobyxmoadg();

    wkgbmnqykc iozdgvuglv(dk.gxszxtbevo gxszxtbevoVar, int i13);

    void jyumaefscl();

    void kcexrzcfyt(long j13);

    void lereixgezr(float f13);

    void lmojexxdyd(String str);

    void nufgyqmvbu(byte b13);

    void pmvmpeiblj(char c13);

    wkgbmnqykc ppxfxbqfkf(dk.gxszxtbevo gxszxtbevoVar);

    void rgvfuqvkyq(agtfadlqog agtfadlqogVar, Object obj);

    void wflxmlrfwp(dk.gxszxtbevo gxszxtbevoVar, int i13);

    void yadqdtsiqt(int i13);

    void zynmafqrjb();
}
