package androidx.media3.exoplayer;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public interface hszhottldk {

    public interface iobyxmoadg {
        void iobyxmoadg(wizcaqwiak wizcaqwiakVar);
    }

    static int agtfadlqog(int i13) {
        return i13 & 384;
    }

    static int jyumaefscl(int i13) {
        return kcexrzcfyt(i13, 0, 0, 0);
    }

    static int kcexrzcfyt(int i13, int i14, int i15, int i16) {
        return yadqdtsiqt(i13, i14, i15, 0, UserVerificationMethods.USER_VERIFY_PATTERN, i16);
    }

    static int lmojexxdyd(int i13) {
        return i13 & 64;
    }

    static boolean ojitshcjhn(int i13, boolean z13) {
        int iTzroggbefp = tzroggbefp(i13);
        return iTzroggbefp == 4 || (z13 && iTzroggbefp == 3);
    }

    static int pmvmpeiblj(int i13) {
        return i13 & 3584;
    }

    static int tzroggbefp(int i13) {
        return i13 & 7;
    }

    static int vdvldrhtss(int i13, int i14, int i15, int i16, int i17) {
        return yadqdtsiqt(i13, i14, i15, i16, i17, 0);
    }

    static int yadqdtsiqt(int i13, int i14, int i15, int i16, int i17, int i18) {
        return i13 | i14 | i15 | i16 | i17 | i18;
    }

    static int yggfygwlhe(int i13) {
        return i13 & 24;
    }

    static int zdlpuopuiu(int i13) {
        return i13 & 32;
    }

    int cllcsxoeiz();

    void draadjrbmk();

    int dxjokdxxww();

    String getName();

    int iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    void pkzmftpjix(iobyxmoadg iobyxmoadgVar);
}
