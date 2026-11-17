package ru.myspar.specialbanner.impl.presentation;

import android.os.SystemClock;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.shop.Shop;
import ru.myspar.core.domain.models.shop.ShopService;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes6.dex */
public final class xrmfcynszj {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final mj.rgvfuqvkyq f104264eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ob0.ppxfxbqfkf f104265iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ob0.iobyxmoadg f104266ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final mj.rgvfuqvkyq f104267wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb0.zoijcleaow f104268zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f104269iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f104270ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f104271zoijcleaow;

        static {
            int[] iArr = new int[c52.iozdgvuglv.values().length];
            try {
                iArr[c52.iozdgvuglv.H1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c52.iozdgvuglv.H2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c52.iozdgvuglv.H3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c52.iozdgvuglv.H5.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c52.iozdgvuglv.H6.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c52.iozdgvuglv.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f104269iobyxmoadg = iArr;
            int[] iArr2 = new int[c52.lereixgezr.values().length];
            try {
                iArr2[c52.lereixgezr.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[c52.lereixgezr.ONLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[c52.lereixgezr.OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f104271zoijcleaow = iArr2;
            int[] iArr3 = new int[c52.jpowsppfya.values().length];
            try {
                iArr3[c52.jpowsppfya.BANNERS_BIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[c52.jpowsppfya.BANNER_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[c52.jpowsppfya.BANNER_LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f104270ppxfxbqfkf = iArr3;
        }
    }

    public static final class zoijcleaow implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((c52.cqumvgiudr.zoijcleaow) obj2).gxszxtbevo().length()), Integer.valueOf(((c52.cqumvgiudr.zoijcleaow) obj).gxszxtbevo().length()));
        }
    }

    public xrmfcynszj(ob0.ppxfxbqfkf comboSetToUiMapper, pb0.zoijcleaow productToUiModelMapper, ob0.iobyxmoadg colorsUiModelMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetToUiMapper, "comboSetToUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productToUiModelMapper, "productToUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f104265iobyxmoadg = comboSetToUiMapper;
        this.f104268zoijcleaow = productToUiModelMapper;
        this.f104266ppxfxbqfkf = colorsUiModelMapper;
        this.f104267wkgbmnqykc = new mj.rgvfuqvkyq("</?p>");
        this.f104264eablkybsjg = new mj.rgvfuqvkyq("\n+$");
    }

    private final b62.zoijcleaow.ppxfxbqfkf agtfadlqog(c52.gxszxtbevo gxszxtbevoVar, ColorsUiModel colorsUiModel) {
        return new b62.zoijcleaow.ppxfxbqfkf(String.valueOf(gxszxtbevoVar.zoijcleaow()), gxszxtbevoVar.iobyxmoadg().ppxfxbqfkf(), colorsUiModel, gxszxtbevoVar.iobyxmoadg().wkgbmnqykc(), false, gxszxtbevoVar.iobyxmoadg().iobyxmoadg(), gxszxtbevoVar.iobyxmoadg().zoijcleaow());
    }

    private final String btonecajqb(String str) {
        return this.f104267wkgbmnqykc.rgvfuqvkyq(str, "");
    }

    private final m62.zoijcleaow cdpycssgdh(c52.lmojexxdyd lmojexxdydVar) {
        String strPpxfxbqfkf = lmojexxdydVar.ppxfxbqfkf();
        String strZoijcleaow = lmojexxdydVar.zoijcleaow();
        c52.wwaezpbzkn wwaezpbzknVarIobyxmoadg = lmojexxdydVar.iobyxmoadg();
        return new m62.zoijcleaow(strPpxfxbqfkf, strZoijcleaow, wwaezpbzknVarIobyxmoadg != null ? istkbnxepw(wwaezpbzknVarIobyxmoadg) : null);
    }

    private final r62.iobyxmoadg cllcsxoeiz(c52.hkdspvbjdz.iobyxmoadg iobyxmoadgVar) {
        return new r62.iobyxmoadg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.wkgbmnqykc());
    }

    private final List cqumvgiudr(c52.cllcsxoeiz.iobyxmoadg iobyxmoadgVar) {
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : iobyxmoadgVar.iobyxmoadg()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            for (String str : (List) obj) {
                boolean z13 = true;
                int i15 = i13 == 0 ? 1 : 0;
                if (i13 != 0) {
                    z13 = false;
                }
                arrayList.add(new s62.iobyxmoadg(str, i15, z13));
            }
            i13 = i14;
        }
        return hg.jyumaefscl.m(arrayList);
    }

    private final z52.wflxmlrfwp crxdokpmqz(c52.wypolnanlu wypolnanluVar) {
        return new z52.wflxmlrfwp(String.valueOf(wypolnanluVar.zoijcleaow()), wypolnanluVar.iobyxmoadg().iobyxmoadg(), wypolnanluVar.iobyxmoadg().ppxfxbqfkf(), wypolnanluVar.iobyxmoadg().zoijcleaow() + (SystemClock.elapsedRealtime() / 1000), wypolnanluVar.iobyxmoadg().zoijcleaow());
    }

    private final b62.zoijcleaow.iobyxmoadg draadjrbmk(c52.wkgbmnqykc wkgbmnqykcVar, ColorsUiModel colorsUiModel) {
        return new b62.zoijcleaow.iobyxmoadg(String.valueOf(wkgbmnqykcVar.zoijcleaow()), wkgbmnqykcVar.iobyxmoadg().eablkybsjg(), colorsUiModel, new b62.iobyxmoadg(wkgbmnqykcVar.iobyxmoadg().ppxfxbqfkf(), wkgbmnqykcVar.iobyxmoadg().wkgbmnqykc()), wkgbmnqykcVar.iobyxmoadg().iobyxmoadg(), wkgbmnqykcVar.iobyxmoadg().zoijcleaow());
    }

    private final r62.zoijcleaow dsvhmnatus(c52.hkdspvbjdz hkdspvbjdzVar) {
        String strValueOf = String.valueOf(hkdspvbjdzVar.zoijcleaow());
        List listIobyxmoadg = hkdspvbjdzVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        Iterator it = listIobyxmoadg.iterator();
        while (it.hasNext()) {
            arrayList.add(cllcsxoeiz((c52.hkdspvbjdz.iobyxmoadg) it.next()));
        }
        return new r62.zoijcleaow(strValueOf, arrayList);
    }

    private final String dxjokdxxww(String str) {
        return this.f104264eablkybsjg.rgvfuqvkyq(str, "");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x000e A[SYNTHETIC] */
    private final List esjtqupxsv(List list, c52.cdpycssgdh cdpycssgdhVar, Map map, User user, boolean z13, boolean z14, boolean z15, c52.ylkuphrtab ylkuphrtabVar, List list2, ColorsUiModel colorsUiModel, DeliveryCode deliveryCode, boolean z16, Collection collection, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        o00.iobyxmoadg iobyxmoadgVarJlmebxxoox;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c52.zynmafqrjb zynmafqrjbVar = (c52.zynmafqrjb) it.next();
            if (zynmafqrjbVar instanceof c52.wflxmlrfwp) {
                iobyxmoadgVarJlmebxxoox = iobyxmoadg((c52.wflxmlrfwp) zynmafqrjbVar, colorsUiModel, z16);
            } else if (zynmafqrjbVar instanceof c52.dsvhmnatus) {
                iobyxmoadgVarJlmebxxoox = iwizpuwonk((c52.dsvhmnatus) zynmafqrjbVar, colorsUiModel, z16);
            } else if (zynmafqrjbVar instanceof c52.ojitshcjhn) {
                iobyxmoadgVarJlmebxxoox = ntlheqmsrt((c52.ojitshcjhn) zynmafqrjbVar);
            } else if (zynmafqrjbVar instanceof c52.eablkybsjg) {
                iobyxmoadgVarJlmebxxoox = wflxmlrfwp((c52.eablkybsjg) zynmafqrjbVar, colorsUiModel);
            } else if (zynmafqrjbVar instanceof c52.wkgbmnqykc) {
                iobyxmoadgVarJlmebxxoox = draadjrbmk((c52.wkgbmnqykc) zynmafqrjbVar, colorsUiModel);
            } else if (zynmafqrjbVar instanceof c52.gxszxtbevo) {
                iobyxmoadgVarJlmebxxoox = agtfadlqog((c52.gxszxtbevo) zynmafqrjbVar, colorsUiModel);
            } else if (zynmafqrjbVar instanceof c52.btonecajqb) {
                iobyxmoadgVarJlmebxxoox = vdvldrhtss((c52.btonecajqb) zynmafqrjbVar);
            } else if (zynmafqrjbVar instanceof c52.draadjrbmk) {
                iobyxmoadgVarJlmebxxoox = yggfygwlhe((c52.draadjrbmk) zynmafqrjbVar);
            } else if (zynmafqrjbVar instanceof c52.kcexrzcfyt) {
                iobyxmoadgVarJlmebxxoox = jyumaefscl((c52.kcexrzcfyt) zynmafqrjbVar, colorsUiModel, z16);
            } else if (zynmafqrjbVar instanceof c52.stevsuqkhv) {
                iobyxmoadgVarJlmebxxoox = stevsuqkhv((c52.stevsuqkhv) zynmafqrjbVar, colorsUiModel);
            } else if (zynmafqrjbVar instanceof c52.tzroggbefp) {
                iobyxmoadgVarJlmebxxoox = kegysxyocb((c52.tzroggbefp) zynmafqrjbVar, colorsUiModel);
            } else if (zynmafqrjbVar instanceof c52.iobyxmoadg) {
                iobyxmoadgVarJlmebxxoox = hkdspvbjdz((c52.iobyxmoadg) zynmafqrjbVar, colorsUiModel, z16);
            } else {
                if (zynmafqrjbVar instanceof c52.iwizpuwonk) {
                    iobyxmoadgVarJlmebxxoox = iozdgvuglv((c52.iwizpuwonk) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof c52.oxmwwwfdhm) {
                    c52.oxmwwwfdhm oxmwwwfdhmVar = (c52.oxmwwwfdhm) zynmafqrjbVar;
                    iobyxmoadgVarJlmebxxoox = lereixgezr(oxmwwwfdhmVar, cdpycssgdhVar, (BoundingBox) map.get(String.valueOf(oxmwwwfdhmVar.zoijcleaow())));
                } else if (zynmafqrjbVar instanceof c52.yggfygwlhe) {
                    iobyxmoadgVarJlmebxxoox = ylkuphrtab((c52.yggfygwlhe) zynmafqrjbVar, list2, colorsUiModel, deliveryCode, z14, z15, rgvfuqvkyqVar);
                } else if (zynmafqrjbVar instanceof c52.gtknphoqwx) {
                    iobyxmoadgVarJlmebxxoox = kcexrzcfyt((c52.gtknphoqwx) zynmafqrjbVar, z13, user);
                } else if (zynmafqrjbVar instanceof c52.lqeggnwhkg) {
                    iobyxmoadgVarJlmebxxoox = ojitshcjhn((c52.lqeggnwhkg) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof c52.cqumvgiudr) {
                    iobyxmoadgVarJlmebxxoox = wwaezpbzkn((c52.cqumvgiudr) zynmafqrjbVar, ylkuphrtabVar, colorsUiModel);
                } else if (zynmafqrjbVar instanceof c52.cllcsxoeiz) {
                    iobyxmoadgVarJlmebxxoox = wypolnanlu((c52.cllcsxoeiz) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof c52.zoijcleaow) {
                    iobyxmoadgVarJlmebxxoox = lmojexxdyd((c52.zoijcleaow) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof c52.agtfadlqog) {
                    iobyxmoadgVarJlmebxxoox = sopmlzcsov((c52.agtfadlqog) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof c52.hkdspvbjdz) {
                    iobyxmoadgVarJlmebxxoox = dsvhmnatus((c52.hkdspvbjdz) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof c52.dxjokdxxww) {
                    iobyxmoadgVarJlmebxxoox = pkzmftpjix((c52.dxjokdxxww) zynmafqrjbVar, colorsUiModel);
                } else if (zynmafqrjbVar instanceof c52.wypolnanlu) {
                    iobyxmoadgVarJlmebxxoox = crxdokpmqz((c52.wypolnanlu) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof c52.ppxfxbqfkf) {
                    iobyxmoadgVarJlmebxxoox = gtknphoqwx((c52.ppxfxbqfkf) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof c52.vdvldrhtss) {
                    iobyxmoadgVarJlmebxxoox = tzroggbefp((c52.vdvldrhtss) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof c52.jyumaefscl) {
                    iobyxmoadgVarJlmebxxoox = mbcevpiqjq((c52.jyumaefscl) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof c52.nufgyqmvbu) {
                    iobyxmoadgVarJlmebxxoox = rgvfuqvkyq((c52.nufgyqmvbu) zynmafqrjbVar);
                } else {
                    if (!(zynmafqrjbVar instanceof c52.pkzmftpjix)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadgVarJlmebxxoox = jlmebxxoox((c52.pkzmftpjix) zynmafqrjbVar, colorsUiModel, z16, collection);
                }
                if (iobyxmoadgVarJlmebxxoox != null) {
                    arrayList.add(iobyxmoadgVarJlmebxxoox);
                }
            }
            if (iobyxmoadgVarJlmebxxoox != null) {
                arrayList.add(iobyxmoadgVarJlmebxxoox);
            }
        }
        return arrayList;
    }

    private final a62.iobyxmoadg gtknphoqwx(c52.ppxfxbqfkf ppxfxbqfkfVar) {
        return new a62.iobyxmoadg(String.valueOf(ppxfxbqfkfVar.iobyxmoadg().hashCode()), ppxfxbqfkfVar.iobyxmoadg().iobyxmoadg(), ppxfxbqfkfVar.iobyxmoadg().zoijcleaow());
    }

    private final v52.iobyxmoadg gxszxtbevo(c52.vdvldrhtss.ppxfxbqfkf ppxfxbqfkfVar) {
        y52.iobyxmoadg iobyxmoadgVar;
        String strEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
        String strIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        if (ppxfxbqfkfVar.gxszxtbevo() && ppxfxbqfkfVar.ppxfxbqfkf()) {
            iobyxmoadgVar = y52.iobyxmoadg.LEVEL_BLOCKED;
        } else {
            iobyxmoadgVar = (!ppxfxbqfkfVar.gxszxtbevo() || ppxfxbqfkfVar.ppxfxbqfkf()) ? y52.iobyxmoadg.LEVEL_WITH_INFO : y52.iobyxmoadg.LEVEL_WITH_LOCKS;
        }
        return new v52.iobyxmoadg(strEablkybsjg, strIobyxmoadg, iobyxmoadgVar, ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.wkgbmnqykc());
    }

    private final p62.zoijcleaow hcddaimhww(c52.ylkuphrtab ylkuphrtabVar) {
        return new p62.zoijcleaow(ylkuphrtabVar.eablkybsjg(), ylkuphrtabVar.ppxfxbqfkf(), ylkuphrtabVar.wkgbmnqykc(), ylkuphrtabVar.iobyxmoadg(), ylkuphrtabVar.zoijcleaow());
    }

    private final q62.ppxfxbqfkf hkdspvbjdz(c52.iobyxmoadg iobyxmoadgVar, ColorsUiModel colorsUiModel, boolean z13) {
        String strValueOf = String.valueOf(iobyxmoadgVar.zoijcleaow());
        List listIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(jpowsppfya((c52.iobyxmoadg.C0343iobyxmoadg) obj, i13, colorsUiModel, z13));
            i13 = i14;
        }
        return new q62.ppxfxbqfkf(strValueOf, new q62.zoijcleaow(arrayList, colorsUiModel, z13));
    }

    private final o00.iobyxmoadg iobyxmoadg(c52.wflxmlrfwp wflxmlrfwpVar, ColorsUiModel colorsUiModel, boolean z13) {
        o00.iobyxmoadg zoijcleaowVar;
        switch (iobyxmoadg.f104269iobyxmoadg[wflxmlrfwpVar.iobyxmoadg().ppxfxbqfkf().ordinal()]) {
            case 1:
                zoijcleaowVar = new g62.zoijcleaow(String.valueOf(wflxmlrfwpVar.zoijcleaow()), wflxmlrfwpVar.iobyxmoadg().wkgbmnqykc(), colorsUiModel, z13);
                break;
            case 2:
                zoijcleaowVar = new g62.eablkybsjg(String.valueOf(wflxmlrfwpVar.zoijcleaow()), wflxmlrfwpVar.iobyxmoadg().wkgbmnqykc(), colorsUiModel, z13);
                break;
            case 3:
                zoijcleaowVar = new g62.wkgbmnqykc(String.valueOf(wflxmlrfwpVar.zoijcleaow()), wflxmlrfwpVar.iobyxmoadg().wkgbmnqykc(), colorsUiModel, z13);
                break;
            case 4:
                String strValueOf = String.valueOf(wflxmlrfwpVar.zoijcleaow());
                String strWkgbmnqykc = wflxmlrfwpVar.iobyxmoadg().wkgbmnqykc();
                boolean zLqeggnwhkg = wflxmlrfwpVar.iobyxmoadg().iobyxmoadg().lqeggnwhkg();
                f40.zoijcleaow zoijcleaowVarIobyxmoadg = wflxmlrfwpVar.iobyxmoadg().iobyxmoadg();
                String strZoijcleaow = wflxmlrfwpVar.iobyxmoadg().zoijcleaow();
                if (strZoijcleaow == null) {
                    strZoijcleaow = "";
                }
                zoijcleaowVar = new g62.iobyxmoadg(strValueOf, strWkgbmnqykc, zLqeggnwhkg, colorsUiModel, z13, zoijcleaowVarIobyxmoadg, strZoijcleaow);
                break;
            case 5:
                zoijcleaowVar = new g62.ppxfxbqfkf(String.valueOf(wflxmlrfwpVar.zoijcleaow()), wflxmlrfwpVar.iobyxmoadg().wkgbmnqykc(), colorsUiModel, z13);
                break;
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return zoijcleaowVar;
    }

    private final n62.zoijcleaow iozdgvuglv(c52.iwizpuwonk iwizpuwonkVar) {
        String strValueOf = String.valueOf(iwizpuwonkVar.zoijcleaow());
        List listIobyxmoadg = iwizpuwonkVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(yadqdtsiqt((c52.iwizpuwonk.iobyxmoadg) obj, i13));
            i13 = i14;
        }
        return new n62.zoijcleaow(strValueOf, arrayList);
    }

    private final m62.iobyxmoadg istkbnxepw(c52.wwaezpbzkn wwaezpbzknVar) {
        return new m62.iobyxmoadg(wwaezpbzknVar.eablkybsjg(), wwaezpbzknVar.iobyxmoadg(), wwaezpbzknVar.zoijcleaow(), wwaezpbzknVar.ppxfxbqfkf(), wwaezpbzknVar.wkgbmnqykc());
    }

    private final j62.iobyxmoadg iwizpuwonk(c52.dsvhmnatus dsvhmnatusVar, ColorsUiModel colorsUiModel, boolean z13) {
        return new j62.iobyxmoadg(btonecajqb(dsvhmnatusVar.iobyxmoadg().iobyxmoadg()), String.valueOf(dsvhmnatusVar.zoijcleaow()), colorsUiModel, z13);
    }

    private final z62.iobyxmoadg jlmebxxoox(c52.pkzmftpjix pkzmftpjixVar, ColorsUiModel colorsUiModel, boolean z13, Collection collection) {
        return new z62.iobyxmoadg(String.valueOf(pkzmftpjixVar.iobyxmoadg()), pkzmftpjixVar.zoijcleaow().getCollectionId(), pkzmftpjixVar.zoijcleaow().getName(), pkzmftpjixVar.ppxfxbqfkf(), colorsUiModel, z13, false, collection.contains(pkzmftpjixVar.zoijcleaow().getCollectionId()), 64, null);
    }

    private final q62.iobyxmoadg jpowsppfya(c52.iobyxmoadg.C0343iobyxmoadg c0343iobyxmoadg, int i13, ColorsUiModel colorsUiModel, boolean z13) {
        return new q62.iobyxmoadg(String.valueOf(i13), btonecajqb(c0343iobyxmoadg.iobyxmoadg()), c0343iobyxmoadg.zoijcleaow(), colorsUiModel, z13, false, 32, null);
    }

    private final i62.zoijcleaow jyumaefscl(c52.kcexrzcfyt kcexrzcfytVar, ColorsUiModel colorsUiModel, boolean z13) {
        return new i62.zoijcleaow(String.valueOf(kcexrzcfytVar.zoijcleaow()), new i62.ppxfxbqfkf(hg.jyumaefscl.eablkybsjg(new i62.iobyxmoadg(String.valueOf(kcexrzcfytVar.zoijcleaow()), kcexrzcfytVar.iobyxmoadg().ppxfxbqfkf(), kcexrzcfytVar.iobyxmoadg().zoijcleaow(), btonecajqb(dxjokdxxww(kcexrzcfytVar.iobyxmoadg().wkgbmnqykc())), kcexrzcfytVar.iobyxmoadg().iobyxmoadg(), colorsUiModel, z13))));
    }

    private final f62.iobyxmoadg kcexrzcfyt(c52.gtknphoqwx gtknphoqwxVar, boolean z13, User user) {
        c52.pmvmpeiblj pmvmpeibljVar;
        if (!z13) {
            return null;
        }
        String strValueOf = String.valueOf(gtknphoqwxVar.zoijcleaow());
        String strIobyxmoadg = gtknphoqwxVar.iobyxmoadg().iobyxmoadg();
        String lastName = user != null ? user.getLastName() : null;
        if (lastName == null) {
            lastName = "";
        }
        String firstName = user != null ? user.getFirstName() : null;
        if (firstName == null) {
            firstName = "";
        }
        String str = lastName + " " + firstName;
        String str2 = mj.kcexrzcfyt.zfvoamnweg(str) ? "" : str;
        String phone = user != null ? user.getPhone() : null;
        String str3 = phone == null ? "" : phone;
        String email = user != null ? user.getEmail() : null;
        String str4 = email == null ? "" : email;
        boolean z14 = gtknphoqwxVar.iobyxmoadg().zoijcleaow() == c52.lereixgezr.ALL;
        int i13 = iobyxmoadg.f104271zoijcleaow[gtknphoqwxVar.iobyxmoadg().zoijcleaow().ordinal()];
        if (i13 == 1) {
            pmvmpeibljVar = c52.pmvmpeiblj.NONE;
        } else if (i13 == 2) {
            pmvmpeibljVar = c52.pmvmpeiblj.ONLINE;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pmvmpeibljVar = c52.pmvmpeiblj.IN_STORE;
        }
        return new f62.iobyxmoadg(strValueOf, strIobyxmoadg, str2, str3, str4, null, null, null, null, false, z14, pmvmpeibljVar, null, 5088, null);
    }

    private final t62.wkgbmnqykc kegysxyocb(c52.tzroggbefp tzroggbefpVar, ColorsUiModel colorsUiModel) {
        String strValueOf = String.valueOf(tzroggbefpVar.zoijcleaow());
        List listIobyxmoadg = tzroggbefpVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            c52.kegysxyocb kegysxyocbVar = (c52.kegysxyocb) obj;
            arrayList.add(new t62.iobyxmoadg(String.valueOf(i13), kegysxyocbVar.iobyxmoadg(), kegysxyocbVar.zoijcleaow(), colorsUiModel));
            i13 = i14;
        }
        return new t62.wkgbmnqykc(strValueOf, arrayList);
    }

    private final k62.iobyxmoadg lereixgezr(c52.oxmwwwfdhm oxmwwwfdhmVar, c52.cdpycssgdh cdpycssgdhVar, BoundingBox boundingBox) {
        String strValueOf = String.valueOf(oxmwwwfdhmVar.zoijcleaow());
        List listIobyxmoadg = oxmwwwfdhmVar.iobyxmoadg().iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(zynmafqrjb((Shop) obj, i13, cdpycssgdhVar.zoijcleaow()));
            i13 = i14;
        }
        return new k62.iobyxmoadg(strValueOf, boundingBox, false, arrayList, 4, null);
    }

    private final o00.iobyxmoadg lmojexxdyd(c52.zoijcleaow zoijcleaowVar) {
        int i13 = iobyxmoadg.f104270ppxfxbqfkf[zoijcleaowVar.ppxfxbqfkf().ordinal()];
        int i14 = 0;
        if (i13 == 1) {
            String strValueOf = String.valueOf(zoijcleaowVar.zoijcleaow());
            c52.jpowsppfya jpowsppfyaVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
            List listIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
            for (Object obj : listIobyxmoadg) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                arrayList.add(ulzqkzuiru((c52.zoijcleaow.iobyxmoadg) obj, i14));
                i14 = i15;
            }
            return new z52.wkgbmnqykc(strValueOf, jpowsppfyaVarPpxfxbqfkf, arrayList);
        }
        if (i13 == 2) {
            String strValueOf2 = String.valueOf(zoijcleaowVar.zoijcleaow());
            c52.jpowsppfya jpowsppfyaVarPpxfxbqfkf2 = zoijcleaowVar.ppxfxbqfkf();
            List listIobyxmoadg2 = zoijcleaowVar.iobyxmoadg();
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg2, 10));
            for (Object obj2 : listIobyxmoadg2) {
                int i16 = i14 + 1;
                if (i14 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                arrayList2.add(ulzqkzuiru((c52.zoijcleaow.iobyxmoadg) obj2, i14));
                i14 = i16;
            }
            return new z52.btonecajqb(strValueOf2, jpowsppfyaVarPpxfxbqfkf2, arrayList2);
        }
        if (i13 != 3) {
            return null;
        }
        String strValueOf3 = String.valueOf(zoijcleaowVar.zoijcleaow());
        c52.jpowsppfya jpowsppfyaVarPpxfxbqfkf3 = zoijcleaowVar.ppxfxbqfkf();
        List listIobyxmoadg3 = zoijcleaowVar.iobyxmoadg();
        ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg3, 10));
        for (Object obj3 : listIobyxmoadg3) {
            int i17 = i14 + 1;
            if (i14 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList3.add(ulzqkzuiru((c52.zoijcleaow.iobyxmoadg) obj3, i14));
            i14 = i17;
        }
        return new z52.lqeggnwhkg(strValueOf3, jpowsppfyaVarPpxfxbqfkf3, arrayList3);
    }

    private final ProductUiModel lqeggnwhkg(Product product, List list, DeliveryCode deliveryCode, boolean z13, boolean z14, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        MeasureTypeModel measureTypeModel;
        ProductUiModel productUiModelPpxfxbqfkf = this.f104268zoijcleaow.ppxfxbqfkf(product, list, deliveryCode, z13, z14, false, (64 & 64) != 0 ? null : null, rgvfuqvkyqVar);
        if (productUiModelPpxfxbqfkf.getMeasureTypeModel().nufgyqmvbu()) {
            MeasureTypeModel measureTypeModel2 = productUiModelPpxfxbqfkf.getMeasureTypeModel();
            List units = productUiModelPpxfxbqfkf.getMeasureTypeModel().getUnits();
            ArrayList arrayList = new ArrayList();
            for (Object obj : units) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((MeasureType) obj).getValue(), productUiModelPpxfxbqfkf.getMeasureTypeModel().getOriginalMeasure().getValue())) {
                    arrayList.add(obj);
                }
            }
            measureTypeModel = MeasureTypeModel.ppxfxbqfkf(measureTypeModel2, arrayList, null, null, 6, null);
        } else {
            measureTypeModel = productUiModelPpxfxbqfkf.getMeasureTypeModel();
        }
        return productUiModelPpxfxbqfkf.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModelPpxfxbqfkf.id : null, ((-1025) & 2) != 0 ? productUiModelPpxfxbqfkf.name : null, ((-1025) & 4) != 0 ? productUiModelPpxfxbqfkf.article : null, ((-1025) & 8) != 0 ? productUiModelPpxfxbqfkf.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModelPpxfxbqfkf.price : 0.0d, ((-1025) & 32) != 0 ? productUiModelPpxfxbqfkf.oldPrice : null, ((-1025) & 64) != 0 ? productUiModelPpxfxbqfkf.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelPpxfxbqfkf.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelPpxfxbqfkf.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelPpxfxbqfkf.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelPpxfxbqfkf.measureTypeModel : measureTypeModel, ((-1025) & 2048) != 0 ? productUiModelPpxfxbqfkf.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModelPpxfxbqfkf.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModelPpxfxbqfkf.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModelPpxfxbqfkf.inCart : false, ((-1025) & 32768) != 0 ? productUiModelPpxfxbqfkf.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModelPpxfxbqfkf.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModelPpxfxbqfkf.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModelPpxfxbqfkf.fats : null, ((-1025) & 524288) != 0 ? productUiModelPpxfxbqfkf.carbs : null, ((-1025) & 1048576) != 0 ? productUiModelPpxfxbqfkf.protein : null, ((-1025) & 2097152) != 0 ? productUiModelPpxfxbqfkf.energy : null, ((-1025) & 4194304) != 0 ? productUiModelPpxfxbqfkf.params : null, ((-1025) & 8388608) != 0 ? productUiModelPpxfxbqfkf.description : null, ((-1025) & 16777216) != 0 ? productUiModelPpxfxbqfkf.chemical : null, ((-1025) & 33554432) != 0 ? productUiModelPpxfxbqfkf.buyState : null, ((-1025) & 67108864) != 0 ? productUiModelPpxfxbqfkf.stickers : null, ((-1025) & 134217728) != 0 ? productUiModelPpxfxbqfkf.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModelPpxfxbqfkf.rating : null, ((-1025) & 536870912) != 0 ? productUiModelPpxfxbqfkf.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModelPpxfxbqfkf.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModelPpxfxbqfkf.isPmProduct : false, (16777215 & 1) != 0 ? productUiModelPpxfxbqfkf.video : null, (16777215 & 2) != 0 ? productUiModelPpxfxbqfkf.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModelPpxfxbqfkf.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModelPpxfxbqfkf.country : null, (16777215 & 16) != 0 ? productUiModelPpxfxbqfkf.region : null, (16777215 & 32) != 0 ? productUiModelPpxfxbqfkf.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModelPpxfxbqfkf.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelPpxfxbqfkf.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelPpxfxbqfkf.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelPpxfxbqfkf.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelPpxfxbqfkf.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModelPpxfxbqfkf.tasting : null, (16777215 & 4096) != 0 ? productUiModelPpxfxbqfkf.styling : null, (16777215 & 8192) != 0 ? productUiModelPpxfxbqfkf.button : null, (16777215 & 16384) != 0 ? productUiModelPpxfxbqfkf.hints : null, (16777215 & 32768) != 0 ? productUiModelPpxfxbqfkf.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModelPpxfxbqfkf.counterModel : null, (16777215 & 131072) != 0 ? productUiModelPpxfxbqfkf.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModelPpxfxbqfkf.vivino : null, (16777215 & 524288) != 0 ? productUiModelPpxfxbqfkf.limits : null, (16777215 & 1048576) != 0 ? productUiModelPpxfxbqfkf.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModelPpxfxbqfkf.productVariants : null, (16777215 & 4194304) != 0 ? productUiModelPpxfxbqfkf.isSelected : null, (16777215 & 8388608) != 0 ? productUiModelPpxfxbqfkf.adv : null);
    }

    private final w62.iobyxmoadg mbcevpiqjq(c52.jyumaefscl jyumaefsclVar) {
        return new w62.iobyxmoadg(String.valueOf(jyumaefsclVar.zoijcleaow()), jyumaefsclVar.iobyxmoadg().ppxfxbqfkf(), jyumaefsclVar.iobyxmoadg().wkgbmnqykc(), zoijcleaow(jyumaefsclVar.iobyxmoadg().iobyxmoadg()), jyumaefsclVar.iobyxmoadg().eablkybsjg(), jyumaefsclVar.iobyxmoadg().zoijcleaow());
    }

    private final z52.iobyxmoadg ntlheqmsrt(c52.ojitshcjhn ojitshcjhnVar) {
        return new z52.iobyxmoadg(String.valueOf(ojitshcjhnVar.zoijcleaow()), ojitshcjhnVar.iobyxmoadg().ppxfxbqfkf(), btonecajqb(ojitshcjhnVar.iobyxmoadg().zoijcleaow()), ojitshcjhnVar.iobyxmoadg().iobyxmoadg());
    }

    private final c62.iobyxmoadg ojitshcjhn(c52.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar.iobyxmoadg().isEmpty()) {
            return null;
        }
        return new c62.iobyxmoadg(String.valueOf(lqeggnwhkgVar.zoijcleaow()), this.f104265iobyxmoadg.ppxfxbqfkf(lqeggnwhkgVar.iobyxmoadg(), true));
    }

    private final e62.zoijcleaow oxmwwwfdhm(c52.btonecajqb.iobyxmoadg iobyxmoadgVar, int i13) {
        String strValueOf = String.valueOf(i13);
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
        String strEablkybsjg = iobyxmoadgVar.eablkybsjg();
        String strWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        StringBuilder sb3 = new StringBuilder();
        boolean zZfvoamnweg = mj.kcexrzcfyt.zfvoamnweg(iobyxmoadgVar.eablkybsjg());
        boolean zZfvoamnweg2 = mj.kcexrzcfyt.zfvoamnweg(iobyxmoadgVar.wkgbmnqykc());
        if (!zZfvoamnweg) {
            String upperCase = iobyxmoadgVar.eablkybsjg().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperCase, "toUpperCase(...)");
            sb3.append(upperCase);
        }
        if (!zZfvoamnweg && !zZfvoamnweg2) {
            sb3.append(StringUtils.COMMA);
        }
        String upperCase2 = iobyxmoadgVar.wkgbmnqykc().toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperCase2, "toUpperCase(...)");
        sb3.append(upperCase2);
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        return new e62.zoijcleaow(strValueOf, strPpxfxbqfkf, strIobyxmoadg, strZoijcleaow, strEablkybsjg, strWkgbmnqykc, sb3.toString());
    }

    private final o90.wkgbmnqykc pkzmftpjix(c52.dxjokdxxww dxjokdxxwwVar, ColorsUiModel colorsUiModel) {
        String strValueOf = String.valueOf(dxjokdxxwwVar.zoijcleaow());
        String strGxszxtbevo = dxjokdxxwwVar.iobyxmoadg().gxszxtbevo();
        String strEablkybsjg = dxjokdxxwwVar.iobyxmoadg().eablkybsjg();
        String strZoijcleaow = dxjokdxxwwVar.iobyxmoadg().zoijcleaow();
        String strPpxfxbqfkf = dxjokdxxwwVar.iobyxmoadg().ppxfxbqfkf();
        c52.wkgbmnqykc.iobyxmoadg iobyxmoadgVarIobyxmoadg = dxjokdxxwwVar.iobyxmoadg().iobyxmoadg();
        o90.iobyxmoadg iobyxmoadgVar = iobyxmoadgVarIobyxmoadg != null ? new o90.iobyxmoadg(iobyxmoadgVarIobyxmoadg.eablkybsjg(), iobyxmoadgVarIobyxmoadg.iobyxmoadg(), iobyxmoadgVarIobyxmoadg.zoijcleaow(), iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(), iobyxmoadgVarIobyxmoadg.wkgbmnqykc()) : null;
        c52.dxjokdxxww.iobyxmoadg iobyxmoadgVar2 = (c52.dxjokdxxww.iobyxmoadg) hg.jyumaefscl.weqkydbzbr(dxjokdxxwwVar.iobyxmoadg().wkgbmnqykc());
        String strZoijcleaow2 = iobyxmoadgVar2 != null ? iobyxmoadgVar2.zoijcleaow() : null;
        boolean z13 = !dxjokdxxwwVar.iobyxmoadg().wkgbmnqykc().isEmpty();
        List listWkgbmnqykc = dxjokdxxwwVar.iobyxmoadg().wkgbmnqykc();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
        Iterator it = listWkgbmnqykc.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg((c52.dxjokdxxww.iobyxmoadg) it.next()));
        }
        return new o90.wkgbmnqykc(strValueOf, colorsUiModel, strGxszxtbevo, strEablkybsjg, strZoijcleaow, iobyxmoadgVar, strPpxfxbqfkf, strZoijcleaow2, arrayList, z13, null, UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    private final k62.zoijcleaow pmvmpeiblj(ShopService shopService, int i13) {
        return new k62.zoijcleaow(String.valueOf(i13), shopService.getName(), shopService.getPic());
    }

    private final d62.iobyxmoadg rgvfuqvkyq(c52.nufgyqmvbu nufgyqmvbuVar) {
        return new d62.iobyxmoadg(String.valueOf(nufgyqmvbuVar.iobyxmoadg()), s40.gxszxtbevo.sb_divider_round_white);
    }

    private final z52.draadjrbmk sopmlzcsov(c52.agtfadlqog agtfadlqogVar) {
        return new z52.draadjrbmk(String.valueOf(agtfadlqogVar.zoijcleaow()), agtfadlqogVar.iobyxmoadg().zoijcleaow(), agtfadlqogVar.iobyxmoadg().ppxfxbqfkf(), agtfadlqogVar.iobyxmoadg().wkgbmnqykc(), agtfadlqogVar.iobyxmoadg().iobyxmoadg());
    }

    private final t62.iobyxmoadg stevsuqkhv(c52.stevsuqkhv stevsuqkhvVar, ColorsUiModel colorsUiModel) {
        return new t62.iobyxmoadg(String.valueOf(stevsuqkhvVar.zoijcleaow()), stevsuqkhvVar.iobyxmoadg().iobyxmoadg(), stevsuqkhvVar.iobyxmoadg().zoijcleaow(), colorsUiModel);
    }

    private final v52.zoijcleaow tzroggbefp(c52.vdvldrhtss vdvldrhtssVar) {
        String strValueOf = String.valueOf(vdvldrhtssVar.iobyxmoadg());
        List listZoijcleaow = vdvldrhtssVar.zoijcleaow();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
        Iterator it = listZoijcleaow.iterator();
        while (it.hasNext()) {
            arrayList.add(gxszxtbevo((c52.vdvldrhtss.ppxfxbqfkf) it.next()));
        }
        return new v52.zoijcleaow(strValueOf, arrayList);
    }

    private final z52.zoijcleaow ulzqkzuiru(c52.zoijcleaow.iobyxmoadg iobyxmoadgVar, int i13) {
        return new z52.zoijcleaow(i13 + 1, iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg());
    }

    private final e62.iobyxmoadg vdvldrhtss(c52.btonecajqb btonecajqbVar) {
        String strValueOf = String.valueOf(btonecajqbVar.zoijcleaow());
        List listIobyxmoadg = btonecajqbVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(oxmwwwfdhm((c52.btonecajqb.iobyxmoadg) obj, i13));
            i13 = i14;
        }
        return new e62.iobyxmoadg(strValueOf, arrayList);
    }

    private final b62.zoijcleaow.C0261zoijcleaow wflxmlrfwp(c52.eablkybsjg eablkybsjgVar, ColorsUiModel colorsUiModel) {
        return new b62.zoijcleaow.C0261zoijcleaow(String.valueOf(eablkybsjgVar.zoijcleaow()), eablkybsjgVar.iobyxmoadg().iobyxmoadg(), colorsUiModel, new b62.iobyxmoadg(f40.zoijcleaow.URL, eablkybsjgVar.iobyxmoadg().zoijcleaow()));
    }

    private final o00.iobyxmoadg wwaezpbzkn(c52.cqumvgiudr cqumvgiudrVar, c52.ylkuphrtab ylkuphrtabVar, ColorsUiModel colorsUiModel) {
        return ppxfxbqfkf(cqumvgiudrVar.zoijcleaow(), cqumvgiudrVar.iobyxmoadg(), ylkuphrtabVar, colorsUiModel);
    }

    private final s62.zoijcleaow wypolnanlu(c52.cllcsxoeiz cllcsxoeizVar) {
        List listCqumvgiudr = cqumvgiudr(cllcsxoeizVar.iobyxmoadg());
        List list = (List) hg.jyumaefscl.weqkydbzbr(cllcsxoeizVar.iobyxmoadg().iobyxmoadg());
        return new s62.zoijcleaow(null, list != null ? list.size() : 2, listCqumvgiudr, 1, null);
    }

    private final n62.iobyxmoadg yadqdtsiqt(c52.iwizpuwonk.iobyxmoadg iobyxmoadgVar, int i13) {
        return new n62.iobyxmoadg(String.valueOf(i13), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.ppxfxbqfkf());
    }

    private final h62.ppxfxbqfkf yggfygwlhe(c52.draadjrbmk draadjrbmkVar) {
        String strValueOf = String.valueOf(draadjrbmkVar.zoijcleaow());
        List listIobyxmoadg = draadjrbmkVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(zdlpuopuiu((c52.draadjrbmk.iobyxmoadg) obj, i13));
            i13 = i14;
        }
        return new h62.ppxfxbqfkf(strValueOf, new h62.zoijcleaow(arrayList));
    }

    private final o62.iobyxmoadg ylkuphrtab(c52.yggfygwlhe yggfygwlheVar, List list, ColorsUiModel colorsUiModel, DeliveryCode deliveryCode, boolean z13, boolean z14, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (yggfygwlheVar.iobyxmoadg().ppxfxbqfkf().isEmpty()) {
            return null;
        }
        String strValueOf = String.valueOf(yggfygwlheVar.zoijcleaow());
        String strGxszxtbevo = yggfygwlheVar.iobyxmoadg().gxszxtbevo();
        String strZoijcleaow = yggfygwlheVar.iobyxmoadg().zoijcleaow();
        String strIobyxmoadg = yggfygwlheVar.iobyxmoadg().iobyxmoadg();
        String strEablkybsjg = yggfygwlheVar.iobyxmoadg().eablkybsjg();
        f40.zoijcleaow zoijcleaowVarWkgbmnqykc = yggfygwlheVar.iobyxmoadg().wkgbmnqykc();
        List listPpxfxbqfkf = yggfygwlheVar.iobyxmoadg().ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkg((Product) it.next(), list, deliveryCode, z13, z14, rgvfuqvkyqVar));
        }
        return new o62.iobyxmoadg(strValueOf, strGxszxtbevo, strZoijcleaow, strIobyxmoadg, strEablkybsjg, zoijcleaowVarWkgbmnqykc, arrayList, colorsUiModel);
    }

    private final h62.iobyxmoadg zdlpuopuiu(c52.draadjrbmk.iobyxmoadg iobyxmoadgVar, int i13) {
        return new h62.iobyxmoadg(String.valueOf(i13), iobyxmoadgVar.ppxfxbqfkf(), btonecajqb(iobyxmoadgVar.zoijcleaow()), iobyxmoadgVar.iobyxmoadg());
    }

    private final w62.iobyxmoadg.InterfaceC2957iobyxmoadg zoijcleaow(String str) {
        if (mj.kcexrzcfyt.zfvoamnweg(str)) {
            str = null;
        }
        return str != null ? new w62.iobyxmoadg.InterfaceC2957iobyxmoadg.zoijcleaow(str) : new w62.iobyxmoadg.InterfaceC2957iobyxmoadg.C2958iobyxmoadg(pm.dxjokdxxww.special_banner_promo_balance_error_message);
    }

    private final k62.ppxfxbqfkf zynmafqrjb(Shop shop, int i13, List list) {
        String strValueOf = String.valueOf(i13);
        String metro = shop.getMetro();
        String address = (metro == null || metro.length() == 0) ? shop.getAddress() : shop.getAddress() + " " + shop.getMetro();
        String type = shop.getType();
        String hours = shop.getHours();
        Point pointBtonecajqb = shop.btonecajqb();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (shop.getServices().contains(((ShopService) obj).getName())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
        int i14 = 0;
        for (Object obj2 : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList2.add(pmvmpeiblj((ShopService) obj2, i14));
            i14 = i15;
        }
        return new k62.ppxfxbqfkf(strValueOf, address, type, hours, pointBtonecajqb, arrayList2);
    }

    public final o90.ppxfxbqfkf eablkybsjg(c52.dxjokdxxww.iobyxmoadg model) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        return new o90.ppxfxbqfkf(model.iobyxmoadg(), model.zoijcleaow());
    }

    public final p62.ppxfxbqfkf nufgyqmvbu(c52.cqumvgiudr.zoijcleaow model, c52.ylkuphrtab ylkuphrtabVar, ColorsUiModel colorsUiModel) {
        p62.zoijcleaow zoijcleaowVarHcddaimhww;
        p62.zoijcleaow zoijcleaowVarHcddaimhww2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        String strIobyxmoadg = model.iobyxmoadg();
        String strGxszxtbevo = model.gxszxtbevo();
        String strWkgbmnqykc = model.wkgbmnqykc();
        String strEablkybsjg = model.eablkybsjg();
        String strDxjokdxxww = model.dxjokdxxww();
        Double dNufgyqmvbu = model.nufgyqmvbu();
        Double dLqeggnwhkg = model.lqeggnwhkg();
        String strBtonecajqb = model.btonecajqb();
        boolean zZoijcleaow = model.zoijcleaow();
        c52.ylkuphrtab ylkuphrtabVarPpxfxbqfkf = model.ppxfxbqfkf();
        if (ylkuphrtabVarPpxfxbqfkf == null || (zoijcleaowVarHcddaimhww2 = hcddaimhww(ylkuphrtabVarPpxfxbqfkf)) == null) {
            zoijcleaowVarHcddaimhww = ylkuphrtabVar != null ? hcddaimhww(ylkuphrtabVar) : null;
        } else {
            zoijcleaowVarHcddaimhww = zoijcleaowVarHcddaimhww2;
        }
        return new p62.ppxfxbqfkf(strIobyxmoadg, colorsUiModel, strEablkybsjg, strGxszxtbevo, dNufgyqmvbu, dLqeggnwhkg, strBtonecajqb, strWkgbmnqykc, strDxjokdxxww, zZoijcleaow, zoijcleaowVarHcddaimhww);
    }

    public final o00.iobyxmoadg ppxfxbqfkf(int i13, c52.cqumvgiudr.iobyxmoadg dto, c52.ylkuphrtab ylkuphrtabVar, ColorsUiModel colorsUiModel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dto, "dto");
        if (dto.zoijcleaow().lqeggnwhkg()) {
            String strValueOf = String.valueOf(i13);
            List listD = hg.jyumaefscl.d(dto.iobyxmoadg(), new zoijcleaow());
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(nufgyqmvbu((c52.cqumvgiudr.zoijcleaow) it.next(), ylkuphrtabVar, colorsUiModel));
            }
            return new p62.iobyxmoadg(strValueOf, arrayList);
        }
        String strValueOf2 = String.valueOf(i13);
        List listIobyxmoadg = dto.iobyxmoadg();
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        Iterator it2 = listIobyxmoadg.iterator();
        while (it2.hasNext()) {
            arrayList2.add(nufgyqmvbu((c52.cqumvgiudr.zoijcleaow) it2.next(), ylkuphrtabVar, colorsUiModel));
        }
        return new p62.wkgbmnqykc(strValueOf2, arrayList2);
    }

    public final czzsidtyhn wkgbmnqykc(c52.istkbnxepw model, Map positionsForMap, User user, boolean z13, boolean z14, boolean z15, List list, DeliveryCode deliveryCode, Collection promoCollectionScrolledIds, tg.rgvfuqvkyq getStringRes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(positionsForMap, "positionsForMap");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionScrolledIds, "promoCollectionScrolledIds");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        String strZoijcleaow = model.zoijcleaow();
        String strLqeggnwhkg = model.lqeggnwhkg();
        m62.zoijcleaow zoijcleaowVarCdpycssgdh = cdpycssgdh(model.wkgbmnqykc());
        ColorsUiModel colorsUiModelIobyxmoadg = this.f104266ppxfxbqfkf.iobyxmoadg(model.iobyxmoadg());
        boolean zDxjokdxxww = model.dxjokdxxww();
        List listPpxfxbqfkf = model.ppxfxbqfkf();
        c52.cdpycssgdh cdpycssgdhVarGxszxtbevo = model.gxszxtbevo();
        c52.ylkuphrtab ylkuphrtabVarEablkybsjg = model.eablkybsjg();
        ColorsModel colorsModelIobyxmoadg = model.iobyxmoadg();
        return new czzsidtyhn(strZoijcleaow, strLqeggnwhkg, zoijcleaowVarCdpycssgdh, colorsUiModelIobyxmoadg, zDxjokdxxww, esjtqupxsv(listPpxfxbqfkf, cdpycssgdhVarGxszxtbevo, positionsForMap, user, z13, z14, z15, ylkuphrtabVarEablkybsjg, list, colorsModelIobyxmoadg != null ? this.f104266ppxfxbqfkf.iobyxmoadg(colorsModelIobyxmoadg) : null, deliveryCode, model.dxjokdxxww(), promoCollectionScrolledIds, getStringRes), false, 64, null);
    }
}
