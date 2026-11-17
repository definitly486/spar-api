package ku;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.tbqsvytpvh;
import czzsidtyhn.uawqvzlxes;
import h.e;
import h.eslsurpljm;
import hg.ikoacuggdj;
import igdgnonuha.bfopjjpdmp;
import igdgnonuha.i4;
import igdgnonuha.o;
import igdgnonuha.opjhrmiecq;
import igdgnonuha.sflfametgt;
import igdgnonuha.t;
import igdgnonuha.w6;
import igdgnonuha.x6;
import igdgnonuha.z;
import java.util.Set;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ylkuphrtab {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ bfopjjpdmp f60649iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f60650jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f60651yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f60652zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(boolean z13, bfopjjpdmp bfopjjpdmpVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f60650jyumaefscl = z13;
            this.f60649iwizpuwonk = bfopjjpdmpVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f60650jyumaefscl, this.f60649iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f60651yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0053 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            bfopjjpdmp bfopjjpdmpVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f60652zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    boolean z13 = this.f60650jyumaefscl;
                    bfopjjpdmpVar = this.f60649iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    if (!z13 && bfopjjpdmpVar.kcexrzcfyt() == opjhrmiecq.DismissedToStart) {
                        this.f60651yggfygwlhe = bfopjjpdmpVar;
                        this.f60652zdlpuopuiu = 1;
                        if (crxdokpmqz.zoijcleaow(250L, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        this.f60651yggfygwlhe = null;
                        this.f60652zdlpuopuiu = 2;
                        if (bfopjjpdmpVar.cllcsxoeiz(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else if (i13 == 1) {
                    bfopjjpdmpVar = (bfopjjpdmp) this.f60651yggfygwlhe;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    this.f60651yggfygwlhe = null;
                    this.f60652zdlpuopuiu = 2;
                    if (bfopjjpdmpVar.cllcsxoeiz(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f60653zdlpuopuiu;

        ppxfxbqfkf(tg.vdvldrhtss vdvldrhtssVar) {
            this.f60653zdlpuopuiu = vdvldrhtssVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((tbqsvytpvh) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(tbqsvytpvh SwipeToDismiss, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(SwipeToDismiss, "$this$SwipeToDismiss");
            if ((i13 & 17) == 16 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(32439450, i13, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalSwipeContainer.<anonymous> (ProductCardHorizontalSwipeContainer.kt:110)");
            }
            this.f60653zdlpuopuiu.invoke(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, draadjrbmkVar, 6);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class zoijcleaow implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ e f60654yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ bfopjjpdmp f60655zdlpuopuiu;

        zoijcleaow(bfopjjpdmp bfopjjpdmpVar, e eVar) {
            this.f60655zdlpuopuiu = bfopjjpdmpVar;
            this.f60654yggfygwlhe = eVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((tbqsvytpvh) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(tbqsvytpvh SwipeToDismiss, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(SwipeToDismiss, "$this$SwipeToDismiss");
            if ((i13 & 17) == 16 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1915290983, i13, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalSwipeContainer.<anonymous> (ProductCardHorizontalSwipeContainer.kt:78)");
            }
            if (this.f60655zdlpuopuiu.hkdspvbjdz() == sflfametgt.EndToStart) {
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(iobyxmoadgVar, 0.0f, 1, null);
                e eVarIobyxmoadg = this.f60654yggfygwlhe;
                if (eVarIobyxmoadg == null) {
                    eVarIobyxmoadg = eslsurpljm.iobyxmoadg();
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = e.eablkybsjg.iobyxmoadg(wkgbmnqykcVarGxszxtbevo, eVarIobyxmoadg);
                z zVar = z.f44180iobyxmoadg;
                int i14 = z.f44181zoijcleaow;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(wkgbmnqykcVarIobyxmoadg, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar, i14).btonecajqb(), null, 2, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
                x.zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.gxszxtbevo(), false);
                int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarWkgbmnqykc);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
                if (draadjrbmkVar.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar.pkzmftpjix();
                if (draadjrbmkVar.lqeggnwhkg()) {
                    draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVar.yggfygwlhe();
                }
                androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
                tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), iobyxmoadgVar2.lqeggnwhkg(), draadjrbmkVar, 48);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVar.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, iobyxmoadgVar);
                tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar3.iobyxmoadg();
                if (draadjrbmkVar.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar.pkzmftpjix();
                if (draadjrbmkVar.lqeggnwhkg()) {
                    draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVar.yggfygwlhe();
                }
                androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVar);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
                tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_delete, draadjrbmkVar, 0), e0.gxszxtbevo.ppxfxbqfkf(s40.draadjrbmk.action_delete, draadjrbmkVar, 0), iobyxmoadgVar, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar, i14).yadqdtsiqt(), draadjrbmkVar, 384, 0);
                uawqvzlxes.iobyxmoadg(androidx.compose.foundation.layout.cdpycssgdh.dxjokdxxww(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(6)), draadjrbmkVar, 6);
                w6.btonecajqb(e0.gxszxtbevo.ppxfxbqfkf(s40.draadjrbmk.action_delete, draadjrbmkVar, 0), androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVar, i14).yadqdtsiqt(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVar, i14).zoijcleaow().zoijcleaow(), draadjrbmkVar, 48, 0, 65528);
                draadjrbmkVar.cqumvgiudr();
                draadjrbmkVar.cqumvgiudr();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eablkybsjg(tg.iobyxmoadg iobyxmoadgVar, opjhrmiecq it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (it != opjhrmiecq.DismissedToStart) {
            return false;
        }
        iobyxmoadgVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x6 gxszxtbevo(sflfametgt it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return new o(0.8f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, boolean z14, tg.iobyxmoadg iobyxmoadgVar, e eVar, tg.vdvldrhtss vdvldrhtssVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        wkgbmnqykc(wkgbmnqykcVar, z13, z14, iobyxmoadgVar, eVar, vdvldrhtssVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0160  */
    /* JADX WARN: Code duplicated, block: B:102:0x019f  */
    /* JADX WARN: Code duplicated, block: B:105:0x01be  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0144  */
    public static final void wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final boolean z13, boolean z14, final tg.iobyxmoadg onClickRemove, e eVar, final tg.vdvldrhtss content, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        boolean z15;
        int i16;
        int i17;
        e eVar2;
        int i18;
        int i19;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        boolean z16;
        e eVar3;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar;
        bfopjjpdmp bfopjjpdmpVar;
        boolean z17;
        Object objYadqdtsiqt2;
        final e eVar4;
        Object objYadqdtsiqt3;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickRemove, "onClickRemove");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1837402128);
        int i23 = i14 & 1;
        if (i23 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                z15 = z14;
                i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z15) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i14 & 8) != 0) {
                i15 |= 3072;
            } else if ((i13 & 3072) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(onClickRemove)) {
                    i16 = 2048;
                } else {
                    i16 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i16;
            }
            i17 = i14 & 16;
            if (i17 != 0) {
                if ((i13 & 24576) == 0) {
                    eVar2 = eVar;
                    if (draadjrbmkVarBtonecajqb.ulzqkzuiru(eVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i15 |= i18;
                }
                if ((i14 & 32) != 0) {
                    i15 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) == 74898 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                    if (i23 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z15;
                    }
                    if (i17 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar2;
                    }
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1837402128, i15, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalSwipeContainer (ProductCardHorizontalSwipeContainer.kt:46)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1968178293);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt = new bfopjjpdmp(opjhrmiecq.Default, new tg.draadjrbmk() { // from class: ku.iozdgvuglv
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ylkuphrtab.eablkybsjg(onClickRemove, (opjhrmiecq) obj));
                            }
                        });
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    bfopjjpdmpVar = (bfopjjpdmp) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    Boolean boolValueOf = Boolean.valueOf(z16);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1968166467);
                    if ((i15 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z17 || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(boolValueOf, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
                    if (z13) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-883318809);
                        Set setWkgbmnqykc = ikoacuggdj.wkgbmnqykc(sflfametgt.EndToStart);
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-1968152666);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ku.lmojexxdyd
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return ylkuphrtab.gxszxtbevo((sflfametgt) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        i4.eablkybsjg(bfopjjpdmpVar, wkgbmnqykcVar3, setWkgbmnqykc, (tg.draadjrbmk) objYadqdtsiqt3, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1915290983, true, new zoijcleaow(bfopjjpdmpVar, eVar3), draadjrbmkVarBtonecajqb, 54), ezmngbhpjk.nufgyqmvbu.eablkybsjg(32439450, true, new ppxfxbqfkf(content), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 224646, 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-881529179);
                        content.invoke(wkgbmnqykcVar3, draadjrbmkVarBtonecajqb, Integer.valueOf((i15 & 14) | ((i15 >> 12) & 112)));
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    }
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    z15 = z16;
                    eVar4 = eVar3;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    eVar4 = eVar2;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    final boolean z18 = z15;
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ku.wwaezpbzkn
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ylkuphrtab.lqeggnwhkg(wkgbmnqykcVar4, z13, z18, onClickRemove, eVar4, content, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            eVar2 = eVar;
            if ((i14 & 32) != 0) {
                i15 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(content)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i15 |= i19;
            }
            if ((74899 & i15) == 74898) {
                if (i23 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z15;
                }
                if (i17 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1837402128, i15, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalSwipeContainer (ProductCardHorizontalSwipeContainer.kt:46)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1968178293);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new bfopjjpdmp(opjhrmiecq.Default, new tg.draadjrbmk() { // from class: ku.iozdgvuglv
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(ylkuphrtab.eablkybsjg(onClickRemove, (opjhrmiecq) obj));
                        }
                    });
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                bfopjjpdmpVar = (bfopjjpdmp) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf2 = Boolean.valueOf(z16);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1968166467);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z17) {
                    objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf2, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
                if (z13) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-883318809);
                    Set setWkgbmnqykc2 = ikoacuggdj.wkgbmnqykc(sflfametgt.EndToStart);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1968152666);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ku.lmojexxdyd
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return ylkuphrtab.gxszxtbevo((sflfametgt) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    i4.eablkybsjg(bfopjjpdmpVar, wkgbmnqykcVar3, setWkgbmnqykc2, (tg.draadjrbmk) objYadqdtsiqt3, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1915290983, true, new zoijcleaow(bfopjjpdmpVar, eVar3), draadjrbmkVarBtonecajqb, 54), ezmngbhpjk.nufgyqmvbu.eablkybsjg(32439450, true, new ppxfxbqfkf(content), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 224646, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-881529179);
                    content.invoke(wkgbmnqykcVar3, draadjrbmkVarBtonecajqb, Integer.valueOf((i15 & 14) | ((i15 >> 12) & 112)));
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                z15 = z16;
                eVar4 = eVar3;
            } else {
                if (i23 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z15;
                }
                if (i17 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1837402128, i15, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalSwipeContainer (ProductCardHorizontalSwipeContainer.kt:46)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1968178293);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new bfopjjpdmp(opjhrmiecq.Default, new tg.draadjrbmk() { // from class: ku.iozdgvuglv
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(ylkuphrtab.eablkybsjg(onClickRemove, (opjhrmiecq) obj));
                        }
                    });
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                bfopjjpdmpVar = (bfopjjpdmp) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf3 = Boolean.valueOf(z16);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1968166467);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z17) {
                    objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf3, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
                if (z13) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-883318809);
                    Set setWkgbmnqykc3 = ikoacuggdj.wkgbmnqykc(sflfametgt.EndToStart);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1968152666);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ku.lmojexxdyd
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return ylkuphrtab.gxszxtbevo((sflfametgt) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    i4.eablkybsjg(bfopjjpdmpVar, wkgbmnqykcVar3, setWkgbmnqykc3, (tg.draadjrbmk) objYadqdtsiqt3, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1915290983, true, new zoijcleaow(bfopjjpdmpVar, eVar3), draadjrbmkVarBtonecajqb, 54), ezmngbhpjk.nufgyqmvbu.eablkybsjg(32439450, true, new ppxfxbqfkf(content), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 224646, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-881529179);
                    content.invoke(wkgbmnqykcVar3, draadjrbmkVarBtonecajqb, Integer.valueOf((i15 & 14) | ((i15 >> 12) & 112)));
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                z15 = z16;
                eVar4 = eVar3;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
                final boolean z19 = z15;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ku.wwaezpbzkn
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ylkuphrtab.lqeggnwhkg(wkgbmnqykcVar5, z13, z19, onClickRemove, eVar4, content, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        z15 = z14;
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(onClickRemove)) {
                i16 = 2048;
            } else {
                i16 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i15 |= i16;
        }
        i17 = i14 & 16;
        if (i17 != 0) {
            if ((i13 & 24576) == 0) {
                eVar2 = eVar;
                if (draadjrbmkVarBtonecajqb.ulzqkzuiru(eVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i15 |= i18;
            }
            if ((i14 & 32) != 0) {
                i15 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(content)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i15 |= i19;
            }
            if ((74899 & i15) == 74898) {
                if (i23 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z15;
                }
                if (i17 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1837402128, i15, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalSwipeContainer (ProductCardHorizontalSwipeContainer.kt:46)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1968178293);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new bfopjjpdmp(opjhrmiecq.Default, new tg.draadjrbmk() { // from class: ku.iozdgvuglv
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(ylkuphrtab.eablkybsjg(onClickRemove, (opjhrmiecq) obj));
                        }
                    });
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                bfopjjpdmpVar = (bfopjjpdmp) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf4 = Boolean.valueOf(z16);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1968166467);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z17) {
                    objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf4, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
                if (z13) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-883318809);
                    Set setWkgbmnqykc4 = ikoacuggdj.wkgbmnqykc(sflfametgt.EndToStart);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1968152666);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ku.lmojexxdyd
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return ylkuphrtab.gxszxtbevo((sflfametgt) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    i4.eablkybsjg(bfopjjpdmpVar, wkgbmnqykcVar3, setWkgbmnqykc4, (tg.draadjrbmk) objYadqdtsiqt3, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1915290983, true, new zoijcleaow(bfopjjpdmpVar, eVar3), draadjrbmkVarBtonecajqb, 54), ezmngbhpjk.nufgyqmvbu.eablkybsjg(32439450, true, new ppxfxbqfkf(content), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 224646, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-881529179);
                    content.invoke(wkgbmnqykcVar3, draadjrbmkVarBtonecajqb, Integer.valueOf((i15 & 14) | ((i15 >> 12) & 112)));
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                z15 = z16;
                eVar4 = eVar3;
            } else {
                if (i23 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z15;
                }
                if (i17 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1837402128, i15, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalSwipeContainer (ProductCardHorizontalSwipeContainer.kt:46)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1968178293);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new bfopjjpdmp(opjhrmiecq.Default, new tg.draadjrbmk() { // from class: ku.iozdgvuglv
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(ylkuphrtab.eablkybsjg(onClickRemove, (opjhrmiecq) obj));
                        }
                    });
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                bfopjjpdmpVar = (bfopjjpdmp) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf5 = Boolean.valueOf(z16);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1968166467);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z17) {
                    objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf5, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
                if (z13) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-883318809);
                    Set setWkgbmnqykc5 = ikoacuggdj.wkgbmnqykc(sflfametgt.EndToStart);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1968152666);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ku.lmojexxdyd
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return ylkuphrtab.gxszxtbevo((sflfametgt) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    i4.eablkybsjg(bfopjjpdmpVar, wkgbmnqykcVar3, setWkgbmnqykc5, (tg.draadjrbmk) objYadqdtsiqt3, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1915290983, true, new zoijcleaow(bfopjjpdmpVar, eVar3), draadjrbmkVarBtonecajqb, 54), ezmngbhpjk.nufgyqmvbu.eablkybsjg(32439450, true, new ppxfxbqfkf(content), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 224646, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-881529179);
                    content.invoke(wkgbmnqykcVar3, draadjrbmkVarBtonecajqb, Integer.valueOf((i15 & 14) | ((i15 >> 12) & 112)));
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                z15 = z16;
                eVar4 = eVar3;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
                final boolean z110 = z15;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ku.wwaezpbzkn
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ylkuphrtab.lqeggnwhkg(wkgbmnqykcVar6, z13, z110, onClickRemove, eVar4, content, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        eVar2 = eVar;
        if ((i14 & 32) != 0) {
            i15 |= 196608;
        } else if ((i13 & 196608) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(content)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i15 |= i19;
        }
        if ((74899 & i15) == 74898) {
            if (i23 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i24 != 0) {
                z16 = false;
            } else {
                z16 = z15;
            }
            if (i17 != 0) {
                eVar3 = null;
            } else {
                eVar3 = eVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1837402128, i15, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalSwipeContainer (ProductCardHorizontalSwipeContainer.kt:46)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1968178293);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = new bfopjjpdmp(opjhrmiecq.Default, new tg.draadjrbmk() { // from class: ku.iozdgvuglv
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ylkuphrtab.eablkybsjg(onClickRemove, (opjhrmiecq) obj));
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            bfopjjpdmpVar = (bfopjjpdmp) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            Boolean boolValueOf6 = Boolean.valueOf(z16);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1968166467);
            if ((i15 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z17) {
                objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf6, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
            if (z13) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-883318809);
                Set setWkgbmnqykc6 = ikoacuggdj.wkgbmnqykc(sflfametgt.EndToStart);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1968152666);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ku.lmojexxdyd
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ylkuphrtab.gxszxtbevo((sflfametgt) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                i4.eablkybsjg(bfopjjpdmpVar, wkgbmnqykcVar3, setWkgbmnqykc6, (tg.draadjrbmk) objYadqdtsiqt3, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1915290983, true, new zoijcleaow(bfopjjpdmpVar, eVar3), draadjrbmkVarBtonecajqb, 54), ezmngbhpjk.nufgyqmvbu.eablkybsjg(32439450, true, new ppxfxbqfkf(content), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 224646, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-881529179);
                content.invoke(wkgbmnqykcVar3, draadjrbmkVarBtonecajqb, Integer.valueOf((i15 & 14) | ((i15 >> 12) & 112)));
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            z15 = z16;
            eVar4 = eVar3;
        } else {
            if (i23 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i24 != 0) {
                z16 = false;
            } else {
                z16 = z15;
            }
            if (i17 != 0) {
                eVar3 = null;
            } else {
                eVar3 = eVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1837402128, i15, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalSwipeContainer (ProductCardHorizontalSwipeContainer.kt:46)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1968178293);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = new bfopjjpdmp(opjhrmiecq.Default, new tg.draadjrbmk() { // from class: ku.iozdgvuglv
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ylkuphrtab.eablkybsjg(onClickRemove, (opjhrmiecq) obj));
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            bfopjjpdmpVar = (bfopjjpdmp) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            Boolean boolValueOf7 = Boolean.valueOf(z16);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1968166467);
            if ((i15 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z17) {
                objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new iobyxmoadg(z16, bfopjjpdmpVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf7, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
            if (z13) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-883318809);
                Set setWkgbmnqykc7 = ikoacuggdj.wkgbmnqykc(sflfametgt.EndToStart);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1968152666);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ku.lmojexxdyd
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ylkuphrtab.gxszxtbevo((sflfametgt) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                i4.eablkybsjg(bfopjjpdmpVar, wkgbmnqykcVar3, setWkgbmnqykc7, (tg.draadjrbmk) objYadqdtsiqt3, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1915290983, true, new zoijcleaow(bfopjjpdmpVar, eVar3), draadjrbmkVarBtonecajqb, 54), ezmngbhpjk.nufgyqmvbu.eablkybsjg(32439450, true, new ppxfxbqfkf(content), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 224646, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-881529179);
                content.invoke(wkgbmnqykcVar3, draadjrbmkVarBtonecajqb, Integer.valueOf((i15 & 14) | ((i15 >> 12) & 112)));
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            z15 = z16;
            eVar4 = eVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar3;
            final boolean z111 = z15;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ku.wwaezpbzkn
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ylkuphrtab.lqeggnwhkg(wkgbmnqykcVar7, z13, z111, onClickRemove, eVar4, content, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
