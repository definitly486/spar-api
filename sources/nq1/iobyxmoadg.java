package nq1;

import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import ow1.zdlpuopuiu;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionInfo;
import tg.rgvfuqvkyq;
import vq1.esjtqupxsv;
import vq1.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements wq1.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tq1.iobyxmoadg f70626eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final dv0.iobyxmoadg f70627gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final xq1.iobyxmoadg f70628iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zdlpuopuiu f70629lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final pkzmftpjix f70630nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final n01.ppxfxbqfkf f70631ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tq1.zoijcleaow f70632wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n01.iobyxmoadg f70633zoijcleaow;

    /* JADX INFO: renamed from: nq1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1528iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ lq1.iobyxmoadg f70634iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f70635jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f70636yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f70637zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1528iobyxmoadg(String str, iobyxmoadg iobyxmoadgVar, lq1.iobyxmoadg iobyxmoadgVar2, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f70636yggfygwlhe = str;
            this.f70635jyumaefscl = iobyxmoadgVar;
            this.f70634iwizpuwonk = iobyxmoadgVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new C1528iobyxmoadg(this.f70636yggfygwlhe, this.f70635jyumaefscl, this.f70634iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f70637zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return (vq1.rgvfuqvkyq) obj;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            String str = this.f70636yggfygwlhe;
            if (str == null || kcexrzcfyt.zfvoamnweg(str)) {
                iobyxmoadg iobyxmoadgVar = this.f70635jyumaefscl;
                lq1.iobyxmoadg iobyxmoadgVar2 = this.f70634iwizpuwonk;
                this.f70637zdlpuopuiu = 1;
                obj = iobyxmoadg.draadjrbmk(iobyxmoadgVar, iobyxmoadgVar2, false, this, 2, null);
                return obj == objGxszxtbevo ? objGxszxtbevo : obj;
            }
            vq1.rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = this.f70635jyumaefscl.f70626eablkybsjg.ppxfxbqfkf(this.f70636yggfygwlhe);
            if (rgvfuqvkyqVarPpxfxbqfkf != null) {
                return rgvfuqvkyqVarPpxfxbqfkf;
            }
            iobyxmoadg iobyxmoadgVar3 = this.f70635jyumaefscl;
            lq1.iobyxmoadg iobyxmoadgVar4 = this.f70634iwizpuwonk;
            this.f70637zdlpuopuiu = 2;
            obj = iobyxmoadg.draadjrbmk(iobyxmoadgVar3, iobyxmoadgVar4, false, this, 2, null);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return (vq1.rgvfuqvkyq) obj;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C1528iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lq1.iobyxmoadg f70638jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f70640zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(lq1.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f70638jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f70638jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f70640zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                lq1.iobyxmoadg iobyxmoadgVar2 = this.f70638jyumaefscl;
                this.f70640zdlpuopuiu = 1;
                obj = iobyxmoadgVar.gtknphoqwx(iobyxmoadgVar2, true, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return new vq1.zdlpuopuiu(iobyxmoadg.this.f70626eablkybsjg.iobyxmoadg((vq1.rgvfuqvkyq) obj));
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f70642cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        Object f70643esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        /* synthetic */ Object f70644istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f70645iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f70646jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        Object f70647lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        Object f70648pmvmpeiblj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        int f70649yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f70650yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f70651zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        boolean f70652zynmafqrjb;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f70644istkbnxepw = obj;
            this.f70649yadqdtsiqt |= Integer.MIN_VALUE;
            return iobyxmoadg.this.gtknphoqwx(null, false, this);
        }
    }

    public iobyxmoadg(xq1.iobyxmoadg getBoundingBoxUseCase, n01.iobyxmoadg getCenterPositionUseCase, n01.ppxfxbqfkf getMaxDistanceByPointUseCase, tq1.zoijcleaow specialBannerRemoteSource, tq1.iobyxmoadg specialBannerLocalSource, dv0.iobyxmoadg promoCollectionComponentApi, zdlpuopuiu getUserInfoUseCase, pkzmftpjix coroutineDispatcher) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getBoundingBoxUseCase, "getBoundingBoxUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCenterPositionUseCase, "getCenterPositionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getMaxDistanceByPointUseCase, "getMaxDistanceByPointUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialBannerRemoteSource, "specialBannerRemoteSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialBannerLocalSource, "specialBannerLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionComponentApi, "promoCollectionComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserInfoUseCase, "getUserInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f70628iobyxmoadg = getBoundingBoxUseCase;
        this.f70633zoijcleaow = getCenterPositionUseCase;
        this.f70631ppxfxbqfkf = getMaxDistanceByPointUseCase;
        this.f70632wkgbmnqykc = specialBannerRemoteSource;
        this.f70626eablkybsjg = specialBannerLocalSource;
        this.f70627gxszxtbevo = promoCollectionComponentApi;
        this.f70629lqeggnwhkg = getUserInfoUseCase;
        this.f70630nufgyqmvbu = coroutineDispatcher;
    }

    private final Object btonecajqb(List list, LocationData locationData, gxszxtbevo gxszxtbevoVar) {
        return this.f70631ppxfxbqfkf.zoijcleaow(new n01.ppxfxbqfkf.zoijcleaow(list, locationData), gxszxtbevoVar);
    }

    static /* synthetic */ Object draadjrbmk(iobyxmoadg iobyxmoadgVar, lq1.iobyxmoadg iobyxmoadgVar2, boolean z13, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return iobyxmoadgVar.gtknphoqwx(iobyxmoadgVar2, z13, gxszxtbevoVar);
    }

    private final Object dxjokdxxww(List list, gxszxtbevo gxszxtbevoVar) {
        return this.f70633zoijcleaow.zoijcleaow(new n01.iobyxmoadg.zoijcleaow(list), gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01f6 -> B:75:0x01fd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object gtknphoqwx(lq1.iobyxmoadg r18, boolean r19, lg.gxszxtbevo r20) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nq1.iobyxmoadg.gtknphoqwx(lq1.iobyxmoadg, boolean, lg.gxszxtbevo):java.lang.Object");
    }

    private final Object nufgyqmvbu(LocationData locationData, double d13, gxszxtbevo gxszxtbevoVar) {
        return this.f70628iobyxmoadg.zoijcleaow(new xq1.iobyxmoadg.C3106iobyxmoadg(locationData, d13), gxszxtbevoVar);
    }

    private final void wflxmlrfwp(boolean z13, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zynmafqrjb zynmafqrjbVar = (zynmafqrjb) it.next();
            if (zynmafqrjbVar instanceof vq1.pkzmftpjix) {
                dv0.iobyxmoadg iobyxmoadgVar = this.f70627gxszxtbevo;
                vq1.pkzmftpjix pkzmftpjixVar = (vq1.pkzmftpjix) zynmafqrjbVar;
                String collectionId = pkzmftpjixVar.zoijcleaow().getCollectionId();
                PromoCollectionInfo promoCollectionInfoZoijcleaow = pkzmftpjixVar.zoijcleaow();
                if (!z13) {
                    promoCollectionInfoZoijcleaow = null;
                }
                iobyxmoadgVar.eablkybsjg(collectionId, promoCollectionInfoZoijcleaow, pkzmftpjixVar.ppxfxbqfkf());
            }
        }
    }

    @Override // wq1.iobyxmoadg
    public Object eablkybsjg(String str, lq1.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f70630nufgyqmvbu, new C1528iobyxmoadg(str, this, iobyxmoadgVar, null), gxszxtbevoVar);
    }

    @Override // wq1.iobyxmoadg
    public Object iobyxmoadg(String str, String str2, gxszxtbevo gxszxtbevoVar) {
        return this.f70632wkgbmnqykc.iobyxmoadg(str, str2, gxszxtbevoVar);
    }

    @Override // wq1.iobyxmoadg
    public Object ppxfxbqfkf(lq1.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f70630nufgyqmvbu, new ppxfxbqfkf(iobyxmoadgVar, null), gxszxtbevoVar);
    }

    @Override // wq1.iobyxmoadg
    public Object wkgbmnqykc(esjtqupxsv esjtqupxsvVar, gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc = this.f70632wkgbmnqykc.wkgbmnqykc(esjtqupxsvVar, gxszxtbevoVar);
        return objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo() ? objWkgbmnqykc : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // wq1.iobyxmoadg
    public void zoijcleaow(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        this.f70626eablkybsjg.zoijcleaow(key);
    }
}
