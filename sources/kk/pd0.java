package kk;

import java.util.List;
import npi.spay.Bn;
import npi.spay.Cn;
import spay.sdk.R;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;
import spay.sdk.domain.model.BiometricSuggestionModel;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class pd0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ dvvnrvtcbc f58073zdlpuopuiu;

    public pd0(dvvnrvtcbc dvvnrvtcbcVar) {
        this.f58073zdlpuopuiu = dvvnrvtcbcVar;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:172:0x0716  */
    /* JADX WARN: Code duplicated, block: B:174:0x072b  */
    /* JADX WARN: Code duplicated, block: B:175:0x072e  */
    /* JADX WARN: Type inference failed for: r12v125, types: [kotlin.coroutines.jvm.internal.draadjrbmk, tg.draadjrbmk] */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        jf0 jf0Var;
        sh0 sh0Var;
        y0 y0Var;
        Boolean bool;
        String strIobyxmoadg;
        String strIobyxmoadg2;
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        boolean z13 = true;
        ln lnVar = (ln) obj;
        dvvnrvtcbc dvvnrvtcbcVar = this.f58073zdlpuopuiu;
        dvvnrvtcbcVar.getClass();
        hl hlVar = lnVar.f57485iobyxmoadg;
        if (!(hlVar instanceof p10)) {
            if (hlVar instanceof cs) {
                dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new ao(new he()))));
            } else {
                Boolean bool2 = null;
                toolList = null;
                toolList = null;
                List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList = null;
                if (hlVar instanceof e0) {
                    dvvnrvtcbcVar.f56342iwizpuwonk = null;
                } else if (hlVar instanceof a40) {
                    dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new ao(((a40) hlVar).f55773iobyxmoadg))));
                } else if (hlVar instanceof o4) {
                    jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("UNEXPECTED EXCEPTION").zoijcleaow(((o4) lnVar.f57485iobyxmoadg).f57887iobyxmoadg.toString(), new Object[0]);
                    dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue(), new MerchantError.UnexpectedError(((o4) lnVar.f57485iobyxmoadg).f57887iobyxmoadg.toString()));
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.ojitshcjhn(), Boolean.FALSE)) {
                        ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
                    } else {
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(new z8(ErrorEntity.Unknown.INSTANCE)))));
                    }
                } else {
                    if (hlVar instanceof w7) {
                        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("UNEXPECTED EXCEPTION").zoijcleaow(((w7) lnVar.f57485iobyxmoadg).f59105iobyxmoadg.toString(), new Object[0]);
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.ojitshcjhn(), Boolean.FALSE)) {
                            ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
                        } else {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(new z8(ErrorEntity.Unknown.INSTANCE)))));
                        }
                        String strIobyxmoadg3 = dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg();
                        String str = (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue();
                        ErrorEntity errorEntity = ((w7) lnVar.f57485iobyxmoadg).f59105iobyxmoadg;
                        ErrorEntity.ApiError apiError = errorEntity instanceof ErrorEntity.ApiError ? (ErrorEntity.ApiError) errorEntity : null;
                        String description = apiError != null ? apiError.getDescription() : null;
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(strIobyxmoadg3, str, new MerchantError.SPayApiError(description != null ? description : ""));
                    } else if (hlVar instanceof wg) {
                        jc2.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarRgvfuqvkyq = jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("TIMEOUT EXCEPTION");
                        ((wg) lnVar.f57485iobyxmoadg).getClass();
                        ppxfxbqfkfVarRgvfuqvkyq.zoijcleaow("Время ожидания ответа от сервера истекло", new Object[0]);
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.ojitshcjhn(), Boolean.FALSE)) {
                            ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
                        } else {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(new z8(ErrorEntity.TimeOut.INSTANCE)))));
                        }
                        String strIobyxmoadg4 = dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg();
                        String str2 = (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue();
                        ((wg) lnVar.f57485iobyxmoadg).getClass();
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(strIobyxmoadg4, str2, new MerchantError.TimeoutException("Время ожидания ответа от сервера истекло"));
                    } else if (hlVar instanceof pv) {
                        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("UNEXPECTED EXCEPTION").zoijcleaow(((pv) lnVar.f57485iobyxmoadg).f58119iobyxmoadg, new Object[0]);
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue(), new MerchantError.UnexpectedError(((pv) lnVar.f57485iobyxmoadg).f58119iobyxmoadg));
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.ojitshcjhn(), Boolean.FALSE)) {
                            ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
                        } else {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(new z8(ErrorEntity.Unknown.INSTANCE)))));
                        }
                    } else if (hlVar instanceof d50) {
                        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("NO BNPL RESPONSE EXCEPTION").wkgbmnqykc(null, "NO MESSAGE", new Object[0]);
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(new z8(new ErrorEntity.NoBnplResponse(null, null, 3, null))))));
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue(), new MerchantError.UnexpectedError("CANT_GET_BNPL_RESPONSE"));
                    } else if (hlVar instanceof vg0) {
                        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("NO BNPL RESPONSE EXCEPTION").wkgbmnqykc(null, "NO MESSAGE", new Object[0]);
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(new z8(ErrorEntity.PayBnplPartsFail.INSTANCE)))));
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue(), new MerchantError.UnexpectedError("CANT_PAY_BY_BNPL"));
                    } else if (hlVar instanceof kcexrzcfyt) {
                        wp wpVar = ((kcexrzcfyt) hlVar).f57290iobyxmoadg;
                        if (wpVar instanceof so) {
                            ((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55846draadjrbmk = ((so) wpVar).f58565iobyxmoadg.getInitiateBankInvoiceId();
                        } else if (wpVar instanceof lm) {
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.ojitshcjhn(), Boolean.FALSE)) {
                                ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
                            } else {
                                dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(new z8(((lm) wpVar).f57483iobyxmoadg)))));
                            }
                        } else if (wpVar instanceof nn) {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(fp.f56582iobyxmoadg)));
                        }
                    } else if (hlVar instanceof g60) {
                        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("NO INTERNET CONNECTION").zoijcleaow(String.valueOf(((g60) lnVar.f57485iobyxmoadg).f56661iobyxmoadg), new Object[0]);
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new g7(((g60) lnVar.f57485iobyxmoadg).f56661iobyxmoadg))));
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue(), new MerchantError.NoInternetConnection(null, 1, null));
                    } else if (hlVar instanceof q5) {
                        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("PAY BINDING ERROR").zoijcleaow(((q5) lnVar.f57485iobyxmoadg).f58155iobyxmoadg.toString(), new Object[0]);
                        String strIobyxmoadg5 = dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg();
                        String str3 = (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue();
                        ErrorEntity errorEntity2 = ((q5) lnVar.f57485iobyxmoadg).f58155iobyxmoadg;
                        ErrorEntity.ApiError apiError2 = errorEntity2 instanceof ErrorEntity.ApiError ? (ErrorEntity.ApiError) errorEntity2 : null;
                        String description2 = apiError2 != null ? apiError2.getDescription() : null;
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(strIobyxmoadg5, str3, new MerchantError.PayWithBindingError(description2 != null ? description2 : ""));
                        sj.zynmafqrjb zynmafqrjbVar = dvvnrvtcbcVar.f56348oxmwwwfdhm;
                        SPaySdkConfig sPaySdkConfig = ((s80) dvvnrvtcbcVar.f56349rgvfuqvkyq).f58531ppxfxbqfkf;
                        if (sPaySdkConfig == null) {
                            throw Bn.f70538zdlpuopuiu;
                        }
                        zynmafqrjbVar.setValue(new hg(new qd0(new cf(sPaySdkConfig.getLocalization().getPayBindingErrorDescription(), ((q5) lnVar.f57485iobyxmoadg).f58155iobyxmoadg))));
                    } else if (hlVar instanceof t6) {
                        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("PAY BONUSES ERROR").zoijcleaow(((t6) lnVar.f57485iobyxmoadg).f58622iobyxmoadg.toString(), new Object[0]);
                        String strIobyxmoadg6 = dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg();
                        String str4 = (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue();
                        ErrorEntity errorEntity3 = ((t6) lnVar.f57485iobyxmoadg).f58622iobyxmoadg;
                        ErrorEntity.ApiError apiError3 = errorEntity3 instanceof ErrorEntity.ApiError ? (ErrorEntity.ApiError) errorEntity3 : null;
                        String description3 = apiError3 != null ? apiError3.getDescription() : null;
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(strIobyxmoadg6, str4, new MerchantError.PayWithBonusesError(description3 != null ? description3 : ""));
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.ojitshcjhn(), Boolean.FALSE)) {
                            ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
                        } else {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new eg(((t6) lnVar.f57485iobyxmoadg).f58623zoijcleaow))));
                        }
                    } else if (hlVar instanceof lu) {
                        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("PAY PAYMENT ACCOUNT EMPTY ERROR").zoijcleaow(lnVar.f57485iobyxmoadg.toString(), new Object[0]);
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue(), new MerchantError.SPayApiError("Empty payment accounts result"));
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.ojitshcjhn(), Boolean.FALSE)) {
                            ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
                        } else {
                            sj.zynmafqrjb zynmafqrjbVar2 = dvvnrvtcbcVar.f56348oxmwwwfdhm;
                            SPaySdkConfig sPaySdkConfig2 = ((s80) dvvnrvtcbcVar.f56349rgvfuqvkyq).f58531ppxfxbqfkf;
                            if (sPaySdkConfig2 == null) {
                                throw Bn.f70538zdlpuopuiu;
                            }
                            zynmafqrjbVar2.setValue(new hg(new qd0(new s1(sPaySdkConfig2.getLocalization().getNoPaymentsAccount()))));
                        }
                    } else if (hlVar instanceof gt) {
                        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("BIZONE CHECK").zoijcleaow(((gt) lnVar.f57485iobyxmoadg).f56734iobyxmoadg.toString(), new Object[0]);
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue(), new MerchantError.UnexpectedError("Системная или внутренняя ошибка"));
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.ojitshcjhn(), Boolean.FALSE)) {
                            ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
                        } else {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(new z8(ErrorEntity.AccessDenied.INSTANCE)))));
                        }
                    } else if (hlVar instanceof le0) {
                        sj.zynmafqrjb zynmafqrjbVar3 = dvvnrvtcbcVar.f56348oxmwwwfdhm;
                        gl glVar = ((le0) hlVar).f57463iobyxmoadg;
                        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) ((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55843btonecajqb.getValue();
                        if (orderScreenDataResponse != null && (listOfCardsResponseBody = orderScreenDataResponse.getListOfCardsResponseBody()) != null && (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) != null) {
                            toolList = paymentToolInfo.getToolList();
                        }
                        if (toolList != null && !toolList.isEmpty()) {
                            z13 = false;
                        }
                        zynmafqrjbVar3.setValue(new hg(new qd0(new ub(glVar, z13))));
                    } else if (hlVar instanceof id0) {
                        wc0 wc0Var = dvvnrvtcbcVar.f56347ojitshcjhn;
                        uc0 tag = uc0.BNPL;
                        wc0Var.getClass();
                        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
                        y60 y60Var = (y60) wc0Var.f59129wkgbmnqykc.get(tag);
                        if (y60Var != null) {
                            y60Var.zoijcleaow(new j9(true));
                        }
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(sa.f58535iobyxmoadg)));
                    } else if (hlVar instanceof rf0) {
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(wc.f59126iobyxmoadg)));
                    } else if (hlVar instanceof qo) {
                        jf0 jf0Var2 = (jf0) dvvnrvtcbcVar.f56345lqeggnwhkg;
                        if (jf0Var2.f57192zoijcleaow) {
                            jf0Var = (jf0) dvvnrvtcbcVar.f56345lqeggnwhkg;
                            if (jf0Var.f57192zoijcleaow) {
                                a10 a10Var = new a10(((qo) lnVar.f57485iobyxmoadg).f58219iobyxmoadg);
                                sh0Var = ((qo) lnVar.f57485iobyxmoadg).f58221zoijcleaow;
                                if (sh0Var instanceof y0) {
                                    y0Var = (y0) sh0Var;
                                } else {
                                    y0Var = null;
                                }
                                pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(dvvnrvtcbcVar), null, null, new hi0(dvvnrvtcbcVar, a10Var, y0Var, null), 3, null);
                            } else {
                                a10 a10Var2 = new a10(((qo) lnVar.f57485iobyxmoadg).f58219iobyxmoadg);
                                sh0Var = ((qo) lnVar.f57485iobyxmoadg).f58221zoijcleaow;
                                if (sh0Var instanceof y0) {
                                    y0Var = (y0) sh0Var;
                                } else {
                                    y0Var = null;
                                }
                                pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(dvvnrvtcbcVar), null, null, new hi0(dvvnrvtcbcVar, a10Var2, y0Var, null), 3, null);
                            }
                        } else {
                            String string = jf0Var2.f57189iobyxmoadg.getSharedPreferences("USER_TOGGLE", 0).getString("UserBiometricToggleKey", null);
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(string, "true")) {
                                bool = Boolean.TRUE;
                            } else {
                                bool = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(string, "false") ? Boolean.FALSE : null;
                            }
                            if (bool == null) {
                                sj.zynmafqrjb zynmafqrjbVar4 = dvvnrvtcbcVar.f56348oxmwwwfdhm;
                                MerchantData merchantData = ((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55859lmojexxdyd;
                                if (merchantData == null) {
                                    throw Cn.f70541zdlpuopuiu;
                                }
                                String strIobyxmoadg7 = dvvnrvtcbcVar.f56351wflxmlrfwp.iobyxmoadg(merchantData.getAppPackage());
                                if (strIobyxmoadg7 != null) {
                                    strIobyxmoadg = dvvnrvtcbcVar.f56337draadjrbmk.iobyxmoadg(R.string.spay_biometric_alert_suggestion_title_with_app_name, strIobyxmoadg7);
                                } else {
                                    fj fjVar = dvvnrvtcbcVar.f56337draadjrbmk;
                                    int i13 = R.string.spay_biometric_alert_suggestion_title;
                                    fjVar.getClass();
                                    strIobyxmoadg = zv.iobyxmoadg(zv.zoijcleaow(i13), fjVar.f56574iobyxmoadg);
                                }
                                if (strIobyxmoadg7 != null) {
                                    strIobyxmoadg2 = dvvnrvtcbcVar.f56337draadjrbmk.iobyxmoadg(R.string.spay_biometric_alert_suggestion_message_with_app_name, strIobyxmoadg7);
                                } else {
                                    fj fjVar2 = dvvnrvtcbcVar.f56337draadjrbmk;
                                    int i14 = R.string.spay_biometric_alert_suggestion_message;
                                    fjVar2.getClass();
                                    strIobyxmoadg2 = zv.iobyxmoadg(zv.zoijcleaow(i14), fjVar2.f56574iobyxmoadg);
                                }
                                fj fjVar3 = dvvnrvtcbcVar.f56337draadjrbmk;
                                int i15 = R.string.spay_biometric_alert_suggestion_positive_button;
                                fjVar3.getClass();
                                String strIobyxmoadg8 = zv.iobyxmoadg(zv.zoijcleaow(i15), fjVar3.f56574iobyxmoadg);
                                fj fjVar4 = dvvnrvtcbcVar.f56337draadjrbmk;
                                int i16 = R.string.spay_biometric_alert_suggestion_negative_button;
                                fjVar4.getClass();
                                zynmafqrjbVar4.setValue(new hg(new qd0(new ul(new BiometricSuggestionModel(strIobyxmoadg, strIobyxmoadg2, strIobyxmoadg8, zv.iobyxmoadg(zv.zoijcleaow(i16), fjVar4.f56574iobyxmoadg))))));
                            } else {
                                jf0Var = (jf0) dvvnrvtcbcVar.f56345lqeggnwhkg;
                                if (jf0Var.f57192zoijcleaow || jf0Var.f57191wkgbmnqykc) {
                                    a10 a10Var3 = new a10(((qo) lnVar.f57485iobyxmoadg).f58219iobyxmoadg);
                                    sh0Var = ((qo) lnVar.f57485iobyxmoadg).f58221zoijcleaow;
                                    if (sh0Var instanceof y0) {
                                        y0Var = (y0) sh0Var;
                                    } else {
                                        y0Var = null;
                                    }
                                    pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(dvvnrvtcbcVar), null, null, new hi0(dvvnrvtcbcVar, a10Var3, y0Var, null), 3, null);
                                } else {
                                    ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(js.f57221iobyxmoadg);
                                }
                            }
                        }
                    } else if (hlVar instanceof yq) {
                        t9 t9Var = dvvnrvtcbcVar.f56403wkgbmnqykc;
                        if (t9Var != null) {
                            t9Var.invoke();
                        }
                    } else if (hlVar instanceof tw) {
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(t2.f58604iobyxmoadg)));
                    } else if (hlVar instanceof y8) {
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Processing(dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue());
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.ojitshcjhn(), Boolean.FALSE)) {
                            ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
                        } else {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(fa.f56514iobyxmoadg))));
                        }
                    } else if (hlVar instanceof ea) {
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Success(dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue());
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.ojitshcjhn(), Boolean.FALSE)) {
                            ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
                        } else {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(ib.f57019iobyxmoadg))));
                        }
                    } else if (hlVar instanceof pe) {
                        String string2 = ((jf0) dvvnrvtcbcVar.f56345lqeggnwhkg).f57189iobyxmoadg.getSharedPreferences("USER_TOGGLE", 0).getString("UserBiometricToggleKey", null);
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(string2, "true")) {
                            bool2 = Boolean.TRUE;
                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(string2, "false")) {
                            bool2 = Boolean.FALSE;
                        }
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new wm(kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bool2, Boolean.TRUE) ? hg.jyumaefscl.rgvfuqvkyq(dvvnrvtcbcVar.f56335btonecajqb, dvvnrvtcbcVar.f56338dxjokdxxww) : hg.jyumaefscl.eablkybsjg(dvvnrvtcbcVar.f56338dxjokdxxww)))));
                    } else if (hlVar instanceof zb0) {
                        jd jdVar = ((zb0) hlVar).f59565iobyxmoadg;
                        if (jdVar instanceof eslsurpljm) {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new i8(((eslsurpljm) jdVar).f56462ppxfxbqfkf))));
                        } else if (jdVar instanceof b0) {
                            if (((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithBinding) {
                                ((ve) dvvnrvtcbcVar.f56341gxszxtbevo).zoijcleaow(y6.f59391iobyxmoadg);
                            } else {
                                sd sdVar = dvvnrvtcbcVar.f56343jyumaefscl;
                                if (sdVar != null) {
                                    sdVar.invoke();
                                }
                            }
                        } else if (jdVar instanceof g3) {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new i8(((g3) jdVar).f56624ppxfxbqfkf))));
                        } else if (jdVar instanceof t7) {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new i8(((t7) jdVar).f58626zoijcleaow))));
                        } else if ((jdVar instanceof iyctptxqzt) || (jdVar instanceof l4)) {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(l9.f57423iobyxmoadg)));
                        }
                    } else if (hlVar instanceof ntlheqmsrt) {
                        ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) hlVar;
                        dvvnrvtcbcVar.f56343jyumaefscl = ntlheqmsrtVar.f57845zoijcleaow;
                        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(dvvnrvtcbcVar), null, null, new ch0(dvvnrvtcbcVar, ntlheqmsrtVar, null), 3, null);
                    } else if (hlVar instanceof fk) {
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(jq.f57217iobyxmoadg)));
                    } else if (hlVar instanceof hb) {
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(pj.f58088iobyxmoadg)));
                    } else if (hlVar instanceof ay) {
                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ay) hlVar).f55879iobyxmoadg, ob0.f57923zoijcleaow)) {
                            dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(y3.f59377iobyxmoadg)));
                        }
                    } else if (hlVar instanceof l00) {
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new a5(((l00) hlVar).f57369iobyxmoadg))));
                    } else if (hlVar instanceof b) {
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(ih.f57045iobyxmoadg)));
                    } else if (hlVar instanceof ez) {
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(li.f57478iobyxmoadg)));
                    } else if (hlVar instanceof j70) {
                        dvvnrvtcbcVar.f56348oxmwwwfdhm.setValue(new hg(new qd0(new zd(new z8(ErrorEntity.NotEnoughMoneyForBnplFirstPayment.INSTANCE)))));
                        dvvnrvtcbcVar.f56342iwizpuwonk = new PaymentResult.Error(dvvnrvtcbcVar.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55858lereixgezr).getValue(), new MerchantError.UnexpectedError("NOT_ENOUGH_MONEY_FOR_BNPL"));
                    }
                }
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
