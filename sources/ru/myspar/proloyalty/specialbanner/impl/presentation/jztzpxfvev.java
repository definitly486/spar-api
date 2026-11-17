package ru.myspar.proloyalty.specialbanner.impl.presentation;

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
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.shop.Shop;
import ru.myspar.proloyalty.core.domain.models.shop.ShopService;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.user.domain.model.UserInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class jztzpxfvev {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final mj.rgvfuqvkyq f101450eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final n91.ppxfxbqfkf f101451iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final n91.iobyxmoadg f101452ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final mj.rgvfuqvkyq f101453wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final o91.zoijcleaow f101454zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f101455iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f101456ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f101457zoijcleaow;

        static {
            int[] iArr = new int[vq1.iozdgvuglv.values().length];
            try {
                iArr[vq1.iozdgvuglv.H1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vq1.iozdgvuglv.H2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vq1.iozdgvuglv.H3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vq1.iozdgvuglv.H5.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vq1.iozdgvuglv.H6.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[vq1.iozdgvuglv.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f101455iobyxmoadg = iArr;
            int[] iArr2 = new int[vq1.lereixgezr.values().length];
            try {
                iArr2[vq1.lereixgezr.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[vq1.lereixgezr.ONLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[vq1.lereixgezr.OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f101457zoijcleaow = iArr2;
            int[] iArr3 = new int[vq1.jpowsppfya.values().length];
            try {
                iArr3[vq1.jpowsppfya.BANNERS_BIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[vq1.jpowsppfya.BANNER_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[vq1.jpowsppfya.BANNER_LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f101456ppxfxbqfkf = iArr3;
        }
    }

    public static final class zoijcleaow implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((vq1.cqumvgiudr.zoijcleaow) obj2).gxszxtbevo().length()), Integer.valueOf(((vq1.cqumvgiudr.zoijcleaow) obj).gxszxtbevo().length()));
        }
    }

    public jztzpxfvev(n91.ppxfxbqfkf comboSetToUiMapper, o91.zoijcleaow productToUiModelMapper, n91.iobyxmoadg colorsUiModelMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetToUiMapper, "comboSetToUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productToUiModelMapper, "productToUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f101451iobyxmoadg = comboSetToUiMapper;
        this.f101454zoijcleaow = productToUiModelMapper;
        this.f101452ppxfxbqfkf = colorsUiModelMapper;
        this.f101453wkgbmnqykc = new mj.rgvfuqvkyq("</?p>");
        this.f101450eablkybsjg = new mj.rgvfuqvkyq("\n+$");
    }

    private final cs1.iobyxmoadg agtfadlqog(vq1.dsvhmnatus dsvhmnatusVar, ColorsUiModel colorsUiModel, boolean z13) {
        return new cs1.iobyxmoadg(btonecajqb(dsvhmnatusVar.iobyxmoadg().iobyxmoadg()), String.valueOf(dsvhmnatusVar.zoijcleaow()), colorsUiModel, z13);
    }

    private final String btonecajqb(String str) {
        return this.f101453wkgbmnqykc.rgvfuqvkyq(str, "");
    }

    private final ks1.iobyxmoadg cdpycssgdh(vq1.hkdspvbjdz.iobyxmoadg iobyxmoadgVar) {
        return new ks1.iobyxmoadg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.wkgbmnqykc());
    }

    private final sr1.draadjrbmk cllcsxoeiz(vq1.agtfadlqog agtfadlqogVar) {
        return new sr1.draadjrbmk(String.valueOf(agtfadlqogVar.zoijcleaow()), agtfadlqogVar.iobyxmoadg().zoijcleaow(), agtfadlqogVar.iobyxmoadg().ppxfxbqfkf(), agtfadlqogVar.iobyxmoadg().wkgbmnqykc(), agtfadlqogVar.iobyxmoadg().iobyxmoadg());
    }

    private final hs1.iobyxmoadg cqumvgiudr(vq1.yggfygwlhe yggfygwlheVar, List list, ColorsUiModel colorsUiModel, DeliveryCode deliveryCode, boolean z13, boolean z14, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (yggfygwlheVar.iobyxmoadg().ppxfxbqfkf().isEmpty()) {
            return null;
        }
        String strValueOf = String.valueOf(yggfygwlheVar.zoijcleaow());
        String strGxszxtbevo = yggfygwlheVar.iobyxmoadg().gxszxtbevo();
        String strZoijcleaow = yggfygwlheVar.iobyxmoadg().zoijcleaow();
        String strIobyxmoadg = yggfygwlheVar.iobyxmoadg().iobyxmoadg();
        String strEablkybsjg = yggfygwlheVar.iobyxmoadg().eablkybsjg();
        k21.ojitshcjhn ojitshcjhnVarWkgbmnqykc = yggfygwlheVar.iobyxmoadg().wkgbmnqykc();
        List listPpxfxbqfkf = yggfygwlheVar.iobyxmoadg().ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkg((Product) it.next(), list, deliveryCode, z13, z14, rgvfuqvkyqVar));
        }
        return new hs1.iobyxmoadg(strValueOf, strGxszxtbevo, strZoijcleaow, strIobyxmoadg, strEablkybsjg, ojitshcjhnVarWkgbmnqykc, arrayList, colorsUiModel);
    }

    private final xr1.zoijcleaow crxdokpmqz(vq1.btonecajqb.iobyxmoadg iobyxmoadgVar, int i13) {
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
        return new xr1.zoijcleaow(strValueOf, strPpxfxbqfkf, strIobyxmoadg, strZoijcleaow, strEablkybsjg, strWkgbmnqykc, sb3.toString());
    }

    private final as1.ppxfxbqfkf draadjrbmk(vq1.draadjrbmk draadjrbmkVar) {
        String strValueOf = String.valueOf(draadjrbmkVar.zoijcleaow());
        List listIobyxmoadg = draadjrbmkVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(gtknphoqwx((vq1.draadjrbmk.iobyxmoadg) obj, i13));
            i13 = i14;
        }
        return new as1.ppxfxbqfkf(strValueOf, new as1.zoijcleaow(arrayList));
    }

    private final sr1.wflxmlrfwp dsvhmnatus(vq1.wypolnanlu wypolnanluVar) {
        return new sr1.wflxmlrfwp(String.valueOf(wypolnanluVar.zoijcleaow()), wypolnanluVar.iobyxmoadg().iobyxmoadg(), wypolnanluVar.iobyxmoadg().ppxfxbqfkf(), wypolnanluVar.iobyxmoadg().zoijcleaow() + (SystemClock.elapsedRealtime() / 1000), wypolnanluVar.iobyxmoadg().zoijcleaow());
    }

    private final String dxjokdxxww(String str) {
        return this.f101450eablkybsjg.rgvfuqvkyq(str, "");
    }

    private final is1.zoijcleaow esjtqupxsv(vq1.ylkuphrtab ylkuphrtabVar) {
        return new is1.zoijcleaow(ylkuphrtabVar.eablkybsjg(), ylkuphrtabVar.ppxfxbqfkf(), ylkuphrtabVar.wkgbmnqykc(), ylkuphrtabVar.iobyxmoadg(), ylkuphrtabVar.zoijcleaow());
    }

    private final as1.iobyxmoadg gtknphoqwx(vq1.draadjrbmk.iobyxmoadg iobyxmoadgVar, int i13) {
        return new as1.iobyxmoadg(String.valueOf(i13), iobyxmoadgVar.ppxfxbqfkf(), btonecajqb(iobyxmoadgVar.zoijcleaow()), iobyxmoadgVar.iobyxmoadg());
    }

    private final or1.iobyxmoadg gxszxtbevo(vq1.vdvldrhtss.ppxfxbqfkf ppxfxbqfkfVar) {
        rr1.iobyxmoadg iobyxmoadgVar;
        String strEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
        String strIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        if (ppxfxbqfkfVar.gxszxtbevo() && ppxfxbqfkfVar.ppxfxbqfkf()) {
            iobyxmoadgVar = rr1.iobyxmoadg.LEVEL_BLOCKED;
        } else {
            iobyxmoadgVar = (!ppxfxbqfkfVar.gxszxtbevo() || ppxfxbqfkfVar.ppxfxbqfkf()) ? rr1.iobyxmoadg.LEVEL_WITH_INFO : rr1.iobyxmoadg.LEVEL_WITH_LOCKS;
        }
        return new or1.iobyxmoadg(strEablkybsjg, strIobyxmoadg, iobyxmoadgVar, ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.wkgbmnqykc());
    }

    private final s71.wkgbmnqykc hcddaimhww(vq1.dxjokdxxww dxjokdxxwwVar, ColorsUiModel colorsUiModel) {
        String strValueOf = String.valueOf(dxjokdxxwwVar.zoijcleaow());
        String strGxszxtbevo = dxjokdxxwwVar.iobyxmoadg().gxszxtbevo();
        String strEablkybsjg = dxjokdxxwwVar.iobyxmoadg().eablkybsjg();
        String strZoijcleaow = dxjokdxxwwVar.iobyxmoadg().zoijcleaow();
        String strPpxfxbqfkf = dxjokdxxwwVar.iobyxmoadg().ppxfxbqfkf();
        vq1.wkgbmnqykc.iobyxmoadg iobyxmoadgVarIobyxmoadg = dxjokdxxwwVar.iobyxmoadg().iobyxmoadg();
        s71.iobyxmoadg iobyxmoadgVar = iobyxmoadgVarIobyxmoadg != null ? new s71.iobyxmoadg(iobyxmoadgVarIobyxmoadg.eablkybsjg(), iobyxmoadgVarIobyxmoadg.iobyxmoadg(), iobyxmoadgVarIobyxmoadg.zoijcleaow(), iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(), iobyxmoadgVarIobyxmoadg.wkgbmnqykc()) : null;
        vq1.dxjokdxxww.iobyxmoadg iobyxmoadgVar2 = (vq1.dxjokdxxww.iobyxmoadg) hg.jyumaefscl.weqkydbzbr(dxjokdxxwwVar.iobyxmoadg().wkgbmnqykc());
        String strZoijcleaow2 = iobyxmoadgVar2 != null ? iobyxmoadgVar2.zoijcleaow() : null;
        boolean z13 = !dxjokdxxwwVar.iobyxmoadg().wkgbmnqykc().isEmpty();
        List listWkgbmnqykc = dxjokdxxwwVar.iobyxmoadg().wkgbmnqykc();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
        Iterator it = listWkgbmnqykc.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg((vq1.dxjokdxxww.iobyxmoadg) it.next()));
        }
        return new s71.wkgbmnqykc(strValueOf, colorsUiModel, strGxszxtbevo, strEablkybsjg, strZoijcleaow, iobyxmoadgVar, strPpxfxbqfkf, strZoijcleaow2, arrayList, z13, null, UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    private final sr1.zoijcleaow hkdspvbjdz(vq1.zoijcleaow.iobyxmoadg iobyxmoadgVar, int i13) {
        return new sr1.zoijcleaow(i13 + 1, iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg());
    }

    private final gz0.iobyxmoadg iobyxmoadg(vq1.wflxmlrfwp wflxmlrfwpVar, ColorsUiModel colorsUiModel, boolean z13) {
        gz0.iobyxmoadg zoijcleaowVar;
        switch (iobyxmoadg.f101455iobyxmoadg[wflxmlrfwpVar.iobyxmoadg().ppxfxbqfkf().ordinal()]) {
            case 1:
                zoijcleaowVar = new zr1.zoijcleaow(String.valueOf(wflxmlrfwpVar.zoijcleaow()), wflxmlrfwpVar.iobyxmoadg().wkgbmnqykc(), colorsUiModel, z13);
                break;
            case 2:
                zoijcleaowVar = new zr1.eablkybsjg(String.valueOf(wflxmlrfwpVar.zoijcleaow()), wflxmlrfwpVar.iobyxmoadg().wkgbmnqykc(), colorsUiModel, z13);
                break;
            case 3:
                zoijcleaowVar = new zr1.wkgbmnqykc(String.valueOf(wflxmlrfwpVar.zoijcleaow()), wflxmlrfwpVar.iobyxmoadg().wkgbmnqykc(), colorsUiModel, z13);
                break;
            case 4:
                String strValueOf = String.valueOf(wflxmlrfwpVar.zoijcleaow());
                String strWkgbmnqykc = wflxmlrfwpVar.iobyxmoadg().wkgbmnqykc();
                boolean zNufgyqmvbu = wflxmlrfwpVar.iobyxmoadg().iobyxmoadg().nufgyqmvbu();
                k21.ojitshcjhn ojitshcjhnVarIobyxmoadg = wflxmlrfwpVar.iobyxmoadg().iobyxmoadg();
                String strZoijcleaow = wflxmlrfwpVar.iobyxmoadg().zoijcleaow();
                if (strZoijcleaow == null) {
                    strZoijcleaow = "";
                }
                zoijcleaowVar = new zr1.iobyxmoadg(strValueOf, strWkgbmnqykc, zNufgyqmvbu, colorsUiModel, z13, ojitshcjhnVarIobyxmoadg, strZoijcleaow);
                break;
            case 5:
                zoijcleaowVar = new zr1.ppxfxbqfkf(String.valueOf(wflxmlrfwpVar.zoijcleaow()), wflxmlrfwpVar.iobyxmoadg().wkgbmnqykc(), colorsUiModel, z13);
                break;
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return zoijcleaowVar;
    }

    private final ls1.zoijcleaow iozdgvuglv(vq1.cllcsxoeiz cllcsxoeizVar) {
        List listPmvmpeiblj = pmvmpeiblj(cllcsxoeizVar.iobyxmoadg());
        List list = (List) hg.jyumaefscl.weqkydbzbr(cllcsxoeizVar.iobyxmoadg().iobyxmoadg());
        return new ls1.zoijcleaow(null, list != null ? list.size() : 2, listPmvmpeiblj, 1, null);
    }

    private final js1.ppxfxbqfkf istkbnxepw(vq1.iobyxmoadg iobyxmoadgVar, ColorsUiModel colorsUiModel, boolean z13) {
        String strValueOf = String.valueOf(iobyxmoadgVar.zoijcleaow());
        List listIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(zynmafqrjb((vq1.iobyxmoadg.C2926iobyxmoadg) obj, i13, colorsUiModel, z13));
            i13 = i14;
        }
        return new js1.ppxfxbqfkf(strValueOf, new js1.zoijcleaow(arrayList, colorsUiModel, z13));
    }

    private final gz0.iobyxmoadg iwizpuwonk(vq1.cqumvgiudr cqumvgiudrVar, vq1.ylkuphrtab ylkuphrtabVar, ColorsUiModel colorsUiModel) {
        return ppxfxbqfkf(cqumvgiudrVar.zoijcleaow(), cqumvgiudrVar.iobyxmoadg(), ylkuphrtabVar, colorsUiModel);
    }

    private final yr1.iobyxmoadg jlmebxxoox(vq1.gtknphoqwx gtknphoqwxVar, boolean z13, UserInfo userInfo) {
        vq1.pmvmpeiblj pmvmpeibljVar;
        if (!z13) {
            return null;
        }
        String strValueOf = String.valueOf(gtknphoqwxVar.zoijcleaow());
        String strIobyxmoadg = gtknphoqwxVar.iobyxmoadg().iobyxmoadg();
        String lastName = userInfo != null ? userInfo.getLastName() : null;
        if (lastName == null) {
            lastName = "";
        }
        String firstName = userInfo != null ? userInfo.getFirstName() : null;
        if (firstName == null) {
            firstName = "";
        }
        String str = lastName + " " + firstName;
        String str2 = mj.kcexrzcfyt.zfvoamnweg(str) ? "" : str;
        String phone = userInfo != null ? userInfo.getPhone() : null;
        String str3 = phone == null ? "" : phone;
        String email = userInfo != null ? userInfo.getEmail() : null;
        String str4 = email == null ? "" : email;
        boolean z14 = gtknphoqwxVar.iobyxmoadg().zoijcleaow() == vq1.lereixgezr.ALL;
        int i13 = iobyxmoadg.f101457zoijcleaow[gtknphoqwxVar.iobyxmoadg().zoijcleaow().ordinal()];
        if (i13 == 1) {
            pmvmpeibljVar = vq1.pmvmpeiblj.NONE;
        } else if (i13 == 2) {
            pmvmpeibljVar = vq1.pmvmpeiblj.ONLINE;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pmvmpeibljVar = vq1.pmvmpeiblj.IN_STORE;
        }
        return new yr1.iobyxmoadg(strValueOf, strIobyxmoadg, str2, str3, str4, null, null, null, null, false, z14, pmvmpeibljVar, null, 5088, null);
    }

    private final sr1.iobyxmoadg jpowsppfya(vq1.ojitshcjhn ojitshcjhnVar) {
        return new sr1.iobyxmoadg(String.valueOf(ojitshcjhnVar.zoijcleaow()), ojitshcjhnVar.iobyxmoadg().ppxfxbqfkf(), btonecajqb(ojitshcjhnVar.iobyxmoadg().zoijcleaow()), ojitshcjhnVar.iobyxmoadg().iobyxmoadg());
    }

    private final gz0.iobyxmoadg jyumaefscl(vq1.zoijcleaow zoijcleaowVar) {
        int i13 = iobyxmoadg.f101456ppxfxbqfkf[zoijcleaowVar.ppxfxbqfkf().ordinal()];
        int i14 = 0;
        if (i13 == 1) {
            String strValueOf = String.valueOf(zoijcleaowVar.zoijcleaow());
            vq1.jpowsppfya jpowsppfyaVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
            List listIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
            for (Object obj : listIobyxmoadg) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                arrayList.add(hkdspvbjdz((vq1.zoijcleaow.iobyxmoadg) obj, i14));
                i14 = i15;
            }
            return new sr1.wkgbmnqykc(strValueOf, jpowsppfyaVarPpxfxbqfkf, arrayList);
        }
        if (i13 == 2) {
            String strValueOf2 = String.valueOf(zoijcleaowVar.zoijcleaow());
            vq1.jpowsppfya jpowsppfyaVarPpxfxbqfkf2 = zoijcleaowVar.ppxfxbqfkf();
            List listIobyxmoadg2 = zoijcleaowVar.iobyxmoadg();
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg2, 10));
            for (Object obj2 : listIobyxmoadg2) {
                int i16 = i14 + 1;
                if (i14 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                arrayList2.add(hkdspvbjdz((vq1.zoijcleaow.iobyxmoadg) obj2, i14));
                i14 = i16;
            }
            return new sr1.btonecajqb(strValueOf2, jpowsppfyaVarPpxfxbqfkf2, arrayList2);
        }
        if (i13 != 3) {
            return null;
        }
        String strValueOf3 = String.valueOf(zoijcleaowVar.zoijcleaow());
        vq1.jpowsppfya jpowsppfyaVarPpxfxbqfkf3 = zoijcleaowVar.ppxfxbqfkf();
        List listIobyxmoadg3 = zoijcleaowVar.iobyxmoadg();
        ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg3, 10));
        for (Object obj3 : listIobyxmoadg3) {
            int i17 = i14 + 1;
            if (i14 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList3.add(hkdspvbjdz((vq1.zoijcleaow.iobyxmoadg) obj3, i14));
            i14 = i17;
        }
        return new sr1.lqeggnwhkg(strValueOf3, jpowsppfyaVarPpxfxbqfkf3, arrayList3);
    }

    private final fs1.zoijcleaow kcexrzcfyt(vq1.lmojexxdyd lmojexxdydVar) {
        String strPpxfxbqfkf = lmojexxdydVar.ppxfxbqfkf();
        String strZoijcleaow = lmojexxdydVar.zoijcleaow();
        vq1.wwaezpbzkn wwaezpbzknVarIobyxmoadg = lmojexxdydVar.iobyxmoadg();
        return new fs1.zoijcleaow(strPpxfxbqfkf, strZoijcleaow, wwaezpbzknVarIobyxmoadg != null ? oxmwwwfdhm(wwaezpbzknVarIobyxmoadg) : null);
    }

    private final ur1.zoijcleaow.iobyxmoadg kegysxyocb(vq1.wkgbmnqykc wkgbmnqykcVar, ColorsUiModel colorsUiModel) {
        return new ur1.zoijcleaow.iobyxmoadg(String.valueOf(wkgbmnqykcVar.zoijcleaow()), wkgbmnqykcVar.iobyxmoadg().eablkybsjg(), colorsUiModel, new ur1.iobyxmoadg(wkgbmnqykcVar.iobyxmoadg().ppxfxbqfkf(), wkgbmnqykcVar.iobyxmoadg().wkgbmnqykc()), wkgbmnqykcVar.iobyxmoadg().iobyxmoadg(), wkgbmnqykcVar.iobyxmoadg().zoijcleaow());
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x000e A[SYNTHETIC] */
    private final List lereixgezr(List list, vq1.cdpycssgdh cdpycssgdhVar, Map map, UserInfo userInfo, boolean z13, boolean z14, boolean z15, vq1.ylkuphrtab ylkuphrtabVar, List list2, ColorsUiModel colorsUiModel, DeliveryCode deliveryCode, boolean z16, Collection collection, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        gz0.iobyxmoadg iobyxmoadgVarWypolnanlu;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vq1.zynmafqrjb zynmafqrjbVar = (vq1.zynmafqrjb) it.next();
            if (zynmafqrjbVar instanceof vq1.wflxmlrfwp) {
                iobyxmoadgVarWypolnanlu = iobyxmoadg((vq1.wflxmlrfwp) zynmafqrjbVar, colorsUiModel, z16);
            } else if (zynmafqrjbVar instanceof vq1.dsvhmnatus) {
                iobyxmoadgVarWypolnanlu = agtfadlqog((vq1.dsvhmnatus) zynmafqrjbVar, colorsUiModel, z16);
            } else if (zynmafqrjbVar instanceof vq1.ojitshcjhn) {
                iobyxmoadgVarWypolnanlu = jpowsppfya((vq1.ojitshcjhn) zynmafqrjbVar);
            } else if (zynmafqrjbVar instanceof vq1.eablkybsjg) {
                iobyxmoadgVarWypolnanlu = tzroggbefp((vq1.eablkybsjg) zynmafqrjbVar, colorsUiModel);
            } else if (zynmafqrjbVar instanceof vq1.wkgbmnqykc) {
                iobyxmoadgVarWypolnanlu = kegysxyocb((vq1.wkgbmnqykc) zynmafqrjbVar, colorsUiModel);
            } else if (zynmafqrjbVar instanceof vq1.gxszxtbevo) {
                iobyxmoadgVarWypolnanlu = mbcevpiqjq((vq1.gxszxtbevo) zynmafqrjbVar, colorsUiModel);
            } else if (zynmafqrjbVar instanceof vq1.btonecajqb) {
                iobyxmoadgVarWypolnanlu = sopmlzcsov((vq1.btonecajqb) zynmafqrjbVar);
            } else if (zynmafqrjbVar instanceof vq1.draadjrbmk) {
                iobyxmoadgVarWypolnanlu = draadjrbmk((vq1.draadjrbmk) zynmafqrjbVar);
            } else if (zynmafqrjbVar instanceof vq1.kcexrzcfyt) {
                iobyxmoadgVarWypolnanlu = wflxmlrfwp((vq1.kcexrzcfyt) zynmafqrjbVar, colorsUiModel, z16);
            } else if (zynmafqrjbVar instanceof vq1.stevsuqkhv) {
                iobyxmoadgVarWypolnanlu = ribwqtqdhb((vq1.stevsuqkhv) zynmafqrjbVar, colorsUiModel);
            } else if (zynmafqrjbVar instanceof vq1.tzroggbefp) {
                iobyxmoadgVarWypolnanlu = wwaezpbzkn((vq1.tzroggbefp) zynmafqrjbVar, colorsUiModel);
            } else if (zynmafqrjbVar instanceof vq1.iobyxmoadg) {
                iobyxmoadgVarWypolnanlu = istkbnxepw((vq1.iobyxmoadg) zynmafqrjbVar, colorsUiModel, z16);
            } else {
                if (zynmafqrjbVar instanceof vq1.iwizpuwonk) {
                    iobyxmoadgVarWypolnanlu = yggfygwlhe((vq1.iwizpuwonk) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof vq1.oxmwwwfdhm) {
                    vq1.oxmwwwfdhm oxmwwwfdhmVar = (vq1.oxmwwwfdhm) zynmafqrjbVar;
                    iobyxmoadgVarWypolnanlu = ojitshcjhn(oxmwwwfdhmVar, cdpycssgdhVar, (BoundingBox) map.get(String.valueOf(oxmwwwfdhmVar.zoijcleaow())));
                } else if (zynmafqrjbVar instanceof vq1.yggfygwlhe) {
                    iobyxmoadgVarWypolnanlu = cqumvgiudr((vq1.yggfygwlhe) zynmafqrjbVar, list2, colorsUiModel, deliveryCode, z14, z15, rgvfuqvkyqVar);
                } else if (zynmafqrjbVar instanceof vq1.gtknphoqwx) {
                    iobyxmoadgVarWypolnanlu = jlmebxxoox((vq1.gtknphoqwx) zynmafqrjbVar, z13, userInfo);
                } else if (zynmafqrjbVar instanceof vq1.lqeggnwhkg) {
                    iobyxmoadgVarWypolnanlu = ntlheqmsrt((vq1.lqeggnwhkg) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof vq1.cqumvgiudr) {
                    iobyxmoadgVarWypolnanlu = iwizpuwonk((vq1.cqumvgiudr) zynmafqrjbVar, ylkuphrtabVar, colorsUiModel);
                } else if (zynmafqrjbVar instanceof vq1.cllcsxoeiz) {
                    iobyxmoadgVarWypolnanlu = iozdgvuglv((vq1.cllcsxoeiz) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof vq1.zoijcleaow) {
                    iobyxmoadgVarWypolnanlu = jyumaefscl((vq1.zoijcleaow) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof vq1.agtfadlqog) {
                    iobyxmoadgVarWypolnanlu = cllcsxoeiz((vq1.agtfadlqog) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof vq1.hkdspvbjdz) {
                    iobyxmoadgVarWypolnanlu = yadqdtsiqt((vq1.hkdspvbjdz) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof vq1.dxjokdxxww) {
                    iobyxmoadgVarWypolnanlu = hcddaimhww((vq1.dxjokdxxww) zynmafqrjbVar, colorsUiModel);
                } else if (zynmafqrjbVar instanceof vq1.wypolnanlu) {
                    iobyxmoadgVarWypolnanlu = dsvhmnatus((vq1.wypolnanlu) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof vq1.ppxfxbqfkf) {
                    iobyxmoadgVarWypolnanlu = stevsuqkhv((vq1.ppxfxbqfkf) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof vq1.vdvldrhtss) {
                    iobyxmoadgVarWypolnanlu = ylkuphrtab((vq1.vdvldrhtss) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof vq1.jyumaefscl) {
                    iobyxmoadgVarWypolnanlu = pkzmftpjix((vq1.jyumaefscl) zynmafqrjbVar);
                } else if (zynmafqrjbVar instanceof vq1.nufgyqmvbu) {
                    iobyxmoadgVarWypolnanlu = ulzqkzuiru((vq1.nufgyqmvbu) zynmafqrjbVar);
                } else {
                    if (!(zynmafqrjbVar instanceof vq1.pkzmftpjix)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadgVarWypolnanlu = wypolnanlu((vq1.pkzmftpjix) zynmafqrjbVar, colorsUiModel, z16, collection);
                }
                if (iobyxmoadgVarWypolnanlu != null) {
                    arrayList.add(iobyxmoadgVarWypolnanlu);
                }
            }
            if (iobyxmoadgVarWypolnanlu != null) {
                arrayList.add(iobyxmoadgVarWypolnanlu);
            }
        }
        return arrayList;
    }

    private final ms1.iobyxmoadg lmojexxdyd(vq1.kegysxyocb kegysxyocbVar, ColorsUiModel colorsUiModel) {
        return new ms1.iobyxmoadg(kegysxyocbVar.zoijcleaow(), kegysxyocbVar.ppxfxbqfkf(), colorsUiModel, kegysxyocbVar.iobyxmoadg());
    }

    private final ProductUiModel lqeggnwhkg(Product product, List list, DeliveryCode deliveryCode, boolean z13, boolean z14, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        MeasureTypeModel measureTypeModel;
        ProductUiModel productUiModelPpxfxbqfkf = this.f101454zoijcleaow.ppxfxbqfkf(product, list, deliveryCode, z13, z14, false, (64 & 64) != 0 ? null : null, rgvfuqvkyqVar);
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

    private final ur1.zoijcleaow.ppxfxbqfkf mbcevpiqjq(vq1.gxszxtbevo gxszxtbevoVar, ColorsUiModel colorsUiModel) {
        return new ur1.zoijcleaow.ppxfxbqfkf(String.valueOf(gxszxtbevoVar.zoijcleaow()), gxszxtbevoVar.iobyxmoadg().ppxfxbqfkf(), colorsUiModel, gxszxtbevoVar.iobyxmoadg().wkgbmnqykc(), false, gxszxtbevoVar.iobyxmoadg().iobyxmoadg(), gxszxtbevoVar.iobyxmoadg().zoijcleaow());
    }

    private final vr1.iobyxmoadg ntlheqmsrt(vq1.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar.iobyxmoadg().isEmpty()) {
            return null;
        }
        return new vr1.iobyxmoadg(String.valueOf(lqeggnwhkgVar.zoijcleaow()), this.f101451iobyxmoadg.invoke(lqeggnwhkgVar.iobyxmoadg()));
    }

    private final ds1.iobyxmoadg ojitshcjhn(vq1.oxmwwwfdhm oxmwwwfdhmVar, vq1.cdpycssgdh cdpycssgdhVar, BoundingBox boundingBox) {
        String strValueOf = String.valueOf(oxmwwwfdhmVar.zoijcleaow());
        List listIobyxmoadg = oxmwwwfdhmVar.iobyxmoadg().iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(vdvldrhtss((Shop) obj, i13, cdpycssgdhVar.zoijcleaow()));
            i13 = i14;
        }
        return new ds1.iobyxmoadg(strValueOf, boundingBox, false, arrayList, 4, null);
    }

    private final fs1.iobyxmoadg oxmwwwfdhm(vq1.wwaezpbzkn wwaezpbzknVar) {
        return new fs1.iobyxmoadg(wwaezpbzknVar.eablkybsjg(), wwaezpbzknVar.iobyxmoadg(), wwaezpbzknVar.zoijcleaow(), wwaezpbzknVar.ppxfxbqfkf(), wwaezpbzknVar.wkgbmnqykc());
    }

    private final ps1.iobyxmoadg pkzmftpjix(vq1.jyumaefscl jyumaefsclVar) {
        return new ps1.iobyxmoadg(String.valueOf(jyumaefsclVar.zoijcleaow()), jyumaefsclVar.iobyxmoadg().ppxfxbqfkf(), jyumaefsclVar.iobyxmoadg().wkgbmnqykc(), zoijcleaow(jyumaefsclVar.iobyxmoadg().iobyxmoadg()), jyumaefsclVar.iobyxmoadg().eablkybsjg(), jyumaefsclVar.iobyxmoadg().zoijcleaow());
    }

    private final List pmvmpeiblj(vq1.cllcsxoeiz.iobyxmoadg iobyxmoadgVar) {
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
                arrayList.add(new ls1.iobyxmoadg(str, i15, z13));
            }
            i13 = i14;
        }
        return hg.jyumaefscl.m(arrayList);
    }

    private final ds1.zoijcleaow rgvfuqvkyq(ShopService shopService, int i13) {
        return new ds1.zoijcleaow(String.valueOf(i13), shopService.getName(), shopService.getPic());
    }

    private final ms1.zoijcleaow ribwqtqdhb(vq1.stevsuqkhv stevsuqkhvVar, ColorsUiModel colorsUiModel) {
        return new ms1.zoijcleaow(String.valueOf(stevsuqkhvVar.zoijcleaow()), hg.jyumaefscl.eablkybsjg(lmojexxdyd(stevsuqkhvVar.iobyxmoadg(), colorsUiModel)));
    }

    private final xr1.iobyxmoadg sopmlzcsov(vq1.btonecajqb btonecajqbVar) {
        String strValueOf = String.valueOf(btonecajqbVar.zoijcleaow());
        List listIobyxmoadg = btonecajqbVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(crxdokpmqz((vq1.btonecajqb.iobyxmoadg) obj, i13));
            i13 = i14;
        }
        return new xr1.iobyxmoadg(strValueOf, arrayList);
    }

    private final tr1.iobyxmoadg stevsuqkhv(vq1.ppxfxbqfkf ppxfxbqfkfVar) {
        return new tr1.iobyxmoadg(String.valueOf(ppxfxbqfkfVar.iobyxmoadg().hashCode()), ppxfxbqfkfVar.iobyxmoadg().iobyxmoadg(), ppxfxbqfkfVar.iobyxmoadg().zoijcleaow());
    }

    private final ur1.zoijcleaow.C2834zoijcleaow tzroggbefp(vq1.eablkybsjg eablkybsjgVar, ColorsUiModel colorsUiModel) {
        return new ur1.zoijcleaow.C2834zoijcleaow(String.valueOf(eablkybsjgVar.zoijcleaow()), eablkybsjgVar.iobyxmoadg().iobyxmoadg(), colorsUiModel, new ur1.iobyxmoadg(k21.ojitshcjhn.URL, eablkybsjgVar.iobyxmoadg().zoijcleaow()));
    }

    private final wr1.iobyxmoadg ulzqkzuiru(vq1.nufgyqmvbu nufgyqmvbuVar) {
        return new wr1.iobyxmoadg(String.valueOf(nufgyqmvbuVar.iobyxmoadg()), b31.gxszxtbevo.sb_divider_round_white);
    }

    private final ds1.ppxfxbqfkf vdvldrhtss(Shop shop, int i13, List list) {
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
            arrayList2.add(rgvfuqvkyq((ShopService) obj2, i14));
            i14 = i15;
        }
        return new ds1.ppxfxbqfkf(strValueOf, address, type, hours, pointBtonecajqb, arrayList2);
    }

    private final bs1.zoijcleaow wflxmlrfwp(vq1.kcexrzcfyt kcexrzcfytVar, ColorsUiModel colorsUiModel, boolean z13) {
        return new bs1.zoijcleaow(String.valueOf(kcexrzcfytVar.zoijcleaow()), new bs1.ppxfxbqfkf(hg.jyumaefscl.eablkybsjg(new bs1.iobyxmoadg(String.valueOf(kcexrzcfytVar.zoijcleaow()), kcexrzcfytVar.iobyxmoadg().ppxfxbqfkf(), kcexrzcfytVar.iobyxmoadg().zoijcleaow(), btonecajqb(dxjokdxxww(kcexrzcfytVar.iobyxmoadg().wkgbmnqykc())), kcexrzcfytVar.iobyxmoadg().iobyxmoadg(), colorsUiModel, z13))));
    }

    private final ms1.zoijcleaow wwaezpbzkn(vq1.tzroggbefp tzroggbefpVar, ColorsUiModel colorsUiModel) {
        String strValueOf = String.valueOf(tzroggbefpVar.zoijcleaow());
        List listIobyxmoadg = tzroggbefpVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        Iterator it = listIobyxmoadg.iterator();
        while (it.hasNext()) {
            arrayList.add(lmojexxdyd((vq1.kegysxyocb) it.next(), colorsUiModel));
        }
        return new ms1.zoijcleaow(strValueOf, arrayList);
    }

    private final ss1.iobyxmoadg wypolnanlu(vq1.pkzmftpjix pkzmftpjixVar, ColorsUiModel colorsUiModel, boolean z13, Collection collection) {
        return new ss1.iobyxmoadg(String.valueOf(pkzmftpjixVar.iobyxmoadg()), pkzmftpjixVar.zoijcleaow().getCollectionId(), pkzmftpjixVar.zoijcleaow().getName(), pkzmftpjixVar.ppxfxbqfkf(), colorsUiModel, z13, false, collection.contains(pkzmftpjixVar.zoijcleaow().getCollectionId()), 64, null);
    }

    private final ks1.zoijcleaow yadqdtsiqt(vq1.hkdspvbjdz hkdspvbjdzVar) {
        String strValueOf = String.valueOf(hkdspvbjdzVar.zoijcleaow());
        List listIobyxmoadg = hkdspvbjdzVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        Iterator it = listIobyxmoadg.iterator();
        while (it.hasNext()) {
            arrayList.add(cdpycssgdh((vq1.hkdspvbjdz.iobyxmoadg) it.next()));
        }
        return new ks1.zoijcleaow(strValueOf, arrayList);
    }

    private final gs1.zoijcleaow yggfygwlhe(vq1.iwizpuwonk iwizpuwonkVar) {
        String strValueOf = String.valueOf(iwizpuwonkVar.zoijcleaow());
        List listIobyxmoadg = iwizpuwonkVar.iobyxmoadg();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        int i13 = 0;
        for (Object obj : listIobyxmoadg) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(zdlpuopuiu((vq1.iwizpuwonk.iobyxmoadg) obj, i13));
            i13 = i14;
        }
        return new gs1.zoijcleaow(strValueOf, arrayList);
    }

    private final or1.zoijcleaow ylkuphrtab(vq1.vdvldrhtss vdvldrhtssVar) {
        String strValueOf = String.valueOf(vdvldrhtssVar.iobyxmoadg());
        List listZoijcleaow = vdvldrhtssVar.zoijcleaow();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
        Iterator it = listZoijcleaow.iterator();
        while (it.hasNext()) {
            arrayList.add(gxszxtbevo((vq1.vdvldrhtss.ppxfxbqfkf) it.next()));
        }
        return new or1.zoijcleaow(strValueOf, arrayList);
    }

    private final gs1.iobyxmoadg zdlpuopuiu(vq1.iwizpuwonk.iobyxmoadg iobyxmoadgVar, int i13) {
        return new gs1.iobyxmoadg(String.valueOf(i13), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.ppxfxbqfkf());
    }

    private final ps1.iobyxmoadg.InterfaceC1713iobyxmoadg zoijcleaow(String str) {
        if (mj.kcexrzcfyt.zfvoamnweg(str)) {
            str = null;
        }
        return str != null ? new ps1.iobyxmoadg.InterfaceC1713iobyxmoadg.zoijcleaow(str) : new ps1.iobyxmoadg.InterfaceC1713iobyxmoadg.C1714iobyxmoadg(vk0.lqeggnwhkg.proloyalty_special_banner_promo_balance_error_message);
    }

    private final js1.iobyxmoadg zynmafqrjb(vq1.iobyxmoadg.C2926iobyxmoadg c2926iobyxmoadg, int i13, ColorsUiModel colorsUiModel, boolean z13) {
        return new js1.iobyxmoadg(String.valueOf(i13), btonecajqb(c2926iobyxmoadg.iobyxmoadg()), c2926iobyxmoadg.zoijcleaow(), colorsUiModel, z13, false, 32, null);
    }

    public final s71.ppxfxbqfkf eablkybsjg(vq1.dxjokdxxww.iobyxmoadg model) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        return new s71.ppxfxbqfkf(model.iobyxmoadg(), model.zoijcleaow());
    }

    public final is1.ppxfxbqfkf nufgyqmvbu(vq1.cqumvgiudr.zoijcleaow model, vq1.ylkuphrtab ylkuphrtabVar, ColorsUiModel colorsUiModel) {
        is1.zoijcleaow zoijcleaowVarEsjtqupxsv;
        is1.zoijcleaow zoijcleaowVarEsjtqupxsv2;
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
        vq1.ylkuphrtab ylkuphrtabVarPpxfxbqfkf = model.ppxfxbqfkf();
        if (ylkuphrtabVarPpxfxbqfkf == null || (zoijcleaowVarEsjtqupxsv2 = esjtqupxsv(ylkuphrtabVarPpxfxbqfkf)) == null) {
            zoijcleaowVarEsjtqupxsv = ylkuphrtabVar != null ? esjtqupxsv(ylkuphrtabVar) : null;
        } else {
            zoijcleaowVarEsjtqupxsv = zoijcleaowVarEsjtqupxsv2;
        }
        return new is1.ppxfxbqfkf(strIobyxmoadg, colorsUiModel, strEablkybsjg, strGxszxtbevo, dNufgyqmvbu, dLqeggnwhkg, strBtonecajqb, strWkgbmnqykc, strDxjokdxxww, zZoijcleaow, zoijcleaowVarEsjtqupxsv);
    }

    public final gz0.iobyxmoadg ppxfxbqfkf(int i13, vq1.cqumvgiudr.iobyxmoadg dto, vq1.ylkuphrtab ylkuphrtabVar, ColorsUiModel colorsUiModel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dto, "dto");
        if (dto.zoijcleaow().lqeggnwhkg()) {
            String strValueOf = String.valueOf(i13);
            List listD = hg.jyumaefscl.d(dto.iobyxmoadg(), new zoijcleaow());
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(nufgyqmvbu((vq1.cqumvgiudr.zoijcleaow) it.next(), ylkuphrtabVar, colorsUiModel));
            }
            return new is1.iobyxmoadg(strValueOf, arrayList);
        }
        String strValueOf2 = String.valueOf(i13);
        List listIobyxmoadg = dto.iobyxmoadg();
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        Iterator it2 = listIobyxmoadg.iterator();
        while (it2.hasNext()) {
            arrayList2.add(nufgyqmvbu((vq1.cqumvgiudr.zoijcleaow) it2.next(), ylkuphrtabVar, colorsUiModel));
        }
        return new is1.wkgbmnqykc(strValueOf2, arrayList2);
    }

    public final rlfsiqarku wkgbmnqykc(vq1.istkbnxepw model, Map positionsForMap, UserInfo userInfo, boolean z13, boolean z14, boolean z15, List list, DeliveryCode deliveryCode, Collection promoCollectionScrolledIds, tg.rgvfuqvkyq getStringRes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(positionsForMap, "positionsForMap");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionScrolledIds, "promoCollectionScrolledIds");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        String strZoijcleaow = model.zoijcleaow();
        String strLqeggnwhkg = model.lqeggnwhkg();
        fs1.zoijcleaow zoijcleaowVarKcexrzcfyt = kcexrzcfyt(model.wkgbmnqykc());
        ColorsUiModel colorsUiModelIobyxmoadg = this.f101452ppxfxbqfkf.iobyxmoadg(model.iobyxmoadg());
        boolean zDxjokdxxww = model.dxjokdxxww();
        List listPpxfxbqfkf = model.ppxfxbqfkf();
        vq1.cdpycssgdh cdpycssgdhVarGxszxtbevo = model.gxszxtbevo();
        vq1.ylkuphrtab ylkuphrtabVarEablkybsjg = model.eablkybsjg();
        ColorsModel colorsModelIobyxmoadg = model.iobyxmoadg();
        return new rlfsiqarku(strZoijcleaow, strLqeggnwhkg, zoijcleaowVarKcexrzcfyt, colorsUiModelIobyxmoadg, zDxjokdxxww, lereixgezr(listPpxfxbqfkf, cdpycssgdhVarGxszxtbevo, positionsForMap, userInfo, z13, z14, z15, ylkuphrtabVarEablkybsjg, list, colorsModelIobyxmoadg != null ? this.f101452ppxfxbqfkf.iobyxmoadg(colorsModelIobyxmoadg) : null, deliveryCode, model.dxjokdxxww(), promoCollectionScrolledIds, getStringRes), false, 64, null);
    }
}
