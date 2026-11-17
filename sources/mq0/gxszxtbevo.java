package mq0;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.vdvldrhtss;
import czzsidtyhn.wflxmlrfwp;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ProductVariantUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductVariantsUiModel;
import tg.draadjrbmk;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;
import yfnezrywwk.jpowsppfya;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f67816yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f67817zdlpuopuiu;

        public eablkybsjg(draadjrbmk draadjrbmkVar, List list) {
            this.f67817zdlpuopuiu = draadjrbmkVar;
            this.f67816yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f67817zdlpuopuiu.invoke(this.f67816yggfygwlhe.get(i13));
        }
    }

    /* JADX INFO: renamed from: mq0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1441gxszxtbevo implements oxmwwwfdhm {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f67818yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f67819zdlpuopuiu;

        public C1441gxszxtbevo(List list, draadjrbmk draadjrbmkVar) {
            this.f67819zdlpuopuiu = list;
            this.f67818yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(yfnezrywwk.eablkybsjg eablkybsjgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (draadjrbmkVar.ulzqkzuiru(eablkybsjgVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= draadjrbmkVar.ppxfxbqfkf(i13) ? 32 : 16;
            }
            if (!draadjrbmkVar.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(802480018, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            ProductVariantUiModel productVariantUiModel = (ProductVariantUiModel) this.f67819zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(876242198);
            if (productVariantUiModel instanceof ProductVariantUiModel.Image) {
                draadjrbmkVar.sopmlzcsov(-248826883);
                ProductVariantUiModel.Image image = (ProductVariantUiModel.Image) productVariantUiModel;
                String url = image.getUrl();
                String str = url == null ? "" : url;
                boolean isSelected = image.getIsSelected();
                draadjrbmkVar.sopmlzcsov(-248821635);
                boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f67818yggfygwlhe) | draadjrbmkVar.lmojexxdyd(productVariantUiModel);
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new iobyxmoadg(this.f67818yggfygwlhe, productVariantUiModel);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                mq0.zoijcleaow.zoijcleaow(str, isSelected, (tg.iobyxmoadg) objYadqdtsiqt, null, draadjrbmkVar, 0, 8);
                draadjrbmkVar.stevsuqkhv();
            } else {
                if (!(productVariantUiModel instanceof ProductVariantUiModel.Text)) {
                    draadjrbmkVar.sopmlzcsov(-248828787);
                    draadjrbmkVar.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVar.sopmlzcsov(-248817924);
                ProductVariantUiModel.Text text = (ProductVariantUiModel.Text) productVariantUiModel;
                String title = text.getTitle();
                String str2 = title == null ? "" : title;
                boolean isSelected2 = text.getIsSelected();
                draadjrbmkVar.sopmlzcsov(-248812739);
                boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(this.f67818yggfygwlhe) | draadjrbmkVar.lmojexxdyd(productVariantUiModel);
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new zoijcleaow(this.f67818yggfygwlhe, productVariantUiModel);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar.stevsuqkhv();
                nufgyqmvbu.zoijcleaow(str2, isSelected2, (tg.iobyxmoadg) objYadqdtsiqt2, null, draadjrbmkVar, 0, 8);
                draadjrbmkVar.stevsuqkhv();
            }
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class iobyxmoadg implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ProductVariantUiModel f67820yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f67821zdlpuopuiu;

        iobyxmoadg(draadjrbmk draadjrbmkVar, ProductVariantUiModel productVariantUiModel) {
            this.f67821zdlpuopuiu = draadjrbmkVar;
            this.f67820yggfygwlhe = productVariantUiModel;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f67821zdlpuopuiu.invoke(((ProductVariantUiModel.Image) this.f67820yggfygwlhe).getItemId());
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f67822zdlpuopuiu = new ppxfxbqfkf();

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class wkgbmnqykc implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f67823yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f67824zdlpuopuiu;

        public wkgbmnqykc(draadjrbmk draadjrbmkVar, List list) {
            this.f67824zdlpuopuiu = draadjrbmkVar;
            this.f67823yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f67824zdlpuopuiu.invoke(this.f67823yggfygwlhe.get(i13));
        }
    }

    static final class zoijcleaow implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ProductVariantUiModel f67825yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f67826zdlpuopuiu;

        zoijcleaow(draadjrbmk draadjrbmkVar, ProductVariantUiModel productVariantUiModel) {
            this.f67826zdlpuopuiu = draadjrbmkVar;
            this.f67825yggfygwlhe = productVariantUiModel;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f67826zdlpuopuiu.invoke(((ProductVariantUiModel.Text) this.f67825yggfygwlhe).getItemId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(ProductVariantsUiModel productVariantsUiModel, draadjrbmk draadjrbmkVar, jpowsppfya LazyRow) {
        zdlpuopuiu.btonecajqb(LazyRow, "$this$LazyRow");
        List items = productVariantsUiModel.getItems();
        LazyRow.nufgyqmvbu(items.size(), new wkgbmnqykc(new draadjrbmk() { // from class: mq0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.gxszxtbevo((ProductVariantUiModel) obj);
            }
        }, items), new eablkybsjg(ppxfxbqfkf.f67822zdlpuopuiu, items), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new C1441gxszxtbevo(items, draadjrbmkVar)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gxszxtbevo(ProductVariantUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return it.getItemId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ProductVariantsUiModel productVariantsUiModel, draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        wkgbmnqykc(productVariantsUiModel, draadjrbmkVar, wkgbmnqykcVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void wkgbmnqykc(final ProductVariantsUiModel productVariants, final draadjrbmk onVariantClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        String title;
        boolean z13;
        boolean z14;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(productVariants, "productVariants");
        zdlpuopuiu.btonecajqb(onVariantClick, "onVariantClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-276281649);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(productVariants) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onVariantClick) ? 32 : 16;
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
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-276281649, i15, -1, "ru.myspar.proloyalty.catalog.impl.specific_product.presentation.compose.variants.ProductVariantsBlock (ProductVariantsBlock.kt:23)");
                }
                czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
                zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(eablkybsjgVar.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
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
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
                title = productVariants.getTitle();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1745099434);
                if (title != null) {
                    lq0.wkgbmnqykc.zoijcleaow(title, esjtqupxsv.rgvfuqvkyq(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), draadjrbmkVarBtonecajqb, 48, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                float f13 = 8;
                czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq = eablkybsjgVar.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(f13));
                ydmasvzmpa ydmasvzmpaVarGxszxtbevo = esjtqupxsv.gxszxtbevo(w0.nufgyqmvbu.lqeggnwhkg(16), w0.nufgyqmvbu.lqeggnwhkg(f13));
                draadjrbmkVarBtonecajqb.sopmlzcsov(1745110501);
                boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(productVariants);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zLmojexxdyd | z13;
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new draadjrbmk() { // from class: mq0.ppxfxbqfkf
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return gxszxtbevo.eablkybsjg(productVariants, onVariantClick, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmk draadjrbmkVar3 = (draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                yfnezrywwk.wkgbmnqykc.eablkybsjg(null, null, ydmasvzmpaVarGxszxtbevo, false, gxszxtbevoVarRgvfuqvkyq, null, null, false, null, draadjrbmkVar3, draadjrbmkVar2, 24576, 491);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: mq0.wkgbmnqykc
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return gxszxtbevo.lqeggnwhkg(productVariants, onVariantClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
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
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-276281649, i15, -1, "ru.myspar.proloyalty.catalog.impl.specific_product.presentation.compose.variants.ProductVariantsBlock (ProductVariantsBlock.kt:23)");
            }
            czzsidtyhn.eablkybsjg eablkybsjgVar2 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg2 = wflxmlrfwp.iobyxmoadg(eablkybsjgVar2.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar2 = vdvldrhtss.f26487iobyxmoadg;
            title = productVariants.getTitle();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1745099434);
            if (title != null) {
                lq0.wkgbmnqykc.zoijcleaow(title, esjtqupxsv.rgvfuqvkyq(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), draadjrbmkVarBtonecajqb, 48, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f14 = 8;
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq2 = eablkybsjgVar2.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(f14));
            ydmasvzmpa ydmasvzmpaVarGxszxtbevo2 = esjtqupxsv.gxszxtbevo(w0.nufgyqmvbu.lqeggnwhkg(16), w0.nufgyqmvbu.lqeggnwhkg(f14));
            draadjrbmkVarBtonecajqb.sopmlzcsov(1745110501);
            boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(productVariants);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zLmojexxdyd2 | z13;
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt = new draadjrbmk() { // from class: mq0.ppxfxbqfkf
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return gxszxtbevo.eablkybsjg(productVariants, onVariantClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new draadjrbmk() { // from class: mq0.ppxfxbqfkf
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return gxszxtbevo.eablkybsjg(productVariants, onVariantClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmk draadjrbmkVar4 = (draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            yfnezrywwk.wkgbmnqykc.eablkybsjg(null, null, ydmasvzmpaVarGxszxtbevo2, false, gxszxtbevoVarRgvfuqvkyq2, null, null, false, null, draadjrbmkVar4, draadjrbmkVar2, 24576, 491);
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-276281649, i15, -1, "ru.myspar.proloyalty.catalog.impl.specific_product.presentation.compose.variants.ProductVariantsBlock (ProductVariantsBlock.kt:23)");
            }
            czzsidtyhn.eablkybsjg eablkybsjgVar3 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg3 = wflxmlrfwp.iobyxmoadg(eablkybsjgVar3.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar3.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar3 = vdvldrhtss.f26487iobyxmoadg;
            title = productVariants.getTitle();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1745099434);
            if (title != null) {
                lq0.wkgbmnqykc.zoijcleaow(title, esjtqupxsv.rgvfuqvkyq(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), draadjrbmkVarBtonecajqb, 48, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f15 = 8;
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq3 = eablkybsjgVar3.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(f15));
            ydmasvzmpa ydmasvzmpaVarGxszxtbevo3 = esjtqupxsv.gxszxtbevo(w0.nufgyqmvbu.lqeggnwhkg(16), w0.nufgyqmvbu.lqeggnwhkg(f15));
            draadjrbmkVarBtonecajqb.sopmlzcsov(1745110501);
            boolean zLmojexxdyd3 = draadjrbmkVarBtonecajqb.lmojexxdyd(productVariants);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zLmojexxdyd3 | z13;
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt = new draadjrbmk() { // from class: mq0.ppxfxbqfkf
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return gxszxtbevo.eablkybsjg(productVariants, onVariantClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new draadjrbmk() { // from class: mq0.ppxfxbqfkf
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return gxszxtbevo.eablkybsjg(productVariants, onVariantClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmk draadjrbmkVar5 = (draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            yfnezrywwk.wkgbmnqykc.eablkybsjg(null, null, ydmasvzmpaVarGxszxtbevo3, false, gxszxtbevoVarRgvfuqvkyq3, null, null, false, null, draadjrbmkVar5, draadjrbmkVar2, 24576, 491);
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: mq0.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gxszxtbevo.lqeggnwhkg(productVariants, onVariantClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
