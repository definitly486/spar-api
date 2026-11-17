package kk;

import modern.payments.ecomAndroid.data.common.Constants;
import spay.sdk.data.dto.response.SPayErrorDto;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class bo extends qh implements sk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final bt f56034eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final zc f56035gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final jlmebxxoox f56036lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final k0 f56037ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final zc f56038wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(k0 sdkFlowSPayApi, zc networkErrorHandler, bt metricFacade, zc apiResponseErrorHandler, jlmebxxoox sPayDataContract, vx networkErrorHandlerImpl, lw apiResponseErrorHandlerImpl) {
        super(networkErrorHandlerImpl, apiResponseErrorHandlerImpl);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sdkFlowSPayApi, "sdkFlowSPayApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkErrorHandler, "networkErrorHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiResponseErrorHandler, "apiResponseErrorHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkErrorHandlerImpl, "networkErrorHandlerImpl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiResponseErrorHandlerImpl, "apiResponseErrorHandlerImpl");
        this.f56037ppxfxbqfkf = sdkFlowSPayApi;
        this.f56038wkgbmnqykc = networkErrorHandler;
        this.f56034eablkybsjg = metricFacade;
        this.f56035gxszxtbevo = apiResponseErrorHandler;
        this.f56036lqeggnwhkg = sPayDataContract;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:29:0x006d, B:31:0x0075, B:33:0x0096, B:36:0x009d, B:38:0x00d6, B:37:0x00bd, B:40:0x00e2, B:42:0x00fd, B:46:0x0108, B:49:0x0110), top: B:53:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:29:0x006d, B:31:0x0075, B:33:0x0096, B:36:0x009d, B:38:0x00d6, B:37:0x00bd, B:40:0x00e2, B:42:0x00fd, B:46:0x0108, B:49:0x0110), top: B:53:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:29:0x006d, B:31:0x0075, B:33:0x0096, B:36:0x009d, B:38:0x00d6, B:37:0x00bd, B:40:0x00e2, B:42:0x00fd, B:46:0x0108, B:49:0x0110), top: B:53:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:29:0x006d, B:31:0x0075, B:33:0x0096, B:36:0x009d, B:38:0x00d6, B:37:0x00bd, B:40:0x00e2, B:42:0x00fd, B:46:0x0108, B:49:0x0110), top: B:53:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    /* JADX WARN: Code duplicated, block: B:46:0x0108 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:29:0x006d, B:31:0x0075, B:33:0x0096, B:36:0x009d, B:38:0x00d6, B:37:0x00bd, B:40:0x00e2, B:42:0x00fd, B:46:0x0108, B:49:0x0110), top: B:53:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00e2, please report this as an issue */
    public final Object ppxfxbqfkf(String str, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        xm xmVar;
        bo boVar;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        we0 we0Var;
        String str2;
        if (wkgbmnqykcVar instanceof xm) {
            xmVar = (xm) wkgbmnqykcVar;
            int i13 = xmVar.f59314iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                xmVar.f59314iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                xmVar = new xm(this, wkgbmnqykcVar);
            }
        } else {
            xmVar = new xm(this, wkgbmnqykcVar);
        }
        Object objZoijcleaow = xmVar.f59316yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = xmVar.f59314iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boVar = xmVar.f59317zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                kcexrzcfytVar = (lm.kcexrzcfyt) objZoijcleaow;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = boVar.f56034eablkybsjg;
                    gtknphoqwx gtknphoqwxVar = gtknphoqwx.RQ_GOOD_IP;
                    we0Var = we0.AUTH_VIEW;
                    btVar.iobyxmoadg(new ow(gtknphoqwxVar, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    str2 = (String) kcexrzcfytVar.iobyxmoadg();
                    if (str2 != null || mj.kcexrzcfyt.zfvoamnweg(str2)) {
                        boVar.f56034eablkybsjg.iobyxmoadg(new ow(gtknphoqwx.RS_FAIL_IP, we0Var, mp.RS_FAIL, null, null, null, null, 120));
                    } else {
                        boVar.f56034eablkybsjg.iobyxmoadg(new ow(gtknphoqwx.RS_GOOD_IP, we0Var, mp.RS_GOOD, null, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(kcexrzcfytVar.zoijcleaow()), null, null, 104));
                    }
                    ((auzgnhcxok) boVar.f56036lqeggnwhkg).f55868wflxmlrfwp = str2;
                    return new ContentResponse.Success(str2);
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                ErrorEntity errorEntityZoijcleaow = boVar.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
                bt btVar2 = boVar.f56034eablkybsjg;
                gtknphoqwx gtknphoqwxVar2 = gtknphoqwx.RQ_FAIL_IP;
                we0 we0Var2 = we0.AUTH_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar2.iobyxmoadg(new ow(gtknphoqwxVar2, we0Var2, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(errorEntityZoijcleaow);
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("COMMON REPO EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(boVar.f56038wkgbmnqykc.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        this.f56034eablkybsjg.iobyxmoadg(new ow(gtknphoqwx.RQ_IP, we0.AUTH_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            k0 k0Var = this.f56037ppxfxbqfkf;
            String str3 = str == null ? Constants.GET_IP_DEFAULT_URL : str;
            xmVar.f59317zdlpuopuiu = this;
            xmVar.f59314iwizpuwonk = 1;
            objZoijcleaow = k0Var.zoijcleaow(str3, xmVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            boVar = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objZoijcleaow;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = boVar.f56034eablkybsjg;
                gtknphoqwx gtknphoqwxVar3 = gtknphoqwx.RQ_GOOD_IP;
                we0Var = we0.AUTH_VIEW;
                btVar3.iobyxmoadg(new ow(gtknphoqwxVar3, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                str2 = (String) kcexrzcfytVar.iobyxmoadg();
                if (str2 != null) {
                    boVar.f56034eablkybsjg.iobyxmoadg(new ow(gtknphoqwx.RS_FAIL_IP, we0Var, mp.RS_FAIL, null, null, null, null, 120));
                } else {
                    boVar.f56034eablkybsjg.iobyxmoadg(new ow(gtknphoqwx.RS_FAIL_IP, we0Var, mp.RS_FAIL, null, null, null, null, 120));
                }
                ((auzgnhcxok) boVar.f56036lqeggnwhkg).f55868wflxmlrfwp = str2;
                return new ContentResponse.Success(str2);
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            ErrorEntity errorEntityZoijcleaow2 = boVar.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
            bt btVar4 = boVar.f56034eablkybsjg;
            gtknphoqwx gtknphoqwxVar4 = gtknphoqwx.RQ_FAIL_IP;
            we0 we0Var3 = we0.AUTH_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar4.iobyxmoadg(new ow(gtknphoqwxVar4, we0Var3, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(errorEntityZoijcleaow2);
        } catch (Exception e14) {
            e = e14;
            boVar = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("COMMON REPO EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(boVar.f56038wkgbmnqykc.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005d, B:25:0x0066, B:27:0x008e, B:29:0x00a2, B:33:0x00ad, B:36:0x00b5, B:38:0x00d0, B:41:0x00da, B:40:0x00d8), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005d, B:25:0x0066, B:27:0x008e, B:29:0x00a2, B:33:0x00ad, B:36:0x00b5, B:38:0x00d0, B:41:0x00da, B:40:0x00d8), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005d, B:25:0x0066, B:27:0x008e, B:29:0x00a2, B:33:0x00ad, B:36:0x00b5, B:38:0x00d0, B:41:0x00da, B:40:0x00d8), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005d, B:25:0x0066, B:27:0x008e, B:29:0x00a2, B:33:0x00ad, B:36:0x00b5, B:38:0x00d0, B:41:0x00da, B:40:0x00d8), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005d, B:25:0x0066, B:27:0x008e, B:29:0x00a2, B:33:0x00ad, B:36:0x00b5, B:38:0x00d0, B:41:0x00da, B:40:0x00d8), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wkgbmnqykc(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        vl vlVar;
        bo boVar;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        ErrorEntity errorEntityA;
        if (wkgbmnqykcVar instanceof vl) {
            vlVar = (vl) wkgbmnqykcVar;
            int i13 = vlVar.f59038iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vlVar.f59038iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                vlVar = new vl(this, wkgbmnqykcVar);
            }
        } else {
            vlVar = new vl(this, wkgbmnqykcVar);
        }
        Object objIobyxmoadg = vlVar.f59040yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = vlVar.f59038iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boVar = vlVar.f59041zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                kcexrzcfytVar = (lm.kcexrzcfyt) objIobyxmoadg;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    boVar.f56034eablkybsjg.iobyxmoadg(new ow(xr.RQ_GOOD_REMOTE_CONFIG, null, mp.RQ_GOOD, null, null, null, null, 122));
                    return new ContentResponse.Success((SPaySdkConfig) qh.iobyxmoadg(kcexrzcfytVar, null, xr.RS_GOOD_REMOTE_CONFIG, xr.RS_FAIL_REMOTE_CONFIG, we0.MERCHANT_VIEW));
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar = boVar.f56034eablkybsjg;
                xr xrVar = xr.RQ_FAIL_REMOTE_CONFIG;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar.iobyxmoadg(new ow(xrVar, null, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 66));
                if (sPayErrorDtoIobyxmoadg != null || (errorEntityA = boVar.f56035gxszxtbevo.a(sPayErrorDtoIobyxmoadg)) == null) {
                    errorEntityA = ErrorEntity.Unknown.INSTANCE;
                }
                return new ContentResponse.Failure(errorEntityA);
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("COMMON REPO EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(boVar.f56038wkgbmnqykc.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        try {
            this.f56034eablkybsjg.iobyxmoadg(new ow(xr.RQ_REMOTE_CONFIG, null, mp.RQ, null, null, null, null, 122));
            k0 k0Var = this.f56037ppxfxbqfkf;
            vlVar.f59041zdlpuopuiu = this;
            vlVar.f59038iwizpuwonk = 1;
            objIobyxmoadg = k0Var.iobyxmoadg(vlVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            boVar = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objIobyxmoadg;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                boVar.f56034eablkybsjg.iobyxmoadg(new ow(xr.RQ_GOOD_REMOTE_CONFIG, null, mp.RQ_GOOD, null, null, null, null, 122));
                return new ContentResponse.Success((SPaySdkConfig) qh.iobyxmoadg(kcexrzcfytVar, null, xr.RS_GOOD_REMOTE_CONFIG, xr.RS_FAIL_REMOTE_CONFIG, we0.MERCHANT_VIEW));
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar2 = boVar.f56034eablkybsjg;
            xr xrVar2 = xr.RQ_FAIL_REMOTE_CONFIG;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar2.iobyxmoadg(new ow(xrVar2, null, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 66));
            if (sPayErrorDtoIobyxmoadg != null) {
                errorEntityA = ErrorEntity.Unknown.INSTANCE;
            } else {
                errorEntityA = ErrorEntity.Unknown.INSTANCE;
            }
            return new ContentResponse.Failure(errorEntityA);
        } catch (Exception e14) {
            e = e14;
            boVar = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("COMMON REPO EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(boVar.f56038wkgbmnqykc.a(e));
        }
    }
}
