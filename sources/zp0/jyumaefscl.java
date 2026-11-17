package zp0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import igdgnonuha.t;
import igdgnonuha.w6;
import igdgnonuha.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jyumaefscl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn btonecajqb(List list, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar3, int i15) throws XmlPullParserException, IOException {
        lqeggnwhkg(list, draadjrbmkVar, draadjrbmkVar2, iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar3, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(tg.draadjrbmk draadjrbmkVar, String str) {
        draadjrbmkVar.invoke(str);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x0118  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:71:0x0240  */
    /* JADX WARN: Code duplicated, block: B:74:0x024c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0250  */
    /* JADX WARN: Code duplicated, block: B:78:0x026f  */
    /* JADX WARN: Code duplicated, block: B:80:0x027d  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void eablkybsjg(final String text, final tg.iobyxmoadg onClick, final tg.iobyxmoadg onDeleteClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) throws XmlPullParserException, IOException {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        int iHashCode2;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClick, "onClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDeleteClick, "onDeleteClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1420800524);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(text) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onDeleteClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            i16 = i15;
            if ((i16 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1420800524, i16, -1, "ru.myspar.proloyalty.catalog.impl.search.compose.HistoryItem (SearchHistory.kt:58)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVar3, null, null, false, null, null, onClick, 28, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(6), 1, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
                x.zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), iobyxmoadgVar.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarVdvldrhtss = androidx.compose.foundation.layout.cdpycssgdh.vdvldrhtss(iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(16));
                m.wkgbmnqykc.zoijcleaow zoijcleaowVar = m.wkgbmnqykc.f64773gtknphoqwx;
                m.wkgbmnqykc wkgbmnqykcVarZoijcleaow = e0.lqeggnwhkg.zoijcleaow(zoijcleaowVar, b31.gxszxtbevo.ic_recent, draadjrbmkVarBtonecajqb, 6);
                z zVar = z.f44180iobyxmoadg;
                int i18 = z.f44181zoijcleaow;
                t.wkgbmnqykc(wkgbmnqykcVarZoijcleaow, null, wkgbmnqykcVarVdvldrhtss, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).lereixgezr(), draadjrbmkVarBtonecajqb, 432, 0);
                float f13 = 12;
                w6.btonecajqb(text, androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(tbqsvytpvh.zoijcleaow(roivzttewhVar, iobyxmoadgVar3, 1.0f, false, 2, null), w0.nufgyqmvbu.lqeggnwhkg(f13), w0.nufgyqmvbu.lqeggnwhkg(8)), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, h41.zoijcleaow.zoijcleaow(l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i18).iobyxmoadg()), draadjrbmkVarBtonecajqb, i16 & 14, 3120, 55288);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq2 = androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(androidx.compose.foundation.eablkybsjg.gxszxtbevo(iobyxmoadgVar3, null, null, false, null, null, onDeleteClick, 28, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f13), 1, null);
                x.zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.ojitshcjhn(), false);
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVar2.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarRgvfuqvkyq2);
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVar2.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar2.pkzmftpjix();
                if (draadjrbmkVar2.lqeggnwhkg()) {
                    draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVar2.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVar2);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                t.wkgbmnqykc(e0.lqeggnwhkg.zoijcleaow(zoijcleaowVar, b31.gxszxtbevo.ic_close_delete_history, draadjrbmkVar2, 6), null, null, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar2, i18).iwizpuwonk(), draadjrbmkVar2, 48, 4);
                draadjrbmkVar2.cqumvgiudr();
                draadjrbmkVar2.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zp0.yggfygwlhe
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return jyumaefscl.gxszxtbevo(text, onClick, onDeleteClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i15;
        if ((i16 & 1171) == 1170) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1420800524, i16, -1, "ru.myspar.proloyalty.catalog.impl.search.compose.HistoryItem (SearchHistory.kt:58)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq3 = androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVar3, null, null, false, null, null, onClick, 28, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(6), 1, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar4 = a.eablkybsjg.f20iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarZoijcleaow2 = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), iobyxmoadgVar4.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar5 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar5.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow2, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar5.wkgbmnqykc());
            roivzttewh roivzttewhVar2 = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar6 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarVdvldrhtss2 = androidx.compose.foundation.layout.cdpycssgdh.vdvldrhtss(iobyxmoadgVar6, w0.nufgyqmvbu.lqeggnwhkg(16));
            m.wkgbmnqykc.zoijcleaow zoijcleaowVar2 = m.wkgbmnqykc.f64773gtknphoqwx;
            m.wkgbmnqykc wkgbmnqykcVarZoijcleaow2 = e0.lqeggnwhkg.zoijcleaow(zoijcleaowVar2, b31.gxszxtbevo.ic_recent, draadjrbmkVarBtonecajqb, 6);
            z zVar2 = z.f44180iobyxmoadg;
            int i19 = z.f44181zoijcleaow;
            t.wkgbmnqykc(wkgbmnqykcVarZoijcleaow2, null, wkgbmnqykcVarVdvldrhtss2, l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i19).lereixgezr(), draadjrbmkVarBtonecajqb, 432, 0);
            float f14 = 12;
            w6.btonecajqb(text, androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(tbqsvytpvh.zoijcleaow(roivzttewhVar2, iobyxmoadgVar6, 1.0f, false, 2, null), w0.nufgyqmvbu.lqeggnwhkg(f14), w0.nufgyqmvbu.lqeggnwhkg(8)), l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i19).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, h41.zoijcleaow.zoijcleaow(l41.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVarBtonecajqb, i19).iobyxmoadg()), draadjrbmkVarBtonecajqb, i16 & 14, 3120, 55288);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq4 = androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(androidx.compose.foundation.eablkybsjg.gxszxtbevo(iobyxmoadgVar6, null, null, false, null, null, onDeleteClick, 28, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f14), 1, null);
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar4.ojitshcjhn(), false);
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVar2.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarRgvfuqvkyq4);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar5.iobyxmoadg();
            if (draadjrbmkVar2.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar2.pkzmftpjix();
            if (draadjrbmkVar2.lqeggnwhkg()) {
                draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVar2.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVar2);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar5.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            t.wkgbmnqykc(e0.lqeggnwhkg.zoijcleaow(zoijcleaowVar2, b31.gxszxtbevo.ic_close_delete_history, draadjrbmkVar2, 6), null, null, l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVar2, i19).iwizpuwonk(), draadjrbmkVar2, 48, 4);
            draadjrbmkVar2.cqumvgiudr();
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1420800524, i16, -1, "ru.myspar.proloyalty.catalog.impl.search.compose.HistoryItem (SearchHistory.kt:58)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq5 = androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVar3, null, null, false, null, null, onClick, 28, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(6), 1, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar7 = a.eablkybsjg.f20iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarZoijcleaow3 = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), iobyxmoadgVar7.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt5 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq5);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar8 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar8.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow3, iobyxmoadgVar8.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt5, iobyxmoadgVar8.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar8.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar8.wkgbmnqykc());
            roivzttewh roivzttewhVar3 = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar9 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarVdvldrhtss3 = androidx.compose.foundation.layout.cdpycssgdh.vdvldrhtss(iobyxmoadgVar9, w0.nufgyqmvbu.lqeggnwhkg(16));
            m.wkgbmnqykc.zoijcleaow zoijcleaowVar3 = m.wkgbmnqykc.f64773gtknphoqwx;
            m.wkgbmnqykc wkgbmnqykcVarZoijcleaow3 = e0.lqeggnwhkg.zoijcleaow(zoijcleaowVar3, b31.gxszxtbevo.ic_recent, draadjrbmkVarBtonecajqb, 6);
            z zVar3 = z.f44180iobyxmoadg;
            int i110 = z.f44181zoijcleaow;
            t.wkgbmnqykc(wkgbmnqykcVarZoijcleaow3, null, wkgbmnqykcVarVdvldrhtss3, l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i110).lereixgezr(), draadjrbmkVarBtonecajqb, 432, 0);
            float f15 = 12;
            w6.btonecajqb(text, androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(tbqsvytpvh.zoijcleaow(roivzttewhVar3, iobyxmoadgVar9, 1.0f, false, 2, null), w0.nufgyqmvbu.lqeggnwhkg(f15), w0.nufgyqmvbu.lqeggnwhkg(8)), l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i110).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, h41.zoijcleaow.zoijcleaow(l41.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVarBtonecajqb, i110).iobyxmoadg()), draadjrbmkVarBtonecajqb, i16 & 14, 3120, 55288);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq6 = androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(androidx.compose.foundation.eablkybsjg.gxszxtbevo(iobyxmoadgVar9, null, null, false, null, null, onDeleteClick, 28, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f15), 1, null);
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar7.ojitshcjhn(), false);
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt6 = draadjrbmkVar2.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarRgvfuqvkyq6);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar8.iobyxmoadg();
            if (draadjrbmkVar2.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar2.pkzmftpjix();
            if (draadjrbmkVar2.lqeggnwhkg()) {
                draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVar2.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVar2);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar8.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt6, iobyxmoadgVar8.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar8.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg6, iobyxmoadgVar8.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar3 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            t.wkgbmnqykc(e0.lqeggnwhkg.zoijcleaow(zoijcleaowVar3, b31.gxszxtbevo.ic_close_delete_history, draadjrbmkVar2, 6), null, null, l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVar2, i110).iwizpuwonk(), draadjrbmkVar2, 48, 4);
            draadjrbmkVar2.cqumvgiudr();
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zp0.yggfygwlhe
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return jyumaefscl.gxszxtbevo(text, onClick, onDeleteClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(String str, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) throws XmlPullParserException, IOException {
        eablkybsjg(str, iobyxmoadgVar, iobyxmoadgVar2, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x020f  */
    /* JADX WARN: Code duplicated, block: B:107:0x021a  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0183  */
    /* JADX WARN: Code duplicated, block: B:85:0x0185  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x019a  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cb  */
    public static final void lqeggnwhkg(final List historyItems, final tg.draadjrbmk onHistoryClick, final tg.draadjrbmk onDeleteHistoryClick, final tg.iobyxmoadg onClearAllClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) throws XmlPullParserException, IOException {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        int i17;
        Iterator it;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        final String str;
        boolean z13;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt;
        boolean z14;
        boolean zUlzqkzuiru2;
        Object objYadqdtsiqt2;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(historyItems, "historyItems");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onHistoryClick, "onHistoryClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDeleteHistoryClick, "onDeleteHistoryClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClearAllClick, "onClearAllClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-649104898);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(historyItems) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = 32;
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onHistoryClick) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onDeleteHistoryClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClearAllClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 16384 : 8192;
            }
            i16 = i15;
            if ((i16 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i19 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-649104898, i16, -1, "ru.myspar.proloyalty.catalog.impl.search.compose.SearchHistory (SearchHistory.kt:35)");
                }
                x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                i17 = i16;
                jztzpxfvev.zoijcleaow(null, e0.gxszxtbevo.ppxfxbqfkf(bp0.lqeggnwhkg.proloyalty_history, draadjrbmkVarBtonecajqb, 0), onClearAllClick, draadjrbmkVarBtonecajqb, (i16 >> 3) & 896, 1);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1192634173);
                it = historyItems.iterator();
                while (it.hasNext()) {
                    str = (String) it.next();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(743515021);
                    if ((i17 & 112) == i18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(str) | z13;
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zp0.oxmwwwfdhm
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return jyumaefscl.nufgyqmvbu(onHistoryClick, str);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(743516883);
                    if ((i17 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zUlzqkzuiru2 = z14 | draadjrbmkVarBtonecajqb.ulzqkzuiru(str);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: zp0.kcexrzcfyt
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return jyumaefscl.dxjokdxxww(onDeleteHistoryClick, str);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.runtime.draadjrbmk draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                    eablkybsjg(str, iobyxmoadgVar2, (tg.iobyxmoadg) objYadqdtsiqt2, androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), draadjrbmkVar3, 3072, 0);
                    wkgbmnqykcVar3 = wkgbmnqykcVar3;
                    i18 = i18;
                    draadjrbmkVarBtonecajqb = draadjrbmkVar3;
                    i17 = i17;
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                draadjrbmkVar2.stevsuqkhv();
                draadjrbmkVar2.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar5;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zp0.zdlpuopuiu
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return jyumaefscl.btonecajqb(historyItems, onHistoryClick, onDeleteHistoryClick, onClearAllClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i15;
        if ((i16 & 9363) == 9362) {
            if (i19 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-649104898, i16, -1, "ru.myspar.proloyalty.catalog.impl.search.compose.SearchHistory (SearchHistory.kt:35)");
            }
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar2 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            i17 = i16;
            jztzpxfvev.zoijcleaow(null, e0.gxszxtbevo.ppxfxbqfkf(bp0.lqeggnwhkg.proloyalty_history, draadjrbmkVarBtonecajqb, 0), onClearAllClick, draadjrbmkVarBtonecajqb, (i16 >> 3) & 896, 1);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1192634173);
            it = historyItems.iterator();
            while (it.hasNext()) {
                str = (String) it.next();
                draadjrbmkVarBtonecajqb.sopmlzcsov(743515021);
                if ((i17 & 112) == i18) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(str) | z13;
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zp0.oxmwwwfdhm
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return jyumaefscl.nufgyqmvbu(onHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zp0.oxmwwwfdhm
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return jyumaefscl.nufgyqmvbu(onHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.iobyxmoadg iobyxmoadgVar4 = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(743516883);
                if ((i17 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zUlzqkzuiru2 = z14 | draadjrbmkVarBtonecajqb.ulzqkzuiru(str);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: zp0.kcexrzcfyt
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return jyumaefscl.dxjokdxxww(onDeleteHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: zp0.kcexrzcfyt
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return jyumaefscl.dxjokdxxww(onDeleteHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.runtime.draadjrbmk draadjrbmkVar4 = draadjrbmkVarBtonecajqb;
                eablkybsjg(str, iobyxmoadgVar4, (tg.iobyxmoadg) objYadqdtsiqt2, androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), draadjrbmkVar4, 3072, 0);
                wkgbmnqykcVar3 = wkgbmnqykcVar3;
                i18 = i18;
                draadjrbmkVarBtonecajqb = draadjrbmkVar4;
                i17 = i17;
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar6;
        } else {
            if (i19 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-649104898, i16, -1, "ru.myspar.proloyalty.catalog.impl.search.compose.SearchHistory (SearchHistory.kt:35)");
            }
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar5 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar5.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar5.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar3 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            i17 = i16;
            jztzpxfvev.zoijcleaow(null, e0.gxszxtbevo.ppxfxbqfkf(bp0.lqeggnwhkg.proloyalty_history, draadjrbmkVarBtonecajqb, 0), onClearAllClick, draadjrbmkVarBtonecajqb, (i16 >> 3) & 896, 1);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1192634173);
            it = historyItems.iterator();
            while (it.hasNext()) {
                str = (String) it.next();
                draadjrbmkVarBtonecajqb.sopmlzcsov(743515021);
                if ((i17 & 112) == i18) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(str) | z13;
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zp0.oxmwwwfdhm
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return jyumaefscl.nufgyqmvbu(onHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: zp0.oxmwwwfdhm
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return jyumaefscl.nufgyqmvbu(onHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.iobyxmoadg iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(743516883);
                if ((i17 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zUlzqkzuiru2 = z14 | draadjrbmkVarBtonecajqb.ulzqkzuiru(str);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: zp0.kcexrzcfyt
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return jyumaefscl.dxjokdxxww(onDeleteHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: zp0.kcexrzcfyt
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return jyumaefscl.dxjokdxxww(onDeleteHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.runtime.draadjrbmk draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                eablkybsjg(str, iobyxmoadgVar6, (tg.iobyxmoadg) objYadqdtsiqt2, androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), draadjrbmkVar5, 3072, 0);
                wkgbmnqykcVar3 = wkgbmnqykcVar3;
                i18 = i18;
                draadjrbmkVarBtonecajqb = draadjrbmkVar5;
                i17 = i17;
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar7;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zp0.zdlpuopuiu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return jyumaefscl.btonecajqb(historyItems, onHistoryClick, onDeleteHistoryClick, onClearAllClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, String str) {
        draadjrbmkVar.invoke(str);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
