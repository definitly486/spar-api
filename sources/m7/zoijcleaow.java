package m7;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes2.dex */
public interface zoijcleaow extends nufgyqmvbu {

    public static final class iobyxmoadg {
        public static /* synthetic */ Object iobyxmoadg(zoijcleaow zoijcleaowVar, com.airbnb.lottie.btonecajqb btonecajqbVar, int i13, int i14, boolean z13, float f13, btonecajqb btonecajqbVar2, float f14, boolean z14, dxjokdxxww dxjokdxxwwVar, boolean z15, boolean z16, lg.gxszxtbevo gxszxtbevoVar, int i15, Object obj) {
            btonecajqb btonecajqbVar3;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int iJpowsppfya = (i15 & 2) != 0 ? zoijcleaowVar.jpowsppfya() : i13;
            int iWwaezpbzkn = (i15 & 4) != 0 ? zoijcleaowVar.wwaezpbzkn() : i14;
            boolean zLmojexxdyd = (i15 & 8) != 0 ? zoijcleaowVar.lmojexxdyd() : z13;
            float speed = (i15 & 16) != 0 ? zoijcleaowVar.getSpeed() : f13;
            if ((i15 & 32) != 0) {
                zoijcleaowVar.kegysxyocb();
                btonecajqbVar3 = null;
            } else {
                btonecajqbVar3 = btonecajqbVar2;
            }
            return zoijcleaowVar.yadqdtsiqt(btonecajqbVar, iJpowsppfya, iWwaezpbzkn, zLmojexxdyd, speed, btonecajqbVar3, (i15 & 64) != 0 ? wkgbmnqykc.ppxfxbqfkf(btonecajqbVar, btonecajqbVar3, speed) : f14, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z14, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? dxjokdxxww.Immediately : dxjokdxxwwVar, (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z15, (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z16, gxszxtbevoVar);
        }

        public static /* synthetic */ Object zoijcleaow(zoijcleaow zoijcleaowVar, com.airbnb.lottie.btonecajqb btonecajqbVar, float f13, int i13, boolean z13, lg.gxszxtbevo gxszxtbevoVar, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i14 & 1) != 0) {
                btonecajqbVar = zoijcleaowVar.stevsuqkhv();
            }
            com.airbnb.lottie.btonecajqb btonecajqbVar2 = btonecajqbVar;
            if ((i14 & 2) != 0) {
                f13 = zoijcleaowVar.hcddaimhww();
            }
            float f14 = f13;
            if ((i14 & 4) != 0) {
                i13 = zoijcleaowVar.jpowsppfya();
            }
            int i15 = i13;
            if ((i14 & 8) != 0) {
                z13 = !(f14 == zoijcleaowVar.hcddaimhww());
            }
            return zoijcleaowVar.gtknphoqwx(btonecajqbVar2, f14, i15, z13, gxszxtbevoVar);
        }
    }

    Object gtknphoqwx(com.airbnb.lottie.btonecajqb btonecajqbVar, float f13, int i13, boolean z13, lg.gxszxtbevo gxszxtbevoVar);

    Object yadqdtsiqt(com.airbnb.lottie.btonecajqb btonecajqbVar, int i13, int i14, boolean z13, float f13, btonecajqb btonecajqbVar2, float f14, boolean z14, dxjokdxxww dxjokdxxwwVar, boolean z15, boolean z16, lg.gxszxtbevo gxszxtbevoVar);
}
