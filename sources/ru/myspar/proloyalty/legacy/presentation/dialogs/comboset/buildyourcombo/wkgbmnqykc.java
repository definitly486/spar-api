package ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo;

import a91.btonecajqb;
import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.zeieaojujs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.vdvldrhtss;
import czzsidtyhn.wflxmlrfwp;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import jztzpxfvev.ikoacuggdj;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboHint;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.models.ComboSetSelectProductUiModel;
import tg.draadjrbmk;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import w0.nufgyqmvbu;
import x.zynmafqrjb;
import yfnezrywwk.agtfadlqog;
import yfnezrywwk.cqumvgiudr;
import yfnezrywwk.jpowsppfya;
import yfnezrywwk.mbcevpiqjq;
import yfnezrywwk.sopmlzcsov;
import z.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg implements oxmwwwfdhm {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f96386cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f96387iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ w0.wkgbmnqykc f96388jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ mbcevpiqjq f96389yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f96390zdlpuopuiu;

        public eablkybsjg(List list, mbcevpiqjq mbcevpiqjqVar, w0.wkgbmnqykc wkgbmnqykcVar, List list2, draadjrbmk draadjrbmkVar) {
            this.f96390zdlpuopuiu = list;
            this.f96389yggfygwlhe = mbcevpiqjqVar;
            this.f96388jyumaefscl = wkgbmnqykcVar;
            this.f96387iwizpuwonk = list2;
            this.f96386cqumvgiudr = draadjrbmkVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(yfnezrywwk.eablkybsjg eablkybsjgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (draadjrbmkVar.ulzqkzuiru(eablkybsjgVar) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= draadjrbmkVar.ppxfxbqfkf(i13) ? 32 : 16;
            }
            boolean z13 = true;
            if (!draadjrbmkVar.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(2039820996, i15, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            ComboSetSelectProductUiModel comboSetSelectProductUiModel = (ComboSetSelectProductUiModel) this.f96390zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(2115738459);
            draadjrbmkVar.sopmlzcsov(483916213);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            Boolean boolValueOf = Boolean.valueOf(comboSetSelectProductUiModel.getIsSelected());
            draadjrbmkVar.sopmlzcsov(483919445);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(comboSetSelectProductUiModel) | draadjrbmkVar.ulzqkzuiru(this.f96389yggfygwlhe);
            if ((((i15 & 112) ^ 48) <= 32 || !draadjrbmkVar.ppxfxbqfkf(i13)) && (i15 & 48) != 32) {
                z13 = false;
            }
            boolean zUlzqkzuiru = zLmojexxdyd | z13 | draadjrbmkVar.ulzqkzuiru(this.f96388jyumaefscl);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                Object iobyxmoadgVar2 = new iobyxmoadg(comboSetSelectProductUiModel, this.f96389yggfygwlhe, i13, this.f96388jyumaefscl, iwxlajgrazVar, null);
                draadjrbmkVar.jyumaefscl(iobyxmoadgVar2);
                objYadqdtsiqt2 = iobyxmoadgVar2;
            }
            draadjrbmkVar.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, nufgyqmvbu.lqeggnwhkg(i13 == 0 ? 0 : 8), 0.0f, nufgyqmvbu.lqeggnwhkg(i13 == hg.jyumaefscl.ojitshcjhn(this.f96387iwizpuwonk) ? 0 : 8), 0.0f, 10, null);
            float fLqeggnwhkg = nufgyqmvbu.lqeggnwhkg(116);
            float fLqeggnwhkg2 = nufgyqmvbu.lqeggnwhkg(87);
            float f13 = 8;
            float fLqeggnwhkg3 = nufgyqmvbu.lqeggnwhkg(f13);
            float fLqeggnwhkg4 = nufgyqmvbu.lqeggnwhkg(f13);
            draadjrbmkVar.sopmlzcsov(483957140);
            boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(this.f96386cqumvgiudr) | draadjrbmkVar.lmojexxdyd(comboSetSelectProductUiModel);
            Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new zoijcleaow(this.f96386cqumvgiudr, comboSetSelectProductUiModel);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVar.stevsuqkhv();
            a91.nufgyqmvbu.gxszxtbevo(wkgbmnqykcVarOxmwwwfdhm, comboSetSelectProductUiModel, fLqeggnwhkg, fLqeggnwhkg2, fLqeggnwhkg3, fLqeggnwhkg4, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVar, 224640, 0);
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ w0.wkgbmnqykc f96391cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f96392esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f96393iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ mbcevpiqjq f96394jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ComboSetSelectProductUiModel f96395yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96396zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(ComboSetSelectProductUiModel comboSetSelectProductUiModel, mbcevpiqjq mbcevpiqjqVar, int i13, w0.wkgbmnqykc wkgbmnqykcVar, iwxlajgraz iwxlajgrazVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f96395yggfygwlhe = comboSetSelectProductUiModel;
            this.f96394jyumaefscl = mbcevpiqjqVar;
            this.f96393iwizpuwonk = i13;
            this.f96391cqumvgiudr = wkgbmnqykcVar;
            this.f96392esjtqupxsv = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f96395yggfygwlhe, this.f96394jyumaefscl, this.f96393iwizpuwonk, this.f96391cqumvgiudr, this.f96392esjtqupxsv, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0059 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mbcevpiqjq mbcevpiqjqVar;
            int i13;
            w0.wkgbmnqykc wkgbmnqykcVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = this.f96396zdlpuopuiu;
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (wkgbmnqykc.ojitshcjhn(this.f96392esjtqupxsv)) {
                    wkgbmnqykc.rgvfuqvkyq(this.f96392esjtqupxsv, false);
                } else if (this.f96395yggfygwlhe.getIsSelected()) {
                    nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
                    long jKcexrzcfyt = nj.ppxfxbqfkf.kcexrzcfyt(300, nj.wkgbmnqykc.MILLISECONDS);
                    this.f96396zdlpuopuiu = 1;
                    if (crxdokpmqz.ppxfxbqfkf(jKcexrzcfyt, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    mbcevpiqjqVar = this.f96394jyumaefscl;
                    i13 = this.f96393iwizpuwonk;
                    wkgbmnqykcVar = this.f96391cqumvgiudr;
                    this.f96396zdlpuopuiu = 2;
                    if (wkgbmnqykc.jyumaefscl(mbcevpiqjqVar, i13, wkgbmnqykcVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else if (i14 == 1) {
                zdlpuopuiu.zoijcleaow(obj);
                mbcevpiqjqVar = this.f96394jyumaefscl;
                i13 = this.f96393iwizpuwonk;
                wkgbmnqykcVar = this.f96391cqumvgiudr;
                this.f96396zdlpuopuiu = 2;
                if (wkgbmnqykc.jyumaefscl(mbcevpiqjqVar, i13, wkgbmnqykcVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f96397yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f96398zdlpuopuiu;

        public ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, List list) {
            this.f96398zdlpuopuiu = rgvfuqvkyqVar;
            this.f96397yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f96398zdlpuopuiu.invoke(Integer.valueOf(i13), this.f96397yggfygwlhe.get(i13));
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2276wkgbmnqykc implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f96399zdlpuopuiu;

        public C2276wkgbmnqykc(List list) {
            this.f96399zdlpuopuiu = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            this.f96399zdlpuopuiu.get(i13);
            return null;
        }
    }

    static final class zoijcleaow implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ComboSetSelectProductUiModel f96400yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f96401zdlpuopuiu;

        zoijcleaow(draadjrbmk draadjrbmkVar, ComboSetSelectProductUiModel comboSetSelectProductUiModel) {
            this.f96401zdlpuopuiu = draadjrbmkVar;
            this.f96400yggfygwlhe = comboSetSelectProductUiModel;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f96401zdlpuopuiu.invoke(this.f96400yggfygwlhe.getProduct());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(List list, mbcevpiqjq mbcevpiqjqVar, w0.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, jpowsppfya LazyRow) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(LazyRow, "$this$LazyRow");
        LazyRow.nufgyqmvbu(list.size(), new ppxfxbqfkf(new rgvfuqvkyq() { // from class: z81.wflxmlrfwp
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.vdvldrhtss(((Integer) obj).intValue(), (ComboSetSelectProductUiModel) obj2);
            }
        }, list), new C2276wkgbmnqykc(list), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(2039820996, true, new eablkybsjg(list, mbcevpiqjqVar, wkgbmnqykcVar, list, draadjrbmkVar)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(draadjrbmk draadjrbmkVar, ComboSetProduct it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(new ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow.wkgbmnqykc(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(z81.gxszxtbevo gxszxtbevoVar, draadjrbmk draadjrbmkVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        nufgyqmvbu(gxszxtbevoVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(draadjrbmk draadjrbmkVar, ComboSetProduct it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(new ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow.ppxfxbqfkf(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.zoijcleaow.iobyxmoadg.f96402iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object jyumaefscl(mbcevpiqjq mbcevpiqjqVar, int i13, w0.wkgbmnqykc wkgbmnqykcVar, gxszxtbevo gxszxtbevoVar) {
        Object next;
        float f13;
        float f14;
        Object objZoijcleaow;
        cqumvgiudr cqumvgiudrVarCdpycssgdh = mbcevpiqjqVar.cdpycssgdh();
        Iterator it = cqumvgiudrVarCdpycssgdh.nufgyqmvbu().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((agtfadlqog) next).getIndex() != i13);
        agtfadlqog agtfadlqogVar = (agtfadlqog) next;
        if (agtfadlqogVar == null) {
            Object objOxmwwwfdhm = mbcevpiqjq.oxmwwwfdhm(mbcevpiqjqVar, i13, 0, gxszxtbevoVar, 2, null);
            return objOxmwwwfdhm == mg.zoijcleaow.gxszxtbevo() ? objOxmwwwfdhm : wwaezpbzkn.f37140iobyxmoadg;
        }
        int iHszhottldk = wkgbmnqykcVar.hszhottldk(nufgyqmvbu.lqeggnwhkg(16));
        int iEablkybsjg = cqumvgiudrVarCdpycssgdh.eablkybsjg() + iHszhottldk;
        int iPpxfxbqfkf = cqumvgiudrVarCdpycssgdh.ppxfxbqfkf() - iHszhottldk;
        int iIobyxmoadg = agtfadlqogVar.iobyxmoadg();
        int iIobyxmoadg2 = agtfadlqogVar.iobyxmoadg() + agtfadlqogVar.getSize();
        if (iIobyxmoadg >= iEablkybsjg) {
            if (iIobyxmoadg2 > iPpxfxbqfkf) {
                f14 = iIobyxmoadg2 - iPpxfxbqfkf;
            } else {
                f13 = 0.0f;
            }
            return (f13 == 0.0f && (objZoijcleaow = ikoacuggdj.zoijcleaow(mbcevpiqjqVar, f13, null, gxszxtbevoVar, 2, null)) == mg.zoijcleaow.gxszxtbevo()) ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
        }
        f14 = iIobyxmoadg - iEablkybsjg;
        f13 = f14;
        if (f13 == 0.0f) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final void nufgyqmvbu(final z81.gxszxtbevo model, final draadjrbmk onEvent, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onEvent, "onEvent");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1046151813);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onEvent) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1046151813, i14, -1, "ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboScreen (BuildYourComboScreen.kt:55)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
            lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
            float f13 = 16;
            a91.agtfadlqog.zoijcleaow(esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar, nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), model.lqeggnwhkg(), draadjrbmkVarBtonecajqb, 6, 0);
            String strWkgbmnqykc = dxjokdxxww.wkgbmnqykc(model.zoijcleaow());
            draadjrbmkVarBtonecajqb.sopmlzcsov(734118708);
            if (strWkgbmnqykc != null) {
                t31.wkgbmnqykc.zoijcleaow(nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                a91.draadjrbmk.zoijcleaow(esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar, nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), strWkgbmnqykc, draadjrbmkVarBtonecajqb, 6, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f14 = 8;
            t31.wkgbmnqykc.zoijcleaow(nufgyqmvbu.lqeggnwhkg(f14), draadjrbmkVarBtonecajqb, 6);
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(vk0.lqeggnwhkg.proloyalty_combo_first_product_title, draadjrbmkVarBtonecajqb, 0);
            ComboHint comboHintWkgbmnqykc = model.wkgbmnqykc();
            List listPpxfxbqfkf = model.ppxfxbqfkf();
            draadjrbmkVarBtonecajqb.sopmlzcsov(734133738);
            int i15 = i14 & 112;
            boolean z13 = i15 == 32;
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new draadjrbmk() { // from class: z81.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.dxjokdxxww(onEvent, (ComboSetProduct) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            wflxmlrfwp(null, strPpxfxbqfkf, comboHintWkgbmnqykc, listPpxfxbqfkf, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0, 1);
            t31.wkgbmnqykc.zoijcleaow(nufgyqmvbu.lqeggnwhkg(f14), draadjrbmkVarBtonecajqb, 6);
            String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(vk0.lqeggnwhkg.proloyalty_combo_second_product_title, draadjrbmkVarBtonecajqb, 0);
            ComboHint comboHintGxszxtbevo = model.gxszxtbevo();
            List listEablkybsjg = model.eablkybsjg();
            draadjrbmkVarBtonecajqb.sopmlzcsov(734143915);
            boolean z14 = i15 == 32;
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new draadjrbmk() { // from class: z81.nufgyqmvbu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.btonecajqb(onEvent, (ComboSetProduct) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            wflxmlrfwp(null, strPpxfxbqfkf2, comboHintGxszxtbevo, listEablkybsjg, (draadjrbmk) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0, 1);
            t31.wkgbmnqykc.zoijcleaow(nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
            double dIobyxmoadg = model.iobyxmoadg();
            double dNufgyqmvbu = model.nufgyqmvbu();
            draadjrbmkVarBtonecajqb.sopmlzcsov(734152585);
            boolean z15 = i15 == 32;
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: z81.dxjokdxxww
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.gtknphoqwx(onEvent);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            a91.zoijcleaow.zoijcleaow(null, dIobyxmoadg, dNufgyqmvbu, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0, 1);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: z81.btonecajqb
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.draadjrbmk(model, onEvent, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ojitshcjhn(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, ComboHint comboHint, List list, draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        wflxmlrfwp(wkgbmnqykcVar, str, comboHint, list, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object vdvldrhtss(int i13, ComboSetSelectProductUiModel item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item.getProduct().getArticle();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x011c  */
    /* JADX WARN: Code duplicated, block: B:76:0x013b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0216  */
    /* JADX WARN: Code duplicated, block: B:94:0x0221  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    private static final void wflxmlrfwp(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String str, final ComboHint comboHint, final List list, final draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final mbcevpiqjq mbcevpiqjqVarPpxfxbqfkf;
        final w0.wkgbmnqykc wkgbmnqykcVar4;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        boolean z13;
        boolean z14;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar3;
        a0 a0VarWflxmlrfwp;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(961947745);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 32 : 16;
        }
        if ((i14 & 4) == 0) {
            if ((i13 & 384) == 0) {
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(comboHint) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i14 & 8) != 0) {
                i15 |= 3072;
            } else if ((i13 & 3072) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(list)) {
                    i16 = 2048;
                } else {
                    i16 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i16;
            }
            if ((i14 & 16) != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i19 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(961947745, i18, -1, "ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.ComboProductsSection (BuildYourComboScreen.kt:98)");
                }
                mbcevpiqjqVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVarBtonecajqb, 0, 3);
                wkgbmnqykcVar4 = (w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo());
                float f13 = 8;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null), 0.0f, nufgyqmvbu.lqeggnwhkg(f13), 1, null);
                czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww();
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww, iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq);
                lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = lqeggnwhkg.f127047oxmwwwfdhm;
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                float f14 = 16;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
                btonecajqb.zoijcleaow(esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar3, nufgyqmvbu.lqeggnwhkg(f14), 0.0f, 2, null), str, comboHint, draadjrbmkVarBtonecajqb, (i18 & 112) | 6 | (i18 & 896), 0);
                t31.wkgbmnqykc.zoijcleaow(nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGtknphoqwx = cdpycssgdh.gtknphoqwx(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar3, 0.0f, 1, null), nufgyqmvbu.lqeggnwhkg(186), 0.0f, 2, null);
                ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(f14), 0.0f, 2, null);
                a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = iobyxmoadgVar.dxjokdxxww();
                draadjrbmkVarBtonecajqb.sopmlzcsov(897639050);
                boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(list) | draadjrbmkVarBtonecajqb.ulzqkzuiru(mbcevpiqjqVarPpxfxbqfkf) | draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar4);
                if ((i18 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zLmojexxdyd | z13;
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new draadjrbmk() { // from class: z81.gtknphoqwx
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.agtfadlqog(list, mbcevpiqjqVarPpxfxbqfkf, wkgbmnqykcVar4, draadjrbmkVar, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmk draadjrbmkVar4 = (draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVarGtknphoqwx, mbcevpiqjqVarPpxfxbqfkf, ydmasvzmpaVarLqeggnwhkg, false, null, ppxfxbqfkfVarDxjokdxxww, null, false, null, draadjrbmkVar4, draadjrbmkVar3, 196998, 472);
                draadjrbmkVar3.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar5;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar2;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: z81.draadjrbmk
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.oxmwwwfdhm(wkgbmnqykcVar6, str, comboHint, list, draadjrbmkVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(list)) {
                i16 = 2048;
            } else {
                i16 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i15 |= i16;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i15 |= i17;
        }
        i18 = i15;
        if ((i18 & 9363) == 9362) {
            if (i19 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(961947745, i18, -1, "ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.ComboProductsSection (BuildYourComboScreen.kt:98)");
            }
            mbcevpiqjqVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVarBtonecajqb, 0, 3);
            wkgbmnqykcVar4 = (w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo());
            float f15 = 8;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq2 = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null), 0.0f, nufgyqmvbu.lqeggnwhkg(f15), 1, null);
            czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww2 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar4 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg2 = wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww2, iobyxmoadgVar4.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq2);
            lqeggnwhkg.iobyxmoadg iobyxmoadgVar5 = lqeggnwhkg.f127047oxmwwwfdhm;
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar5.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar2 = vdvldrhtss.f26487iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar6 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            float f16 = 16;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar3;
            btonecajqb.zoijcleaow(esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar6, nufgyqmvbu.lqeggnwhkg(f16), 0.0f, 2, null), str, comboHint, draadjrbmkVarBtonecajqb, (i18 & 112) | 6 | (i18 & 896), 0);
            t31.wkgbmnqykc.zoijcleaow(nufgyqmvbu.lqeggnwhkg(f15), draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGtknphoqwx2 = cdpycssgdh.gtknphoqwx(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar6, 0.0f, 1, null), nufgyqmvbu.lqeggnwhkg(186), 0.0f, 2, null);
            ydmasvzmpa ydmasvzmpaVarLqeggnwhkg2 = esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(f16), 0.0f, 2, null);
            a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww2 = iobyxmoadgVar4.dxjokdxxww();
            draadjrbmkVarBtonecajqb.sopmlzcsov(897639050);
            boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(list) | draadjrbmkVarBtonecajqb.ulzqkzuiru(mbcevpiqjqVarPpxfxbqfkf) | draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar4);
            if ((i18 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zLmojexxdyd2 | z13;
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt = new draadjrbmk() { // from class: z81.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.agtfadlqog(list, mbcevpiqjqVarPpxfxbqfkf, wkgbmnqykcVar4, draadjrbmkVar, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new draadjrbmk() { // from class: z81.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.agtfadlqog(list, mbcevpiqjqVarPpxfxbqfkf, wkgbmnqykcVar4, draadjrbmkVar, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmk draadjrbmkVar5 = (draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVarGtknphoqwx2, mbcevpiqjqVarPpxfxbqfkf, ydmasvzmpaVarLqeggnwhkg2, false, null, ppxfxbqfkfVarDxjokdxxww2, null, false, null, draadjrbmkVar5, draadjrbmkVar3, 196998, 472);
            draadjrbmkVar3.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar7;
        } else {
            if (i19 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(961947745, i18, -1, "ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.ComboProductsSection (BuildYourComboScreen.kt:98)");
            }
            mbcevpiqjqVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVarBtonecajqb, 0, 3);
            wkgbmnqykcVar4 = (w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo());
            float f17 = 8;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq3 = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null), 0.0f, nufgyqmvbu.lqeggnwhkg(f17), 1, null);
            czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww3 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar7 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg3 = wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww3, iobyxmoadgVar7.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq3);
            lqeggnwhkg.iobyxmoadg iobyxmoadgVar8 = lqeggnwhkg.f127047oxmwwwfdhm;
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar8.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar8.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar8.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar8.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar3 = vdvldrhtss.f26487iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar9 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            float f18 = 16;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar8 = wkgbmnqykcVar3;
            btonecajqb.zoijcleaow(esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar9, nufgyqmvbu.lqeggnwhkg(f18), 0.0f, 2, null), str, comboHint, draadjrbmkVarBtonecajqb, (i18 & 112) | 6 | (i18 & 896), 0);
            t31.wkgbmnqykc.zoijcleaow(nufgyqmvbu.lqeggnwhkg(f17), draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGtknphoqwx3 = cdpycssgdh.gtknphoqwx(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar9, 0.0f, 1, null), nufgyqmvbu.lqeggnwhkg(186), 0.0f, 2, null);
            ydmasvzmpa ydmasvzmpaVarLqeggnwhkg3 = esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(f18), 0.0f, 2, null);
            a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww3 = iobyxmoadgVar7.dxjokdxxww();
            draadjrbmkVarBtonecajqb.sopmlzcsov(897639050);
            boolean zLmojexxdyd3 = draadjrbmkVarBtonecajqb.lmojexxdyd(list) | draadjrbmkVarBtonecajqb.ulzqkzuiru(mbcevpiqjqVarPpxfxbqfkf) | draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar4);
            if ((i18 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zLmojexxdyd3 | z13;
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt = new draadjrbmk() { // from class: z81.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.agtfadlqog(list, mbcevpiqjqVarPpxfxbqfkf, wkgbmnqykcVar4, draadjrbmkVar, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new draadjrbmk() { // from class: z81.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.agtfadlqog(list, mbcevpiqjqVarPpxfxbqfkf, wkgbmnqykcVar4, draadjrbmkVar, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmk draadjrbmkVar6 = (draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVarGtknphoqwx3, mbcevpiqjqVarPpxfxbqfkf, ydmasvzmpaVarLqeggnwhkg3, false, null, ppxfxbqfkfVarDxjokdxxww3, null, false, null, draadjrbmkVar6, draadjrbmkVar3, 196998, 472);
            draadjrbmkVar3.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar8;
        }
        a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar9 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: z81.draadjrbmk
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.wkgbmnqykc.oxmwwwfdhm(wkgbmnqykcVar9, str, comboHint, list, draadjrbmkVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
