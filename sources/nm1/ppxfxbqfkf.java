package nm1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.zeieaojujs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(om1.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(iobyxmoadgVar, iobyxmoadgVar2, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void ppxfxbqfkf(final om1.iobyxmoadg content, final tg.iobyxmoadg onClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final f.nufgyqmvbu nufgyqmvbuVar;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClick, "onClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-684116076);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(content) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i15 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-684116076, i15, -1, "ru.myspar.proloyalty.rate.rate_product.impl.presentation.compose.ActionButton (ActionButton.kt:23)");
                }
                nufgyqmvbuVar = (f.nufgyqmvbu) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.lqeggnwhkg());
                String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(content.iobyxmoadg().wkgbmnqykc(), draadjrbmkVarBtonecajqb, 0);
                boolean zPpxfxbqfkf = content.ppxfxbqfkf();
                boolean zZoijcleaow = content.zoijcleaow();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-713466291);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(nufgyqmvbuVar) | ((i15 & 112) == 32);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: nm1.iobyxmoadg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ppxfxbqfkf.wkgbmnqykc(nufgyqmvbuVar, onClick);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                i31.wkgbmnqykc.wkgbmnqykc(strPpxfxbqfkf, (tg.iobyxmoadg) objYadqdtsiqt, wkgbmnqykcVar3, null, zZoijcleaow, null, null, zPpxfxbqfkf, draadjrbmkVarBtonecajqb, i15 & 896, 104);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: nm1.zoijcleaow
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ppxfxbqfkf.eablkybsjg(content, onClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 147) == 146) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-684116076, i15, -1, "ru.myspar.proloyalty.rate.rate_product.impl.presentation.compose.ActionButton (ActionButton.kt:23)");
            }
            nufgyqmvbuVar = (f.nufgyqmvbu) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.lqeggnwhkg());
            String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(content.iobyxmoadg().wkgbmnqykc(), draadjrbmkVarBtonecajqb, 0);
            boolean zPpxfxbqfkf2 = content.ppxfxbqfkf();
            boolean zZoijcleaow2 = content.zoijcleaow();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-713466291);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(nufgyqmvbuVar) | ((i15 & 112) == 32);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: nm1.iobyxmoadg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ppxfxbqfkf.wkgbmnqykc(nufgyqmvbuVar, onClick);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: nm1.iobyxmoadg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ppxfxbqfkf.wkgbmnqykc(nufgyqmvbuVar, onClick);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            i31.wkgbmnqykc.wkgbmnqykc(strPpxfxbqfkf2, (tg.iobyxmoadg) objYadqdtsiqt, wkgbmnqykcVar3, null, zZoijcleaow2, null, null, zPpxfxbqfkf2, draadjrbmkVarBtonecajqb, i15 & 896, 104);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-684116076, i15, -1, "ru.myspar.proloyalty.rate.rate_product.impl.presentation.compose.ActionButton (ActionButton.kt:23)");
            }
            nufgyqmvbuVar = (f.nufgyqmvbu) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.lqeggnwhkg());
            String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(content.iobyxmoadg().wkgbmnqykc(), draadjrbmkVarBtonecajqb, 0);
            boolean zPpxfxbqfkf3 = content.ppxfxbqfkf();
            boolean zZoijcleaow3 = content.zoijcleaow();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-713466291);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(nufgyqmvbuVar) | ((i15 & 112) == 32);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: nm1.iobyxmoadg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ppxfxbqfkf.wkgbmnqykc(nufgyqmvbuVar, onClick);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: nm1.iobyxmoadg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ppxfxbqfkf.wkgbmnqykc(nufgyqmvbuVar, onClick);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            i31.wkgbmnqykc.wkgbmnqykc(strPpxfxbqfkf3, (tg.iobyxmoadg) objYadqdtsiqt, wkgbmnqykcVar3, null, zZoijcleaow3, null, null, zPpxfxbqfkf3, draadjrbmkVarBtonecajqb, i15 & 896, 104);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: nm1.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.eablkybsjg(content, onClick, wkgbmnqykcVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(f.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar) {
        f.nufgyqmvbu.agtfadlqog(nufgyqmvbuVar, false, 1, null);
        iobyxmoadgVar.invoke();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
