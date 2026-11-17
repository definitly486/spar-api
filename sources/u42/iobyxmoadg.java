package u42;

import c52.esjtqupxsv;
import c52.zynmafqrjb;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.pkzmftpjix;
import ru.myspar.common.models.LocationData;
import ru.myspar.components.promo_collection.api.models.PromoCollectionInfo;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements d52.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final a52.iobyxmoadg f112658eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f112659gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final e52.iobyxmoadg f112660iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final jw.iobyxmoadg f112661lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final pkzmftpjix f112662nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final d20.ppxfxbqfkf f112663ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final a52.zoijcleaow f112664wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final d20.iobyxmoadg f112665zoijcleaow;

    /* JADX INFO: renamed from: u42.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2782iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ s42.iobyxmoadg f112666iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f112667jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f112668yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112669zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2782iobyxmoadg(String str, iobyxmoadg iobyxmoadgVar, s42.iobyxmoadg iobyxmoadgVar2, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f112668yggfygwlhe = str;
            this.f112667jyumaefscl = iobyxmoadgVar;
            this.f112666iwizpuwonk = iobyxmoadgVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new C2782iobyxmoadg(this.f112668yggfygwlhe, this.f112667jyumaefscl, this.f112666iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112669zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                }
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                return (c52.rgvfuqvkyq) obj;
            }
            zdlpuopuiu.zoijcleaow(obj);
            String str = this.f112668yggfygwlhe;
            if (str == null || kcexrzcfyt.zfvoamnweg(str)) {
                iobyxmoadg iobyxmoadgVar = this.f112667jyumaefscl;
                s42.iobyxmoadg iobyxmoadgVar2 = this.f112666iwizpuwonk;
                this.f112669zdlpuopuiu = 1;
                obj = iobyxmoadg.draadjrbmk(iobyxmoadgVar, iobyxmoadgVar2, false, this, 2, null);
                return obj == objGxszxtbevo ? objGxszxtbevo : obj;
            }
            c52.rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = this.f112667jyumaefscl.f112658eablkybsjg.ppxfxbqfkf(this.f112668yggfygwlhe);
            if (rgvfuqvkyqVarPpxfxbqfkf != null) {
                return rgvfuqvkyqVarPpxfxbqfkf;
            }
            iobyxmoadg iobyxmoadgVar3 = this.f112667jyumaefscl;
            s42.iobyxmoadg iobyxmoadgVar4 = this.f112666iwizpuwonk;
            this.f112669zdlpuopuiu = 2;
            obj = iobyxmoadg.draadjrbmk(iobyxmoadgVar3, iobyxmoadgVar4, false, this, 2, null);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return (c52.rgvfuqvkyq) obj;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C2782iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ s42.iobyxmoadg f112670jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112672zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(s42.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f112670jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f112670jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112672zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                s42.iobyxmoadg iobyxmoadgVar2 = this.f112670jyumaefscl;
                this.f112672zdlpuopuiu = 1;
                obj = iobyxmoadgVar.gtknphoqwx(iobyxmoadgVar2, true, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return new c52.zdlpuopuiu(iobyxmoadg.this.f112658eablkybsjg.wkgbmnqykc((c52.rgvfuqvkyq) obj));
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f112674cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        Object f112675esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        /* synthetic */ Object f112676istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f112677iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f112678jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        Object f112679lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        Object f112680pmvmpeiblj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        int f112681yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f112682yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112683zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        boolean f112684zynmafqrjb;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112676istkbnxepw = obj;
            this.f112681yadqdtsiqt |= Integer.MIN_VALUE;
            return iobyxmoadg.this.gtknphoqwx(null, false, this);
        }
    }

    public iobyxmoadg(e52.iobyxmoadg getBoundingBoxUseCase, d20.iobyxmoadg getCenterPositionUseCase, d20.ppxfxbqfkf getMaxDistanceByPointUseCase, a52.zoijcleaow specialBannerRemoteSource, a52.iobyxmoadg specialBannerLocalSource, ca2.ppxfxbqfkf userRepository, jw.iobyxmoadg promoCollectionComponentApi, pkzmftpjix coroutineDispatcher) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getBoundingBoxUseCase, "getBoundingBoxUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCenterPositionUseCase, "getCenterPositionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getMaxDistanceByPointUseCase, "getMaxDistanceByPointUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialBannerRemoteSource, "specialBannerRemoteSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialBannerLocalSource, "specialBannerLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionComponentApi, "promoCollectionComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f112660iobyxmoadg = getBoundingBoxUseCase;
        this.f112665zoijcleaow = getCenterPositionUseCase;
        this.f112663ppxfxbqfkf = getMaxDistanceByPointUseCase;
        this.f112664wkgbmnqykc = specialBannerRemoteSource;
        this.f112658eablkybsjg = specialBannerLocalSource;
        this.f112659gxszxtbevo = userRepository;
        this.f112661lqeggnwhkg = promoCollectionComponentApi;
        this.f112662nufgyqmvbu = coroutineDispatcher;
    }

    private final Object btonecajqb(List list, LocationData locationData, gxszxtbevo gxszxtbevoVar) {
        return this.f112663ppxfxbqfkf.zoijcleaow(new d20.ppxfxbqfkf.zoijcleaow(list, locationData), gxszxtbevoVar);
    }

    static /* synthetic */ Object draadjrbmk(iobyxmoadg iobyxmoadgVar, s42.iobyxmoadg iobyxmoadgVar2, boolean z13, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return iobyxmoadgVar.gtknphoqwx(iobyxmoadgVar2, z13, gxszxtbevoVar);
    }

    private final Object dxjokdxxww(List list, gxszxtbevo gxszxtbevoVar) {
        return this.f112665zoijcleaow.zoijcleaow(new d20.iobyxmoadg.zoijcleaow(list), gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x015c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0185 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0186  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01cb -> B:54:0x01ce). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object gtknphoqwx(s42.iobyxmoadg r18, boolean r19, lg.gxszxtbevo r20) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u42.iobyxmoadg.gtknphoqwx(s42.iobyxmoadg, boolean, lg.gxszxtbevo):java.lang.Object");
    }

    private final Object nufgyqmvbu(LocationData locationData, double d13, gxszxtbevo gxszxtbevoVar) {
        return this.f112660iobyxmoadg.zoijcleaow(new e52.iobyxmoadg.C0636iobyxmoadg(locationData, d13), gxszxtbevoVar);
    }

    private final void wflxmlrfwp(boolean z13, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zynmafqrjb zynmafqrjbVar = (zynmafqrjb) it.next();
            if (zynmafqrjbVar instanceof c52.pkzmftpjix) {
                jw.iobyxmoadg iobyxmoadgVar = this.f112661lqeggnwhkg;
                c52.pkzmftpjix pkzmftpjixVar = (c52.pkzmftpjix) zynmafqrjbVar;
                String collectionId = pkzmftpjixVar.zoijcleaow().getCollectionId();
                PromoCollectionInfo promoCollectionInfoZoijcleaow = pkzmftpjixVar.zoijcleaow();
                if (!z13) {
                    promoCollectionInfoZoijcleaow = null;
                }
                iobyxmoadgVar.eablkybsjg(collectionId, promoCollectionInfoZoijcleaow, pkzmftpjixVar.ppxfxbqfkf());
            }
        }
    }

    @Override // d52.iobyxmoadg
    public Object eablkybsjg(String str, s42.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f112662nufgyqmvbu, new C2782iobyxmoadg(str, this, iobyxmoadgVar, null), gxszxtbevoVar);
    }

    @Override // d52.iobyxmoadg
    public Object iobyxmoadg(String str, String str2, gxszxtbevo gxszxtbevoVar) {
        return this.f112664wkgbmnqykc.iobyxmoadg(str, str2, gxszxtbevoVar);
    }

    @Override // d52.iobyxmoadg
    public Object ppxfxbqfkf(s42.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f112662nufgyqmvbu, new ppxfxbqfkf(iobyxmoadgVar, null), gxszxtbevoVar);
    }

    @Override // d52.iobyxmoadg
    public Object wkgbmnqykc(esjtqupxsv esjtqupxsvVar, gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc = this.f112664wkgbmnqykc.wkgbmnqykc(esjtqupxsvVar, gxszxtbevoVar);
        return objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo() ? objWkgbmnqykc : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // d52.iobyxmoadg
    public void zoijcleaow(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        this.f112658eablkybsjg.zoijcleaow(key);
    }
}
